import static Position.*
import org.junit.*

class BoardBuilderTest{
	
	@Test void buildsAnEmptyBoard() {
		def builder = new BoardBuilder(from: ' ')
		def board = builder.build()
		assert Ship.NONE == board.shipAt(position('A1'))
	}
	
	@Test void buildsOneShipOnBoard() {
		def builder = new BoardBuilder(from: 'X')
		def board = builder.build()		
		assert Ship.ofSize(1) == board.shipAt(position('A1'))
	}

	@Test void buildsOneShipOnBiggerBoard() {
		def builder = new BoardBuilder(from: ' X')
		def board = builder.build()		
		assert Ship.ofSize(1) == board.shipAt(position('B1'))
		assert Ship.NONE == board.shipAt(position('A1'))
	}

}