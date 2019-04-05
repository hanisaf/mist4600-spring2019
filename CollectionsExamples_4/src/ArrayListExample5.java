
public class ArrayListExample5 {

	public static void main(String[] args) {
		   Ship ship = new Ship("HMS MIS", 100);
		   
		   Container c1 = new Container(1, "Java Textbooks");
		   Container c2 = new Container(1.5, "Computer workstations");
		   Container c3 = new Container(2.3, "Java beans");
		   Container c4 = new Container(3, "Used books");
		   
		   ship.addContainer(c1);
		   ship.addContainer(c2);
		   ship.addContainer(c3);
		   ship.addContainer(c4);
		   
		   System.out.println(ship);
		   
		   System.out.println(ship.getContainer("java"));		   
		   System.out.println(ship.getContainers("java"));		   

		   System.out.println(ship.getContainer("book"));		   
		   System.out.println(ship.getContainers("book"));

		   System.out.println(ship.getContainer("car"));		   
		   System.out.println(ship.getContainers("car"));

	}

}
