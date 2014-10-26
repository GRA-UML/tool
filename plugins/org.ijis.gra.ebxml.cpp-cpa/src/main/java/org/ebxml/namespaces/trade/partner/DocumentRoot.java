/**
 */
package org.ebxml.namespaces.trade.partner;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCertificateRef <em>Certificate Ref</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationProtocolAgreement <em>Collaboration Protocol Agreement</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationProtocolProfile <em>Collaboration Protocol Profile</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationRole <em>Collaboration Role</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getComment <em>Comment</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getConstituent <em>Constituent</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getConversationConstraints <em>Conversation Constraints</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getDeliveryChannel <em>Delivery Channel</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getDigitalEnvelope <em>Digital Envelope</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getDocExchange <em>Doc Exchange</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEbXMLBinding <em>Eb XML Binding</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEnd <em>End</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getHashFunction <em>Hash Function</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getNamespaceSupported <em>Namespace Supported</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getNonRepudiation <em>Non Repudiation</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getOverride <em>Override</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyInfo <em>Party Info</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyRef <em>Party Ref</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getProcessSpecification <em>Process Specification</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getReceivingProtocol <em>Receiving Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getReliableMessaging <em>Reliable Messaging</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getRetries <em>Retries</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getRole <em>Role</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getSendingProtocol <em>Sending Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getService <em>Service</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getServiceBinding <em>Service Binding</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getStart <em>Start</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getStatus <em>Status</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getTransport <em>Transport</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getTransportSecurity <em>Transport Security</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getType <em>Type</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getId <em>Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getSyncReplyMode <em>Sync Reply Mode</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate</em>' containment reference.
	 * @see #setCertificate(CertificateType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Certificate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Certificate' namespace='##targetNamespace'"
	 * @generated
	 */
	CertificateType getCertificate();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCertificate <em>Certificate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate</em>' containment reference.
	 * @see #getCertificate()
	 * @generated
	 */
	void setCertificate(CertificateType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_CertificateRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CertificateRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CertificateRefType getCertificateRef();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCertificateRef <em>Certificate Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Ref</em>' containment reference.
	 * @see #getCertificateRef()
	 * @generated
	 */
	void setCertificateRef(CertificateRefType value);

	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' containment reference.
	 * @see #setCharacteristics(CharacteristicsType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Characteristics()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Characteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacteristicsType getCharacteristics();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCharacteristics <em>Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristics</em>' containment reference.
	 * @see #getCharacteristics()
	 * @generated
	 */
	void setCharacteristics(CharacteristicsType value);

	/**
	 * Returns the value of the '<em><b>Collaboration Protocol Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Protocol Agreement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Protocol Agreement</em>' containment reference.
	 * @see #setCollaborationProtocolAgreement(CollaborationProtocolAgreementType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_CollaborationProtocolAgreement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CollaborationProtocolAgreement' namespace='##targetNamespace'"
	 * @generated
	 */
	CollaborationProtocolAgreementType getCollaborationProtocolAgreement();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationProtocolAgreement <em>Collaboration Protocol Agreement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaboration Protocol Agreement</em>' containment reference.
	 * @see #getCollaborationProtocolAgreement()
	 * @generated
	 */
	void setCollaborationProtocolAgreement(CollaborationProtocolAgreementType value);

	/**
	 * Returns the value of the '<em><b>Collaboration Protocol Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Protocol Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Protocol Profile</em>' containment reference.
	 * @see #setCollaborationProtocolProfile(CollaborationProtocolProfileType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_CollaborationProtocolProfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CollaborationProtocolProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	CollaborationProtocolProfileType getCollaborationProtocolProfile();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationProtocolProfile <em>Collaboration Protocol Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaboration Protocol Profile</em>' containment reference.
	 * @see #getCollaborationProtocolProfile()
	 * @generated
	 */
	void setCollaborationProtocolProfile(CollaborationProtocolProfileType value);

	/**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' containment reference.
	 * @see #setCollaborationRole(CollaborationRoleType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_CollaborationRole()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CollaborationRole' namespace='##targetNamespace'"
	 * @generated
	 */
	CollaborationRoleType getCollaborationRole();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationRole <em>Collaboration Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaboration Role</em>' containment reference.
	 * @see #getCollaborationRole()
	 * @generated
	 */
	void setCollaborationRole(CollaborationRoleType value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(CommentType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Comment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	CommentType getComment();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(CommentType value);

	/**
	 * Returns the value of the '<em><b>Constituent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constituent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constituent</em>' containment reference.
	 * @see #setConstituent(ConstituentType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Constituent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Constituent' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstituentType getConstituent();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getConstituent <em>Constituent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constituent</em>' containment reference.
	 * @see #getConstituent()
	 * @generated
	 */
	void setConstituent(ConstituentType value);

	/**
	 * Returns the value of the '<em><b>Conversation Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversation Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Constraints</em>' containment reference.
	 * @see #setConversationConstraints(ConversationConstraintsType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_ConversationConstraints()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConversationConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ConversationConstraintsType getConversationConstraints();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getConversationConstraints <em>Conversation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversation Constraints</em>' containment reference.
	 * @see #getConversationConstraints()
	 * @generated
	 */
	void setConversationConstraints(ConversationConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Delivery Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Channel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Channel</em>' containment reference.
	 * @see #setDeliveryChannel(DeliveryChannelType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_DeliveryChannel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeliveryChannel' namespace='##targetNamespace'"
	 * @generated
	 */
	DeliveryChannelType getDeliveryChannel();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getDeliveryChannel <em>Delivery Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Channel</em>' containment reference.
	 * @see #getDeliveryChannel()
	 * @generated
	 */
	void setDeliveryChannel(DeliveryChannelType value);

	/**
	 * Returns the value of the '<em><b>Digital Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digital Envelope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digital Envelope</em>' containment reference.
	 * @see #setDigitalEnvelope(DigitalEnvelopeType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_DigitalEnvelope()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DigitalEnvelope' namespace='##targetNamespace'"
	 * @generated
	 */
	DigitalEnvelopeType getDigitalEnvelope();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getDigitalEnvelope <em>Digital Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digital Envelope</em>' containment reference.
	 * @see #getDigitalEnvelope()
	 * @generated
	 */
	void setDigitalEnvelope(DigitalEnvelopeType value);

	/**
	 * Returns the value of the '<em><b>Doc Exchange</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc Exchange</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Exchange</em>' containment reference.
	 * @see #setDocExchange(DocExchangeType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_DocExchange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocExchange' namespace='##targetNamespace'"
	 * @generated
	 */
	DocExchangeType getDocExchange();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getDocExchange <em>Doc Exchange</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Exchange</em>' containment reference.
	 * @see #getDocExchange()
	 * @generated
	 */
	void setDocExchange(DocExchangeType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_EbXMLBinding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ebXMLBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EbXMLBindingType getEbXMLBinding();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEbXMLBinding <em>Eb XML Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eb XML Binding</em>' containment reference.
	 * @see #getEbXMLBinding()
	 * @generated
	 */
	void setEbXMLBinding(EbXMLBindingType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_EncryptionAlgorithm()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EncryptionAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEncryptionAlgorithm <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Algorithm</em>' attribute.
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 */
	void setEncryptionAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(XMLGregorianCalendar)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_End()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='End' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEnd();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(EndpointType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Endpoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EndpointType getEndpoint();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(EndpointType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_HashFunction()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HashFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHashFunction();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getHashFunction <em>Hash Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Function</em>' attribute.
	 * @see #getHashFunction()
	 * @generated
	 */
	void setHashFunction(String value);

	/**
	 * Returns the value of the '<em><b>Namespace Supported</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Supported</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Supported</em>' containment reference.
	 * @see #setNamespaceSupported(NamespaceSupportedType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_NamespaceSupported()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NamespaceSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	NamespaceSupportedType getNamespaceSupported();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getNamespaceSupported <em>Namespace Supported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Supported</em>' containment reference.
	 * @see #getNamespaceSupported()
	 * @generated
	 */
	void setNamespaceSupported(NamespaceSupportedType value);

	/**
	 * Returns the value of the '<em><b>Non Repudiation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Repudiation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Repudiation</em>' containment reference.
	 * @see #setNonRepudiation(NonRepudiationType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_NonRepudiation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NonRepudiation' namespace='##targetNamespace'"
	 * @generated
	 */
	NonRepudiationType getNonRepudiation();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getNonRepudiation <em>Non Repudiation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Repudiation</em>' containment reference.
	 * @see #getNonRepudiation()
	 * @generated
	 */
	void setNonRepudiation(NonRepudiationType value);

	/**
	 * Returns the value of the '<em><b>Override</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override</em>' containment reference.
	 * @see #setOverride(OverrideType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Override()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Override' namespace='##targetNamespace'"
	 * @generated
	 */
	OverrideType getOverride();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getOverride <em>Override</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' containment reference.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(OverrideType value);

	/**
	 * Returns the value of the '<em><b>Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaging</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaging</em>' containment reference.
	 * @see #setPackaging(PackagingType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Packaging()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Packaging' namespace='##targetNamespace'"
	 * @generated
	 */
	PackagingType getPackaging();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPackaging <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging</em>' containment reference.
	 * @see #getPackaging()
	 * @generated
	 */
	void setPackaging(PackagingType value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' containment reference.
	 * @see #setPartyId(PartyIdType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_PartyId()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PartyId' namespace='##targetNamespace'"
	 * @generated
	 */
	PartyIdType getPartyId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyId <em>Party Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' containment reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(PartyIdType value);

	/**
	 * Returns the value of the '<em><b>Party Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Info</em>' containment reference.
	 * @see #setPartyInfo(PartyInfoType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_PartyInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PartyInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	PartyInfoType getPartyInfo();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyInfo <em>Party Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Info</em>' containment reference.
	 * @see #getPartyInfo()
	 * @generated
	 */
	void setPartyInfo(PartyInfoType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_PartyRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PartyRef' namespace='##targetNamespace'"
	 * @generated
	 */
	PartyRefType getPartyRef();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyRef <em>Party Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Ref</em>' containment reference.
	 * @see #getPartyRef()
	 * @generated
	 */
	void setPartyRef(PartyRefType value);

	/**
	 * Returns the value of the '<em><b>Process Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Specification</em>' containment reference.
	 * @see #setProcessSpecification(ProcessSpecificationType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_ProcessSpecification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProcessSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessSpecificationType getProcessSpecification();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getProcessSpecification <em>Process Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Specification</em>' containment reference.
	 * @see #getProcessSpecification()
	 * @generated
	 */
	void setProcessSpecification(ProcessSpecificationType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Protocol()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolType getProtocol();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_ReceivingProtocol()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReceivingProtocol' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolType getReceivingProtocol();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getReceivingProtocol <em>Receiving Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving Protocol</em>' containment reference.
	 * @see #getReceivingProtocol()
	 * @generated
	 */
	void setReceivingProtocol(ProtocolType value);

	/**
	 * Returns the value of the '<em><b>Reliable Messaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliable Messaging</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliable Messaging</em>' containment reference.
	 * @see #setReliableMessaging(ReliableMessagingType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_ReliableMessaging()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReliableMessaging' namespace='##targetNamespace'"
	 * @generated
	 */
	ReliableMessagingType getReliableMessaging();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getReliableMessaging <em>Reliable Messaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliable Messaging</em>' containment reference.
	 * @see #getReliableMessaging()
	 * @generated
	 */
	void setReliableMessaging(ReliableMessagingType value);

	/**
	 * Returns the value of the '<em><b>Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retries</em>' attribute.
	 * @see #setRetries(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Retries()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Retries' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRetries();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getRetries <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retries</em>' attribute.
	 * @see #getRetries()
	 * @generated
	 */
	void setRetries(String value);

	/**
	 * Returns the value of the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Interval</em>' attribute.
	 * @see #setRetryInterval(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_RetryInterval()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RetryInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRetryInterval();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getRetryInterval <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Interval</em>' attribute.
	 * @see #getRetryInterval()
	 * @generated
	 */
	void setRetryInterval(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(RoleType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Role()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleType getRole();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleType value);

	/**
	 * Returns the value of the '<em><b>Sending Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending Protocol</em>' containment reference.
	 * @see #setSendingProtocol(ProtocolType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_SendingProtocol()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SendingProtocol' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolType getSendingProtocol();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getSendingProtocol <em>Sending Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending Protocol</em>' containment reference.
	 * @see #getSendingProtocol()
	 * @generated
	 */
	void setSendingProtocol(ProtocolType value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(ServiceType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Service()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Service' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceType getService();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Service Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding</em>' containment reference.
	 * @see #setServiceBinding(ServiceBindingType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_ServiceBinding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceBindingType getServiceBinding();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getServiceBinding <em>Service Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Binding</em>' containment reference.
	 * @see #getServiceBinding()
	 * @generated
	 */
	void setServiceBinding(ServiceBindingType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_SignatureAlgorithm()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSignatureAlgorithm();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getSignatureAlgorithm <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #getSignatureAlgorithm()
	 * @generated
	 */
	void setSignatureAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(XMLGregorianCalendar)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Start()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Start' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStart();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(StatusType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Status()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Status' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Returns the value of the '<em><b>Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport</em>' containment reference.
	 * @see #setTransport(TransportType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Transport()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Transport' namespace='##targetNamespace'"
	 * @generated
	 */
	TransportType getTransport();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getTransport <em>Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport</em>' containment reference.
	 * @see #getTransport()
	 * @generated
	 */
	void setTransport(TransportType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_TransportSecurity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransportSecurity' namespace='##targetNamespace'"
	 * @generated
	 */
	TransportSecurityType getTransportSecurity();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getTransportSecurity <em>Transport Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Security</em>' containment reference.
	 * @see #getTransportSecurity()
	 * @generated
	 */
	void setTransportSecurity(TransportSecurityType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Type()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idref</em>' attribute.
	 * @see #setIdref(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Idref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='idref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIdref();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getIdref <em>Idref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idref</em>' attribute.
	 * @see #getIdref()
	 * @generated
	 */
	void setIdref(String value);

	/**
	 * Returns the value of the '<em><b>Sync Reply Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ebxml.namespaces.trade.partner.SyncReplyModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Reply Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Reply Mode</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.SyncReplyModeType
	 * @see #isSetSyncReplyMode()
	 * @see #unsetSyncReplyMode()
	 * @see #setSyncReplyMode(SyncReplyModeType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_SyncReplyMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='syncReplyMode' namespace='##targetNamespace'"
	 * @generated
	 */
	SyncReplyModeType getSyncReplyMode();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getSyncReplyMode <em>Sync Reply Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Reply Mode</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.SyncReplyModeType
	 * @see #isSetSyncReplyMode()
	 * @see #unsetSyncReplyMode()
	 * @see #getSyncReplyMode()
	 * @generated
	 */
	void setSyncReplyMode(SyncReplyModeType value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getSyncReplyMode <em>Sync Reply Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSyncReplyMode()
	 * @see #getSyncReplyMode()
	 * @see #setSyncReplyMode(SyncReplyModeType)
	 * @generated
	 */
	void unsetSyncReplyMode();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getSyncReplyMode <em>Sync Reply Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sync Reply Mode</em>' attribute is set.
	 * @see #unsetSyncReplyMode()
	 * @see #getSyncReplyMode()
	 * @see #setSyncReplyMode(SyncReplyModeType)
	 * @generated
	 */
	boolean isSetSyncReplyMode();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDocumentRoot_Version()
	 * @model dataType="org.ebxml.namespaces.trade.partner.NonEmptyString"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // DocumentRoot
