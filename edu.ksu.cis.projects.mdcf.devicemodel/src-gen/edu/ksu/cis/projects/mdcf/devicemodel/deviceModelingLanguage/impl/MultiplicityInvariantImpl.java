/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ComponentDecl;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.ConstraintNat;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.MultiplicityInvariant;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.SubMemberMatch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantImpl#getLo <em>Lo</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantImpl#getHi <em>Hi</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.MultiplicityInvariantImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicityInvariantImpl extends InvariantDeclImpl implements MultiplicityInvariant
{
  /**
   * The cached value of the '{@link #getLo() <em>Lo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLo()
   * @generated
   * @ordered
   */
  protected ConstraintNat lo;

  /**
   * The cached value of the '{@link #getHi() <em>Hi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHi()
   * @generated
   * @ordered
   */
  protected ConstraintNat hi;

  /**
   * The cached value of the '{@link #getMatch() <em>Match</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatch()
   * @generated
   * @ordered
   */
  protected SubMemberMatch match;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ComponentDecl type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicityInvariantImpl()
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
    return DeviceModelingLanguagePackage.Literals.MULTIPLICITY_INVARIANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintNat getLo()
  {
    return lo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLo(ConstraintNat newLo, NotificationChain msgs)
  {
    ConstraintNat oldLo = lo;
    lo = newLo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__LO, oldLo, newLo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLo(ConstraintNat newLo)
  {
    if (newLo != lo)
    {
      NotificationChain msgs = null;
      if (lo != null)
        msgs = ((InternalEObject)lo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__LO, null, msgs);
      if (newLo != null)
        msgs = ((InternalEObject)newLo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__LO, null, msgs);
      msgs = basicSetLo(newLo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__LO, newLo, newLo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintNat getHi()
  {
    return hi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHi(ConstraintNat newHi, NotificationChain msgs)
  {
    ConstraintNat oldHi = hi;
    hi = newHi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__HI, oldHi, newHi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHi(ConstraintNat newHi)
  {
    if (newHi != hi)
    {
      NotificationChain msgs = null;
      if (hi != null)
        msgs = ((InternalEObject)hi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__HI, null, msgs);
      if (newHi != null)
        msgs = ((InternalEObject)newHi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__HI, null, msgs);
      msgs = basicSetHi(newHi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__HI, newHi, newHi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubMemberMatch getMatch()
  {
    return match;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMatch(SubMemberMatch newMatch, NotificationChain msgs)
  {
    SubMemberMatch oldMatch = match;
    match = newMatch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__MATCH, oldMatch, newMatch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatch(SubMemberMatch newMatch)
  {
    if (newMatch != match)
    {
      NotificationChain msgs = null;
      if (match != null)
        msgs = ((InternalEObject)match).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__MATCH, null, msgs);
      if (newMatch != null)
        msgs = ((InternalEObject)newMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__MATCH, null, msgs);
      msgs = basicSetMatch(newMatch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__MATCH, newMatch, newMatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDecl getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (ComponentDecl)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDecl basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ComponentDecl newType)
  {
    ComponentDecl oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__TYPE, oldType, type));
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
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__LO:
        return basicSetLo(null, msgs);
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__HI:
        return basicSetHi(null, msgs);
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__MATCH:
        return basicSetMatch(null, msgs);
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
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__LO:
        return getLo();
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__HI:
        return getHi();
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__MATCH:
        return getMatch();
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__TYPE:
        if (resolve) return getType();
        return basicGetType();
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
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__LO:
        setLo((ConstraintNat)newValue);
        return;
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__HI:
        setHi((ConstraintNat)newValue);
        return;
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__MATCH:
        setMatch((SubMemberMatch)newValue);
        return;
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__TYPE:
        setType((ComponentDecl)newValue);
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
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__LO:
        setLo((ConstraintNat)null);
        return;
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__HI:
        setHi((ConstraintNat)null);
        return;
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__MATCH:
        setMatch((SubMemberMatch)null);
        return;
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__TYPE:
        setType((ComponentDecl)null);
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
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__LO:
        return lo != null;
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__HI:
        return hi != null;
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__MATCH:
        return match != null;
      case DeviceModelingLanguagePackage.MULTIPLICITY_INVARIANT__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //MultiplicityInvariantImpl
