import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int number;
		System.out.print("Enter a number ");
		number = scnr.nextInt();
		
		if(number >= 0 && number <= 9) {
			System.out.println("A single digit number!");
		}
		
		System.out.println("Good bye!");
	}

}
