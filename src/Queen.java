// class: Queen.java
// written by: Nathan Aronson and Ryan Schaeffer
// date: Mar 22, 2022
// description: This class consists of the implementation of the Queen subclass.
public class Queen extends Piece {

	// packed constructor
	public Queen(int p) {
		super(p, 4, "queen");
	}

	// default constructor
	public Queen() {
		this(0);
	}

	// checks if move is valid
	public boolean isValidMove(Location from, Location to, Piece[][]b) {
		return !b[from.getRow()][from.getColumn()].equals(b[to.getRow()][to.getColumn()]) && (isValidHorizontalMove(from, to, b) || isValidVerticalMove(from, to, b) || isValidDiagonalMove(from, to, b));
	}

	// toString
	public String toString(){
		return "q";
	}
}