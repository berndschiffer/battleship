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