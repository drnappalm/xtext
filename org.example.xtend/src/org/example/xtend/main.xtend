package org.example.xtend

import static extension org.example.xtend.Helper.*
import static extension java.util.Collections.*

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
		
		println("ARRAYS/COLLECTIONS")
		val array = #[1,2,3]
		println("Inmutable: " + array.join)
		val int[] intArray = newIntArrayOfSize(3)
		println("Inmutable: " + intArray.join)
		val set = #{1,2,3}
		println("Inmutable: " + set.join)
		val map = #{1->1,2->2,3->3}
		println("Inmutable: " + map.keySet.join + "," + map.values.join)
		val list = newArrayList(1, 2, 3)
		println("Mutable: " + list.join)
		list.add(4)
		println("Mutable: " + list.join)
		
		println("TYPED NULL")
		val typedNull = null as dummy
		println("It is still null not dummy: " + (typedNull instanceof dummy))
		
		showOperators
		
		println("INLINE TEXT")
		println(showInlineText(1..10))
	}
}