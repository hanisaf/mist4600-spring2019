import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Choose the ending number: ");
		int i = scnr.nextInt();
		System.out.println();
		Person romeo = new Person("Romeo", 10);
		Person juliet = new Person("Juliet");
		Person guard1 = new Person("Guard 1", 5);
		Person guard2 = new Person("Guard 2", 7);
		Person guard3 = new Person("Guard 3", 50);
		System.out.println("Romeo and Juliet - ACT III");
		if(i == 1) {
			romeo.setLover(juliet);
			juliet.setLover(romeo);
			
			romeo.encounter(guard1);
			romeo.encounter(guard2);
			
			romeo.encounter(juliet);
			juliet.encounter(romeo);
		} else if(i==2) {
			romeo.setLover(juliet);
			juliet.setLover(romeo);
			
			romeo.encounter(guard1);
			romeo.encounter(guard3);
			
			juliet.encounter(romeo);
		} else if (i==3) {
			romeo.setLover(juliet);
			juliet.setLover(guard2);
			
			romeo.encounter(guard1);
			romeo.encounter(guard2);
			
			juliet.encounter(guard2);
			romeo.encounter(juliet);
		} else {
			System.out.println(i + " is not a valid ending");
		}
		System.out.println("THE END");

	}

}
