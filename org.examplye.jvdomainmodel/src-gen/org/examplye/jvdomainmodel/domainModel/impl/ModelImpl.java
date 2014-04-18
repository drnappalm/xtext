/**
 */
package org.examplye.jvdomainmodel.domainModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtype.XImportSection;

import org.examplye.jvdomainmodel.domainModel.AbstractElement;
import org.examplye.jvdomainmodel.domainModel.DomainModelPackage;
import org.examplye.jvdomainmodel.domainModel.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.examplye.jvdomainmodel.domainModel.impl.ModelImpl#getInmportsSection <em>Inmports Section</em>}</li>
 *   <li>{@link org.examplye.jvdomainmodel.domainModel.impl.ModelImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getInmportsSection() <em>Inmports Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInmportsSection()
   * @generated
   * @ordered
   */
  protected XImportSection inmportsSection;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DomainModelPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XImportSection getInmportsSection()
  {
    return inmportsSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInmportsSection(XImportSection newInmportsSection, NotificationChain msgs)
  {
    XImportSection oldInmportsSection = inmportsSection;
    inmportsSection = newInmportsSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainModelPackage.MODEL__INMPORTS_SECTION, oldInmportsSection, newInmportsSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInmportsSection(XImportSection newInmportsSection)
  {
    if (newInmportsSection != inmportsSection)
    {
      NotificationChain msgs = null;
      if (inmportsSection != null)
        msgs = ((InternalEObject)inmportsSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainModelPackage.MODEL__INMPORTS_SECTION, null, msgs);
      if (newInmportsSection != null)
        msgs = ((InternalEObject)newInmportsSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainModelPackage.MODEL__INMPORTS_SECTION, null, msgs);
      msgs = basicSetInmportsSection(newInmportsSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainModelPackage.MODEL__INMPORTS_SECTION, newInmportsSection, newInmportsSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, DomainModelPackage.MODEL__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DomainModelPackage.MODEL__INMPORTS_SECTION:
        return basicSetInmportsSection(null, msgs);
      case DomainModelPackage.MODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainModelPackage.MODEL__INMPORTS_SECTION:
        return getInmportsSection();
      case DomainModelPackage.MODEL__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainModelPackage.MODEL__INMPORTS_SECTION:
        setInmportsSection((XImportSection)newValue);
        return;
      case DomainModelPackage.MODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends AbstractElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DomainModelPackage.MODEL__INMPORTS_SECTION:
        setInmportsSection((XImportSection)null);
        return;
      case DomainModelPackage.MODEL__ELEMENTS:
        getElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DomainModelPackage.MODEL__INMPORTS_SECTION:
        return inmportsSection != null;
      case DomainModelPackage.MODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
