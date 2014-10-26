/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.BusinessTransactionType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.ProcessPackage;
import org.ebxml.business.process.RequestingBusinessActivityType;
import org.ebxml.business.process.RespondingBusinessActivityType;

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
 * An implementation of the model object '<em><b>Business Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl#getRequestingBusinessActivity <em>Requesting Business Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl#getRespondingBusinessActivity <em>Responding Business Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl#getBeginsWhen <em>Begins When</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl#getEndsWhen <em>Ends When</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl#isIsGuaranteedDeliveryRequired <em>Is Guaranteed Delivery Required</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessTransactionTypeImpl extends MinimalEObjectImpl.Container implements BusinessTransactionType {
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
	 * The cached value of the '{@link #getRequestingBusinessActivity() <em>Requesting Business Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestingBusinessActivity()
	 * @generated
	 * @ordered
	 */
	protected RequestingBusinessActivityType requestingBusinessActivity;

	/**
	 * The cached value of the '{@link #getRespondingBusinessActivity() <em>Responding Business Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondingBusinessActivity()
	 * @generated
	 * @ordered
	 */
	protected RespondingBusinessActivityType respondingBusinessActivity;

	/**
	 * The default value of the '{@link #getBeginsWhen() <em>Begins When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginsWhen()
	 * @generated
	 * @ordered
	 */
	protected static final String BEGINS_WHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginsWhen() <em>Begins When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginsWhen()
	 * @generated
	 * @ordered
	 */
	protected String beginsWhen = BEGINS_WHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndsWhen() <em>Ends When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndsWhen()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDS_WHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndsWhen() <em>Ends When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndsWhen()
	 * @generated
	 * @ordered
	 */
	protected String endsWhen = ENDS_WHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsGuaranteedDeliveryRequired() <em>Is Guaranteed Delivery Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGuaranteedDeliveryRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GUARANTEED_DELIVERY_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGuaranteedDeliveryRequired() <em>Is Guaranteed Delivery Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGuaranteedDeliveryRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isGuaranteedDeliveryRequired = IS_GUARANTEED_DELIVERY_REQUIRED_EDEFAULT;

	/**
	 * This is true if the Is Guaranteed Delivery Required attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isGuaranteedDeliveryRequiredESet;

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
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostCondition() <em>Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected String postCondition = POST_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected String preCondition = PRE_CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessTransactionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.BUSINESS_TRANSACTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.BUSINESS_TRANSACTION_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestingBusinessActivityType getRequestingBusinessActivity() {
		return requestingBusinessActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestingBusinessActivity(RequestingBusinessActivityType newRequestingBusinessActivity, NotificationChain msgs) {
		RequestingBusinessActivityType oldRequestingBusinessActivity = requestingBusinessActivity;
		requestingBusinessActivity = newRequestingBusinessActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY, oldRequestingBusinessActivity, newRequestingBusinessActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestingBusinessActivity(RequestingBusinessActivityType newRequestingBusinessActivity) {
		if (newRequestingBusinessActivity != requestingBusinessActivity) {
			NotificationChain msgs = null;
			if (requestingBusinessActivity != null)
				msgs = ((InternalEObject)requestingBusinessActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY, null, msgs);
			if (newRequestingBusinessActivity != null)
				msgs = ((InternalEObject)newRequestingBusinessActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY, null, msgs);
			msgs = basicSetRequestingBusinessActivity(newRequestingBusinessActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY, newRequestingBusinessActivity, newRequestingBusinessActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespondingBusinessActivityType getRespondingBusinessActivity() {
		return respondingBusinessActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRespondingBusinessActivity(RespondingBusinessActivityType newRespondingBusinessActivity, NotificationChain msgs) {
		RespondingBusinessActivityType oldRespondingBusinessActivity = respondingBusinessActivity;
		respondingBusinessActivity = newRespondingBusinessActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY, oldRespondingBusinessActivity, newRespondingBusinessActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespondingBusinessActivity(RespondingBusinessActivityType newRespondingBusinessActivity) {
		if (newRespondingBusinessActivity != respondingBusinessActivity) {
			NotificationChain msgs = null;
			if (respondingBusinessActivity != null)
				msgs = ((InternalEObject)respondingBusinessActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY, null, msgs);
			if (newRespondingBusinessActivity != null)
				msgs = ((InternalEObject)newRespondingBusinessActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY, null, msgs);
			msgs = basicSetRespondingBusinessActivity(newRespondingBusinessActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY, newRespondingBusinessActivity, newRespondingBusinessActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeginsWhen() {
		return beginsWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginsWhen(String newBeginsWhen) {
		String oldBeginsWhen = beginsWhen;
		beginsWhen = newBeginsWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__BEGINS_WHEN, oldBeginsWhen, beginsWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndsWhen() {
		return endsWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndsWhen(String newEndsWhen) {
		String oldEndsWhen = endsWhen;
		endsWhen = newEndsWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__ENDS_WHEN, oldEndsWhen, endsWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsGuaranteedDeliveryRequired() {
		return isGuaranteedDeliveryRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGuaranteedDeliveryRequired(boolean newIsGuaranteedDeliveryRequired) {
		boolean oldIsGuaranteedDeliveryRequired = isGuaranteedDeliveryRequired;
		isGuaranteedDeliveryRequired = newIsGuaranteedDeliveryRequired;
		boolean oldIsGuaranteedDeliveryRequiredESet = isGuaranteedDeliveryRequiredESet;
		isGuaranteedDeliveryRequiredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__IS_GUARANTEED_DELIVERY_REQUIRED, oldIsGuaranteedDeliveryRequired, isGuaranteedDeliveryRequired, !oldIsGuaranteedDeliveryRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsGuaranteedDeliveryRequired() {
		boolean oldIsGuaranteedDeliveryRequired = isGuaranteedDeliveryRequired;
		boolean oldIsGuaranteedDeliveryRequiredESet = isGuaranteedDeliveryRequiredESet;
		isGuaranteedDeliveryRequired = IS_GUARANTEED_DELIVERY_REQUIRED_EDEFAULT;
		isGuaranteedDeliveryRequiredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__IS_GUARANTEED_DELIVERY_REQUIRED, oldIsGuaranteedDeliveryRequired, IS_GUARANTEED_DELIVERY_REQUIRED_EDEFAULT, oldIsGuaranteedDeliveryRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsGuaranteedDeliveryRequired() {
		return isGuaranteedDeliveryRequiredESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__NAME_ID, oldNameID, nameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(String newPostCondition) {
		String oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__POST_CONDITION, oldPostCondition, postCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(String newPreCondition) {
		String oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_TRANSACTION_TYPE__PRE_CONDITION, oldPreCondition, preCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY:
				return basicSetRequestingBusinessActivity(null, msgs);
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY:
				return basicSetRespondingBusinessActivity(null, msgs);
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
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY:
				return getRequestingBusinessActivity();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY:
				return getRespondingBusinessActivity();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__BEGINS_WHEN:
				return getBeginsWhen();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__ENDS_WHEN:
				return getEndsWhen();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__IS_GUARANTEED_DELIVERY_REQUIRED:
				return isIsGuaranteedDeliveryRequired();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__NAME:
				return getName();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__NAME_ID:
				return getNameID();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__PATTERN:
				return getPattern();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__POST_CONDITION:
				return getPostCondition();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__PRE_CONDITION:
				return getPreCondition();
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
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY:
				setRequestingBusinessActivity((RequestingBusinessActivityType)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY:
				setRespondingBusinessActivity((RespondingBusinessActivityType)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__BEGINS_WHEN:
				setBeginsWhen((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__ENDS_WHEN:
				setEndsWhen((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__IS_GUARANTEED_DELIVERY_REQUIRED:
				setIsGuaranteedDeliveryRequired((Boolean)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__NAME_ID:
				setNameID((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__PATTERN:
				setPattern((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__POST_CONDITION:
				setPostCondition((String)newValue);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__PRE_CONDITION:
				setPreCondition((String)newValue);
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
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY:
				setRequestingBusinessActivity((RequestingBusinessActivityType)null);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY:
				setRespondingBusinessActivity((RespondingBusinessActivityType)null);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__BEGINS_WHEN:
				setBeginsWhen(BEGINS_WHEN_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__ENDS_WHEN:
				setEndsWhen(ENDS_WHEN_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__IS_GUARANTEED_DELIVERY_REQUIRED:
				unsetIsGuaranteedDeliveryRequired();
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__NAME_ID:
				setNameID(NAME_ID_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__POST_CONDITION:
				setPostCondition(POST_CONDITION_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__PRE_CONDITION:
				setPreCondition(PRE_CONDITION_EDEFAULT);
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
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY:
				return requestingBusinessActivity != null;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY:
				return respondingBusinessActivity != null;
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__BEGINS_WHEN:
				return BEGINS_WHEN_EDEFAULT == null ? beginsWhen != null : !BEGINS_WHEN_EDEFAULT.equals(beginsWhen);
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__ENDS_WHEN:
				return ENDS_WHEN_EDEFAULT == null ? endsWhen != null : !ENDS_WHEN_EDEFAULT.equals(endsWhen);
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__IS_GUARANTEED_DELIVERY_REQUIRED:
				return isSetIsGuaranteedDeliveryRequired();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__NAME_ID:
				return NAME_ID_EDEFAULT == null ? nameID != null : !NAME_ID_EDEFAULT.equals(nameID);
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__POST_CONDITION:
				return POST_CONDITION_EDEFAULT == null ? postCondition != null : !POST_CONDITION_EDEFAULT.equals(postCondition);
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE__PRE_CONDITION:
				return PRE_CONDITION_EDEFAULT == null ? preCondition != null : !PRE_CONDITION_EDEFAULT.equals(preCondition);
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
		result.append(" (beginsWhen: ");
		result.append(beginsWhen);
		result.append(", endsWhen: ");
		result.append(endsWhen);
		result.append(", isGuaranteedDeliveryRequired: ");
		if (isGuaranteedDeliveryRequiredESet) result.append(isGuaranteedDeliveryRequired); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nameID: ");
		result.append(nameID);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", postCondition: ");
		result.append(postCondition);
		result.append(", preCondition: ");
		result.append(preCondition);
		result.append(')');
		return result.toString();
	}

} //BusinessTransactionTypeImpl
