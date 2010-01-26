class Ship {
	
	final static NONE = new Ship(size: 0)
	
	def size
	
	boolean equals(other) {
		size == other.size
	}
	
	static ofSize(size) {
		new Ship(size: size)
	}
	
	String toString() {
		"${this.class.name}: $size"
	}
}