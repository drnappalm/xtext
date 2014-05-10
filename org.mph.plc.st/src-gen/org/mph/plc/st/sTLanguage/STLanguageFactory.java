/**
 */
package org.mph.plc.st.sTLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mph.plc.st.sTLanguage.STLanguagePackage
 * @generated
 */
public interface STLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  STLanguageFactory eINSTANCE = org.mph.plc.st.sTLanguage.impl.STLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>POU</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>POU</em>'.
   * @generated
   */
  POU createPOU();

  /**
   * Returns a new object of class '<em>POU BODY</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>POU BODY</em>'.
   * @generated
   */
  POU_BODY createPOU_BODY();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  STLanguagePackage getSTLanguagePackage();

} //STLanguageFactory
