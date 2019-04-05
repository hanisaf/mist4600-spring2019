import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<String, Integer> productReleases = new HashMap<String, Integer>();
		//productReleases.put
		productReleases.put("Model T Ford", 1908);
		productReleases.put("IBM Personal Computer", 1981);
		productReleases.put("Nintendo 64", 1996);
		productReleases.put("Java", 1996);
		//productReleases.put("Java", 1998);//updating
		productReleases.put("iPhone", 2007);
		
		System.out.println(productReleases);
		
		int javaYear = productReleases.get("Java");
		System.out.println(javaYear);
		
		System.out.println(productReleases.get("Tesla"));
		
		boolean t = productReleases.containsKey("Tesla");
		System.out.println(t);
		
		boolean y = productReleases.containsValue(1996);
		System.out.println(y);
		
		
		System.out.println(productReleases.keySet());
		for(String key : productReleases.keySet()) {
			int value = productReleases.get(key);
			System.out.println("The product " + key + " was released in " + value);
		}
		
		System.out.println(productReleases.values());
		for(int value : productReleases.values()) {
			System.out.println("In " + value + " a product was released");
		}
		
		//updating
		productReleases.put("iPhone", 2006);
		System.out.println(productReleases);
		
		//deleting
		productReleases.remove("iPhone");
		System.out.println(productReleases);
		
		
		// reverse lookup
		for(int value : productReleases.values()) {
			System.out.println("Year " + value + " the following products were released: ");
			for(String key : productReleases.keySet()) {
				if(value == productReleases.get(key))
					System.out.println( "\t" + key);
			
			}
		}

	}

}
