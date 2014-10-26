/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3._2000._09.xmldsig.SignatureType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Protocol Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getPartyInfo <em>Party Info</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolProfileType()
 * @model extendedMetaData="name='CollaborationProtocolProfile_._type' kind='elementOnly'"
 * @generated
 */
public interface CollaborationProtocolProfileType extends EObject {
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolProfileType_PartyInfo()
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolProfileType_Packaging()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Packaging' namespace='##targetNamespace'"
	 * @generated
	 */
	PackagingType getPackaging();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getPackaging <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging</em>' containment reference.
	 * @see #getPackaging()
	 * @generated
	 */
	void setPackaging(PackagingType value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(SignatureType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolProfileType_Signature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signature' namespace='http://www.w3.org/2000/09/xmldsig#'"
	 * @generated
	 */
	SignatureType getSignature();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(SignatureType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolProfileType_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommentType> getComment();

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolProfileType_Version()
	 * @model dataType="org.ebxml.namespaces.trade.partner.NonEmptyString"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getVersion <em>Version</em>}' attribute.
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationProtocolProfileType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##targetNamespace http://www.w3.org/2000/10/XMLSchema-instance' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // CollaborationProtocolProfileType
