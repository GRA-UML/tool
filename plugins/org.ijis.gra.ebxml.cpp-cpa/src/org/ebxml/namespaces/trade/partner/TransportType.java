/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.TransportType#getSendingProtocol <em>Sending Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.TransportType#getReceivingProtocol <em>Receiving Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.TransportType#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.TransportType#getTransportSecurity <em>Transport Security</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.TransportType#getTransportId <em>Transport Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getTransportType()
 * @model extendedMetaData="name='Transport_._type' kind='elementOnly'"
 * @generated
 */
public interface TransportType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sending Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.ProtocolType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending Protocol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending Protocol</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getTransportType_SendingProtocol()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SendingProtocol' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProtocolType> getSendingProtocol();

	/**
	 * Returns the value of the '<em><b>Receiving Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Protocol</em>' containment reference.
	 * @see #setReceivingProtocol(ProtocolType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getTransportType_ReceivingProtocol()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReceivingProtocol' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolType getReceivingProtocol();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.TransportType#getReceivingProtocol <em>Receiving Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving Protocol</em>' containment reference.
	 * @see #getReceivingProtocol()
	 * @generated
	 */
	void setReceivingProtocol(ProtocolType value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.EndpointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getTransportType_Endpoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EndpointType> getEndpoint();

	/**
	 * Returns the value of the '<em><b>Transport Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Security</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Security</em>' containment reference.
	 * @see #setTransportSecurity(TransportSecurityType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getTransportType_TransportSecurity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TransportSecurity' namespace='##targetNamespace'"
	 * @generated
	 */
	TransportSecurityType getTransportSecurity();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.TransportType#getTransportSecurity <em>Transport Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Security</em>' containment reference.
	 * @see #getTransportSecurity()
	 * @generated
	 */
	void setTransportSecurity(TransportSecurityType value);

	/**
	 * Returns the value of the '<em><b>Transport Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Id</em>' attribute.
	 * @see #setTransportId(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getTransportType_TransportId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='transportId'"
	 * @generated
	 */
	String getTransportId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.TransportType#getTransportId <em>Transport Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Id</em>' attribute.
	 * @see #getTransportId()
	 * @generated
	 */
	void setTransportId(String value);

} // TransportType
