
public class Professor {
	
	public void probeStudent(Student student) {
		System.out.println(student + ", please raise your hand!");
		String hand = student.raiseHand();
		System.out.println(hand);
	}
	
	public void probeStudents(Student[] students) {

		for(Student student : students) {
			this.probeStudent(student);
		}
	}

}
