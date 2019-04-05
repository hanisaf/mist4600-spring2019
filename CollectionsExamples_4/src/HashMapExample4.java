import java.util.HashMap;
import java.util.ArrayList;

public class HashMapExample4 {

	public static void main(String[] args) {
		// 
		HashMap<Integer, ArrayList<String>> numberWordings = new HashMap<Integer, ArrayList<String>>();
		
		ArrayList<String> numOne = new ArrayList<String>();
		numOne.add("one"); numOne.add("un"); numOne.add("uno"); 
		ArrayList<String> numTwo = new ArrayList<String>();
		numTwo.add("two"); numTwo.add("deux"); numTwo.add("due");
		
		numberWordings.put(1, numOne);
		numberWordings.put(2, numTwo);
		
		System.out.println(numberWordings);
		//two in French
		System.out.println(numberWordings.get(2).get(1));
		//
		HashMap<Integer, HashMap<String,String>> numberWordingLanguages = new HashMap<Integer, HashMap<String,String>>();
		
		HashMap<String, String> mapOne = new HashMap<String, String>();
		mapOne.put("English", "one"); mapOne.put("French", "un"); mapOne.put("Italian", "uno");
		HashMap<String, String> mapTwo = new HashMap<String, String>();
		mapTwo.put("English", "two"); mapTwo.put("French", "deux"); mapTwo.put("Italian", "due");
		
		numberWordingLanguages.put(1, mapOne);
		numberWordingLanguages.put(2, mapTwo);
		
		System.out.println(numberWordingLanguages);
		//two in French
		System.out.println(numberWordingLanguages.get(2).get("French"));
		

		
	}

}
