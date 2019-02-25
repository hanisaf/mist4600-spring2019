import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// Write a program that prompts the user to enter numbers
		// The user keeps entering numbers and uses a negative number to stop
		// Then the program calculates and displays the sum, mean, min and max values of these numbers
		
		Scanner scnr = new Scanner(System.in);
		
//		for(double number = 0; number >= 0; number = scnr.nextDouble()) {
//			System.out.print("Enter numbers, a negative number to exit: ");
//		}
		double sum = 0.0;
		
		double number = 0;
		while(number >= 0) {
			System.out.print("Enter numbers, a negative number to exit: ");
			number = scnr.nextDouble();
			sum = sum + number;
		}
		System.out.println(sum);
		
	}

}
