/**
 * All work is created by Matt Sievers on 12-17-2018 for use in CST-105
 */
public class Operators {

  public static void main(String args[]) {
    for (int i = 0; i <= 10; i++) {
      System.out.println("The number is: " + i);
    }
    for (int i = 10; i >= 0; i--) {
      System.out.println("The number is: " + i);
    }
    int t = 33;
   int  f = 42;
    int x = ++t;
    int z = --f;
    System.out.println("The value of X = " +x);
    System.out.println("The value of Z = "+ z);
  }
}
