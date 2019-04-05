import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		
		HashMap<String, Integer> wordCounts = new HashMap<String, Integer>();
		
		while(true) {
			String word = scnr.next();
			if(word.equals(".")) break;

			//approach 1
			wordCounts.putIfAbsent(word, 0);
			int count = wordCounts.get(word);
			wordCounts.put(word, count + 1);
			
			//approach 2
//			if(!wordCounts.containsKey(word)) 
//				wordCounts.put(word, 1);
//			else {
//				int count = wordCounts.get(word);
//				wordCounts.put(word, count + 1);
//			}
//			
			//approach 3
//			if(! wordCounts.containsKey(word))
//				wordCounts.put(word, 0);			
//			int count = wordCounts.get(word);
//			wordCounts.put(word, count + 1);
		}
		
		System.out.println("Your words are : " + wordCounts);
		System.out.println(wordCounts.size());

		//iterating over a map
		
		for(String key : wordCounts.keySet()) {
			System.out.println(key);
		}
		
		for(int value : wordCounts.values()) {
			System.out.println(value);
		}
		
		for(String key : wordCounts.keySet()) {
			int value = wordCounts.get(key);
			System.out.println(key + " is repeated " + value + " time" + (value > 1?"s":""));
		}
	}

}
