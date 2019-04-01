import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> itemCounts; //declaration
		
		itemCounts = new ArrayList<Integer>(); //initialization, notice size is not needed
		System.out.println(itemCounts.isEmpty());
		itemCounts.add(122); //accessing, "write"
		itemCounts.add(119);
		itemCounts.add(117);
		
		System.out.println(itemCounts.get(1)); //accessing, "read"
		
		itemCounts.set(1, -119); //accessing, "modify"
		
		System.out.println(itemCounts.get(1));
		
		System.out.println(itemCounts.size());
		
		itemCounts.remove(1);
		
		int item = itemCounts.get(1);
		System.out.println(item);
		System.out.println(itemCounts.size());
		System.out.println(itemCounts.isEmpty());
		itemCounts.clear();
		System.out.println(itemCounts.isEmpty());
	}

}
