package org.example.xtend

import static extension org.example.xtend.Helper.*
import org.example.xtend.FieldClass

class dummy implements IDummy {
	protected val readOnlyList = (1..5)
	var changeableList = (6..10)
	extension FieldClass field = new FieldClass
	
	@Property
	var booleanProperty = false;
	
	new() {
		this.ok // extension from FieldClass (field)		
	}
	
	new(IntegerRange changeableList) {
		this.changeableList = changeableList
	}
	
	override void showValues() {
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
	
	def printElvis() {
		val nullInt = (null as Integer)
		val nonNullInt = new Integer(5)
		println("Is Elvis in the haus? (null ?: ) - " + nullInt ?: "YEAHHHH!!!")
		println("Is Elvis in the haus? (not null ?:) - " + nonNullInt ?: "YEAHHHH!!!")
	}
	
	def nullProof() {
		val nullInt = (null as Integer)
		val nonNullInt = new Integer(5)
		nullInt?.showNumber
		nonNullInt?.showNumber
	}
}
