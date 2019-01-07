import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 01-07-2019 for use in CST-105
 */
public class if_elseStatement {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("What is the temp today?");
    int temp = input.nextInt();
    if(temp <= 50){
      System.out.println("It is going to be cold outside, wear a jacket!");
    }
    else
      System.out.println("Should be warm enough to not need a jacket, leave it!");
  }
}
