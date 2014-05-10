/**
 */
package org.mph.plc.st.sTLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mph.plc.st.sTLanguage.STLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface STLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sTLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mph.org/plc/st/STLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sTLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  STLanguagePackage eINSTANCE = org.mph.plc.st.sTLanguage.impl.STLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.mph.plc.st.sTLanguage.impl.POUImpl <em>POU</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mph.plc.st.sTLanguage.impl.POUImpl
   * @see org.mph.plc.st.sTLanguage.impl.STLanguagePackageImpl#getPOU()
   * @generated
   */
  int POU = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POU__BODY = 0;

  /**
   * The number of structural features of the '<em>POU</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POU_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.mph.plc.st.sTLanguage.impl.POU_BODYImpl <em>POU BODY</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mph.plc.st.sTLanguage.impl.POU_BODYImpl
   * @see org.mph.plc.st.sTLanguage.impl.STLanguagePackageImpl#getPOU_BODY()
   * @generated
   */
  int POU_BODY = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POU_BODY__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>POU BODY</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POU_BODY_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.mph.plc.st.sTLanguage.POU <em>POU</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>POU</em>'.
   * @see org.mph.plc.st.sTLanguage.POU
   * @generated
   */
  EClass getPOU();

  /**
   * Returns the meta object for the containment reference '{@link org.mph.plc.st.sTLanguage.POU#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.mph.plc.st.sTLanguage.POU#getBody()
   * @see #getPOU()
   * @generated
   */
  EReference getPOU_Body();

  /**
   * Returns the meta object for class '{@link org.mph.plc.st.sTLanguage.POU_BODY <em>POU BODY</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>POU BODY</em>'.
   * @see org.mph.plc.st.sTLanguage.POU_BODY
   * @generated
   */
  EClass getPOU_BODY();

  /**
   * Returns the meta object for the attribute list '{@link org.mph.plc.st.sTLanguage.POU_BODY#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elements</em>'.
   * @see org.mph.plc.st.sTLanguage.POU_BODY#getElements()
   * @see #getPOU_BODY()
   * @generated
   */
  EAttribute getPOU_BODY_Elements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  STLanguageFactory getSTLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.mph.plc.st.sTLanguage.impl.POUImpl <em>POU</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mph.plc.st.sTLanguage.impl.POUImpl
     * @see org.mph.plc.st.sTLanguage.impl.STLanguagePackageImpl#getPOU()
     * @generated
     */
    EClass POU = eINSTANCE.getPOU();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POU__BODY = eINSTANCE.getPOU_Body();

    /**
     * The meta object literal for the '{@link org.mph.plc.st.sTLanguage.impl.POU_BODYImpl <em>POU BODY</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mph.plc.st.sTLanguage.impl.POU_BODYImpl
     * @see org.mph.plc.st.sTLanguage.impl.STLanguagePackageImpl#getPOU_BODY()
     * @generated
     */
    EClass POU_BODY = eINSTANCE.getPOU_BODY();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POU_BODY__ELEMENTS = eINSTANCE.getPOU_BODY_Elements();

  }

} //STLanguagePackage
