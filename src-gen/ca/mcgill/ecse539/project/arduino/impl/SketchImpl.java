/**
 */
package ca.mcgill.ecse539.project.arduino.impl;

import ca.mcgill.ecse539.project.arduino.ArduinoPackage;
import ca.mcgill.ecse539.project.arduino.Instruction;
import ca.mcgill.ecse539.project.arduino.Loop;
import ca.mcgill.ecse539.project.arduino.Setup;
import ca.mcgill.ecse539.project.arduino.Sketch;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sketch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.impl.SketchImpl#getSetup <em>Setup</em>}</li>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.impl.SketchImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.impl.SketchImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link ca.mcgill.ecse539.project.arduino.impl.SketchImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SketchImpl extends MinimalEObjectImpl.Container implements Sketch {
	/**
	 * The cached value of the '{@link #getSetup() <em>Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetup()
	 * @generated
	 * @ordered
	 */
	protected Setup setup;

	/**
	 * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoop()
	 * @generated
	 * @ordered
	 */
	protected Loop loop;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instruction;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SketchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.SKETCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setup getSetup() {
		return setup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetup(Setup newSetup, NotificationChain msgs) {
		Setup oldSetup = setup;
		setup = newSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.SKETCH__SETUP,
					oldSetup, newSetup);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetup(Setup newSetup) {
		if (newSetup != setup) {
			NotificationChain msgs = null;
			if (setup != null)
				msgs = ((InternalEObject) setup).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArduinoPackage.SKETCH__SETUP, null, msgs);
			if (newSetup != null)
				msgs = ((InternalEObject) newSetup).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArduinoPackage.SKETCH__SETUP, null, msgs);
			msgs = basicSetSetup(newSetup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.SKETCH__SETUP, newSetup, newSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop getLoop() {
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoop(Loop newLoop, NotificationChain msgs) {
		Loop oldLoop = loop;
		loop = newLoop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.SKETCH__LOOP,
					oldLoop, newLoop);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoop(Loop newLoop) {
		if (newLoop != loop) {
			NotificationChain msgs = null;
			if (loop != null)
				msgs = ((InternalEObject) loop).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArduinoPackage.SKETCH__LOOP, null, msgs);
			if (newLoop != null)
				msgs = ((InternalEObject) newLoop).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArduinoPackage.SKETCH__LOOP, null, msgs);
			msgs = basicSetLoop(newLoop, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.SKETCH__LOOP, newLoop, newLoop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstruction() {
		if (instruction == null) {
			instruction = new EObjectContainmentEList<Instruction>(Instruction.class, this,
					ArduinoPackage.SKETCH__INSTRUCTION);
		}
		return instruction;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.SKETCH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArduinoPackage.SKETCH__SETUP:
			return basicSetSetup(null, msgs);
		case ArduinoPackage.SKETCH__LOOP:
			return basicSetLoop(null, msgs);
		case ArduinoPackage.SKETCH__INSTRUCTION:
			return ((InternalEList<?>) getInstruction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.SKETCH__SETUP:
			return getSetup();
		case ArduinoPackage.SKETCH__LOOP:
			return getLoop();
		case ArduinoPackage.SKETCH__INSTRUCTION:
			return getInstruction();
		case ArduinoPackage.SKETCH__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArduinoPackage.SKETCH__SETUP:
			setSetup((Setup) newValue);
			return;
		case ArduinoPackage.SKETCH__LOOP:
			setLoop((Loop) newValue);
			return;
		case ArduinoPackage.SKETCH__INSTRUCTION:
			getInstruction().clear();
			getInstruction().addAll((Collection<? extends Instruction>) newValue);
			return;
		case ArduinoPackage.SKETCH__NAME:
			setName((String) newValue);
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
		case ArduinoPackage.SKETCH__SETUP:
			setSetup((Setup) null);
			return;
		case ArduinoPackage.SKETCH__LOOP:
			setLoop((Loop) null);
			return;
		case ArduinoPackage.SKETCH__INSTRUCTION:
			getInstruction().clear();
			return;
		case ArduinoPackage.SKETCH__NAME:
			setName(NAME_EDEFAULT);
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
		case ArduinoPackage.SKETCH__SETUP:
			return setup != null;
		case ArduinoPackage.SKETCH__LOOP:
			return loop != null;
		case ArduinoPackage.SKETCH__INSTRUCTION:
			return instruction != null && !instruction.isEmpty();
		case ArduinoPackage.SKETCH__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SketchImpl
