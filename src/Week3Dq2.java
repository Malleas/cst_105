import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 01-10-2019 for use in CST-105
 */
public class Week3Dq2 {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int balance = input.nextInt();
    if(balance < 0){
      System.out.println("You are overdrawn");
      System.out.println("Thank you, please call again");
    }
    else System.out.println("Your current balance is:" + balance);

  }

}
