import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Home extends Location{
  public static void home() {
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
    } // picking choice 1
    else if (choice == 2){
      this.leaveHome();
    }
  }
}
