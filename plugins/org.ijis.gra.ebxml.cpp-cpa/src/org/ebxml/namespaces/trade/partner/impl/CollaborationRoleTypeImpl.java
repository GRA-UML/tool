/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import java.util.Collection;

import org.ebxml.namespaces.trade.partner.CertificateRefType;
import org.ebxml.namespaces.trade.partner.CollaborationRoleType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.ProcessSpecificationType;
import org.ebxml.namespaces.trade.partner.RoleType;
import org.ebxml.namespaces.trade.partner.ServiceBindingType;

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
 * An implementation of the model object '<em><b>Collaboration Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationRoleTypeImpl#getProcessSpecification <em>Process Specification</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationRoleTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationRoleTypeImpl#getCertificateRef <em>Certificate Ref</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationRoleTypeImpl#getServiceBinding <em>Service Binding</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.CollaborationRoleTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationRoleTypeImpl extends MinimalEObjectImpl.Container implements CollaborationRoleType {
	/**
	 * The cached value of the '{@link #getProcessSpecification() <em>Process Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessSpecification()
	 * @generated
	 * @ordered
	 */
	protected ProcessSpecificationType processSpecification;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected RoleType role;

	/**
	 * The cached value of the '{@link #getCertificateRef() <em>Certificate Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateRef()
	 * @generated
	 * @ordered
	 */
	protected CertificateRefType certificateRef;

	/**
	 * The cached value of the '{@link #getServiceBinding() <em>Service Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBindingType> serviceBinding;

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
	protected CollaborationRoleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.COLLABORATION_ROLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSpecificationType getProcessSpecification() {
		return processSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessSpecification(ProcessSpecificationType newProcessSpecification, NotificationChain msgs) {
		ProcessSpecificationType oldProcessSpecification = processSpecification;
		processSpecification = newProcessSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION, oldProcessSpecification, newProcessSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessSpecification(ProcessSpecificationType newProcessSpecification) {
		if (newProcessSpecification != processSpecification) {
			NotificationChain msgs = null;
			if (processSpecification != null)
				msgs = ((InternalEObject)processSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION, null, msgs);
			if (newProcessSpecification != null)
				msgs = ((InternalEObject)newProcessSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION, null, msgs);
			msgs = basicSetProcessSpecification(newProcessSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION, newProcessSpecification, newProcessSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(RoleType newRole, NotificationChain msgs) {
		RoleType oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_ROLE_TYPE__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(RoleType newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_ROLE_TYPE__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_ROLE_TYPE__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_ROLE_TYPE__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateRefType getCertificateRef() {
		return certificateRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertificateRef(CertificateRefType newCertificateRef, NotificationChain msgs) {
		CertificateRefType oldCertificateRef = certificateRef;
		certificateRef = newCertificateRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_ROLE_TYPE__CERTIFICATE_REF, oldCertificateRef, newCertificateRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateRef(CertificateRefType newCertificateRef) {
		if (newCertificateRef != certificateRef) {
			NotificationChain msgs = null;
			if (certificateRef != null)
				msgs = ((InternalEObject)certificateRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_ROLE_TYPE__CERTIFICATE_REF, null, msgs);
			if (newCertificateRef != null)
				msgs = ((InternalEObject)newCertificateRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.COLLABORATION_ROLE_TYPE__CERTIFICATE_REF, null, msgs);
			msgs = basicSetCertificateRef(newCertificateRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_ROLE_TYPE__CERTIFICATE_REF, newCertificateRef, newCertificateRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceBindingType> getServiceBinding() {
		if (serviceBinding == null) {
			serviceBinding = new EObjectContainmentEList<ServiceBindingType>(ServiceBindingType.class, this, PartnerPackage.COLLABORATION_ROLE_TYPE__SERVICE_BINDING);
		}
		return serviceBinding;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.COLLABORATION_ROLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION:
				return basicSetProcessSpecification(null, msgs);
			case PartnerPackage.COLLABORATION_ROLE_TYPE__ROLE:
				return basicSetRole(null, msgs);
			case PartnerPackage.COLLABORATION_ROLE_TYPE__CERTIFICATE_REF:
				return basicSetCertificateRef(null, msgs);
			case PartnerPackage.COLLABORATION_ROLE_TYPE__SERVICE_BINDING:
				return ((InternalEList<?>)getServiceBinding()).basicRemove(otherEnd, msgs);
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
			case PartnerPackage.COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION:
				return getProcessSpecification();
			case PartnerPackage.COLLABORATION_ROLE_TYPE__ROLE:
				return getRole();
			case PartnerPackage.COLLABORATION_ROLE_TYPE__CERTIFICATE_REF:
				return getCertificateRef();
			case PartnerPackage.COLLABORATION_ROLE_TYPE__SERVICE_BINDING:
				return getServiceBinding();
			case PartnerPackage.COLLABORATION_ROLE_TYPE__ID:
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
			case PartnerPackage.COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION:
				setProcessSpecification((ProcessSpecificationType)newValue);
				return;
			case PartnerPackage.COLLABORATION_ROLE_TYPE__ROLE:
				setRole((RoleType)newValue);
				return;
			case PartnerPackage.COLLABORATION_ROLE_TYPE__CERTIFICATE_REF:
				setCertificateRef((CertificateRefType)newValue);
				return;
			case PartnerPackage.COLLABORATION_ROLE_TYPE__SERVICE_BINDING:
				getServiceBinding().clear();
				getServiceBinding().addAll((Collection<? extends ServiceBindingType>)newValue);
				return;
			case PartnerPackage.COLLABORATION_ROLE_TYPE__ID:
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
			case PartnerPackage.COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION:
				setProcessSpecification((ProcessSpecificationType)null);
				return;
			case PartnerPackage.COLLABORATION_ROLE_TYPE__ROLE:
				setRole((RoleType)null);
				return;
			case PartnerPackage.COLLABORATION_ROLE_TYPE__CERTIFICATE_REF:
				setCertificateRef((CertificateRefType)null);
				return;
			case PartnerPackage.COLLABORATION_ROLE_TYPE__SERVICE_BINDING:
				getServiceBinding().clear();
				return;
			case PartnerPackage.COLLABORATION_ROLE_TYPE__ID:
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
			case PartnerPackage.COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION:
				return processSpecification != null;
			case PartnerPackage.COLLABORATION_ROLE_TYPE__ROLE:
				return role != null;
			case PartnerPackage.COLLABORATION_ROLE_TYPE__CERTIFICATE_REF:
				return certificateRef != null;
			case PartnerPackage.COLLABORATION_ROLE_TYPE__SERVICE_BINDING:
				return serviceBinding != null && !serviceBinding.isEmpty();
			case PartnerPackage.COLLABORATION_ROLE_TYPE__ID:
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

} //CollaborationRoleTypeImpl
