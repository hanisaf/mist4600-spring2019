
public class Main {

	public static void main(String[] args) {
		
		FragileContainer fg = new FragileContainer(1.5, "Houseware", "China");
		System.out.println(fg);
		fg.setHandlingInstructions("Maneggiare con cura");
		System.out.println(fg);

//		   Ship ship = new Ship("HMS MIS", 100);
//		   
//		   Container c1 = new Container(1, "Java Textbooks", "USA");
//		   Container c2 = new Container(1.5, "Computer workstations", "China");
//		   Container c3 = new Container(2.3, "Java beans", "Brazil");
//		   Container c4 = new Container(3, "Used books", "USA");
//		   
//		   ship.addContainer(c1);
//		   ship.addContainer(c2);
//		   ship.addContainer(c3);
//		   ship.addContainer(c4);
//		   		   
//		   System.out.println(ship);
//		   
//		   System.out.println(ship.getContainersFrom("USA"));
//		   System.out.println(ship.getContainersFrom("Brazil"));
//		   System.out.println(ship.getContainersFrom("China"));

	}

}
