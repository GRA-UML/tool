/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Repudiation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getHashFunction <em>Hash Function</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getCertificateRef <em>Certificate Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getNonRepudiationType()
 * @model extendedMetaData="name='NonRepudiation_._type' kind='elementOnly'"
 * @generated
 */
public interface NonRepudiationType extends EObject {
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getNonRepudiationType_Protocol()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolType getProtocol();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolType value);

	/**
	 * Returns the value of the '<em><b>Hash Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash Function</em>' attribute.
	 * @see #setHashFunction(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getNonRepudiationType_HashFunction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='HashFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHashFunction();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getHashFunction <em>Hash Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Function</em>' attribute.
	 * @see #getHashFunction()
	 * @generated
	 */
	void setHashFunction(String value);

	/**
	 * Returns the value of the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #setSignatureAlgorithm(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getNonRepudiationType_SignatureAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='SignatureAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSignatureAlgorithm();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getSignatureAlgorithm <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #getSignatureAlgorithm()
	 * @generated
	 */
	void setSignatureAlgorithm(String value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getNonRepudiationType_CertificateRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CertificateRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CertificateRefType getCertificateRef();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getCertificateRef <em>Certificate Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Ref</em>' containment reference.
	 * @see #getCertificateRef()
	 * @generated
	 */
	void setCertificateRef(CertificateRefType value);

} // NonRepudiationType
