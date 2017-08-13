package game;

import java.util.Scanner;

public class Game {
	private Scanner sc;
	
	public static void main(String[] args){
		Game TicTacToe = new Game();
		TicTacToe.start();
	}
	
	/**
	 * start - Scans initial input and initializes
	 * players, TicTacToe game and calls play.
 	 */
	public void start(){
		sc = new Scanner(System.in);
		
		System.out.println("-------TicTacToe-------");
		
		System.out.println("Enter name for Player 1:");
		Player p1 = new Player(sc.nextLine(),'x');
		
		System.out.println("Enter name for Player 2:");
		Player p2 = new Player(sc.nextLine(),'o');
		
		System.out.println("Enter size of TicTacToe:");
		int n = sc.nextInt();
		TicTacToe game = new TicTacToe(n);
		
		play(game,p1,p2);
	}
	
	/**
	 * play - Keeps track of the playing player and waiting player
	 * checks for the validity of the value before placing the symbol.
	 * At the end of the turn, playing player and waiting player 
	 * exchange roles and this goes on till someone wins or game isFilled.
 	 */
	public void play(TicTacToe game, Player p1, Player p2){
		Player playing = p1;
		Player waiting = p2;
		int value = 0; 
		boolean flag = true;
		
		while(!game.isFilled()){
			String name = playing.getName();
			char symbol = playing.getSymbol();
			
			System.out.println(name + ", choose a box to place an '" + symbol + "' into:");
			value = sc.nextInt();
			
			if(game.isValid(value)){
				if(game.place(value, symbol)){
					System.out.println("Congratulations "+name+"! You have won.");
					flag = false;
					break;
				}
				Player p = playing;
				playing = waiting;
				waiting = p;
			}
			else
				System.out.println(name + ", please choose a valid place");
		}
		
		if(flag)
			System.out.println("It's a draw");
	}
}
