import java.util.Scanner;
import java.util.ArrayList;

public class FarmerStand extends Location{

  static Scanner scanner = new Scanner(System.in);
  private static ArrayList<String> word1 = new ArrayList<String>();
  private static ArrayList<String> word2 = new ArrayList<String>();
  private static ArrayList<String> word3 = new ArrayList<String>();
  private static ArrayList<String> word4 = new ArrayList<String>();

  public static void stand(){
    String s;
    s = TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================\n" + TerminallyIll.color(37,TerminallyIll.background(30));
    s += "\nYou have arrived at the Farmer's Stand. \n";
    s += TerminallyIll.color(30, TerminallyIll.background(36)) + "What would you like to do?" + TerminallyIll.color(37, TerminallyIll.background(30));
    s += "\n\n\t1: View Inventory \n";
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
    s = TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================\n" + TerminallyIll.color(37,TerminallyIll.background(30));
    s += "\nHello. My name is Peng.\n";
    s += "\nI am a foreign exchange student and I need help with my English homework.\n";
    s += "\nI would ask my cousin Shaun for help, but he has already lost far too many brain cells...\n";
    s += "\nAnyways,\n";
    s += "\nIf you can help me, I can give you some leftover wheat!\n";
    System.out.println(s);
  } // talkToBarney

  public static void unscrambleWord() {
    String s;
    s = TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================\n" + TerminallyIll.color(37,TerminallyIll.background(30));
    s += "\nYou look down at the paper and what you see baffles you.";
    s += "\nYou have to unscramble words! Your favorite thing to do!\n";
    s += TerminallyIll.color(33, TerminallyIll.background(30)) + "Even better, they're CS terms!!!!" + TerminallyIll.color(37,TerminallyIll.background(30));
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

    // word 4 - concatenation
    word4.add("c");
    word4.add("o");
    word4.add("n");
    word4.add("c");
    word4.add("a");
    word4.add("t");
    word4.add("e");
    word4.add("n");
    word4.add("a");
    word4.add("t");
    word4.add("i");
    word4.add("o");
    word4.add("n");

    // randomize words and save in variables
    ArrayList<String> rand1 = randomize(word1);
    ArrayList<String> rand2 = randomize(word2);
    ArrayList<String> rand3 = randomize(word3);
    ArrayList<String> rand4 = randomize(word4);

    // word 1
    s =  TerminallyIll.color(31, TerminallyIll.background(30)) + "\nThe words increasing in difficulty so proceed with caution." + TerminallyIll.color(37,TerminallyIll.background(30));
    s += "\nHere's word one!";
    System.out.println(s);
    System.out.println(rand1);
    word1();

    s = "\nWord 2 next!";
    System.out.println(s);
    System.out.println(rand2);
    word2();

    s = "\nAre you ready for word 3??";
    System.out.println(s);
    System.out.println(rand3);

    word3();

    s = "\nDrumroll please dun dun dun... word 4!";
    System.out.println(s);
    System.out.println(rand4);
    word4();

    recieveWheat();

  } //scrambleds

  public static void word1() {
    String s;

    for (int i = 3; i > 0; i --) {
      choice = (scanner.nextLine()).toLowerCase();

      if (choice.equals("array")) {
        s = "Congratulations! You unscrambled 'array' correctly. Onwards! ";
        System.out.println(s);
        return;
      } else {
        s = "womp womp womp incorrect. you have " + (i-1) + " tries remaining.";
        System.out.println(s);
      }
    } // for loop
    word1.clear();
    s = "\nYou ran out of tries sad face :( now you have to try again";
    System.out.println(s);
    stand();
  } // word 1

  public static void word2() {
    String s;

    for (int i = 3; i > 0; i --) {
      choice = (scanner.nextLine()).toLowerCase();

      if (choice.equals("memory")) {
        s = "Congratulations! You unscrambled 'memory' correctly. Onwards! ";
        System.out.println(s);
        return;
      } else {
        s = "womp womp womp incorrect. you have " + (i-1) + " tries remaining.";
        System.out.println(s);
      }
    } // for loop
    word1.clear();
    word2.clear();
    s = "\nYou ran out of tries sad face :( now you have to try again";
    System.out.println(s);
    stand();
  } // word 2

  public static void word3() {
    String s;

    for (int i = 3; i > 0; i --) {
      choice = (scanner.nextLine()).toLowerCase();

      if (choice.equals("programming")) {
        s = "Congratulations! You unscrambled 'programming' correctly. Onwards! ";
        System.out.println(s);
        return;
      } else {
        s = "womp womp womp incorrect. you have " + (i - 1) + " tries remaining.";
        System.out.println(s);
      }
    } // for loop
    word1.clear();
    word2.clear();
    word3.clear();
    s = "\nYou ran out of tries sad face :( now you have to try again";
    System.out.println(s);
    stand();
  } // word 3

  public static void word4() {
    String s;

    for (int i = 3; i > 0; i --) {
      choice = (scanner.nextLine()).toLowerCase();

      if (choice.equals("concatenation")) {
        s = "Congratulations! You unscrambled 'concatenation' correctly. That was the last word! ";
        System.out.println(s);
        return;
      } else {
        s = "womp womp womp incorrect. you have " + (i - 1) + " tries remaining.";
        System.out.println(s);
      }
    } // for loop
    word1.clear();
    word2.clear();
    word3.clear();
    word4.clear();
    s = "\nYou ran out of tries sad face :( now you have to try again";
    System.out.println(s);
    stand();
  } // word 4

  public static void recieveWheat() {
    String s;
    s = "Here is the wheat as promised :)";
    System.out.println(s);
    inventory.add("wheat");
  } // receive wheat

  public static ArrayList<String> randomize(ArrayList<String> a) {
    ArrayList<String> output = new ArrayList<String>();
    for( String o : a )
      output.add( o );
    for (int i=a.size(); i>0; i--) {
      int randIndex = (int) (Math.random()*i);
      output.add(output.get(randIndex));
      output.remove(randIndex);
    }

    return output;
  } // randomize

  public static void leave() {
    String s;
    s = TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================\n" + TerminallyIll.color(37,TerminallyIll.background(30));
    s += "\nYou have decided to leave the Farmer's Stand. \n";
    s += TerminallyIll.color(30, TerminallyIll.background(36)) + "\nWhere would you like to go?" + TerminallyIll.color(37, TerminallyIll.background(30));
    s += "\n\n\t1: View Inventory \n";
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
