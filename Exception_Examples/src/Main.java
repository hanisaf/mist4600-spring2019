
public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Jade Luck");
		s1.setAge(21);
		System.out.println(s1);
		
		Student s2 = new Student("Jack", 2);
		s2.setAge(2);
		System.out.println(s2);
		
		Student s3 = new Student("Z", 22);
		s3.setName("Zen");
		System.out.println(s3);
	}

}
