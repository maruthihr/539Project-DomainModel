/**
 */
package ca.mcgill.ecse539.project.arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.Read#getDigitalpin <em>Digitalpin</em>}</li>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.Read#isReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getRead()
 * @model
 * @generated
 */
public interface Read extends Function {
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
	 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getRead_Digitalpin()
	 * @model
	 * @generated
	 */
	DigitalPin getDigitalpin();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse539.project.arduino.Read#getDigitalpin <em>Digitalpin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digitalpin</em>' reference.
	 * @see #getDigitalpin()
	 * @generated
	 */
	void setDigitalpin(DigitalPin value);

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' attribute.
	 * @see #setReturnValue(boolean)
	 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getRead_ReturnValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isReturnValue();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse539.project.arduino.Read#isReturnValue <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' attribute.
	 * @see #isReturnValue()
	 * @generated
	 */
	void setReturnValue(boolean value);

} // Read
