/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.BaseFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.EitherFeatureType;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MemberDecl;

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
 * An implementation of the model object '<em><b>Either Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.EitherFeatureTypeImpl#getBases <em>Bases</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.EitherFeatureTypeImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.EitherFeatureTypeImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EitherFeatureTypeImpl extends FeatureTypeImpl implements EitherFeatureType
{
  /**
   * The cached value of the '{@link #getBases() <em>Bases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBases()
   * @generated
   * @ordered
   */
  protected EList<BaseFeatureType> bases;

  /**
   * The default value of the '{@link #getChoice() <em>Choice</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoice()
   * @generated
   * @ordered
   */
  protected static final String CHOICE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChoice() <em>Choice</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoice()
   * @generated
   * @ordered
   */
  protected String choice = CHOICE_EDEFAULT;

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
  protected EitherFeatureTypeImpl()
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
    return DeviceModelingLanguagePackage.Literals.EITHER_FEATURE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BaseFeatureType> getBases()
  {
    if (bases == null)
    {
      bases = new EObjectContainmentEList<BaseFeatureType>(BaseFeatureType.class, this, DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__BASES);
    }
    return bases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChoice()
  {
    return choice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChoice(String newChoice)
  {
    String oldChoice = choice;
    choice = newChoice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__CHOICE, oldChoice, choice));
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
      members = new EObjectContainmentEList<MemberDecl>(MemberDecl.class, this, DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__MEMBERS);
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
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__BASES:
        return ((InternalEList<?>)getBases()).basicRemove(otherEnd, msgs);
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__MEMBERS:
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
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__BASES:
        return getBases();
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__CHOICE:
        return getChoice();
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__MEMBERS:
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
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__BASES:
        getBases().clear();
        getBases().addAll((Collection<? extends BaseFeatureType>)newValue);
        return;
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__CHOICE:
        setChoice((String)newValue);
        return;
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__MEMBERS:
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
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__BASES:
        getBases().clear();
        return;
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__CHOICE:
        setChoice(CHOICE_EDEFAULT);
        return;
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__MEMBERS:
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
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__BASES:
        return bases != null && !bases.isEmpty();
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__CHOICE:
        return CHOICE_EDEFAULT == null ? choice != null : !CHOICE_EDEFAULT.equals(choice);
      case DeviceModelingLanguagePackage.EITHER_FEATURE_TYPE__MEMBERS:
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
    result.append(" (choice: ");
    result.append(choice);
    result.append(')');
    return result.toString();
  }

} //EitherFeatureTypeImpl
