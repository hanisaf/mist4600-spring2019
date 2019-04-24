import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scnr = new Scanner(System.in);
			System.out.print("Enter student name: ");
			String name = scnr.nextLine();
			System.out.print("Enter student age: ");
			int age = scnr.nextInt();
			Student student = new Student(name, age);
			System.out.println(student);
		} catch (Exception ex) {
			System.out.println("Cannot create student record");
			System.out.println(ex);
		}

	}

}
