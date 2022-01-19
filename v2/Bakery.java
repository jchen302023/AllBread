import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Bakery extends Location {

  static Scanner scanner = new Scanner(System.in);

  public static void bakery() {
    String s;
    s = "\n==============================\n";
    s += "    ____|| \n";
    s += "  /田  田 /\\\n";
    s += "  |__間__| |\n";
    s += "\nYou are at the Bakery now.\n";
    s += "\nThe BakerCat behind the counter warmly greets you\n";
    s += "What would you like to do?\n";
    s += "\t1: View Inventory \n";
    s += "\t2: Talk to BakerCat \n";
    s += "\t3: Exit Bakery \n";
    System.out.print(s);

    choice = scanner.nextLine();

    if (choice.equals("1")) {
      inventory();
    } // picking choice 1
    if (choice.equals("2")){
      talkToBaker();
    } // choice 2
    if (choice.equals("3")) {
    } // choice 3
      leave();
  } // Bakery

public static void talkToBaker() {
  int counter = 0;
  ArrayList<String> requireCake = new ArrayList<String>();
  requireCake.add("milk");
  requireCake.add("eggs");
  requireCake.add("sugar");
  requireCake.add("wheat");
  for (int i = 0; i < inventory.size(); i ++) {
    for (int h = 0; h < requireCake.size(); i ++) {
      if ((inventory.get(i)).compareTo(requireCake.get(h)) == 0) {
        counter += 1;
      }
    } // inner
  } // outer
  if (counter == 4) {
    recieveCake();
    leave();
  }
  else {
    String s;
    s = "\n==============================\n";
    s += "\nHmm... You do not seem to have all the ingredients\n";
    s += "\nBakerCat advises you to come back when you have them all\n";
    System.out.print(s);
  }
} // talkToBaker

public static void recieveCake() {
  String s;
  s = "\n==============================\n";
  s += "\nYou now have a cake!\n";
  s += "\nCake added to inventory\n";
  s += "\nBakerCat advises you to bring it to GrandmaCat while it is still warm\n";
  System.out.print(s);
  inventory.remove(0);
  inventory.remove(1);
  inventory.remove(2);
  inventory.remove(3);
  inventory.add("cake");

} // recieveCake

  public static void leave() {
    String s;
    s = "\n==============================\n";
    s += "You have been kicked out of the Bakery \n";
    s += "Where would you like to go? \n";
    s += "\t1: View Inventory \n";
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
     bakery();
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
    }
    else if (choice.equals("7")) {
      Home.home();
    }
  } // leave

} // Bakery
