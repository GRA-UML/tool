/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.FailureType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.FailureType#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.ebxml.business.process.FailureType#getConditionGuard <em>Condition Guard</em>}</li>
 *   <li>{@link org.ebxml.business.process.FailureType#getFromBusinessState <em>From Business State</em>}</li>
 *   <li>{@link org.ebxml.business.process.FailureType#getFromBusinessStateIDRef <em>From Business State ID Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getFailureType()
 * @model extendedMetaData="name='Failure_._type' kind='elementOnly'"
 * @generated
 */
public interface FailureType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getFailureType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expression</em>' containment reference.
	 * @see #setConditionExpression(ConditionExpressionType)
	 * @see org.ebxml.business.process.ProcessPackage#getFailureType_ConditionExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionExpressionType getConditionExpression();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.FailureType#getConditionExpression <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' containment reference.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(ConditionExpressionType value);

	/**
	 * Returns the value of the '<em><b>Condition Guard</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ebxml.business.process.ConditionGuardType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Guard</em>' attribute.
	 * @see org.ebxml.business.process.ConditionGuardType1
	 * @see #isSetConditionGuard()
	 * @see #unsetConditionGuard()
	 * @see #setConditionGuard(ConditionGuardType1)
	 * @see org.ebxml.business.process.ProcessPackage#getFailureType_ConditionGuard()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='conditionGuard'"
	 * @generated
	 */
	ConditionGuardType1 getConditionGuard();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.FailureType#getConditionGuard <em>Condition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Guard</em>' attribute.
	 * @see org.ebxml.business.process.ConditionGuardType1
	 * @see #isSetConditionGuard()
	 * @see #unsetConditionGuard()
	 * @see #getConditionGuard()
	 * @generated
	 */
	void setConditionGuard(ConditionGuardType1 value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.FailureType#getConditionGuard <em>Condition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionGuard()
	 * @see #getConditionGuard()
	 * @see #setConditionGuard(ConditionGuardType1)
	 * @generated
	 */
	void unsetConditionGuard();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.FailureType#getConditionGuard <em>Condition Guard</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition Guard</em>' attribute is set.
	 * @see #unsetConditionGuard()
	 * @see #getConditionGuard()
	 * @see #setConditionGuard(ConditionGuardType1)
	 * @generated
	 */
	boolean isSetConditionGuard();

	/**
	 * Returns the value of the '<em><b>From Business State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Business State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Business State</em>' attribute.
	 * @see #setFromBusinessState(String)
	 * @see org.ebxml.business.process.ProcessPackage#getFailureType_FromBusinessState()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='fromBusinessState'"
	 * @generated
	 */
	String getFromBusinessState();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.FailureType#getFromBusinessState <em>From Business State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Business State</em>' attribute.
	 * @see #getFromBusinessState()
	 * @generated
	 */
	void setFromBusinessState(String value);

	/**
	 * Returns the value of the '<em><b>From Business State ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Business State ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Business State ID Ref</em>' attribute.
	 * @see #setFromBusinessStateIDRef(String)
	 * @see org.ebxml.business.process.ProcessPackage#getFailureType_FromBusinessStateIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='fromBusinessStateIDRef'"
	 * @generated
	 */
	String getFromBusinessStateIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.FailureType#getFromBusinessStateIDRef <em>From Business State ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Business State ID Ref</em>' attribute.
	 * @see #getFromBusinessStateIDRef()
	 * @generated
	 */
	void setFromBusinessStateIDRef(String value);

} // FailureType
