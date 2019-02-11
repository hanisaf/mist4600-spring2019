import java.util.Scanner;

/**
 * Caculate income tax using IRS 2018 guidlines
 * https://www.nerdwallet.com/blog/taxes/federal-income-tax-brackets/
 * @author hanisaf
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int income;
		String taxOwed; //for now output a string corresponding to the table on the slide
		
		System.out.println("Hello, in this world nothing can be said to be certain, except death and taxes");
		System.out.print("Enter your yearly income (rounded to dollar): ");
		income = scnr.nextInt();
		
		//check against the table in the slide and print the corresponding tax owed
		// start working here

	}

}
