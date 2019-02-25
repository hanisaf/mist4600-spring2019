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
		double mean;
		double number = 0;
		double max=0.0;
		double min=Double.MAX_VALUE;
		int count = 0;
		while(true) {
			System.out.print("Enter numbers, a negative number to exit: ");
			number = scnr.nextDouble();
			if(number < 0)
				break;
			count = count + 1;
			sum = sum + number;
			
			if(number > max) 
				max=number;
//			max = Math.max(number, max);
			
			if(number < min)
				min = number;
//			max = Math.min(number, min);			
			
		}
		mean = sum / count;
		System.out.println("sum = " + sum + ", mean = " + mean + ", min = " + min + " , max = " + max);	
		
	}

}
