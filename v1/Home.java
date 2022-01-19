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
      home(); 
    } // picking choice 1
    if (choice.equals("2")){
      talkToGrandma();
    } // choice 2
    if (choice.equals("3")) {
      leaveHome();
    } // choice 3


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

  public static void leaveHome() {
    String s;
    s = "\n==============================\n";
    s += "You have chosen to leave your humble abode. \n";
    s += "Where would you like to go? \n";
    s += "\t1: View Inventory \n";
    s += "\t2: The Rose Garden \n";
    s += "\t3: The Farmers Stand \n";
    s += "\t4: The Convience Store \n";
    s += "\t5: The Barn \n";
    s += "\t6: The Bakery \n";
    s += "\t7: Back to my humble abode \n";
    System.out.println(s);

   choice = (scanner.nextLine());

   if (choice.equals("1")) {
     inventory();
     leaveHome();
   } // picking choice 1
    // else if (choice == 2) {
    //   roseGarden();
    // } // choice 2
    // else if (choice == 3) {
    //   roseGarden();
    // } // choice 3
    // else if (choice == 4) {
    //   roseGarden();
    // } // choice 4
    // else if (choice == 5) {
    //   roseGarden();
    // } // choice 5
    // else if (choice.equals("6")) {
    //   Bakery.bakery();
    // }
    else if (choice.equals("7")) {
      home();
    }

  } // leaveHome
}
