import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        double price1, price2;
        double total;      
        Scanner keyboard = new Scanner(System.in); //keyboard
        String name1, name2;
        
        System.out.print("Enter item 1 name: ");
        name1 = keyboard.nextLine();
        
        System.out.print("Enter item 1 value: $");
        price1 = keyboard.nextDouble();
        
        keyboard.nextLine(); //consume the new line
        
        System.out.print("Enter item 2 name: ");
        name2 = keyboard.nextLine();
        
        System.out.print("Enter item 2 value: $");
        price2 = keyboard.nextDouble();
        
        double price = price1 + price2;
        
        total = price + price*0.07;
        
        System.out.print("The total price of " + name1 + " and " + name2 + " is $" + total);

	}

}
