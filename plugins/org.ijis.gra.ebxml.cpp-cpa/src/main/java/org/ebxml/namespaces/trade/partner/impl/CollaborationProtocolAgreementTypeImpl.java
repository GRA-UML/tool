/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType;
import org.ebxml.namespaces.trade.partner.CommentType;
import org.ebxml.namespaces.trade.partner.ConversationConstraintsType;
import org.ebxml.namespaces.trade.partner.PackagingType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.PartyInfoType;
import org.ebxml.namespaces.trade.partner.StatusType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.SignatureType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration Protocol Agreement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl#getConversationConstraints <em>Conversation Constraints</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl#getPartyInfo <em>Party Info</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl#getCpaid <em>Cpaid</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationProtocolAgreementTypeImpl extends MinimalEObjectImpl.Container implements CollaborationProtocolAgreementType {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusType status;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar end = END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConversationConstraints() <em>Conversation Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversationConstraints()
	 * @generated
	 * @ordered
	 */
	protected ConversationConstraintsType conversationConstraints;

	/**
	 * The cached value of the '{@link #getPartyInfo() <em>Party Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<PartyInfoType> partyInfo;

	/**
	 * The cached value of the '{@link #getPackaging() <em>Packaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackaging()
	 * @generated
	 * @ordered
	 */
	protected PackagingType packaging;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<SignatureType> signature;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<CommentType> comment;

	/**
	 * The default value of the '{@link #getCpaid() <em>Cpaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpaid()
	 * @generated
	 * @ordered
	 */
	protected static final String CPAID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpaid() <em>Cpaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpaid()
	 * @generated
	 * @ordered
	 */
	protected String cpaid = CPAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationProtocolAgreementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.COLLABORATION_PROTOCOL_AGREEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(StatusType newStatus, NotificationChain msgs) {
		StatusType oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(XMLGregorianCalendar newStart) {
		XMLGregorianCalendar oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(XMLGregorianCalendar newEnd) {
		XMLGregorianCalendar oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationConstraintsType getConversationConstraints() {
		return conversationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversationConstraints(ConversationConstraintsType newConversationConstraints, NotificationChain msgs) {
		ConversationConstraintsType oldConversationConstraints = conversationConstraints;
		conversationConstraints = newConversationConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS, oldConversationConstraints, newConversationConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversationConstraints(ConversationConstraintsType newConversationConstraints) {
		if (newConversationConstraints != conversationConstraints) {
			NotificationChain msgs = null;
			if (conversationConstraints != null)
				msgs = ((InternalEObject)conversationConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS, null, msgs);
			if (newConversationConstraints != null)
				msgs = ((InternalEObject)newConversationConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS, null, msgs);
			msgs = basicSetConversationConstraints(newConversationConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS, newConversationConstraints, newConversationConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartyInfoType> getPartyInfo() {
		if (partyInfo == null) {
			partyInfo = new EObjectContainmentEList<PartyInfoType>(PartyInfoType.class, this, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PARTY_INFO);
		}
		return partyInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagingType getPackaging() {
		return packaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackaging(PackagingType newPackaging, NotificationChain msgs) {
		PackagingType oldPackaging = packaging;
		packaging = newPackaging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING, oldPackaging, newPackaging);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackaging(PackagingType newPackaging) {
		if (newPackaging != packaging) {
			NotificationChain msgs = null;
			if (packaging != null)
				msgs = ((InternalEObject)packaging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING, null, msgs);
			if (newPackaging != null)
				msgs = ((InternalEObject)newPackaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING, null, msgs);
			msgs = basicSetPackaging(newPackaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING, newPackaging, newPackaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignatureType> getSignature() {
		if (signature == null) {
			signature = new EObjectContainmentEList<SignatureType>(SignatureType.class, this, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__SIGNATURE);
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommentType> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<CommentType>(CommentType.class, this, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpaid() {
		return cpaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpaid(String newCpaid) {
		String oldCpaid = cpaid;
		cpaid = newCpaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CPAID, oldCpaid, cpaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS:
				return basicSetStatus(null, msgs);
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS:
				return basicSetConversationConstraints(null, msgs);
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PARTY_INFO:
				return ((InternalEList<?>)getPartyInfo()).basicRemove(otherEnd, msgs);
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING:
				return basicSetPackaging(null, msgs);
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__SIGNATURE:
				return ((InternalEList<?>)getSignature()).basicRemove(otherEnd, msgs);
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS:
				return getStatus();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__START:
				return getStart();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__END:
				return getEnd();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS:
				return getConversationConstraints();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PARTY_INFO:
				return getPartyInfo();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING:
				return getPackaging();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__SIGNATURE:
				return getSignature();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__COMMENT:
				return getComment();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CPAID:
				return getCpaid();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__VERSION:
				return getVersion();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS:
				setStatus((StatusType)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__START:
				setStart((XMLGregorianCalendar)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__END:
				setEnd((XMLGregorianCalendar)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS:
				setConversationConstraints((ConversationConstraintsType)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PARTY_INFO:
				getPartyInfo().clear();
				getPartyInfo().addAll((Collection<? extends PartyInfoType>)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING:
				setPackaging((PackagingType)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__SIGNATURE:
				getSignature().clear();
				getSignature().addAll((Collection<? extends SignatureType>)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends CommentType>)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CPAID:
				setCpaid((String)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS:
				setStatus((StatusType)null);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__START:
				setStart(START_EDEFAULT);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__END:
				setEnd(END_EDEFAULT);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS:
				setConversationConstraints((ConversationConstraintsType)null);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PARTY_INFO:
				getPartyInfo().clear();
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING:
				setPackaging((PackagingType)null);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__SIGNATURE:
				getSignature().clear();
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__COMMENT:
				getComment().clear();
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CPAID:
				setCpaid(CPAID_EDEFAULT);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS:
				return status != null;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS:
				return conversationConstraints != null;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PARTY_INFO:
				return partyInfo != null && !partyInfo.isEmpty();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING:
				return packaging != null;
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__SIGNATURE:
				return signature != null && !signature.isEmpty();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__COMMENT:
				return comment != null && !comment.isEmpty();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CPAID:
				return CPAID_EDEFAULT == null ? cpaid != null : !CPAID_EDEFAULT.equals(cpaid);
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", cpaid: ");
		result.append(cpaid);
		result.append(", version: ");
		result.append(version);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //CollaborationProtocolAgreementTypeImpl
