import java.util.Scanner;

public class Example3 {
	
	//TODO refactor the business logic from main to this method
	
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

	/**
	 * Converts numbers 1, 2, 3, 4, 5 into
	 * first, second, third, fourth, and fifth respectively
	 * @param number the integer to be converted
	 * @return the ordinal string if number is within range, "NA" otherwise
	 */
	public String convertNumberToOrder(int number) {
		String result;
		switch(number) {
		case 1:
			result = "first";
			break;
		case 2:
			result = "second";
			break;
		case 3:
			result = "third";
			break;
		case 4:
			result = "fourth";
			break;
		case 5:
			result = "fifth";
			break;
		default:
			result = "NA";
			break;
		}
		return result;
		
		//or alternatively
//		int i = number;
//		String order = i==1?"first":i==2?"second":i==3?"third":i==4?"fourth":i==5?"fifth":"NA";
//		return order;
	}
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int persons;
		
		Example3 ex = new Example3(); //to call the method
		
		System.out.print("How many people do you want to process (1-5) ? ");
		persons = scnr.nextInt();
		
		if(persons >= 1 && persons <=5) {
			double totalTax = 0.0;
			for(int i = 1; i<=persons; i++) {
				String order = ex.convertNumberToOrder(i);
				System.out.print("What is the income of the " + order + " person? ");
				int income = 0;
				while( (income =scnr.nextInt())<0) { //refuse negative input
					System.out.print("Sorry income can't be negative. Please enter a valid value: ");
				}
				
				double tax = ex.calculateTax(income);
				
				System.out.println("The income tax of the " + order + " person is $" + tax);
				totalTax += tax;
			}
			System.out.println("The total tax for everyone is $" + totalTax);
		} else
			System.out.println("Sorry, I can't process that many people");
		
	}

}
