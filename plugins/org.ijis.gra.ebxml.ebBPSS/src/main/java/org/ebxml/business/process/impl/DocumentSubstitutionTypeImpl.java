/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.DocumentSubstitutionType;
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
 * An implementation of the model object '<em><b>Document Substitution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.DocumentSubstitutionTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentSubstitutionTypeImpl#getOriginalBusinessDocument <em>Original Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentSubstitutionTypeImpl#getOriginalBusinessDocumentID <em>Original Business Document ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentSubstitutionTypeImpl#getSubstituteBusinessDocument <em>Substitute Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentSubstitutionTypeImpl#getSubstituteBusinessDocumentId <em>Substitute Business Document Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentSubstitutionTypeImpl extends MinimalEObjectImpl.Container implements DocumentSubstitutionType {
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
	 * The default value of the '{@link #getOriginalBusinessDocument() <em>Original Business Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalBusinessDocument()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_BUSINESS_DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalBusinessDocument() <em>Original Business Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalBusinessDocument()
	 * @generated
	 * @ordered
	 */
	protected String originalBusinessDocument = ORIGINAL_BUSINESS_DOCUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginalBusinessDocumentID() <em>Original Business Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalBusinessDocumentID()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_BUSINESS_DOCUMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalBusinessDocumentID() <em>Original Business Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalBusinessDocumentID()
	 * @generated
	 * @ordered
	 */
	protected String originalBusinessDocumentID = ORIGINAL_BUSINESS_DOCUMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubstituteBusinessDocument() <em>Substitute Business Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstituteBusinessDocument()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSTITUTE_BUSINESS_DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubstituteBusinessDocument() <em>Substitute Business Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstituteBusinessDocument()
	 * @generated
	 * @ordered
	 */
	protected String substituteBusinessDocument = SUBSTITUTE_BUSINESS_DOCUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubstituteBusinessDocumentId() <em>Substitute Business Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstituteBusinessDocumentId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSTITUTE_BUSINESS_DOCUMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubstituteBusinessDocumentId() <em>Substitute Business Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstituteBusinessDocumentId()
	 * @generated
	 * @ordered
	 */
	protected String substituteBusinessDocumentId = SUBSTITUTE_BUSINESS_DOCUMENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentSubstitutionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.DOCUMENT_SUBSTITUTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalBusinessDocument() {
		return originalBusinessDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalBusinessDocument(String newOriginalBusinessDocument) {
		String oldOriginalBusinessDocument = originalBusinessDocument;
		originalBusinessDocument = newOriginalBusinessDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT, oldOriginalBusinessDocument, originalBusinessDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginalBusinessDocumentID() {
		return originalBusinessDocumentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalBusinessDocumentID(String newOriginalBusinessDocumentID) {
		String oldOriginalBusinessDocumentID = originalBusinessDocumentID;
		originalBusinessDocumentID = newOriginalBusinessDocumentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT_ID, oldOriginalBusinessDocumentID, originalBusinessDocumentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubstituteBusinessDocument() {
		return substituteBusinessDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstituteBusinessDocument(String newSubstituteBusinessDocument) {
		String oldSubstituteBusinessDocument = substituteBusinessDocument;
		substituteBusinessDocument = newSubstituteBusinessDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT, oldSubstituteBusinessDocument, substituteBusinessDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubstituteBusinessDocumentId() {
		return substituteBusinessDocumentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstituteBusinessDocumentId(String newSubstituteBusinessDocumentId) {
		String oldSubstituteBusinessDocumentId = substituteBusinessDocumentId;
		substituteBusinessDocumentId = newSubstituteBusinessDocumentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT_ID, oldSubstituteBusinessDocumentId, substituteBusinessDocumentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__DOCUMENTATION:
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
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT:
				return getOriginalBusinessDocument();
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT_ID:
				return getOriginalBusinessDocumentID();
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT:
				return getSubstituteBusinessDocument();
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT_ID:
				return getSubstituteBusinessDocumentId();
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
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT:
				setOriginalBusinessDocument((String)newValue);
				return;
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT_ID:
				setOriginalBusinessDocumentID((String)newValue);
				return;
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT:
				setSubstituteBusinessDocument((String)newValue);
				return;
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT_ID:
				setSubstituteBusinessDocumentId((String)newValue);
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
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT:
				setOriginalBusinessDocument(ORIGINAL_BUSINESS_DOCUMENT_EDEFAULT);
				return;
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT_ID:
				setOriginalBusinessDocumentID(ORIGINAL_BUSINESS_DOCUMENT_ID_EDEFAULT);
				return;
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT:
				setSubstituteBusinessDocument(SUBSTITUTE_BUSINESS_DOCUMENT_EDEFAULT);
				return;
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT_ID:
				setSubstituteBusinessDocumentId(SUBSTITUTE_BUSINESS_DOCUMENT_ID_EDEFAULT);
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
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT:
				return ORIGINAL_BUSINESS_DOCUMENT_EDEFAULT == null ? originalBusinessDocument != null : !ORIGINAL_BUSINESS_DOCUMENT_EDEFAULT.equals(originalBusinessDocument);
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT_ID:
				return ORIGINAL_BUSINESS_DOCUMENT_ID_EDEFAULT == null ? originalBusinessDocumentID != null : !ORIGINAL_BUSINESS_DOCUMENT_ID_EDEFAULT.equals(originalBusinessDocumentID);
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT:
				return SUBSTITUTE_BUSINESS_DOCUMENT_EDEFAULT == null ? substituteBusinessDocument != null : !SUBSTITUTE_BUSINESS_DOCUMENT_EDEFAULT.equals(substituteBusinessDocument);
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT_ID:
				return SUBSTITUTE_BUSINESS_DOCUMENT_ID_EDEFAULT == null ? substituteBusinessDocumentId != null : !SUBSTITUTE_BUSINESS_DOCUMENT_ID_EDEFAULT.equals(substituteBusinessDocumentId);
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
		result.append(" (originalBusinessDocument: ");
		result.append(originalBusinessDocument);
		result.append(", originalBusinessDocumentID: ");
		result.append(originalBusinessDocumentID);
		result.append(", substituteBusinessDocument: ");
		result.append(substituteBusinessDocument);
		result.append(", substituteBusinessDocumentId: ");
		result.append(substituteBusinessDocumentId);
		result.append(')');
		return result.toString();
	}

} //DocumentSubstitutionTypeImpl
