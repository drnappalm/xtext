package org.example.xtend

class dummy {
	val readOnlyList = (1..50)
	
	def static void main(String[] args) {
		val dummy = new dummy
		dummy.printArray(dummy.readOnlyList)
	}
	
	def void printArray(int[] array) {
		array.forEach[
			println("List content:" + it.intValue)
		]
	}
}