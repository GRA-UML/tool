/**
 */
package org.ebxml.namespaces.trade.partner;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._2000._09.xmldsig.SignatureType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Protocol Agreement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getStatus <em>Status</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getStart <em>Start</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getEnd <em>End</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getConversationConstraints <em>Conversation Constraints</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getPartyInfo <em>Party Info</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getCpaid <em>Cpaid</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType()
 * @model extendedMetaData="name='CollaborationProtocolAgreement_._type' kind='elementOnly'"
 * @generated
 */
public interface CollaborationProtocolAgreementType extends EObject {
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Status' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType_Start()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='Start' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStart();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(XMLGregorianCalendar value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType_End()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='End' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEnd();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(XMLGregorianCalendar value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType_ConversationConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConversationConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ConversationConstraintsType getConversationConstraints();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getConversationConstraints <em>Conversation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversation Constraints</em>' containment reference.
	 * @see #getConversationConstraints()
	 * @generated
	 */
	void setConversationConstraints(ConversationConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Party Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.PartyInfoType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Info</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType_PartyInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PartyInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PartyInfoType> getPartyInfo();

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType_Packaging()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Packaging' namespace='##targetNamespace'"
	 * @generated
	 */
	PackagingType getPackaging();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getPackaging <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging</em>' containment reference.
	 * @see #getPackaging()
	 * @generated
	 */
	void setPackaging(PackagingType value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.SignatureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType_Signature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signature' namespace='http://www.w3.org/2000/09/xmldsig#'"
	 * @generated
	 */
	EList<SignatureType> getSignature();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.CommentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommentType> getComment();

	/**
	 * Returns the value of the '<em><b>Cpaid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpaid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpaid</em>' attribute.
	 * @see #setCpaid(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType_Cpaid()
	 * @model dataType="org.ebxml.namespaces.trade.partner.NonEmptyString"
	 *        extendedMetaData="kind='attribute' name='cpaid'"
	 * @generated
	 */
	String getCpaid();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getCpaid <em>Cpaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpaid</em>' attribute.
	 * @see #getCpaid()
	 * @generated
	 */
	void setCpaid(String value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType_Version()
	 * @model dataType="org.ebxml.namespaces.trade.partner.NonEmptyString"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolAgreementType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##targetNamespace http://www.w3.org/2000/10/XMLSchema-instance' name=':10' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // CollaborationProtocolAgreementType
