/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.CertificateType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3._2000._09.xmldsig.KeyInfoType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CertificateTypeImpl#getKeyInfo <em>Key Info</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CertificateTypeImpl#getCertId <em>Cert Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CertificateTypeImpl extends MinimalEObjectImpl.Container implements CertificateType {
	/**
	 * The cached value of the '{@link #getKeyInfo() <em>Key Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyInfo()
	 * @generated
	 * @ordered
	 */
	protected KeyInfoType keyInfo;

	/**
	 * The default value of the '{@link #getCertId() <em>Cert Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertId()
	 * @generated
	 * @ordered
	 */
	protected static final String CERT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertId() <em>Cert Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertId()
	 * @generated
	 * @ordered
	 */
	protected String certId = CERT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.CERTIFICATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyInfoType getKeyInfo() {
		return keyInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyInfo(KeyInfoType newKeyInfo, NotificationChain msgs) {
		KeyInfoType oldKeyInfo = keyInfo;
		keyInfo = newKeyInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.CERTIFICATE_TYPE__KEY_INFO, oldKeyInfo, newKeyInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyInfo(KeyInfoType newKeyInfo) {
		if (newKeyInfo != keyInfo) {
			NotificationChain msgs = null;
			if (keyInfo != null)
				msgs = ((InternalEObject)keyInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.CERTIFICATE_TYPE__KEY_INFO, null, msgs);
			if (newKeyInfo != null)
				msgs = ((InternalEObject)newKeyInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.CERTIFICATE_TYPE__KEY_INFO, null, msgs);
			msgs = basicSetKeyInfo(newKeyInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CERTIFICATE_TYPE__KEY_INFO, newKeyInfo, newKeyInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertId() {
		return certId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertId(String newCertId) {
		String oldCertId = certId;
		certId = newCertId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CERTIFICATE_TYPE__CERT_ID, oldCertId, certId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.CERTIFICATE_TYPE__KEY_INFO:
				return basicSetKeyInfo(null, msgs);
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
			case PartnerPackage.CERTIFICATE_TYPE__KEY_INFO:
				return getKeyInfo();
			case PartnerPackage.CERTIFICATE_TYPE__CERT_ID:
				return getCertId();
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
			case PartnerPackage.CERTIFICATE_TYPE__KEY_INFO:
				setKeyInfo((KeyInfoType)newValue);
				return;
			case PartnerPackage.CERTIFICATE_TYPE__CERT_ID:
				setCertId((String)newValue);
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
			case PartnerPackage.CERTIFICATE_TYPE__KEY_INFO:
				setKeyInfo((KeyInfoType)null);
				return;
			case PartnerPackage.CERTIFICATE_TYPE__CERT_ID:
				setCertId(CERT_ID_EDEFAULT);
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
			case PartnerPackage.CERTIFICATE_TYPE__KEY_INFO:
				return keyInfo != null;
			case PartnerPackage.CERTIFICATE_TYPE__CERT_ID:
				return CERT_ID_EDEFAULT == null ? certId != null : !CERT_ID_EDEFAULT.equals(certId);
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
		result.append(" (certId: ");
		result.append(certId);
		result.append(')');
		return result.toString();
	}

} //CertificateTypeImpl
