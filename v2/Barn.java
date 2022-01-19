import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Barn extends Location{

  static Scanner scanner = new Scanner(System.in);

  public static void barn() {
    String s;
    s = "\n==============================\n";
    s += "                            +&-";
    s += "                           _.-^-._    .--.";
    s += "                        .-'   _   '-. |__|";
    s += "                       /     |_|     \\|  |";
    s += "                      /               \\  |";
    s += "                     /|     _____     |\\ |";
    s += "                      |    |==|==|    |  |";
    s += "  |---|---|---|---|---|    |--|--|    |  |";
    s += "  |---|---|---|---|---|    |==|==|    |  |";
    s += "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^/n";
    s += "\nYou are at the Trusty Barn now.\n";
    s += "\nThere an assortment of colors, sounds, and smells.\n";
    s += "\nHere you can collect the eggs and milk for your cake.\n";
    s += "\nTalk to farmer Shawn for more details.\n \n";

    s += "\nWhat would you like to do?\n";
    s += "\n\t1: View Inventory \n";
    s += "\t2: Talk to farmer Shawn \n";
    s += "\t3: Crack the code! \n";
    s += "\t4: Exit Barn \n";
    System.out.print(s);

    choice = scanner.nextLine();

    if (choice.equals("1")) {
      inventory();
      barn();
    } // picking choice 1
    else if (choice.equals("2")){
      talkToShawn();
      barn();
    } // choice 2
    else if (choice.equals("3")) {
      crackTheCode();
      barn(); 
    } // choice 3
    else if (choice.equals("4")) {
      leave();
    }
  } // garden

  public static void talkToShawn() {
    String s;
    s = "\n==============================\n";
    s += "\nHey ya'll. My name is Shawn.\n";
    s += "\nI have the milk and eggs ready for you\n";
    s += "\nBUT FIRST complete this task for me.\n\n";

    s += "\nYou MUST crack this terrible combination lock for me\n";
    s += "\nJust yesterday, a chicken pecked at ALLLLLL of my brain cells.\n";
    s += "\nHelp a poor fellow out. The combination is a three-digit number.\n\n";

    System.out.println(s);
  }

  public static void crackTheCode() {
    String s;
    s = "";
  }

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
     leave();
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
