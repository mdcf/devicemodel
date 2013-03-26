/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SeqFeatureType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seq Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqFeatureTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SeqFeatureTypeImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeqFeatureTypeImpl extends FeatureTypeImpl implements SeqFeatureType
{
  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected BaseFeatureType base;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<BaseFeatureType> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeqFeatureTypeImpl()
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
    return DeviceModelingLanguagePackage.Literals.SEQ_FEATURE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseFeatureType getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBase(BaseFeatureType newBase, NotificationChain msgs)
  {
    BaseFeatureType oldBase = base;
    base = newBase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__BASE, oldBase, newBase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(BaseFeatureType newBase)
  {
    if (newBase != base)
    {
      NotificationChain msgs = null;
      if (base != null)
        msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__BASE, null, msgs);
      if (newBase != null)
        msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__BASE, null, msgs);
      msgs = basicSetBase(newBase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__BASE, newBase, newBase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BaseFeatureType> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<BaseFeatureType>(BaseFeatureType.class, this, DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__ELEMENTS);
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
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__BASE:
        return basicSetBase(null, msgs);
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__ELEMENTS:
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
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__BASE:
        return getBase();
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__ELEMENTS:
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
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__BASE:
        setBase((BaseFeatureType)newValue);
        return;
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends BaseFeatureType>)newValue);
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
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__BASE:
        setBase((BaseFeatureType)null);
        return;
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__ELEMENTS:
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
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__BASE:
        return base != null;
      case DeviceModelingLanguagePackage.SEQ_FEATURE_TYPE__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SeqFeatureTypeImpl
