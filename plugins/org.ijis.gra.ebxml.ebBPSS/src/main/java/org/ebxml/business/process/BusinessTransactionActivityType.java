/**
 */
package org.ebxml.business.process;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Transaction Activity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#getBusinessTransactionIDRef <em>Business Transaction ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#getFromAuthorizedRole <em>From Authorized Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#getFromAuthorizedRoleIDRef <em>From Authorized Role ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#isIsConcurrent <em>Is Concurrent</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#isIsLegallyBinding <em>Is Legally Binding</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#getTimeToPerform <em>Time To Perform</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#getToAuthorizedRole <em>To Authorized Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessTransactionActivityType#getToAuthorizedRoleIDRef <em>To Authorized Role ID Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType()
 * @model extendedMetaData="name='BusinessTransactionActivity_._type' kind='elementOnly'"
 * @generated
 */
public interface BusinessTransactionActivityType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Business Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Transaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Transaction</em>' attribute.
	 * @see #setBusinessTransaction(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_BusinessTransaction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='businessTransaction'"
	 * @generated
	 */
	String getBusinessTransaction();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#getBusinessTransaction <em>Business Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Transaction</em>' attribute.
	 * @see #getBusinessTransaction()
	 * @generated
	 */
	void setBusinessTransaction(String value);

	/**
	 * Returns the value of the '<em><b>Business Transaction ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Transaction ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Transaction ID Ref</em>' attribute.
	 * @see #setBusinessTransactionIDRef(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_BusinessTransactionIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='businessTransactionIDRef'"
	 * @generated
	 */
	String getBusinessTransactionIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#getBusinessTransactionIDRef <em>Business Transaction ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Transaction ID Ref</em>' attribute.
	 * @see #getBusinessTransactionIDRef()
	 * @generated
	 */
	void setBusinessTransactionIDRef(String value);

	/**
	 * Returns the value of the '<em><b>From Authorized Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Authorized Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Authorized Role</em>' attribute.
	 * @see #setFromAuthorizedRole(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_FromAuthorizedRole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='fromAuthorizedRole'"
	 * @generated
	 */
	String getFromAuthorizedRole();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#getFromAuthorizedRole <em>From Authorized Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Authorized Role</em>' attribute.
	 * @see #getFromAuthorizedRole()
	 * @generated
	 */
	void setFromAuthorizedRole(String value);

	/**
	 * Returns the value of the '<em><b>From Authorized Role ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Authorized Role ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Authorized Role ID Ref</em>' attribute.
	 * @see #setFromAuthorizedRoleIDRef(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_FromAuthorizedRoleIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='fromAuthorizedRoleIDRef'"
	 * @generated
	 */
	String getFromAuthorizedRoleIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#getFromAuthorizedRoleIDRef <em>From Authorized Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Authorized Role ID Ref</em>' attribute.
	 * @see #getFromAuthorizedRoleIDRef()
	 * @generated
	 */
	void setFromAuthorizedRoleIDRef(String value);

	/**
	 * Returns the value of the '<em><b>Is Concurrent</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Concurrent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Concurrent</em>' attribute.
	 * @see #isSetIsConcurrent()
	 * @see #unsetIsConcurrent()
	 * @see #setIsConcurrent(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_IsConcurrent()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isConcurrent'"
	 * @generated
	 */
	boolean isIsConcurrent();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#isIsConcurrent <em>Is Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Concurrent</em>' attribute.
	 * @see #isSetIsConcurrent()
	 * @see #unsetIsConcurrent()
	 * @see #isIsConcurrent()
	 * @generated
	 */
	void setIsConcurrent(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#isIsConcurrent <em>Is Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConcurrent()
	 * @see #isIsConcurrent()
	 * @see #setIsConcurrent(boolean)
	 * @generated
	 */
	void unsetIsConcurrent();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#isIsConcurrent <em>Is Concurrent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Concurrent</em>' attribute is set.
	 * @see #unsetIsConcurrent()
	 * @see #isIsConcurrent()
	 * @see #setIsConcurrent(boolean)
	 * @generated
	 */
	boolean isSetIsConcurrent();

	/**
	 * Returns the value of the '<em><b>Is Legally Binding</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Legally Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Legally Binding</em>' attribute.
	 * @see #isSetIsLegallyBinding()
	 * @see #unsetIsLegallyBinding()
	 * @see #setIsLegallyBinding(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_IsLegallyBinding()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isLegallyBinding'"
	 * @generated
	 */
	boolean isIsLegallyBinding();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#isIsLegallyBinding <em>Is Legally Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Legally Binding</em>' attribute.
	 * @see #isSetIsLegallyBinding()
	 * @see #unsetIsLegallyBinding()
	 * @see #isIsLegallyBinding()
	 * @generated
	 */
	void setIsLegallyBinding(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#isIsLegallyBinding <em>Is Legally Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLegallyBinding()
	 * @see #isIsLegallyBinding()
	 * @see #setIsLegallyBinding(boolean)
	 * @generated
	 */
	void unsetIsLegallyBinding();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#isIsLegallyBinding <em>Is Legally Binding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Legally Binding</em>' attribute is set.
	 * @see #unsetIsLegallyBinding()
	 * @see #isIsLegallyBinding()
	 * @see #setIsLegallyBinding(boolean)
	 * @generated
	 */
	boolean isSetIsLegallyBinding();

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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#getName <em>Name</em>}' attribute.
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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_NameID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='nameID'"
	 * @generated
	 */
	String getNameID();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#getNameID <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ID</em>' attribute.
	 * @see #getNameID()
	 * @generated
	 */
	void setNameID(String value);

	/**
	 * Returns the value of the '<em><b>Time To Perform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time To Perform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Perform</em>' attribute.
	 * @see #setTimeToPerform(Duration)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_TimeToPerform()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='timeToPerform'"
	 * @generated
	 */
	Duration getTimeToPerform();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#getTimeToPerform <em>Time To Perform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Perform</em>' attribute.
	 * @see #getTimeToPerform()
	 * @generated
	 */
	void setTimeToPerform(Duration value);

	/**
	 * Returns the value of the '<em><b>To Authorized Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Authorized Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Authorized Role</em>' attribute.
	 * @see #setToAuthorizedRole(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_ToAuthorizedRole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='toAuthorizedRole'"
	 * @generated
	 */
	String getToAuthorizedRole();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#getToAuthorizedRole <em>To Authorized Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Authorized Role</em>' attribute.
	 * @see #getToAuthorizedRole()
	 * @generated
	 */
	void setToAuthorizedRole(String value);

	/**
	 * Returns the value of the '<em><b>To Authorized Role ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Authorized Role ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Authorized Role ID Ref</em>' attribute.
	 * @see #setToAuthorizedRoleIDRef(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessTransactionActivityType_ToAuthorizedRoleIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='toAuthorizedRoleIDRef'"
	 * @generated
	 */
	String getToAuthorizedRoleIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessTransactionActivityType#getToAuthorizedRoleIDRef <em>To Authorized Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Authorized Role ID Ref</em>' attribute.
	 * @see #getToAuthorizedRoleIDRef()
	 * @generated
	 */
	void setToAuthorizedRoleIDRef(String value);

} // BusinessTransactionActivityType
