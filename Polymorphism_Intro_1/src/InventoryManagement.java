public class InventoryManagement {
	
	public static void refreshItem(Item item) {
		System.out.print("Processing ");
		item.printItem();
		if (item.getQuantity() < 5)
			System.out.println("Ordering more");
		else
			System.out.println("There is enough stock");
//		if(item.getQuantity() < 5)
//			System.out.println("Order more of " + item.getName());
//		else
//			System.out.println("There is enough stock of " + item.getName());
	}
	
//	public static void refreshItem(GroceryItem item) {
//		if(item.getQuantity() < 5)
//			System.out.println("Order more of " + item.getName());
//		else
//			System.out.println("There is enough stock of " + item.getName());
//	}
	
//	public static void refreshItem(ImportedItem item) {
//		if(item.getQuantity() < 5)
//			System.out.println("Order more of " + item.getName());
//		else
//			System.out.println("There is enough stock of " + item.getName());
//	}
}











