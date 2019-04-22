import java.util.Arrays;

public class Main2Student {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("Lamis Yaw");
		s1.setAge(22);
		s1.setGrade(85.5);
		
		Student s2 = new Student();
		s2.setName("Jill Bill");
		s2.setAge(23);
		s2.setGrade(90.1);
		
		Student s3 = new Student();
		s3.setName("Gordon Zebra");
		s3.setAge(30);
		s3.setGrade(78.4);
		
		Student s4 = new Student();
		s4.setName("Heather Moire");
		s4.setAge(25);
		s4.setGrade(79.5);
		
		Student s5 = new Student();
		s5.setName("Minsoo Fang");
		s5.setAge(19);
		s5.setGrade(92);
		
		Student[] mist4600 = {s1, s2, s3, s4, s5};
		for(Student s : mist4600)
			System.out.println(s);
		
		System.out.println();
		
		//we would like to sort the class roll by student grade
		Arrays.sort(mist4600);
		for(Student s : mist4600)
			System.out.println(s);	

	}

}
