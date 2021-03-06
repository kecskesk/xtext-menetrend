/**
 * generated by Xtext 2.10.0
 */
package hu.bme.aut.menetrend.menetrend;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Time End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.menetrend.menetrend.ComplexTimeEnd#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link hu.bme.aut.menetrend.menetrend.ComplexTimeEnd#getUntil <em>Until</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.menetrend.menetrend.MenetrendPackage#getComplexTimeEnd()
 * @model
 * @generated
 */
public interface ComplexTimeEnd extends Departure
{
  /**
   * Returns the value of the '<em><b>Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frequency</em>' attribute.
   * @see #setFrequency(int)
   * @see hu.bme.aut.menetrend.menetrend.MenetrendPackage#getComplexTimeEnd_Frequency()
   * @model
   * @generated
   */
  int getFrequency();

  /**
   * Sets the value of the '{@link hu.bme.aut.menetrend.menetrend.ComplexTimeEnd#getFrequency <em>Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Frequency</em>' attribute.
   * @see #getFrequency()
   * @generated
   */
  void setFrequency(int value);

  /**
   * Returns the value of the '<em><b>Until</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Until</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Until</em>' attribute.
   * @see #setUntil(String)
   * @see hu.bme.aut.menetrend.menetrend.MenetrendPackage#getComplexTimeEnd_Until()
   * @model
   * @generated
   */
  String getUntil();

  /**
   * Sets the value of the '{@link hu.bme.aut.menetrend.menetrend.ComplexTimeEnd#getUntil <em>Until</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Until</em>' attribute.
   * @see #getUntil()
   * @generated
   */
  void setUntil(String value);

} // ComplexTimeEnd
