/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getChannelId <em>Channel Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getDocExchangeId <em>Doc Exchange Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getTransportId <em>Transport Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDeliveryChannelType()
 * @model extendedMetaData="name='DeliveryChannel_._type' kind='elementOnly'"
 * @generated
 */
public interface DeliveryChannelType extends EObject {
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDeliveryChannelType_Characteristics()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Characteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacteristicsType getCharacteristics();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getCharacteristics <em>Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristics</em>' containment reference.
	 * @see #getCharacteristics()
	 * @generated
	 */
	void setCharacteristics(CharacteristicsType value);

	/**
	 * Returns the value of the '<em><b>Channel Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Id</em>' attribute.
	 * @see #setChannelId(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDeliveryChannelType_ChannelId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='channelId'"
	 * @generated
	 */
	String getChannelId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getChannelId <em>Channel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Id</em>' attribute.
	 * @see #getChannelId()
	 * @generated
	 */
	void setChannelId(String value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDeliveryChannelType_DocExchangeId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='docExchangeId'"
	 * @generated
	 */
	String getDocExchangeId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getDocExchangeId <em>Doc Exchange Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Exchange Id</em>' attribute.
	 * @see #getDocExchangeId()
	 * @generated
	 */
	void setDocExchangeId(String value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getDeliveryChannelType_TransportId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='transportId'"
	 * @generated
	 */
	String getTransportId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getTransportId <em>Transport Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Id</em>' attribute.
	 * @see #getTransportId()
	 * @generated
	 */
	void setTransportId(String value);

} // DeliveryChannelType
