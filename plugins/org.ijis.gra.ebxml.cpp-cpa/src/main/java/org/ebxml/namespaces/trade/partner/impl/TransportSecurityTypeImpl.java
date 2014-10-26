/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.CertificateRefType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.ProtocolType;
import org.ebxml.namespaces.trade.partner.TransportSecurityType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Security Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.TransportSecurityTypeImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.TransportSecurityTypeImpl#getCertificateRef <em>Certificate Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportSecurityTypeImpl extends MinimalEObjectImpl.Container implements TransportSecurityType {
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
	protected TransportSecurityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.TRANSPORT_SECURITY_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.TRANSPORT_SECURITY_TYPE__PROTOCOL, oldProtocol, newProtocol);
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
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.TRANSPORT_SECURITY_TYPE__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.TRANSPORT_SECURITY_TYPE__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.TRANSPORT_SECURITY_TYPE__PROTOCOL, newProtocol, newProtocol));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF, oldCertificateRef, newCertificateRef);
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
				msgs = ((InternalEObject)certificateRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF, null, msgs);
			if (newCertificateRef != null)
				msgs = ((InternalEObject)newCertificateRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF, null, msgs);
			msgs = basicSetCertificateRef(newCertificateRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF, newCertificateRef, newCertificateRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.TRANSPORT_SECURITY_TYPE__PROTOCOL:
				return basicSetProtocol(null, msgs);
			case PartnerPackage.TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF:
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
			case PartnerPackage.TRANSPORT_SECURITY_TYPE__PROTOCOL:
				return getProtocol();
			case PartnerPackage.TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF:
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
			case PartnerPackage.TRANSPORT_SECURITY_TYPE__PROTOCOL:
				setProtocol((ProtocolType)newValue);
				return;
			case PartnerPackage.TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF:
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
			case PartnerPackage.TRANSPORT_SECURITY_TYPE__PROTOCOL:
				setProtocol((ProtocolType)null);
				return;
			case PartnerPackage.TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF:
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
			case PartnerPackage.TRANSPORT_SECURITY_TYPE__PROTOCOL:
				return protocol != null;
			case PartnerPackage.TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF:
				return certificateRef != null;
		}
		return super.eIsSet(featureID);
	}

} //TransportSecurityTypeImpl
