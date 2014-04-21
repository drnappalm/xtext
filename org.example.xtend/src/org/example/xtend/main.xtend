package org.example.xtend

import static extension org.example.xtend.Helper.*

class main {
	
	def static void main(String[] args) {
		val dummy = new dummy
		val inverted = new inverteddummy
		println("VALUES LIST")
		dummy.showValues
		println("")
		inverted.showValues
		println("EVEN VALUES LIST")
		dummy.showEvenValues
		println("")
		inverted.showEvenValues
		println("ODD VALUES LIST")
		dummy.showOddValues
		println("")
		inverted.showOddValues
		
		println("EXT METHOD")
		dummy.showMultiply(5)
		inverted.showMultiply(10)
	}
}