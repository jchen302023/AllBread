import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Location {

  protected static String choice;
  static ArrayList<String> inventory = Woo.getInventory();
  static Scanner scanner = new Scanner(System.in);

  public static void inventory() {
    System.out.println("\n==============================\n");
    System.out.println("Inventory:\n");
    if (inventory.size() == 0) {
      System.out.println("Love from GrandmaCat");
    } else {
      for (int i=0; i< inventory.size(); i++) {
        System.out.println("You have a(n)"+ inventory.get(i));
      }
    }
  } // inventory

} // Location
