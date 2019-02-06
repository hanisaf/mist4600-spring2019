import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		//complete the program implementation
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scnr.nextLine();
		
		System.out.println("Hello, " + name);
		char firstChar = name.charAt(0);
		System.out.println("The first character in your name is " + firstChar);
		char lastChar = name.charAt(name.length() - 1);
		System.out.println("The last character in your name is " + lastChar);
		
		Random rand = new Random();
		char randChar = name.charAt( rand.nextInt( name.length() ) );
		System.out.println("A random character in your name is " + randChar);
	}

}
