package test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.TicTacToe;

public class HorizontalTest {

	@Test
	public void testHorizontalRight() {
		/* Case One - Horizontal line with last input at right end of 3 */
		TicTacToe game = new TicTacToe(3);
		game.place(1, 'x');
		game.place(5, 'o');
		game.place(2, 'x');
		game.place(6, 'o');
		/*
		 ----  ----  ---- 
		| x  || x  || 3  |
 		 ----  ----  ---- 
		| 4  || o  || o  |
 		 ----  ----  ---- 
		| 7  || 8  || 9  |
 		 ----  ----  ---- 
		 */  
		boolean result = game.place(3, 'x');
		/*
		  ----  ----  ---- 
		 | x  || x  || x  |
		  ----  ----  ---- 
		 | 4  || o  || o  |
		  ----  ----  ---- 
		 | 7  || 8  || 9  |
		  ----  ----  ----
		 */ 
		assertEquals(true,result);
	}
	
	@Test
	public void testHorizontalMiddle() {
		/* Case Two - Horizontal line with last input in the middle of 3 */
		TicTacToe game = new TicTacToe(3);
		game.place(1, 'x');
		game.place(4, 'o');
		game.place(3, 'x');
		game.place(6, 'o');
		game.place(9, 'x');
		/*
		  ----  ----  ---- 
		 | x  || 2  || x  |
		  ----  ----  ---- 
		 | o  || 5  || o  |
		  ----  ----  ---- 
		 | 7  || 8  || x  |
		  ----  ----  ----
		 */ 
		boolean result = game.place(5, 'o');
		/*
		   ----  ----  ---- 
		  | x  || 2  || x  |
		   ----  ----  ---- 
		  | o  || o  || o  |
		   ----  ----  ---- 
		  | 7  || 8  || x  |
		   ----  ----  ----
		 */ 	
		assertEquals(true,result);
	}
	
	@Test
	public void testHorizontalLeft() {
		/* Case Three - Horizontal line with last input at left end of 3*/
		TicTacToe game = new TicTacToe(3);
		game.place(8, 'x');
		game.place(5, 'o');
		game.place(9, 'x');
		game.place(3, 'o');
		/*
		 ----  ----  ---- 
		| 1  || 2  || o  |
 		 ----  ----  ---- 
		| 4  || o  || 6  |
 		 ----  ----  ---- 
		| 7  || x  || x  |
 		 ----  ----  ---- 
		 */ 
		boolean result = game.place(7, 'x');
		/*
 		 ----  ----  ---- 
		| 1  || 2  || o  |
 		 ----  ----  ---- 
		| 4  || o  || 6  |
 		 ----  ----  ---- 
		| x  || x  || x  |
 		 ----  ----  ---- 
		 */ 	
		assertEquals(true,result);
	}


}
