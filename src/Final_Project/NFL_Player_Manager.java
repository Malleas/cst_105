package Final_Project;

import java.util.ArrayList;

import static Final_Project.Helpers.KeyGen.playerKey;
import static Final_Project.Helpers.RandomGenerator.randomName;

/**
 * All work is created by Matt Sievers on 01-26-2019 for use in CST-105
 */
public class NFL_Player_Manager {

  private ArrayList<NFL_Player> playerList = new ArrayList<>();

  public NFL_Player_Manager() {
  }

  @Override
  public String toString() {
    return "NFL_Player_Manager{" +
            "playerList=" + playerList +
            '}';
  }

  public void createPlayers(int playerCount, Class<? extends NFL_Player> playerClass) {
    if(playerClass.equals(OffensivePlayer.class)){
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
        this.playerList.add(oPlayer);
      }
    }
    else if(playerClass.equals(DefensivePlayer.class)){
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
        this.playerList.add(dPlayer);
      }
    }
    else throw new IllegalArgumentException("No class found");
  }


  public ArrayList<NFL_Player> getPlayers() {
    return this.playerList;
  }
}
