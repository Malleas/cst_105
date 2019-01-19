import java.io.BufferedReader;
import java.util.Scanner;
import java.io.*;

/**
 * All work is created by Matt Sievers on 01-19-2019 for use in CST-105
 */
public class TwoDArray {

  public static void main(String[] args) throws Exception {
    try (
            FileReader fr = new FileReader("/Users/ntqams30/Dropbox/GCU Work/CST-105/MyFirstProject/src/week5FileInput2");
            BufferedReader br = new BufferedReader(fr);
            Scanner input = new Scanner(br);
    ) {
      String str = input.nextLine();
      int rowCount = 20;
      int colCount = 45;
      char[][] charArray = new char[rowCount][colCount];
      int offset = 0;
      for (int row = 0; row < rowCount; row++) {
        for (int col = 0; col < colCount; col++) {
          if (offset < str.length()) {
            charArray[row][col] = str.charAt(offset);
          } else {
            charArray[row][col] = '@';
          }
          offset++;
          System.out.print(charArray[row][col]);
        }
        System.out.println();
      }
      System.out.println();
      String output = "";
      for(int col = 0; col < colCount; col++){
        for(int row = 0; row < rowCount; row++){
          output += charArray[row][col];
        }
      }
      System.out.println(output);
    }
  }
}


