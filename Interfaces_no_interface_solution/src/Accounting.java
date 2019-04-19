
public class Accounting {

	public double calculateTax(Asset asset) {
		double tax = asset.getPrice() * asset.getRate();
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
//		
//	}
}
