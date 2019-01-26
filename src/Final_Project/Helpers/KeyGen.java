package Final_Project.Helpers;

import java.util.UUID;

/**
 * All work is created by Matt Sievers on 01-26-2019 for use in CST-105
 */
public class KeyGen {

  public static String playerKey() {
    UUID uuid = UUID.randomUUID();
    String key = uuid.toString();
    return key;
  }

}
