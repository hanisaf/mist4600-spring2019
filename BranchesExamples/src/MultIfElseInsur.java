//Using sequential nature of multi-branch if-else for ranges: Insurance prices.

import java.util.Scanner;

public class MultIfElseInsur {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userAge;
      int insurancePrice;

      System.out.print("Enter your age: ");
      userAge = scnr.nextInt();

      if (userAge < 16) {                  // Age 15 and under
         System.out.println("Too young.");
         insurancePrice = 0;
      } 
//      else if (userAge < 25) {           // Age 16 - 24
//         insurancePrice = 4800;
//      }
//      else if (userAge < 40) {           // Age 25 - 39
//         insurancePrice = 2350;
//      }
      else {                              // Age 40 and up
         insurancePrice = 2100;
      }

      System.out.println("Annual price: $" + insurancePrice);
   }
}