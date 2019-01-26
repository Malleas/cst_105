package Final_Project;
import java.util.ArrayList;

import static Final_Project.Helpers.KeyGen.playerKey;
import static Final_Project.Helpers.RandomGenerator.randomName;

/**
 * All work is created by Matt Sievers on 01-26-2019 for use in CST-105
 */
public class NFL_Player_Manager {

  private ArrayList<NFL_Player>  playerList;

  public NFL_Player_Manager(){}

  /**
   * Creates players
   * @param playerCount is the number
   */
  public void createPlayers(int playerCount) {
    ArrayList<NFL_Player> newPlayerList = new ArrayList<>();
    for (int i = 0; i < playerCount; i++) {
      NFL_Player player = new NFL_Player();
      player.setPlayerKey(playerKey());
      player.setFirstName(randomName());
      player.setLastName(randomName());
      player.setPosition(randomName());
      player.setTeamName(randomName());
      player.setRushingYards((int) (Math.random() * 10));
      player.setPassingYards((int) (Math.random() * 100));
      player.setNumberOfSuperBowlWins((int) (Math.random() * 10));
      newPlayerList.add(player);
    }
    this.playerList = newPlayerList;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (NFL_Player player : this.playerList){
      sb.append(player.toString());
    }
    return sb.toString();
  }
}
