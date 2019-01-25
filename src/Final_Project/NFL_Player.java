package Final_Project;

import java.io.*;
import java.util.UUID;

/**
 * All work is created by Matt Sievers on 01-22-2019 for use in CST-105
 */
public class NFL_Player {

  private String playerKey;
  private String firstName;
  private String lastName;
  private String position;
  private String teamName;
  private String fullName;
  private int rushingYards;
  private int passingYards;
  private int totalYardsPerGame;
  private int numberOfSuperBowlWins;

  public static void main(String[] args) throws IOException {
    NFL_Player player = newPlayer("BOB", "Smith", "QB", "Titans", 42, 120, 2);
    writePlayerToFile(player);
    playerStats(player);
  }

  private static NFL_Player newPlayer
          (String firstName, String lastName, String position, String teamName,
           int rushingYards, int passingYards, int numberOfSuperBowlWins) {
    NFL_Player player = new NFL_Player();
    player.setPlayerKey(NFL_Player.playerKey());
    player.setFirstName(firstName);
    player.setLastName(lastName);
    player.setPosition(position);
    player.setTeamName(teamName);
    player.setFullName(firstName, lastName);
    player.setRushingYards(rushingYards);
    player.setPassingYards(passingYards);
    player.setTotalYardsPerGame(rushingYards, passingYards);
    player.setNumberOfSuperBowlWins(numberOfSuperBowlWins);

    return player;
  }

  private static String playerKey() {
    UUID uuid = UUID.randomUUID();
    String key = uuid.toString();
    return key;
  }

  private static void playerStats(NFL_Player player) {
    String name = player.getFullName(player.firstName, player.lastName);
    int tYards = player.getTotalYardsPerGame(player.rushingYards, player.passingYards);
    int sbWins = player.getNumberOfSuperBowlWins();
    System.out.println("Player Name: " + name + "\n" + "Total Yards: " + tYards + "\n" + "Number of Super Bowl wins: "
            + sbWins);

  }

  private static void writePlayerToFile(NFL_Player player) throws IOException {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Player File"))) {
      int playerCount = 2;
      for (int i = 0; i < playerCount; i++) {
        String key = player.getPlayerKey();
        String fname = player.getFirstName();
        String lname = player.getLastName();
        String pos = player.getPosition();
        String team = player.getTeamName();
        String name = player.getFullName(player.firstName, player.lastName);
        int rYards = player.getRushingYards();
        int pYards = player.getPassingYards();
        int tYards = player.getTotalYardsPerGame(player.rushingYards, player.passingYards);
        int sbWins = player.getNumberOfSuperBowlWins();
        String playerFile = (key + " " + fname + " " + lname + " " + name + " " + pos
                + " " + team + " " + rYards + " " + pYards + " " + tYards + " " + sbWins
                + "," + "\n");
        bw.write(playerFile);
      }
    }
  }


  // public static void createArray(String playerFile) throws IOException {
  //   try (
  //           FileReader fr = new FileReader(playerFile);
  //           BufferedReader br = new BufferedReader(fr);
  //           Scanner input = new Scanner(br);
  //   ) {
  //     String playerStr = input.nextLine();
  //     ArrayList<String> playerArray = new ArrayList<String>();
  //     playerArray.add(String.valueOf(playerStr.split(",")));
  //   }
  // }


  private String getPlayerKey() {
    return playerKey;
  }

  private void setPlayerKey(String playerKey) {
    this.playerKey = playerKey;
  }

  private String getFirstName() {
    return firstName;
  }

  private void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  private String getLastName() {
    return lastName;
  }

  private void setLastName(String lastName) {
    this.lastName = lastName;
  }

  private String getPosition() {
    return position;
  }

  private void setPosition(String position) {
    this.position = position;
  }

  private String getTeamName() {
    return teamName;
  }

  private void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  private String getFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  private void setFullName(String firstName, String lastName) {
    this.fullName = firstName + " " + lastName;
  }

  private int getRushingYards() {
    return rushingYards;
  }

  private void setRushingYards(int rushingYards) {
    this.rushingYards = rushingYards;
  }

  private int getPassingYards() {
    return passingYards;
  }

  private void setPassingYards(int passingYards) {
    this.passingYards = passingYards;
  }

  private int getTotalYardsPerGame(int rushingYards, int passingYards) {
    int totalYardsPerGame = rushingYards + passingYards;
    return totalYardsPerGame;
  }

  private void setTotalYardsPerGame(int rushingYards, int passingYards) {
    this.totalYardsPerGame = rushingYards + passingYards;
  }

  private int getNumberOfSuperBowlWins() {
    return numberOfSuperBowlWins;
  }

  private void setNumberOfSuperBowlWins(int numberOfSuperBowlWins) {
    this.numberOfSuperBowlWins = numberOfSuperBowlWins;
  }


}
