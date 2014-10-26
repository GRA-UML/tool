/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.BusinessPartnerRoleType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.MultiPartyCollaborationType;
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
 * An implementation of the model object '<em><b>Multi Party Collaboration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.MultiPartyCollaborationTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.MultiPartyCollaborationTypeImpl#getBusinessPartnerRole <em>Business Partner Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.MultiPartyCollaborationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.MultiPartyCollaborationTypeImpl#getNameID <em>Name ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiPartyCollaborationTypeImpl extends MinimalEObjectImpl.Container implements MultiPartyCollaborationType {
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
	 * The cached value of the '{@link #getBusinessPartnerRole() <em>Business Partner Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessPartnerRole()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessPartnerRoleType> businessPartnerRole;

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
	protected MultiPartyCollaborationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.MULTI_PARTY_COLLABORATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessPartnerRoleType> getBusinessPartnerRole() {
		if (businessPartnerRole == null) {
			businessPartnerRole = new EObjectContainmentEList<BusinessPartnerRoleType>(BusinessPartnerRoleType.class, this, ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__BUSINESS_PARTNER_ROLE);
		}
		return businessPartnerRole;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__NAME_ID, oldNameID, nameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__BUSINESS_PARTNER_ROLE:
				return ((InternalEList<?>)getBusinessPartnerRole()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__BUSINESS_PARTNER_ROLE:
				return getBusinessPartnerRole();
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__NAME:
				return getName();
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__NAME_ID:
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
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__BUSINESS_PARTNER_ROLE:
				getBusinessPartnerRole().clear();
				getBusinessPartnerRole().addAll((Collection<? extends BusinessPartnerRoleType>)newValue);
				return;
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__NAME_ID:
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
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__BUSINESS_PARTNER_ROLE:
				getBusinessPartnerRole().clear();
				return;
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__NAME_ID:
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
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__BUSINESS_PARTNER_ROLE:
				return businessPartnerRole != null && !businessPartnerRole.isEmpty();
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE__NAME_ID:
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

} //MultiPartyCollaborationTypeImpl
