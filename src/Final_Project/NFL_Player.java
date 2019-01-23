package Final_Project;

/**
 * All work is created by Matt Sievers on 01-22-2019 for use in CST-105
 */
public class NFL_Player {
  public int getPlayerKey() {
    return playerKey;
  }

  public void setPlayerKey(int playerKey) {
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

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public int getJerseyNumber() {
    return jerseyNumber;
  }

  public void setJerseyNumber(int jerseyNumber) {
    this.jerseyNumber = jerseyNumber;
  }

  public NFL_Player(int playerKey, String firstName, String lastName, String position, String team, int jerseyNumber) {
    this.playerKey = playerKey;
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
    this.team = team;
    this.jerseyNumber = jerseyNumber;
  }

  int playerKey;
  String firstName;
  String lastName;
  String position;
  String team;
  int jerseyNumber;



}
