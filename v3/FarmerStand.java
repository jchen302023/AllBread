import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class FarmerStand extends Location{

  static Scanner scanner = new Scanner(System.in);
  static ArrayList<String>[] word1;
  static ArrayList<String>[] word2;
  static ArrayList<String>[] word3;
  static ArrayList<String>[] word4;

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
    s += "\nI would ask my cousin Shaun for help, but he has already lost far too many brain cells...\n";
    s += "\nAnyways,\n";
    s += "\nIf you can help me, I can give you some leftover wheat!\n";
    System.out.println(s);
  } // talkToBarney

  public static void unscrambleWord() {
    String s;
    s = "\n==============================\n";
    s += "\nYou look down at the paper and what you see baffles you.";
    s += "\nYou have to unscramble words! Your favorite thing to do!";
    s += "\nEven better, they're CS terms!!!!";
    System.out.println(s);

    // word 1 - array
    word1.add("a");
    word1.add("r");
    word1.add("r");
    word1.add("a");
    word1.add("y");

    // // word 2 - memory
    word2.add("m");
    word2.add("e");
    word2.add("m");
    word2.add("o");
    word2.add("r");
    word2.add("y");

    // // word 3 - programming
    word3.add("p");
    word3.add("r");
    word3.add("o");
    word3.add("g");
    word3.add("r");
    word3.add("a");
    word3.add("m");
    word3.add("m");
    word3.add("i");
    word3.add("n");
    word3.add("g");

    // // word 4 - concatenation
    // word4.add("c");
    // word4.add("o");
    // word4.add("n");
    // word4.add("c");
    // word4.add("a");
    // word4.add("t");
    // word4.add("e");
    // word4.add("n");
    // word4.add("a");
    // word4.add("t");
    // word4.add("i");
    // word4.add("o");
    // word4.add("n");

    s = "\nThe words increasing in difficulty so proceed with caution.";
    s += "\nHere's word one!";
    System.out.println(s);





  } //scrambleds

  public static ArrayList<String>[] randomize(ArrayList<String>[] a) {
    ArrayList<String>[] output = new ArrayList<String>[a.size()];
    for( String o : a )
      output.add( o );
    for (int i=a.size; i>0; i--) {
      int randIndex = (int) (Math.random()*i);
      output.add(output.get(randIndex));
      output.remove(randIndex);
    }

    return output;
  } // randomize

  public static void main(String[] args) {
  // ArrayList<String>[] word1;
  //
  //
  //   word1.add("a");
  //   word1.add("r");
  //   word1.add("r");
  //   word1.add("a");
  //   word1.add("y");
  // System.out.println(randomize(word1));

    // // word 2 - memory
    // word2.add("m");
    // word2.add("e");
    // word2.add("m");
    // word2.add("o");
    // word2.add("r");
    // word2.add("y");
    //
    // // word 3 - programming
    // word3.add("p");
    // word3.add("r");
    // word3.add("o");
    // word3.add("g");
    // word3.add("r");
    // word3.add("a");
    // word3.add("m");
    // word3.add("m");
    // word3.add("i");
    // word3.add("n");
    // word3.add("g");
    //
    // // word 4 - concatenation
    // word4.add("c");
    // word4.add("o");
    // word4.add("n");
    // word4.add("c");
    // word4.add("a");
    // word4.add("t");
    // word4.add("e");
    // word4.add("n");
    // word4.add("a");
    // word4.add("t");
    // word4.add("i");
    // word4.add("o");
    // word4.add("n");

  }

  public static void leave() {
    String s;
    s = "\n==============================\n";
    s += "\nYou have decided to leave the Farmer's Stand. \n";
    s += "\nWhere would you like to go? \n";
    s += "\n\t1: View Inventory \n";
    s += "\t2: The Rose Garden \n";
    s += "\t3: The Farmers Stand \n";
    s += "\t4: The Convenience Store \n";
    s += "\t5: The Barn \n";
    s += "\t6: The Bakery \n";
    s += "\t7: Back to my humble abode \n";
    System.out.println(s);

   choice = scanner.nextLine();

   if (choice.equals("1")) {
     inventory();
     leave();
   } // picking choice 1
    else if (choice.equals("2")) {
      RoseGarden.garden();
    } // choice 2
    else if (choice.equals("3")) {
      stand();
    } // choice 3
    else if (choice.equals("4")) {
      ConvenienceStore.store();
    } // choice 4
    else if (choice.equals("5")) {
      Barn.barn();
    } // choice 5
    else if (choice.equals("6")) {
      Bakery.bakery();
    } // choice 6
    else if (choice.equals("7")) {
      Home.home();
    } // choice 7

  } // leave

} // Farmerstand
