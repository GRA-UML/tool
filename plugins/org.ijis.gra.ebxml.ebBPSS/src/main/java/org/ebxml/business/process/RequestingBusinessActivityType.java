/**
 */
package org.ebxml.business.process;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requesting Business Activity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.RequestingBusinessActivityType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.RequestingBusinessActivityType#getDocumentEnvelope <em>Document Envelope</em>}</li>
 *   <li>{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsAuthorizationRequired <em>Is Authorization Required</em>}</li>
 *   <li>{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsIntelligibleCheckRequired <em>Is Intelligible Check Required</em>}</li>
 *   <li>{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationReceiptRequired <em>Is Non Repudiation Receipt Required</em>}</li>
 *   <li>{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationRequired <em>Is Non Repudiation Required</em>}</li>
 *   <li>{@link org.ebxml.business.process.RequestingBusinessActivityType#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.RequestingBusinessActivityType#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.RequestingBusinessActivityType#getTimeToAcknowledgeAcceptance <em>Time To Acknowledge Acceptance</em>}</li>
 *   <li>{@link org.ebxml.business.process.RequestingBusinessActivityType#getTimeToAcknowledgeReceipt <em>Time To Acknowledge Receipt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getRequestingBusinessActivityType()
 * @model extendedMetaData="name='RequestingBusinessActivity_._type' kind='elementOnly'"
 * @generated
 */
public interface RequestingBusinessActivityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.DocumentationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getRequestingBusinessActivityType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Document Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Envelope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Envelope</em>' containment reference.
	 * @see #setDocumentEnvelope(DocumentEnvelopeType)
	 * @see org.ebxml.business.process.ProcessPackage#getRequestingBusinessActivityType_DocumentEnvelope()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentEnvelope' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentEnvelopeType getDocumentEnvelope();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#getDocumentEnvelope <em>Document Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Envelope</em>' containment reference.
	 * @see #getDocumentEnvelope()
	 * @generated
	 */
	void setDocumentEnvelope(DocumentEnvelopeType value);

	/**
	 * Returns the value of the '<em><b>Is Authorization Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Authorization Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authorization Required</em>' attribute.
	 * @see #isSetIsAuthorizationRequired()
	 * @see #unsetIsAuthorizationRequired()
	 * @see #setIsAuthorizationRequired(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getRequestingBusinessActivityType_IsAuthorizationRequired()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isAuthorizationRequired'"
	 * @generated
	 */
	boolean isIsAuthorizationRequired();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsAuthorizationRequired <em>Is Authorization Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authorization Required</em>' attribute.
	 * @see #isSetIsAuthorizationRequired()
	 * @see #unsetIsAuthorizationRequired()
	 * @see #isIsAuthorizationRequired()
	 * @generated
	 */
	void setIsAuthorizationRequired(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsAuthorizationRequired <em>Is Authorization Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAuthorizationRequired()
	 * @see #isIsAuthorizationRequired()
	 * @see #setIsAuthorizationRequired(boolean)
	 * @generated
	 */
	void unsetIsAuthorizationRequired();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsAuthorizationRequired <em>Is Authorization Required</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Authorization Required</em>' attribute is set.
	 * @see #unsetIsAuthorizationRequired()
	 * @see #isIsAuthorizationRequired()
	 * @see #setIsAuthorizationRequired(boolean)
	 * @generated
	 */
	boolean isSetIsAuthorizationRequired();

	/**
	 * Returns the value of the '<em><b>Is Intelligible Check Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Intelligible Check Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Intelligible Check Required</em>' attribute.
	 * @see #isSetIsIntelligibleCheckRequired()
	 * @see #unsetIsIntelligibleCheckRequired()
	 * @see #setIsIntelligibleCheckRequired(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getRequestingBusinessActivityType_IsIntelligibleCheckRequired()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isIntelligibleCheckRequired'"
	 * @generated
	 */
	boolean isIsIntelligibleCheckRequired();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsIntelligibleCheckRequired <em>Is Intelligible Check Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Intelligible Check Required</em>' attribute.
	 * @see #isSetIsIntelligibleCheckRequired()
	 * @see #unsetIsIntelligibleCheckRequired()
	 * @see #isIsIntelligibleCheckRequired()
	 * @generated
	 */
	void setIsIntelligibleCheckRequired(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsIntelligibleCheckRequired <em>Is Intelligible Check Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsIntelligibleCheckRequired()
	 * @see #isIsIntelligibleCheckRequired()
	 * @see #setIsIntelligibleCheckRequired(boolean)
	 * @generated
	 */
	void unsetIsIntelligibleCheckRequired();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsIntelligibleCheckRequired <em>Is Intelligible Check Required</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Intelligible Check Required</em>' attribute is set.
	 * @see #unsetIsIntelligibleCheckRequired()
	 * @see #isIsIntelligibleCheckRequired()
	 * @see #setIsIntelligibleCheckRequired(boolean)
	 * @generated
	 */
	boolean isSetIsIntelligibleCheckRequired();

	/**
	 * Returns the value of the '<em><b>Is Non Repudiation Receipt Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Non Repudiation Receipt Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Non Repudiation Receipt Required</em>' attribute.
	 * @see #isSetIsNonRepudiationReceiptRequired()
	 * @see #unsetIsNonRepudiationReceiptRequired()
	 * @see #setIsNonRepudiationReceiptRequired(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getRequestingBusinessActivityType_IsNonRepudiationReceiptRequired()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isNonRepudiationReceiptRequired'"
	 * @generated
	 */
	boolean isIsNonRepudiationReceiptRequired();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationReceiptRequired <em>Is Non Repudiation Receipt Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Non Repudiation Receipt Required</em>' attribute.
	 * @see #isSetIsNonRepudiationReceiptRequired()
	 * @see #unsetIsNonRepudiationReceiptRequired()
	 * @see #isIsNonRepudiationReceiptRequired()
	 * @generated
	 */
	void setIsNonRepudiationReceiptRequired(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationReceiptRequired <em>Is Non Repudiation Receipt Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsNonRepudiationReceiptRequired()
	 * @see #isIsNonRepudiationReceiptRequired()
	 * @see #setIsNonRepudiationReceiptRequired(boolean)
	 * @generated
	 */
	void unsetIsNonRepudiationReceiptRequired();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationReceiptRequired <em>Is Non Repudiation Receipt Required</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Non Repudiation Receipt Required</em>' attribute is set.
	 * @see #unsetIsNonRepudiationReceiptRequired()
	 * @see #isIsNonRepudiationReceiptRequired()
	 * @see #setIsNonRepudiationReceiptRequired(boolean)
	 * @generated
	 */
	boolean isSetIsNonRepudiationReceiptRequired();

	/**
	 * Returns the value of the '<em><b>Is Non Repudiation Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Non Repudiation Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Non Repudiation Required</em>' attribute.
	 * @see #isSetIsNonRepudiationRequired()
	 * @see #unsetIsNonRepudiationRequired()
	 * @see #setIsNonRepudiationRequired(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getRequestingBusinessActivityType_IsNonRepudiationRequired()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isNonRepudiationRequired'"
	 * @generated
	 */
	boolean isIsNonRepudiationRequired();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationRequired <em>Is Non Repudiation Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Non Repudiation Required</em>' attribute.
	 * @see #isSetIsNonRepudiationRequired()
	 * @see #unsetIsNonRepudiationRequired()
	 * @see #isIsNonRepudiationRequired()
	 * @generated
	 */
	void setIsNonRepudiationRequired(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationRequired <em>Is Non Repudiation Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsNonRepudiationRequired()
	 * @see #isIsNonRepudiationRequired()
	 * @see #setIsNonRepudiationRequired(boolean)
	 * @generated
	 */
	void unsetIsNonRepudiationRequired();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationRequired <em>Is Non Repudiation Required</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Non Repudiation Required</em>' attribute is set.
	 * @see #unsetIsNonRepudiationRequired()
	 * @see #isIsNonRepudiationRequired()
	 * @see #setIsNonRepudiationRequired(boolean)
	 * @generated
	 */
	boolean isSetIsNonRepudiationRequired();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ebxml.business.process.ProcessPackage#getRequestingBusinessActivityType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name ID</em>' attribute.
	 * @see #setNameID(String)
	 * @see org.ebxml.business.process.ProcessPackage#getRequestingBusinessActivityType_NameID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='nameID'"
	 * @generated
	 */
	String getNameID();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#getNameID <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ID</em>' attribute.
	 * @see #getNameID()
	 * @generated
	 */
	void setNameID(String value);

	/**
	 * Returns the value of the '<em><b>Time To Acknowledge Acceptance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time To Acknowledge Acceptance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Acknowledge Acceptance</em>' attribute.
	 * @see #setTimeToAcknowledgeAcceptance(Duration)
	 * @see org.ebxml.business.process.ProcessPackage#getRequestingBusinessActivityType_TimeToAcknowledgeAcceptance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='timeToAcknowledgeAcceptance'"
	 * @generated
	 */
	Duration getTimeToAcknowledgeAcceptance();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#getTimeToAcknowledgeAcceptance <em>Time To Acknowledge Acceptance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Acknowledge Acceptance</em>' attribute.
	 * @see #getTimeToAcknowledgeAcceptance()
	 * @generated
	 */
	void setTimeToAcknowledgeAcceptance(Duration value);

	/**
	 * Returns the value of the '<em><b>Time To Acknowledge Receipt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time To Acknowledge Receipt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Acknowledge Receipt</em>' attribute.
	 * @see #setTimeToAcknowledgeReceipt(Duration)
	 * @see org.ebxml.business.process.ProcessPackage#getRequestingBusinessActivityType_TimeToAcknowledgeReceipt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='timeToAcknowledgeReceipt'"
	 * @generated
	 */
	Duration getTimeToAcknowledgeReceipt();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.RequestingBusinessActivityType#getTimeToAcknowledgeReceipt <em>Time To Acknowledge Receipt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Acknowledge Receipt</em>' attribute.
	 * @see #getTimeToAcknowledgeReceipt()
	 * @generated
	 */
	void setTimeToAcknowledgeReceipt(Duration value);

} // RequestingBusinessActivityType
