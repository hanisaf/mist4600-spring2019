
public class Accounting {

	public double calculateTax(Taxable thing) {
		double tax = thing.getPrice() * thing.getRate();
		return tax;
	}
//	public double calculateTax(House house) {
//		double tax = house.getValue() * house.getPropertyTaxRate();
//		return tax;
//	}
//	
//	public double calculateTax(Vehicle vehicle) {
//		double tax = vehicle.getPrice() * vehicle.getSalesTaxRate();
//		return tax;		
//	}
}
