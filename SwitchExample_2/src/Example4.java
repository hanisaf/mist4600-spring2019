import java.util.Scanner;

//Write a switch statement that checks nextChoice. 
//If 0, print "Rock". If 1, print "Paper". If 2, print "Scissors". 
//For any other value, print "Unknown". End with newline.

public class Example4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int nextChoice;

		nextChoice = scnr.nextInt();

		/* Your solution goes here */
		String output = "";
//		switch(nextChoice) {
//		case 0:
//			output = "Rock";
//			break;
//		case 1:
//			output = "Paper";
//			break;
//		case 2:
//			output = "Scissors";
//			break;
//		default:
//			output = "Unknown";
//		}
		
		//output = "Rock" or "Paper" or "Scissors" or "Unkown" depending on nextChoice'
		//output = condition? value if true : value if false;
		
		output = (nextChoice == 0) ? "Rock": "Not a rock";
		output = (nextChoice == 1) ? "Paper": "Not a paper";
		output = (nextChoice == 2) ? "Scissors": "Unknown";
		// bravehearts combine the three above statements in one statement
		output = (nextChoice == 0) ? "Rock": (nextChoice == 1) ? "Paper": (nextChoice == 2) ? "Scissors": "Unknown";
		System.out.println(output);
		
	}

}
