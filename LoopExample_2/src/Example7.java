import java.util.Scanner;

/* Manual controller for traffic light */
public class Example7 {
   // enum type declaration occurs outside the main method
   public enum LightState {RED, GREEN, YELLOW}

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      LightState lightVal;
      String userCmd;
      
      lightVal = LightState.RED;
      //reading input
      char c = '-';
      while(c != 'R' && c != 'G' && c!= 'Y' ) {
          System.out.print("What is the state of the trafic light: (R)ed, (G)reen, or (Y)ellow? ");
          userCmd = scnr.nextLine();
          c = userCmd.toUpperCase().charAt(0);
      }

      switch(c) {
    	  case 'R':
    		  lightVal = LightState.RED;
    		  break;
    	  case 'G':
    		  lightVal = LightState.GREEN;
    		  break;
    	  case 'Y':
    		  lightVal = LightState.YELLOW;
      }
      
      //processing
      //imagine after 1,000,000 lines of code
      //which one is more readable?
      
      if(c == 'R')
    	  System.out.println("STOP!");
      
      if(lightVal == LightState.RED)
    	  System.out.println("STOP!");


      System.out.println("Quit program.");
   }
}