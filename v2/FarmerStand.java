import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class FarmerStand{
  
  static Scanner scanner = new Scanner(System.in);

  public static void stand(){
    String s;
    s = "\n==============================\n";
    s += "\nYou have arrived at the Farmer's Stand. \n";
    s += "What would you like to do?\n";
    s += "\n\t1: View Inventory \n";
    s += "\t2: Talk to FarmerCat Peng \n";
    s += "\t3: UnString the Word! \n";
    s += "\t4: Exit Farmer's Stand \n";
    System.out.print(s);

    choice = (scanner.nextLine());

    if (choice.equals("1")) {
      inventory();
      stand();
    } // picking choice 1
    if (choice.equals("2")){
      talkToPeng();
      stand();
    } // choice 2
    if (choice.equals("3")) {
      unscrambleWord();
      stand();
    } // choice 3
    if (choice.equals("4")) {
      leave();
    } // choice 4

  } // store

  public static void talkToPeng() {
    String s;
    s = "\n==============================\n";
    s += "\nHello. My name is Peng.\n";
    s += "\nI am a foreign exchange student and I need help with my English homework.\n";
    s += "\nIf you help me, I can give \n\n";

    s += "\nYou MUST crack this terrible combination lock for me\n";
    s += "\nJust yesterday, a chicken pecked at ALLLLLL of my brain cells.\n";
    s += "\nHelp a poor fellow out.";

  } // talkToBarney
}
