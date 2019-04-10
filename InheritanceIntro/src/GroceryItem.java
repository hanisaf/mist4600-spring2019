
public class GroceryItem {
	private String itemName;
	private int itemQuantity;
	private String expirationDate;
	
	public void setName(String newName) {
		itemName = newName;
		return;
	}

	public void setExpiration(String newExpDate) {
		   expirationDate = newExpDate;
		}
	
	public void setQuantity(int newQty) {
		itemQuantity = newQty;
		return;
	}

	public void printItem() {
		System.out.println(itemName + " " + itemQuantity + " " + expirationDate);
		return;
	}
}
