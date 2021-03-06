package Final_Project;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import static Final_Project.Helpers.KeyGen.playerKey;

/**
 * All work is created by Matt Sievers on 01-22-2019 for use in CST-105
 */
public abstract class NFL_Player {

  public String playerKey;
  public String firstName;
  public String lastName;
  public String position;
  public String teamName;
  private int rushingYards;
  private int passingYards;
  private int numberOfSuperBowlWins;

  public NFL_Player(String playerKey, String firstName, String lastName, String position, String teamName,
                    int numberOfSuperBowlWins) {
    this.playerKey = playerKey;
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
    this.teamName = teamName;
    this.numberOfSuperBowlWins = numberOfSuperBowlWins;
  }

  public NFL_Player() {
  }


  public void printPlayerStats() {
    String name = this.getFullName();
    int tYards = this.getTotalYardsPerGame();
    int sbWins = this.getNumberOfSuperBowlWins();
    System.out.println("Player Name: " + name + "\n" + "Total Yards: " + tYards + "\n" + "Number of Super Bowl wins: "
            + sbWins);

  }

  public String getPlayerKey() {
    return playerKey;
  }

  public void setPlayerKey(String playerKey) {
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

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public void setFullName(String firstName, String lastName) {
    setFirstName(firstName);
    setLastName(lastName);
  }

  public int getRushingYards() {
    return rushingYards;
  }

  public void setRushingYards(int rushingYards) {
    this.rushingYards = rushingYards;
  }

  public int getPassingYards() {
    return passingYards;
  }

  public void setPassingYards(int passingYards) {
    this.passingYards = passingYards;
  }

  public int getTotalYardsPerGame() {
    return rushingYards + passingYards;
  }

  public void setTotalYardsPerGame(int rushingYards, int passingYards) {
    setRushingYards(rushingYards);
    setPassingYards(passingYards);
  }

  public int getNumberOfSuperBowlWins() {
    return numberOfSuperBowlWins;
  }

  public void setNumberOfSuperBowlWins(int numberOfSuperBowlWins) {
    this.numberOfSuperBowlWins = numberOfSuperBowlWins;
  }

  @Override
  public abstract String toString();

}
