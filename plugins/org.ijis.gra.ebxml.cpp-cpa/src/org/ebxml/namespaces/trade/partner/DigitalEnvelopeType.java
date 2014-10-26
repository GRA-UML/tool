/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getCertificateRef <em>Certificate Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDigitalEnvelopeType()
 * @model extendedMetaData="name='DigitalEnvelope_._type' kind='elementOnly'"
 * @generated
 */
public interface DigitalEnvelopeType extends EObject {
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDigitalEnvelopeType_Protocol()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolType getProtocol();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolType value);

	/**
	 * Returns the value of the '<em><b>Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encryption Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #setEncryptionAlgorithm(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDigitalEnvelopeType_EncryptionAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='EncryptionAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getEncryptionAlgorithm <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 */
	void setEncryptionAlgorithm(String value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDigitalEnvelopeType_CertificateRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CertificateRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CertificateRefType getCertificateRef();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getCertificateRef <em>Certificate Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Ref</em>' containment reference.
	 * @see #getCertificateRef()
	 * @generated
	 */
	void setCertificateRef(CertificateRefType value);

} // DigitalEnvelopeType
