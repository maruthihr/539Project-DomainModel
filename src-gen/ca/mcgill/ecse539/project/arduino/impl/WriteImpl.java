/**
 */
package ca.mcgill.ecse539.project.arduino.impl;

import ca.mcgill.ecse539.project.arduino.ArduinoPackage;
import ca.mcgill.ecse539.project.arduino.DigitalPin;
import ca.mcgill.ecse539.project.arduino.Write;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.impl.WriteImpl#getDigitalpin <em>Digitalpin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WriteImpl extends FunctionImpl implements Write {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.WRITE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.WRITE__DIGITALPIN,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.WRITE__DIGITALPIN, oldDigitalpin,
					digitalpin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.WRITE__DIGITALPIN:
			if (resolve)
				return getDigitalpin();
			return basicGetDigitalpin();
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
		case ArduinoPackage.WRITE__DIGITALPIN:
			setDigitalpin((DigitalPin) newValue);
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
		case ArduinoPackage.WRITE__DIGITALPIN:
			setDigitalpin((DigitalPin) null);
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
		case ArduinoPackage.WRITE__DIGITALPIN:
			return digitalpin != null;
		}
		return super.eIsSet(featureID);
	}

} //WriteImpl
