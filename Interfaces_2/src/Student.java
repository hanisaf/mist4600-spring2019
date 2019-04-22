
public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private double grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String toString() {
		return "Student " + name + " is " + age + " years old and scores " + grade + "%";
	}

	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
//		if(this.name.compareTo(other.name) < 0)
//			return -1;
//		else if (this.name.equals(other.name))
//			return 0;
//		else
//			return 1;
	}
}
