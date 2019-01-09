import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 01-09-2019 for use in CST-105
 */
public class SwitchExample {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 10");
    int number = input.nextInt();
    String colorString = new String();
    switch (number){
      case 1: colorString = "Your color of the day is Blue!";
      break;
      case 2: colorString = "Your color of the day is Green!";
        break;
      case 3: colorString = "Your color of the day is Pink!";
        break;
      case 4: colorString = "Your color of the day is Red!";
        break;
      case 5: colorString = "Your color of the day is Yellow!";
        break;
      case 6: colorString = "Your color of the day is Black!";
        break;
      case 7: colorString = "Your color of the day is Purple!";
        break;
      case 8: colorString = "Your color of the day is White!";
        break;
      case 9: colorString = "Your color of the day is Brown!";
        break;
      case 10: colorString = "Your color of the day is Grey!";
        break;
    }
    System.out.println(colorString);
  }

}
