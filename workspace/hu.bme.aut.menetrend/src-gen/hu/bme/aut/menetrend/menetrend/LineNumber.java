/**
 * generated by Xtext 2.10.0
 */
package hu.bme.aut.menetrend.menetrend;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.menetrend.menetrend.LineNumber#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.aut.menetrend.menetrend.LineNumber#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.menetrend.menetrend.MenetrendPackage#getLineNumber()
 * @model
 * @generated
 */
public interface LineNumber extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.aut.menetrend.menetrend.TransportType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see hu.bme.aut.menetrend.menetrend.TransportType
   * @see #setType(TransportType)
   * @see hu.bme.aut.menetrend.menetrend.MenetrendPackage#getLineNumber_Type()
   * @model
   * @generated
   */
  TransportType getType();

  /**
   * Sets the value of the '{@link hu.bme.aut.menetrend.menetrend.LineNumber#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see hu.bme.aut.menetrend.menetrend.TransportType
   * @see #getType()
   * @generated
   */
  void setType(TransportType value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(String)
   * @see hu.bme.aut.menetrend.menetrend.MenetrendPackage#getLineNumber_Number()
   * @model
   * @generated
   */
  String getNumber();

  /**
   * Sets the value of the '{@link hu.bme.aut.menetrend.menetrend.LineNumber#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(String value);

} // LineNumber
