import org.junit.*

class StringCalculatorTests {
		
	@Test void addNumber() {
		given(
			'1': 1,
			'1,2': 3,
			'': 0,
			'1,10': 11,
			'1\n2,3': 6,
			'\\;\n1;2': 3
		).makeSureThat{ string, sum -> assert sum == add(string) }
	}
	
	def given(parameters) {
		[makeSureThat: { assertion -> parameters.each assertion }]
	}
	
	@Test void complainAboutNegatives() {
		given(
			'-1': '-1',
			'-1,-2': '-1, -2',
			'-1,-10': '-1, -10'
		).makeSureThat{ string, negatives -> assertAdditionFails string, negatives }
	}
	
	def assertAdditionFails(input, expected) {
		try{
			add(input)
			assert false
		}
		catch(IllegalArgumentException exception){
			assert "negatives not allowed: [$expected]" == exception.message
		}
	}
	
	def add(string) {
		if(!string) return 0
		def numbers = string.findAll(/-?\d+/)*.toInteger()
		checkNegatives(numbers)
		numbers.sum()
	}
	
	def checkNegatives(numbers) {
		def negatives = numbers.findAll{ it < 0 }
		if(negatives)
			throw new IllegalArgumentException("negatives not allowed: $negatives")
	}
}