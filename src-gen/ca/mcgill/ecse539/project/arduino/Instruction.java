/**
 */
package ca.mcgill.ecse539.project.arduino;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.Instruction#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getInstruction()
 * @model abstract="true"
 * @generated
 */
public interface Instruction extends EObject {

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Instruction)
	 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getInstruction_Next()
	 * @model
	 * @generated
	 */
	Instruction getNext();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse539.project.arduino.Instruction#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Instruction value);
} // Instruction
