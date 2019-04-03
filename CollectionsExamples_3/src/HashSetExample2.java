import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		
		//ArrayList<String> words = new ArrayList<String>();
		HashSet<String> words = new HashSet<String>();
		
		while(true) {
			String word = scnr.next();
			if(word.equals(".")) break;
			// to recognize . in the last word without a space
			// if(word.charAt(word.length()-1) == '.') {
			// 	words.add(word.toLowerCase().substring(0, word.length()-1));
			// 	break;
			// }
			words.add(word.toLowerCase());
		}
		
		System.out.println("Your words are : " + words);
		System.out.println(words.size());
	}

}
