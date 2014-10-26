/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import java.util.Collection;

import org.ebxml.namespaces.trade.partner.CompositeListType;
import org.ebxml.namespaces.trade.partner.PackagingType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType;
import org.ebxml.namespaces.trade.partner.SimplePartType;

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
 * An implementation of the model object '<em><b>Packaging Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.PackagingTypeImpl#getProcessingCapabilities <em>Processing Capabilities</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.PackagingTypeImpl#getSimplePart <em>Simple Part</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.PackagingTypeImpl#getCompositeList <em>Composite List</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.PackagingTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackagingTypeImpl extends MinimalEObjectImpl.Container implements PackagingType {
	/**
	 * The cached value of the '{@link #getProcessingCapabilities() <em>Processing Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingCapabilities()
	 * @generated
	 * @ordered
	 */
	protected ProcessingCapabilitiesType processingCapabilities;

	/**
	 * The cached value of the '{@link #getSimplePart() <em>Simple Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplePart()
	 * @generated
	 * @ordered
	 */
	protected EList<SimplePartType> simplePart;

	/**
	 * The cached value of the '{@link #getCompositeList() <em>Composite List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeList()
	 * @generated
	 * @ordered
	 */
	protected CompositeListType compositeList;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackagingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.PACKAGING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingCapabilitiesType getProcessingCapabilities() {
		return processingCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingCapabilities(ProcessingCapabilitiesType newProcessingCapabilities, NotificationChain msgs) {
		ProcessingCapabilitiesType oldProcessingCapabilities = processingCapabilities;
		processingCapabilities = newProcessingCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.PACKAGING_TYPE__PROCESSING_CAPABILITIES, oldProcessingCapabilities, newProcessingCapabilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingCapabilities(ProcessingCapabilitiesType newProcessingCapabilities) {
		if (newProcessingCapabilities != processingCapabilities) {
			NotificationChain msgs = null;
			if (processingCapabilities != null)
				msgs = ((InternalEObject)processingCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.PACKAGING_TYPE__PROCESSING_CAPABILITIES, null, msgs);
			if (newProcessingCapabilities != null)
				msgs = ((InternalEObject)newProcessingCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.PACKAGING_TYPE__PROCESSING_CAPABILITIES, null, msgs);
			msgs = basicSetProcessingCapabilities(newProcessingCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.PACKAGING_TYPE__PROCESSING_CAPABILITIES, newProcessingCapabilities, newProcessingCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimplePartType> getSimplePart() {
		if (simplePart == null) {
			simplePart = new EObjectContainmentEList<SimplePartType>(SimplePartType.class, this, PartnerPackage.PACKAGING_TYPE__SIMPLE_PART);
		}
		return simplePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeListType getCompositeList() {
		return compositeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeList(CompositeListType newCompositeList, NotificationChain msgs) {
		CompositeListType oldCompositeList = compositeList;
		compositeList = newCompositeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.PACKAGING_TYPE__COMPOSITE_LIST, oldCompositeList, newCompositeList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeList(CompositeListType newCompositeList) {
		if (newCompositeList != compositeList) {
			NotificationChain msgs = null;
			if (compositeList != null)
				msgs = ((InternalEObject)compositeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.PACKAGING_TYPE__COMPOSITE_LIST, null, msgs);
			if (newCompositeList != null)
				msgs = ((InternalEObject)newCompositeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.PACKAGING_TYPE__COMPOSITE_LIST, null, msgs);
			msgs = basicSetCompositeList(newCompositeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.PACKAGING_TYPE__COMPOSITE_LIST, newCompositeList, newCompositeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.PACKAGING_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.PACKAGING_TYPE__PROCESSING_CAPABILITIES:
				return basicSetProcessingCapabilities(null, msgs);
			case PartnerPackage.PACKAGING_TYPE__SIMPLE_PART:
				return ((InternalEList<?>)getSimplePart()).basicRemove(otherEnd, msgs);
			case PartnerPackage.PACKAGING_TYPE__COMPOSITE_LIST:
				return basicSetCompositeList(null, msgs);
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
			case PartnerPackage.PACKAGING_TYPE__PROCESSING_CAPABILITIES:
				return getProcessingCapabilities();
			case PartnerPackage.PACKAGING_TYPE__SIMPLE_PART:
				return getSimplePart();
			case PartnerPackage.PACKAGING_TYPE__COMPOSITE_LIST:
				return getCompositeList();
			case PartnerPackage.PACKAGING_TYPE__ID:
				return getId();
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
			case PartnerPackage.PACKAGING_TYPE__PROCESSING_CAPABILITIES:
				setProcessingCapabilities((ProcessingCapabilitiesType)newValue);
				return;
			case PartnerPackage.PACKAGING_TYPE__SIMPLE_PART:
				getSimplePart().clear();
				getSimplePart().addAll((Collection<? extends SimplePartType>)newValue);
				return;
			case PartnerPackage.PACKAGING_TYPE__COMPOSITE_LIST:
				setCompositeList((CompositeListType)newValue);
				return;
			case PartnerPackage.PACKAGING_TYPE__ID:
				setId((String)newValue);
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
			case PartnerPackage.PACKAGING_TYPE__PROCESSING_CAPABILITIES:
				setProcessingCapabilities((ProcessingCapabilitiesType)null);
				return;
			case PartnerPackage.PACKAGING_TYPE__SIMPLE_PART:
				getSimplePart().clear();
				return;
			case PartnerPackage.PACKAGING_TYPE__COMPOSITE_LIST:
				setCompositeList((CompositeListType)null);
				return;
			case PartnerPackage.PACKAGING_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case PartnerPackage.PACKAGING_TYPE__PROCESSING_CAPABILITIES:
				return processingCapabilities != null;
			case PartnerPackage.PACKAGING_TYPE__SIMPLE_PART:
				return simplePart != null && !simplePart.isEmpty();
			case PartnerPackage.PACKAGING_TYPE__COMPOSITE_LIST:
				return compositeList != null;
			case PartnerPackage.PACKAGING_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PackagingTypeImpl
