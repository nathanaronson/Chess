// class: Rook.java
// written by: Nathan Aronson and Ryan Schaeffer
// date: Mar 22, 2022
// description: This class consists of the implementation of the Rook subclass.
public class Rook extends Piece {

	// packed constructor
	public Rook(int p) {
		super(p, 12, "rook");
	}

	// default constructor
	public Rook() {
		this(0);
	}

	// checks if move is valid
	public boolean isValidMove(Location from, Location to, Piece[][]b) {
		return !b[from.getRow()][from.getColumn()].equals(b[to.getRow()][to.getColumn()]) && (isValidHorizontalMove(from, to, b) || isValidVerticalMove(from, to, b));
	}

	// toString
	public String toString(){
		return "r";
	}
}