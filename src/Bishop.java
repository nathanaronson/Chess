// class: Bishop.java
// written by: Nathan Aronson and Ryan Schaeffer
// date: Mar 22, 2022
// description: This class consists of the implementation of the Bishop subclass.
public class Bishop extends Piece
{	
	// packed constructor
	public Bishop(int p){
		super(p, 5, "bishop");
	}

	// default constructor
	public Bishop(){
		this(1);
	}

	// check to see if the move is valid, and then sets x and y coordinates to new values.
	// returns true if move was valid, and false if it was not valid.
	public boolean isValidMove(Location from, Location to, Piece[][]b) {
		return isValidDiagonalMove(from, to, b) && !b[from.getRow()][from.getColumn()].equals(b[to.getRow()][to.getColumn()]);
	}

	// toString
	public String toString(){
		return "b";
	}
}