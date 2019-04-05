import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<String, Integer> productReleases = new HashMap<String, Integer>();
		
		productReleases.put("Model T Ford", 1908);
		productReleases.put("IBM Personal Computer", 1981);
		productReleases.put("Nintendo 64", 1996);
		productReleases.put("Java", 1996);
		productReleases.put("iPhone", 2007);
		
		System.out.println(productReleases);
		
		int javaYear = productReleases.get("Java");
		System.out.println(javaYear);
		
		boolean t = productReleases.containsKey("Tesla");
		System.out.println(t);
		
		boolean y = productReleases.containsValue(1996);
		System.out.println(y);
		
		System.out.println(productReleases.keySet());
		System.out.println(productReleases.values());
		
		//updating
		productReleases.put("iPhone", 2006);
		System.out.println(productReleases);
		
		//deleting
		productReleases.remove("iPhone");
		System.out.println(productReleases);

	}

}
