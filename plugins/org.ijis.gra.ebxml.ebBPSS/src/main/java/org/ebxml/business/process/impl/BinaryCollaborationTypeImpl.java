/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import javax.xml.datatype.Duration;

import org.ebxml.business.process.BinaryCollaborationType;
import org.ebxml.business.process.BusinessTransactionActivityType;
import org.ebxml.business.process.CollaborationActivityType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.FailureType;
import org.ebxml.business.process.ForkType;
import org.ebxml.business.process.InitiatingRoleType;
import org.ebxml.business.process.JoinType;
import org.ebxml.business.process.ProcessPackage;
import org.ebxml.business.process.RespondingRoleType;
import org.ebxml.business.process.StartType;
import org.ebxml.business.process.SuccessType;
import org.ebxml.business.process.TransitionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Collaboration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getInitiatingRole <em>Initiating Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getRespondingRole <em>Responding Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getDocumentation1 <em>Documentation1</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getSuccess <em>Success</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getBusinessTransactionActivity <em>Business Transaction Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getCollaborationActivity <em>Collaboration Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getFork <em>Fork</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getBeginsWhen <em>Begins When</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getEndsWhen <em>Ends When</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl#getTimeToPerform <em>Time To Perform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryCollaborationTypeImpl extends MinimalEObjectImpl.Container implements BinaryCollaborationType {
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
	 * The cached value of the '{@link #getInitiatingRole() <em>Initiating Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatingRole()
	 * @generated
	 * @ordered
	 */
	protected InitiatingRoleType initiatingRole;

	/**
	 * The cached value of the '{@link #getRespondingRole() <em>Responding Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondingRole()
	 * @generated
	 * @ordered
	 */
	protected RespondingRoleType respondingRole;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryCollaborationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.BINARY_COLLABORATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.BINARY_COLLABORATION_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiatingRoleType getInitiatingRole() {
		return initiatingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiatingRole(InitiatingRoleType newInitiatingRole, NotificationChain msgs) {
		InitiatingRoleType oldInitiatingRole = initiatingRole;
		initiatingRole = newInitiatingRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__INITIATING_ROLE, oldInitiatingRole, newInitiatingRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatingRole(InitiatingRoleType newInitiatingRole) {
		if (newInitiatingRole != initiatingRole) {
			NotificationChain msgs = null;
			if (initiatingRole != null)
				msgs = ((InternalEObject)initiatingRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BINARY_COLLABORATION_TYPE__INITIATING_ROLE, null, msgs);
			if (newInitiatingRole != null)
				msgs = ((InternalEObject)newInitiatingRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BINARY_COLLABORATION_TYPE__INITIATING_ROLE, null, msgs);
			msgs = basicSetInitiatingRole(newInitiatingRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__INITIATING_ROLE, newInitiatingRole, newInitiatingRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespondingRoleType getRespondingRole() {
		return respondingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRespondingRole(RespondingRoleType newRespondingRole, NotificationChain msgs) {
		RespondingRoleType oldRespondingRole = respondingRole;
		respondingRole = newRespondingRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__RESPONDING_ROLE, oldRespondingRole, newRespondingRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespondingRole(RespondingRoleType newRespondingRole) {
		if (newRespondingRole != respondingRole) {
			NotificationChain msgs = null;
			if (respondingRole != null)
				msgs = ((InternalEObject)respondingRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BINARY_COLLABORATION_TYPE__RESPONDING_ROLE, null, msgs);
			if (newRespondingRole != null)
				msgs = ((InternalEObject)newRespondingRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BINARY_COLLABORATION_TYPE__RESPONDING_ROLE, null, msgs);
			msgs = basicSetRespondingRole(newRespondingRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__RESPONDING_ROLE, newRespondingRole, newRespondingRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ProcessPackage.BINARY_COLLABORATION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation1() {
		return getGroup().list(ProcessPackage.Literals.BINARY_COLLABORATION_TYPE__DOCUMENTATION1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StartType> getStart() {
		return getGroup().list(ProcessPackage.Literals.BINARY_COLLABORATION_TYPE__START);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionType> getTransition() {
		return getGroup().list(ProcessPackage.Literals.BINARY_COLLABORATION_TYPE__TRANSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuccessType> getSuccess() {
		return getGroup().list(ProcessPackage.Literals.BINARY_COLLABORATION_TYPE__SUCCESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureType> getFailure() {
		return getGroup().list(ProcessPackage.Literals.BINARY_COLLABORATION_TYPE__FAILURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessTransactionActivityType> getBusinessTransactionActivity() {
		return getGroup().list(ProcessPackage.Literals.BINARY_COLLABORATION_TYPE__BUSINESS_TRANSACTION_ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollaborationActivityType> getCollaborationActivity() {
		return getGroup().list(ProcessPackage.Literals.BINARY_COLLABORATION_TYPE__COLLABORATION_ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkType> getFork() {
		return getGroup().list(ProcessPackage.Literals.BINARY_COLLABORATION_TYPE__FORK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinType> getJoin() {
		return getGroup().list(ProcessPackage.Literals.BINARY_COLLABORATION_TYPE__JOIN);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__BEGINS_WHEN, oldBeginsWhen, beginsWhen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__ENDS_WHEN, oldEndsWhen, endsWhen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__NAME_ID, oldNameID, nameID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__PATTERN, oldPattern, pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__POST_CONDITION, oldPostCondition, postCondition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__PRE_CONDITION, oldPreCondition, preCondition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BINARY_COLLABORATION_TYPE__TIME_TO_PERFORM, oldTimeToPerform, timeToPerform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.BINARY_COLLABORATION_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__INITIATING_ROLE:
				return basicSetInitiatingRole(null, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__RESPONDING_ROLE:
				return basicSetRespondingRole(null, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__DOCUMENTATION1:
				return ((InternalEList<?>)getDocumentation1()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__START:
				return ((InternalEList<?>)getStart()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__SUCCESS:
				return ((InternalEList<?>)getSuccess()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__FAILURE:
				return ((InternalEList<?>)getFailure()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__BUSINESS_TRANSACTION_ACTIVITY:
				return ((InternalEList<?>)getBusinessTransactionActivity()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__COLLABORATION_ACTIVITY:
				return ((InternalEList<?>)getCollaborationActivity()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__FORK:
				return ((InternalEList<?>)getFork()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__JOIN:
				return ((InternalEList<?>)getJoin()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.BINARY_COLLABORATION_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__INITIATING_ROLE:
				return getInitiatingRole();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__RESPONDING_ROLE:
				return getRespondingRole();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__DOCUMENTATION1:
				return getDocumentation1();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__START:
				return getStart();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__TRANSITION:
				return getTransition();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__SUCCESS:
				return getSuccess();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__FAILURE:
				return getFailure();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__BUSINESS_TRANSACTION_ACTIVITY:
				return getBusinessTransactionActivity();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__COLLABORATION_ACTIVITY:
				return getCollaborationActivity();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__FORK:
				return getFork();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__JOIN:
				return getJoin();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__BEGINS_WHEN:
				return getBeginsWhen();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__ENDS_WHEN:
				return getEndsWhen();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__NAME:
				return getName();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__NAME_ID:
				return getNameID();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__PATTERN:
				return getPattern();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__POST_CONDITION:
				return getPostCondition();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__PRE_CONDITION:
				return getPreCondition();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__TIME_TO_PERFORM:
				return getTimeToPerform();
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
			case ProcessPackage.BINARY_COLLABORATION_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__INITIATING_ROLE:
				setInitiatingRole((InitiatingRoleType)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__RESPONDING_ROLE:
				setRespondingRole((RespondingRoleType)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__DOCUMENTATION1:
				getDocumentation1().clear();
				getDocumentation1().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__START:
				getStart().clear();
				getStart().addAll((Collection<? extends StartType>)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends TransitionType>)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__SUCCESS:
				getSuccess().clear();
				getSuccess().addAll((Collection<? extends SuccessType>)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__FAILURE:
				getFailure().clear();
				getFailure().addAll((Collection<? extends FailureType>)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__BUSINESS_TRANSACTION_ACTIVITY:
				getBusinessTransactionActivity().clear();
				getBusinessTransactionActivity().addAll((Collection<? extends BusinessTransactionActivityType>)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__COLLABORATION_ACTIVITY:
				getCollaborationActivity().clear();
				getCollaborationActivity().addAll((Collection<? extends CollaborationActivityType>)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__FORK:
				getFork().clear();
				getFork().addAll((Collection<? extends ForkType>)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__JOIN:
				getJoin().clear();
				getJoin().addAll((Collection<? extends JoinType>)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__BEGINS_WHEN:
				setBeginsWhen((String)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__ENDS_WHEN:
				setEndsWhen((String)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__NAME_ID:
				setNameID((String)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__PATTERN:
				setPattern((String)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__POST_CONDITION:
				setPostCondition((String)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__PRE_CONDITION:
				setPreCondition((String)newValue);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__TIME_TO_PERFORM:
				setTimeToPerform((Duration)newValue);
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
			case ProcessPackage.BINARY_COLLABORATION_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__INITIATING_ROLE:
				setInitiatingRole((InitiatingRoleType)null);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__RESPONDING_ROLE:
				setRespondingRole((RespondingRoleType)null);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__GROUP:
				getGroup().clear();
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__DOCUMENTATION1:
				getDocumentation1().clear();
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__START:
				getStart().clear();
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__TRANSITION:
				getTransition().clear();
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__SUCCESS:
				getSuccess().clear();
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__FAILURE:
				getFailure().clear();
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__BUSINESS_TRANSACTION_ACTIVITY:
				getBusinessTransactionActivity().clear();
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__COLLABORATION_ACTIVITY:
				getCollaborationActivity().clear();
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__FORK:
				getFork().clear();
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__JOIN:
				getJoin().clear();
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__BEGINS_WHEN:
				setBeginsWhen(BEGINS_WHEN_EDEFAULT);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__ENDS_WHEN:
				setEndsWhen(ENDS_WHEN_EDEFAULT);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__NAME_ID:
				setNameID(NAME_ID_EDEFAULT);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__POST_CONDITION:
				setPostCondition(POST_CONDITION_EDEFAULT);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__PRE_CONDITION:
				setPreCondition(PRE_CONDITION_EDEFAULT);
				return;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__TIME_TO_PERFORM:
				setTimeToPerform(TIME_TO_PERFORM_EDEFAULT);
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
			case ProcessPackage.BINARY_COLLABORATION_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__INITIATING_ROLE:
				return initiatingRole != null;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__RESPONDING_ROLE:
				return respondingRole != null;
			case ProcessPackage.BINARY_COLLABORATION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__DOCUMENTATION1:
				return !getDocumentation1().isEmpty();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__START:
				return !getStart().isEmpty();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__TRANSITION:
				return !getTransition().isEmpty();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__SUCCESS:
				return !getSuccess().isEmpty();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__FAILURE:
				return !getFailure().isEmpty();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__BUSINESS_TRANSACTION_ACTIVITY:
				return !getBusinessTransactionActivity().isEmpty();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__COLLABORATION_ACTIVITY:
				return !getCollaborationActivity().isEmpty();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__FORK:
				return !getFork().isEmpty();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__JOIN:
				return !getJoin().isEmpty();
			case ProcessPackage.BINARY_COLLABORATION_TYPE__BEGINS_WHEN:
				return BEGINS_WHEN_EDEFAULT == null ? beginsWhen != null : !BEGINS_WHEN_EDEFAULT.equals(beginsWhen);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__ENDS_WHEN:
				return ENDS_WHEN_EDEFAULT == null ? endsWhen != null : !ENDS_WHEN_EDEFAULT.equals(endsWhen);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__NAME_ID:
				return NAME_ID_EDEFAULT == null ? nameID != null : !NAME_ID_EDEFAULT.equals(nameID);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__POST_CONDITION:
				return POST_CONDITION_EDEFAULT == null ? postCondition != null : !POST_CONDITION_EDEFAULT.equals(postCondition);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__PRE_CONDITION:
				return PRE_CONDITION_EDEFAULT == null ? preCondition != null : !PRE_CONDITION_EDEFAULT.equals(preCondition);
			case ProcessPackage.BINARY_COLLABORATION_TYPE__TIME_TO_PERFORM:
				return TIME_TO_PERFORM_EDEFAULT == null ? timeToPerform != null : !TIME_TO_PERFORM_EDEFAULT.equals(timeToPerform);
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
		result.append(", beginsWhen: ");
		result.append(beginsWhen);
		result.append(", endsWhen: ");
		result.append(endsWhen);
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
		result.append(", timeToPerform: ");
		result.append(timeToPerform);
		result.append(')');
		return result.toString();
	}

} //BinaryCollaborationTypeImpl
