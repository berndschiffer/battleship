class BoardBuilder {
	
	def from
	
	BoardBuilder(params) {
		from = [params.from]
	}
	
	def build() {
		def board = new Board()
		from[0].eachWithIndex { sign, index ->
			if (sign == 'X')
				board.setShipAt(new Ship(size: 1), new Position(column: ('A'..'Z')[index], row: 1))
		}
		board
	}
}