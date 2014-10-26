/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.BinaryCollaborationType;
import org.ebxml.business.process.BusinessDocumentType;
import org.ebxml.business.process.BusinessTransactionType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.IncludeType;
import org.ebxml.business.process.MultiPartyCollaborationType;
import org.ebxml.business.process.PackageType;
import org.ebxml.business.process.ProcessPackage;
import org.ebxml.business.process.ProcessSpecificationType;
import org.ebxml.business.process.SubstitutionSetType;

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
 * An implementation of the model object '<em><b>Specification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getSubstitutionSet <em>Substitution Set</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getBusinessDocument <em>Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getProcessSpecification <em>Process Specification</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getBinaryCollaboration <em>Binary Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getMultiPartyCollaboration <em>Multi Party Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessSpecificationTypeImpl extends MinimalEObjectImpl.Container implements ProcessSpecificationType {
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
	 * The cached value of the '{@link #getSubstitutionSet() <em>Substitution Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutionSet()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstitutionSetType> substitutionSet;

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
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessSpecificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.PROCESS_SPECIFICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.PROCESS_SPECIFICATION_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubstitutionSetType> getSubstitutionSet() {
		if (substitutionSet == null) {
			substitutionSet = new EObjectContainmentEList<SubstitutionSetType>(SubstitutionSetType.class, this, ProcessPackage.PROCESS_SPECIFICATION_TYPE__SUBSTITUTION_SET);
		}
		return substitutionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ProcessPackage.PROCESS_SPECIFICATION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeType> getInclude() {
		return getGroup().list(ProcessPackage.Literals.PROCESS_SPECIFICATION_TYPE__INCLUDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessDocumentType> getBusinessDocument() {
		return getGroup().list(ProcessPackage.Literals.PROCESS_SPECIFICATION_TYPE__BUSINESS_DOCUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessSpecificationType> getProcessSpecification() {
		return getGroup().list(ProcessPackage.Literals.PROCESS_SPECIFICATION_TYPE__PROCESS_SPECIFICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageType> getPackage() {
		return getGroup().list(ProcessPackage.Literals.PROCESS_SPECIFICATION_TYPE__PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryCollaborationType> getBinaryCollaboration() {
		return getGroup().list(ProcessPackage.Literals.PROCESS_SPECIFICATION_TYPE__BINARY_COLLABORATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessTransactionType> getBusinessTransaction() {
		return getGroup().list(ProcessPackage.Literals.PROCESS_SPECIFICATION_TYPE__BUSINESS_TRANSACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiPartyCollaborationType> getMultiPartyCollaboration() {
		return getGroup().list(ProcessPackage.Literals.PROCESS_SPECIFICATION_TYPE__MULTI_PARTY_COLLABORATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS_SPECIFICATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS_SPECIFICATION_TYPE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PROCESS_SPECIFICATION_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__SUBSTITUTION_SET:
				return ((InternalEList<?>)getSubstitutionSet()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BUSINESS_DOCUMENT:
				return ((InternalEList<?>)getBusinessDocument()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__PROCESS_SPECIFICATION:
				return ((InternalEList<?>)getProcessSpecification()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BINARY_COLLABORATION:
				return ((InternalEList<?>)getBinaryCollaboration()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BUSINESS_TRANSACTION:
				return ((InternalEList<?>)getBusinessTransaction()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__MULTI_PARTY_COLLABORATION:
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
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__SUBSTITUTION_SET:
				return getSubstitutionSet();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__INCLUDE:
				return getInclude();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BUSINESS_DOCUMENT:
				return getBusinessDocument();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__PROCESS_SPECIFICATION:
				return getProcessSpecification();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__PACKAGE:
				return getPackage();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BINARY_COLLABORATION:
				return getBinaryCollaboration();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BUSINESS_TRANSACTION:
				return getBusinessTransaction();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__MULTI_PARTY_COLLABORATION:
				return getMultiPartyCollaboration();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__NAME:
				return getName();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__UUID:
				return getUuid();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__VERSION:
				return getVersion();
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
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__SUBSTITUTION_SET:
				getSubstitutionSet().clear();
				getSubstitutionSet().addAll((Collection<? extends SubstitutionSetType>)newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends IncludeType>)newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BUSINESS_DOCUMENT:
				getBusinessDocument().clear();
				getBusinessDocument().addAll((Collection<? extends BusinessDocumentType>)newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__PROCESS_SPECIFICATION:
				getProcessSpecification().clear();
				getProcessSpecification().addAll((Collection<? extends ProcessSpecificationType>)newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends PackageType>)newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BINARY_COLLABORATION:
				getBinaryCollaboration().clear();
				getBinaryCollaboration().addAll((Collection<? extends BinaryCollaborationType>)newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BUSINESS_TRANSACTION:
				getBusinessTransaction().clear();
				getBusinessTransaction().addAll((Collection<? extends BusinessTransactionType>)newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__MULTI_PARTY_COLLABORATION:
				getMultiPartyCollaboration().clear();
				getMultiPartyCollaboration().addAll((Collection<? extends MultiPartyCollaborationType>)newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__UUID:
				setUuid((String)newValue);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__VERSION:
				setVersion((String)newValue);
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
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__SUBSTITUTION_SET:
				getSubstitutionSet().clear();
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__GROUP:
				getGroup().clear();
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__INCLUDE:
				getInclude().clear();
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BUSINESS_DOCUMENT:
				getBusinessDocument().clear();
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__PROCESS_SPECIFICATION:
				getProcessSpecification().clear();
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__PACKAGE:
				getPackage().clear();
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BINARY_COLLABORATION:
				getBinaryCollaboration().clear();
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BUSINESS_TRANSACTION:
				getBusinessTransaction().clear();
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__MULTI_PARTY_COLLABORATION:
				getMultiPartyCollaboration().clear();
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__SUBSTITUTION_SET:
				return substitutionSet != null && !substitutionSet.isEmpty();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__INCLUDE:
				return !getInclude().isEmpty();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BUSINESS_DOCUMENT:
				return !getBusinessDocument().isEmpty();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__PROCESS_SPECIFICATION:
				return !getProcessSpecification().isEmpty();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__PACKAGE:
				return !getPackage().isEmpty();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BINARY_COLLABORATION:
				return !getBinaryCollaboration().isEmpty();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__BUSINESS_TRANSACTION:
				return !getBusinessTransaction().isEmpty();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__MULTI_PARTY_COLLABORATION:
				return !getMultiPartyCollaboration().isEmpty();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ProcessSpecificationTypeImpl
