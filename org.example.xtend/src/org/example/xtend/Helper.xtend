package org.example.xtend

class Helper {
	def static showMultiply(dummy toMultiply, int factor) {
		toMultiply.showValues(toMultiply.readOnlyList.map[it.intValue * factor])
	}
	
	def static showNumber(Integer value) {
		println(value)
	}
	
	def static getEnumValue(int value) {
		switch value {
			case 1: DummyEnum.One
			case 2: DummyEnum.Two
			case 3: DummyEnum.Three
		}
	}
	
	def static showOperators() {
		var int1 = new Integer(150000)
		var int2 = new Integer(291001)
		
		println("OPERATORS")
		println("int1 == int1 -> " + (int1 == int1))
		println("int1 == 150000 -> " + (int1 == 150000))
		println("int1 != int1 -> " + (int1 != int1))
		println("int1 === int1 -> " + (int1 === int1))
		println("int1 === 150000 -> " + (int1 === 150000))
		println("int1 !== int1 -> " + (int1 !== int1))
		println("int1 -> int2 -> " + (int1 -> int2))
		println("int1 .. int2 -> " + (int1 .. int2))
		println("int1 >.. int2 -> " + (int1 >.. int2))
		println("int1 ..< int2 -> " + (int1 ..< int2))
		
		println(int1 + int2)
		println(int1 + int2)		
	}
	
	def static showInlineText(IntegerRange range) '''
		List of numbers:
		================
		«FOR i: range»
			«i»
		«ENDFOR»
	'''
}