/**
 */
package ca.mcgill.ecse539.project.arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.Write#getDigitalpin <em>Digitalpin</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getWrite()
 * @model
 * @generated
 */
public interface Write extends Function {
	/**
	 * Returns the value of the '<em><b>Digitalpin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digitalpin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digitalpin</em>' reference.
	 * @see #setDigitalpin(DigitalPin)
	 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getWrite_Digitalpin()
	 * @model
	 * @generated
	 */
	DigitalPin getDigitalpin();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse539.project.arduino.Write#getDigitalpin <em>Digitalpin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digitalpin</em>' reference.
	 * @see #getDigitalpin()
	 * @generated
	 */
	void setDigitalpin(DigitalPin value);

} // Write
