/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionType#getRequestingBusinessActivity <em>Requesting Business Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionType#getRespondingBusinessActivity <em>Responding Business Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionType#getBeginsWhen <em>Begins When</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionType#getEndsWhen <em>Ends When</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionType#isIsGuaranteedDeliveryRequired <em>Is Guaranteed Delivery Required</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionType#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionType#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionType#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionType#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType()
 * @model extendedMetaData="name='BusinessTransaction_._type' kind='elementOnly'"
 * @generated
 */
public interface BusinessTransactionType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Requesting Business Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requesting Business Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requesting Business Activity</em>' containment reference.
	 * @see #setRequestingBusinessActivity(RequestingBusinessActivityType)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType_RequestingBusinessActivity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RequestingBusinessActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestingBusinessActivityType getRequestingBusinessActivity();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionType#getRequestingBusinessActivity <em>Requesting Business Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requesting Business Activity</em>' containment reference.
	 * @see #getRequestingBusinessActivity()
	 * @generated
	 */
	void setRequestingBusinessActivity(RequestingBusinessActivityType value);

	/**
	 * Returns the value of the '<em><b>Responding Business Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responding Business Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responding Business Activity</em>' containment reference.
	 * @see #setRespondingBusinessActivity(RespondingBusinessActivityType)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType_RespondingBusinessActivity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RespondingBusinessActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	RespondingBusinessActivityType getRespondingBusinessActivity();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionType#getRespondingBusinessActivity <em>Responding Business Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responding Business Activity</em>' containment reference.
	 * @see #getRespondingBusinessActivity()
	 * @generated
	 */
	void setRespondingBusinessActivity(RespondingBusinessActivityType value);

	/**
	 * Returns the value of the '<em><b>Begins When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begins When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begins When</em>' attribute.
	 * @see #setBeginsWhen(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType_BeginsWhen()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beginsWhen'"
	 * @generated
	 */
	String getBeginsWhen();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionType#getBeginsWhen <em>Begins When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begins When</em>' attribute.
	 * @see #getBeginsWhen()
	 * @generated
	 */
	void setBeginsWhen(String value);

	/**
	 * Returns the value of the '<em><b>Ends When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ends When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends When</em>' attribute.
	 * @see #setEndsWhen(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType_EndsWhen()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endsWhen'"
	 * @generated
	 */
	String getEndsWhen();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionType#getEndsWhen <em>Ends When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ends When</em>' attribute.
	 * @see #getEndsWhen()
	 * @generated
	 */
	void setEndsWhen(String value);

	/**
	 * Returns the value of the '<em><b>Is Guaranteed Delivery Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Guaranteed Delivery Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Guaranteed Delivery Required</em>' attribute.
	 * @see #isSetIsGuaranteedDeliveryRequired()
	 * @see #unsetIsGuaranteedDeliveryRequired()
	 * @see #setIsGuaranteedDeliveryRequired(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType_IsGuaranteedDeliveryRequired()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isGuaranteedDeliveryRequired'"
	 * @generated
	 */
	boolean isIsGuaranteedDeliveryRequired();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionType#isIsGuaranteedDeliveryRequired <em>Is Guaranteed Delivery Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Guaranteed Delivery Required</em>' attribute.
	 * @see #isSetIsGuaranteedDeliveryRequired()
	 * @see #unsetIsGuaranteedDeliveryRequired()
	 * @see #isIsGuaranteedDeliveryRequired()
	 * @generated
	 */
	void setIsGuaranteedDeliveryRequired(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.BusinessTransactionType#isIsGuaranteedDeliveryRequired <em>Is Guaranteed Delivery Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsGuaranteedDeliveryRequired()
	 * @see #isIsGuaranteedDeliveryRequired()
	 * @see #setIsGuaranteedDeliveryRequired(boolean)
	 * @generated
	 */
	void unsetIsGuaranteedDeliveryRequired();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.BusinessTransactionType#isIsGuaranteedDeliveryRequired <em>Is Guaranteed Delivery Required</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Guaranteed Delivery Required</em>' attribute is set.
	 * @see #unsetIsGuaranteedDeliveryRequired()
	 * @see #isIsGuaranteedDeliveryRequired()
	 * @see #setIsGuaranteedDeliveryRequired(boolean)
	 * @generated
	 */
	boolean isSetIsGuaranteedDeliveryRequired();

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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionType#getName <em>Name</em>}' attribute.
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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType_NameID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='nameID'"
	 * @generated
	 */
	String getNameID();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionType#getNameID <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ID</em>' attribute.
	 * @see #getNameID()
	 * @generated
	 */
	void setNameID(String value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType_Pattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='pattern'"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionType#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' attribute.
	 * @see #setPostCondition(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType_PostCondition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='postCondition'"
	 * @generated
	 */
	String getPostCondition();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionType#getPostCondition <em>Post Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' attribute.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(String value);

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' attribute.
	 * @see #setPreCondition(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionType_PreCondition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='preCondition'"
	 * @generated
	 */
	String getPreCondition();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionType#getPreCondition <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' attribute.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(String value);

} // BusinessTransactionType
