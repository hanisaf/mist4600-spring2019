public class ImportedItem extends Item {
	private String countryOfOrigin;
	
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	@Override
	public void printItem() {
		super.printItem();
		System.out.println("\t imported from " + countryOfOrigin);
	}
}
