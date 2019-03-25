
public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Jade");
		s1.setAge(21);
		s1.print();
		
		Student s2 = new Student("Jack", 2);
		s2.setAge(2);
		s2.print();
		
		Student s3 = new Student("Z", 22);
		s3.setName("Zen");
		s3.print();
	}

}
