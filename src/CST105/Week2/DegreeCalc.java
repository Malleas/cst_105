package CST105.Week2; /**
 * All work is created by Matt Sievers on 12-20-2018 for use in CST-105
 */
import java.util.Scanner;


public class DegreeCalc {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please provide a temperature in fahrenheit: ");
    double f = input.nextInt();
    double convertedCTemp = (f -32)*5/9; //converts input from F to C
    System.out.println("The converted celsius temp is: " + convertedCTemp);
    System.out.print("Please enter a temperature in celsius: ");
    double c = input.nextInt();
    double convertedFTemp = c*9/5+32; //converts input from C to F
    System.out.println("The converted fahrenheit temp is: " + convertedFTemp);
  }
}
