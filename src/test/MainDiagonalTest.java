package test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.TicTacToe;

public class MainDiagonalTest {

	@Test
	public void testMainDiagonalTop() {
		/* Case One - MainDiagonal line with last input at top end of 3 */
		TicTacToe game = new TicTacToe(3);
		game.place(5, 'x');
		game.place(4, 'o');
		game.place(9, 'x');
		game.place(6, 'o');
		/*
		 ----  ----  ---- 
		| 1  || 2  || 3  |
 		 ----  ----  ---- 
		| o  || x  || o  |
 		 ----  ----  ---- 
		| 7  || 8  || x  |
		 ----  ----  ---- 
		 */  
		boolean result = game.place(1, 'x');
		/*
		 ----  ----  ---- 
		| x  || 2  || 3  |
 		 ----  ----  ---- 
		| o  || x  || o  |
 		 ----  ----  ---- 
		| 7  || 8  || x  |
 		 ----  ----  ---- 
		 */ 
		assertEquals(true,result);
	}
	
	@Test
	public void testMainDiagonalMiddle() {
		/* Case Two - MainDiagonal line with last input in the middle of 3 */
		TicTacToe game = new TicTacToe(3);
		game.place(1, 'x');
		game.place(4, 'o');
		game.place(9, 'x');
		game.place(6, 'o');
		/*
		 ----  ----  ---- 
		| x  || 2  || 3  |
 		 ----  ----  ---- 
		| o  || 5  || o  |
 		 ----  ----  ---- 
		| 7  || 8  || x  |
 		 ----  ----  ---- 
		 */  
		boolean result = game.place(5, 'x');
		/*
		 ----  ----  ---- 
		| x  || 2  || 3  |
 		 ----  ----  ---- 
		| o  || x  || o  |
 		 ----  ----  ---- 
		| 7  || 8  || x  |
 		 ----  ----  ---- 
		 */ 
		assertEquals(true,result);
	}
	
	@Test
	public void testMainDiagonalBottom() {
		/* Case Three - MainDiagonal line with last input at bottom end of 3 */
		TicTacToe game = new TicTacToe(3);
		game.place(5, 'x');
		game.place(4, 'o');
		game.place(1, 'x');
		game.place(6, 'o');
		/*
		 ----  ----  ---- 
		| x  || 2  || 3  |
 		 ----  ----  ---- 
		| o  || x  || o  |
 		 ----  ----  ---- 
		| 7  || 8  || 9  |
 		 ----  ----  ----
		 */  
		boolean result = game.place(9, 'x');
		/*
		 ----  ----  ---- 
		| x  || 2  || 3  |
 		 ----  ----  ---- 
		| o  || x  || o  |
 		 ----  ----  ---- 
		| 7  || 8  || x  |
 		 ----  ----  ---- 
		 */ 
		assertEquals(true,result);
	}
}
