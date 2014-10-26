/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import javax.xml.datatype.Duration;

import org.ebxml.business.process.BusinessTransactionActivityType;
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
 * An implementation of the model object '<em><b>Business Transaction Activity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#getBusinessTransactionIDRef <em>Business Transaction ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#getFromAuthorizedRole <em>From Authorized Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#getFromAuthorizedRoleIDRef <em>From Authorized Role ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#isIsConcurrent <em>Is Concurrent</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#isIsLegallyBinding <em>Is Legally Binding</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#getTimeToPerform <em>Time To Perform</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#getToAuthorizedRole <em>To Authorized Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl#getToAuthorizedRoleIDRef <em>To Authorized Role ID Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessTransactionActivityTypeImpl extends MinimalEObjectImpl.Container implements BusinessTransactionActivityType {
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
	 * The default value of the '{@link #getBusinessTransaction() <em>Business Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessTransaction()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_TRANSACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessTransaction() <em>Business Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessTransaction()
	 * @generated
	 * @ordered
	 */
	protected String businessTransaction = BUSINESS_TRANSACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusinessTransactionIDRef() <em>Business Transaction ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessTransactionIDRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_TRANSACTION_ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessTransactionIDRef() <em>Business Transaction ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessTransactionIDRef()
	 * @generated
	 * @ordered
	 */
	protected String businessTransactionIDRef = BUSINESS_TRANSACTION_ID_REF_EDEFAULT;

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
	 * The default value of the '{@link #isIsConcurrent() <em>Is Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConcurrent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONCURRENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsConcurrent() <em>Is Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConcurrent()
	 * @generated
	 * @ordered
	 */
	protected boolean isConcurrent = IS_CONCURRENT_EDEFAULT;

	/**
	 * This is true if the Is Concurrent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isConcurrentESet;

	/**
	 * The default value of the '{@link #isIsLegallyBinding() <em>Is Legally Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLegallyBinding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEGALLY_BINDING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsLegallyBinding() <em>Is Legally Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLegallyBinding()
	 * @generated
	 * @ordered
	 */
	protected boolean isLegallyBinding = IS_LEGALLY_BINDING_EDEFAULT;

	/**
	 * This is true if the Is Legally Binding attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isLegallyBindingESet;

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
	 * The default value of the '{@link #getTimeToPerform() <em>Time To Perform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToPerform()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TIME_TO_PERFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeToPerform() <em>Time To Perform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToPerform()
	 * @generated
	 * @ordered
	 */
	protected Duration timeToPerform = TIME_TO_PERFORM_EDEFAULT;

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
	protected BusinessTransactionActivityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.BUSINESS_TRANSACTION_ACTIVITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessTransaction() {
		return businessTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessTransaction(String newBusinessTransaction) {
		String oldBusinessTransaction = businessTransaction;
		businessTransaction = newBusinessTransaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION, oldBusinessTransaction, businessTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessTransactionIDRef() {
		return businessTransactionIDRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessTransactionIDRef(String newBusinessTransactionIDRef) {
		String oldBusinessTransactionIDRef = businessTransactionIDRef;
		businessTransactionIDRef = newBusinessTransactionIDRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION_ID_REF, oldBusinessTransactionIDRef, businessTransactionIDRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE, oldFromAuthorizedRole, fromAuthorizedRole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF, oldFromAuthorizedRoleIDRef, fromAuthorizedRoleIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConcurrent() {
		return isConcurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConcurrent(boolean newIsConcurrent) {
		boolean oldIsConcurrent = isConcurrent;
		isConcurrent = newIsConcurrent;
		boolean oldIsConcurrentESet = isConcurrentESet;
		isConcurrentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_CONCURRENT, oldIsConcurrent, isConcurrent, !oldIsConcurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsConcurrent() {
		boolean oldIsConcurrent = isConcurrent;
		boolean oldIsConcurrentESet = isConcurrentESet;
		isConcurrent = IS_CONCURRENT_EDEFAULT;
		isConcurrentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_CONCURRENT, oldIsConcurrent, IS_CONCURRENT_EDEFAULT, oldIsConcurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsConcurrent() {
		return isConcurrentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLegallyBinding() {
		return isLegallyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLegallyBinding(boolean newIsLegallyBinding) {
		boolean oldIsLegallyBinding = isLegallyBinding;
		isLegallyBinding = newIsLegallyBinding;
		boolean oldIsLegallyBindingESet = isLegallyBindingESet;
		isLegallyBindingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_LEGALLY_BINDING, oldIsLegallyBinding, isLegallyBinding, !oldIsLegallyBindingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsLegallyBinding() {
		boolean oldIsLegallyBinding = isLegallyBinding;
		boolean oldIsLegallyBindingESet = isLegallyBindingESet;
		isLegallyBinding = IS_LEGALLY_BINDING_EDEFAULT;
		isLegallyBindingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_LEGALLY_BINDING, oldIsLegallyBinding, IS_LEGALLY_BINDING_EDEFAULT, oldIsLegallyBindingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsLegallyBinding() {
		return isLegallyBindingESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME_ID, oldNameID, nameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimeToPerform() {
		return timeToPerform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeToPerform(Duration newTimeToPerform) {
		Duration oldTimeToPerform = timeToPerform;
		timeToPerform = newTimeToPerform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TIME_TO_PERFORM, oldTimeToPerform, timeToPerform));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE, oldToAuthorizedRole, toAuthorizedRole));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF, oldToAuthorizedRoleIDRef, toAuthorizedRoleIDRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__DOCUMENTATION:
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
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION:
				return getBusinessTransaction();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION_ID_REF:
				return getBusinessTransactionIDRef();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE:
				return getFromAuthorizedRole();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF:
				return getFromAuthorizedRoleIDRef();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_CONCURRENT:
				return isIsConcurrent();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_LEGALLY_BINDING:
				return isIsLegallyBinding();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME:
				return getName();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME_ID:
				return getNameID();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TIME_TO_PERFORM:
				return getTimeToPerform();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE:
				return getToAuthorizedRole();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF:
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
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION:
				setBusinessTransaction((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION_ID_REF:
				setBusinessTransactionIDRef((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE:
				setFromAuthorizedRole((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF:
				setFromAuthorizedRoleIDRef((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_CONCURRENT:
				setIsConcurrent((Boolean)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_LEGALLY_BINDING:
				setIsLegallyBinding((Boolean)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME_ID:
				setNameID((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TIME_TO_PERFORM:
				setTimeToPerform((Duration)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE:
				setToAuthorizedRole((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF:
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
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION:
				setBusinessTransaction(BUSINESS_TRANSACTION_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION_ID_REF:
				setBusinessTransactionIDRef(BUSINESS_TRANSACTION_ID_REF_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE:
				setFromAuthorizedRole(FROM_AUTHORIZED_ROLE_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF:
				setFromAuthorizedRoleIDRef(FROM_AUTHORIZED_ROLE_ID_REF_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_CONCURRENT:
				unsetIsConcurrent();
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_LEGALLY_BINDING:
				unsetIsLegallyBinding();
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME_ID:
				setNameID(NAME_ID_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TIME_TO_PERFORM:
				setTimeToPerform(TIME_TO_PERFORM_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE:
				setToAuthorizedRole(TO_AUTHORIZED_ROLE_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF:
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
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION:
				return BUSINESS_TRANSACTION_EDEFAULT == null ? businessTransaction != null : !BUSINESS_TRANSACTION_EDEFAULT.equals(businessTransaction);
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION_ID_REF:
				return BUSINESS_TRANSACTION_ID_REF_EDEFAULT == null ? businessTransactionIDRef != null : !BUSINESS_TRANSACTION_ID_REF_EDEFAULT.equals(businessTransactionIDRef);
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE:
				return FROM_AUTHORIZED_ROLE_EDEFAULT == null ? fromAuthorizedRole != null : !FROM_AUTHORIZED_ROLE_EDEFAULT.equals(fromAuthorizedRole);
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF:
				return FROM_AUTHORIZED_ROLE_ID_REF_EDEFAULT == null ? fromAuthorizedRoleIDRef != null : !FROM_AUTHORIZED_ROLE_ID_REF_EDEFAULT.equals(fromAuthorizedRoleIDRef);
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_CONCURRENT:
				return isSetIsConcurrent();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_LEGALLY_BINDING:
				return isSetIsLegallyBinding();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME_ID:
				return NAME_ID_EDEFAULT == null ? nameID != null : !NAME_ID_EDEFAULT.equals(nameID);
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TIME_TO_PERFORM:
				return TIME_TO_PERFORM_EDEFAULT == null ? timeToPerform != null : !TIME_TO_PERFORM_EDEFAULT.equals(timeToPerform);
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE:
				return TO_AUTHORIZED_ROLE_EDEFAULT == null ? toAuthorizedRole != null : !TO_AUTHORIZED_ROLE_EDEFAULT.equals(toAuthorizedRole);
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF:
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
		result.append(" (businessTransaction: ");
		result.append(businessTransaction);
		result.append(", businessTransactionIDRef: ");
		result.append(businessTransactionIDRef);
		result.append(", fromAuthorizedRole: ");
		result.append(fromAuthorizedRole);
		result.append(", fromAuthorizedRoleIDRef: ");
		result.append(fromAuthorizedRoleIDRef);
		result.append(", isConcurrent: ");
		if (isConcurrentESet) result.append(isConcurrent); else result.append("<unset>");
		result.append(", isLegallyBinding: ");
		if (isLegallyBindingESet) result.append(isLegallyBinding); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nameID: ");
		result.append(nameID);
		result.append(", timeToPerform: ");
		result.append(timeToPerform);
		result.append(", toAuthorizedRole: ");
		result.append(toAuthorizedRole);
		result.append(", toAuthorizedRoleIDRef: ");
		result.append(toAuthorizedRoleIDRef);
		result.append(')');
		return result.toString();
	}

} //BusinessTransactionActivityTypeImpl
