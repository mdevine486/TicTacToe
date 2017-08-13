package test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.TicTacToe;

public class VerticalTest {
	
	@Test
	public void testVerticalTop() {
		/* Case One - Vertical line with last input at top end of 3 */
		TicTacToe game = new TicTacToe(3);
		game.place(5, 'x');
		game.place(1, 'o');
		game.place(8, 'x');
		game.place(6, 'o');
		/*
		 ----  ----  ---- 
		| o  || 2  || 3  |
 		 ----  ----  ---- 
		| 4  || x  || o  |
 		 ----  ----  ---- 
		| 7  || x  || 9  |
 		 ----  ----  ---- 
		 */  
		boolean result = game.place(2, 'x');
		/*
		 ----  ----  ---- 
		| o  || x  || 3  |
 		 ----  ----  ---- 
		| 4  || x  || o  |
 		 ----  ----  ---- 
		| 7  || x  || 9  |
 		 ----  ----  ---- 
		 */ 
		assertEquals(true,result);
	}
	
	@Test
	public void testVerticalMiddle() {
		/* Case Two - Vertical line with last input in the middle of 3 */
		TicTacToe game = new TicTacToe(3);
		game.place(5, 'x');
		game.place(1, 'o');
		game.place(8, 'x');
		game.place(7, 'o');
		game.place(9, 'x');
		/*
		 ----  ----  ---- 
		| o  || 2  || 3  |
 		 ----  ----  ---- 
		| 4  || x  || 6  |
 		 ----  ----  ---- 
		| o  || x  || x  |
 		 ----  ----  ---- 
		 */  
		boolean result = game.place(4, 'o');
		/*
		 ----  ----  ---- 
		| o  || 2  || 3  |
 		 ----  ----  ---- 
		| o  || x  || 6  |
 		 ----  ----  ---- 
		| o  || x  || x  |
 		 ----  ----  ---- 
		 */ 
		assertEquals(true,result);
	}
	
	@Test
	public void testVerticalBottom() {
		/* Case Three - Vertical line with last input at bottom end of 3 */
		TicTacToe game = new TicTacToe(3);
		game.place(5, 'x');
		game.place(3, 'o');
		game.place(7, 'x');
		game.place(6, 'o');
		game.place(1, 'x');
		/*
		 ----  ----  ---- 
		| x  || 2  || o  |
 		 ----  ----  ---- 
		| 4  || x  || o  |
 		 ----  ----  ---- 
		| x  || 8  || 9  |
 		 ----  ----  ---- 
		 */  
		boolean result = game.place(9, 'o');
		/*
		 ----  ----  ---- 
		| x  || 2  || o  |
 		 ----  ----  ---- 
		| 4  || x  || o  |
 		 ----  ----  ---- 
		| x  || 8  || o  |
 		 ----  ----  ---- 
		 */ 
		assertEquals(true,result);
	}
}
