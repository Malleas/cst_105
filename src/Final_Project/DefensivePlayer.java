package Final_Project;

/**
 * All work is created by Matt Sievers on 01-29-2019 for use in CST-105
 */
public class DefensivePlayer extends NFL_Player {

  private int defensiveTackles;
  private int defensiveSacks;
  private int defensiveInterceptions;

  public DefensivePlayer() {
  }


  public DefensivePlayer(String playerKey, String firstName, String lastName, String position, String teamName,
                         int defensiveTackles, int defensiveSacks, int defensiveInterceptions, int numberOfSuperBowlWins) {
    super(playerKey, firstName, lastName, position, teamName, numberOfSuperBowlWins);
  }

  public int getDefensiveTackles() {
    return defensiveTackles;
  }

  public void setDefensiveTackles(int defensiveTackles) {
    this.defensiveTackles = defensiveTackles;
  }

  public int getDefensiveSacks() {
    return defensiveSacks;
  }

  public void setDefensiveSacks(int defensiveSacks) {
    this.defensiveSacks = defensiveSacks;
  }

  public int getDefensiveInterceptions() {
    return defensiveInterceptions;
  }

  public void setDefensiveInterceptions(int defensiveInterceptions) {
    this.defensiveInterceptions = defensiveInterceptions;
  }

  @Override
  public String toString() {
    String key = getPlayerKey();
    String fname = getFirstName();
    String lname = getLastName();
    String pos = getPosition();
    String team = getTeamName();
    String name = getFullName();
    int dTackles = getDefensiveTackles();
    int dSacks = getDefensiveSacks();
    int dInterceptions = getDefensiveInterceptions();
    int tYards = getTotalYardsPerGame();
    int sbWins = getNumberOfSuperBowlWins();
    String playerLine = String.format("%-37s%-15s%-15s%-26s%-15s%-15s%-15s%-15s%-15s%-15s\n",key, fname,
            lname, name, pos, team, dTackles, dSacks, dInterceptions, sbWins);
    return playerLine;
  }
}
