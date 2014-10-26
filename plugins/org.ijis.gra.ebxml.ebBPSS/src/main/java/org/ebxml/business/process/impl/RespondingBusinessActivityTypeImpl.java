/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import javax.xml.datatype.Duration;

import org.ebxml.business.process.DocumentEnvelopeType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.ProcessPackage;
import org.ebxml.business.process.RespondingBusinessActivityType;

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
 * An implementation of the model object '<em><b>Responding Business Activity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl#getDocumentEnvelope <em>Document Envelope</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl#isIsAuthorizationRequired <em>Is Authorization Required</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl#isIsIntelligibleCheckRequired <em>Is Intelligible Check Required</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl#isIsNonRepudiationReceiptRequired <em>Is Non Repudiation Receipt Required</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl#isIsNonRepudiationRequired <em>Is Non Repudiation Required</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl#getTimeToAcknowledgeReceipt <em>Time To Acknowledge Receipt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RespondingBusinessActivityTypeImpl extends MinimalEObjectImpl.Container implements RespondingBusinessActivityType {
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
	 * The cached value of the '{@link #getDocumentEnvelope() <em>Document Envelope</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentEnvelope()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentEnvelopeType> documentEnvelope;

	/**
	 * The default value of the '{@link #isIsAuthorizationRequired() <em>Is Authorization Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuthorizationRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTHORIZATION_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAuthorizationRequired() <em>Is Authorization Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuthorizationRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isAuthorizationRequired = IS_AUTHORIZATION_REQUIRED_EDEFAULT;

	/**
	 * This is true if the Is Authorization Required attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAuthorizationRequiredESet;

	/**
	 * The default value of the '{@link #isIsIntelligibleCheckRequired() <em>Is Intelligible Check Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIntelligibleCheckRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTELLIGIBLE_CHECK_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIntelligibleCheckRequired() <em>Is Intelligible Check Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIntelligibleCheckRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isIntelligibleCheckRequired = IS_INTELLIGIBLE_CHECK_REQUIRED_EDEFAULT;

	/**
	 * This is true if the Is Intelligible Check Required attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isIntelligibleCheckRequiredESet;

	/**
	 * The default value of the '{@link #isIsNonRepudiationReceiptRequired() <em>Is Non Repudiation Receipt Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNonRepudiationReceiptRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NON_REPUDIATION_RECEIPT_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNonRepudiationReceiptRequired() <em>Is Non Repudiation Receipt Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNonRepudiationReceiptRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isNonRepudiationReceiptRequired = IS_NON_REPUDIATION_RECEIPT_REQUIRED_EDEFAULT;

	/**
	 * This is true if the Is Non Repudiation Receipt Required attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isNonRepudiationReceiptRequiredESet;

	/**
	 * The default value of the '{@link #isIsNonRepudiationRequired() <em>Is Non Repudiation Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNonRepudiationRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NON_REPUDIATION_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNonRepudiationRequired() <em>Is Non Repudiation Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNonRepudiationRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isNonRepudiationRequired = IS_NON_REPUDIATION_REQUIRED_EDEFAULT;

	/**
	 * This is true if the Is Non Repudiation Required attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isNonRepudiationRequiredESet;

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
	 * The default value of the '{@link #getTimeToAcknowledgeReceipt() <em>Time To Acknowledge Receipt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToAcknowledgeReceipt()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TIME_TO_ACKNOWLEDGE_RECEIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeToAcknowledgeReceipt() <em>Time To Acknowledge Receipt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToAcknowledgeReceipt()
	 * @generated
	 * @ordered
	 */
	protected Duration timeToAcknowledgeReceipt = TIME_TO_ACKNOWLEDGE_RECEIPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespondingBusinessActivityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.RESPONDING_BUSINESS_ACTIVITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentEnvelopeType> getDocumentEnvelope() {
		if (documentEnvelope == null) {
			documentEnvelope = new EObjectContainmentEList<DocumentEnvelopeType>(DocumentEnvelopeType.class, this, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE);
		}
		return documentEnvelope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAuthorizationRequired() {
		return isAuthorizationRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuthorizationRequired(boolean newIsAuthorizationRequired) {
		boolean oldIsAuthorizationRequired = isAuthorizationRequired;
		isAuthorizationRequired = newIsAuthorizationRequired;
		boolean oldIsAuthorizationRequiredESet = isAuthorizationRequiredESet;
		isAuthorizationRequiredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED, oldIsAuthorizationRequired, isAuthorizationRequired, !oldIsAuthorizationRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAuthorizationRequired() {
		boolean oldIsAuthorizationRequired = isAuthorizationRequired;
		boolean oldIsAuthorizationRequiredESet = isAuthorizationRequiredESet;
		isAuthorizationRequired = IS_AUTHORIZATION_REQUIRED_EDEFAULT;
		isAuthorizationRequiredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED, oldIsAuthorizationRequired, IS_AUTHORIZATION_REQUIRED_EDEFAULT, oldIsAuthorizationRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAuthorizationRequired() {
		return isAuthorizationRequiredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIntelligibleCheckRequired() {
		return isIntelligibleCheckRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIntelligibleCheckRequired(boolean newIsIntelligibleCheckRequired) {
		boolean oldIsIntelligibleCheckRequired = isIntelligibleCheckRequired;
		isIntelligibleCheckRequired = newIsIntelligibleCheckRequired;
		boolean oldIsIntelligibleCheckRequiredESet = isIntelligibleCheckRequiredESet;
		isIntelligibleCheckRequiredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED, oldIsIntelligibleCheckRequired, isIntelligibleCheckRequired, !oldIsIntelligibleCheckRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsIntelligibleCheckRequired() {
		boolean oldIsIntelligibleCheckRequired = isIntelligibleCheckRequired;
		boolean oldIsIntelligibleCheckRequiredESet = isIntelligibleCheckRequiredESet;
		isIntelligibleCheckRequired = IS_INTELLIGIBLE_CHECK_REQUIRED_EDEFAULT;
		isIntelligibleCheckRequiredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED, oldIsIntelligibleCheckRequired, IS_INTELLIGIBLE_CHECK_REQUIRED_EDEFAULT, oldIsIntelligibleCheckRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsIntelligibleCheckRequired() {
		return isIntelligibleCheckRequiredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNonRepudiationReceiptRequired() {
		return isNonRepudiationReceiptRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNonRepudiationReceiptRequired(boolean newIsNonRepudiationReceiptRequired) {
		boolean oldIsNonRepudiationReceiptRequired = isNonRepudiationReceiptRequired;
		isNonRepudiationReceiptRequired = newIsNonRepudiationReceiptRequired;
		boolean oldIsNonRepudiationReceiptRequiredESet = isNonRepudiationReceiptRequiredESet;
		isNonRepudiationReceiptRequiredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED, oldIsNonRepudiationReceiptRequired, isNonRepudiationReceiptRequired, !oldIsNonRepudiationReceiptRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsNonRepudiationReceiptRequired() {
		boolean oldIsNonRepudiationReceiptRequired = isNonRepudiationReceiptRequired;
		boolean oldIsNonRepudiationReceiptRequiredESet = isNonRepudiationReceiptRequiredESet;
		isNonRepudiationReceiptRequired = IS_NON_REPUDIATION_RECEIPT_REQUIRED_EDEFAULT;
		isNonRepudiationReceiptRequiredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED, oldIsNonRepudiationReceiptRequired, IS_NON_REPUDIATION_RECEIPT_REQUIRED_EDEFAULT, oldIsNonRepudiationReceiptRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsNonRepudiationReceiptRequired() {
		return isNonRepudiationReceiptRequiredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNonRepudiationRequired() {
		return isNonRepudiationRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNonRepudiationRequired(boolean newIsNonRepudiationRequired) {
		boolean oldIsNonRepudiationRequired = isNonRepudiationRequired;
		isNonRepudiationRequired = newIsNonRepudiationRequired;
		boolean oldIsNonRepudiationRequiredESet = isNonRepudiationRequiredESet;
		isNonRepudiationRequiredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED, oldIsNonRepudiationRequired, isNonRepudiationRequired, !oldIsNonRepudiationRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsNonRepudiationRequired() {
		boolean oldIsNonRepudiationRequired = isNonRepudiationRequired;
		boolean oldIsNonRepudiationRequiredESet = isNonRepudiationRequiredESet;
		isNonRepudiationRequired = IS_NON_REPUDIATION_REQUIRED_EDEFAULT;
		isNonRepudiationRequiredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED, oldIsNonRepudiationRequired, IS_NON_REPUDIATION_REQUIRED_EDEFAULT, oldIsNonRepudiationRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsNonRepudiationRequired() {
		return isNonRepudiationRequiredESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME_ID, oldNameID, nameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimeToAcknowledgeReceipt() {
		return timeToAcknowledgeReceipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeToAcknowledgeReceipt(Duration newTimeToAcknowledgeReceipt) {
		Duration oldTimeToAcknowledgeReceipt = timeToAcknowledgeReceipt;
		timeToAcknowledgeReceipt = newTimeToAcknowledgeReceipt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_RECEIPT, oldTimeToAcknowledgeReceipt, timeToAcknowledgeReceipt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE:
				return ((InternalEList<?>)getDocumentEnvelope()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE:
				return getDocumentEnvelope();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED:
				return isIsAuthorizationRequired();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED:
				return isIsIntelligibleCheckRequired();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED:
				return isIsNonRepudiationReceiptRequired();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED:
				return isIsNonRepudiationRequired();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME:
				return getName();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME_ID:
				return getNameID();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_RECEIPT:
				return getTimeToAcknowledgeReceipt();
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
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE:
				getDocumentEnvelope().clear();
				getDocumentEnvelope().addAll((Collection<? extends DocumentEnvelopeType>)newValue);
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED:
				setIsAuthorizationRequired((Boolean)newValue);
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED:
				setIsIntelligibleCheckRequired((Boolean)newValue);
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED:
				setIsNonRepudiationReceiptRequired((Boolean)newValue);
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED:
				setIsNonRepudiationRequired((Boolean)newValue);
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME_ID:
				setNameID((String)newValue);
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_RECEIPT:
				setTimeToAcknowledgeReceipt((Duration)newValue);
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
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE:
				getDocumentEnvelope().clear();
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED:
				unsetIsAuthorizationRequired();
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED:
				unsetIsIntelligibleCheckRequired();
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED:
				unsetIsNonRepudiationReceiptRequired();
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED:
				unsetIsNonRepudiationRequired();
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME_ID:
				setNameID(NAME_ID_EDEFAULT);
				return;
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_RECEIPT:
				setTimeToAcknowledgeReceipt(TIME_TO_ACKNOWLEDGE_RECEIPT_EDEFAULT);
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
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE:
				return documentEnvelope != null && !documentEnvelope.isEmpty();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED:
				return isSetIsAuthorizationRequired();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED:
				return isSetIsIntelligibleCheckRequired();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED:
				return isSetIsNonRepudiationReceiptRequired();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED:
				return isSetIsNonRepudiationRequired();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME_ID:
				return NAME_ID_EDEFAULT == null ? nameID != null : !NAME_ID_EDEFAULT.equals(nameID);
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_RECEIPT:
				return TIME_TO_ACKNOWLEDGE_RECEIPT_EDEFAULT == null ? timeToAcknowledgeReceipt != null : !TIME_TO_ACKNOWLEDGE_RECEIPT_EDEFAULT.equals(timeToAcknowledgeReceipt);
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
		result.append(" (isAuthorizationRequired: ");
		if (isAuthorizationRequiredESet) result.append(isAuthorizationRequired); else result.append("<unset>");
		result.append(", isIntelligibleCheckRequired: ");
		if (isIntelligibleCheckRequiredESet) result.append(isIntelligibleCheckRequired); else result.append("<unset>");
		result.append(", isNonRepudiationReceiptRequired: ");
		if (isNonRepudiationReceiptRequiredESet) result.append(isNonRepudiationReceiptRequired); else result.append("<unset>");
		result.append(", isNonRepudiationRequired: ");
		if (isNonRepudiationRequiredESet) result.append(isNonRepudiationRequired); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nameID: ");
		result.append(nameID);
		result.append(", timeToAcknowledgeReceipt: ");
		result.append(timeToAcknowledgeReceipt);
		result.append(')');
		return result.toString();
	}

} //RespondingBusinessActivityTypeImpl
