import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("how old? ");
		int age = scnr.nextInt();
		
		boolean isYoung = age < 18;
//		
//		System.out.println(isYoung);
//		
//		if(isYoung) 
//			System.out.println("Enjoy your life");
//		else
//			System.out.println("Learn Java");
		
		System.out.print("is male? ");
		boolean isMale = scnr.nextBoolean();
		if(isYoung && isMale)
			System.out.println("Troublemaker");
		else if(isYoung && !isMale)
			System.out.println("Sweetheart");
		else
			System.out.println("A Java learner");

	}

}
