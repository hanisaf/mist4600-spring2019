
public class Board {
	private char[][] cells;
	
	public Board() {
		cells = new char[10][15];
		
		for(int r=0; r < cells.length; r++)
			for(int c = 0; c < cells[r].length;c++)
				cells[r][c] = '~';
	}
	
	public String convert(char c) {
		String res = ".";
		if(c == '~')
			res = "🌊";
		
		return res;
		
	}
	
	public void print() {
		System.out.print(" |");
		for(int c = 0; c < cells[0].length;c++) {
			System.out.print(c + "\t");
		}
		System.out.println();
		
		for(int r=0; r < cells.length; r++) {
			System.out.print(r + "|");
			for(int c = 0; c < cells[r].length;c++) {
				System.out.print(convert(cells[r][c]) + "\t");
			}
			System.out.println();
		}
	}

}
