class Battle {
	
	def shotResult
	
	def setShootAtPosition(Position position) {
		shotResult = Game.board.shootAt(position)
	}
	
	def shipHit() {
		shotResult
	}
}

class PositionEditor extends java.beans.PropertyEditorSupport {

	String asText

	def getValue() {
		new Position(position: asText)
	}
}