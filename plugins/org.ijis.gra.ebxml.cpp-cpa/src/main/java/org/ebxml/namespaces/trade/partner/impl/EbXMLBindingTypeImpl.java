/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import java.util.Collection;

import org.ebxml.namespaces.trade.partner.DigitalEnvelopeType;
import org.ebxml.namespaces.trade.partner.EbXMLBindingType;
import org.ebxml.namespaces.trade.partner.NamespaceSupportedType;
import org.ebxml.namespaces.trade.partner.NonRepudiationType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.ReliableMessagingType;

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
 * An implementation of the model object '<em><b>Eb XML Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.EbXMLBindingTypeImpl#getReliableMessaging <em>Reliable Messaging</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.EbXMLBindingTypeImpl#getNonRepudiation <em>Non Repudiation</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.EbXMLBindingTypeImpl#getDigitalEnvelope <em>Digital Envelope</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.EbXMLBindingTypeImpl#getNamespaceSupported <em>Namespace Supported</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.EbXMLBindingTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EbXMLBindingTypeImpl extends MinimalEObjectImpl.Container implements EbXMLBindingType {
	/**
	 * The cached value of the '{@link #getReliableMessaging() <em>Reliable Messaging</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliableMessaging()
	 * @generated
	 * @ordered
	 */
	protected ReliableMessagingType reliableMessaging;

	/**
	 * The cached value of the '{@link #getNonRepudiation() <em>Non Repudiation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonRepudiation()
	 * @generated
	 * @ordered
	 */
	protected NonRepudiationType nonRepudiation;

	/**
	 * The cached value of the '{@link #getDigitalEnvelope() <em>Digital Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalEnvelope()
	 * @generated
	 * @ordered
	 */
	protected DigitalEnvelopeType digitalEnvelope;

	/**
	 * The cached value of the '{@link #getNamespaceSupported() <em>Namespace Supported</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<NamespaceSupportedType> namespaceSupported;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EbXMLBindingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.EB_XML_BINDING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliableMessagingType getReliableMessaging() {
		return reliableMessaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliableMessaging(ReliableMessagingType newReliableMessaging, NotificationChain msgs) {
		ReliableMessagingType oldReliableMessaging = reliableMessaging;
		reliableMessaging = newReliableMessaging;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.EB_XML_BINDING_TYPE__RELIABLE_MESSAGING, oldReliableMessaging, newReliableMessaging);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliableMessaging(ReliableMessagingType newReliableMessaging) {
		if (newReliableMessaging != reliableMessaging) {
			NotificationChain msgs = null;
			if (reliableMessaging != null)
				msgs = ((InternalEObject)reliableMessaging).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.EB_XML_BINDING_TYPE__RELIABLE_MESSAGING, null, msgs);
			if (newReliableMessaging != null)
				msgs = ((InternalEObject)newReliableMessaging).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.EB_XML_BINDING_TYPE__RELIABLE_MESSAGING, null, msgs);
			msgs = basicSetReliableMessaging(newReliableMessaging, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.EB_XML_BINDING_TYPE__RELIABLE_MESSAGING, newReliableMessaging, newReliableMessaging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonRepudiationType getNonRepudiation() {
		return nonRepudiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonRepudiation(NonRepudiationType newNonRepudiation, NotificationChain msgs) {
		NonRepudiationType oldNonRepudiation = nonRepudiation;
		nonRepudiation = newNonRepudiation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.EB_XML_BINDING_TYPE__NON_REPUDIATION, oldNonRepudiation, newNonRepudiation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonRepudiation(NonRepudiationType newNonRepudiation) {
		if (newNonRepudiation != nonRepudiation) {
			NotificationChain msgs = null;
			if (nonRepudiation != null)
				msgs = ((InternalEObject)nonRepudiation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.EB_XML_BINDING_TYPE__NON_REPUDIATION, null, msgs);
			if (newNonRepudiation != null)
				msgs = ((InternalEObject)newNonRepudiation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.EB_XML_BINDING_TYPE__NON_REPUDIATION, null, msgs);
			msgs = basicSetNonRepudiation(newNonRepudiation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.EB_XML_BINDING_TYPE__NON_REPUDIATION, newNonRepudiation, newNonRepudiation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalEnvelopeType getDigitalEnvelope() {
		return digitalEnvelope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDigitalEnvelope(DigitalEnvelopeType newDigitalEnvelope, NotificationChain msgs) {
		DigitalEnvelopeType oldDigitalEnvelope = digitalEnvelope;
		digitalEnvelope = newDigitalEnvelope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE, oldDigitalEnvelope, newDigitalEnvelope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigitalEnvelope(DigitalEnvelopeType newDigitalEnvelope) {
		if (newDigitalEnvelope != digitalEnvelope) {
			NotificationChain msgs = null;
			if (digitalEnvelope != null)
				msgs = ((InternalEObject)digitalEnvelope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE, null, msgs);
			if (newDigitalEnvelope != null)
				msgs = ((InternalEObject)newDigitalEnvelope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE, null, msgs);
			msgs = basicSetDigitalEnvelope(newDigitalEnvelope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE, newDigitalEnvelope, newDigitalEnvelope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamespaceSupportedType> getNamespaceSupported() {
		if (namespaceSupported == null) {
			namespaceSupported = new EObjectContainmentEList<NamespaceSupportedType>(NamespaceSupportedType.class, this, PartnerPackage.EB_XML_BINDING_TYPE__NAMESPACE_SUPPORTED);
		}
		return namespaceSupported;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.EB_XML_BINDING_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.EB_XML_BINDING_TYPE__RELIABLE_MESSAGING:
				return basicSetReliableMessaging(null, msgs);
			case PartnerPackage.EB_XML_BINDING_TYPE__NON_REPUDIATION:
				return basicSetNonRepudiation(null, msgs);
			case PartnerPackage.EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE:
				return basicSetDigitalEnvelope(null, msgs);
			case PartnerPackage.EB_XML_BINDING_TYPE__NAMESPACE_SUPPORTED:
				return ((InternalEList<?>)getNamespaceSupported()).basicRemove(otherEnd, msgs);
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
			case PartnerPackage.EB_XML_BINDING_TYPE__RELIABLE_MESSAGING:
				return getReliableMessaging();
			case PartnerPackage.EB_XML_BINDING_TYPE__NON_REPUDIATION:
				return getNonRepudiation();
			case PartnerPackage.EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE:
				return getDigitalEnvelope();
			case PartnerPackage.EB_XML_BINDING_TYPE__NAMESPACE_SUPPORTED:
				return getNamespaceSupported();
			case PartnerPackage.EB_XML_BINDING_TYPE__VERSION:
				return getVersion();
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
			case PartnerPackage.EB_XML_BINDING_TYPE__RELIABLE_MESSAGING:
				setReliableMessaging((ReliableMessagingType)newValue);
				return;
			case PartnerPackage.EB_XML_BINDING_TYPE__NON_REPUDIATION:
				setNonRepudiation((NonRepudiationType)newValue);
				return;
			case PartnerPackage.EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE:
				setDigitalEnvelope((DigitalEnvelopeType)newValue);
				return;
			case PartnerPackage.EB_XML_BINDING_TYPE__NAMESPACE_SUPPORTED:
				getNamespaceSupported().clear();
				getNamespaceSupported().addAll((Collection<? extends NamespaceSupportedType>)newValue);
				return;
			case PartnerPackage.EB_XML_BINDING_TYPE__VERSION:
				setVersion((String)newValue);
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
			case PartnerPackage.EB_XML_BINDING_TYPE__RELIABLE_MESSAGING:
				setReliableMessaging((ReliableMessagingType)null);
				return;
			case PartnerPackage.EB_XML_BINDING_TYPE__NON_REPUDIATION:
				setNonRepudiation((NonRepudiationType)null);
				return;
			case PartnerPackage.EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE:
				setDigitalEnvelope((DigitalEnvelopeType)null);
				return;
			case PartnerPackage.EB_XML_BINDING_TYPE__NAMESPACE_SUPPORTED:
				getNamespaceSupported().clear();
				return;
			case PartnerPackage.EB_XML_BINDING_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case PartnerPackage.EB_XML_BINDING_TYPE__RELIABLE_MESSAGING:
				return reliableMessaging != null;
			case PartnerPackage.EB_XML_BINDING_TYPE__NON_REPUDIATION:
				return nonRepudiation != null;
			case PartnerPackage.EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE:
				return digitalEnvelope != null;
			case PartnerPackage.EB_XML_BINDING_TYPE__NAMESPACE_SUPPORTED:
				return namespaceSupported != null && !namespaceSupported.isEmpty();
			case PartnerPackage.EB_XML_BINDING_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(')');
		return result.toString();
	}

} //EbXMLBindingTypeImpl
