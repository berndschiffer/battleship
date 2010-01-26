class Battle {
	
	def shotResult
	
	def setShootAtPosition(Position position) {
		shotResult = Game.board.shootAt(position)
	}
	
	def shipHit() {
		shotResult
	}
}

class Position {	
	def position
} 

class PositionEditor extends java.beans.PropertyEditorSupport {

	String asText

	def getValue() {
		new Position(position: asText)
	}
}
	
enum ShotResult {

	MISS('missed')

	def text

	private ShotResult(text) {
		this.text = text
	}

	String toString() {
		text
	}
}