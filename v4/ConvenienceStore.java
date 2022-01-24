
import java.util.Scanner;
import java.util.ArrayList;

public class ConvenienceStore extends Location{

  static Scanner scanner = new Scanner(System.in);

  public static void store(){
    String s;
    s = TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================\n" + TerminallyIll.color(40,37);
    s += "\nYou have arrived at the Convenience Store. \n";
    s += "What would you like to do?\n";
    s += "\n\t1: View Inventory \n";
    s += "\t2: Talk to Iven \n";
    s += "\t3: Exit Convenience Store \n";
    System.out.print(s);

    choice = (scanner.nextLine());

    if (choice.equals("1")) {
      inventory();
      store();
    } // picking choice 1
    else if (choice.equals("2")){
      talkToIven();
      store();
    } // choice 2
    else if (choice.equals("3")) {
      leave();
    } // choice 3

  } // store

  public static void talkToIven() {
    String s;
    s = TerminallyIll.color(32, 32) + "\n==============================\n" + TerminallyIll.color(40,37);
    s += "\nHey little buddy, I'm Iven.\n";
    s += "\nI want to give something to a special someone...\n";
    s += "\nBut I am still on my shift...\n";
    s += "\nDo you by chance have flowers on you?\n";
    s += "\nI can give you some sugar for your troubles. \n";
    s += "\n\t1: Give Iven roses\n";
    s += "\t2: Exit conversation like the introvert you are \n";
    System.out.print(s);

    choice = (scanner.nextLine());

    if (choice.equals("1")) {
      exchange();
    } // picking choice 1
    else if (choice.equals("2")){
      System.out.println("You felt a little awkward and decided to back away from the register");
      store();
    } // choice 2


  } // talkToBarney

  public static void exchange() {

    String s;
    boolean exchangeHappened = false;

    for (int i = 0; i < inventory.size(); i ++) {
      if ((inventory.get(i)).compareTo("roses") == 0) {
        inventory.remove(i);
        inventory.add("sugar");
        exchangeHappened = true;
        break;
      }
    } // for

    if (exchangeHappened) {
      s = TerminallyIll.color(32, 32) + "\n==============================\n" + TerminallyIll.color(40,37);
      s += "\nTYsm ilyyyy!! <3\n";
      s += "\nOops I didn't mean to say that... uh,,, thanks I guess\n";
      s += "\nHere's your sugar :))\n";
      s += "\nSugar added to inventory\n";
     // add sugar art
      System.out.print(s);
    }
    else {
      s = TerminallyIll.color(32, 32) + "\n==============================\n" + TerminallyIll.color(40,37);
      s += "\nYou don't got no flowers.";
      s += "\nI'm sad. ):\n";
      System.out.print(s);
    }

  } // exchange

  public static void leave() {
    String s;
    s = TerminallyIll.color(32, 32) + "\n==============================\n" + TerminallyIll.color(40,37);
    s += "\nYou have decided to leave the Convenience Store. \n";
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
      FarmerStand.stand();
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


} // ConvenienceStore
