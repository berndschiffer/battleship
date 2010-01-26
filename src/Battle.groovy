class Battle {
	
	def setShootAtPosition(Position position) {
		println "--> ${position.position}"
	}
	
	def shipHit() {
		ShotResult.MISS
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