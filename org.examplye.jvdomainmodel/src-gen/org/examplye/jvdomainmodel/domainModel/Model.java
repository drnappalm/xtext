/**
 */
package org.examplye.jvdomainmodel.domainModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.examplye.jvdomainmodel.domainModel.Model#getInmportsSection <em>Inmports Section</em>}</li>
 *   <li>{@link org.examplye.jvdomainmodel.domainModel.Model#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.examplye.jvdomainmodel.domainModel.DomainModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Inmports Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inmports Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inmports Section</em>' containment reference.
   * @see #setInmportsSection(XImportSection)
   * @see org.examplye.jvdomainmodel.domainModel.DomainModelPackage#getModel_InmportsSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getInmportsSection();

  /**
   * Sets the value of the '{@link org.examplye.jvdomainmodel.domainModel.Model#getInmportsSection <em>Inmports Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inmports Section</em>' containment reference.
   * @see #getInmportsSection()
   * @generated
   */
  void setInmportsSection(XImportSection value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.examplye.jvdomainmodel.domainModel.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.examplye.jvdomainmodel.domainModel.DomainModelPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // Model
