/**
 * represents the Ship
 * @author hanisaf
 *
 */
public class Ship {

	private boolean[][] cells;

	public Ship(String shape) {
		switch (shape) {
		case "L":
			cells = new boolean[][] { { true, false }, { true, false }, { true, true } };
			break;
		case "J":
			cells = new boolean[][] { { false, true }, { false, true }, { true, true } };
			break;
		case "I":
			cells = new boolean[][] { { true }, { true }, { true }, { true } };
			break;
		default:
			throw new RuntimeException("Incorrect ship shape mate!");
		}

	}

	/**
	 * rotates the ship
	 */
	public void rotate() {
		boolean[][] newCells = new boolean[cells[0].length][cells.length];

		int rowIndex = 0;
		int colIndex = cells.length - 1;
		while (rowIndex < cells.length) {
			for (int i = 0; i < cells[rowIndex].length; i++)
				newCells[i][colIndex] = cells[rowIndex][i];
			rowIndex++;
			colIndex--;
		}

		cells = newCells;
	}

	public String toString() {
		String res = "";

		for (int r = 0; r < cells.length; r++) {
			for (int c = 0; c < cells[r].length; c++) {
				if (cells[r][c])
					res += "S";
				else
					res += "~";
			}
			res += "\n";
		}

		return res;
	}
}
