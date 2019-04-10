
public class GroceryItem {
	private String itemName;
	private int itemQuantity;
	private String expirationDate;
	
	public void setName(String newName) {
		itemName = newName;
	}

	public void setQuantity(int newQty) {
		itemQuantity = newQty;
	}

	public void setExpiration(String newExpDate) {
		   expirationDate = newExpDate;
		}
	
	public void printItem() {
		System.out.println(itemName + " / " + itemQuantity);
		System.out.println( "\texpires on " + expirationDate);
	}
}
