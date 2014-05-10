package org.mph.plc.st.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.mph.plc.st.sTLanguage.POU;
import org.mph.plc.st.sTLanguage.POU_BODY;
import org.mph.plc.st.sTLanguage.STLanguagePackage;
import org.mph.plc.st.services.STLanguageGrammarAccess;

@SuppressWarnings("all")
public class STLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private STLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == STLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case STLanguagePackage.POU:
				if(context == grammarAccess.getPOURule()) {
					sequence_POU(context, (POU) semanticObject); 
					return; 
				}
				else break;
			case STLanguagePackage.POU_BODY:
				if(context == grammarAccess.getPOU_BODYRule()) {
					sequence_POU_BODY(context, (POU_BODY) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     elements+=BODY_ELEMENT
	 */
	protected void sequence_POU_BODY(EObject context, POU_BODY semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     body=POU_BODY
	 */
	protected void sequence_POU(EObject context, POU semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, STLanguagePackage.Literals.POU__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, STLanguagePackage.Literals.POU__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPOUAccess().getBodyPOU_BODYParserRuleCall_0(), semanticObject.getBody());
		feeder.finish();
	}
}
