class Board {
	
	def ships = [:]
	
	def shootAt(position) {
		ShotResult.MISS
	}
	
	def setShipAt(ship, position) {
		ships[position] = ship
	}
	
	def shipAt(position) {
		ships[position] ?: Ship.NONE
	}
}