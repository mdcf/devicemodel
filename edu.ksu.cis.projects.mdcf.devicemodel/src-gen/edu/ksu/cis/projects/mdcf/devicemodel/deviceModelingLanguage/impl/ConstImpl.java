/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.Const;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Const</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstImpl#isSchema <em>Schema</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstImpl#isClass <em>Class</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ConstImpl#isInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstImpl extends ModifierImpl implements Const
{
  /**
   * The default value of the '{@link #isSchema() <em>Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSchema()
   * @generated
   * @ordered
   */
  protected static final boolean SCHEMA_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSchema() <em>Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSchema()
   * @generated
   * @ordered
   */
  protected boolean schema = SCHEMA_EDEFAULT;

  /**
   * The default value of the '{@link #isClass() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClass()
   * @generated
   * @ordered
   */
  protected static final boolean CLASS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClass() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClass()
   * @generated
   * @ordered
   */
  protected boolean class_ = CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #isInstance() <em>Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInstance()
   * @generated
   * @ordered
   */
  protected static final boolean INSTANCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInstance() <em>Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInstance()
   * @generated
   * @ordered
   */
  protected boolean instance = INSTANCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstImpl()
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
    return DeviceModelingLanguagePackage.Literals.CONST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSchema()
  {
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchema(boolean newSchema)
  {
    boolean oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.CONST__SCHEMA, oldSchema, schema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isClass()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(boolean newClass)
  {
    boolean oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.CONST__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInstance()
  {
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstance(boolean newInstance)
  {
    boolean oldInstance = instance;
    instance = newInstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.CONST__INSTANCE, oldInstance, instance));
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
      case DeviceModelingLanguagePackage.CONST__SCHEMA:
        return isSchema();
      case DeviceModelingLanguagePackage.CONST__CLASS:
        return isClass();
      case DeviceModelingLanguagePackage.CONST__INSTANCE:
        return isInstance();
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
      case DeviceModelingLanguagePackage.CONST__SCHEMA:
        setSchema((Boolean)newValue);
        return;
      case DeviceModelingLanguagePackage.CONST__CLASS:
        setClass((Boolean)newValue);
        return;
      case DeviceModelingLanguagePackage.CONST__INSTANCE:
        setInstance((Boolean)newValue);
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
      case DeviceModelingLanguagePackage.CONST__SCHEMA:
        setSchema(SCHEMA_EDEFAULT);
        return;
      case DeviceModelingLanguagePackage.CONST__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case DeviceModelingLanguagePackage.CONST__INSTANCE:
        setInstance(INSTANCE_EDEFAULT);
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
      case DeviceModelingLanguagePackage.CONST__SCHEMA:
        return schema != SCHEMA_EDEFAULT;
      case DeviceModelingLanguagePackage.CONST__CLASS:
        return class_ != CLASS_EDEFAULT;
      case DeviceModelingLanguagePackage.CONST__INSTANCE:
        return instance != INSTANCE_EDEFAULT;
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
    result.append(" (schema: ");
    result.append(schema);
    result.append(", class: ");
    result.append(class_);
    result.append(", instance: ");
    result.append(instance);
    result.append(')');
    return result.toString();
  }

} //ConstImpl
