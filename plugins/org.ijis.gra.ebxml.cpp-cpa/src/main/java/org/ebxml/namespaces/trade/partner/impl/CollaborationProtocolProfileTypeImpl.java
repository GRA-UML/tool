/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import java.util.Collection;

import org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType;
import org.ebxml.namespaces.trade.partner.CommentType;
import org.ebxml.namespaces.trade.partner.PackagingType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.PartyInfoType;

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
 * An implementation of the model object '<em><b>Collaboration Protocol Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolProfileTypeImpl#getPartyInfo <em>Party Info</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolProfileTypeImpl#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolProfileTypeImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolProfileTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolProfileTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolProfileTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationProtocolProfileTypeImpl extends MinimalEObjectImpl.Container implements CollaborationProtocolProfileType {
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
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected SignatureType signature;

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
	protected CollaborationProtocolProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.COLLABORATION_PROTOCOL_PROFILE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartyInfoType> getPartyInfo() {
		if (partyInfo == null) {
			partyInfo = new EObjectContainmentEList<PartyInfoType>(PartyInfoType.class, this, PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PARTY_INFO);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING, oldPackaging, newPackaging);
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
				msgs = ((InternalEObject)packaging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING, null, msgs);
			if (newPackaging != null)
				msgs = ((InternalEObject)newPackaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING, null, msgs);
			msgs = basicSetPackaging(newPackaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING, newPackaging, newPackaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureType getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(SignatureType newSignature, NotificationChain msgs) {
		SignatureType oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE, oldSignature, newSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(SignatureType newSignature) {
		if (newSignature != signature) {
			NotificationChain msgs = null;
			if (signature != null)
				msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE, null, msgs);
			if (newSignature != null)
				msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE, null, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE, newSignature, newSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommentType> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<CommentType>(CommentType.class, this, PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__COMMENT);
		}
		return comment;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__ANY_ATTRIBUTE);
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
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PARTY_INFO:
				return ((InternalEList<?>)getPartyInfo()).basicRemove(otherEnd, msgs);
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING:
				return basicSetPackaging(null, msgs);
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE:
				return basicSetSignature(null, msgs);
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__ANY_ATTRIBUTE:
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
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PARTY_INFO:
				return getPartyInfo();
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING:
				return getPackaging();
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE:
				return getSignature();
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__COMMENT:
				return getComment();
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__VERSION:
				return getVersion();
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__ANY_ATTRIBUTE:
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
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PARTY_INFO:
				getPartyInfo().clear();
				getPartyInfo().addAll((Collection<? extends PartyInfoType>)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING:
				setPackaging((PackagingType)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE:
				setSignature((SignatureType)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends CommentType>)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__ANY_ATTRIBUTE:
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
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PARTY_INFO:
				getPartyInfo().clear();
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING:
				setPackaging((PackagingType)null);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE:
				setSignature((SignatureType)null);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__COMMENT:
				getComment().clear();
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__ANY_ATTRIBUTE:
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
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PARTY_INFO:
				return partyInfo != null && !partyInfo.isEmpty();
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING:
				return packaging != null;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE:
				return signature != null;
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__COMMENT:
				return comment != null && !comment.isEmpty();
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (version: ");
		result.append(version);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //CollaborationProtocolProfileTypeImpl
