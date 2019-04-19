
public class Vehicle {
	
	private String identifier;
	private String model;
	private int year;
	private static int count;
	
	private double price;
	private double salesTaxRate;
	
	public Vehicle() {
		identifier = "0000000";
		model = "N/A";
		year = 2019;
		count++;
	}
	
	public Vehicle(String identifier, String model, int year) {
		this();
		this.setIdentifier(identifier);
		this.setModel(model);
		this.setYear(year);
	}
	
	public static int getVehicleCount() {
		return count;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		if(identifier.length() == 7)
			this.identifier = identifier;
		else 
			System.out.println("Invalid vehicle identifier");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year >= 1954 && year <= 2019)
			this.year = year;
		else 
			System.out.println("Invalid production year");
	}

	public String toString() {
		return identifier+" is "+model+" "+ year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSalesTaxRate() {
		return salesTaxRate;
	}

	public void setSalesTaxRate(double salesTaxRate) {
		this.salesTaxRate = salesTaxRate;
	}
}
