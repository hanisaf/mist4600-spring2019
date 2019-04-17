
public class Main {

	public static void main(String[] args) {
		Professor prof = new Professor();
		
		Student s1 = new Student(); 
		s1.setName("Joe Moe");
		Student s2 = new LeftHandedStudent(); 
		s2.setName("Kim Left");
		Student s3 = new RightHandedStudent();
		s3.setName("Jill Right");
		
//		prof.probeStudent(s1);
//		prof.probeStudent(s2);
//		prof.probeStudent(s3);
		
		Student[] everyone = {s1, s2, s3};		
		prof.probeStudents(everyone);

	}

}
