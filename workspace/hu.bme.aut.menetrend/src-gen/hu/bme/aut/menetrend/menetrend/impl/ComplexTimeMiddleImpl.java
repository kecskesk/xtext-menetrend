/**
 * generated by Xtext 2.10.0
 */
package hu.bme.aut.menetrend.menetrend.impl;

import hu.bme.aut.menetrend.menetrend.ComplexTimeMiddle;
import hu.bme.aut.menetrend.menetrend.MenetrendPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Time Middle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.menetrend.menetrend.impl.ComplexTimeMiddleImpl#getUntil <em>Until</em>}</li>
 *   <li>{@link hu.bme.aut.menetrend.menetrend.impl.ComplexTimeMiddleImpl#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexTimeMiddleImpl extends DepartureImpl implements ComplexTimeMiddle
{
  /**
   * The default value of the '{@link #getUntil() <em>Until</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUntil()
   * @generated
   * @ordered
   */
  protected static final String UNTIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUntil() <em>Until</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUntil()
   * @generated
   * @ordered
   */
  protected String until = UNTIL_EDEFAULT;

  /**
   * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrequency()
   * @generated
   * @ordered
   */
  protected static final int FREQUENCY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrequency()
   * @generated
   * @ordered
   */
  protected int frequency = FREQUENCY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexTimeMiddleImpl()
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
    return MenetrendPackage.Literals.COMPLEX_TIME_MIDDLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUntil()
  {
    return until;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUntil(String newUntil)
  {
    String oldUntil = until;
    until = newUntil;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MenetrendPackage.COMPLEX_TIME_MIDDLE__UNTIL, oldUntil, until));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFrequency()
  {
    return frequency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrequency(int newFrequency)
  {
    int oldFrequency = frequency;
    frequency = newFrequency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MenetrendPackage.COMPLEX_TIME_MIDDLE__FREQUENCY, oldFrequency, frequency));
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
      case MenetrendPackage.COMPLEX_TIME_MIDDLE__UNTIL:
        return getUntil();
      case MenetrendPackage.COMPLEX_TIME_MIDDLE__FREQUENCY:
        return getFrequency();
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
      case MenetrendPackage.COMPLEX_TIME_MIDDLE__UNTIL:
        setUntil((String)newValue);
        return;
      case MenetrendPackage.COMPLEX_TIME_MIDDLE__FREQUENCY:
        setFrequency((Integer)newValue);
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
      case MenetrendPackage.COMPLEX_TIME_MIDDLE__UNTIL:
        setUntil(UNTIL_EDEFAULT);
        return;
      case MenetrendPackage.COMPLEX_TIME_MIDDLE__FREQUENCY:
        setFrequency(FREQUENCY_EDEFAULT);
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
      case MenetrendPackage.COMPLEX_TIME_MIDDLE__UNTIL:
        return UNTIL_EDEFAULT == null ? until != null : !UNTIL_EDEFAULT.equals(until);
      case MenetrendPackage.COMPLEX_TIME_MIDDLE__FREQUENCY:
        return frequency != FREQUENCY_EDEFAULT;
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
    result.append(" (until: ");
    result.append(until);
    result.append(", frequency: ");
    result.append(frequency);
    result.append(')');
    return result.toString();
  }

} //ComplexTimeMiddleImpl