/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicTypeImpl#getBaseType <em>Base Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicTypeImpl extends TypeImpl implements BasicType
{
  /**
   * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseType()
   * @generated
   * @ordered
   */
  protected TypeDecl baseType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicTypeImpl()
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
    return DeviceModelingLanguagePackage.Literals.BASIC_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl getBaseType()
  {
    if (baseType != null && baseType.eIsProxy())
    {
      InternalEObject oldBaseType = (InternalEObject)baseType;
      baseType = (TypeDecl)eResolveProxy(oldBaseType);
      if (baseType != oldBaseType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeviceModelingLanguagePackage.BASIC_TYPE__BASE_TYPE, oldBaseType, baseType));
      }
    }
    return baseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl basicGetBaseType()
  {
    return baseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseType(TypeDecl newBaseType)
  {
    TypeDecl oldBaseType = baseType;
    baseType = newBaseType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.BASIC_TYPE__BASE_TYPE, oldBaseType, baseType));
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
      case DeviceModelingLanguagePackage.BASIC_TYPE__BASE_TYPE:
        if (resolve) return getBaseType();
        return basicGetBaseType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DeviceModelingLanguagePackage.BASIC_TYPE__BASE_TYPE:
        setBaseType((TypeDecl)newValue);
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
      case DeviceModelingLanguagePackage.BASIC_TYPE__BASE_TYPE:
        setBaseType((TypeDecl)null);
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
      case DeviceModelingLanguagePackage.BASIC_TYPE__BASE_TYPE:
        return baseType != null;
    }
    return super.eIsSet(featureID);
  }

} //BasicTypeImpl
