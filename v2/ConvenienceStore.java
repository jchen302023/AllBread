import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class ConvenienceStore extends Location{

    static Scanner scanner = new Scanner(System.in);

  public static void store(){
    String s;
    s = "\n==============================\n";
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
    s = "\n==============================\n";
    s += "\nHey little buddy, I'm Iven.\n";
    s += "\nI want to give something to a special someone...\n";
    s += "\nDo you by chance have a flower on you?\n";
    s += "\nI can give you some sugar for your troubles. \n\n";
    s += "\n\t1: Give Iven a rose \n";
    s += "\t2: Exit conversation like the introvert you are \n";
    System.out.print(s);

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
      if ((inventory.get(i)).compareTo("rose") == 0) {
        inventory.remove(i);
        inventory.add("sugar");
        exchangeHappened = true;
        break;
      }
    } // for

    if (exchangeHappened) {
      s = "\n==============================\n";
      s += "\nTYsm ilyyyy!! <3\n";
      s += "\nOops I didn't mean to say that... uh,,, thanks I guess\n";
      s += "\nHere's your sugar :))\n";
     // add sugar art
      System.out.print(s);
    }
    else {
      s = "\n==============================\n";
      s += "\nYou don't got no flower.";
      s += "\nI'm sad. ):";
    }

  }

  public static void leave() {

  }


} // ConvenienceStore
