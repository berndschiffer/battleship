class Fleet {

	final static SHIP_MARKER = 'X'
	def ships
	
	Fleet(data) {
		ships = data.collect { row -> 
			row*.equals(SHIP_MARKER)
		}
	}
	
	def hasShipAt(position) {
		use (Fleet) { ships[position.row][position.column] }
	}
	
	static def getColumn(String position) {
		position[0].asciiCode - 'A'.asciiCode
	}
	
	static def getRow(String position) {
		(position[1] as int) - 1
	}
	
	static getAsciiCode(String self) {
		(self as char) as int
	}
}