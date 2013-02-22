/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupBody;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.GroupElementDecl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Group Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureGroupBodyImpl#getGroupElements <em>Group Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureGroupBodyImpl extends MinimalEObjectImpl.Container implements FeatureGroupBody
{
  /**
   * The cached value of the '{@link #getGroupElements() <em>Group Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupElements()
   * @generated
   * @ordered
   */
  protected EList<GroupElementDecl> groupElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureGroupBodyImpl()
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
    return DeviceModelingLanguagePackage.Literals.FEATURE_GROUP_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupElementDecl> getGroupElements()
  {
    if (groupElements == null)
    {
      groupElements = new EObjectContainmentEList<GroupElementDecl>(GroupElementDecl.class, this, DeviceModelingLanguagePackage.FEATURE_GROUP_BODY__GROUP_ELEMENTS);
    }
    return groupElements;
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
      case DeviceModelingLanguagePackage.FEATURE_GROUP_BODY__GROUP_ELEMENTS:
        return ((InternalEList<?>)getGroupElements()).basicRemove(otherEnd, msgs);
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
      case DeviceModelingLanguagePackage.FEATURE_GROUP_BODY__GROUP_ELEMENTS:
        return getGroupElements();
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
      case DeviceModelingLanguagePackage.FEATURE_GROUP_BODY__GROUP_ELEMENTS:
        getGroupElements().clear();
        getGroupElements().addAll((Collection<? extends GroupElementDecl>)newValue);
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
      case DeviceModelingLanguagePackage.FEATURE_GROUP_BODY__GROUP_ELEMENTS:
        getGroupElements().clear();
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
      case DeviceModelingLanguagePackage.FEATURE_GROUP_BODY__GROUP_ELEMENTS:
        return groupElements != null && !groupElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FeatureGroupBodyImpl
