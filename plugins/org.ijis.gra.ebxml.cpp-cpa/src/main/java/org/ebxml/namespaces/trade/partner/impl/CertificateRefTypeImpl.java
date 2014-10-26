/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.CertificateRefType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CertificateRefTypeImpl#getCertId <em>Cert Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CertificateRefTypeImpl extends MinimalEObjectImpl.Container implements CertificateRefType {
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
	protected CertificateRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.CERTIFICATE_REF_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CERTIFICATE_REF_TYPE__CERT_ID, oldCertId, certId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartnerPackage.CERTIFICATE_REF_TYPE__CERT_ID:
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
			case PartnerPackage.CERTIFICATE_REF_TYPE__CERT_ID:
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
			case PartnerPackage.CERTIFICATE_REF_TYPE__CERT_ID:
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
			case PartnerPackage.CERTIFICATE_REF_TYPE__CERT_ID:
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

} //CertificateRefTypeImpl
