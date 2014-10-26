/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import java.util.Collection;

import org.ebxml.namespaces.trade.partner.OverrideType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.ServiceBindingType;
import org.ebxml.namespaces.trade.partner.ServiceType;

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
 * An implementation of the model object '<em><b>Service Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ServiceBindingTypeImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ServiceBindingTypeImpl#getOverride <em>Override</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ServiceBindingTypeImpl#getChannelId <em>Channel Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ServiceBindingTypeImpl#getPackageId <em>Package Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceBindingTypeImpl extends MinimalEObjectImpl.Container implements ServiceBindingType {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected ServiceType service;

	/**
	 * The cached value of the '{@link #getOverride() <em>Override</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverride()
	 * @generated
	 * @ordered
	 */
	protected EList<OverrideType> override;

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
	 * The default value of the '{@link #getPackageId() <em>Package Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageId()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageId() <em>Package Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageId()
	 * @generated
	 * @ordered
	 */
	protected String packageId = PACKAGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBindingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.SERVICE_BINDING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(ServiceType newService, NotificationChain msgs) {
		ServiceType oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.SERVICE_BINDING_TYPE__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(ServiceType newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.SERVICE_BINDING_TYPE__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.SERVICE_BINDING_TYPE__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.SERVICE_BINDING_TYPE__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OverrideType> getOverride() {
		if (override == null) {
			override = new EObjectContainmentEList<OverrideType>(OverrideType.class, this, PartnerPackage.SERVICE_BINDING_TYPE__OVERRIDE);
		}
		return override;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.SERVICE_BINDING_TYPE__CHANNEL_ID, oldChannelId, channelId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageId() {
		return packageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageId(String newPackageId) {
		String oldPackageId = packageId;
		packageId = newPackageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.SERVICE_BINDING_TYPE__PACKAGE_ID, oldPackageId, packageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.SERVICE_BINDING_TYPE__SERVICE:
				return basicSetService(null, msgs);
			case PartnerPackage.SERVICE_BINDING_TYPE__OVERRIDE:
				return ((InternalEList<?>)getOverride()).basicRemove(otherEnd, msgs);
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
			case PartnerPackage.SERVICE_BINDING_TYPE__SERVICE:
				return getService();
			case PartnerPackage.SERVICE_BINDING_TYPE__OVERRIDE:
				return getOverride();
			case PartnerPackage.SERVICE_BINDING_TYPE__CHANNEL_ID:
				return getChannelId();
			case PartnerPackage.SERVICE_BINDING_TYPE__PACKAGE_ID:
				return getPackageId();
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
			case PartnerPackage.SERVICE_BINDING_TYPE__SERVICE:
				setService((ServiceType)newValue);
				return;
			case PartnerPackage.SERVICE_BINDING_TYPE__OVERRIDE:
				getOverride().clear();
				getOverride().addAll((Collection<? extends OverrideType>)newValue);
				return;
			case PartnerPackage.SERVICE_BINDING_TYPE__CHANNEL_ID:
				setChannelId((String)newValue);
				return;
			case PartnerPackage.SERVICE_BINDING_TYPE__PACKAGE_ID:
				setPackageId((String)newValue);
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
			case PartnerPackage.SERVICE_BINDING_TYPE__SERVICE:
				setService((ServiceType)null);
				return;
			case PartnerPackage.SERVICE_BINDING_TYPE__OVERRIDE:
				getOverride().clear();
				return;
			case PartnerPackage.SERVICE_BINDING_TYPE__CHANNEL_ID:
				setChannelId(CHANNEL_ID_EDEFAULT);
				return;
			case PartnerPackage.SERVICE_BINDING_TYPE__PACKAGE_ID:
				setPackageId(PACKAGE_ID_EDEFAULT);
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
			case PartnerPackage.SERVICE_BINDING_TYPE__SERVICE:
				return service != null;
			case PartnerPackage.SERVICE_BINDING_TYPE__OVERRIDE:
				return override != null && !override.isEmpty();
			case PartnerPackage.SERVICE_BINDING_TYPE__CHANNEL_ID:
				return CHANNEL_ID_EDEFAULT == null ? channelId != null : !CHANNEL_ID_EDEFAULT.equals(channelId);
			case PartnerPackage.SERVICE_BINDING_TYPE__PACKAGE_ID:
				return PACKAGE_ID_EDEFAULT == null ? packageId != null : !PACKAGE_ID_EDEFAULT.equals(packageId);
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
		result.append(", packageId: ");
		result.append(packageId);
		result.append(')');
		return result.toString();
	}

} //ServiceBindingTypeImpl
