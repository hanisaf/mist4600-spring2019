
public class Pet {
	private String name = "N/A";
	public Pet() {	}
	
	public Pet(String name) {
		this.setName(name);
	}
	
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public String toString() {return getName();}
}
