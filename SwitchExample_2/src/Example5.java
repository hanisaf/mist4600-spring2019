import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// Read two words and then print in alphabetical order.
		// Assume the words are lowercase
		// you will need to use the compareTo method in String
		
		Scanner scnr = new Scanner(System.in);
		String firstString;
		String secondString;
		firstString = scnr.next();
		secondString = scnr.next();

		/* Your solution goes here */
		
		int compare = firstString.compareTo(secondString);
		String output = "";
		//using if
		if(compare < 0)
			output = firstString + " " + secondString;
		else
			output = secondString + " " + firstString;
		//using conditoinal expression
		output = compare < 0 ? firstString + " " + secondString :  secondString + " " + firstString;
		
		System.out.println(output);
	}

}
