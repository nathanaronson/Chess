// class: Location.java
// written by: Thomas Swope
// date: Mar 22, 2022
// description: This class consists of the implementation of the Location class.
public class Location {

	// instance variables
	public int row;
	public int column;

	// default constructor
	public Location(){
		this(0,0);
	}

	// packed constructor
	public Location(int r, int c){
		row = r;
		column = c;
	}

	// returns the row
	public int getRow(){
		return row;
	}

	// returns the column
	public int getColumn(){
		return column;
	}

	// changes the row
	public void setRow(int r){
		row = r;
	}

	// changes the column
	public void setColumn(int c){
		column = c;
	}
}
