package org.example.xtend

class dummy {
	protected val readOnlyList = (1..5)
	var changeableList = (6..10)
	
	@Property
	var booleanProperty = false;
	
	new() {		
	}
	
	new(IntegerRange changeableList) {
		this.changeableList = changeableList
	}
	
	def void showValues() {
		showValues(readOnlyList)	
	}
	
	protected def void showValues(int[] array) {
		array.forEach[
			println("List content:" + it.intValue)
		]
	}
	
	def showEvenValues() {
		showDivideableValues(2)
	}
	
	def showOddValues() {
		showDivideableValues(2, false)
	}		
	
	def showDivideableValues(int value) {
		showDivideableValues(value, true)
	}
	
	protected def showDivideableValues(int value, boolean divideable) {
		readOnlyList.filter[
			if(divideable) {
				return it.intValue % value == 0
			}
			return it.intValue % value != 0
		].showValues
	}
}