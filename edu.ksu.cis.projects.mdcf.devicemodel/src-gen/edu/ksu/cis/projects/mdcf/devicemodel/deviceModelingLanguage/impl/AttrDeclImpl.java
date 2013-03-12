/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.AttrDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Literal;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attr Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrDeclImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrDeclImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.AttrDeclImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttrDeclImpl extends MemberDeclImpl implements AttrDecl
{
  /**
   * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected static final String MODIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected String modifier = MODIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeName()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeName()
   * @generated
   * @ordered
   */
  protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected Literal literal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttrDeclImpl()
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
    return DeviceModelingLanguagePackage.Literals.ATTR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifier(String newModifier)
  {
    String oldModifier = modifier;
    modifier = newModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.ATTR_DECL__MODIFIER, oldModifier, modifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttributeName()
  {
    return attributeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeName(String newAttributeName)
  {
    String oldAttributeName = attributeName;
    attributeName = newAttributeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.ATTR_DECL__ATTRIBUTE_NAME, oldAttributeName, attributeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.ATTR_DECL__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.ATTR_DECL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.ATTR_DECL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.ATTR_DECL__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteral(Literal newLiteral, NotificationChain msgs)
  {
    Literal oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.ATTR_DECL__LITERAL, oldLiteral, newLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(Literal newLiteral)
  {
    if (newLiteral != literal)
    {
      NotificationChain msgs = null;
      if (literal != null)
        msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.ATTR_DECL__LITERAL, null, msgs);
      if (newLiteral != null)
        msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.ATTR_DECL__LITERAL, null, msgs);
      msgs = basicSetLiteral(newLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.ATTR_DECL__LITERAL, newLiteral, newLiteral));
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
      case DeviceModelingLanguagePackage.ATTR_DECL__TYPE:
        return basicSetType(null, msgs);
      case DeviceModelingLanguagePackage.ATTR_DECL__LITERAL:
        return basicSetLiteral(null, msgs);
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
      case DeviceModelingLanguagePackage.ATTR_DECL__MODIFIER:
        return getModifier();
      case DeviceModelingLanguagePackage.ATTR_DECL__ATTRIBUTE_NAME:
        return getAttributeName();
      case DeviceModelingLanguagePackage.ATTR_DECL__TYPE:
        return getType();
      case DeviceModelingLanguagePackage.ATTR_DECL__LITERAL:
        return getLiteral();
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
      case DeviceModelingLanguagePackage.ATTR_DECL__MODIFIER:
        setModifier((String)newValue);
        return;
      case DeviceModelingLanguagePackage.ATTR_DECL__ATTRIBUTE_NAME:
        setAttributeName((String)newValue);
        return;
      case DeviceModelingLanguagePackage.ATTR_DECL__TYPE:
        setType((Type)newValue);
        return;
      case DeviceModelingLanguagePackage.ATTR_DECL__LITERAL:
        setLiteral((Literal)newValue);
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
      case DeviceModelingLanguagePackage.ATTR_DECL__MODIFIER:
        setModifier(MODIFIER_EDEFAULT);
        return;
      case DeviceModelingLanguagePackage.ATTR_DECL__ATTRIBUTE_NAME:
        setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
        return;
      case DeviceModelingLanguagePackage.ATTR_DECL__TYPE:
        setType((Type)null);
        return;
      case DeviceModelingLanguagePackage.ATTR_DECL__LITERAL:
        setLiteral((Literal)null);
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
      case DeviceModelingLanguagePackage.ATTR_DECL__MODIFIER:
        return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
      case DeviceModelingLanguagePackage.ATTR_DECL__ATTRIBUTE_NAME:
        return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
      case DeviceModelingLanguagePackage.ATTR_DECL__TYPE:
        return type != null;
      case DeviceModelingLanguagePackage.ATTR_DECL__LITERAL:
        return literal != null;
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
    result.append(" (modifier: ");
    result.append(modifier);
    result.append(", attributeName: ");
    result.append(attributeName);
    result.append(')');
    return result.toString();
  }

} //AttrDeclImpl
