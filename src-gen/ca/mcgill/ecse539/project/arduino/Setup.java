/**
 */
package ca.mcgill.ecse539.project.arduino;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.Setup#getDigitalpin <em>Digitalpin</em>}</li>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.Setup#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getSetup()
 * @model
 * @generated
 */
public interface Setup extends EObject {
	/**
	 * Returns the value of the '<em><b>Digitalpin</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.ecse539.project.arduino.DigitalPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digitalpin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digitalpin</em>' containment reference list.
	 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getSetup_Digitalpin()
	 * @model containment="true"
	 * @generated
	 */
	EList<DigitalPin> getDigitalpin();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Setup"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getSetup_Name()
	 * @model default="Setup" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link ca.mcgill.ecse539.project.arduino.Setup#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // Setup
