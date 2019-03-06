import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		// TIC TAC TOE
		Scanner scnr = new Scanner(System.in);
		final int SIZE = 3;
		char[][] board = new char[SIZE][SIZE];

		//print the board				
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length;j++) {
				char cell = board[i][j];
				System.out.print( "|"+ cell );
			}
			System.out.println("|");
		}
		//end printing the board
		
		//play the game
		char player = 'O';
		while(true) {
			System.out.print("Player " + player + ", choose row and col: ");
			int r = scnr.nextInt();
			int c = scnr.nextInt();
			board[r][c] = player;
			
			//print the board				
			for(int i=0; i<board.length; i++) {
				for(int j=0; j<board[i].length;j++) {
					char cell = board[i][j];
					System.out.print( "|"+ cell );
				}
				System.out.println("|");
			}
			//end printing the board
			
			//switch to the other player
			if(player == 'O') player = 'X'; else player = 'O';
			//player = (player == 'O')?'X':'O';
			
		}
		
		//complete the game
		//1- ensure that the selection is valid before placing mark on board
		//   the cell is not already occupied and the selection is within bound
		//2- check whether the game has ended (win/draw)
		//3- display the results (i.e., player O has won etc ...)
	}

}
