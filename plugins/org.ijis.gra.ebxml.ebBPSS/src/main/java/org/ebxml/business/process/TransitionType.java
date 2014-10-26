/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.TransitionType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.TransitionType#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.ebxml.business.process.TransitionType#getConditionGuard <em>Condition Guard</em>}</li>
 *   <li>{@link org.ebxml.business.process.TransitionType#getFromBusinessState <em>From Business State</em>}</li>
 *   <li>{@link org.ebxml.business.process.TransitionType#getFromBusinessStateIDRef <em>From Business State ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.TransitionType#isOnInitiation <em>On Initiation</em>}</li>
 *   <li>{@link org.ebxml.business.process.TransitionType#getToBusinessState <em>To Business State</em>}</li>
 *   <li>{@link org.ebxml.business.process.TransitionType#getToBusinessStateIDRef <em>To Business State ID Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getTransitionType()
 * @model extendedMetaData="name='Transition_._type' kind='elementOnly'"
 * @generated
 */
public interface TransitionType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getTransitionType_Documentation()
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
	 * @see org.ebxml.business.process.ProcessPackage#getTransitionType_ConditionExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionExpressionType getConditionExpression();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.TransitionType#getConditionExpression <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' containment reference.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(ConditionExpressionType value);

	/**
	 * Returns the value of the '<em><b>Condition Guard</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ebxml.business.process.ConditionGuardType2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Guard</em>' attribute.
	 * @see org.ebxml.business.process.ConditionGuardType2
	 * @see #isSetConditionGuard()
	 * @see #unsetConditionGuard()
	 * @see #setConditionGuard(ConditionGuardType2)
	 * @see org.ebxml.business.process.ProcessPackage#getTransitionType_ConditionGuard()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='conditionGuard'"
	 * @generated
	 */
	ConditionGuardType2 getConditionGuard();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.TransitionType#getConditionGuard <em>Condition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Guard</em>' attribute.
	 * @see org.ebxml.business.process.ConditionGuardType2
	 * @see #isSetConditionGuard()
	 * @see #unsetConditionGuard()
	 * @see #getConditionGuard()
	 * @generated
	 */
	void setConditionGuard(ConditionGuardType2 value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.TransitionType#getConditionGuard <em>Condition Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionGuard()
	 * @see #getConditionGuard()
	 * @see #setConditionGuard(ConditionGuardType2)
	 * @generated
	 */
	void unsetConditionGuard();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.TransitionType#getConditionGuard <em>Condition Guard</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition Guard</em>' attribute is set.
	 * @see #unsetConditionGuard()
	 * @see #getConditionGuard()
	 * @see #setConditionGuard(ConditionGuardType2)
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
	 * @see org.ebxml.business.process.ProcessPackage#getTransitionType_FromBusinessState()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='fromBusinessState'"
	 * @generated
	 */
	String getFromBusinessState();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.TransitionType#getFromBusinessState <em>From Business State</em>}' attribute.
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
	 * @see org.ebxml.business.process.ProcessPackage#getTransitionType_FromBusinessStateIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='fromBusinessStateIDRef'"
	 * @generated
	 */
	String getFromBusinessStateIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.TransitionType#getFromBusinessStateIDRef <em>From Business State ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Business State ID Ref</em>' attribute.
	 * @see #getFromBusinessStateIDRef()
	 * @generated
	 */
	void setFromBusinessStateIDRef(String value);

	/**
	 * Returns the value of the '<em><b>On Initiation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Initiation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Initiation</em>' attribute.
	 * @see #isSetOnInitiation()
	 * @see #unsetOnInitiation()
	 * @see #setOnInitiation(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getTransitionType_OnInitiation()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='onInitiation'"
	 * @generated
	 */
	boolean isOnInitiation();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.TransitionType#isOnInitiation <em>On Initiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Initiation</em>' attribute.
	 * @see #isSetOnInitiation()
	 * @see #unsetOnInitiation()
	 * @see #isOnInitiation()
	 * @generated
	 */
	void setOnInitiation(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.TransitionType#isOnInitiation <em>On Initiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnInitiation()
	 * @see #isOnInitiation()
	 * @see #setOnInitiation(boolean)
	 * @generated
	 */
	void unsetOnInitiation();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.TransitionType#isOnInitiation <em>On Initiation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Initiation</em>' attribute is set.
	 * @see #unsetOnInitiation()
	 * @see #isOnInitiation()
	 * @see #setOnInitiation(boolean)
	 * @generated
	 */
	boolean isSetOnInitiation();

	/**
	 * Returns the value of the '<em><b>To Business State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Business State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Business State</em>' attribute.
	 * @see #setToBusinessState(String)
	 * @see org.ebxml.business.process.ProcessPackage#getTransitionType_ToBusinessState()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='toBusinessState'"
	 * @generated
	 */
	String getToBusinessState();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.TransitionType#getToBusinessState <em>To Business State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Business State</em>' attribute.
	 * @see #getToBusinessState()
	 * @generated
	 */
	void setToBusinessState(String value);

	/**
	 * Returns the value of the '<em><b>To Business State ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Business State ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Business State ID Ref</em>' attribute.
	 * @see #setToBusinessStateIDRef(String)
	 * @see org.ebxml.business.process.ProcessPackage#getTransitionType_ToBusinessStateIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='toBusinessStateIDRef'"
	 * @generated
	 */
	String getToBusinessStateIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.TransitionType#getToBusinessStateIDRef <em>To Business State ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Business State ID Ref</em>' attribute.
	 * @see #getToBusinessStateIDRef()
	 * @generated
	 */
	void setToBusinessStateIDRef(String value);

} // TransitionType
