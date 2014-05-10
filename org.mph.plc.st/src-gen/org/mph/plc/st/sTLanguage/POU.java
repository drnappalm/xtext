/**
 */
package org.mph.plc.st.sTLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>POU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mph.plc.st.sTLanguage.POU#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mph.plc.st.sTLanguage.STLanguagePackage#getPOU()
 * @model
 * @generated
 */
public interface POU extends EObject
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(POU_BODY)
   * @see org.mph.plc.st.sTLanguage.STLanguagePackage#getPOU_Body()
   * @model containment="true"
   * @generated
   */
  POU_BODY getBody();

  /**
   * Sets the value of the '{@link org.mph.plc.st.sTLanguage.POU#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(POU_BODY value);

} // POU
