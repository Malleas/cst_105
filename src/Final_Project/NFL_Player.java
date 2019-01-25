package Final_Project;

import java.io.*;
import java.util.UUID;

/**
 * All work is created by Matt Sievers on 01-22-2019 for use in CST-105
 */
public class NFL_Player {

  private UUID playerKey;
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
    NFL_Player player = new NFL_Player();
    UUID uuid = UUID.randomUUID();
    String key = uuid.toString();
    newPlayer(key, "BOB", "Smith", "QB", "Titans", 42, 120, 2);
    writePlayerToFile();
    playerStats();
  }

  public String toString(){
  }

  private static void newPlayer
          (String key, String firstName, String lastName, String position, String teamName,
           int rushingYards, int passingYards, int numberOfSuperBowlWins) {
    NFL_Player player = new NFL_Player();
    player.setFirstName(firstName);
    player.setLastName(lastName);
    player.setPosition(position);
    player.setTeamName(teamName);
    player.setFullName(firstName, lastName);
    player.setRushingYards(rushingYards);
    player.setPassingYards(passingYards);
    player.setTotalYardsPerGame(rushingYards, passingYards);
    player.setNumberOfSuperBowlWins(numberOfSuperBowlWins);

  }

  private static void playerStats() {
    NFL_Player player = new NFL_Player();
    String name = player.getFullName();
    int tYards = player.getTotalYardsPerGame(player.rushingYards, player.passingYards);
    int sbWins = player.getNumberOfSuperBowlWins();
    System.out.println("Player Name: " + name + "\n" + "Total Yards: " + tYards + "\n" + "Number of Super Bowl wins: "
            + sbWins);

  }

  private static void writePlayerToFile() throws IOException {
    NFL_Player player = new NFL_Player();
    try (
            BufferedWriter bw = new BufferedWriter(new FileWriter("Player File"))
    ) {
      int playerCount = 2;
      for (int i = 0; i < playerCount; i++) {
        NFL_Player player = new NFL_Player();
        UUID key = player.getPlayerKey();
        String fname = player.getFirstName();
        String lname = player.getLastName();
        String pos = player.getPosition();
        String team = player.getTeamName();
        String name = player.getFullName();
        int rYards = player.getRushingYards();
        int pYards = player.getPassingYards();
        int tYards = (int) player.getTotalYardsPerGame();
        int sbWins = player.getNumberOfSuperBowlWins();
        String playerFull = ((key + " " + fname + " " + lname + " " + name + " " + pos
                + " " + team + " " + rYards + " " + pYards + " " + tYards + " " + sbWins
                + "," + "\n").toUpperCase());
        bw.write(playerFull);
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


  private UUID getPlayerKey() {
    return playerKey;
  }

  private void setPlayerKey(UUID playerKey) {
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
    return fullName
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
