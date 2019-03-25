
public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		//s1.generateEmail();
		s1.setName("Jade Luck");
		s1.setAge(21);
		//s1.generateEmail();
		System.out.println(s1);
		
		//s1.generateEmail(); //no longer possible
		
		//s1.print();
		
		Student s2 = new Student("Jack", 2);
		s2.setAge(2);
		System.out.println(s2);
		//s2.print();
		
		Student s3 = new Student("Z", 22);
		s3.setName("Zen");
		System.out.println(s3);
		//s3.print();
	}

}
