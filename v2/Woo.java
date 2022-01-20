import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Woo{

  //instance variables
  private int choice;
  private Scanner scanner = new Scanner(System.in);
  private static ArrayList<String> inventory;
  // private static boolean gotCake;

  //default constructor
  public Woo(){
    inventory = new ArrayList<String>();
    // gotCake = false;
    newGame();
  }

// Accessor Methods
  public static ArrayList<String> getInventory() { return inventory; }
  // public static boolean getGotCake() { return gotCake; }

  //methods
  public void newGame(){
    String s;
    //intro
    s = "\n==== Welcome little cat :3 ====\n";
    s += "\n You are on a mission. Today is your grandma's birthday!!\n";
    s += "And you, her favorite little kitten, FORGOR!!! OH NO!!!\n";
    s += "\nBUT FRET NOT. YOUR LOCAL MERCHANTS HAVE YOUR BACK!!!\n";
    s += "\nCollect the necessary ingredients, bake the cake, and\n";
    s += "deliver it to GrandmaCat before the day ends.\n";
    s += "\nGet going now my little kitten :)\n";
    s += "\n      |\\      _,,,---,,_\n";
    s += "ZZZzz /,`.-'`'    -.  ;-;;,_\n";
    s += "     |,4-  ) )-,_. ,\\ (  `'-'\n";
    s += "    '---''(_/--'  `-'\\_)   \n";

    System.out.print (s);
    //etc etc
    Home.home();

  } // newGame

  public static void main( String[] args){
    Woo game = new Woo();

  }

}
