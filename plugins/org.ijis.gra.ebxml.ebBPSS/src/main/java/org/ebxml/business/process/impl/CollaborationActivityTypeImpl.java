/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.CollaborationActivityType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.ProcessPackage;

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
 * An implementation of the model object '<em><b>Collaboration Activity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.CollaborationActivityTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.CollaborationActivityTypeImpl#getBinaryCollaboration <em>Binary Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.CollaborationActivityTypeImpl#getBinaryCollaborationIDRef <em>Binary Collaboration ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.CollaborationActivityTypeImpl#getFromAuthorizedRole <em>From Authorized Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.CollaborationActivityTypeImpl#getFromAuthorizedRoleIDRef <em>From Authorized Role ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.CollaborationActivityTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.CollaborationActivityTypeImpl#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.CollaborationActivityTypeImpl#getToAuthorizedRole <em>To Authorized Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.CollaborationActivityTypeImpl#getToAuthorizedRoleIDRef <em>To Authorized Role ID Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationActivityTypeImpl extends MinimalEObjectImpl.Container implements CollaborationActivityType {
	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentationType> documentation;

	/**
	 * The default value of the '{@link #getBinaryCollaboration() <em>Binary Collaboration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryCollaboration()
	 * @generated
	 * @ordered
	 */
	protected static final String BINARY_COLLABORATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinaryCollaboration() <em>Binary Collaboration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryCollaboration()
	 * @generated
	 * @ordered
	 */
	protected String binaryCollaboration = BINARY_COLLABORATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinaryCollaborationIDRef() <em>Binary Collaboration ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryCollaborationIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BINARY_COLLABORATION_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinaryCollaborationIDRef() <em>Binary Collaboration ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryCollaborationIDRef()
	 * @generated
	 * @ordered
	 */
	protected String binaryCollaborationIDRef = BINARY_COLLABORATION_ID_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromAuthorizedRole() <em>From Authorized Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAuthorizedRole()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_AUTHORIZED_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromAuthorizedRole() <em>From Authorized Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAuthorizedRole()
	 * @generated
	 * @ordered
	 */
	protected String fromAuthorizedRole = FROM_AUTHORIZED_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromAuthorizedRoleIDRef() <em>From Authorized Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAuthorizedRoleIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_AUTHORIZED_ROLE_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromAuthorizedRoleIDRef() <em>From Authorized Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAuthorizedRoleIDRef()
	 * @generated
	 * @ordered
	 */
	protected String fromAuthorizedRoleIDRef = FROM_AUTHORIZED_ROLE_ID_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameID() <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameID()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameID() <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameID()
	 * @generated
	 * @ordered
	 */
	protected String nameID = NAME_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getToAuthorizedRole() <em>To Authorized Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAuthorizedRole()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_AUTHORIZED_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToAuthorizedRole() <em>To Authorized Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAuthorizedRole()
	 * @generated
	 * @ordered
	 */
	protected String toAuthorizedRole = TO_AUTHORIZED_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToAuthorizedRoleIDRef() <em>To Authorized Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAuthorizedRoleIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_AUTHORIZED_ROLE_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToAuthorizedRoleIDRef() <em>To Authorized Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAuthorizedRoleIDRef()
	 * @generated
	 * @ordered
	 */
	protected String toAuthorizedRoleIDRef = TO_AUTHORIZED_ROLE_ID_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationActivityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.COLLABORATION_ACTIVITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.COLLABORATION_ACTIVITY_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBinaryCollaboration() {
		return binaryCollaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryCollaboration(String newBinaryCollaboration) {
		String oldBinaryCollaboration = binaryCollaboration;
		binaryCollaboration = newBinaryCollaboration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION, oldBinaryCollaboration, binaryCollaboration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBinaryCollaborationIDRef() {
		return binaryCollaborationIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryCollaborationIDRef(String newBinaryCollaborationIDRef) {
		String oldBinaryCollaborationIDRef = binaryCollaborationIDRef;
		binaryCollaborationIDRef = newBinaryCollaborationIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION_ID_REF, oldBinaryCollaborationIDRef, binaryCollaborationIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromAuthorizedRole() {
		return fromAuthorizedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromAuthorizedRole(String newFromAuthorizedRole) {
		String oldFromAuthorizedRole = fromAuthorizedRole;
		fromAuthorizedRole = newFromAuthorizedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE, oldFromAuthorizedRole, fromAuthorizedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromAuthorizedRoleIDRef() {
		return fromAuthorizedRoleIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromAuthorizedRoleIDRef(String newFromAuthorizedRoleIDRef) {
		String oldFromAuthorizedRoleIDRef = fromAuthorizedRoleIDRef;
		fromAuthorizedRoleIDRef = newFromAuthorizedRoleIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF, oldFromAuthorizedRoleIDRef, fromAuthorizedRoleIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COLLABORATION_ACTIVITY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameID() {
		return nameID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameID(String newNameID) {
		String oldNameID = nameID;
		nameID = newNameID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COLLABORATION_ACTIVITY_TYPE__NAME_ID, oldNameID, nameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToAuthorizedRole() {
		return toAuthorizedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAuthorizedRole(String newToAuthorizedRole) {
		String oldToAuthorizedRole = toAuthorizedRole;
		toAuthorizedRole = newToAuthorizedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE, oldToAuthorizedRole, toAuthorizedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToAuthorizedRoleIDRef() {
		return toAuthorizedRoleIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAuthorizedRoleIDRef(String newToAuthorizedRoleIDRef) {
		String oldToAuthorizedRoleIDRef = toAuthorizedRoleIDRef;
		toAuthorizedRoleIDRef = newToAuthorizedRoleIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF, oldToAuthorizedRoleIDRef, toAuthorizedRoleIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION:
				return getBinaryCollaboration();
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION_ID_REF:
				return getBinaryCollaborationIDRef();
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE:
				return getFromAuthorizedRole();
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF:
				return getFromAuthorizedRoleIDRef();
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__NAME:
				return getName();
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__NAME_ID:
				return getNameID();
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE:
				return getToAuthorizedRole();
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF:
				return getToAuthorizedRoleIDRef();
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
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION:
				setBinaryCollaboration((String)newValue);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION_ID_REF:
				setBinaryCollaborationIDRef((String)newValue);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE:
				setFromAuthorizedRole((String)newValue);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF:
				setFromAuthorizedRoleIDRef((String)newValue);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__NAME_ID:
				setNameID((String)newValue);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE:
				setToAuthorizedRole((String)newValue);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF:
				setToAuthorizedRoleIDRef((String)newValue);
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
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION:
				setBinaryCollaboration(BINARY_COLLABORATION_EDEFAULT);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION_ID_REF:
				setBinaryCollaborationIDRef(BINARY_COLLABORATION_ID_REF_EDEFAULT);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE:
				setFromAuthorizedRole(FROM_AUTHORIZED_ROLE_EDEFAULT);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF:
				setFromAuthorizedRoleIDRef(FROM_AUTHORIZED_ROLE_ID_REF_EDEFAULT);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__NAME_ID:
				setNameID(NAME_ID_EDEFAULT);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE:
				setToAuthorizedRole(TO_AUTHORIZED_ROLE_EDEFAULT);
				return;
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF:
				setToAuthorizedRoleIDRef(TO_AUTHORIZED_ROLE_ID_REF_EDEFAULT);
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
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION:
				return BINARY_COLLABORATION_EDEFAULT == null ? binaryCollaboration != null : !BINARY_COLLABORATION_EDEFAULT.equals(binaryCollaboration);
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION_ID_REF:
				return BINARY_COLLABORATION_ID_REF_EDEFAULT == null ? binaryCollaborationIDRef != null : !BINARY_COLLABORATION_ID_REF_EDEFAULT.equals(binaryCollaborationIDRef);
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE:
				return FROM_AUTHORIZED_ROLE_EDEFAULT == null ? fromAuthorizedRole != null : !FROM_AUTHORIZED_ROLE_EDEFAULT.equals(fromAuthorizedRole);
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF:
				return FROM_AUTHORIZED_ROLE_ID_REF_EDEFAULT == null ? fromAuthorizedRoleIDRef != null : !FROM_AUTHORIZED_ROLE_ID_REF_EDEFAULT.equals(fromAuthorizedRoleIDRef);
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__NAME_ID:
				return NAME_ID_EDEFAULT == null ? nameID != null : !NAME_ID_EDEFAULT.equals(nameID);
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE:
				return TO_AUTHORIZED_ROLE_EDEFAULT == null ? toAuthorizedRole != null : !TO_AUTHORIZED_ROLE_EDEFAULT.equals(toAuthorizedRole);
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF:
				return TO_AUTHORIZED_ROLE_ID_REF_EDEFAULT == null ? toAuthorizedRoleIDRef != null : !TO_AUTHORIZED_ROLE_ID_REF_EDEFAULT.equals(toAuthorizedRoleIDRef);
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
		result.append(" (binaryCollaboration: ");
		result.append(binaryCollaboration);
		result.append(", binaryCollaborationIDRef: ");
		result.append(binaryCollaborationIDRef);
		result.append(", fromAuthorizedRole: ");
		result.append(fromAuthorizedRole);
		result.append(", fromAuthorizedRoleIDRef: ");
		result.append(fromAuthorizedRoleIDRef);
		result.append(", name: ");
		result.append(name);
		result.append(", nameID: ");
		result.append(nameID);
		result.append(", toAuthorizedRole: ");
		result.append(toAuthorizedRole);
		result.append(", toAuthorizedRoleIDRef: ");
		result.append(toAuthorizedRoleIDRef);
		result.append(')');
		return result.toString();
	}

} //CollaborationActivityTypeImpl
