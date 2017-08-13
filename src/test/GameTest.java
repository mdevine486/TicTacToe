package test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.TicTacToe;

public class GameTest {

	@Test
	public void isValidTest() {
		TicTacToe game = new TicTacToe(3);
		boolean result;
		
		/* Out of bounds test */
		result = game.isValid(-1);
		assertEquals(false,result);
		result = game.isValid(100);
		assertEquals(false,result);
		
		/* Empty test */
		game.place(5, 'x');
		result = game.isValid(5);
		assertEquals(false,result);
	}
	
	@Test
	public void isFilledTest() {
		TicTacToe game = new TicTacToe(3);
		boolean result;
		
		/* Filled Test */
		game.place(5, 'x');
		game.place(1, 'o');
		game.place(2, 'x');
		game.place(8, 'o');
		game.place(7, 'x');
		game.place(3, 'o');
		game.place(4, 'x');
		game.place(6, 'o');
		/*
		 ----  ----  ---- 
		| o  || x  || o  |
		 ----  ----  ---- 
		| x  || x  || o  |
		 ----  ----  ---- 
		| x  || o  || 9  |
		 ----  ----  ----
		*/ 
		result = game.isFilled();
		assertEquals(false,result);
		
		game.place(9, 'x');
		/*
		 ----  ----  ---- 
		| o  || x  || o  |
		 ----  ----  ---- 
		| x  || x  || o  |
		 ----  ----  ---- 
		| x  || o  || x  |
		 ----  ----  ---- 
		 */
		result = game.isFilled();
		assertEquals(true,result);
		
	}

}
