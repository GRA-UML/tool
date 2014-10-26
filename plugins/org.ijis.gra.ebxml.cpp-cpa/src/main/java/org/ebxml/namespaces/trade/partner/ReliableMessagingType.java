/**
 */
package org.ebxml.namespaces.trade.partner;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reliable Messaging Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getRetries <em>Retries</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getPersistDuration <em>Persist Duration</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getDeliverySemantics <em>Delivery Semantics</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#isIdempotency <em>Idempotency</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getMessageOrderSemantics <em>Message Order Semantics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getReliableMessagingType()
 * @model extendedMetaData="name='ReliableMessaging_._type' kind='elementOnly'"
 * @generated
 */
public interface ReliableMessagingType extends EObject {
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getReliableMessagingType_Retries()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Retries' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRetries();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getRetries <em>Retries</em>}' attribute.
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getReliableMessagingType_RetryInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='RetryInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRetryInterval();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getRetryInterval <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Interval</em>' attribute.
	 * @see #getRetryInterval()
	 * @generated
	 */
	void setRetryInterval(String value);

	/**
	 * Returns the value of the '<em><b>Persist Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persist Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persist Duration</em>' attribute.
	 * @see #setPersistDuration(Duration)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getReliableMessagingType_PersistDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='PersistDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getPersistDuration();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getPersistDuration <em>Persist Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persist Duration</em>' attribute.
	 * @see #getPersistDuration()
	 * @generated
	 */
	void setPersistDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Delivery Semantics</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ebxml.namespaces.trade.partner.DsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery Semantics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Semantics</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.DsType
	 * @see #isSetDeliverySemantics()
	 * @see #unsetDeliverySemantics()
	 * @see #setDeliverySemantics(DsType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getReliableMessagingType_DeliverySemantics()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='deliverySemantics'"
	 * @generated
	 */
	DsType getDeliverySemantics();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getDeliverySemantics <em>Delivery Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Semantics</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.DsType
	 * @see #isSetDeliverySemantics()
	 * @see #unsetDeliverySemantics()
	 * @see #getDeliverySemantics()
	 * @generated
	 */
	void setDeliverySemantics(DsType value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getDeliverySemantics <em>Delivery Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeliverySemantics()
	 * @see #getDeliverySemantics()
	 * @see #setDeliverySemantics(DsType)
	 * @generated
	 */
	void unsetDeliverySemantics();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getDeliverySemantics <em>Delivery Semantics</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delivery Semantics</em>' attribute is set.
	 * @see #unsetDeliverySemantics()
	 * @see #getDeliverySemantics()
	 * @see #setDeliverySemantics(DsType)
	 * @generated
	 */
	boolean isSetDeliverySemantics();

	/**
	 * Returns the value of the '<em><b>Idempotency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idempotency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idempotency</em>' attribute.
	 * @see #isSetIdempotency()
	 * @see #unsetIdempotency()
	 * @see #setIdempotency(boolean)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getReliableMessagingType_Idempotency()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='idempotency'"
	 * @generated
	 */
	boolean isIdempotency();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#isIdempotency <em>Idempotency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idempotency</em>' attribute.
	 * @see #isSetIdempotency()
	 * @see #unsetIdempotency()
	 * @see #isIdempotency()
	 * @generated
	 */
	void setIdempotency(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#isIdempotency <em>Idempotency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdempotency()
	 * @see #isIdempotency()
	 * @see #setIdempotency(boolean)
	 * @generated
	 */
	void unsetIdempotency();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#isIdempotency <em>Idempotency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Idempotency</em>' attribute is set.
	 * @see #unsetIdempotency()
	 * @see #isIdempotency()
	 * @see #setIdempotency(boolean)
	 * @generated
	 */
	boolean isSetIdempotency();

	/**
	 * Returns the value of the '<em><b>Message Order Semantics</b></em>' attribute.
	 * The default value is <code>"NotGuaranteed"</code>.
	 * The literals are from the enumeration {@link org.ebxml.namespaces.trade.partner.MosType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Order Semantics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Order Semantics</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.MosType
	 * @see #isSetMessageOrderSemantics()
	 * @see #unsetMessageOrderSemantics()
	 * @see #setMessageOrderSemantics(MosType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getReliableMessagingType_MessageOrderSemantics()
	 * @model default="NotGuaranteed" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='messageOrderSemantics'"
	 * @generated
	 */
	MosType getMessageOrderSemantics();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getMessageOrderSemantics <em>Message Order Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Order Semantics</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.MosType
	 * @see #isSetMessageOrderSemantics()
	 * @see #unsetMessageOrderSemantics()
	 * @see #getMessageOrderSemantics()
	 * @generated
	 */
	void setMessageOrderSemantics(MosType value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getMessageOrderSemantics <em>Message Order Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageOrderSemantics()
	 * @see #getMessageOrderSemantics()
	 * @see #setMessageOrderSemantics(MosType)
	 * @generated
	 */
	void unsetMessageOrderSemantics();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getMessageOrderSemantics <em>Message Order Semantics</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Order Semantics</em>' attribute is set.
	 * @see #unsetMessageOrderSemantics()
	 * @see #getMessageOrderSemantics()
	 * @see #setMessageOrderSemantics(MosType)
	 * @generated
	 */
	boolean isSetMessageOrderSemantics();

} // ReliableMessagingType
