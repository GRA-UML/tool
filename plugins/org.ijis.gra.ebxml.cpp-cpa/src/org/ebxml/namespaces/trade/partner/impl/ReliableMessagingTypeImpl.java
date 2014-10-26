/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import javax.xml.datatype.Duration;

import org.ebxml.namespaces.trade.partner.DsType;
import org.ebxml.namespaces.trade.partner.MosType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.ReliableMessagingType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reliable Messaging Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ReliableMessagingTypeImpl#getRetries <em>Retries</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ReliableMessagingTypeImpl#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ReliableMessagingTypeImpl#getPersistDuration <em>Persist Duration</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ReliableMessagingTypeImpl#getDeliverySemantics <em>Delivery Semantics</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ReliableMessagingTypeImpl#isIdempotency <em>Idempotency</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ReliableMessagingTypeImpl#getMessageOrderSemantics <em>Message Order Semantics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReliableMessagingTypeImpl extends MinimalEObjectImpl.Container implements ReliableMessagingType {
	/**
	 * The default value of the '{@link #getRetries() <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries()
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetries() <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries()
	 * @generated
	 * @ordered
	 */
	protected String retries = RETRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String RETRY_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected String retryInterval = RETRY_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistDuration() <em>Persist Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration PERSIST_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistDuration() <em>Persist Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration persistDuration = PERSIST_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliverySemantics() <em>Delivery Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverySemantics()
	 * @generated
	 * @ordered
	 */
	protected static final DsType DELIVERY_SEMANTICS_EDEFAULT = DsType.ONCE_AND_ONLY_ONCE;

	/**
	 * The cached value of the '{@link #getDeliverySemantics() <em>Delivery Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverySemantics()
	 * @generated
	 * @ordered
	 */
	protected DsType deliverySemantics = DELIVERY_SEMANTICS_EDEFAULT;

	/**
	 * This is true if the Delivery Semantics attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deliverySemanticsESet;

	/**
	 * The default value of the '{@link #isIdempotency() <em>Idempotency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdempotency()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDEMPOTENCY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIdempotency() <em>Idempotency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdempotency()
	 * @generated
	 * @ordered
	 */
	protected boolean idempotency = IDEMPOTENCY_EDEFAULT;

	/**
	 * This is true if the Idempotency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idempotencyESet;

	/**
	 * The default value of the '{@link #getMessageOrderSemantics() <em>Message Order Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageOrderSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final MosType MESSAGE_ORDER_SEMANTICS_EDEFAULT = MosType.NOT_GUARANTEED;

	/**
	 * The cached value of the '{@link #getMessageOrderSemantics() <em>Message Order Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageOrderSemantics()
	 * @generated
	 * @ordered
	 */
	protected MosType messageOrderSemantics = MESSAGE_ORDER_SEMANTICS_EDEFAULT;

	/**
	 * This is true if the Message Order Semantics attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageOrderSemanticsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliableMessagingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.RELIABLE_MESSAGING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetries() {
		return retries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetries(String newRetries) {
		String oldRetries = retries;
		retries = newRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.RELIABLE_MESSAGING_TYPE__RETRIES, oldRetries, retries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetryInterval() {
		return retryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryInterval(String newRetryInterval) {
		String oldRetryInterval = retryInterval;
		retryInterval = newRetryInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.RELIABLE_MESSAGING_TYPE__RETRY_INTERVAL, oldRetryInterval, retryInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getPersistDuration() {
		return persistDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistDuration(Duration newPersistDuration) {
		Duration oldPersistDuration = persistDuration;
		persistDuration = newPersistDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.RELIABLE_MESSAGING_TYPE__PERSIST_DURATION, oldPersistDuration, persistDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsType getDeliverySemantics() {
		return deliverySemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliverySemantics(DsType newDeliverySemantics) {
		DsType oldDeliverySemantics = deliverySemantics;
		deliverySemantics = newDeliverySemantics == null ? DELIVERY_SEMANTICS_EDEFAULT : newDeliverySemantics;
		boolean oldDeliverySemanticsESet = deliverySemanticsESet;
		deliverySemanticsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.RELIABLE_MESSAGING_TYPE__DELIVERY_SEMANTICS, oldDeliverySemantics, deliverySemantics, !oldDeliverySemanticsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeliverySemantics() {
		DsType oldDeliverySemantics = deliverySemantics;
		boolean oldDeliverySemanticsESet = deliverySemanticsESet;
		deliverySemantics = DELIVERY_SEMANTICS_EDEFAULT;
		deliverySemanticsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.RELIABLE_MESSAGING_TYPE__DELIVERY_SEMANTICS, oldDeliverySemantics, DELIVERY_SEMANTICS_EDEFAULT, oldDeliverySemanticsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeliverySemantics() {
		return deliverySemanticsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIdempotency() {
		return idempotency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdempotency(boolean newIdempotency) {
		boolean oldIdempotency = idempotency;
		idempotency = newIdempotency;
		boolean oldIdempotencyESet = idempotencyESet;
		idempotencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.RELIABLE_MESSAGING_TYPE__IDEMPOTENCY, oldIdempotency, idempotency, !oldIdempotencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIdempotency() {
		boolean oldIdempotency = idempotency;
		boolean oldIdempotencyESet = idempotencyESet;
		idempotency = IDEMPOTENCY_EDEFAULT;
		idempotencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.RELIABLE_MESSAGING_TYPE__IDEMPOTENCY, oldIdempotency, IDEMPOTENCY_EDEFAULT, oldIdempotencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIdempotency() {
		return idempotencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MosType getMessageOrderSemantics() {
		return messageOrderSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageOrderSemantics(MosType newMessageOrderSemantics) {
		MosType oldMessageOrderSemantics = messageOrderSemantics;
		messageOrderSemantics = newMessageOrderSemantics == null ? MESSAGE_ORDER_SEMANTICS_EDEFAULT : newMessageOrderSemantics;
		boolean oldMessageOrderSemanticsESet = messageOrderSemanticsESet;
		messageOrderSemanticsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.RELIABLE_MESSAGING_TYPE__MESSAGE_ORDER_SEMANTICS, oldMessageOrderSemantics, messageOrderSemantics, !oldMessageOrderSemanticsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessageOrderSemantics() {
		MosType oldMessageOrderSemantics = messageOrderSemantics;
		boolean oldMessageOrderSemanticsESet = messageOrderSemanticsESet;
		messageOrderSemantics = MESSAGE_ORDER_SEMANTICS_EDEFAULT;
		messageOrderSemanticsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.RELIABLE_MESSAGING_TYPE__MESSAGE_ORDER_SEMANTICS, oldMessageOrderSemantics, MESSAGE_ORDER_SEMANTICS_EDEFAULT, oldMessageOrderSemanticsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageOrderSemantics() {
		return messageOrderSemanticsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__RETRIES:
				return getRetries();
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__RETRY_INTERVAL:
				return getRetryInterval();
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__PERSIST_DURATION:
				return getPersistDuration();
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__DELIVERY_SEMANTICS:
				return getDeliverySemantics();
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__IDEMPOTENCY:
				return isIdempotency();
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__MESSAGE_ORDER_SEMANTICS:
				return getMessageOrderSemantics();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__RETRIES:
				setRetries((String)newValue);
				return;
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__RETRY_INTERVAL:
				setRetryInterval((String)newValue);
				return;
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__PERSIST_DURATION:
				setPersistDuration((Duration)newValue);
				return;
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__DELIVERY_SEMANTICS:
				setDeliverySemantics((DsType)newValue);
				return;
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__IDEMPOTENCY:
				setIdempotency((Boolean)newValue);
				return;
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__MESSAGE_ORDER_SEMANTICS:
				setMessageOrderSemantics((MosType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__RETRIES:
				setRetries(RETRIES_EDEFAULT);
				return;
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__RETRY_INTERVAL:
				setRetryInterval(RETRY_INTERVAL_EDEFAULT);
				return;
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__PERSIST_DURATION:
				setPersistDuration(PERSIST_DURATION_EDEFAULT);
				return;
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__DELIVERY_SEMANTICS:
				unsetDeliverySemantics();
				return;
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__IDEMPOTENCY:
				unsetIdempotency();
				return;
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__MESSAGE_ORDER_SEMANTICS:
				unsetMessageOrderSemantics();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__RETRIES:
				return RETRIES_EDEFAULT == null ? retries != null : !RETRIES_EDEFAULT.equals(retries);
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__RETRY_INTERVAL:
				return RETRY_INTERVAL_EDEFAULT == null ? retryInterval != null : !RETRY_INTERVAL_EDEFAULT.equals(retryInterval);
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__PERSIST_DURATION:
				return PERSIST_DURATION_EDEFAULT == null ? persistDuration != null : !PERSIST_DURATION_EDEFAULT.equals(persistDuration);
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__DELIVERY_SEMANTICS:
				return isSetDeliverySemantics();
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__IDEMPOTENCY:
				return isSetIdempotency();
			case PartnerPackage.RELIABLE_MESSAGING_TYPE__MESSAGE_ORDER_SEMANTICS:
				return isSetMessageOrderSemantics();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (retries: ");
		result.append(retries);
		result.append(", retryInterval: ");
		result.append(retryInterval);
		result.append(", persistDuration: ");
		result.append(persistDuration);
		result.append(", deliverySemantics: ");
		if (deliverySemanticsESet) result.append(deliverySemantics); else result.append("<unset>");
		result.append(", idempotency: ");
		if (idempotencyESet) result.append(idempotency); else result.append("<unset>");
		result.append(", messageOrderSemantics: ");
		if (messageOrderSemanticsESet) result.append(messageOrderSemantics); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReliableMessagingTypeImpl
