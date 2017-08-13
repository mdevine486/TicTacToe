package test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.TicTacToe;

public class GenericTest {

	@Test
	public void testHorizontal() {
		TicTacToe game = new TicTacToe(4);
		game.place(1, 'x');
		game.place(6, 'o');
		game.place(2, 'x');
		game.place(3, 'o');
		game.place(9, 'x');
		game.place(7, 'o');
		game.place(11, 'x');
		/*
		 ----  ----  ----  ---- 
		| x  || x  || o  || 4  |
 		 ----  ----  ----  ---- 
		| 5  || o  || o  || 8  |
 		 ----  ----  ----  ---- 
		| x  || 10 || x  || 12 |
 		 ----  ----  ----  ---- 
		| 13 || 14 || 15 || 16 |
 		 ----  ----  ----  ---- 
		 */  
		boolean result = game.place(8, 'o');
		/*
		 ----  ----  ----  ---- 
		| x  || x  || o  || 4  |
 		 ----  ----  ----  ---- 
		| 5  || o  || o  || o  |
 		 ----  ----  ----  ---- 
		| x  || 10 || x  || 12 |
 		 ----  ----  ----  ---- 
		| 13 || 14 || 15 || 16 |
 		 ----  ----  ----  ---- 
		 */ 
		assertEquals(true,result);
	}
	
	@Test
	public void testVertical() {
		TicTacToe game = new TicTacToe(4);
		game.place(1, 'x');
		game.place(6, 'o');
		game.place(2, 'x');
		game.place(3, 'o');
		game.place(9, 'x');
		game.place(7, 'o');
		/*
		 ----  ----  ----  ---- 
		| x  || x  || o  || 4  |
 		 ----  ----  ----  ---- 
		| 5  || o  || o  || 8  |
 		 ----  ----  ----  ---- 
		| x  || 10 || 11 || 12 |
 		 ----  ----  ----  ---- 
		| 13 || 14 || 15 || 16 |
 		 ----  ----  ----  ---- 
		 */  
		boolean result = game.place(5, 'x');
		/*
		 ----  ----  ----  ---- 
		| x  || x  || o  || 4  |
 		 ----  ----  ----  ---- 
		| x  || o  || o  || 8  |
 		 ----  ----  ----  ---- 
		| x  || 10 || 11 || 12 |
 		 ----  ----  ----  ---- 
		| 13 || 14 || 15 || 16 |
 		 ----  ----  ----  ---- 
		 */ 
		assertEquals(true,result);
	}
	
	@Test
	public void testMainDiagonal() {
		TicTacToe game = new TicTacToe(4);
		game.place(6, 'x');
		game.place(5, 'o');
		game.place(2, 'x');
		game.place(3, 'o');
		game.place(11, 'x');
		game.place(7, 'o');
		/*
		 ----  ----  ----  ---- 
		| 1  || x  || o  || 4  |
 		 ----  ----  ----  ---- 
		| o  || x  || o  || 8  |
 		 ----  ----  ----  ---- 
		| 9  || 10 || x  || 12 |
 		 ----  ----  ----  ---- 
		| 13 || 14 || 15 || 16 |
 		 ----  ----  ----  ---- 
		 */  
		boolean result = game.place(16, 'x');
		/*
		 ----  ----  ----  ---- 
		| 1  || x  || o  || 4  |
 		 ----  ----  ----  ---- 
		| o  || x  || o  || 8  |
 		 ----  ----  ----  ---- 
		| 9  || 10 || x  || 12 |
 		 ----  ----  ----  ---- 
		| 13 || 14 || 15 || x  |
 		 ----  ----  ----  ---- 
		 */ 
		assertEquals(true,result);
	}
	
	@Test
	public void testAntiDiagonal() {
		TicTacToe game = new TicTacToe(4);
		game.place(13, 'x');
		game.place(4, 'o');
		game.place(2, 'x');
		game.place(3, 'o');
		game.place(11, 'x');
		game.place(10, 'o');
		game.place(1, 'x');
		/*
		 ----  ----  ----  ---- 
		| x  || x  || o  || o  |
 		 ----  ----  ----  ---- 
		| 5  || 6  || 7  || 8  |
 		 ----  ----  ----  ---- 
		| 9  || o  || x  || 12 |
 		 ----  ----  ----  ---- 
		| x  || 14 || 15 || 16 |
 		 ----  ----  ----  ---- 
		 */  
		boolean result = game.place(7, 'o');
		/*
		 ----  ----  ----  ---- 
		| x  || x  || o  || o  |
 		 ----  ----  ----  ---- 
		| 5  || 6  || o  || 8  |
 		 ----  ----  ----  ---- 
		| 9  || o  || x  || 12 |
 		 ----  ----  ----  ---- 
		| x  || 14 || 15 || 16 |
 		 ----  ----  ----  ---- 
		 */ 
		assertEquals(true,result);
	}
}
