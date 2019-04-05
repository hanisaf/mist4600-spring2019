
public class ArrayListExample4 {
	   public static void main(String[] args) {
		   Ship ship = new Ship("HMS MIS", 100);
		   
		   Container c1 = new Container(1, "Java Textbooks");
		   Container c2 = new Container(1.5, "Computer workstations");
		   
		   ship.addContainer(c1);
		   ship.addContainer(c2);
		   ship.report();
		   //output should be
//		   ---- ---- ---- ---- ----
//		   Ship name HMS MIS
//		   Empty weight 100.0
//		   Total weight 102.5
//		   Containers on the ship:
//		   Java Textbooks 1.0
//		   Computer workstations 1.5
//		   ---- ---- ---- ---- ----
		   
		   ship.removeContainer(0);
		   ship.report();
		   //output should be
//		   ---- ---- ---- ---- ----
//		   Ship name HMS MIS
//		   Empty weight 100.0
//		   Total weight 101.5
//		   Containers on the ship:
//		   Computer workstations 1.5
//		   ---- ---- ---- ---- ----
	   }
}
