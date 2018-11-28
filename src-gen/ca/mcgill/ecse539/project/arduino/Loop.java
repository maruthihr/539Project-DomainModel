/**
 */
package ca.mcgill.ecse539.project.arduino;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.Loop#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.Loop#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends EObject {
	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.ecse539.project.arduino.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference list.
	 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getLoop_Instruction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstruction();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Loop"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getLoop_Name()
	 * @model default="Loop" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link ca.mcgill.ecse539.project.arduino.Loop#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // Loop
