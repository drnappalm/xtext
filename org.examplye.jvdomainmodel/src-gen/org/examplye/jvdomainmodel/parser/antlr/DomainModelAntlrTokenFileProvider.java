/*
* generated by Xtext
*/
package org.examplye.jvdomainmodel.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DomainModelAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/examplye/jvdomainmodel/parser/antlr/internal/InternalDomainModel.tokens");
	}
}