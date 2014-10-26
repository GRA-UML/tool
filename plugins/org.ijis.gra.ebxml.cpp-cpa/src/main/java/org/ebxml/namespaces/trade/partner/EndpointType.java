/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.EndpointType#getType <em>Type</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.EndpointType#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEndpointType()
 * @model extendedMetaData="name='Endpoint_._type' kind='empty'"
 * @generated
 */
public interface EndpointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"allPurpose"</code>.
	 * The literals are from the enumeration {@link org.ebxml.namespaces.trade.partner.EndpointTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.EndpointTypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(EndpointTypeType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEndpointType_Type()
	 * @model default="allPurpose" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	EndpointTypeType getType();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.EndpointType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.EndpointTypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(EndpointTypeType value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.EndpointType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(EndpointTypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.EndpointType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(EndpointTypeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEndpointType_Uri()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='uri'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.EndpointType#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // EndpointType
