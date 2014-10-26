/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import java.util.Collection;

import org.ebxml.namespaces.trade.partner.EndpointType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.ProtocolType;
import org.ebxml.namespaces.trade.partner.TransportSecurityType;
import org.ebxml.namespaces.trade.partner.TransportType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.TransportTypeImpl#getSendingProtocol <em>Sending Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.TransportTypeImpl#getReceivingProtocol <em>Receiving Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.TransportTypeImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.TransportTypeImpl#getTransportSecurity <em>Transport Security</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.TransportTypeImpl#getTransportId <em>Transport Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportTypeImpl extends MinimalEObjectImpl.Container implements TransportType {
	/**
	 * The cached value of the '{@link #getSendingProtocol() <em>Sending Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolType> sendingProtocol;

	/**
	 * The cached value of the '{@link #getReceivingProtocol() <em>Receiving Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolType receivingProtocol;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<EndpointType> endpoint;

	/**
	 * The cached value of the '{@link #getTransportSecurity() <em>Transport Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportSecurity()
	 * @generated
	 * @ordered
	 */
	protected TransportSecurityType transportSecurity;

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
	protected TransportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.TRANSPORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolType> getSendingProtocol() {
		if (sendingProtocol == null) {
			sendingProtocol = new EObjectContainmentEList<ProtocolType>(ProtocolType.class, this, PartnerPackage.TRANSPORT_TYPE__SENDING_PROTOCOL);
		}
		return sendingProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType getReceivingProtocol() {
		return receivingProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivingProtocol(ProtocolType newReceivingProtocol, NotificationChain msgs) {
		ProtocolType oldReceivingProtocol = receivingProtocol;
		receivingProtocol = newReceivingProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.TRANSPORT_TYPE__RECEIVING_PROTOCOL, oldReceivingProtocol, newReceivingProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingProtocol(ProtocolType newReceivingProtocol) {
		if (newReceivingProtocol != receivingProtocol) {
			NotificationChain msgs = null;
			if (receivingProtocol != null)
				msgs = ((InternalEObject)receivingProtocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.TRANSPORT_TYPE__RECEIVING_PROTOCOL, null, msgs);
			if (newReceivingProtocol != null)
				msgs = ((InternalEObject)newReceivingProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.TRANSPORT_TYPE__RECEIVING_PROTOCOL, null, msgs);
			msgs = basicSetReceivingProtocol(newReceivingProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.TRANSPORT_TYPE__RECEIVING_PROTOCOL, newReceivingProtocol, newReceivingProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndpointType> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<EndpointType>(EndpointType.class, this, PartnerPackage.TRANSPORT_TYPE__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportSecurityType getTransportSecurity() {
		return transportSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportSecurity(TransportSecurityType newTransportSecurity, NotificationChain msgs) {
		TransportSecurityType oldTransportSecurity = transportSecurity;
		transportSecurity = newTransportSecurity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.TRANSPORT_TYPE__TRANSPORT_SECURITY, oldTransportSecurity, newTransportSecurity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportSecurity(TransportSecurityType newTransportSecurity) {
		if (newTransportSecurity != transportSecurity) {
			NotificationChain msgs = null;
			if (transportSecurity != null)
				msgs = ((InternalEObject)transportSecurity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.TRANSPORT_TYPE__TRANSPORT_SECURITY, null, msgs);
			if (newTransportSecurity != null)
				msgs = ((InternalEObject)newTransportSecurity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.TRANSPORT_TYPE__TRANSPORT_SECURITY, null, msgs);
			msgs = basicSetTransportSecurity(newTransportSecurity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.TRANSPORT_TYPE__TRANSPORT_SECURITY, newTransportSecurity, newTransportSecurity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.TRANSPORT_TYPE__TRANSPORT_ID, oldTransportId, transportId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.TRANSPORT_TYPE__SENDING_PROTOCOL:
				return ((InternalEList<?>)getSendingProtocol()).basicRemove(otherEnd, msgs);
			case PartnerPackage.TRANSPORT_TYPE__RECEIVING_PROTOCOL:
				return basicSetReceivingProtocol(null, msgs);
			case PartnerPackage.TRANSPORT_TYPE__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case PartnerPackage.TRANSPORT_TYPE__TRANSPORT_SECURITY:
				return basicSetTransportSecurity(null, msgs);
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
			case PartnerPackage.TRANSPORT_TYPE__SENDING_PROTOCOL:
				return getSendingProtocol();
			case PartnerPackage.TRANSPORT_TYPE__RECEIVING_PROTOCOL:
				return getReceivingProtocol();
			case PartnerPackage.TRANSPORT_TYPE__ENDPOINT:
				return getEndpoint();
			case PartnerPackage.TRANSPORT_TYPE__TRANSPORT_SECURITY:
				return getTransportSecurity();
			case PartnerPackage.TRANSPORT_TYPE__TRANSPORT_ID:
				return getTransportId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartnerPackage.TRANSPORT_TYPE__SENDING_PROTOCOL:
				getSendingProtocol().clear();
				getSendingProtocol().addAll((Collection<? extends ProtocolType>)newValue);
				return;
			case PartnerPackage.TRANSPORT_TYPE__RECEIVING_PROTOCOL:
				setReceivingProtocol((ProtocolType)newValue);
				return;
			case PartnerPackage.TRANSPORT_TYPE__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends EndpointType>)newValue);
				return;
			case PartnerPackage.TRANSPORT_TYPE__TRANSPORT_SECURITY:
				setTransportSecurity((TransportSecurityType)newValue);
				return;
			case PartnerPackage.TRANSPORT_TYPE__TRANSPORT_ID:
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
			case PartnerPackage.TRANSPORT_TYPE__SENDING_PROTOCOL:
				getSendingProtocol().clear();
				return;
			case PartnerPackage.TRANSPORT_TYPE__RECEIVING_PROTOCOL:
				setReceivingProtocol((ProtocolType)null);
				return;
			case PartnerPackage.TRANSPORT_TYPE__ENDPOINT:
				getEndpoint().clear();
				return;
			case PartnerPackage.TRANSPORT_TYPE__TRANSPORT_SECURITY:
				setTransportSecurity((TransportSecurityType)null);
				return;
			case PartnerPackage.TRANSPORT_TYPE__TRANSPORT_ID:
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
			case PartnerPackage.TRANSPORT_TYPE__SENDING_PROTOCOL:
				return sendingProtocol != null && !sendingProtocol.isEmpty();
			case PartnerPackage.TRANSPORT_TYPE__RECEIVING_PROTOCOL:
				return receivingProtocol != null;
			case PartnerPackage.TRANSPORT_TYPE__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case PartnerPackage.TRANSPORT_TYPE__TRANSPORT_SECURITY:
				return transportSecurity != null;
			case PartnerPackage.TRANSPORT_TYPE__TRANSPORT_ID:
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
		result.append(" (transportId: ");
		result.append(transportId);
		result.append(')');
		return result.toString();
	}

} //TransportTypeImpl
