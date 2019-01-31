package Final_Project;

/**
 * All work is created by Matt Sievers on 01-26-2019 for use in CST-105
 */
public class Milestone3Driver {

  public static void main(String[] args) {
    NFL_Player_Manager playerManager = new NFL_Player_Manager();
    playerManager.createOffensivePlayers(6);
    System.out.println("Offensive Players are: ");
    System.out.printf("%-37s%-15s%-15s%-26s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Player Key", "First Name", "Last Name","Full Name", "Position", "Team Name",
            "Rush", "Pass", "Receive", "SB Wins");
    System.out.println(playerManager.toString());
    playerManager.createDefensivePlayers(3);
    System.out.println("Defensive Players are: " + "\n");
    System.out.printf("%-37s%-15s%-15s%-26s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Player Key", "First Name", "Last Name","Full Name", "Position", "Team Name",
            "D Tackles", "D Sacks", "D Int", "SB Wins");
    System.out.println(playerManager.toString());


  }
}
