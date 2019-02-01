import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//complete the program implementation
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scnr.nextLine();
		
		System.out.println("Hello, " + name);
		System.out.println("The first character in your name is ");
		System.out.println("The last character in your name is ");
		System.out.println("A random character in your name is ");
	}

}
