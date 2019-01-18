import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        double price;
        double total;      
        Scanner keyboard = new Scanner(System.in); //keyboard
        String name;
        
        System.out.print("Enter item name: ");
        name = keyboard.nextLine();
        
        System.out.print("Enter item value: $");
        price = keyboard.nextDouble();
        total = price + price*0.07;
        
        System.out.print("The total price of " + name + " is $" + total);

	}

}
