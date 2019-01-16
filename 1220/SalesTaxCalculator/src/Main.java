import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	      /* Type your code here. */
	      double price;
	      double total;      
	      
	      
	      Scanner keyboard = new Scanner(System.in);
	      
	      System.out.print("Enter item price $");
	      price = keyboard.nextDouble();
	      total = price + price*0.07;
	      System.out.print("Sales price is $");
	      System.out.println(total);
	}

}
