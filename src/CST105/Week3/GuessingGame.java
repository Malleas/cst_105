package CST105.Week3;

import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 01-07-2019 for use in CST-105
 */
public class GuessingGame {

  public static int setRange(int max, int min) {
    int range = (max - min) + 1;
    int number = (int) (Math.random() * range) + min;
    return number;
  }

  public static void main(String[] args) {
    int max = 10000;
    int min = 0;
    int actual = setRange(max, min);
    //System.out.println(actual);  //Un comment to see answer, used for testing.
    Scanner input = new Scanner(System.in);

    for (int guessesCount = 1; ; guessesCount++) {
      System.out.println("Choose a new number between " + min + " and " + max);
      int guess = input.nextInt();
      if (guess < actual) {
        System.out.println("Higher");
        min = (guess + 1);
      } else if (guess > actual) {
        System.out.println("Lower");
        max = (guess - 1);
      } else {
        System.out.println("Nailed it and it only too you " + guessesCount + " number of guesses");
        break;
      }
    }
  }
}

