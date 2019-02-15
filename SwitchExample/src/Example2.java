import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("What's your favorite programming language? ");
		String language = scnr.nextLine();
		switch(language) {
		case "Java":
			System.out.println("Good choice");
			break;
		case "SQL":
			System.out.println("Data is your limit");
			break;
		case "R":
			System.out.println("I hate statistics");
			break;
		default:
			System.out.println("That's fancy");	
		
		}
		
		

	}

}
