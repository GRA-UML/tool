/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.BusinessPartnerRoleType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.PerformsType;
import org.ebxml.business.process.ProcessPackage;
import org.ebxml.business.process.TransitionType;

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
 * An implementation of the model object '<em><b>Business Partner Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.BusinessPartnerRoleTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessPartnerRoleTypeImpl#getPerforms <em>Performs</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessPartnerRoleTypeImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessPartnerRoleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessPartnerRoleTypeImpl#getNameID <em>Name ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessPartnerRoleTypeImpl extends MinimalEObjectImpl.Container implements BusinessPartnerRoleType {
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
	 * The cached value of the '{@link #getPerforms() <em>Performs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerforms()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformsType> performs;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionType> transition;

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
	 * The default value of the '{@link #getNameID() <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameID()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameID() <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameID()
	 * @generated
	 * @ordered
	 */
	protected String nameID = NAME_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessPartnerRoleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.BUSINESS_PARTNER_ROLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformsType> getPerforms() {
		if (performs == null) {
			performs = new EObjectContainmentEList<PerformsType>(PerformsType.class, this, ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__PERFORMS);
		}
		return performs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionType> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<TransitionType>(TransitionType.class, this, ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__TRANSITION);
		}
		return transition;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameID() {
		return nameID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameID(String newNameID) {
		String oldNameID = nameID;
		nameID = newNameID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__NAME_ID, oldNameID, nameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__PERFORMS:
				return ((InternalEList<?>)getPerforms()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__PERFORMS:
				return getPerforms();
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__TRANSITION:
				return getTransition();
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__NAME:
				return getName();
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__NAME_ID:
				return getNameID();
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
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__PERFORMS:
				getPerforms().clear();
				getPerforms().addAll((Collection<? extends PerformsType>)newValue);
				return;
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends TransitionType>)newValue);
				return;
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__NAME_ID:
				setNameID((String)newValue);
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
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__PERFORMS:
				getPerforms().clear();
				return;
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__TRANSITION:
				getTransition().clear();
				return;
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__NAME_ID:
				setNameID(NAME_ID_EDEFAULT);
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
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__PERFORMS:
				return performs != null && !performs.isEmpty();
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__TRANSITION:
				return transition != null && !transition.isEmpty();
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE__NAME_ID:
				return NAME_ID_EDEFAULT == null ? nameID != null : !NAME_ID_EDEFAULT.equals(nameID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", nameID: ");
		result.append(nameID);
		result.append(')');
		return result.toString();
	}

} //BusinessPartnerRoleTypeImpl
