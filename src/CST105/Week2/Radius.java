package CST105.Week2;

/**
 * All work is created by Matt Sievers on 12-13-2018 for use in CST-105
 */
public class Radius {

  public double raidus = 15;
  public double c;
  public double a;

  public double getCircumference() {
    return c = 2 * 3.14 * raidus;
  }

  public double getArea() {
    return a = (3.14 * (raidus * raidus));
  }

  public static void main(String args[]) {
    Radius radius = new Radius();
    double a = radius.getArea();
    double c = radius.getCircumference();
    System.out.println("The Circumfrence is " + c);
    System.out.println("This is the area " + a);
  }

}
