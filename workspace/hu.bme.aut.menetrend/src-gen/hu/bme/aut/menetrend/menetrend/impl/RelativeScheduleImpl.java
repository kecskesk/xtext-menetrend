/**
 * generated by Xtext 2.10.0
 */
package hu.bme.aut.menetrend.menetrend.impl;

import hu.bme.aut.menetrend.menetrend.MenetrendPackage;
import hu.bme.aut.menetrend.menetrend.RelativeSchedule;
import hu.bme.aut.menetrend.menetrend.RelativeTarget;
import hu.bme.aut.menetrend.menetrend.Stop;

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
 * An implementation of the model object '<em><b>Relative Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.menetrend.menetrend.impl.RelativeScheduleImpl#getStart <em>Start</em>}</li>
 *   <li>{@link hu.bme.aut.menetrend.menetrend.impl.RelativeScheduleImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeScheduleImpl extends SchedulePartImpl implements RelativeSchedule
{
  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected Stop start;

  /**
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargets()
   * @generated
   * @ordered
   */
  protected EList<RelativeTarget> targets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelativeScheduleImpl()
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
    return MenetrendPackage.Literals.RELATIVE_SCHEDULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stop getStart()
  {
    if (start != null && start.eIsProxy())
    {
      InternalEObject oldStart = (InternalEObject)start;
      start = (Stop)eResolveProxy(oldStart);
      if (start != oldStart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MenetrendPackage.RELATIVE_SCHEDULE__START, oldStart, start));
      }
    }
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stop basicGetStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(Stop newStart)
  {
    Stop oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MenetrendPackage.RELATIVE_SCHEDULE__START, oldStart, start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelativeTarget> getTargets()
  {
    if (targets == null)
    {
      targets = new EObjectContainmentEList<RelativeTarget>(RelativeTarget.class, this, MenetrendPackage.RELATIVE_SCHEDULE__TARGETS);
    }
    return targets;
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
      case MenetrendPackage.RELATIVE_SCHEDULE__TARGETS:
        return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
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
      case MenetrendPackage.RELATIVE_SCHEDULE__START:
        if (resolve) return getStart();
        return basicGetStart();
      case MenetrendPackage.RELATIVE_SCHEDULE__TARGETS:
        return getTargets();
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
      case MenetrendPackage.RELATIVE_SCHEDULE__START:
        setStart((Stop)newValue);
        return;
      case MenetrendPackage.RELATIVE_SCHEDULE__TARGETS:
        getTargets().clear();
        getTargets().addAll((Collection<? extends RelativeTarget>)newValue);
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
      case MenetrendPackage.RELATIVE_SCHEDULE__START:
        setStart((Stop)null);
        return;
      case MenetrendPackage.RELATIVE_SCHEDULE__TARGETS:
        getTargets().clear();
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
      case MenetrendPackage.RELATIVE_SCHEDULE__START:
        return start != null;
      case MenetrendPackage.RELATIVE_SCHEDULE__TARGETS:
        return targets != null && !targets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RelativeScheduleImpl