/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

import org.w3._2000._09.xmldsig.KeyInfoType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CertificateType#getKeyInfo <em>Key Info</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CertificateType#getCertId <em>Cert Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCertificateType()
 * @model extendedMetaData="name='Certificate_._type' kind='elementOnly'"
 * @generated
 */
public interface CertificateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Info</em>' containment reference.
	 * @see #setKeyInfo(KeyInfoType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCertificateType_KeyInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='KeyInfo' namespace='http://www.w3.org/2000/09/xmldsig#'"
	 * @generated
	 */
	KeyInfoType getKeyInfo();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CertificateType#getKeyInfo <em>Key Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Info</em>' containment reference.
	 * @see #getKeyInfo()
	 * @generated
	 */
	void setKeyInfo(KeyInfoType value);

	/**
	 * Returns the value of the '<em><b>Cert Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cert Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cert Id</em>' attribute.
	 * @see #setCertId(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCertificateType_CertId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='certId'"
	 * @generated
	 */
	String getCertId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CertificateType#getCertId <em>Cert Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cert Id</em>' attribute.
	 * @see #getCertId()
	 * @generated
	 */
	void setCertId(String value);

} // CertificateType
