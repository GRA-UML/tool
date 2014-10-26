/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.ConversationConstraintsType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ConversationConstraintsTypeImpl#getConcurrentConversations <em>Concurrent Conversations</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ConversationConstraintsTypeImpl#getInvocationLimit <em>Invocation Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversationConstraintsTypeImpl extends MinimalEObjectImpl.Container implements ConversationConstraintsType {
	/**
	 * The default value of the '{@link #getConcurrentConversations() <em>Concurrent Conversations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrentConversations()
	 * @generated
	 * @ordered
	 */
	protected static final int CONCURRENT_CONVERSATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConcurrentConversations() <em>Concurrent Conversations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrentConversations()
	 * @generated
	 * @ordered
	 */
	protected int concurrentConversations = CONCURRENT_CONVERSATIONS_EDEFAULT;

	/**
	 * This is true if the Concurrent Conversations attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean concurrentConversationsESet;

	/**
	 * The default value of the '{@link #getInvocationLimit() <em>Invocation Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocationLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int INVOCATION_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInvocationLimit() <em>Invocation Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocationLimit()
	 * @generated
	 * @ordered
	 */
	protected int invocationLimit = INVOCATION_LIMIT_EDEFAULT;

	/**
	 * This is true if the Invocation Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean invocationLimitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversationConstraintsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.CONVERSATION_CONSTRAINTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConcurrentConversations() {
		return concurrentConversations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrentConversations(int newConcurrentConversations) {
		int oldConcurrentConversations = concurrentConversations;
		concurrentConversations = newConcurrentConversations;
		boolean oldConcurrentConversationsESet = concurrentConversationsESet;
		concurrentConversationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__CONCURRENT_CONVERSATIONS, oldConcurrentConversations, concurrentConversations, !oldConcurrentConversationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConcurrentConversations() {
		int oldConcurrentConversations = concurrentConversations;
		boolean oldConcurrentConversationsESet = concurrentConversationsESet;
		concurrentConversations = CONCURRENT_CONVERSATIONS_EDEFAULT;
		concurrentConversationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__CONCURRENT_CONVERSATIONS, oldConcurrentConversations, CONCURRENT_CONVERSATIONS_EDEFAULT, oldConcurrentConversationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConcurrentConversations() {
		return concurrentConversationsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInvocationLimit() {
		return invocationLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvocationLimit(int newInvocationLimit) {
		int oldInvocationLimit = invocationLimit;
		invocationLimit = newInvocationLimit;
		boolean oldInvocationLimitESet = invocationLimitESet;
		invocationLimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__INVOCATION_LIMIT, oldInvocationLimit, invocationLimit, !oldInvocationLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInvocationLimit() {
		int oldInvocationLimit = invocationLimit;
		boolean oldInvocationLimitESet = invocationLimitESet;
		invocationLimit = INVOCATION_LIMIT_EDEFAULT;
		invocationLimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__INVOCATION_LIMIT, oldInvocationLimit, INVOCATION_LIMIT_EDEFAULT, oldInvocationLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInvocationLimit() {
		return invocationLimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__CONCURRENT_CONVERSATIONS:
				return getConcurrentConversations();
			case PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__INVOCATION_LIMIT:
				return getInvocationLimit();
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
			case PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__CONCURRENT_CONVERSATIONS:
				setConcurrentConversations((Integer)newValue);
				return;
			case PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__INVOCATION_LIMIT:
				setInvocationLimit((Integer)newValue);
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
			case PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__CONCURRENT_CONVERSATIONS:
				unsetConcurrentConversations();
				return;
			case PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__INVOCATION_LIMIT:
				unsetInvocationLimit();
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
			case PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__CONCURRENT_CONVERSATIONS:
				return isSetConcurrentConversations();
			case PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE__INVOCATION_LIMIT:
				return isSetInvocationLimit();
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
		result.append(" (concurrentConversations: ");
		if (concurrentConversationsESet) result.append(concurrentConversations); else result.append("<unset>");
		result.append(", invocationLimit: ");
		if (invocationLimitESet) result.append(invocationLimit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConversationConstraintsTypeImpl
