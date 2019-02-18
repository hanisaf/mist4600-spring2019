
public class Person {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void print() {
		System.out.println("Hello my name is " + name);
	}
	
	public boolean equals(Object o) {
		if (o instanceof Person) {
			return ((Person) o).name.equals(this.name);
		} else
			return false;
	}
}
