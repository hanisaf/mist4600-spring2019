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
		
		if (age >= DRINK_AGE) { //if true
			//do statements
			System.out.println("Serving " + drink);
			System.out.println("Have a good day!");
		} else { //if false
			System.out.println("Sorry, we don't serve clients younger than " + DRINK_AGE + " years");
		}
		
		System.out.println("THE END");
	}

}