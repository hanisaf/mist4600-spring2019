//RetirementCalculator
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
public class Main {

	public static void main(String[] args) {
		//input 
		int userAge, retirementAge, retirementYear;
		double retirementMoney;
		int savingsPerYear;
		Scanner keyboard = new Scanner(System.in);
		final int CURRENT_YEAR = 2019;
		
		System.out.print("What is your current age? ");
		userAge = keyboard.nextInt();
		System.out.print("At what age would you like to retire? ");
		retirementAge = keyboard.nextInt();
		System.out.print("How much money do you need for retirement? ");
		retirementMoney = keyboard.nextDouble();
		
		int yearsLeft = retirementAge - userAge;
		retirementYear = CURRENT_YEAR + yearsLeft;
		savingsPerYear = (int) retirementMoney / yearsLeft;
		
		//output
		System.out.println();
		System.out.println("You have " + yearsLeft + " years left until you can retire.");
		System.out.println("It's " + CURRENT_YEAR + ", so you can retire in " + retirementYear);
		System.out.println("You need to save $"+ savingsPerYear + " per year.");

	}

}
