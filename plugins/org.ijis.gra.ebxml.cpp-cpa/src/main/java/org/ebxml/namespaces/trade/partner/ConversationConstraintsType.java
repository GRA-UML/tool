/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getConcurrentConversations <em>Concurrent Conversations</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getInvocationLimit <em>Invocation Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getConversationConstraintsType()
 * @model extendedMetaData="name='ConversationConstraints_._type' kind='empty'"
 * @generated
 */
public interface ConversationConstraintsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Concurrent Conversations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrent Conversations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrent Conversations</em>' attribute.
	 * @see #isSetConcurrentConversations()
	 * @see #unsetConcurrentConversations()
	 * @see #setConcurrentConversations(int)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getConversationConstraintsType_ConcurrentConversations()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='concurrentConversations'"
	 * @generated
	 */
	int getConcurrentConversations();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getConcurrentConversations <em>Concurrent Conversations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrent Conversations</em>' attribute.
	 * @see #isSetConcurrentConversations()
	 * @see #unsetConcurrentConversations()
	 * @see #getConcurrentConversations()
	 * @generated
	 */
	void setConcurrentConversations(int value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getConcurrentConversations <em>Concurrent Conversations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConcurrentConversations()
	 * @see #getConcurrentConversations()
	 * @see #setConcurrentConversations(int)
	 * @generated
	 */
	void unsetConcurrentConversations();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getConcurrentConversations <em>Concurrent Conversations</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Concurrent Conversations</em>' attribute is set.
	 * @see #unsetConcurrentConversations()
	 * @see #getConcurrentConversations()
	 * @see #setConcurrentConversations(int)
	 * @generated
	 */
	boolean isSetConcurrentConversations();

	/**
	 * Returns the value of the '<em><b>Invocation Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocation Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation Limit</em>' attribute.
	 * @see #isSetInvocationLimit()
	 * @see #unsetInvocationLimit()
	 * @see #setInvocationLimit(int)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getConversationConstraintsType_InvocationLimit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='invocationLimit'"
	 * @generated
	 */
	int getInvocationLimit();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getInvocationLimit <em>Invocation Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocation Limit</em>' attribute.
	 * @see #isSetInvocationLimit()
	 * @see #unsetInvocationLimit()
	 * @see #getInvocationLimit()
	 * @generated
	 */
	void setInvocationLimit(int value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getInvocationLimit <em>Invocation Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInvocationLimit()
	 * @see #getInvocationLimit()
	 * @see #setInvocationLimit(int)
	 * @generated
	 */
	void unsetInvocationLimit();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getInvocationLimit <em>Invocation Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Invocation Limit</em>' attribute is set.
	 * @see #unsetInvocationLimit()
	 * @see #getInvocationLimit()
	 * @see #setInvocationLimit(int)
	 * @generated
	 */
	boolean isSetInvocationLimit();

} // ConversationConstraintsType
