import java.util.Random;

/**
 * This class models Student from the perspective
 * of university registrar
 * age >= 18
 * length of name should be more than one
 */
public class Student {
	private String name = "N/A";
	private int age = 18;
	private String email;
	
	public Student() {
		//name = "N/A";
		//age = 18;
		System.out.println("Student object created ....");
	}
	
	public Student(String name, int age) {
		//this.name = name;
		setName(name);
		this.setAge(age);
		//age = nextInt();
//		if(age < 18) {
//			System.out.println("Incorrect age, defaulting to 18");
//		} else
//			this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setName(String name) {
		if(name.length() < 2) {
			System.out.println("Incorrect name, defaulting to N/A");
		} else {
			this.name = name;
			generateEmail();
		}
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if(age < 18) {
			System.out.println("Incorrect age, defaulting to 18");
		} else
			this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void print() {
		String out = toString();
		System.out.println(out); 
	}
	
	private void generateEmail() {
		Random rand = new Random();
		int r = rand.nextInt(10000);
		email = name.toLowerCase().replaceAll(" ", ".") + "_" + r + "@uga.edu";		
	}
	
	public String toString() {
		return name + "--" + age + "--" + email;
	}
}
