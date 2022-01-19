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
        System.out.println("You have "+ inventory.get(i));
      }
    }
  } // inventory

  // public static void leaveHome() {
  //   String s;
  //   s = "\n==============================\n";
  //   s += "You have chosen to leave your humble abode. \n";
  //   s += "Where would you like to go? \n";
  //   s += "\t1: View Inventory \n";
  //   s += "\t2: The Rose Garden \n";
  //   s += "\t3: The Farmers Stand \n";
  //   s += "\t4: The Convience Store \n";
  //   s += "\t5: The Barn \n";
  //   s += "\t6: The Bakery \n";
  //   s += "\t7: Back to my humble abode \n";
  //   System.out.println(s);
  //
  //  choice = scanner.nextLine();
  //
  //  if (choice.equals("1")) {
  //    inventory();
  //  } // picking choice 1
  //   // else if (choice == 2) {
  //   //   roseGarden();
  //   // } // choice 2
  //   // else if (choice == 3) {
  //   //   roseGarden();
  //   // } // choice 3
  //   // else if (choice == 2) {
  //   //   roseGarden();
  //   // } // choice 4
  //   // else if (choice == 2) {
  //   //   roseGarden();
  //   // } // choice 5
  //   // else if (choice == 2) {
  //   //   roseGarden();
  //   // } // choice 6
  //
  // } // leaveHome
}
