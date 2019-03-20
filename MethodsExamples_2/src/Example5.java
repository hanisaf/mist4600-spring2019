import java.util.Scanner;

public class Example5 {
	private final int SIZE = 3;
	private  char[][] board = new char[SIZE][SIZE];
	//refactor the code from main 
	/**
	 * print the tic-tac-toe board
	 */
	public void printBoard() {
		//print the board				
		for(int i=0; i<board.length; i++) { //go over rows
			for(int j=0; j<board[i].length;j++) { //go over cols
				char cell = board[i][j];
				System.out.print( "|"+ cell );
			}
			System.out.println("|");
		}
		//end printing the board
	}
	
	/**
	 * Places the passed token on the board
	 * @param row can be 0, 1 or 2
	 * @param col can be 0, 1 or 2
	 * @param token can be 'X' or 'O'
	 * @return true if the token is successfully placed on the board
	 * 			false if the input is not valid
	 */
	public boolean placeToken(int row, int col, char token) {
		int SIZE = board.length;
		//1- ensure that the selection is valid before placing mark on board
		if ( ! (row < SIZE && row >= 0 && col < SIZE && col >=0 )) {
			//System.out.println("Invalid selection");
			return false;
		}
		
		if(board[row][col] == 'O' || board[row][col] == 'X') {
			//System.out.println("Already taken");
			return false;
		}
			
		board[row][col] = token;
		
		return true;
	}
	
	/**
	 * Detect if the game ended with a draw, when the board is full
	 * and no player has won
	 * @return true when the game is a draw, false otherwise
	 */
	public boolean isDrawMove() {
		//check for draw, a draw happens when board is full
		int emptyCells = 0;
		for(int i = 0; i<board.length; i++)
			for(int j=0; j<board[i].length; j++)
				if(board[i][j] != 'X' && board[i][j] != 'O')
					emptyCells++;
		
		if(emptyCells == 0) {
			return true;
		} else		
			return false;
	}
	
	/**
	 * Detect if the game ended with a win, three same tokens in a row, column or diagonal 
	 * 
	 * @return true when the game is a draw, false otherwise
	 */
	public boolean isWinMove(int r, int c) {
		//check row r
		if(board[r][0] == board[r][1] && board[r][1] == board[r][2])
			return true;
		//check col c
		if(board[0][c] == board[1][c] && board[1][c] == board[2][c])
			return true;
		//check the two diagonals, only when the user chooses a cell on a diagonal
		if(r == c) 
			if(board[0][0] == board[1][1] && board[1][1] == board[2][2])
				return true;
		
		if(r == 2 - c)
			if(board[2][0] == board[1][1] && board[1][1] == board[0][2])
				return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		// TIC TAC TOE
		Scanner scnr = new Scanner(System.in);


		Example5 ex = new Example5();
		
		//print the board				
		ex.printBoard();
		
		boolean isDraw = false;
		//play the game
		char player = 'O';
		while(true) {
			System.out.print("Player " + player + ", choose row and col: ");
			int r = scnr.nextInt();
			int c = scnr.nextInt();
			
			boolean valid = ex.placeToken(r, c, player);
			if(!valid) {
				System.out.println("Invalid selection");
				continue;
			}
			//print the board				
			ex.printBoard();
			
			//2- check whether the game has ended (win/draw)
			if(ex.isWinMove(r, c))
				break;		
	
			if(ex.isDrawMove()) {
				isDraw = true;
				break;
			}
			//switch to the other player
			if(player == 'O') player = 'X'; else player = 'O';
			//player = (player == 'O')?'X':'O';
			
		}
		
		//3- display the results
		if(isDraw)
			System.out.println("Game is a draw");
		else
			System.out.println("Player " + player + " won the game");
		//complete the game
		//1- ensure that the selection is valid before placing mark on board
		//   the cell is not already occupied and the selection is within bound
		//2- check whether the game has ended (win/draw)
		//3- display the results (i.e., player O has won etc ...)
	}

}
