
public class Board {

	public boolean placeShip(Ship p, int row, int col) {
		//verify valid placement
		if(row < 0 || col < 0)
			return false;
		//if so place
		System.out.println("Trying to place on " + row + ", " + col);
		return true;
	}
}
