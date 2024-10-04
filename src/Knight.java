// class: Knight.java
// written by: Nathan Aronson and Ryan Schaeffer
// date: Mar 22, 2022
// description: This class consists of the implementation of the Knight subclass.
public class Knight extends Piece {

	// packed constructor
	public Knight(int p) {
		super(p, 3, "knight");
	}

	// default constructor
	public Knight() {
		this(0);
	}

	// checks if move is valid
	public boolean isValidMove(Location from, Location to, Piece[][]b) {
		return super.isValidMove(from, to, b) && (Math.abs(from.getRow() - to.getRow()) * Math.abs(from.getColumn() - to.getColumn()) == 2);
	}

	// toString
	public String toString(){
		return "kn";
	}
}
