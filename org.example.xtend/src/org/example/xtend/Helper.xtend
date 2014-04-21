package org.example.xtend

class Helper {
	def static showMultiply(dummy toMultiply, int factor) {
		toMultiply.showValues(toMultiply.readOnlyList.map[it.intValue * factor])
	}
}