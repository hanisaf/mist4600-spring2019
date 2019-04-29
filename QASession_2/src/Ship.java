
public class Ship {
	private boolean[][] cells;
	
	public Ship(int shape) {
		
		switch(shape) {
		case 1:
			cells = new boolean[][] { {true, false}, {true, false}, {true, true}  };
			break;
		case 2:
			cells = new boolean[][] { {false, true}, {false, true}, {true, true}  };
			break;
		case 3:
			cells = new boolean[][] { { true}, { true}, { true} , {true} };
		
		
		}
		
	}
	
	public String toString() {
		String res = " |";	
		
		for(int c = 0; c < cells[0].length; c++)
			res += c + "|";
		res += "\n------\n";
		
		for(int r = 0; r < cells.length; r++) {
			res += r + "|";
			for(int c = 0; c < cells[0].length; c++) {
				if(cells[r][c])
					res += "S|";
				else
					res += "~|";
			}
			res += "\n";
		}
		
		return res;
	}
}
