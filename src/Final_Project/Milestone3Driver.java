package Final_Project;

/**
 * All work is created by Matt Sievers on 01-26-2019 for use in CST-105
 */
public class Milestone3Driver {

  public static void main(String[] args) {
    NFL_Player_Manager playerManager = new NFL_Player_Manager();
    playerManager.createPlayers(3, OffensivePlayer.class);
    playerManager.createPlayers(3, DefensivePlayer.class);
    System.out.println(playerManager.toString());
  }
}
