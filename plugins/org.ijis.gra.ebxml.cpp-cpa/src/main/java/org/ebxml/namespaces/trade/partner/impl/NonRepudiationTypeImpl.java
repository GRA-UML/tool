/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.CertificateRefType;
import org.ebxml.namespaces.trade.partner.NonRepudiationType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.ProtocolType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Repudiation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.NonRepudiationTypeImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.NonRepudiationTypeImpl#getHashFunction <em>Hash Function</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.NonRepudiationTypeImpl#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.NonRepudiationTypeImpl#getCertificateRef <em>Certificate Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonRepudiationTypeImpl extends MinimalEObjectImpl.Container implements NonRepudiationType {
	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolType protocol;

	/**
	 * The default value of the '{@link #getHashFunction() <em>Hash Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHashFunction() <em>Hash Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashFunction()
	 * @generated
	 * @ordered
	 */
	protected String hashFunction = HASH_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String signatureAlgorithm = SIGNATURE_ALGORITHM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCertificateRef() <em>Certificate Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateRef()
	 * @generated
	 * @ordered
	 */
	protected CertificateRefType certificateRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonRepudiationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.NON_REPUDIATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(ProtocolType newProtocol, NotificationChain msgs) {
		ProtocolType oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.NON_REPUDIATION_TYPE__PROTOCOL, oldProtocol, newProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolType newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.NON_REPUDIATION_TYPE__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.NON_REPUDIATION_TYPE__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.NON_REPUDIATION_TYPE__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHashFunction() {
		return hashFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashFunction(String newHashFunction) {
		String oldHashFunction = hashFunction;
		hashFunction = newHashFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.NON_REPUDIATION_TYPE__HASH_FUNCTION, oldHashFunction, hashFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureAlgorithm(String newSignatureAlgorithm) {
		String oldSignatureAlgorithm = signatureAlgorithm;
		signatureAlgorithm = newSignatureAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.NON_REPUDIATION_TYPE__SIGNATURE_ALGORITHM, oldSignatureAlgorithm, signatureAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateRefType getCertificateRef() {
		return certificateRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertificateRef(CertificateRefType newCertificateRef, NotificationChain msgs) {
		CertificateRefType oldCertificateRef = certificateRef;
		certificateRef = newCertificateRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.NON_REPUDIATION_TYPE__CERTIFICATE_REF, oldCertificateRef, newCertificateRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateRef(CertificateRefType newCertificateRef) {
		if (newCertificateRef != certificateRef) {
			NotificationChain msgs = null;
			if (certificateRef != null)
				msgs = ((InternalEObject)certificateRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.NON_REPUDIATION_TYPE__CERTIFICATE_REF, null, msgs);
			if (newCertificateRef != null)
				msgs = ((InternalEObject)newCertificateRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.NON_REPUDIATION_TYPE__CERTIFICATE_REF, null, msgs);
			msgs = basicSetCertificateRef(newCertificateRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.NON_REPUDIATION_TYPE__CERTIFICATE_REF, newCertificateRef, newCertificateRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.NON_REPUDIATION_TYPE__PROTOCOL:
				return basicSetProtocol(null, msgs);
			case PartnerPackage.NON_REPUDIATION_TYPE__CERTIFICATE_REF:
				return basicSetCertificateRef(null, msgs);
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
			case PartnerPackage.NON_REPUDIATION_TYPE__PROTOCOL:
				return getProtocol();
			case PartnerPackage.NON_REPUDIATION_TYPE__HASH_FUNCTION:
				return getHashFunction();
			case PartnerPackage.NON_REPUDIATION_TYPE__SIGNATURE_ALGORITHM:
				return getSignatureAlgorithm();
			case PartnerPackage.NON_REPUDIATION_TYPE__CERTIFICATE_REF:
				return getCertificateRef();
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
			case PartnerPackage.NON_REPUDIATION_TYPE__PROTOCOL:
				setProtocol((ProtocolType)newValue);
				return;
			case PartnerPackage.NON_REPUDIATION_TYPE__HASH_FUNCTION:
				setHashFunction((String)newValue);
				return;
			case PartnerPackage.NON_REPUDIATION_TYPE__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm((String)newValue);
				return;
			case PartnerPackage.NON_REPUDIATION_TYPE__CERTIFICATE_REF:
				setCertificateRef((CertificateRefType)newValue);
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
			case PartnerPackage.NON_REPUDIATION_TYPE__PROTOCOL:
				setProtocol((ProtocolType)null);
				return;
			case PartnerPackage.NON_REPUDIATION_TYPE__HASH_FUNCTION:
				setHashFunction(HASH_FUNCTION_EDEFAULT);
				return;
			case PartnerPackage.NON_REPUDIATION_TYPE__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm(SIGNATURE_ALGORITHM_EDEFAULT);
				return;
			case PartnerPackage.NON_REPUDIATION_TYPE__CERTIFICATE_REF:
				setCertificateRef((CertificateRefType)null);
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
			case PartnerPackage.NON_REPUDIATION_TYPE__PROTOCOL:
				return protocol != null;
			case PartnerPackage.NON_REPUDIATION_TYPE__HASH_FUNCTION:
				return HASH_FUNCTION_EDEFAULT == null ? hashFunction != null : !HASH_FUNCTION_EDEFAULT.equals(hashFunction);
			case PartnerPackage.NON_REPUDIATION_TYPE__SIGNATURE_ALGORITHM:
				return SIGNATURE_ALGORITHM_EDEFAULT == null ? signatureAlgorithm != null : !SIGNATURE_ALGORITHM_EDEFAULT.equals(signatureAlgorithm);
			case PartnerPackage.NON_REPUDIATION_TYPE__CERTIFICATE_REF:
				return certificateRef != null;
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
		result.append(" (hashFunction: ");
		result.append(hashFunction);
		result.append(", signatureAlgorithm: ");
		result.append(signatureAlgorithm);
		result.append(')');
		return result.toString();
	}

} //NonRepudiationTypeImpl
