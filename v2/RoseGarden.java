import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class RoseGarden extends Location{

  static Scanner scanner = new Scanner(System.in);

  public static void garden() {
    String s;
    s = "\n==============================\n";
    s += "\n   🎕🎕🎕 \n";
    s += "\nYou are at the Rose Garden now.\n";
    s += "\nYou and Grandma tend to the flowers together over the weekends\n";
    s += "\nWhat would you like to do?\n";
    s += "\n\t1: View Inventory \n";
    s += "\t2: Pick a rose \n";
    s += "\t3: Exit Garden \n";
    System.out.print(s);

    choice = scanner.nextLine();

    if (choice.equals("1")) {
      inventory();
      garden();
    } // picking choice 1
    else if (choice.equals("2")){
      pickFlower();
      garden();
    } // choice 2
    else if (choice.equals("3")) {
      leave();
    } // choice 3
  } // garden

  public static void pickFlower() {
    String s;
    s = "\n==============================\n";
    s += "\nYou picked a rose\n";
    s += "\nRose added to inventory\n";
    s += "\nSomeone might want this pretty flower...\n";
    System.out.print(s);

    inventory.add("rose");

  } // pickFlower

    public static void leave() {
      String s;
      s = "\n==============================\n";
      s += "\nYou have decided to leave the Garden. \n";
      s += "\nWhere would you like to go? \n";
      s += "\n\t1: View Inventory \n";
      s += "\t2: The Rose Garden \n";
      s += "\t3: The Farmers Stand \n";
      s += "\t4: The Convience Store \n";
      s += "\t5: The Barn \n";
      s += "\t6: The Bakery \n";
      s += "\t7: Back to my humble abode \n";
      System.out.println(s);

     choice = scanner.nextLine();

     if (choice.equals("1")) {
       inventory();
       garden();
     } // picking choice 1
      // else if (choice == 2) {
      //   roseGarden();
      // } // choice 2
      // else if (choice == 3) {
      //   roseGarden();
      // } // choice 3
      // else if (choice == 2) {
      //   roseGarden();
      // } // choice 4
      // else if (choice == 2) {
      //   roseGarden();
      // } // choice 5
      else if (choice.equals("6")) {
        Bakery.bakery();
      } // choice 6
      else if (choice.equals("7")) {
        Home.home();
      } // choice 7
    } // leave


} // RoseGarden
