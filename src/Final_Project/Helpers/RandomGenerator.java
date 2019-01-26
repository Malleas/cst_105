package Final_Project.Helpers;

import java.util.Random;

/**
 * All work is created by Matt Sievers on 01-26-2019 for use in CST-105
 */
public class RandomGenerator {

  /**
   * Citation for the blow randomName creation
   * Atta, S. (Dec 12 20130 Stack Overflow Creating a random string with A-Z and 0-9 in Java [duplicate],
   * https://stackoverflow.com/questions/20536566/creating-a-random-string-with-a-z-and-0-9-in-java
   */
  public static String randomName() {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    while (sb.length() < 10) {
      int index = (int) (random.nextFloat() * characters.length());
      sb.append(characters.charAt(index));
    }
    return sb.toString();
  }
}
