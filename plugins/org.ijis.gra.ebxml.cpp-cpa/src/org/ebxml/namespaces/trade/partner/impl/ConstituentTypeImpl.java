/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.ConstituentType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constituent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ConstituentTypeImpl#getIdref <em>Idref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstituentTypeImpl extends MinimalEObjectImpl.Container implements ConstituentType {
	/**
	 * The default value of the '{@link #getIdref() <em>Idref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdref()
	 * @generated
	 * @ordered
	 */
	protected static final String IDREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdref() <em>Idref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdref()
	 * @generated
	 * @ordered
	 */
	protected String idref = IDREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstituentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.CONSTITUENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdref() {
		return idref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdref(String newIdref) {
		String oldIdref = idref;
		idref = newIdref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CONSTITUENT_TYPE__IDREF, oldIdref, idref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartnerPackage.CONSTITUENT_TYPE__IDREF:
				return getIdref();
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
			case PartnerPackage.CONSTITUENT_TYPE__IDREF:
				setIdref((String)newValue);
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
			case PartnerPackage.CONSTITUENT_TYPE__IDREF:
				setIdref(IDREF_EDEFAULT);
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
			case PartnerPackage.CONSTITUENT_TYPE__IDREF:
				return IDREF_EDEFAULT == null ? idref != null : !IDREF_EDEFAULT.equals(idref);
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
		result.append(" (idref: ");
		result.append(idref);
		result.append(')');
		return result.toString();
	}

} //ConstituentTypeImpl
