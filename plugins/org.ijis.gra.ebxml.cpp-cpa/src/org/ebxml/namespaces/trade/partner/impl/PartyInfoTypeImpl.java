/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import java.util.Collection;

import org.ebxml.namespaces.trade.partner.CertificateType;
import org.ebxml.namespaces.trade.partner.CollaborationRoleType;
import org.ebxml.namespaces.trade.partner.DeliveryChannelType;
import org.ebxml.namespaces.trade.partner.DocExchangeType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.PartyIdType;
import org.ebxml.namespaces.trade.partner.PartyInfoType;
import org.ebxml.namespaces.trade.partner.PartyRefType;
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
 * An implementation of the model object '<em><b>Party Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.PartyInfoTypeImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.PartyInfoTypeImpl#getPartyRef <em>Party Ref</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.PartyInfoTypeImpl#getCollaborationRole <em>Collaboration Role</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.PartyInfoTypeImpl#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.PartyInfoTypeImpl#getDeliveryChannel <em>Delivery Channel</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.PartyInfoTypeImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.PartyInfoTypeImpl#getDocExchange <em>Doc Exchange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartyInfoTypeImpl extends MinimalEObjectImpl.Container implements PartyInfoType {
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected EList<PartyIdType> partyId;

	/**
	 * The cached value of the '{@link #getPartyRef() <em>Party Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyRef()
	 * @generated
	 * @ordered
	 */
	protected PartyRefType partyRef;

	/**
	 * The cached value of the '{@link #getCollaborationRole() <em>Collaboration Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationRole()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborationRoleType> collaborationRole;

	/**
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected EList<CertificateType> certificate;

	/**
	 * The cached value of the '{@link #getDeliveryChannel() <em>Delivery Channel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryChannel()
	 * @generated
	 * @ordered
	 */
	protected EList<DeliveryChannelType> deliveryChannel;

	/**
	 * The cached value of the '{@link #getTransport() <em>Transport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportType> transport;

	/**
	 * The cached value of the '{@link #getDocExchange() <em>Doc Exchange</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocExchange()
	 * @generated
	 * @ordered
	 */
	protected EList<DocExchangeType> docExchange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyInfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.PARTY_INFO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartyIdType> getPartyId() {
		if (partyId == null) {
			partyId = new EObjectContainmentEList<PartyIdType>(PartyIdType.class, this, PartnerPackage.PARTY_INFO_TYPE__PARTY_ID);
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyRefType getPartyRef() {
		return partyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartyRef(PartyRefType newPartyRef, NotificationChain msgs) {
		PartyRefType oldPartyRef = partyRef;
		partyRef = newPartyRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.PARTY_INFO_TYPE__PARTY_REF, oldPartyRef, newPartyRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartyRef(PartyRefType newPartyRef) {
		if (newPartyRef != partyRef) {
			NotificationChain msgs = null;
			if (partyRef != null)
				msgs = ((InternalEObject)partyRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.PARTY_INFO_TYPE__PARTY_REF, null, msgs);
			if (newPartyRef != null)
				msgs = ((InternalEObject)newPartyRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.PARTY_INFO_TYPE__PARTY_REF, null, msgs);
			msgs = basicSetPartyRef(newPartyRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.PARTY_INFO_TYPE__PARTY_REF, newPartyRef, newPartyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollaborationRoleType> getCollaborationRole() {
		if (collaborationRole == null) {
			collaborationRole = new EObjectContainmentEList<CollaborationRoleType>(CollaborationRoleType.class, this, PartnerPackage.PARTY_INFO_TYPE__COLLABORATION_ROLE);
		}
		return collaborationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CertificateType> getCertificate() {
		if (certificate == null) {
			certificate = new EObjectContainmentEList<CertificateType>(CertificateType.class, this, PartnerPackage.PARTY_INFO_TYPE__CERTIFICATE);
		}
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeliveryChannelType> getDeliveryChannel() {
		if (deliveryChannel == null) {
			deliveryChannel = new EObjectContainmentEList<DeliveryChannelType>(DeliveryChannelType.class, this, PartnerPackage.PARTY_INFO_TYPE__DELIVERY_CHANNEL);
		}
		return deliveryChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransportType> getTransport() {
		if (transport == null) {
			transport = new EObjectContainmentEList<TransportType>(TransportType.class, this, PartnerPackage.PARTY_INFO_TYPE__TRANSPORT);
		}
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocExchangeType> getDocExchange() {
		if (docExchange == null) {
			docExchange = new EObjectContainmentEList<DocExchangeType>(DocExchangeType.class, this, PartnerPackage.PARTY_INFO_TYPE__DOC_EXCHANGE);
		}
		return docExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.PARTY_INFO_TYPE__PARTY_ID:
				return ((InternalEList<?>)getPartyId()).basicRemove(otherEnd, msgs);
			case PartnerPackage.PARTY_INFO_TYPE__PARTY_REF:
				return basicSetPartyRef(null, msgs);
			case PartnerPackage.PARTY_INFO_TYPE__COLLABORATION_ROLE:
				return ((InternalEList<?>)getCollaborationRole()).basicRemove(otherEnd, msgs);
			case PartnerPackage.PARTY_INFO_TYPE__CERTIFICATE:
				return ((InternalEList<?>)getCertificate()).basicRemove(otherEnd, msgs);
			case PartnerPackage.PARTY_INFO_TYPE__DELIVERY_CHANNEL:
				return ((InternalEList<?>)getDeliveryChannel()).basicRemove(otherEnd, msgs);
			case PartnerPackage.PARTY_INFO_TYPE__TRANSPORT:
				return ((InternalEList<?>)getTransport()).basicRemove(otherEnd, msgs);
			case PartnerPackage.PARTY_INFO_TYPE__DOC_EXCHANGE:
				return ((InternalEList<?>)getDocExchange()).basicRemove(otherEnd, msgs);
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
			case PartnerPackage.PARTY_INFO_TYPE__PARTY_ID:
				return getPartyId();
			case PartnerPackage.PARTY_INFO_TYPE__PARTY_REF:
				return getPartyRef();
			case PartnerPackage.PARTY_INFO_TYPE__COLLABORATION_ROLE:
				return getCollaborationRole();
			case PartnerPackage.PARTY_INFO_TYPE__CERTIFICATE:
				return getCertificate();
			case PartnerPackage.PARTY_INFO_TYPE__DELIVERY_CHANNEL:
				return getDeliveryChannel();
			case PartnerPackage.PARTY_INFO_TYPE__TRANSPORT:
				return getTransport();
			case PartnerPackage.PARTY_INFO_TYPE__DOC_EXCHANGE:
				return getDocExchange();
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
			case PartnerPackage.PARTY_INFO_TYPE__PARTY_ID:
				getPartyId().clear();
				getPartyId().addAll((Collection<? extends PartyIdType>)newValue);
				return;
			case PartnerPackage.PARTY_INFO_TYPE__PARTY_REF:
				setPartyRef((PartyRefType)newValue);
				return;
			case PartnerPackage.PARTY_INFO_TYPE__COLLABORATION_ROLE:
				getCollaborationRole().clear();
				getCollaborationRole().addAll((Collection<? extends CollaborationRoleType>)newValue);
				return;
			case PartnerPackage.PARTY_INFO_TYPE__CERTIFICATE:
				getCertificate().clear();
				getCertificate().addAll((Collection<? extends CertificateType>)newValue);
				return;
			case PartnerPackage.PARTY_INFO_TYPE__DELIVERY_CHANNEL:
				getDeliveryChannel().clear();
				getDeliveryChannel().addAll((Collection<? extends DeliveryChannelType>)newValue);
				return;
			case PartnerPackage.PARTY_INFO_TYPE__TRANSPORT:
				getTransport().clear();
				getTransport().addAll((Collection<? extends TransportType>)newValue);
				return;
			case PartnerPackage.PARTY_INFO_TYPE__DOC_EXCHANGE:
				getDocExchange().clear();
				getDocExchange().addAll((Collection<? extends DocExchangeType>)newValue);
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
			case PartnerPackage.PARTY_INFO_TYPE__PARTY_ID:
				getPartyId().clear();
				return;
			case PartnerPackage.PARTY_INFO_TYPE__PARTY_REF:
				setPartyRef((PartyRefType)null);
				return;
			case PartnerPackage.PARTY_INFO_TYPE__COLLABORATION_ROLE:
				getCollaborationRole().clear();
				return;
			case PartnerPackage.PARTY_INFO_TYPE__CERTIFICATE:
				getCertificate().clear();
				return;
			case PartnerPackage.PARTY_INFO_TYPE__DELIVERY_CHANNEL:
				getDeliveryChannel().clear();
				return;
			case PartnerPackage.PARTY_INFO_TYPE__TRANSPORT:
				getTransport().clear();
				return;
			case PartnerPackage.PARTY_INFO_TYPE__DOC_EXCHANGE:
				getDocExchange().clear();
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
			case PartnerPackage.PARTY_INFO_TYPE__PARTY_ID:
				return partyId != null && !partyId.isEmpty();
			case PartnerPackage.PARTY_INFO_TYPE__PARTY_REF:
				return partyRef != null;
			case PartnerPackage.PARTY_INFO_TYPE__COLLABORATION_ROLE:
				return collaborationRole != null && !collaborationRole.isEmpty();
			case PartnerPackage.PARTY_INFO_TYPE__CERTIFICATE:
				return certificate != null && !certificate.isEmpty();
			case PartnerPackage.PARTY_INFO_TYPE__DELIVERY_CHANNEL:
				return deliveryChannel != null && !deliveryChannel.isEmpty();
			case PartnerPackage.PARTY_INFO_TYPE__TRANSPORT:
				return transport != null && !transport.isEmpty();
			case PartnerPackage.PARTY_INFO_TYPE__DOC_EXCHANGE:
				return docExchange != null && !docExchange.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PartyInfoTypeImpl
