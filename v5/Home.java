import java.util.Scanner;
import java.util.ArrayList;

public class Home extends Location{

  static Scanner scanner = new Scanner(System.in);

  public static void home() {
    String s;
    s = TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================\n" + TerminallyIll.color(37,TerminallyIll.background(30));
    s += "    ____|| \n";
    s += "  /田  田 /\\\n";
    s += "  |__間__| |\n";
    s += "\nYou are at home now.";
    s += TerminallyIll.color(30, TerminallyIll.background(36)) + "\nWhat would you like to do?" + TerminallyIll.color(37, TerminallyIll.background(30));
    s += "\n\n\t1: View Inventory \n";
    s += "\t2: Talk to GrandmaCat \n";
    s += "\t3: Exit House \n";
    System.out.print(s);

    choice = (scanner.nextLine());

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
    String s;
    String requireCake = "cake";
    for (int i = 0; i < inventory.size(); i ++) {
      if ((inventory.get(i)).compareTo("cake") == 0) {
        s = "\nWell done my little kitten. This cake looks very poggers!!\n\n";
        s += "        /\\_____/\\\n";
        s += "       /  o   o  \\\n";
        s += "      ( ==  ^  == )\n";
        s += "       )         (\n";
        s += "      (           )\n";
        s += "     ( (  )   (  ) )\n";
        s += "    (__(__)___(__)__)\n";
        s += "\nGame over!!! <3";
        System.out.println(s);
        System.exit(0);
      } // if you have cake game ends
    }
      System.out.println(TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================" + TerminallyIll.color(37,TerminallyIll.background(30)));
      System.out.println("\nYou wish to talk to GrandmaCat");
      System.out.println("\nHowever, you do not have anything for GrandmaCat right now ):");
      System.out.println("\nYou should come back when you got something for GrandmaCat");
      home();
  } // talkToGrandma

  public static void leaveHome() {
    String s;
    s = TerminallyIll.color(32, TerminallyIll.background(30)) + "\n==============================\n"  + TerminallyIll.color(37,TerminallyIll.background(30));
    s += "\nYou have chosen to leave your humble abode. \n";
    s += TerminallyIll.color(30, TerminallyIll.background(36)) + "\nWhere would you like to go?" + TerminallyIll.color(37, TerminallyIll.background(30));
    s += "\n\n\t1: View Inventory \n";
    s += "\t2: The Rose Garden \n";
    s += "\t3: The Farmers Stand \n";
    s += "\t4: The Convenience Store \n";
    s += "\t5: The Barn \n";
    s += "\t6: The Bakery \n";
    s += "\t7: Back to my humble abode \n";
    System.out.println(s);

   choice = (scanner.nextLine());

   if (choice.equals("1")) {
     inventory();
     leaveHome();
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
    }
    else if (choice.equals("7")) {
      home();
    }

  } // leaveHome

}
