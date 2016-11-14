/**
 * generated by Xtext 2.10.0
 */
package hu.bme.aut.menetrend.menetrend;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.aut.menetrend.menetrend.MenetrendPackage
 * @generated
 */
public interface MenetrendFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MenetrendFactory eINSTANCE = hu.bme.aut.menetrend.menetrend.impl.MenetrendFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Schedule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schedule</em>'.
   * @generated
   */
  Schedule createSchedule();

  /**
   * Returns a new object of class '<em>Line Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line Number</em>'.
   * @generated
   */
  LineNumber createLineNumber();

  /**
   * Returns a new object of class '<em>Schedule Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schedule Part</em>'.
   * @generated
   */
  SchedulePart createSchedulePart();

  /**
   * Returns a new object of class '<em>Relative Schedule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relative Schedule</em>'.
   * @generated
   */
  RelativeSchedule createRelativeSchedule();

  /**
   * Returns a new object of class '<em>Relative Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relative Target</em>'.
   * @generated
   */
  RelativeTarget createRelativeTarget();

  /**
   * Returns a new object of class '<em>Absolute Schedule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Absolute Schedule</em>'.
   * @generated
   */
  AbsoluteSchedule createAbsoluteSchedule();

  /**
   * Returns a new object of class '<em>Departure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Departure</em>'.
   * @generated
   */
  Departure createDeparture();

  /**
   * Returns a new object of class '<em>Simple Time Format</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Time Format</em>'.
   * @generated
   */
  SimpleTimeFormat createSimpleTimeFormat();

  /**
   * Returns a new object of class '<em>Complex Time Middle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Time Middle</em>'.
   * @generated
   */
  ComplexTimeMiddle createComplexTimeMiddle();

  /**
   * Returns a new object of class '<em>Complex Time End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Time End</em>'.
   * @generated
   */
  ComplexTimeEnd createComplexTimeEnd();

  /**
   * Returns a new object of class '<em>Stop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stop</em>'.
   * @generated
   */
  Stop createStop();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MenetrendPackage getMenetrendPackage();

} //MenetrendFactory