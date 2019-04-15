
public class GroceryItem extends Item {
	private String expiration;
	
	public void setExpiration(String newExpDate) {
	   expiration = newExpDate;
	}
	
	@Override
	public void printItem() {
//		super.printItem();
		
//		System.out.println( "\texpires on " + expiration);
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		String firstPart = super.toString();
		return firstPart +
				"\texpires on " + expiration;
	}
}
