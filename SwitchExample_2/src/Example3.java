import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("What's your favorite programming language? ");
		String language = scnr.nextLine();
		int i =3;
		// i == 3;
		if(language.equals("Java"))
			System.out.println("Good choice");
		else if (language.equals("SQL"))
			System.out.println("Data is your limit");
		else if  (language.equals("R"))
			System.out.println("I hate statistics");
		else
			System.out.println("That's fancy");	

	}

}
