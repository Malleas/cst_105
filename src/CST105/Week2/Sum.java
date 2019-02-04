package CST105.Week2; /**
 * All work is created by Matt Sievers on 12-18-2018 for use in CST-105
 */

import java.util.Scanner;


public class Sum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a 5 digit positive number: ");
    int orgNumber = input.nextInt();
    int sum = 0;
    while (orgNumber > 0) {
      sum += orgNumber % 10;
      orgNumber /= 10;
    }
    System.out.println("The sum is: " + sum);


  }
}




