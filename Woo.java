import java.io.*;
import java.util.*;

public class Woo{

//instance variables
private int cake;
private int wheat, egg, milk, sugar;
private int flower;

private boolean gameOver;

private InputStreamReader isr;
private BufferedReader input;

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
  s = "==== Welcome little cat :3 ====\n";
  s += "You are on a mission. Today is your grandma's bithday!!\n";
  s += "And you, her favorite little kitten, FORGOR!!! OH NO!!!\n";
  s += "BUT FRET NOT. YOUR LOCAL MERCHANTS HAVE YOUR BACK!!!\n";
  s += "Collect the necessary ingredients, bake the cake, and\n";
  s += "deliver it to GrandmaCat before the day ends.\n";
  s += "Get going now my little kitten :)\n";
  System.out.print (s);
  //etc etc

}

public static void main( String[] args){
  Woo game = new Woo();
}

}
