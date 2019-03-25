import java.io.*;
public class Model {
	static PrintWriter writer;
	
	public static void updateModel(Student s) {
		try {
			if(writer == null) 
				writer = new PrintWriter("students.csv", "UTF-8");
			
			writer.println(s.getName() + "," + s.getAge());
			writer.flush();
		} catch(Exception ex) {
			throw new RuntimeException(ex.toString());
		}
	}
}
