package CST105.Week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 01-27-2019 for use in CST-105
 */
public class PrimePalindromeNumbers {


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int number = input.nextInt();
    for (int i = 2; i <= number; i++) {
      if (isPrime(i) && isPalindrome(i)) {
        System.out.println(i + " Is both a prime number and a palindrome");
      }
    }
  }

  public static boolean isPrime(int number) {
    int x = 2;
    while (number % x > 0) {
      x += 1;
    }
    if (x == number) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isPalindrome(int number) {
    int reverseNumber = 0;
    int tempNumber = number;
    int remainder;
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


