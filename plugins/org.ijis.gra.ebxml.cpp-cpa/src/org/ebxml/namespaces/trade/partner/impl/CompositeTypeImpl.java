/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import java.util.Collection;

import org.ebxml.namespaces.trade.partner.CompositeType;
import org.ebxml.namespaces.trade.partner.ConstituentType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;

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
 * An implementation of the model object '<em><b>Composite Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CompositeTypeImpl#getConstituent <em>Constituent</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CompositeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CompositeTypeImpl#getMimeparameters <em>Mimeparameters</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CompositeTypeImpl#getMimetype <em>Mimetype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeTypeImpl extends MinimalEObjectImpl.Container implements CompositeType {
	/**
	 * The cached value of the '{@link #getConstituent() <em>Constituent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstituent()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstituentType> constituent;

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
	 * The default value of the '{@link #getMimeparameters() <em>Mimeparameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeparameters()
	 * @generated
	 * @ordered
	 */
	protected static final String MIMEPARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeparameters() <em>Mimeparameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeparameters()
	 * @generated
	 * @ordered
	 */
	protected String mimeparameters = MIMEPARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimetype() <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimetype()
	 * @generated
	 * @ordered
	 */
	protected static final String MIMETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimetype() <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimetype()
	 * @generated
	 * @ordered
	 */
	protected String mimetype = MIMETYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.COMPOSITE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstituentType> getConstituent() {
		if (constituent == null) {
			constituent = new EObjectContainmentEList<ConstituentType>(ConstituentType.class, this, PartnerPackage.COMPOSITE_TYPE__CONSTITUENT);
		}
		return constituent;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COMPOSITE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeparameters() {
		return mimeparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeparameters(String newMimeparameters) {
		String oldMimeparameters = mimeparameters;
		mimeparameters = newMimeparameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COMPOSITE_TYPE__MIMEPARAMETERS, oldMimeparameters, mimeparameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimetype() {
		return mimetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimetype(String newMimetype) {
		String oldMimetype = mimetype;
		mimetype = newMimetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COMPOSITE_TYPE__MIMETYPE, oldMimetype, mimetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.COMPOSITE_TYPE__CONSTITUENT:
				return ((InternalEList<?>)getConstituent()).basicRemove(otherEnd, msgs);
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
			case PartnerPackage.COMPOSITE_TYPE__CONSTITUENT:
				return getConstituent();
			case PartnerPackage.COMPOSITE_TYPE__ID:
				return getId();
			case PartnerPackage.COMPOSITE_TYPE__MIMEPARAMETERS:
				return getMimeparameters();
			case PartnerPackage.COMPOSITE_TYPE__MIMETYPE:
				return getMimetype();
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
			case PartnerPackage.COMPOSITE_TYPE__CONSTITUENT:
				getConstituent().clear();
				getConstituent().addAll((Collection<? extends ConstituentType>)newValue);
				return;
			case PartnerPackage.COMPOSITE_TYPE__ID:
				setId((String)newValue);
				return;
			case PartnerPackage.COMPOSITE_TYPE__MIMEPARAMETERS:
				setMimeparameters((String)newValue);
				return;
			case PartnerPackage.COMPOSITE_TYPE__MIMETYPE:
				setMimetype((String)newValue);
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
			case PartnerPackage.COMPOSITE_TYPE__CONSTITUENT:
				getConstituent().clear();
				return;
			case PartnerPackage.COMPOSITE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case PartnerPackage.COMPOSITE_TYPE__MIMEPARAMETERS:
				setMimeparameters(MIMEPARAMETERS_EDEFAULT);
				return;
			case PartnerPackage.COMPOSITE_TYPE__MIMETYPE:
				setMimetype(MIMETYPE_EDEFAULT);
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
			case PartnerPackage.COMPOSITE_TYPE__CONSTITUENT:
				return constituent != null && !constituent.isEmpty();
			case PartnerPackage.COMPOSITE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PartnerPackage.COMPOSITE_TYPE__MIMEPARAMETERS:
				return MIMEPARAMETERS_EDEFAULT == null ? mimeparameters != null : !MIMEPARAMETERS_EDEFAULT.equals(mimeparameters);
			case PartnerPackage.COMPOSITE_TYPE__MIMETYPE:
				return MIMETYPE_EDEFAULT == null ? mimetype != null : !MIMETYPE_EDEFAULT.equals(mimetype);
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
		result.append(", mimeparameters: ");
		result.append(mimeparameters);
		result.append(", mimetype: ");
		result.append(mimetype);
		result.append(')');
		return result.toString();
	}

} //CompositeTypeImpl
