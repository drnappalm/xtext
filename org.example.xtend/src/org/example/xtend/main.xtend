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
		
		println("ELVIS")
		dummy.printElvis
		
		println("NULL OR NOT?")
		dummy.nullProof
		
		println("ENUMERATION")
		println("1-" + 1.enumValue + " | 2-" + 2.enumValue + " | 3-" + 3.enumValue)
		
		println("EXPRESSIONS")
		println(try { "No exception" } catch (Exception e) {})
		println(try { throw new Exception() } catch (Exception e) {"Exception"})
	}
}