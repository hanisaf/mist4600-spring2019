public class ImportedItem extends Item {
	private String countryOfOrigin;
	
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	@Override
	public void printItem() {
//		super.printItem();
//		System.out.println("\t imported from " + countryOfOrigin);
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		String firstPart = super.toString();
		return firstPart + "\t imported from " + countryOfOrigin;
	}
}
