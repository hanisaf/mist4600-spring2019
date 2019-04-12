
public class GroceryItem extends Item {
//	private String itemName;
//	private int itemQuantity;
	private String expiration;
	
//	public void setName(String newName) {
//		itemName = newName;
//	}
//
//	public void setQuantity(int newQty) {
//		itemQuantity = newQty;
//	}

	public void setExpiration(String newExpDate) {
	   expiration = newExpDate;
	}
	
	
	@Override
	public void printItem() {
		//System.out.println(itemName + " / " + itemQuantity);
		super.printItem();
		System.out.println( "\texpires on " + expiration);
	}
}
