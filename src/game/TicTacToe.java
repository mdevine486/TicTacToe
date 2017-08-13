package game;

public class TicTacToe {
	/**
	 * board - char[] representing the TicTacToe board.
	 * size - Size of board.
 	 */
	private char[][] board;
	private int size;
	
	/**
	 * TicTacToe Constructor 
	 * Initialize the size and board.
	 * Print initial stage of the board.
 	 */
	public TicTacToe(int size){
		this.size = size;
		board = new char[size][size];
		boardPrint();
	}
	
	/**
	 * isFilled - Checks if a board is completely filled.
	 * True if board is filled, false otherwise.
 	 */
	public boolean isFilled(){
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(board[i][j] == '\u0000')
					return false;
			}
		}
		return true;
	}
	
	/**
	 * isValid - Checks if the x,y position based on the value
	 * is valid or not. True if valid, false otherwise.
 	 */
	public boolean isValid(int value){
		if(value<1 || value>size*size)
			return false;
		int x = (value-1)/size;
		int y = (value-1)%size;
		if(board[x][y] == '\u0000')
			return true;
		return false;
	}

	/**
	 * place - Places symbol on the board at position 
	 * x,y based on the value;
	 * Call to winCheck - returns true if player wins the game
	 * after this placement, false otherwise.
 	 */
	public boolean place(int value, char symbol){
		int x = (value-1)/size;
		int y = (value-1)%size;
		board[x][y] = symbol;
		boardPrint();
		return winCheck(x,y,symbol);
	}
	
	
	/**
	 * winCheck - Checks if a player did win the game
	 * by placing symbol at x,y position.
	 * Return true if player wins, false otherwise.
 	 */
	private boolean winCheck(int x, int y, char symbol){
		/* Horizontal */
		if(y>=2 && board[x][y-2]==symbol && board[x][y-1]==symbol && board[x][y]==symbol)
			return true;
		if(y>=1 && y+1<size && board[x][y-1]==symbol && board[x][y]==symbol && board[x][y+1]==symbol)
			return true;
		if(y+2<size && board[x][y]==symbol && board[x][y+1]==symbol && board[x][y+2]==symbol)
			return true;
		
		/* Vertical */
		if(x>=2 && board[x-2][y]==symbol && board[x-1][y]==symbol && board[x][y]==symbol)
			return true;
		if(x>=1 && x+1<size && board[x-1][y]==symbol && board[x][y]==symbol && board[x+1][y]==symbol)
			return true;
		if(x+2<size && board[x][y]==symbol && board[x+1][y]==symbol && board[x+2][y]==symbol)
			return true;
		
		/* Main Diagonal */
		if(x>=2 && y>=2 && board[x-2][y-2]==symbol && board[x-1][y-1]==symbol && board[x][y]==symbol)
			return true;
		if(x>=1 && x+1<size && y>=1 && y+1<size && board[x-1][y-1]==symbol && board[x][y]==symbol && board[x+1][y+1]==symbol)
			return true;
		if(x+2<size && y+2<size && board[x][y]==symbol && board[x+1][y+1]==symbol && board[x+2][y+2]==symbol)
			return true;
		
		/* Anti Diagonal */
		if(x>=2 && y+2<size && board[x-2][y+2]==symbol && board[x-1][y+1]==symbol && board[x][y]==symbol)
			return true;
		if(x>=1 && x+1<size && y>=1 && y+1<size && board[x+1][y-1]==symbol && board[x][y]==symbol && board[x-1][y+1]==symbol)
			return true;
		if(x+2<size && y>=2 && board[x][y]==symbol && board[x+1][y-1]==symbol && board[x+2][y-2]==symbol)
			return true;
		
		return false;
	}
	
	/**
	 * boardPrint - Prints the current state of board.
 	 */
	private void boardPrint(){		
		for (int i=0;i<size;i++) {
	        for (int j=0;j<size;j++) {
	            System.out.print(" ---- ");
	        }
	        System.out.println();
	        for (int j=0;j<size;j++) {
	        	int value = (i*size) + j + 1;
	        	if(board[i][j] == '\u0000'){
	        		if(value < 10)
	        			System.out.print("| "+ value + "  |");
	        		else
	        			System.out.print("| "+ value + " |");
	        	}
	        	else
	        		System.out.print("| "+ board[i][j] + "  |");
	        }
	        System.out.println();
	    }

	    for (int i=0;i<size;i++){
	    	System.out.print(" ---- ");
	    }
	    System.out.println();
	}
}
