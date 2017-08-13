package game;

public class Player {
	/**
	 * name - Name of the player.
	 * symbol - (x/o) Symbol that the player uses.
 	 */
	private String name;
	private char symbol;
	
	public Player(String name, char symbol){
		this.name = name;
		this.symbol = symbol;
	}
	
	public String getName() {
		return name;
	}
	public char getSymbol() {
		return symbol;
	}
}
