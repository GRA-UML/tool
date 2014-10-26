/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.OverrideType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Override Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.OverrideTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.OverrideTypeImpl#getChannelId <em>Channel Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.OverrideTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.OverrideTypeImpl#getPackageId <em>Package Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.OverrideTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OverrideTypeImpl extends MinimalEObjectImpl.Container implements OverrideType {
	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

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
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverrideTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.OVERRIDE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.OVERRIDE_TYPE__ACTION, oldAction, action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.OVERRIDE_TYPE__CHANNEL_ID, oldChannelId, channelId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.OVERRIDE_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.OVERRIDE_TYPE__PACKAGE_ID, oldPackageId, packageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.OVERRIDE_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.OVERRIDE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartnerPackage.OVERRIDE_TYPE__ACTION:
				return getAction();
			case PartnerPackage.OVERRIDE_TYPE__CHANNEL_ID:
				return getChannelId();
			case PartnerPackage.OVERRIDE_TYPE__HREF:
				return getHref();
			case PartnerPackage.OVERRIDE_TYPE__PACKAGE_ID:
				return getPackageId();
			case PartnerPackage.OVERRIDE_TYPE__TYPE:
				return getType();
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
			case PartnerPackage.OVERRIDE_TYPE__ACTION:
				setAction((String)newValue);
				return;
			case PartnerPackage.OVERRIDE_TYPE__CHANNEL_ID:
				setChannelId((String)newValue);
				return;
			case PartnerPackage.OVERRIDE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case PartnerPackage.OVERRIDE_TYPE__PACKAGE_ID:
				setPackageId((String)newValue);
				return;
			case PartnerPackage.OVERRIDE_TYPE__TYPE:
				setType((TypeType)newValue);
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
			case PartnerPackage.OVERRIDE_TYPE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case PartnerPackage.OVERRIDE_TYPE__CHANNEL_ID:
				setChannelId(CHANNEL_ID_EDEFAULT);
				return;
			case PartnerPackage.OVERRIDE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case PartnerPackage.OVERRIDE_TYPE__PACKAGE_ID:
				setPackageId(PACKAGE_ID_EDEFAULT);
				return;
			case PartnerPackage.OVERRIDE_TYPE__TYPE:
				unsetType();
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
			case PartnerPackage.OVERRIDE_TYPE__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case PartnerPackage.OVERRIDE_TYPE__CHANNEL_ID:
				return CHANNEL_ID_EDEFAULT == null ? channelId != null : !CHANNEL_ID_EDEFAULT.equals(channelId);
			case PartnerPackage.OVERRIDE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case PartnerPackage.OVERRIDE_TYPE__PACKAGE_ID:
				return PACKAGE_ID_EDEFAULT == null ? packageId != null : !PACKAGE_ID_EDEFAULT.equals(packageId);
			case PartnerPackage.OVERRIDE_TYPE__TYPE:
				return isSetType();
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
		result.append(" (action: ");
		result.append(action);
		result.append(", channelId: ");
		result.append(channelId);
		result.append(", href: ");
		result.append(href);
		result.append(", packageId: ");
		result.append(packageId);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OverrideTypeImpl
