import java.util.Scanner;
import java.util.ArrayList;

public class Location {

  protected static String choice;
  static ArrayList<String> inventory = Woo.getInventory();
  static Scanner scanner = new Scanner(System.in);

  public static void inventory() {
    System.out.println(TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================\n" + TerminallyIll.color(37,TerminallyIll.background(30)));
    System.out.println("Inventory:\n");
    if (inventory.size() == 0) {
      System.out.println("Love from GrandmaCat");
    } else {
      for (int i=0; i< inventory.size(); i++) {
        System.out.println("You have "+ inventory.get(i));
      }
    }
  } // inventory

} // Location
