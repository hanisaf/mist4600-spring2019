import java.util.Scanner;

public class IncomeTaxCalculator {

	
	public static double calculateTax(double income) {
		double tax;
		if (income <= 9525)
			tax = income * 0.1;
		else if (income <= 38700)
			tax = 952.50 + 0.12 * (income - 9525);
		else if (income <= 82500)
			tax = 4453.50 + 0.22 * (income - 38700);
		else if (income <= 157500)
			tax = 14089.50 + 0.24 * (income - 82500);
		else if (income <= 200000)
			tax = 32089.50 + 0.32 * (income - 157500);
		else if (income <= 500000)
			tax = 45689.50 + 0.35 * (income - 200000);
		else
			tax = 150689.50 + 0.37 * (income - 500000);
		return tax;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter income $");
		int income = scnr.nextInt();
		if(income < 0) { // refuse negative input
			System.out.print("Sorry income can't be negative.");
		} else {
			double tax = calculateTax(income);
			System.out.println("The income is $" + tax);
		}
	}

}
