import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Ship l = new Ship("L");		
		Ship j = new Ship("J");
		Ship i = new Ship("I");

		Ship[] ships = {l, j, i};
		Board board = new Board();
		Scanner keyboard = new Scanner(System.in);
		
		for(Ship ship : ships) {
			while(true) {
				System.out.println("Place this ship");
				System.out.println(ship);
				System.out.print("enter col row ");
				int col = keyboard.nextInt();
				if(col == -1) {
					ship.rotate();
					continue;
				}
				int row = keyboard.nextInt();
				boolean valid = board.placeShip(ship, row, col);
				if(!valid) continue;
				break;
			}

		}
	}

}
