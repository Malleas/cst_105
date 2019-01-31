package Final_Project;

/**
 * All work is created by Matt Sievers on 01-29-2019 for use in CST-105
 */
public class OffensivePlayer extends NFL_Player {

  private int offensiveRushingYards;
  private int offensivePassingYards;
  private int offensiveRecievingYards;


  public OffensivePlayer() {
  }

  public OffensivePlayer(String playerKey, String firstName, String lastName, String position, String teamName,
                         int offensiveRushingYards, int offensivePassingYards, int offensiveRecievingYards,
                         int numberOfSuperBowlWins) {
    super(playerKey, firstName, lastName, position, teamName, numberOfSuperBowlWins);
  }

  public int getOffensiveRushingYards() {
    return offensiveRushingYards;
  }

  public void setOffensiveRushingYards(int offensiveRushingYards) {
    this.offensiveRushingYards = offensiveRushingYards;
  }

  public int getOffensivePassingYards() {
    return offensivePassingYards;
  }

  public void setOffensivePassingYards(int offensivePassingYards) {
    this.offensivePassingYards = offensivePassingYards;
  }

  public int getOffensiveRecievingYards() {
    return offensiveRecievingYards;
  }

  public void setOffensiveRecievingYards(int offensiveRecievingYards) {
    this.offensiveRecievingYards = offensiveRecievingYards;
  }

  @Override
  public String toString() {
    String key = getPlayerKey();
    String fname = getFirstName();
    String lname = getLastName();
    String pos = getPosition();
    String team = getTeamName();
    String name = getFullName();
    int oRushingYards = getOffensiveRushingYards();
    int oPassingYards = getOffensivePassingYards();
    int oRecievingYards = getOffensiveRecievingYards();
    int tYards = getTotalYardsPerGame();
    int sbWins = getNumberOfSuperBowlWins();
    String playerLine = String.format("%-37s%-15s%-15s%-26s%-15s%-15s%-15s%-15s%-15s%-15s\n", key, fname, lname, name,
            pos, team, oRushingYards, +oPassingYards, +oRecievingYards, +sbWins);
    return playerLine;
  }
}
