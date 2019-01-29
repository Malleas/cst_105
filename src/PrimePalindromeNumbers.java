import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 01-27-2019 for use in CST-105
 */
public class PrimePalindromeNumbers {


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int foo = input.nextInt();
    for (int i = 2; i <= foo; i++) {
      if (prime(i) && palindrome(i)) {
        System.out.println(i);
      }
    }


  }


  public static boolean prime(int number) {
    int x = 2;
    if (number % x != 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean palindrome(int number) {
    int reverseNumber = 0;
    int tempNumber = number;
    int remainder = 0;
    while (number > 0) {
      remainder = number % 10;
      reverseNumber = (reverseNumber * 10) + remainder;
      number = number / 10;
    }
    if (reverseNumber == tempNumber) {
      return true;
    } else {
      return false;
    }

  }
}


