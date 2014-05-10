/**
 */
package org.mph.plc.st.sTLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mph.plc.st.sTLanguage.STLanguageFactory;
import org.mph.plc.st.sTLanguage.STLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class STLanguagePackageImpl extends EPackageImpl implements STLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pouEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass poU_BODYEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.mph.plc.st.sTLanguage.STLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private STLanguagePackageImpl()
  {
    super(eNS_URI, STLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link STLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static STLanguagePackage init()
  {
    if (isInited) return (STLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(STLanguagePackage.eNS_URI);

    // Obtain or create and register package
    STLanguagePackageImpl theSTLanguagePackage = (STLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof STLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new STLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSTLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theSTLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSTLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(STLanguagePackage.eNS_URI, theSTLanguagePackage);
    return theSTLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPOU()
  {
    return pouEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPOU_Body()
  {
    return (EReference)pouEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPOU_BODY()
  {
    return poU_BODYEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPOU_BODY_Elements()
  {
    return (EAttribute)poU_BODYEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STLanguageFactory getSTLanguageFactory()
  {
    return (STLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pouEClass = createEClass(POU);
    createEReference(pouEClass, POU__BODY);

    poU_BODYEClass = createEClass(POU_BODY);
    createEAttribute(poU_BODYEClass, POU_BODY__ELEMENTS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(pouEClass, org.mph.plc.st.sTLanguage.POU.class, "POU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPOU_Body(), this.getPOU_BODY(), null, "body", null, 0, 1, org.mph.plc.st.sTLanguage.POU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(poU_BODYEClass, org.mph.plc.st.sTLanguage.POU_BODY.class, "POU_BODY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPOU_BODY_Elements(), ecorePackage.getEString(), "elements", null, 0, -1, org.mph.plc.st.sTLanguage.POU_BODY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //STLanguagePackageImpl
