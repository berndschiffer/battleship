import static Position.*
import org.junit.*
//import org.gmock.WithGMock
import groovy.mock.interceptor.*

//@WithGMock
class BoardBuilderTest{
	
	@Test void buildsAnEmptyBoard() {
		def builder = new BoardBuilder(from: ' ')
		def board = builder.build()
		assert Ship.NONE == board.shipAt(Position.A1)
	}
	
	@Test void buildsOneShipOnBoard() {
		def builder = new BoardBuilder(from: 'X')
		def board = builder.build()		
		assert Ship.ofSize(1) == board.shipAt(Position.A1)
	}

	@Test void buildsOneShipOnBiggerBoard() {
		def builder = new BoardBuilder(from: ' X')
		def board = builder.build()		
		assert Ship.ofSize(1) == board.shipAt(Position.B1)
		assert Ship.NONE == board.shipAt(Position.A1)
	}
	
	//@Test 
	void aGMockTest() {
		def mockBoard = mock() 
		mockBoard.shipAt(Position.A1).returns Ship.NONE
		play {
			assert Ship.NONE == mockBoard.shipAt(Position.A1)
		}
	}

	@Test void aMockForTest() {
		def boardMocker = new MockFor(Board)
		boardMocker.demand.shipAt {position -> Ship.NONE} 
		boardMocker.use {
			assert Ship.NONE == new Board().shipAt(Position.A1)
		}
	}

}