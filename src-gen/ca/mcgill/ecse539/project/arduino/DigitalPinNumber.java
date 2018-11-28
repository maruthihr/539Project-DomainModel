/**
 */
package ca.mcgill.ecse539.project.arduino;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Digital Pin Number</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ca.mcgill.ecse539.project.arduino.ArduinoPackage#getDigitalPinNumber()
 * @model
 * @generated
 */
public enum DigitalPinNumber implements Enumerator {
	/**
	 * The '<em><b>D0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D0_VALUE
	 * @generated
	 * @ordered
	 */
	D0(0, "D0", "D0"),

	/**
	 * The '<em><b>D1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D1_VALUE
	 * @generated
	 * @ordered
	 */
	D1(1, "D1", "D1"),

	/**
	 * The '<em><b>D2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D2_VALUE
	 * @generated
	 * @ordered
	 */
	D2(2, "D2", "D2"),

	/**
	 * The '<em><b>D4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D4_VALUE
	 * @generated
	 * @ordered
	 */
	D4(3, "D4", "D4"),

	/**
	 * The '<em><b>D5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D5_VALUE
	 * @generated
	 * @ordered
	 */
	D5(4, "D5", "D5");

	/**
	 * The '<em><b>D0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D0
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D0_VALUE = 0;

	/**
	 * The '<em><b>D1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D1_VALUE = 1;

	/**
	 * The '<em><b>D2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D2_VALUE = 2;

	/**
	 * The '<em><b>D4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D4_VALUE = 3;

	/**
	 * The '<em><b>D5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D5_VALUE = 4;

	/**
	 * An array of all the '<em><b>Digital Pin Number</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DigitalPinNumber[] VALUES_ARRAY = new DigitalPinNumber[] { D0, D1, D2, D4, D5, };

	/**
	 * A public read-only list of all the '<em><b>Digital Pin Number</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DigitalPinNumber> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Digital Pin Number</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DigitalPinNumber get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DigitalPinNumber result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Digital Pin Number</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DigitalPinNumber getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DigitalPinNumber result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Digital Pin Number</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DigitalPinNumber get(int value) {
		switch (value) {
		case D0_VALUE:
			return D0;
		case D1_VALUE:
			return D1;
		case D2_VALUE:
			return D2;
		case D4_VALUE:
			return D4;
		case D5_VALUE:
			return D5;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DigitalPinNumber(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //DigitalPinNumber
