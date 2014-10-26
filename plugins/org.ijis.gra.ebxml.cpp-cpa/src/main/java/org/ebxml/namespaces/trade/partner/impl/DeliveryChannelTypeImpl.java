/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.CharacteristicsType;
import org.ebxml.namespaces.trade.partner.DeliveryChannelType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery Channel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DeliveryChannelTypeImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DeliveryChannelTypeImpl#getChannelId <em>Channel Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DeliveryChannelTypeImpl#getDocExchangeId <em>Doc Exchange Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DeliveryChannelTypeImpl#getTransportId <em>Transport Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeliveryChannelTypeImpl extends MinimalEObjectImpl.Container implements DeliveryChannelType {
	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected CharacteristicsType characteristics;

	/**
	 * The default value of the '{@link #getChannelId() <em>Channel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelId() <em>Channel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelId()
	 * @generated
	 * @ordered
	 */
	protected String channelId = CHANNEL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocExchangeId() <em>Doc Exchange Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocExchangeId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_EXCHANGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocExchangeId() <em>Doc Exchange Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocExchangeId()
	 * @generated
	 * @ordered
	 */
	protected String docExchangeId = DOC_EXCHANGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransportId() <em>Transport Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSPORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransportId() <em>Transport Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportId()
	 * @generated
	 * @ordered
	 */
	protected String transportId = TRANSPORT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryChannelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.DELIVERY_CHANNEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsType getCharacteristics() {
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacteristics(CharacteristicsType newCharacteristics, NotificationChain msgs) {
		CharacteristicsType oldCharacteristics = characteristics;
		characteristics = newCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.DELIVERY_CHANNEL_TYPE__CHARACTERISTICS, oldCharacteristics, newCharacteristics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristics(CharacteristicsType newCharacteristics) {
		if (newCharacteristics != characteristics) {
			NotificationChain msgs = null;
			if (characteristics != null)
				msgs = ((InternalEObject)characteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.DELIVERY_CHANNEL_TYPE__CHARACTERISTICS, null, msgs);
			if (newCharacteristics != null)
				msgs = ((InternalEObject)newCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.DELIVERY_CHANNEL_TYPE__CHARACTERISTICS, null, msgs);
			msgs = basicSetCharacteristics(newCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.DELIVERY_CHANNEL_TYPE__CHARACTERISTICS, newCharacteristics, newCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelId(String newChannelId) {
		String oldChannelId = channelId;
		channelId = newChannelId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.DELIVERY_CHANNEL_TYPE__CHANNEL_ID, oldChannelId, channelId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocExchangeId() {
		return docExchangeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocExchangeId(String newDocExchangeId) {
		String oldDocExchangeId = docExchangeId;
		docExchangeId = newDocExchangeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.DELIVERY_CHANNEL_TYPE__DOC_EXCHANGE_ID, oldDocExchangeId, docExchangeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransportId() {
		return transportId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportId(String newTransportId) {
		String oldTransportId = transportId;
		transportId = newTransportId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.DELIVERY_CHANNEL_TYPE__TRANSPORT_ID, oldTransportId, transportId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__CHARACTERISTICS:
				return basicSetCharacteristics(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__CHARACTERISTICS:
				return getCharacteristics();
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__CHANNEL_ID:
				return getChannelId();
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__DOC_EXCHANGE_ID:
				return getDocExchangeId();
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__TRANSPORT_ID:
				return getTransportId();
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
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__CHARACTERISTICS:
				setCharacteristics((CharacteristicsType)newValue);
				return;
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__CHANNEL_ID:
				setChannelId((String)newValue);
				return;
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__DOC_EXCHANGE_ID:
				setDocExchangeId((String)newValue);
				return;
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__TRANSPORT_ID:
				setTransportId((String)newValue);
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
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__CHARACTERISTICS:
				setCharacteristics((CharacteristicsType)null);
				return;
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__CHANNEL_ID:
				setChannelId(CHANNEL_ID_EDEFAULT);
				return;
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__DOC_EXCHANGE_ID:
				setDocExchangeId(DOC_EXCHANGE_ID_EDEFAULT);
				return;
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__TRANSPORT_ID:
				setTransportId(TRANSPORT_ID_EDEFAULT);
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
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__CHARACTERISTICS:
				return characteristics != null;
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__CHANNEL_ID:
				return CHANNEL_ID_EDEFAULT == null ? channelId != null : !CHANNEL_ID_EDEFAULT.equals(channelId);
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__DOC_EXCHANGE_ID:
				return DOC_EXCHANGE_ID_EDEFAULT == null ? docExchangeId != null : !DOC_EXCHANGE_ID_EDEFAULT.equals(docExchangeId);
			case PartnerPackage.DELIVERY_CHANNEL_TYPE__TRANSPORT_ID:
				return TRANSPORT_ID_EDEFAULT == null ? transportId != null : !TRANSPORT_ID_EDEFAULT.equals(transportId);
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
		result.append(" (channelId: ");
		result.append(channelId);
		result.append(", docExchangeId: ");
		result.append(docExchangeId);
		result.append(", transportId: ");
		result.append(transportId);
		result.append(')');
		return result.toString();
	}

} //DeliveryChannelTypeImpl
