package Final_Project;

import static Final_Project.Helpers.KeyGen.playerKey;

/**
 * All work is created by Matt Sievers on 01-26-2019 for use in CST-105
 */
public class Milestone2Driver {

  public static void main(String[] args) {
    String fName = "John";
    String lName = "Jones";
    String pos = "Running Back";
    String tName = "Cardinals";
    int rYards = 53;
    int pYards = 154;
    int sbWins = 2;

    NFL_Player player = new NFL_Player(playerKey(), "BOB", "Smith", "QB", "Titans",
            42, 120, 2);

    player.printPlayerStats();

    player.setPassingYards(23);
    player.printPlayerStats();

    NFL_Player player2 = new NFL_Player();
    player2.setFirstName(fName);
    player2.setLastName(lName);
    player2.setPosition(pos);
    player2.setTeamName(tName);
    player2.setRushingYards(rYards);
    player2.setPassingYards(pYards);
    player2.setNumberOfSuperBowlWins(sbWins);

    player2.printPlayerStats();


  }


}
