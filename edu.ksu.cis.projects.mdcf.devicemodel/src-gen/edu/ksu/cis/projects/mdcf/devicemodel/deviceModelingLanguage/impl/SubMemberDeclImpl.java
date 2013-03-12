/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MemberDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberDecl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Member Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberDeclImpl#getSupers <em>Supers</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubMemberDeclImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubMemberDeclImpl extends MemberDeclImpl implements SubMemberDecl
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSupers() <em>Supers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupers()
   * @generated
   * @ordered
   */
  protected EList<ComponentDecl> supers;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<MemberDecl> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubMemberDeclImpl()
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
    return DeviceModelingLanguagePackage.Literals.SUB_MEMBER_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.SUB_MEMBER_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentDecl> getSupers()
  {
    if (supers == null)
    {
      supers = new EObjectResolvingEList<ComponentDecl>(ComponentDecl.class, this, DeviceModelingLanguagePackage.SUB_MEMBER_DECL__SUPERS);
    }
    return supers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MemberDecl> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<MemberDecl>(MemberDecl.class, this, DeviceModelingLanguagePackage.SUB_MEMBER_DECL__MEMBERS);
    }
    return members;
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
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__NAME:
        return getName();
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__SUPERS:
        return getSupers();
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__MEMBERS:
        return getMembers();
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
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__NAME:
        setName((String)newValue);
        return;
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__SUPERS:
        getSupers().clear();
        getSupers().addAll((Collection<? extends ComponentDecl>)newValue);
        return;
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends MemberDecl>)newValue);
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
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__SUPERS:
        getSupers().clear();
        return;
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__MEMBERS:
        getMembers().clear();
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
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__SUPERS:
        return supers != null && !supers.isEmpty();
      case DeviceModelingLanguagePackage.SUB_MEMBER_DECL__MEMBERS:
        return members != null && !members.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SubMemberDeclImpl
