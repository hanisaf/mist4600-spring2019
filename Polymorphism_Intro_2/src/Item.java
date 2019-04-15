public class Item {

	protected String itemName;
	protected int itemQuantity;
	
	public void setName(String newName) {
		itemName = newName;
	}

	public void setQuantity(int newQty) {
		itemQuantity = newQty;
	}

	public String getName() {
		return itemName;
	}
	
	public int getQuantity() {
		return itemQuantity;
	}
	
	public void printItem() {
		String rep = this.toString();
		System.out.println(rep);
	}
	
	@Override
	public String toString() {
		return itemName + " / " + itemQuantity;
	}

}
