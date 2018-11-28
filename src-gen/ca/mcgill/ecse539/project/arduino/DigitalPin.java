/**
 */
package ca.mcgill.ecse539.project.arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.DigitalPin#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getDigitalPin()
 * @model
 * @generated
 */
public interface DigitalPin extends Pin {

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.ecse539.project.arduino.DigitalPinNumber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see ca.mcgill.ecse539.project.arduino.DigitalPinNumber
	 * @see #setNumber(DigitalPinNumber)
	 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getDigitalPin_Number()
	 * @model id="true"
	 * @generated
	 */
	DigitalPinNumber getNumber();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse539.project.arduino.DigitalPin#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see ca.mcgill.ecse539.project.arduino.DigitalPinNumber
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(DigitalPinNumber value);
} // DigitalPin
