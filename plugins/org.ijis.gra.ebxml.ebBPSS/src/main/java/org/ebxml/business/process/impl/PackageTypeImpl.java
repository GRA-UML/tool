/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.BinaryCollaborationType;
import org.ebxml.business.process.BusinessTransactionType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.MultiPartyCollaborationType;
import org.ebxml.business.process.PackageType;
import org.ebxml.business.process.ProcessPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.PackageTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.PackageTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.PackageTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.PackageTypeImpl#getBinaryCollaboration <em>Binary Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.PackageTypeImpl#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.PackageTypeImpl#getMultiPartyCollaboration <em>Multi Party Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.PackageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.PackageTypeImpl#getNameID <em>Name ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageTypeImpl extends MinimalEObjectImpl.Container implements PackageType {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	protected PackageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.PACKAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.PACKAGE_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ProcessPackage.PACKAGE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageType> getPackage() {
		return getGroup().list(ProcessPackage.Literals.PACKAGE_TYPE__PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryCollaborationType> getBinaryCollaboration() {
		return getGroup().list(ProcessPackage.Literals.PACKAGE_TYPE__BINARY_COLLABORATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessTransactionType> getBusinessTransaction() {
		return getGroup().list(ProcessPackage.Literals.PACKAGE_TYPE__BUSINESS_TRANSACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiPartyCollaborationType> getMultiPartyCollaboration() {
		return getGroup().list(ProcessPackage.Literals.PACKAGE_TYPE__MULTI_PARTY_COLLABORATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PACKAGE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PACKAGE_TYPE__NAME_ID, oldNameID, nameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.PACKAGE_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PACKAGE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PACKAGE_TYPE__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PACKAGE_TYPE__BINARY_COLLABORATION:
				return ((InternalEList<?>)getBinaryCollaboration()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PACKAGE_TYPE__BUSINESS_TRANSACTION:
				return ((InternalEList<?>)getBusinessTransaction()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PACKAGE_TYPE__MULTI_PARTY_COLLABORATION:
				return ((InternalEList<?>)getMultiPartyCollaboration()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.PACKAGE_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.PACKAGE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ProcessPackage.PACKAGE_TYPE__PACKAGE:
				return getPackage();
			case ProcessPackage.PACKAGE_TYPE__BINARY_COLLABORATION:
				return getBinaryCollaboration();
			case ProcessPackage.PACKAGE_TYPE__BUSINESS_TRANSACTION:
				return getBusinessTransaction();
			case ProcessPackage.PACKAGE_TYPE__MULTI_PARTY_COLLABORATION:
				return getMultiPartyCollaboration();
			case ProcessPackage.PACKAGE_TYPE__NAME:
				return getName();
			case ProcessPackage.PACKAGE_TYPE__NAME_ID:
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
			case ProcessPackage.PACKAGE_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.PACKAGE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ProcessPackage.PACKAGE_TYPE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends PackageType>)newValue);
				return;
			case ProcessPackage.PACKAGE_TYPE__BINARY_COLLABORATION:
				getBinaryCollaboration().clear();
				getBinaryCollaboration().addAll((Collection<? extends BinaryCollaborationType>)newValue);
				return;
			case ProcessPackage.PACKAGE_TYPE__BUSINESS_TRANSACTION:
				getBusinessTransaction().clear();
				getBusinessTransaction().addAll((Collection<? extends BusinessTransactionType>)newValue);
				return;
			case ProcessPackage.PACKAGE_TYPE__MULTI_PARTY_COLLABORATION:
				getMultiPartyCollaboration().clear();
				getMultiPartyCollaboration().addAll((Collection<? extends MultiPartyCollaborationType>)newValue);
				return;
			case ProcessPackage.PACKAGE_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.PACKAGE_TYPE__NAME_ID:
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
			case ProcessPackage.PACKAGE_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.PACKAGE_TYPE__GROUP:
				getGroup().clear();
				return;
			case ProcessPackage.PACKAGE_TYPE__PACKAGE:
				getPackage().clear();
				return;
			case ProcessPackage.PACKAGE_TYPE__BINARY_COLLABORATION:
				getBinaryCollaboration().clear();
				return;
			case ProcessPackage.PACKAGE_TYPE__BUSINESS_TRANSACTION:
				getBusinessTransaction().clear();
				return;
			case ProcessPackage.PACKAGE_TYPE__MULTI_PARTY_COLLABORATION:
				getMultiPartyCollaboration().clear();
				return;
			case ProcessPackage.PACKAGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.PACKAGE_TYPE__NAME_ID:
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
			case ProcessPackage.PACKAGE_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.PACKAGE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case ProcessPackage.PACKAGE_TYPE__PACKAGE:
				return !getPackage().isEmpty();
			case ProcessPackage.PACKAGE_TYPE__BINARY_COLLABORATION:
				return !getBinaryCollaboration().isEmpty();
			case ProcessPackage.PACKAGE_TYPE__BUSINESS_TRANSACTION:
				return !getBusinessTransaction().isEmpty();
			case ProcessPackage.PACKAGE_TYPE__MULTI_PARTY_COLLABORATION:
				return !getMultiPartyCollaboration().isEmpty();
			case ProcessPackage.PACKAGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.PACKAGE_TYPE__NAME_ID:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", nameID: ");
		result.append(nameID);
		result.append(')');
		return result.toString();
	}

} //PackageTypeImpl
