/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.ProcessPackage;
import org.ebxml.business.process.StartType;

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
 * An implementation of the model object '<em><b>Start Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.StartTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.StartTypeImpl#getToBusinessState <em>To Business State</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.StartTypeImpl#getToBusinessStateIDRef <em>To Business State ID Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartTypeImpl extends MinimalEObjectImpl.Container implements StartType {
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
	 * The default value of the '{@link #getToBusinessState() <em>To Business State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBusinessState()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_BUSINESS_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToBusinessState() <em>To Business State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBusinessState()
	 * @generated
	 * @ordered
	 */
	protected String toBusinessState = TO_BUSINESS_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToBusinessStateIDRef() <em>To Business State ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBusinessStateIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_BUSINESS_STATE_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToBusinessStateIDRef() <em>To Business State ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBusinessStateIDRef()
	 * @generated
	 * @ordered
	 */
	protected String toBusinessStateIDRef = TO_BUSINESS_STATE_ID_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.START_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.START_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToBusinessState() {
		return toBusinessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBusinessState(String newToBusinessState) {
		String oldToBusinessState = toBusinessState;
		toBusinessState = newToBusinessState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.START_TYPE__TO_BUSINESS_STATE, oldToBusinessState, toBusinessState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToBusinessStateIDRef() {
		return toBusinessStateIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBusinessStateIDRef(String newToBusinessStateIDRef) {
		String oldToBusinessStateIDRef = toBusinessStateIDRef;
		toBusinessStateIDRef = newToBusinessStateIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.START_TYPE__TO_BUSINESS_STATE_ID_REF, oldToBusinessStateIDRef, toBusinessStateIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.START_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.START_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.START_TYPE__TO_BUSINESS_STATE:
				return getToBusinessState();
			case ProcessPackage.START_TYPE__TO_BUSINESS_STATE_ID_REF:
				return getToBusinessStateIDRef();
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
			case ProcessPackage.START_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.START_TYPE__TO_BUSINESS_STATE:
				setToBusinessState((String)newValue);
				return;
			case ProcessPackage.START_TYPE__TO_BUSINESS_STATE_ID_REF:
				setToBusinessStateIDRef((String)newValue);
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
			case ProcessPackage.START_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.START_TYPE__TO_BUSINESS_STATE:
				setToBusinessState(TO_BUSINESS_STATE_EDEFAULT);
				return;
			case ProcessPackage.START_TYPE__TO_BUSINESS_STATE_ID_REF:
				setToBusinessStateIDRef(TO_BUSINESS_STATE_ID_REF_EDEFAULT);
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
			case ProcessPackage.START_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.START_TYPE__TO_BUSINESS_STATE:
				return TO_BUSINESS_STATE_EDEFAULT == null ? toBusinessState != null : !TO_BUSINESS_STATE_EDEFAULT.equals(toBusinessState);
			case ProcessPackage.START_TYPE__TO_BUSINESS_STATE_ID_REF:
				return TO_BUSINESS_STATE_ID_REF_EDEFAULT == null ? toBusinessStateIDRef != null : !TO_BUSINESS_STATE_ID_REF_EDEFAULT.equals(toBusinessStateIDRef);
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
		result.append(" (toBusinessState: ");
		result.append(toBusinessState);
		result.append(", toBusinessStateIDRef: ");
		result.append(toBusinessStateIDRef);
		result.append(')');
		return result.toString();
	}

} //StartTypeImpl
