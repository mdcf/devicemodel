/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MemberDecl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ComponentDeclImpl#getSupers <em>Supers</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ComponentDeclImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentDeclImpl extends DeclImpl implements ComponentDecl
{
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
  protected ComponentDeclImpl()
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
    return DeviceModelingLanguagePackage.Literals.COMPONENT_DECL;
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
      supers = new EObjectResolvingEList<ComponentDecl>(ComponentDecl.class, this, DeviceModelingLanguagePackage.COMPONENT_DECL__SUPERS);
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
      members = new EObjectContainmentEList<MemberDecl>(MemberDecl.class, this, DeviceModelingLanguagePackage.COMPONENT_DECL__MEMBERS);
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
      case DeviceModelingLanguagePackage.COMPONENT_DECL__MEMBERS:
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
      case DeviceModelingLanguagePackage.COMPONENT_DECL__SUPERS:
        return getSupers();
      case DeviceModelingLanguagePackage.COMPONENT_DECL__MEMBERS:
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
      case DeviceModelingLanguagePackage.COMPONENT_DECL__SUPERS:
        getSupers().clear();
        getSupers().addAll((Collection<? extends ComponentDecl>)newValue);
        return;
      case DeviceModelingLanguagePackage.COMPONENT_DECL__MEMBERS:
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
      case DeviceModelingLanguagePackage.COMPONENT_DECL__SUPERS:
        getSupers().clear();
        return;
      case DeviceModelingLanguagePackage.COMPONENT_DECL__MEMBERS:
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
      case DeviceModelingLanguagePackage.COMPONENT_DECL__SUPERS:
        return supers != null && !supers.isEmpty();
      case DeviceModelingLanguagePackage.COMPONENT_DECL__MEMBERS:
        return members != null && !members.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComponentDeclImpl
