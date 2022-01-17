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
  Home();

} // newGame

public void Home() {
  String s;
  s = "\n==============================\n";
  s += "\nYou are at home right now.\n";
  s += "What would you like to do?\n";
  s += "\t1: View Inventory \n";
  s += "\t2: Exit House \n";

  System.out.print (s);
  try {
     choice = Integer.parseInt( input.readLine() );
   }
   catch ( IOException e ) { }

  if (choice == 1) {
    Inventory();
    Home();
  } // picking choice 1

} // home

public void Inventory() {
  String luv4cat = "Love from GrandmaCat";
  inventory.add(luv4cat);
  System.out.println("\nInventory:\n");
  System.out.println(inventory);
} // inventory

public static void main( String[] args){
  Woo game = new Woo();
}

}
