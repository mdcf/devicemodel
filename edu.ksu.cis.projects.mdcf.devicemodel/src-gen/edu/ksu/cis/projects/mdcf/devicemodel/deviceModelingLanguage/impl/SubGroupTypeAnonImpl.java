/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupBody;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureGroupDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubGroupTypeAnon;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Group Type Anon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeAnonImpl#getSupers <em>Supers</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubGroupTypeAnonImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubGroupTypeAnonImpl extends SubGroupTypeImpl implements SubGroupTypeAnon
{
  /**
   * The cached value of the '{@link #getSupers() <em>Supers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupers()
   * @generated
   * @ordered
   */
  protected EList<FeatureGroupDecl> supers;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected FeatureGroupBody body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubGroupTypeAnonImpl()
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
    return DeviceModelingLanguagePackage.Literals.SUB_GROUP_TYPE_ANON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureGroupDecl> getSupers()
  {
    if (supers == null)
    {
      supers = new EObjectResolvingEList<FeatureGroupDecl>(FeatureGroupDecl.class, this, DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__SUPERS);
    }
    return supers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(FeatureGroupBody newBody, NotificationChain msgs)
  {
    FeatureGroupBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(FeatureGroupBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__BODY, newBody, newBody));
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
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__BODY:
        return basicSetBody(null, msgs);
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
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__SUPERS:
        return getSupers();
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__BODY:
        return getBody();
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
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__SUPERS:
        getSupers().clear();
        getSupers().addAll((Collection<? extends FeatureGroupDecl>)newValue);
        return;
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__BODY:
        setBody((FeatureGroupBody)newValue);
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
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__SUPERS:
        getSupers().clear();
        return;
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__BODY:
        setBody((FeatureGroupBody)null);
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
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__SUPERS:
        return supers != null && !supers.isEmpty();
      case DeviceModelingLanguagePackage.SUB_GROUP_TYPE_ANON__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //SubGroupTypeAnonImpl
