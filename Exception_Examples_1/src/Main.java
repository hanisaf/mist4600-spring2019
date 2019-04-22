import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		Student student = new Student();
		System.out.print("Enter student name: ");
		String name = scnr.nextLine();
		student.setName(name);
		System.out.print("Enter student age: ");
		int age = scnr.nextInt();
		student.setAge(age);
		System.out.println(student);
	}

}
