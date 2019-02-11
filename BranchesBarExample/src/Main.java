import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String drink;
		int age;
		final int DRINK_AGE = 21;
		
		System.out.print("Welcome to the bar, what would you like to drink? ");
		drink = scnr.nextLine();
		System.out.print("How old are you? ");
		age = scnr.nextInt();
		//depending on the age we would like to decide
		//whether to serve the drink or not
		System.out.println("Serving " + drink);
		System.out.println("Have a good day!");
		
		System.out.println("Sorry, we don't serve clients younger than " + DRINK_AGE + " years");
	}

}
