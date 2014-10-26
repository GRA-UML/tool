/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.ConditionExpressionType;
import org.ebxml.business.process.ConditionGuardType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.ProcessPackage;
import org.ebxml.business.process.SuccessType;

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
 * An implementation of the model object '<em><b>Success Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.SuccessTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.SuccessTypeImpl#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.SuccessTypeImpl#getConditionGuard <em>Condition Guard</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.SuccessTypeImpl#getFromBusinessState <em>From Business State</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.SuccessTypeImpl#getFromBusinessStateIDRef <em>From Business State ID Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SuccessTypeImpl extends MinimalEObjectImpl.Container implements SuccessType {
	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentationType> documentation;

	/**
	 * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpressionType conditionExpression;

	/**
	 * The default value of the '{@link #getConditionGuard() <em>Condition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionGuard()
	 * @generated
	 * @ordered
	 */
	protected static final ConditionGuardType CONDITION_GUARD_EDEFAULT = ConditionGuardType.SUCCESS;

	/**
	 * The cached value of the '{@link #getConditionGuard() <em>Condition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionGuard()
	 * @generated
	 * @ordered
	 */
	protected ConditionGuardType conditionGuard = CONDITION_GUARD_EDEFAULT;

	/**
	 * This is true if the Condition Guard attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionGuardESet;

	/**
	 * The default value of the '{@link #getFromBusinessState() <em>From Business State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromBusinessState()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_BUSINESS_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromBusinessState() <em>From Business State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromBusinessState()
	 * @generated
	 * @ordered
	 */
	protected String fromBusinessState = FROM_BUSINESS_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromBusinessStateIDRef() <em>From Business State ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromBusinessStateIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_BUSINESS_STATE_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromBusinessStateIDRef() <em>From Business State ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromBusinessStateIDRef()
	 * @generated
	 * @ordered
	 */
	protected String fromBusinessStateIDRef = FROM_BUSINESS_STATE_ID_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.SUCCESS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.SUCCESS_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpressionType getConditionExpression() {
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionExpression(ConditionExpressionType newConditionExpression, NotificationChain msgs) {
		ConditionExpressionType oldConditionExpression = conditionExpression;
		conditionExpression = newConditionExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.SUCCESS_TYPE__CONDITION_EXPRESSION, oldConditionExpression, newConditionExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionExpression(ConditionExpressionType newConditionExpression) {
		if (newConditionExpression != conditionExpression) {
			NotificationChain msgs = null;
			if (conditionExpression != null)
				msgs = ((InternalEObject)conditionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.SUCCESS_TYPE__CONDITION_EXPRESSION, null, msgs);
			if (newConditionExpression != null)
				msgs = ((InternalEObject)newConditionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.SUCCESS_TYPE__CONDITION_EXPRESSION, null, msgs);
			msgs = basicSetConditionExpression(newConditionExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.SUCCESS_TYPE__CONDITION_EXPRESSION, newConditionExpression, newConditionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionGuardType getConditionGuard() {
		return conditionGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionGuard(ConditionGuardType newConditionGuard) {
		ConditionGuardType oldConditionGuard = conditionGuard;
		conditionGuard = newConditionGuard == null ? CONDITION_GUARD_EDEFAULT : newConditionGuard;
		boolean oldConditionGuardESet = conditionGuardESet;
		conditionGuardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.SUCCESS_TYPE__CONDITION_GUARD, oldConditionGuard, conditionGuard, !oldConditionGuardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionGuard() {
		ConditionGuardType oldConditionGuard = conditionGuard;
		boolean oldConditionGuardESet = conditionGuardESet;
		conditionGuard = CONDITION_GUARD_EDEFAULT;
		conditionGuardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.SUCCESS_TYPE__CONDITION_GUARD, oldConditionGuard, CONDITION_GUARD_EDEFAULT, oldConditionGuardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionGuard() {
		return conditionGuardESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromBusinessState() {
		return fromBusinessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromBusinessState(String newFromBusinessState) {
		String oldFromBusinessState = fromBusinessState;
		fromBusinessState = newFromBusinessState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.SUCCESS_TYPE__FROM_BUSINESS_STATE, oldFromBusinessState, fromBusinessState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromBusinessStateIDRef() {
		return fromBusinessStateIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromBusinessStateIDRef(String newFromBusinessStateIDRef) {
		String oldFromBusinessStateIDRef = fromBusinessStateIDRef;
		fromBusinessStateIDRef = newFromBusinessStateIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.SUCCESS_TYPE__FROM_BUSINESS_STATE_ID_REF, oldFromBusinessStateIDRef, fromBusinessStateIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.SUCCESS_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.SUCCESS_TYPE__CONDITION_EXPRESSION:
				return basicSetConditionExpression(null, msgs);
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
			case ProcessPackage.SUCCESS_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.SUCCESS_TYPE__CONDITION_EXPRESSION:
				return getConditionExpression();
			case ProcessPackage.SUCCESS_TYPE__CONDITION_GUARD:
				return getConditionGuard();
			case ProcessPackage.SUCCESS_TYPE__FROM_BUSINESS_STATE:
				return getFromBusinessState();
			case ProcessPackage.SUCCESS_TYPE__FROM_BUSINESS_STATE_ID_REF:
				return getFromBusinessStateIDRef();
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
			case ProcessPackage.SUCCESS_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.SUCCESS_TYPE__CONDITION_EXPRESSION:
				setConditionExpression((ConditionExpressionType)newValue);
				return;
			case ProcessPackage.SUCCESS_TYPE__CONDITION_GUARD:
				setConditionGuard((ConditionGuardType)newValue);
				return;
			case ProcessPackage.SUCCESS_TYPE__FROM_BUSINESS_STATE:
				setFromBusinessState((String)newValue);
				return;
			case ProcessPackage.SUCCESS_TYPE__FROM_BUSINESS_STATE_ID_REF:
				setFromBusinessStateIDRef((String)newValue);
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
			case ProcessPackage.SUCCESS_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.SUCCESS_TYPE__CONDITION_EXPRESSION:
				setConditionExpression((ConditionExpressionType)null);
				return;
			case ProcessPackage.SUCCESS_TYPE__CONDITION_GUARD:
				unsetConditionGuard();
				return;
			case ProcessPackage.SUCCESS_TYPE__FROM_BUSINESS_STATE:
				setFromBusinessState(FROM_BUSINESS_STATE_EDEFAULT);
				return;
			case ProcessPackage.SUCCESS_TYPE__FROM_BUSINESS_STATE_ID_REF:
				setFromBusinessStateIDRef(FROM_BUSINESS_STATE_ID_REF_EDEFAULT);
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
			case ProcessPackage.SUCCESS_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.SUCCESS_TYPE__CONDITION_EXPRESSION:
				return conditionExpression != null;
			case ProcessPackage.SUCCESS_TYPE__CONDITION_GUARD:
				return isSetConditionGuard();
			case ProcessPackage.SUCCESS_TYPE__FROM_BUSINESS_STATE:
				return FROM_BUSINESS_STATE_EDEFAULT == null ? fromBusinessState != null : !FROM_BUSINESS_STATE_EDEFAULT.equals(fromBusinessState);
			case ProcessPackage.SUCCESS_TYPE__FROM_BUSINESS_STATE_ID_REF:
				return FROM_BUSINESS_STATE_ID_REF_EDEFAULT == null ? fromBusinessStateIDRef != null : !FROM_BUSINESS_STATE_ID_REF_EDEFAULT.equals(fromBusinessStateIDRef);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (conditionGuard: ");
		if (conditionGuardESet) result.append(conditionGuard); else result.append("<unset>");
		result.append(", fromBusinessState: ");
		result.append(fromBusinessState);
		result.append(", fromBusinessStateIDRef: ");
		result.append(fromBusinessStateIDRef);
		result.append(')');
		return result.toString();
	}

} //SuccessTypeImpl
