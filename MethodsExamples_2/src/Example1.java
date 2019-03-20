
public class Example1 {

	public double calculateCountyTax(double price) {
		double tax = 0.0;
		double countyTaxRate = 0.01;
		tax = price * countyTaxRate;
		return tax;
		
	}
	
	public double calculateStateTax(double price) {
		double tax = 0.0;
		double stateTaxRate = 0.05;
		double countyTax = calculateCountyTax(price);
		tax = (price + countyTax) * stateTaxRate;
		return tax;
	}
	
	public double calculatePriceAfterTax(double price) {
		double tax = 0.0;
		double priceAfterTax = 0.0;
		tax = calculateStateTax(price);
		priceAfterTax = price + tax;
		return priceAfterTax;
	}
	
	public static void main(String[] args) {
		Example1 ex = new Example1();
		double price = 100;
		double totalPrice = 0.0;
		totalPrice = ex.calculatePriceAfterTax(price);
		
		System.out.println(totalPrice);
		
		

	}

}
