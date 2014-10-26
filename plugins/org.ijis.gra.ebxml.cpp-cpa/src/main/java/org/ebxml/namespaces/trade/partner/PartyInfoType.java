/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getPartyRef <em>Party Ref</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getCollaborationRole <em>Collaboration Role</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getDeliveryChannel <em>Delivery Channel</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getTransport <em>Transport</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getDocExchange <em>Doc Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPartyInfoType()
 * @model extendedMetaData="name='PartyInfo_._type' kind='elementOnly'"
 * @generated
 */
public interface PartyInfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.PartyIdType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPartyInfoType_PartyId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PartyId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PartyIdType> getPartyId();

	/**
	 * Returns the value of the '<em><b>Party Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Ref</em>' containment reference.
	 * @see #setPartyRef(PartyRefType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPartyInfoType_PartyRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PartyRef' namespace='##targetNamespace'"
	 * @generated
	 */
	PartyRefType getPartyRef();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getPartyRef <em>Party Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Ref</em>' containment reference.
	 * @see #getPartyRef()
	 * @generated
	 */
	void setPartyRef(PartyRefType value);

	/**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.CollaborationRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPartyInfoType_CollaborationRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CollaborationRole' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CollaborationRoleType> getCollaborationRole();

	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.CertificateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPartyInfoType_Certificate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Certificate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CertificateType> getCertificate();

	/**
	 * Returns the value of the '<em><b>Delivery Channel</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.DeliveryChannelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Channel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Channel</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPartyInfoType_DeliveryChannel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeliveryChannel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeliveryChannelType> getDeliveryChannel();

	/**
	 * Returns the value of the '<em><b>Transport</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.TransportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPartyInfoType_Transport()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Transport' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransportType> getTransport();

	/**
	 * Returns the value of the '<em><b>Doc Exchange</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.DocExchangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc Exchange</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Exchange</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPartyInfoType_DocExchange()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocExchange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocExchangeType> getDocExchange();

} // PartyInfoType
