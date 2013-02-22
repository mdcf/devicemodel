/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ELiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ListLiteral;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl;

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
 * An implementation of the model object '<em><b>List Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListLiteralImpl#getTypeCons <em>Type Cons</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.ListLiteralImpl#getElems <em>Elems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListLiteralImpl extends LiteralImpl implements ListLiteral
{
  /**
   * The cached value of the '{@link #getTypeCons() <em>Type Cons</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeCons()
   * @generated
   * @ordered
   */
  protected TypeDecl typeCons;

  /**
   * The cached value of the '{@link #getElems() <em>Elems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElems()
   * @generated
   * @ordered
   */
  protected EList<ELiteral> elems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListLiteralImpl()
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
    return DeviceModelingLanguagePackage.Literals.LIST_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl getTypeCons()
  {
    if (typeCons != null && typeCons.eIsProxy())
    {
      InternalEObject oldTypeCons = (InternalEObject)typeCons;
      typeCons = (TypeDecl)eResolveProxy(oldTypeCons);
      if (typeCons != oldTypeCons)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeviceModelingLanguagePackage.LIST_LITERAL__TYPE_CONS, oldTypeCons, typeCons));
      }
    }
    return typeCons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDecl basicGetTypeCons()
  {
    return typeCons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeCons(TypeDecl newTypeCons)
  {
    TypeDecl oldTypeCons = typeCons;
    typeCons = newTypeCons;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.LIST_LITERAL__TYPE_CONS, oldTypeCons, typeCons));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ELiteral> getElems()
  {
    if (elems == null)
    {
      elems = new EObjectContainmentEList<ELiteral>(ELiteral.class, this, DeviceModelingLanguagePackage.LIST_LITERAL__ELEMS);
    }
    return elems;
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
      case DeviceModelingLanguagePackage.LIST_LITERAL__ELEMS:
        return ((InternalEList<?>)getElems()).basicRemove(otherEnd, msgs);
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
      case DeviceModelingLanguagePackage.LIST_LITERAL__TYPE_CONS:
        if (resolve) return getTypeCons();
        return basicGetTypeCons();
      case DeviceModelingLanguagePackage.LIST_LITERAL__ELEMS:
        return getElems();
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
      case DeviceModelingLanguagePackage.LIST_LITERAL__TYPE_CONS:
        setTypeCons((TypeDecl)newValue);
        return;
      case DeviceModelingLanguagePackage.LIST_LITERAL__ELEMS:
        getElems().clear();
        getElems().addAll((Collection<? extends ELiteral>)newValue);
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
      case DeviceModelingLanguagePackage.LIST_LITERAL__TYPE_CONS:
        setTypeCons((TypeDecl)null);
        return;
      case DeviceModelingLanguagePackage.LIST_LITERAL__ELEMS:
        getElems().clear();
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
      case DeviceModelingLanguagePackage.LIST_LITERAL__TYPE_CONS:
        return typeCons != null;
      case DeviceModelingLanguagePackage.LIST_LITERAL__ELEMS:
        return elems != null && !elems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ListLiteralImpl
