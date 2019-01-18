import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        // The purpose of this program is .. . .
		
		String name1, name2;
        double price1, price2;
        //String name2;
        //double price2;
        
        double total;      
        Scanner keyboard = new Scanner(System.in); //keyboard
        
        System.out.print("Enter item 1 name: ");
        name1 = keyboard.nextLine();
        
        System.out.print("Enter item 1 value: $");
        price1 = keyboard.nextDouble();
        
        keyboard.nextLine();
        
        System.out.print("Enter item 2 name: ");
        name2 = keyboard.nextLine();
        
        System.out.print("Enter item 2 value: $");
        price2 = keyboard.nextDouble();        
        
        double price = price1 + price2;
        total = price + price*0.07;
        
        System.out.print(
        		//"The total price of " + name1 + " and _ is $_"
        		"The total price of " + name1 + " and " + name2 + " is $" + total
        		);

	}

}
