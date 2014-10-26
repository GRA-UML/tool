/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.CharacteristicsType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.SyncReplyModeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristics Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CharacteristicsTypeImpl#isAuthenticated <em>Authenticated</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CharacteristicsTypeImpl#isAuthorized <em>Authorized</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CharacteristicsTypeImpl#isConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CharacteristicsTypeImpl#isNonrepudiationOfOrigin <em>Nonrepudiation Of Origin</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CharacteristicsTypeImpl#isNonrepudiationOfReceipt <em>Nonrepudiation Of Receipt</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CharacteristicsTypeImpl#isSecureTransport <em>Secure Transport</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CharacteristicsTypeImpl#getSyncReplyMode <em>Sync Reply Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacteristicsTypeImpl extends MinimalEObjectImpl.Container implements CharacteristicsType {
	/**
	 * The default value of the '{@link #isAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHENTICATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthenticated() <em>Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected boolean authenticated = AUTHENTICATED_EDEFAULT;

	/**
	 * This is true if the Authenticated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authenticatedESet;

	/**
	 * The default value of the '{@link #isAuthorized() <em>Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHORIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthorized() <em>Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorized()
	 * @generated
	 * @ordered
	 */
	protected boolean authorized = AUTHORIZED_EDEFAULT;

	/**
	 * This is true if the Authorized attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authorizedESet;

	/**
	 * The default value of the '{@link #isConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIDENTIALITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected boolean confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * This is true if the Confidentiality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean confidentialityESet;

	/**
	 * The default value of the '{@link #isNonrepudiationOfOrigin() <em>Nonrepudiation Of Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonrepudiationOfOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NONREPUDIATION_OF_ORIGIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNonrepudiationOfOrigin() <em>Nonrepudiation Of Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonrepudiationOfOrigin()
	 * @generated
	 * @ordered
	 */
	protected boolean nonrepudiationOfOrigin = NONREPUDIATION_OF_ORIGIN_EDEFAULT;

	/**
	 * This is true if the Nonrepudiation Of Origin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nonrepudiationOfOriginESet;

	/**
	 * The default value of the '{@link #isNonrepudiationOfReceipt() <em>Nonrepudiation Of Receipt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonrepudiationOfReceipt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NONREPUDIATION_OF_RECEIPT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNonrepudiationOfReceipt() <em>Nonrepudiation Of Receipt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonrepudiationOfReceipt()
	 * @generated
	 * @ordered
	 */
	protected boolean nonrepudiationOfReceipt = NONREPUDIATION_OF_RECEIPT_EDEFAULT;

	/**
	 * This is true if the Nonrepudiation Of Receipt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nonrepudiationOfReceiptESet;

	/**
	 * The default value of the '{@link #isSecureTransport() <em>Secure Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecureTransport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SECURE_TRANSPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSecureTransport() <em>Secure Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecureTransport()
	 * @generated
	 * @ordered
	 */
	protected boolean secureTransport = SECURE_TRANSPORT_EDEFAULT;

	/**
	 * This is true if the Secure Transport attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secureTransportESet;

	/**
	 * The default value of the '{@link #getSyncReplyMode() <em>Sync Reply Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncReplyMode()
	 * @generated
	 * @ordered
	 */
	protected static final SyncReplyModeType SYNC_REPLY_MODE_EDEFAULT = SyncReplyModeType.RESPONSE_ONLY;

	/**
	 * The cached value of the '{@link #getSyncReplyMode() <em>Sync Reply Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncReplyMode()
	 * @generated
	 * @ordered
	 */
	protected SyncReplyModeType syncReplyMode = SYNC_REPLY_MODE_EDEFAULT;

	/**
	 * This is true if the Sync Reply Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean syncReplyModeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.CHARACTERISTICS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuthenticated() {
		return authenticated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticated(boolean newAuthenticated) {
		boolean oldAuthenticated = authenticated;
		authenticated = newAuthenticated;
		boolean oldAuthenticatedESet = authenticatedESet;
		authenticatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CHARACTERISTICS_TYPE__AUTHENTICATED, oldAuthenticated, authenticated, !oldAuthenticatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAuthenticated() {
		boolean oldAuthenticated = authenticated;
		boolean oldAuthenticatedESet = authenticatedESet;
		authenticated = AUTHENTICATED_EDEFAULT;
		authenticatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.CHARACTERISTICS_TYPE__AUTHENTICATED, oldAuthenticated, AUTHENTICATED_EDEFAULT, oldAuthenticatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAuthenticated() {
		return authenticatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuthorized() {
		return authorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorized(boolean newAuthorized) {
		boolean oldAuthorized = authorized;
		authorized = newAuthorized;
		boolean oldAuthorizedESet = authorizedESet;
		authorizedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CHARACTERISTICS_TYPE__AUTHORIZED, oldAuthorized, authorized, !oldAuthorizedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAuthorized() {
		boolean oldAuthorized = authorized;
		boolean oldAuthorizedESet = authorizedESet;
		authorized = AUTHORIZED_EDEFAULT;
		authorizedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.CHARACTERISTICS_TYPE__AUTHORIZED, oldAuthorized, AUTHORIZED_EDEFAULT, oldAuthorizedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAuthorized() {
		return authorizedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfidentiality() {
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidentiality(boolean newConfidentiality) {
		boolean oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality;
		boolean oldConfidentialityESet = confidentialityESet;
		confidentialityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CHARACTERISTICS_TYPE__CONFIDENTIALITY, oldConfidentiality, confidentiality, !oldConfidentialityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConfidentiality() {
		boolean oldConfidentiality = confidentiality;
		boolean oldConfidentialityESet = confidentialityESet;
		confidentiality = CONFIDENTIALITY_EDEFAULT;
		confidentialityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.CHARACTERISTICS_TYPE__CONFIDENTIALITY, oldConfidentiality, CONFIDENTIALITY_EDEFAULT, oldConfidentialityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConfidentiality() {
		return confidentialityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonrepudiationOfOrigin() {
		return nonrepudiationOfOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonrepudiationOfOrigin(boolean newNonrepudiationOfOrigin) {
		boolean oldNonrepudiationOfOrigin = nonrepudiationOfOrigin;
		nonrepudiationOfOrigin = newNonrepudiationOfOrigin;
		boolean oldNonrepudiationOfOriginESet = nonrepudiationOfOriginESet;
		nonrepudiationOfOriginESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_ORIGIN, oldNonrepudiationOfOrigin, nonrepudiationOfOrigin, !oldNonrepudiationOfOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNonrepudiationOfOrigin() {
		boolean oldNonrepudiationOfOrigin = nonrepudiationOfOrigin;
		boolean oldNonrepudiationOfOriginESet = nonrepudiationOfOriginESet;
		nonrepudiationOfOrigin = NONREPUDIATION_OF_ORIGIN_EDEFAULT;
		nonrepudiationOfOriginESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_ORIGIN, oldNonrepudiationOfOrigin, NONREPUDIATION_OF_ORIGIN_EDEFAULT, oldNonrepudiationOfOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNonrepudiationOfOrigin() {
		return nonrepudiationOfOriginESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonrepudiationOfReceipt() {
		return nonrepudiationOfReceipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonrepudiationOfReceipt(boolean newNonrepudiationOfReceipt) {
		boolean oldNonrepudiationOfReceipt = nonrepudiationOfReceipt;
		nonrepudiationOfReceipt = newNonrepudiationOfReceipt;
		boolean oldNonrepudiationOfReceiptESet = nonrepudiationOfReceiptESet;
		nonrepudiationOfReceiptESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_RECEIPT, oldNonrepudiationOfReceipt, nonrepudiationOfReceipt, !oldNonrepudiationOfReceiptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNonrepudiationOfReceipt() {
		boolean oldNonrepudiationOfReceipt = nonrepudiationOfReceipt;
		boolean oldNonrepudiationOfReceiptESet = nonrepudiationOfReceiptESet;
		nonrepudiationOfReceipt = NONREPUDIATION_OF_RECEIPT_EDEFAULT;
		nonrepudiationOfReceiptESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_RECEIPT, oldNonrepudiationOfReceipt, NONREPUDIATION_OF_RECEIPT_EDEFAULT, oldNonrepudiationOfReceiptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNonrepudiationOfReceipt() {
		return nonrepudiationOfReceiptESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSecureTransport() {
		return secureTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecureTransport(boolean newSecureTransport) {
		boolean oldSecureTransport = secureTransport;
		secureTransport = newSecureTransport;
		boolean oldSecureTransportESet = secureTransportESet;
		secureTransportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CHARACTERISTICS_TYPE__SECURE_TRANSPORT, oldSecureTransport, secureTransport, !oldSecureTransportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecureTransport() {
		boolean oldSecureTransport = secureTransport;
		boolean oldSecureTransportESet = secureTransportESet;
		secureTransport = SECURE_TRANSPORT_EDEFAULT;
		secureTransportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.CHARACTERISTICS_TYPE__SECURE_TRANSPORT, oldSecureTransport, SECURE_TRANSPORT_EDEFAULT, oldSecureTransportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecureTransport() {
		return secureTransportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncReplyModeType getSyncReplyMode() {
		return syncReplyMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncReplyMode(SyncReplyModeType newSyncReplyMode) {
		SyncReplyModeType oldSyncReplyMode = syncReplyMode;
		syncReplyMode = newSyncReplyMode == null ? SYNC_REPLY_MODE_EDEFAULT : newSyncReplyMode;
		boolean oldSyncReplyModeESet = syncReplyModeESet;
		syncReplyModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CHARACTERISTICS_TYPE__SYNC_REPLY_MODE, oldSyncReplyMode, syncReplyMode, !oldSyncReplyModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSyncReplyMode() {
		SyncReplyModeType oldSyncReplyMode = syncReplyMode;
		boolean oldSyncReplyModeESet = syncReplyModeESet;
		syncReplyMode = SYNC_REPLY_MODE_EDEFAULT;
		syncReplyModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.CHARACTERISTICS_TYPE__SYNC_REPLY_MODE, oldSyncReplyMode, SYNC_REPLY_MODE_EDEFAULT, oldSyncReplyModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSyncReplyMode() {
		return syncReplyModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartnerPackage.CHARACTERISTICS_TYPE__AUTHENTICATED:
				return isAuthenticated();
			case PartnerPackage.CHARACTERISTICS_TYPE__AUTHORIZED:
				return isAuthorized();
			case PartnerPackage.CHARACTERISTICS_TYPE__CONFIDENTIALITY:
				return isConfidentiality();
			case PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_ORIGIN:
				return isNonrepudiationOfOrigin();
			case PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_RECEIPT:
				return isNonrepudiationOfReceipt();
			case PartnerPackage.CHARACTERISTICS_TYPE__SECURE_TRANSPORT:
				return isSecureTransport();
			case PartnerPackage.CHARACTERISTICS_TYPE__SYNC_REPLY_MODE:
				return getSyncReplyMode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartnerPackage.CHARACTERISTICS_TYPE__AUTHENTICATED:
				setAuthenticated((Boolean)newValue);
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__AUTHORIZED:
				setAuthorized((Boolean)newValue);
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__CONFIDENTIALITY:
				setConfidentiality((Boolean)newValue);
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_ORIGIN:
				setNonrepudiationOfOrigin((Boolean)newValue);
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_RECEIPT:
				setNonrepudiationOfReceipt((Boolean)newValue);
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__SECURE_TRANSPORT:
				setSecureTransport((Boolean)newValue);
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__SYNC_REPLY_MODE:
				setSyncReplyMode((SyncReplyModeType)newValue);
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
			case PartnerPackage.CHARACTERISTICS_TYPE__AUTHENTICATED:
				unsetAuthenticated();
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__AUTHORIZED:
				unsetAuthorized();
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__CONFIDENTIALITY:
				unsetConfidentiality();
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_ORIGIN:
				unsetNonrepudiationOfOrigin();
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_RECEIPT:
				unsetNonrepudiationOfReceipt();
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__SECURE_TRANSPORT:
				unsetSecureTransport();
				return;
			case PartnerPackage.CHARACTERISTICS_TYPE__SYNC_REPLY_MODE:
				unsetSyncReplyMode();
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
			case PartnerPackage.CHARACTERISTICS_TYPE__AUTHENTICATED:
				return isSetAuthenticated();
			case PartnerPackage.CHARACTERISTICS_TYPE__AUTHORIZED:
				return isSetAuthorized();
			case PartnerPackage.CHARACTERISTICS_TYPE__CONFIDENTIALITY:
				return isSetConfidentiality();
			case PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_ORIGIN:
				return isSetNonrepudiationOfOrigin();
			case PartnerPackage.CHARACTERISTICS_TYPE__NONREPUDIATION_OF_RECEIPT:
				return isSetNonrepudiationOfReceipt();
			case PartnerPackage.CHARACTERISTICS_TYPE__SECURE_TRANSPORT:
				return isSetSecureTransport();
			case PartnerPackage.CHARACTERISTICS_TYPE__SYNC_REPLY_MODE:
				return isSetSyncReplyMode();
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
		result.append(" (authenticated: ");
		if (authenticatedESet) result.append(authenticated); else result.append("<unset>");
		result.append(", authorized: ");
		if (authorizedESet) result.append(authorized); else result.append("<unset>");
		result.append(", confidentiality: ");
		if (confidentialityESet) result.append(confidentiality); else result.append("<unset>");
		result.append(", nonrepudiationOfOrigin: ");
		if (nonrepudiationOfOriginESet) result.append(nonrepudiationOfOrigin); else result.append("<unset>");
		result.append(", nonrepudiationOfReceipt: ");
		if (nonrepudiationOfReceiptESet) result.append(nonrepudiationOfReceipt); else result.append("<unset>");
		result.append(", secureTransport: ");
		if (secureTransportESet) result.append(secureTransport); else result.append("<unset>");
		result.append(", syncReplyMode: ");
		if (syncReplyModeESet) result.append(syncReplyMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CharacteristicsTypeImpl
