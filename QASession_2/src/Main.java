
public class Main {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 3; i++) {
			Ship ship = new Ship(i);
			System.out.println("Place this ship");
			System.out.println(ship);
		}
//		Board board = new Board();
//		board.print();
//		Ship l = new Ship("L");		
//		Ship j = new Ship("J");		
//		Ship i = new Ship("I");		
//
//		Ship[] ships = {l, j, i};
//		
//		for(Ship ship : ships) {
//			System.out.println("Place this ship");
//			System.out.println(ship);
//			System.out.print("Enter col row");
//			//int col = ...
//			// int row = ...
//		}
	}

}
