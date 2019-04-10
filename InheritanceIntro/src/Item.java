public class Item {

	private String itemName;
	private int itemQuantity;
	
	public void setName(String newName) {
		itemName = newName;
		return;
	}

	public void setQuantity(int newQty) {
		itemQuantity = newQty;
		return;
	}

	public void printItem() {
		System.out.println(itemName + " / " + itemQuantity);
		return;
	}

}