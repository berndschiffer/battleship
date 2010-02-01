import org.junit.*

class FleetTest {
	
	static fleetData2ShipRequest = [
		[["X"]]: ["A1", true],
		[[" "]]: ["A1", false],
		[[" ", "X"]]: ["B1", true],
	]
	
	@Test void withShipOfSizeOne() {
		fleetData2ShipRequest.each{ fleetData, shipRequest -> 
			def fleet = new Fleet(fleetData)
			assert shipRequest[1] == fleet.hasShipAt(shipRequest[0])
		}
	}
} 