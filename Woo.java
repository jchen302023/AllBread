import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Woo{

  //instance variables
  private int cake;
  private int wheat, egg, milk, sugar;
  private int flower;
  ArrayList<String> inventory = new ArrayList<String>();

  private boolean gameOver;

  private InputStreamReader isr;
  private BufferedReader input;
  private int choice;

  //default constructor
  public Woo(){
    cake = 0;
    wheat = 0;
    egg = 0;
    milk = 0;
    sugar = 0;
    flower = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    input = new BufferedReader( isr );
    newGame();
  }

  //methods
  public void newGame(){
    String s;
    //intro
    s = "\n==== Welcome little cat :3 ====\n";
    s += "You are on a mission. Today is your grandma's bithday!!\n";
    s += "And you, her favorite little kitten, FORGOR!!! OH NO!!!\n";
    s += "BUT FRET NOT. YOUR LOCAL MERCHANTS HAVE YOUR BACK!!!\n";
    s += "Collect the necessary ingredients, bake the cake, and\n";
    s += "deliver it to GrandmaCat before the day ends.\n";
    s += "Get going now my little kitten :)\n";

    System.out.print (s);
    //etc etc
    this.home();

  } // newGame

  public void home() {
    String s;
    s = "\n==============================\n";
    s += "\nYou are at home now.\n";
    s += "What would you like to do?\n";
    s += "\t1: View Inventory \n";
    s += "\t2: Exit House \n";
    System.out.print(s);

    try {
       choice = Integer.parseInt( input.readLine() );
    }
    catch ( IOException e ) {}

    if (choice == 1) {
      this.inventory();
      this.home();
    } // picking choice 1
    else if (choice == 2){
      this.leaveHome();
    }

  } // home

  public void inventory() {
    System.out.println("\n==============================\n");
    System.out.println("Inventory:\n");
    if (inventory.size() == 0) {
      System.out.println("Love from GrandmaCat");
    } else {
      for (int i=0; i<inventory.size(); i++) {
        System.out.println("You have "+inventory.get(i));
      }
    }
  } // inventory

  public void leaveHome() {
    String s;
    s = "\n==============================\n";
    s += "You have chosen to leave your humble abode. \n";
    s += "Where would you like to go? \n";
    s += "\t1: View Inventory \n";
    s += "\t2: The Rose Garden \n";
    s += "\t3: The Farmers Stand \n";
    s += "\t4: The Convenience Store \n";
    s += "\t5: The Barn \n";
    s += "\t6: The Bakery \n";
    s += "\t7: Back to my humble abode \n";
    System.out.println(s);

    try {
       choice = Integer.parseInt( input.readLine() );
    }
    catch ( IOException e ) {}

    if (choice == 1) {
      this.inventory();
      this.leaveHome();
    } // choice 1
    else if (choice == 2) {
      roseGarden();
    } // choice 2
    // else if (choice == 3) {
    //   roseGarden();
    // }
    // else if (choice == 2) {
    //   roseGarden();
    // }
    // else if (choice == 2) {
    //   roseGarden();
    // }
    // else if (choice == 2) {
    //   roseGarden();
    // }
    else if (choice == 7) {
      home();
    }
  }

  public static void main( String[] args){
    Woo game = new Woo();
  }

}
