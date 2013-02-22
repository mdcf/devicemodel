/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BasicLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicLiteralImpl#getTypeCons <em>Type Cons</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.BasicLiteralImpl#getLit <em>Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicLiteralImpl extends LiteralImpl implements BasicLiteral
{
  /**
   * The cached value of the '{@link #getTypeCons() <em>Type Cons</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeCons()
   * @generated
   * @ordered
   */
  protected TypeDecl typeCons;

  /**
   * The default value of the '{@link #getLit() <em>Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLit()
   * @generated
   * @ordered
   */
  protected static final String LIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLit() <em>Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLit()
   * @generated
   * @ordered
   */
  protected String lit = LIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicLiteralImpl()
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
    return DeviceModelingLanguagePackage.Literals.BASIC_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl getTypeCons()
  {
    if (typeCons != null && typeCons.eIsProxy())
    {
      InternalEObject oldTypeCons = (InternalEObject)typeCons;
      typeCons = (TypeDecl)eResolveProxy(oldTypeCons);
      if (typeCons != oldTypeCons)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeviceModelingLanguagePackage.BASIC_LITERAL__TYPE_CONS, oldTypeCons, typeCons));
      }
    }
    return typeCons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl basicGetTypeCons()
  {
    return typeCons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeCons(TypeDecl newTypeCons)
  {
    TypeDecl oldTypeCons = typeCons;
    typeCons = newTypeCons;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.BASIC_LITERAL__TYPE_CONS, oldTypeCons, typeCons));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLit()
  {
    return lit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLit(String newLit)
  {
    String oldLit = lit;
    lit = newLit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.BASIC_LITERAL__LIT, oldLit, lit));
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
      case DeviceModelingLanguagePackage.BASIC_LITERAL__TYPE_CONS:
        if (resolve) return getTypeCons();
        return basicGetTypeCons();
      case DeviceModelingLanguagePackage.BASIC_LITERAL__LIT:
        return getLit();
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
      case DeviceModelingLanguagePackage.BASIC_LITERAL__TYPE_CONS:
        setTypeCons((TypeDecl)newValue);
        return;
      case DeviceModelingLanguagePackage.BASIC_LITERAL__LIT:
        setLit((String)newValue);
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
      case DeviceModelingLanguagePackage.BASIC_LITERAL__TYPE_CONS:
        setTypeCons((TypeDecl)null);
        return;
      case DeviceModelingLanguagePackage.BASIC_LITERAL__LIT:
        setLit(LIT_EDEFAULT);
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
      case DeviceModelingLanguagePackage.BASIC_LITERAL__TYPE_CONS:
        return typeCons != null;
      case DeviceModelingLanguagePackage.BASIC_LITERAL__LIT:
        return LIT_EDEFAULT == null ? lit != null : !LIT_EDEFAULT.equals(lit);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (lit: ");
    result.append(lit);
    result.append(')');
    return result.toString();
  }

} //BasicLiteralImpl
