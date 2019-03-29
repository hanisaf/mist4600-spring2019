import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Java");
		words.add("Coffee");
		words.add("Bean");
		
		System.out.println(words.get(2));
		System.out.println(words.size());
		
		
		System.out.println(words); //what do we see here
		
		// What is the total number of characters in words
		
		int charCount1 = 0;
		for(int i =0; i < words.size(); i++) {
			String word = words.get(i);
			charCount1 += word.length();
		}
		System.out.println(charCount1);
		
		// or
		
		int charCount2 = 0;
		for(String word : words)
			charCount2 += word.length();
		System.out.println(charCount2);
	}

}
