
public class Main {

	public static void main(String[] args) {
		Item item1 = new Item();
		item1.setName("Pencil");
		item1.setQuantity(10);
		
		Item item2 = new Item();
		item2.setName("Notepad");
		item2.setQuantity(3);
		
		item1.printItem();
		item2.printItem();
		
		// the store is expanding and will sell grocery items
		// modify Item to accommodate items with expiration date
		GroceryItem item3 = new GroceryItem();
		item3.setName("Apple");
		item3.setQuantity(5);
		item3.setExpiration("2017-11-11");
		item3.printItem();
			

	}

}
