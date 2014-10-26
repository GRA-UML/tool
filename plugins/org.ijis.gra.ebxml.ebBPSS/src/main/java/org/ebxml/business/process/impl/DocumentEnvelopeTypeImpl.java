/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.AttachmentType;
import org.ebxml.business.process.DocumentEnvelopeType;
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
 * An implementation of the model object '<em><b>Document Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl#getBusinessDocument <em>Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl#getBusinessDocumentIDRef <em>Business Document ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl#isIsAuthenticated <em>Is Authenticated</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl#isIsConfidential <em>Is Confidential</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl#isIsPositiveResponse <em>Is Positive Response</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl#isIsTamperProof <em>Is Tamper Proof</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentEnvelopeTypeImpl extends MinimalEObjectImpl.Container implements DocumentEnvelopeType {
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
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected EList<AttachmentType> attachment;

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
	 * The default value of the '{@link #isIsPositiveResponse() <em>Is Positive Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPositiveResponse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_POSITIVE_RESPONSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPositiveResponse() <em>Is Positive Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPositiveResponse()
	 * @generated
	 * @ordered
	 */
	protected boolean isPositiveResponse = IS_POSITIVE_RESPONSE_EDEFAULT;

	/**
	 * This is true if the Is Positive Response attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isPositiveResponseESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentEnvelopeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.DOCUMENT_ENVELOPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttachmentType> getAttachment() {
		if (attachment == null) {
			attachment = new EObjectContainmentEList<AttachmentType>(AttachmentType.class, this, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__ATTACHMENT);
		}
		return attachment;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT, oldBusinessDocument, businessDocument));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT_ID_REF, oldBusinessDocumentIDRef, businessDocumentIDRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_AUTHENTICATED, oldIsAuthenticated, isAuthenticated, !oldIsAuthenticatedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_AUTHENTICATED, oldIsAuthenticated, IS_AUTHENTICATED_EDEFAULT, oldIsAuthenticatedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_CONFIDENTIAL, oldIsConfidential, isConfidential, !oldIsConfidentialESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_CONFIDENTIAL, oldIsConfidential, IS_CONFIDENTIAL_EDEFAULT, oldIsConfidentialESet));
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
	public boolean isIsPositiveResponse() {
		return isPositiveResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPositiveResponse(boolean newIsPositiveResponse) {
		boolean oldIsPositiveResponse = isPositiveResponse;
		isPositiveResponse = newIsPositiveResponse;
		boolean oldIsPositiveResponseESet = isPositiveResponseESet;
		isPositiveResponseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_POSITIVE_RESPONSE, oldIsPositiveResponse, isPositiveResponse, !oldIsPositiveResponseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsPositiveResponse() {
		boolean oldIsPositiveResponse = isPositiveResponse;
		boolean oldIsPositiveResponseESet = isPositiveResponseESet;
		isPositiveResponse = IS_POSITIVE_RESPONSE_EDEFAULT;
		isPositiveResponseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_POSITIVE_RESPONSE, oldIsPositiveResponse, IS_POSITIVE_RESPONSE_EDEFAULT, oldIsPositiveResponseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsPositiveResponse() {
		return isPositiveResponseESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_TAMPER_PROOF, oldIsTamperProof, isTamperProof, !oldIsTamperProofESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_TAMPER_PROOF, oldIsTamperProof, IS_TAMPER_PROOF_EDEFAULT, oldIsTamperProofESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__ATTACHMENT:
				return ((InternalEList<?>)getAttachment()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__ATTACHMENT:
				return getAttachment();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT:
				return getBusinessDocument();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT_ID_REF:
				return getBusinessDocumentIDRef();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_AUTHENTICATED:
				return isIsAuthenticated();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_CONFIDENTIAL:
				return isIsConfidential();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_POSITIVE_RESPONSE:
				return isIsPositiveResponse();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_TAMPER_PROOF:
				return isIsTamperProof();
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
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__ATTACHMENT:
				getAttachment().clear();
				getAttachment().addAll((Collection<? extends AttachmentType>)newValue);
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT:
				setBusinessDocument((String)newValue);
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT_ID_REF:
				setBusinessDocumentIDRef((String)newValue);
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_AUTHENTICATED:
				setIsAuthenticated((Boolean)newValue);
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_CONFIDENTIAL:
				setIsConfidential((Boolean)newValue);
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_POSITIVE_RESPONSE:
				setIsPositiveResponse((Boolean)newValue);
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_TAMPER_PROOF:
				setIsTamperProof((Boolean)newValue);
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
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__ATTACHMENT:
				getAttachment().clear();
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT:
				setBusinessDocument(BUSINESS_DOCUMENT_EDEFAULT);
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT_ID_REF:
				setBusinessDocumentIDRef(BUSINESS_DOCUMENT_ID_REF_EDEFAULT);
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_AUTHENTICATED:
				unsetIsAuthenticated();
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_CONFIDENTIAL:
				unsetIsConfidential();
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_POSITIVE_RESPONSE:
				unsetIsPositiveResponse();
				return;
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_TAMPER_PROOF:
				unsetIsTamperProof();
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
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__ATTACHMENT:
				return attachment != null && !attachment.isEmpty();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT:
				return BUSINESS_DOCUMENT_EDEFAULT == null ? businessDocument != null : !BUSINESS_DOCUMENT_EDEFAULT.equals(businessDocument);
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT_ID_REF:
				return BUSINESS_DOCUMENT_ID_REF_EDEFAULT == null ? businessDocumentIDRef != null : !BUSINESS_DOCUMENT_ID_REF_EDEFAULT.equals(businessDocumentIDRef);
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_AUTHENTICATED:
				return isSetIsAuthenticated();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_CONFIDENTIAL:
				return isSetIsConfidential();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_POSITIVE_RESPONSE:
				return isSetIsPositiveResponse();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE__IS_TAMPER_PROOF:
				return isSetIsTamperProof();
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
		result.append(", isPositiveResponse: ");
		if (isPositiveResponseESet) result.append(isPositiveResponse); else result.append("<unset>");
		result.append(", isTamperProof: ");
		if (isTamperProofESet) result.append(isTamperProof); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentEnvelopeTypeImpl
