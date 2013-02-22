/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupAttrDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Literal;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Attr Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupAttrDeclImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupAttrDeclImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupAttrDeclImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.GroupAttrDeclImpl#getAttributeLiteral <em>Attribute Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupAttrDeclImpl extends GroupElementDeclImpl implements GroupAttrDecl
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
   * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeType()
   * @generated
   * @ordered
   */
  protected Type attributeType;

  /**
   * The cached value of the '{@link #getAttributeLiteral() <em>Attribute Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeLiteral()
   * @generated
   * @ordered
   */
  protected Literal attributeLiteral;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupAttrDeclImpl()
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
    return DeviceModelingLanguagePackage.Literals.GROUP_ATTR_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.GROUP_ATTR_DECL__MODIFIER, oldModifier, modifier));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_NAME, oldAttributeName, attributeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getAttributeType()
  {
    return attributeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeType(Type newAttributeType, NotificationChain msgs)
  {
    Type oldAttributeType = attributeType;
    attributeType = newAttributeType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_TYPE, oldAttributeType, newAttributeType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeType(Type newAttributeType)
  {
    if (newAttributeType != attributeType)
    {
      NotificationChain msgs = null;
      if (attributeType != null)
        msgs = ((InternalEObject)attributeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_TYPE, null, msgs);
      if (newAttributeType != null)
        msgs = ((InternalEObject)newAttributeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_TYPE, null, msgs);
      msgs = basicSetAttributeType(newAttributeType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_TYPE, newAttributeType, newAttributeType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getAttributeLiteral()
  {
    return attributeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeLiteral(Literal newAttributeLiteral, NotificationChain msgs)
  {
    Literal oldAttributeLiteral = attributeLiteral;
    attributeLiteral = newAttributeLiteral;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_LITERAL, oldAttributeLiteral, newAttributeLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeLiteral(Literal newAttributeLiteral)
  {
    if (newAttributeLiteral != attributeLiteral)
    {
      NotificationChain msgs = null;
      if (attributeLiteral != null)
        msgs = ((InternalEObject)attributeLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_LITERAL, null, msgs);
      if (newAttributeLiteral != null)
        msgs = ((InternalEObject)newAttributeLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_LITERAL, null, msgs);
      msgs = basicSetAttributeLiteral(newAttributeLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_LITERAL, newAttributeLiteral, newAttributeLiteral));
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
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_TYPE:
        return basicSetAttributeType(null, msgs);
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_LITERAL:
        return basicSetAttributeLiteral(null, msgs);
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
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__MODIFIER:
        return getModifier();
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_NAME:
        return getAttributeName();
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_TYPE:
        return getAttributeType();
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_LITERAL:
        return getAttributeLiteral();
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
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__MODIFIER:
        setModifier((String)newValue);
        return;
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_NAME:
        setAttributeName((String)newValue);
        return;
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_TYPE:
        setAttributeType((Type)newValue);
        return;
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_LITERAL:
        setAttributeLiteral((Literal)newValue);
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
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__MODIFIER:
        setModifier(MODIFIER_EDEFAULT);
        return;
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_NAME:
        setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
        return;
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_TYPE:
        setAttributeType((Type)null);
        return;
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_LITERAL:
        setAttributeLiteral((Literal)null);
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
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__MODIFIER:
        return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_NAME:
        return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_TYPE:
        return attributeType != null;
      case DeviceModelingLanguagePackage.GROUP_ATTR_DECL__ATTRIBUTE_LITERAL:
        return attributeLiteral != null;
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

} //GroupAttrDeclImpl
