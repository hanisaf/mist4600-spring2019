//buongiorno, an Italian restaurant serves three dishes: Pizza, Pasta and Salad. 
//At the end of the day, the orders are entered to a program. 
//The program then calculates the number of Pizza, Pasta and Salad dishes.
//Modify the program below to store the orders in an array list. 

// a sample run:
// Input

// Pizza
// Pasta
// Salad
// done

// Output
// 1 1 1

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample3 {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner keyboard = new Scanner(System.in);
      
      //TODO declare and create the array list
      
      
      System.out.println("Please enter the the orders of today, enter done to exit : ");
      

      while(true) {
    	  	String order = keyboard.next();
    	  	if (order.equals("done")) {
    	  		break;
    	  	}
    	  	//TODO store order in the array list
    	  	
      }

      
      
      
      // calculate the number of Pizza, Pasta and Salad dishes
      int numPizza = 0;
      int numPasta = 0;
      int numSalad = 0;
      //loop over the array list to compute the counts
      //TODO what is the size of the arraylist? How many elements are there?
      int arraylistSize = -1;
      for(int i = 0; i<arraylistSize; i++) {
         //TODO get the currentDish from the arraylist
    	  String currentDish = "";
    	  switch(currentDish) {
    	  case "Pizza":
    		  numPizza++;
    		  break;
    	  case "Pasta":
    		  numPasta++;
    		  break;
    	  case "Salad":
    		  numSalad++;
    		  break;
    		  default:
    			  System.out.println("Quo Va Dis!?");
    		  
    	  }
    	  
      }
      System.out.print(numPizza + " " + numPasta + " " + numSalad);
   }
}
