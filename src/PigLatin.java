import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 01-11-2019 for use in CST-105
 */
public class PigLatin {


  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a sentence for conversion");
    String str = input.nextLine();
    String strArray[] = str.split(" ");

    System.out.printf("%-20s%-20s\n", "Original Word", "Translated Word");

    for (int i = 0; i < strArray.length; i++) {
      char firstLetter = strArray[i].charAt(0);
      String remaining = strArray[i].substring(1);
      String plSuffix = "ay";
      String plWord = (remaining + firstLetter + plSuffix).toUpperCase();
      System.out.printf("%-20s%-20s\n", strArray[i], plWord);
    }


  }
}
