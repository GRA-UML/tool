/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificate Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CertificateRefType#getCertId <em>Cert Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCertificateRefType()
 * @model extendedMetaData="name='CertificateRef_._type' kind='empty'"
 * @generated
 */
public interface CertificateRefType extends EObject {
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCertificateRefType_CertId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='certId'"
	 * @generated
	 */
	String getCertId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CertificateRefType#getCertId <em>Cert Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cert Id</em>' attribute.
	 * @see #getCertId()
	 * @generated
	 */
	void setCertId(String value);

} // CertificateRefType
