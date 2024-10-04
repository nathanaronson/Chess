// class: King.java
// written by: Nathan Aronson and Ryan Schaeffer
// date: Mar 22, 2022
// description: This class consists of the implementation of the King subclass.
public class King extends Piece {

	// packed constructor
	public King(int p) {
		super(p, 6, "king");
	}

	// default constructor
	public King() {
		this(0);
	}

	// checks if move is valid
	public boolean isValidMove(Location from, Location to, Piece[][]b){
		return super.isValidMove(from, to, b) && (Math.abs(from.getRow() - to.getRow()) < 2 && Math.abs(from.getColumn() - to.getColumn()) < 2);
	}

	// toString
	public String toString(){
		return "ki";
	}
}