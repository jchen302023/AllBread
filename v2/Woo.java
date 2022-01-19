import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Woo{

  //instance variables

  // private InputStreamReader isr;
  // private BufferedReader input;
  private int choice;
  private Scanner scanner = new Scanner(System.in);
  private static ArrayList<String> inventory;

  //default constructor
  public Woo(){
    inventory = new ArrayList<String>();
    boolean gameOver = false;
    // isr = new InputStreamReader( System.in );
    // input = new BufferedReader( isr );

    newGame();
  }

  public static ArrayList<String> getInventory() { return inventory; }

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
