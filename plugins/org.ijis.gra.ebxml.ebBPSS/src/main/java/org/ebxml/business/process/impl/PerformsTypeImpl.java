/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.PerformsType;
import org.ebxml.business.process.ProcessPackage;

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
 * An implementation of the model object '<em><b>Performs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.PerformsTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.PerformsTypeImpl#getInitiatingRole <em>Initiating Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.PerformsTypeImpl#getInitiatingRoleIDRef <em>Initiating Role ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.PerformsTypeImpl#getRespondingRole <em>Responding Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.PerformsTypeImpl#getRespondingRoleIDRef <em>Responding Role ID Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformsTypeImpl extends MinimalEObjectImpl.Container implements PerformsType {
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
	 * The default value of the '{@link #getInitiatingRole() <em>Initiating Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatingRole()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIATING_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiatingRole() <em>Initiating Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatingRole()
	 * @generated
	 * @ordered
	 */
	protected String initiatingRole = INITIATING_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitiatingRoleIDRef() <em>Initiating Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatingRoleIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIATING_ROLE_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiatingRoleIDRef() <em>Initiating Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatingRoleIDRef()
	 * @generated
	 * @ordered
	 */
	protected String initiatingRoleIDRef = INITIATING_ROLE_ID_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRespondingRole() <em>Responding Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondingRole()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONDING_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRespondingRole() <em>Responding Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondingRole()
	 * @generated
	 * @ordered
	 */
	protected String respondingRole = RESPONDING_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRespondingRoleIDRef() <em>Responding Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondingRoleIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONDING_ROLE_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRespondingRoleIDRef() <em>Responding Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondingRoleIDRef()
	 * @generated
	 * @ordered
	 */
	protected String respondingRoleIDRef = RESPONDING_ROLE_ID_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.PERFORMS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.PERFORMS_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitiatingRole() {
		return initiatingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatingRole(String newInitiatingRole) {
		String oldInitiatingRole = initiatingRole;
		initiatingRole = newInitiatingRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PERFORMS_TYPE__INITIATING_ROLE, oldInitiatingRole, initiatingRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitiatingRoleIDRef() {
		return initiatingRoleIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatingRoleIDRef(String newInitiatingRoleIDRef) {
		String oldInitiatingRoleIDRef = initiatingRoleIDRef;
		initiatingRoleIDRef = newInitiatingRoleIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PERFORMS_TYPE__INITIATING_ROLE_ID_REF, oldInitiatingRoleIDRef, initiatingRoleIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRespondingRole() {
		return respondingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespondingRole(String newRespondingRole) {
		String oldRespondingRole = respondingRole;
		respondingRole = newRespondingRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PERFORMS_TYPE__RESPONDING_ROLE, oldRespondingRole, respondingRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRespondingRoleIDRef() {
		return respondingRoleIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespondingRoleIDRef(String newRespondingRoleIDRef) {
		String oldRespondingRoleIDRef = respondingRoleIDRef;
		respondingRoleIDRef = newRespondingRoleIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PERFORMS_TYPE__RESPONDING_ROLE_ID_REF, oldRespondingRoleIDRef, respondingRoleIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.PERFORMS_TYPE__DOCUMENTATION:
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
			case ProcessPackage.PERFORMS_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.PERFORMS_TYPE__INITIATING_ROLE:
				return getInitiatingRole();
			case ProcessPackage.PERFORMS_TYPE__INITIATING_ROLE_ID_REF:
				return getInitiatingRoleIDRef();
			case ProcessPackage.PERFORMS_TYPE__RESPONDING_ROLE:
				return getRespondingRole();
			case ProcessPackage.PERFORMS_TYPE__RESPONDING_ROLE_ID_REF:
				return getRespondingRoleIDRef();
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
			case ProcessPackage.PERFORMS_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.PERFORMS_TYPE__INITIATING_ROLE:
				setInitiatingRole((String)newValue);
				return;
			case ProcessPackage.PERFORMS_TYPE__INITIATING_ROLE_ID_REF:
				setInitiatingRoleIDRef((String)newValue);
				return;
			case ProcessPackage.PERFORMS_TYPE__RESPONDING_ROLE:
				setRespondingRole((String)newValue);
				return;
			case ProcessPackage.PERFORMS_TYPE__RESPONDING_ROLE_ID_REF:
				setRespondingRoleIDRef((String)newValue);
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
			case ProcessPackage.PERFORMS_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.PERFORMS_TYPE__INITIATING_ROLE:
				setInitiatingRole(INITIATING_ROLE_EDEFAULT);
				return;
			case ProcessPackage.PERFORMS_TYPE__INITIATING_ROLE_ID_REF:
				setInitiatingRoleIDRef(INITIATING_ROLE_ID_REF_EDEFAULT);
				return;
			case ProcessPackage.PERFORMS_TYPE__RESPONDING_ROLE:
				setRespondingRole(RESPONDING_ROLE_EDEFAULT);
				return;
			case ProcessPackage.PERFORMS_TYPE__RESPONDING_ROLE_ID_REF:
				setRespondingRoleIDRef(RESPONDING_ROLE_ID_REF_EDEFAULT);
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
			case ProcessPackage.PERFORMS_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.PERFORMS_TYPE__INITIATING_ROLE:
				return INITIATING_ROLE_EDEFAULT == null ? initiatingRole != null : !INITIATING_ROLE_EDEFAULT.equals(initiatingRole);
			case ProcessPackage.PERFORMS_TYPE__INITIATING_ROLE_ID_REF:
				return INITIATING_ROLE_ID_REF_EDEFAULT == null ? initiatingRoleIDRef != null : !INITIATING_ROLE_ID_REF_EDEFAULT.equals(initiatingRoleIDRef);
			case ProcessPackage.PERFORMS_TYPE__RESPONDING_ROLE:
				return RESPONDING_ROLE_EDEFAULT == null ? respondingRole != null : !RESPONDING_ROLE_EDEFAULT.equals(respondingRole);
			case ProcessPackage.PERFORMS_TYPE__RESPONDING_ROLE_ID_REF:
				return RESPONDING_ROLE_ID_REF_EDEFAULT == null ? respondingRoleIDRef != null : !RESPONDING_ROLE_ID_REF_EDEFAULT.equals(respondingRoleIDRef);
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
		result.append(" (initiatingRole: ");
		result.append(initiatingRole);
		result.append(", initiatingRoleIDRef: ");
		result.append(initiatingRoleIDRef);
		result.append(", respondingRole: ");
		result.append(respondingRole);
		result.append(", respondingRoleIDRef: ");
		result.append(respondingRoleIDRef);
		result.append(')');
		return result.toString();
	}

} //PerformsTypeImpl
