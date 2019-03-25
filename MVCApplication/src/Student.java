/**
 * This class models Student from the perspective
 * of university registrar
 * age >= 18
 * length of name should be more than one
 */
public class Student {
	private String name = "N/A";
	private int age = 18;
	
	public Student() {
		System.out.println("Student object created ....");
	}
	
	public Student(String name, int age) {
		setName(name);
		this.setAge(age);
	}
	
	public void setName(String name) {
		if(name.length() < 2) {
			throw new RuntimeException("Incorrect name");
		} else
			this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if(age < 18) {
			throw new RuntimeException("Incorrect age");
		} else
			this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void print() {
		System.out.println(toString()); 
	}
	
//	public String toString() {
//		return name + "--" + age;
//	}
}
