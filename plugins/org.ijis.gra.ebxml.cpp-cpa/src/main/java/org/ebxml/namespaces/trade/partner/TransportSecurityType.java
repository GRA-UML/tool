/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Security Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.TransportSecurityType#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.TransportSecurityType#getCertificateRef <em>Certificate Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getTransportSecurityType()
 * @model extendedMetaData="name='TransportSecurity_._type' kind='elementOnly'"
 * @generated
 */
public interface TransportSecurityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(ProtocolType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getTransportSecurityType_Protocol()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolType getProtocol();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.TransportSecurityType#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolType value);

	/**
	 * Returns the value of the '<em><b>Certificate Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Ref</em>' containment reference.
	 * @see #setCertificateRef(CertificateRefType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getTransportSecurityType_CertificateRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CertificateRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CertificateRefType getCertificateRef();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.TransportSecurityType#getCertificateRef <em>Certificate Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Ref</em>' containment reference.
	 * @see #getCertificateRef()
	 * @generated
	 */
	void setCertificateRef(CertificateRefType value);

} // TransportSecurityType
