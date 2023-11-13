package thuchanh6;

public class Queen {
	private int row;
	private int column;

	public Queen(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}

	public void move() {
		row++;
		if (row == Node.N) {
			row = 0;
		}
	}

	// check whether this Queen can attack the given Queen (q)
	public boolean isConflict(Queen q) {
		if (row == q.getRow()) {
			return true;
		} else if (Math.abs(column - q.getRow()) == Math.abs(row) - q.getColumn()) {
			return true;
		}

		return false;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public void setRow(int row) {
		this.row = row;
	}

	@Override
	public String toString() {
		return "(" + row + ", " + column + ")";
	}
}
