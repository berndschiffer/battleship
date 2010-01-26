@Immutable class Position {	
	
	String column
	String row
	
	static position(string) {
		new Position(column: string[0], row: string[1..-1])
	}
	
	String toString() {
		"${this.class.name}: column: $column, row: $row"
	}
}