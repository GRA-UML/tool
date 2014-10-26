/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Exchange Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocExchangeType#getEbXMLBinding <em>Eb XML Binding</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocExchangeType#getDocExchangeId <em>Doc Exchange Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocExchangeType()
 * @model extendedMetaData="name='DocExchange_._type' kind='elementOnly'"
 * @generated
 */
public interface DocExchangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Eb XML Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eb XML Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eb XML Binding</em>' containment reference.
	 * @see #setEbXMLBinding(EbXMLBindingType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocExchangeType_EbXMLBinding()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ebXMLBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EbXMLBindingType getEbXMLBinding();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocExchangeType#getEbXMLBinding <em>Eb XML Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eb XML Binding</em>' containment reference.
	 * @see #getEbXMLBinding()
	 * @generated
	 */
	void setEbXMLBinding(EbXMLBindingType value);

	/**
	 * Returns the value of the '<em><b>Doc Exchange Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc Exchange Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Exchange Id</em>' attribute.
	 * @see #setDocExchangeId(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocExchangeType_DocExchangeId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='docExchangeId'"
	 * @generated
	 */
	String getDocExchangeId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocExchangeType#getDocExchangeId <em>Doc Exchange Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Exchange Id</em>' attribute.
	 * @see #getDocExchangeId()
	 * @generated
	 */
	void setDocExchangeId(String value);

} // DocExchangeType
