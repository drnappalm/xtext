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
}