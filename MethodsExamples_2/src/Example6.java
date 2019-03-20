import java.util.Scanner;

public class Example6 {
	
	//TODO refactor the business logic to implement the new tax method 
	
	/**
	 * This method calculates the federal income tax taking into account deductions and credits
	 * The rule is to subtract deductions from income before determining the tax,
	 * then subtracting credits from tax. However, if credits are more than tax,
	 * the result is zero, i.e., no refund
	 * @param income
	 * @param deductions
	 * @param credits
	 * @return tax
	 */
	public double calculateTax(int income, int deductions, int credits) {
		// the tax is (tax on income - deductions) - credits; can't be negative
		double tax;
		income = income - deductions;
		if(income < 0) income = 0;
		
		tax = calculateTax(income);
		
		tax = tax - credits;
		if(tax < 0) tax = 0;
		
		return tax;
	}
	
	/**
	 * This method calculates the federal income tax
	 * for individual tax filers using 2018 tax brackets
	 * https://www.nerdwallet.com/blog/taxes/federal-income-tax-brackets
	 * @param income the income of the individual filer, rounded to the nearest dollar
	 * @return the federal income tax
	 */
	public double calculateTax(int income) {
		double tax;
		if(income <= 9525)
			tax = income * 0.1;
		else if(income <= 38700)
			tax = 952.50 + 0.12 * (income - 9525);
		else if(income <= 82500)
			tax = 4453.50 + 0.22 * (income - 38700);
		else if(income <= 157500)
			tax = 14089.50 + 0.24 * (income - 82500);
		else if(income <= 200000)
			tax = 32089.50 + 0.32 * (income - 157500);
		else if(income <= 500000)
			tax = 45689.50 + 0.35 * (income - 200000);
		else
			tax = 150689.50 + 0.37 * (income - 500000);
		return tax;
	}

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		Example6 ex = new Example6(); 
		
		int income, deductions, credits;
		double tax;
		
		System.out.print("Please enter income, deductions, and credits: ");
		income = scnr.nextInt();
		deductions = scnr.nextInt();
		credits = scnr.nextInt();
		
		tax = ex.calculateTax(income, deductions, credits);
		System.out.println("Tax is $" + tax);
						
		
	}

}
