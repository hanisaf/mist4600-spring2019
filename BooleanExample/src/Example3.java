import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int income, age, creditScore;
		System.out.print("Enter applicant income:  ");
		income = scnr.nextInt();
		System.out.print("Enter applicant age: ");
		age = scnr.nextInt();
		System.out.println("enter applicant credit score: ");
		creditScore = scnr.nextInt();
		
		String decision;
		
		//declare three boolean variables
		// isLowIncome, isYoung, and isLowCreditScore
		// assign values to them based on input
		// and use them in the conditions below
		
		if(income < 30000) {
			if(age < 25) {
				decision = "not on-time";
			} else {
				decision = "on-time";
			}
		} else {
			if(creditScore < 600) {
				decision = "not on-time";
			} else {
				decision = "on-time";
			}
		}
		
		System.out.println("The decision is: " + decision);
		
		
	}

}
