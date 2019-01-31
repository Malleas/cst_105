package Final_Project;

import java.util.ArrayList;

import static Final_Project.Helpers.KeyGen.playerKey;
import static Final_Project.Helpers.RandomGenerator.randomName;

/**
 * All work is created by Matt Sievers on 01-26-2019 for use in CST-105
 */
public class NFL_Player_Manager {

  private ArrayList<NFL_Player> playerList;

  public NFL_Player_Manager() {
  }


  /**
   * Creates players
   *
   * @param playerCount is the number
   */

  public void createOffensivePlayers(int playerCount) {
    ArrayList<NFL_Player> newPlayerList = new ArrayList<>();
    for (int i = 0; i < playerCount; i++) {
      OffensivePlayer oPlayer = new OffensivePlayer();
      oPlayer.setPlayerKey(playerKey());
      oPlayer.setFirstName(randomName());
      oPlayer.setLastName(randomName());
      oPlayer.setPosition(randomName());
      oPlayer.setTeamName(randomName());
      oPlayer.setOffensivePassingYards((int) (Math.random() * 100));
      oPlayer.setOffensiveRecievingYards((int) (Math.random() * 100));
      oPlayer.setOffensiveRushingYards((int) (Math.random() * 100));
      oPlayer.setNumberOfSuperBowlWins((int) (Math.random() * 10));
      newPlayerList.add(oPlayer);
    }
    this.playerList = newPlayerList;
  }

  public void createDefensivePlayers(int playerCount) {
    ArrayList<NFL_Player> newPlayerList = new ArrayList<>();
    for (int i = 0; i < playerCount; i++) {
      DefensivePlayer dPlayer = new DefensivePlayer();
      dPlayer.setPlayerKey(playerKey());
      dPlayer.setFirstName(randomName());
      dPlayer.setLastName(randomName());
      dPlayer.setPosition(randomName());
      dPlayer.setTeamName(randomName());
      dPlayer.setDefensiveTackles((int) (Math.random() * 10));
      dPlayer.setDefensiveSacks((int) (Math.random() * 100));
      dPlayer.setDefensiveInterceptions((int) (Math.random() * 10));
      dPlayer.setNumberOfSuperBowlWins((int) (Math.random() * 10));
      newPlayerList.add(dPlayer);
    }
    this.playerList = newPlayerList;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (NFL_Player player : this.playerList) {
      sb.append(player.toString());
    }
    return sb.toString();
  }


}
