/*
 * generated by Xtext
 */
package org.example.domainmodel.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractDomainmodelValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.example.domainmodel.domainmodel.DomainmodelPackage.eINSTANCE);
		return result;
	}
}