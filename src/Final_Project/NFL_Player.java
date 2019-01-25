package Final_Project;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * All work is created by Matt Sievers on 01-22-2019 for use in CST-105
 */
public class NFL_Player {
  public UUID getPlayerKey() {
    return playerKey;
  }

  public void setPlayerKey(UUID playerKey) {
    this.playerKey = playerKey;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public void setFullName(String firstName, String lastName) {
    this.fullName = firstName + " " + lastName;
  }

  public int getRushingYards() {
    return rushingYards;
  }

  public void setRushingYards(int rushingYards) {
    this.rushingYards = rushingYards;
  }

  public int getPassingYards() {
    return passingYards;
  }

  public void setPassingYards(int passingYards) {
    this.passingYards = passingYards;
  }

  public int getTotalYardsPerGame(int rushingYards, int passingYards) {
    return rushingYards + passingYards;
  }

  public void setTotalYardsPerGame(int rushingYards, int passingYards) {
    this.totalYardsPerGame = rushingYards + passingYards;
  }

  public int getNumberOfSuperBowlWins() {
    return numberOfSuperBowlWins;
  }

  public void setNumberOfSuperBowlWins(int numberOfSuperBowlWins) {
    this.numberOfSuperBowlWins = numberOfSuperBowlWins;
  }

  UUID playerKey;
  String firstName;
  String lastName;
  String position;
  String teamName;
  String fullName;
  int rushingYards;
  int passingYards;
  int totalYardsPerGame;
  int numberOfSuperBowlWins;

  public static void managePlayer() {
  }

  public static void playerStats(UUID playerKey, String fullName, int totalYardsPerGame) {
    String stats  = ("Play7erId: " + playerKey + "\n" +"Player Name: " + fullName + "\n"+ "Total Yards: " + totalYardsPerGame);
    System.out.print(stats);
  }

  public static NFL_Player createPlayer() throws IOException {
    NFL_Player player = new NFL_Player();
    BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/ntqams30/Dropbox/GCU Work/CST-105/MyFirstProject/src/Final_Project/Player File"));
    int playerCount = 2;
    for (int i = 0; i < playerCount; i++) {
      Scanner input = new Scanner(System.in);
      UUID uuid = UUID.randomUUID();
      player.setPlayerKey(uuid);
      System.out.print("Enter player's first name");
      String fName = input.nextLine();
      player.setFirstName(fName);
      System.out.print("Enter player's last name");
      String lName = input.nextLine();
      player.setLastName(lName);
      System.out.print("Enter player's position name");
      String playerPosition = input.nextLine();
      player.setPosition(playerPosition);
      System.out.print("Enter player's team name");
      String tName = input.nextLine();
      player.setTeamName(tName);
      String playerFull = ((player.playerKey + " " + player.firstName + " " + player.lastName + " " + player.position
              + " " + player.teamName + "," + "\n").toUpperCase());
      bw.write(playerFull);
    }
    bw.close();

    return player;
  }

  public static void createArray(String playerFile) throws IOException {
    try (
            FileReader fr = new FileReader(playerFile);
            BufferedReader br = new BufferedReader(fr);
            Scanner input = new Scanner(br);
    ) {
      String playerStr = input.nextLine();
      ArrayList<String> playerArray = new ArrayList<String>();
      playerArray.add(String.valueOf(playerStr.split(",")));
    }
  }


  public static void main(String[] args) throws IOException {
    NFL_Player stats = new NFL_Player();
    stats.rushingYards = 43;
    stats.passingYards = 130;
    createPlayer();
    playerStats(createPlayer().playerKey, createPlayer().fullName + createPlayer().lastName, stats.rushingYards + stats.passingYards);

  }

}
