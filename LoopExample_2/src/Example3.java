
public class Example3 {

	public static void main(String[] args) {
		// Write a program that prints
		// Five little monkeys jumping on the bed ...
		// Four little monkeys jumping on the bed ...
		// ...
		// One little monkey jumping on the bed
		
		for(int monkeys = 5; monkeys >= 1; monkeys--) {
			String order = monkeys==5?"Five":monkeys==4?"Four":monkeys==3?"Three": monkeys==2?"Two":"One";
			System.out.println(order + " little monkey" + (monkeys!=1?"s":"") + " jumping on the bed ...");
		}
		
		/*
		int monkeys = 5;
		while(monkeys >= 1) {
			
			System.out.println(monkeys + " little monkey" + (monkeys!=1?"s":"") + " jumping on the bed ...");
			
//			String s = "";
//			if(monkeys != 1)
//				s = "s";
//			
//			System.out.println(monkeys + " little monkey" + s + " jumping on the bed ...");
			
//			System.out.print(monkeys + " little monkey");
//			
//			if(monkeys != 1)
//				System.out.print("s");
//
//			System.out.println(" jumping on the bed ...");
			monkeys--; //monkeys=monkeys-1
		}
		//System.out.println("One little monkey jumping on the bed ...");
		 * */
		 
	}

}
