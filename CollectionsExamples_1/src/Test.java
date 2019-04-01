
public class Test {

	public static void main(String[] args) {
	     String[] words = new String[3]; //declaration and initialization
	     words[0] = "Java";
	     words[1] = "Coffee";
	     words[2] = "Bean";
	     
	     System.out.println(words);
	     
			int charCount2 = 0;
			for(String word : words)
				charCount2 += word.length();
			System.out.println(charCount2);

	}

}
