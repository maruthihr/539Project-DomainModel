/**
 */
package ca.mcgill.ecse539.project.arduino.impl;

import ca.mcgill.ecse539.project.arduino.ArduinoPackage;
import ca.mcgill.ecse539.project.arduino.DigitalPin;
import ca.mcgill.ecse539.project.arduino.Read;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.impl.ReadImpl#getDigitalpin <em>Digitalpin</em>}</li>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.impl.ReadImpl#isReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadImpl extends FunctionImpl implements Read {
	/**
	 * The cached value of the '{@link #getDigitalpin() <em>Digitalpin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalpin()
	 * @generated
	 * @ordered
	 */
	protected DigitalPin digitalpin;

	/**
	 * The default value of the '{@link #isReturnValue() <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_VALUE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isReturnValue() <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnValue()
	 * @generated
	 * @ordered
	 */
	protected boolean returnValue = RETURN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.READ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalPin getDigitalpin() {
		if (digitalpin != null && digitalpin.eIsProxy()) {
			InternalEObject oldDigitalpin = (InternalEObject) digitalpin;
			digitalpin = (DigitalPin) eResolveProxy(oldDigitalpin);
			if (digitalpin != oldDigitalpin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.READ__DIGITALPIN,
							oldDigitalpin, digitalpin));
			}
		}
		return digitalpin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalPin basicGetDigitalpin() {
		return digitalpin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigitalpin(DigitalPin newDigitalpin) {
		DigitalPin oldDigitalpin = digitalpin;
		digitalpin = newDigitalpin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.READ__DIGITALPIN, oldDigitalpin,
					digitalpin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(boolean newReturnValue) {
		boolean oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.READ__RETURN_VALUE, oldReturnValue,
					returnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.READ__DIGITALPIN:
			if (resolve)
				return getDigitalpin();
			return basicGetDigitalpin();
		case ArduinoPackage.READ__RETURN_VALUE:
			return isReturnValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArduinoPackage.READ__DIGITALPIN:
			setDigitalpin((DigitalPin) newValue);
			return;
		case ArduinoPackage.READ__RETURN_VALUE:
			setReturnValue((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArduinoPackage.READ__DIGITALPIN:
			setDigitalpin((DigitalPin) null);
			return;
		case ArduinoPackage.READ__RETURN_VALUE:
			setReturnValue(RETURN_VALUE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArduinoPackage.READ__DIGITALPIN:
			return digitalpin != null;
		case ArduinoPackage.READ__RETURN_VALUE:
			return returnValue != RETURN_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (returnValue: ");
		result.append(returnValue);
		result.append(')');
		return result.toString();
	}

} //ReadImpl
