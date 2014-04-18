package org.example.domainmodel.tests

import static org.junit.Assert.*

import org.eclipse.xtext.junit4.InjectWith
import org.example.domainmodel.DomainmodelInjectorProvider
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import javax.inject.Inject
import org.example.domainmodel.domainmodel.Domainmodel
import org.junit.Test
import org.example.domainmodel.domainmodel.Entity


@InjectWith(DomainmodelInjectorProvider)
@RunWith(XtextRunner)
class ParserTest {
	
	@Inject
	ParseHelper<Domainmodel> parser
	
	@Test
	def void parseModel() {
		val modelText = "entity MyEntity { parent: MyEntity }"
		val model = parser.parse(modelText)
		val entity = model.elements.head as Entity
		assertSame(entity, entity.features.head.type)
	}
}