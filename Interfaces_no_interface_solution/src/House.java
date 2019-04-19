
public class House extends Asset {
	private int streetNumber;
	private String streetName;
	private String city;
	
	private double value;
	private double propertyTaxRate;
	
	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return streetNumber + " " + streetName + ", " + city + " GA";
	}

	public String toString() {
		return this.getAddress();
	}
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
		this.price = value;
	}

	public double getPropertyTaxRate() {
		return propertyTaxRate;
	}

	public void setPropertyTaxRate(double propertyTaxRate) {
		this.propertyTaxRate = propertyTaxRate;
		this.rate = propertyTaxRate;
	}
	
}
