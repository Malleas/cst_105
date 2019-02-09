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
    return "DefensivePlayer{" +
            ", playerKey='" + playerKey + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", position='" + position + '\'' +
            '}';
  }
}
