class SetUpBoard {
	
	def doTable(List<List<String>> table) {
		def data = table[1..-1].collect { row -> row[1..-1]}
		def builder = new BoardBuilder(from: data)
		Game.board = builder.build()
	}
}

class Game {
	static board
}