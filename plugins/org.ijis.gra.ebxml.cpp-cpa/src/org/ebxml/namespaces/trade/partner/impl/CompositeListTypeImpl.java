/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import java.util.Collection;

import org.ebxml.namespaces.trade.partner.CompositeListType;
import org.ebxml.namespaces.trade.partner.CompositeType;
import org.ebxml.namespaces.trade.partner.EncapsulationType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CompositeListTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CompositeListTypeImpl#getEncapsulation <em>Encapsulation</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CompositeListTypeImpl#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeListTypeImpl extends MinimalEObjectImpl.Container implements CompositeListType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.COMPOSITE_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, PartnerPackage.COMPOSITE_LIST_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncapsulationType> getEncapsulation() {
		return getGroup().list(PartnerPackage.Literals.COMPOSITE_LIST_TYPE__ENCAPSULATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeType> getComposite() {
		return getGroup().list(PartnerPackage.Literals.COMPOSITE_LIST_TYPE__COMPOSITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.COMPOSITE_LIST_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case PartnerPackage.COMPOSITE_LIST_TYPE__ENCAPSULATION:
				return ((InternalEList<?>)getEncapsulation()).basicRemove(otherEnd, msgs);
			case PartnerPackage.COMPOSITE_LIST_TYPE__COMPOSITE:
				return ((InternalEList<?>)getComposite()).basicRemove(otherEnd, msgs);
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
			case PartnerPackage.COMPOSITE_LIST_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case PartnerPackage.COMPOSITE_LIST_TYPE__ENCAPSULATION:
				return getEncapsulation();
			case PartnerPackage.COMPOSITE_LIST_TYPE__COMPOSITE:
				return getComposite();
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
			case PartnerPackage.COMPOSITE_LIST_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case PartnerPackage.COMPOSITE_LIST_TYPE__ENCAPSULATION:
				getEncapsulation().clear();
				getEncapsulation().addAll((Collection<? extends EncapsulationType>)newValue);
				return;
			case PartnerPackage.COMPOSITE_LIST_TYPE__COMPOSITE:
				getComposite().clear();
				getComposite().addAll((Collection<? extends CompositeType>)newValue);
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
			case PartnerPackage.COMPOSITE_LIST_TYPE__GROUP:
				getGroup().clear();
				return;
			case PartnerPackage.COMPOSITE_LIST_TYPE__ENCAPSULATION:
				getEncapsulation().clear();
				return;
			case PartnerPackage.COMPOSITE_LIST_TYPE__COMPOSITE:
				getComposite().clear();
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
			case PartnerPackage.COMPOSITE_LIST_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case PartnerPackage.COMPOSITE_LIST_TYPE__ENCAPSULATION:
				return !getEncapsulation().isEmpty();
			case PartnerPackage.COMPOSITE_LIST_TYPE__COMPOSITE:
				return !getComposite().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //CompositeListTypeImpl
