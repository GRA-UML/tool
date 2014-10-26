/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eb XML Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getReliableMessaging <em>Reliable Messaging</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getNonRepudiation <em>Non Repudiation</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getDigitalEnvelope <em>Digital Envelope</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getNamespaceSupported <em>Namespace Supported</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEbXMLBindingType()
 * @model extendedMetaData="name='ebXMLBinding_._type' kind='elementOnly'"
 * @generated
 */
public interface EbXMLBindingType extends EObject {
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEbXMLBindingType_ReliableMessaging()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReliableMessaging' namespace='##targetNamespace'"
	 * @generated
	 */
	ReliableMessagingType getReliableMessaging();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getReliableMessaging <em>Reliable Messaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliable Messaging</em>' containment reference.
	 * @see #getReliableMessaging()
	 * @generated
	 */
	void setReliableMessaging(ReliableMessagingType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEbXMLBindingType_NonRepudiation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NonRepudiation' namespace='##targetNamespace'"
	 * @generated
	 */
	NonRepudiationType getNonRepudiation();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getNonRepudiation <em>Non Repudiation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Repudiation</em>' containment reference.
	 * @see #getNonRepudiation()
	 * @generated
	 */
	void setNonRepudiation(NonRepudiationType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEbXMLBindingType_DigitalEnvelope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DigitalEnvelope' namespace='##targetNamespace'"
	 * @generated
	 */
	DigitalEnvelopeType getDigitalEnvelope();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getDigitalEnvelope <em>Digital Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digital Envelope</em>' containment reference.
	 * @see #getDigitalEnvelope()
	 * @generated
	 */
	void setDigitalEnvelope(DigitalEnvelopeType value);

	/**
	 * Returns the value of the '<em><b>Namespace Supported</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.NamespaceSupportedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Supported</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Supported</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEbXMLBindingType_NamespaceSupported()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NamespaceSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NamespaceSupportedType> getNamespaceSupported();

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEbXMLBindingType_Version()
	 * @model dataType="org.ebxml.namespaces.trade.partner.NonEmptyString"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // EbXMLBindingType
