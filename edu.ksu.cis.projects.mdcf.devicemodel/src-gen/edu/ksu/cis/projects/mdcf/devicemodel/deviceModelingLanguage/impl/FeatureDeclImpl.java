/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Assignment;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Device;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Exp;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.FeatureDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MemberDecl;

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
 * An implementation of the model object '<em><b>Feature Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureDeclImpl#getSupers <em>Supers</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureDeclImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureDeclImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureDeclImpl#getAssigns <em>Assigns</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.FeatureDeclImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureDeclImpl extends DeclImpl implements FeatureDecl
{
  /**
   * The cached value of the '{@link #getSupers() <em>Supers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupers()
   * @generated
   * @ordered
   */
  protected EList<FeatureDecl> supers;

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
   * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevices()
   * @generated
   * @ordered
   */
  protected EList<Device> devices;

  /**
   * The cached value of the '{@link #getAssigns() <em>Assigns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssigns()
   * @generated
   * @ordered
   */
  protected EList<Assignment> assigns;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Exp exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureDeclImpl()
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
    return DeviceModelingLanguagePackage.Literals.FEATURE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureDecl> getSupers()
  {
    if (supers == null)
    {
      supers = new EObjectResolvingEList<FeatureDecl>(FeatureDecl.class, this, DeviceModelingLanguagePackage.FEATURE_DECL__SUPERS);
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
      members = new EObjectContainmentEList<MemberDecl>(MemberDecl.class, this, DeviceModelingLanguagePackage.FEATURE_DECL__MEMBERS);
    }
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Device> getDevices()
  {
    if (devices == null)
    {
      devices = new EObjectContainmentEList<Device>(Device.class, this, DeviceModelingLanguagePackage.FEATURE_DECL__DEVICES);
    }
    return devices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assignment> getAssigns()
  {
    if (assigns == null)
    {
      assigns = new EObjectContainmentEList<Assignment>(Assignment.class, this, DeviceModelingLanguagePackage.FEATURE_DECL__ASSIGNS);
    }
    return assigns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Exp newExp, NotificationChain msgs)
  {
    Exp oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.FEATURE_DECL__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(Exp newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.FEATURE_DECL__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.FEATURE_DECL__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.FEATURE_DECL__EXP, newExp, newExp));
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
      case DeviceModelingLanguagePackage.FEATURE_DECL__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
      case DeviceModelingLanguagePackage.FEATURE_DECL__DEVICES:
        return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
      case DeviceModelingLanguagePackage.FEATURE_DECL__ASSIGNS:
        return ((InternalEList<?>)getAssigns()).basicRemove(otherEnd, msgs);
      case DeviceModelingLanguagePackage.FEATURE_DECL__EXP:
        return basicSetExp(null, msgs);
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
      case DeviceModelingLanguagePackage.FEATURE_DECL__SUPERS:
        return getSupers();
      case DeviceModelingLanguagePackage.FEATURE_DECL__MEMBERS:
        return getMembers();
      case DeviceModelingLanguagePackage.FEATURE_DECL__DEVICES:
        return getDevices();
      case DeviceModelingLanguagePackage.FEATURE_DECL__ASSIGNS:
        return getAssigns();
      case DeviceModelingLanguagePackage.FEATURE_DECL__EXP:
        return getExp();
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
      case DeviceModelingLanguagePackage.FEATURE_DECL__SUPERS:
        getSupers().clear();
        getSupers().addAll((Collection<? extends FeatureDecl>)newValue);
        return;
      case DeviceModelingLanguagePackage.FEATURE_DECL__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends MemberDecl>)newValue);
        return;
      case DeviceModelingLanguagePackage.FEATURE_DECL__DEVICES:
        getDevices().clear();
        getDevices().addAll((Collection<? extends Device>)newValue);
        return;
      case DeviceModelingLanguagePackage.FEATURE_DECL__ASSIGNS:
        getAssigns().clear();
        getAssigns().addAll((Collection<? extends Assignment>)newValue);
        return;
      case DeviceModelingLanguagePackage.FEATURE_DECL__EXP:
        setExp((Exp)newValue);
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
      case DeviceModelingLanguagePackage.FEATURE_DECL__SUPERS:
        getSupers().clear();
        return;
      case DeviceModelingLanguagePackage.FEATURE_DECL__MEMBERS:
        getMembers().clear();
        return;
      case DeviceModelingLanguagePackage.FEATURE_DECL__DEVICES:
        getDevices().clear();
        return;
      case DeviceModelingLanguagePackage.FEATURE_DECL__ASSIGNS:
        getAssigns().clear();
        return;
      case DeviceModelingLanguagePackage.FEATURE_DECL__EXP:
        setExp((Exp)null);
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
      case DeviceModelingLanguagePackage.FEATURE_DECL__SUPERS:
        return supers != null && !supers.isEmpty();
      case DeviceModelingLanguagePackage.FEATURE_DECL__MEMBERS:
        return members != null && !members.isEmpty();
      case DeviceModelingLanguagePackage.FEATURE_DECL__DEVICES:
        return devices != null && !devices.isEmpty();
      case DeviceModelingLanguagePackage.FEATURE_DECL__ASSIGNS:
        return assigns != null && !assigns.isEmpty();
      case DeviceModelingLanguagePackage.FEATURE_DECL__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

} //FeatureDeclImpl
