import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Home extends Location{
  // static InputStreamReader isr;
  // static BufferedReader input;
  static String choice;
  // static ArrayList<String> inventory = new ArrayList<String>();
  // ArrayList<String> inventory = Woo.getInventory();
  static Scanner scanner = new Scanner(System.in);

  public static void home() {
    String s;
    s = "\n==============================\n";
    s += "    ____|| \n";
    s += "  /田  田 /\\\n";
    s += "  |__間__| |\n";
    s += "\nYou are at home now.\n";
    s += "What would you like to do?\n";
    s += "\t1: View Inventory \n";
    s += "\t2: Talk to GrandmaCat \n";
    s += "\t3: Exit House \n";
    System.out.print(s);

    choice = ( scanner.nextLine() );

    if (choice.equals("1")) {
      inventory();
    } // picking choice 1
    if (choice.equals("2")){
      talkToGrandma();
    } // choice 2
    if (choice.equals("3")) {
    } // choice 3
      home();
      
  } // Home
  public static void talkToGrandma() {
    String requireCake = "cake";
    for (int i = 0; i < inventory.size(); i ++) {
      if ((inventory.get(i)).compareTo("cake") == 0) {
        System.out.println("Game over!");
        return;
      } // if you have cake game ends
    }
      System.out.println("\n==============================");
      System.out.println("\nYou wish to talk to GrandmaCat");
      System.out.println("\nHowever, you do not have anything for GrandmaCat right now ):");
      System.out.println("\nYou should come back when you got something for GrandmaCat");
      home();
  } // talkToGrandma
}
