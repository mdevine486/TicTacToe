package test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.TicTacToe;

public class AntiDiagonalTest {

	@Test
	public void testAntiDiagonalTop() {
		/* Case One - AntiDiagonal line with last input at top end of 3 */
		TicTacToe game = new TicTacToe(3);
		game.place(1, 'x');
		game.place(5, 'o');
		game.place(2, 'x');
		game.place(7, 'o');
		game.place(8, 'x');
		/*
		 ----  ----  ---- 
		| x  || x  || 3  |
 		 ----  ----  ---- 
		| 4  || o  || 6  |
 		 ----  ----  ---- 
		| o  || x  || 9  |
 		 ----  ----  ---- 
		 */  
		boolean result = game.place(3, 'o');
		/*
		 ----  ----  ---- 
		| x  || x  || o  |
 		 ----  ----  ---- 
		| 4  || o  || 6  |
 		 ----  ----  ---- 	
		| o  || x  || 9  |
 		 ----  ----  ----  
		 */ 
		assertEquals(true,result);
	}
	
	@Test
	public void testAntiDiagonalMiddle() {
		/* Case Two - AntiDiagonal line with last input in the middle of 3 */
		TicTacToe game = new TicTacToe(3);
		game.place(1, 'x');
		game.place(3, 'o');
		game.place(2, 'x');
		game.place(7, 'o');
		game.place(8, 'x');
		/*
		 ----  ----  ---- 
		| x  || x  || o  |
 		 ----  ----  ---- 
		| 4  || 5  || 6  |
 		 ----  ----  ---- 
		| o  || x  || 9  |
 		 ----  ----  ---- 
		 */  
		boolean result = game.place(5, 'o');
		/*
		 ----  ----  ---- 
		| x  || x  || o  |
 		 ----  ----  ---- 
		| 4  || o  || 6  |
 		 ----  ----  ---- 	
		| o  || x  || 9  |
 		 ----  ----  ----  
		 */ 
		assertEquals(true,result);
	}
	
	@Test
	public void testAntiDiagonalBottom() {
		/* Case Three - AntiDiagonal line with last input at bottom end of 3 */
		TicTacToe game = new TicTacToe(3);
		game.place(1, 'x');
		game.place(5, 'o');
		game.place(2, 'x');
		game.place(3, 'o');
		game.place(8, 'x');
		/*
		 ----  ----  ---- 
		| x  || x  || o  |
 		 ----  ----  ---- 
		| 4  || o  || 6  |
 		 ----  ----  ---- 
		| 7  || x  || 9  |
 		 ----  ----  ---- 
		 */  
		boolean result = game.place(7, 'o');
		/*
		 ----  ----  ---- 
		| x  || x  || o  |
 		 ----  ----  ---- 
		| 4  || o  || 6  |
 		 ----  ----  ---- 	
		| o  || x  || 9  |
 		 ----  ----  ----  
		 */ 
		assertEquals(true,result);
	}
}
