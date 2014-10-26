/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.AttachmentType;
import org.ebxml.business.process.DocumentationType;
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
 * An implementation of the model object '<em><b>Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.AttachmentTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.AttachmentTypeImpl#getBusinessDocument <em>Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.AttachmentTypeImpl#getBusinessDocumentIDRef <em>Business Document ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.AttachmentTypeImpl#isIsAuthenticated <em>Is Authenticated</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.AttachmentTypeImpl#isIsConfidential <em>Is Confidential</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.AttachmentTypeImpl#isIsTamperProof <em>Is Tamper Proof</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.AttachmentTypeImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.AttachmentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.AttachmentTypeImpl#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.AttachmentTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.AttachmentTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttachmentTypeImpl extends MinimalEObjectImpl.Container implements AttachmentType {
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
	 * The default value of the '{@link #getBusinessDocument() <em>Business Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessDocument()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessDocument() <em>Business Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessDocument()
	 * @generated
	 * @ordered
	 */
	protected String businessDocument = BUSINESS_DOCUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusinessDocumentIDRef() <em>Business Document ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessDocumentIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_DOCUMENT_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessDocumentIDRef() <em>Business Document ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessDocumentIDRef()
	 * @generated
	 * @ordered
	 */
	protected String businessDocumentIDRef = BUSINESS_DOCUMENT_ID_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAuthenticated() <em>Is Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTHENTICATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAuthenticated() <em>Is Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected boolean isAuthenticated = IS_AUTHENTICATED_EDEFAULT;

	/**
	 * This is true if the Is Authenticated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAuthenticatedESet;

	/**
	 * The default value of the '{@link #isIsConfidential() <em>Is Confidential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConfidential()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONFIDENTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConfidential() <em>Is Confidential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConfidential()
	 * @generated
	 * @ordered
	 */
	protected boolean isConfidential = IS_CONFIDENTIAL_EDEFAULT;

	/**
	 * This is true if the Is Confidential attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isConfidentialESet;

	/**
	 * The default value of the '{@link #isIsTamperProof() <em>Is Tamper Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTamperProof()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TAMPER_PROOF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTamperProof() <em>Is Tamper Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTamperProof()
	 * @generated
	 * @ordered
	 */
	protected boolean isTamperProof = IS_TAMPER_PROOF_EDEFAULT;

	/**
	 * This is true if the Is Tamper Proof attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isTamperProofESet;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected String specification = SPECIFICATION_EDEFAULT;

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
	protected AttachmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.ATTACHMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.ATTACHMENT_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessDocument() {
		return businessDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessDocument(String newBusinessDocument) {
		String oldBusinessDocument = businessDocument;
		businessDocument = newBusinessDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.ATTACHMENT_TYPE__BUSINESS_DOCUMENT, oldBusinessDocument, businessDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessDocumentIDRef() {
		return businessDocumentIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessDocumentIDRef(String newBusinessDocumentIDRef) {
		String oldBusinessDocumentIDRef = businessDocumentIDRef;
		businessDocumentIDRef = newBusinessDocumentIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.ATTACHMENT_TYPE__BUSINESS_DOCUMENT_ID_REF, oldBusinessDocumentIDRef, businessDocumentIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAuthenticated() {
		return isAuthenticated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuthenticated(boolean newIsAuthenticated) {
		boolean oldIsAuthenticated = isAuthenticated;
		isAuthenticated = newIsAuthenticated;
		boolean oldIsAuthenticatedESet = isAuthenticatedESet;
		isAuthenticatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.ATTACHMENT_TYPE__IS_AUTHENTICATED, oldIsAuthenticated, isAuthenticated, !oldIsAuthenticatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAuthenticated() {
		boolean oldIsAuthenticated = isAuthenticated;
		boolean oldIsAuthenticatedESet = isAuthenticatedESet;
		isAuthenticated = IS_AUTHENTICATED_EDEFAULT;
		isAuthenticatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.ATTACHMENT_TYPE__IS_AUTHENTICATED, oldIsAuthenticated, IS_AUTHENTICATED_EDEFAULT, oldIsAuthenticatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAuthenticated() {
		return isAuthenticatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConfidential() {
		return isConfidential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConfidential(boolean newIsConfidential) {
		boolean oldIsConfidential = isConfidential;
		isConfidential = newIsConfidential;
		boolean oldIsConfidentialESet = isConfidentialESet;
		isConfidentialESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.ATTACHMENT_TYPE__IS_CONFIDENTIAL, oldIsConfidential, isConfidential, !oldIsConfidentialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsConfidential() {
		boolean oldIsConfidential = isConfidential;
		boolean oldIsConfidentialESet = isConfidentialESet;
		isConfidential = IS_CONFIDENTIAL_EDEFAULT;
		isConfidentialESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.ATTACHMENT_TYPE__IS_CONFIDENTIAL, oldIsConfidential, IS_CONFIDENTIAL_EDEFAULT, oldIsConfidentialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsConfidential() {
		return isConfidentialESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTamperProof() {
		return isTamperProof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTamperProof(boolean newIsTamperProof) {
		boolean oldIsTamperProof = isTamperProof;
		isTamperProof = newIsTamperProof;
		boolean oldIsTamperProofESet = isTamperProofESet;
		isTamperProofESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.ATTACHMENT_TYPE__IS_TAMPER_PROOF, oldIsTamperProof, isTamperProof, !oldIsTamperProofESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsTamperProof() {
		boolean oldIsTamperProof = isTamperProof;
		boolean oldIsTamperProofESet = isTamperProofESet;
		isTamperProof = IS_TAMPER_PROOF_EDEFAULT;
		isTamperProofESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.ATTACHMENT_TYPE__IS_TAMPER_PROOF, oldIsTamperProof, IS_TAMPER_PROOF_EDEFAULT, oldIsTamperProofESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsTamperProof() {
		return isTamperProofESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.ATTACHMENT_TYPE__MIME_TYPE, oldMimeType, mimeType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.ATTACHMENT_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.ATTACHMENT_TYPE__NAME_ID, oldNameID, nameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(String newSpecification) {
		String oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.ATTACHMENT_TYPE__SPECIFICATION, oldSpecification, specification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.ATTACHMENT_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.ATTACHMENT_TYPE__DOCUMENTATION:
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
			case ProcessPackage.ATTACHMENT_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.ATTACHMENT_TYPE__BUSINESS_DOCUMENT:
				return getBusinessDocument();
			case ProcessPackage.ATTACHMENT_TYPE__BUSINESS_DOCUMENT_ID_REF:
				return getBusinessDocumentIDRef();
			case ProcessPackage.ATTACHMENT_TYPE__IS_AUTHENTICATED:
				return isIsAuthenticated();
			case ProcessPackage.ATTACHMENT_TYPE__IS_CONFIDENTIAL:
				return isIsConfidential();
			case ProcessPackage.ATTACHMENT_TYPE__IS_TAMPER_PROOF:
				return isIsTamperProof();
			case ProcessPackage.ATTACHMENT_TYPE__MIME_TYPE:
				return getMimeType();
			case ProcessPackage.ATTACHMENT_TYPE__NAME:
				return getName();
			case ProcessPackage.ATTACHMENT_TYPE__NAME_ID:
				return getNameID();
			case ProcessPackage.ATTACHMENT_TYPE__SPECIFICATION:
				return getSpecification();
			case ProcessPackage.ATTACHMENT_TYPE__VERSION:
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
			case ProcessPackage.ATTACHMENT_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__BUSINESS_DOCUMENT:
				setBusinessDocument((String)newValue);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__BUSINESS_DOCUMENT_ID_REF:
				setBusinessDocumentIDRef((String)newValue);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__IS_AUTHENTICATED:
				setIsAuthenticated((Boolean)newValue);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__IS_CONFIDENTIAL:
				setIsConfidential((Boolean)newValue);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__IS_TAMPER_PROOF:
				setIsTamperProof((Boolean)newValue);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__NAME_ID:
				setNameID((String)newValue);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__SPECIFICATION:
				setSpecification((String)newValue);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__VERSION:
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
			case ProcessPackage.ATTACHMENT_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.ATTACHMENT_TYPE__BUSINESS_DOCUMENT:
				setBusinessDocument(BUSINESS_DOCUMENT_EDEFAULT);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__BUSINESS_DOCUMENT_ID_REF:
				setBusinessDocumentIDRef(BUSINESS_DOCUMENT_ID_REF_EDEFAULT);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__IS_AUTHENTICATED:
				unsetIsAuthenticated();
				return;
			case ProcessPackage.ATTACHMENT_TYPE__IS_CONFIDENTIAL:
				unsetIsConfidential();
				return;
			case ProcessPackage.ATTACHMENT_TYPE__IS_TAMPER_PROOF:
				unsetIsTamperProof();
				return;
			case ProcessPackage.ATTACHMENT_TYPE__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__NAME_ID:
				setNameID(NAME_ID_EDEFAULT);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__SPECIFICATION:
				setSpecification(SPECIFICATION_EDEFAULT);
				return;
			case ProcessPackage.ATTACHMENT_TYPE__VERSION:
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
			case ProcessPackage.ATTACHMENT_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.ATTACHMENT_TYPE__BUSINESS_DOCUMENT:
				return BUSINESS_DOCUMENT_EDEFAULT == null ? businessDocument != null : !BUSINESS_DOCUMENT_EDEFAULT.equals(businessDocument);
			case ProcessPackage.ATTACHMENT_TYPE__BUSINESS_DOCUMENT_ID_REF:
				return BUSINESS_DOCUMENT_ID_REF_EDEFAULT == null ? businessDocumentIDRef != null : !BUSINESS_DOCUMENT_ID_REF_EDEFAULT.equals(businessDocumentIDRef);
			case ProcessPackage.ATTACHMENT_TYPE__IS_AUTHENTICATED:
				return isSetIsAuthenticated();
			case ProcessPackage.ATTACHMENT_TYPE__IS_CONFIDENTIAL:
				return isSetIsConfidential();
			case ProcessPackage.ATTACHMENT_TYPE__IS_TAMPER_PROOF:
				return isSetIsTamperProof();
			case ProcessPackage.ATTACHMENT_TYPE__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case ProcessPackage.ATTACHMENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.ATTACHMENT_TYPE__NAME_ID:
				return NAME_ID_EDEFAULT == null ? nameID != null : !NAME_ID_EDEFAULT.equals(nameID);
			case ProcessPackage.ATTACHMENT_TYPE__SPECIFICATION:
				return SPECIFICATION_EDEFAULT == null ? specification != null : !SPECIFICATION_EDEFAULT.equals(specification);
			case ProcessPackage.ATTACHMENT_TYPE__VERSION:
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
		result.append(" (businessDocument: ");
		result.append(businessDocument);
		result.append(", businessDocumentIDRef: ");
		result.append(businessDocumentIDRef);
		result.append(", isAuthenticated: ");
		if (isAuthenticatedESet) result.append(isAuthenticated); else result.append("<unset>");
		result.append(", isConfidential: ");
		if (isConfidentialESet) result.append(isConfidential); else result.append("<unset>");
		result.append(", isTamperProof: ");
		if (isTamperProofESet) result.append(isTamperProof); else result.append("<unset>");
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", name: ");
		result.append(name);
		result.append(", nameID: ");
		result.append(nameID);
		result.append(", specification: ");
		result.append(specification);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //AttachmentTypeImpl
