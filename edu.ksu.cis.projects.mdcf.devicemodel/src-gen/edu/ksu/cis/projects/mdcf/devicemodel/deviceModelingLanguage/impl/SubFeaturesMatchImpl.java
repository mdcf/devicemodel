/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubFeaturesMatch;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Features Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesMatchImpl#getDistinct <em>Distinct</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesMatchImpl#getCategoryNames <em>Category Names</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesMatchImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.SubFeaturesMatchImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubFeaturesMatchImpl extends MinimalEObjectImpl.Container implements SubFeaturesMatch
{
  /**
   * The default value of the '{@link #getDistinct() <em>Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistinct()
   * @generated
   * @ordered
   */
  protected static final String DISTINCT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDistinct() <em>Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistinct()
   * @generated
   * @ordered
   */
  protected String distinct = DISTINCT_EDEFAULT;

  /**
   * The cached value of the '{@link #getCategoryNames() <em>Category Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryNames()
   * @generated
   * @ordered
   */
  protected EList<String> categoryNames;

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
   * The default value of the '{@link #getAny() <em>Any</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAny()
   * @generated
   * @ordered
   */
  protected static final String ANY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAny() <em>Any</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAny()
   * @generated
   * @ordered
   */
  protected String any = ANY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubFeaturesMatchImpl()
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
    return DeviceModelingLanguagePackage.Literals.SUB_FEATURES_MATCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDistinct()
  {
    return distinct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistinct(String newDistinct)
  {
    String oldDistinct = distinct;
    distinct = newDistinct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__DISTINCT, oldDistinct, distinct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCategoryNames()
  {
    if (categoryNames == null)
    {
      categoryNames = new EDataTypeEList<String>(String.class, this, DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__CATEGORY_NAMES);
    }
    return categoryNames;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAny()
  {
    return any;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAny(String newAny)
  {
    String oldAny = any;
    any = newAny;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__ANY, oldAny, any));
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
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__DISTINCT:
        return getDistinct();
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__CATEGORY_NAMES:
        return getCategoryNames();
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__NAME:
        return getName();
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__ANY:
        return getAny();
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
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__DISTINCT:
        setDistinct((String)newValue);
        return;
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__CATEGORY_NAMES:
        getCategoryNames().clear();
        getCategoryNames().addAll((Collection<? extends String>)newValue);
        return;
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__NAME:
        setName((String)newValue);
        return;
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__ANY:
        setAny((String)newValue);
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
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__DISTINCT:
        setDistinct(DISTINCT_EDEFAULT);
        return;
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__CATEGORY_NAMES:
        getCategoryNames().clear();
        return;
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__ANY:
        setAny(ANY_EDEFAULT);
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
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__DISTINCT:
        return DISTINCT_EDEFAULT == null ? distinct != null : !DISTINCT_EDEFAULT.equals(distinct);
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__CATEGORY_NAMES:
        return categoryNames != null && !categoryNames.isEmpty();
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeviceModelingLanguagePackage.SUB_FEATURES_MATCH__ANY:
        return ANY_EDEFAULT == null ? any != null : !ANY_EDEFAULT.equals(any);
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
    result.append(" (distinct: ");
    result.append(distinct);
    result.append(", categoryNames: ");
    result.append(categoryNames);
    result.append(", name: ");
    result.append(name);
    result.append(", any: ");
    result.append(any);
    result.append(')');
    return result.toString();
  }

} //SubFeaturesMatchImpl
