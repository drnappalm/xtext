package org.example.xtend

import org.example.xtend.dummy

class inverteddummy extends dummy {
	
	new() {		
	}
	
	new(IntegerRange changeableList) {
		super(changeableList)
	}
	
	override protected showValues(int[] array) {
		super.showValues(array.reverse)
	}
	
	override protected showDivideableValues(int value, boolean divideable) {
		super.showDivideableValues(value, !divideable) 
	}	
}