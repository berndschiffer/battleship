class SetUpEnemyFleet {
	
	def doTable(List<List<String>> table) {
		def fleetData = table[1..-1].collect { row -> row[1..-1]}
		new Fleet(fleetData)
	}
}