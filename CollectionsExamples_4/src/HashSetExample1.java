import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample1 {

	public static void main(String[] args) {

		//ArrayList<String> words = new ArrayList<String>();
		HashSet<String> words = new HashSet<String>();
		
		words.add("Drink");
		words.add("Java");
		words.add("Coffee");
		words.add("Bean");
		words.add("Java");
		
		System.out.println(words.size());
		System.out.println(words);
		
		System.out.println(words.contains("Java"));
		System.out.println(words.contains("Tea"));
		//words.remove(1);
		//System.out.println(words);
		
		boolean removed1 = words.remove("Java");
		System.out.println(removed1);
		System.out.println(words.size());
		System.out.println(words);
//		
		boolean removed2 = words.remove("Dawg");
		System.out.println(removed2);
		System.out.println(words.size());
		System.out.println(words);
		
		//sorting the words
		String[] sortedWords = new String[words.size()];
		int i = 0;
		for(String w : words)
			sortedWords[i++] = w;
		Arrays.sort(sortedWords);
		for(String w : sortedWords)
			System.out.print(w + " ");

	}

}
