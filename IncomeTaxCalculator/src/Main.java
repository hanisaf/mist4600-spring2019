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
		if(income <= 9525)
			System.out.println("10% of taxable income");
		else if (income <= 38700)
			System.out.println("$952.50 plus 12% of the amount over $9,525");
		else if (income <= 82500) 
			System.out.println("$4,453.50 plus 22% of the amount over $38,700");
		else if (income <= 157500)
			System.out.println("$14,089.50 plus 24% of the amount over $82,500");
		else if (income <= 200000)
			System.out.println("$32,089.50 plus 32% of the amount over $157,500");
		else if (income <= 500000)
			System.out.println("$45,689.50 plus 35% of the amount over $200,000");
		else
			System.out.println("$150,689.50 plus 37% of the amount over $500,000");
	}

}
