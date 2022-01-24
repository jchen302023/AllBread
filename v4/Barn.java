
import java.util.Scanner;
import java.util.ArrayList;

public class Barn extends Location{

  static Scanner scanner = new Scanner(System.in);

  public static void barn() {
    String s;
    s = TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================\n" + TerminallyIll.color(37,TerminallyIll.background(30));
    s += "                            +&-\n";
    s += "                           _.-^-._    .--.\n";
    s += "                        .-'   _   '-. |__|\n";
    s += "                       /     |_|     \\|  |\n";
    s += "                      /               \\  |\n";
    s += "                     /|     _____     |\\ |\n";
    s += "                      |    |==|==|    |  |\n";
    s += "  |---|---|---|---|---|    |--|--|    |  |\n";
    s += "  |---|---|---|---|---|    |==|==|    |  |\n";
    s += "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n";
    s += "\nYou are at the Trusty Barn now.\n";
    s += "\nThere an assortment of colors, sounds, and smells.\n";
    s += "\nHere you can collect the eggs and milk for your cake.\n";
    s += "\nTalk to farmer Shawn for more details.\n";

    s += TerminallyIll.color(30, TerminallyIll.background(36)) + "\nWhat would you like to do?" + TerminallyIll.color(37, TerminallyIll.background(30));
    s += "\n\n\t1: View Inventory \n";
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
    s = TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================\n" + TerminallyIll.color(37,TerminallyIll.background(30));
    s += "\nHey ya'll. My name is Shawn.\n";
    s += "\nI have the milk and eggs ready for you\n";
    s += "\nBUT FIRST complete this task for me.\n\n";

    s += "\nYou MUST crack this terrible combination lock for me\n";
    s += "\nJust yesterday, a chicken pecked at ALLLLLL of my brain cells.\n";
    s += "\nHelp a poor fellow out.";

    System.out.println(s);
  }

  public static void crackTheCode() {
    String s;
    s = "\nLike farmer Shawn pointed out, our task is to break this lock. \n";
    s += "\nAll we know is that the combination is a three-digit number. \n";
    s += "\nThe closer you get to the number, the warmer you'll be. \n";
    s += "\nYou have a limited number of guesses so guess wisely! \n";
    s += "\nMay the force be with you. #farmerstrong #starwarsfan4life \n";
    System.out.println(s);

    int randInt = 111 + (int) (Math.random()*898);
    int guesses = 20;

    while(guesses > 0) {
      int userGuess = Integer.parseInt(scanner.nextLine());
      System.out.println("You have guessed: "+userGuess);
      if (userGuess == randInt) {
        System.out.println("Good job my lil kitten, you have cracked the code!");
        addEggsAndMilk();
        break;
      }
      else if (Math.abs(randInt - userGuess) < 5) {
        System.out.println(TerminallyIll.color(31, TerminallyIll.background(30)) + "You are approximately 5,778 K right now (that's as hot as the sun!)" + TerminallyIll.color(37,TerminallyIll.background(30)));
      }
      else if (Math.abs(randInt - userGuess) < 15) {
        System.out.println(TerminallyIll.color(31, TerminallyIll.background(30)) + "AHHHHHHH. YOU'RE BOILING!" + TerminallyIll.color(37,TerminallyIll.background(30)));
      }
      else if (Math.abs(randInt - userGuess) < 50) {
        System.out.println("mmmmmmm Feels like a toasty toaster. Keep guessing!");
      }
      else if (Math.abs(randInt - userGuess) < 100) {
        System.out.println("I can see the light. You are lukewarm");
      }
      else if (Math.abs(randInt - userGuess) < 200) {
        System.out.println("Ah yes, I too love to have hope. You are at room temperature. Like the crab cakes fresh from the freezer");
      }
      else if (Math.abs(randInt - userGuess) < 300) {
        System.out.println("brrrrrrrr I feel like the ice in my water crunchyyy");
      }
      else if (Math.abs(randInt - userGuess) < 449) {
        System.out.println("I feel the frostbite coming over my fingers. You have missed the mark");
      }
      else if (userGuess < 101 || userGuess > 999) {
        System.out.println("uhhhh that's a three-digit number. math class anyone?");
      }
      guesses--;
      System.out.println("You have "+guesses+" guesses remaining. \n");
    }
  }

  public static void addEggsAndMilk() {
    System.out.println("\nCongratulations are in order.\n");
    System.out.println("The eggs and milk have been added to your inventory. Enjoy!");
    inventory.add("eggs");
    inventory.add("milk");
    leave();
  }

  public static void leave() {
    String s;
    s = TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================\n" + TerminallyIll.color(37,TerminallyIll.background(30));
    s += "\nYou have decided to leave the Barn. \n";
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
      FarmerStand.stand();
    } // choice 3
    else if (choice.equals("4")) {
      ConvenienceStore.store();
    } // choice 4
    else if (choice.equals("5")) {
      barn();
    } // choice 5
    else if (choice.equals("6")) {
      Bakery.bakery();
    } // choice 6
    else if (choice.equals("7")) {
      Home.home();
    } // choice 7
  } // leave


} // RoseGarden
