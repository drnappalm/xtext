/**
 */
package org.mph.plc.st.sTLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mph.plc.st.sTLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class STLanguageFactoryImpl extends EFactoryImpl implements STLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static STLanguageFactory init()
  {
    try
    {
      STLanguageFactory theSTLanguageFactory = (STLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(STLanguagePackage.eNS_URI);
      if (theSTLanguageFactory != null)
      {
        return theSTLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new STLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case STLanguagePackage.POU: return createPOU();
      case STLanguagePackage.POU_BODY: return createPOU_BODY();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POU createPOU()
  {
    POUImpl pou = new POUImpl();
    return pou;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POU_BODY createPOU_BODY()
  {
    POU_BODYImpl poU_BODY = new POU_BODYImpl();
    return poU_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STLanguagePackage getSTLanguagePackage()
  {
    return (STLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static STLanguagePackage getPackage()
  {
    return STLanguagePackage.eINSTANCE;
  }

} //STLanguageFactoryImpl
