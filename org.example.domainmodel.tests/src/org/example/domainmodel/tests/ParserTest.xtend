package org.example.domainmodel.tests

import org.eclipse.xtext.junit4.InjectWith
import org.example.domainmodel.DomainmodelInjectorProvider
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import javax.inject.Inject
import org.example.domainmodel.domainmodel.Domainmodel
import org.junit.Test

@InjectWith(DomainmodelInjectorProvider)
@RunWith(XtextRunner)
class ParserTest {
	
	@Inject
	ParseHelper<Domainmodel> parser
	
	@Test
	def void parseModel() {
		val modelText = ""
		val expected = null
		val model = parser.parse();
		
	}
}