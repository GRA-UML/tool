/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.PerformsType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.PerformsType#getInitiatingRole <em>Initiating Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.PerformsType#getInitiatingRoleIDRef <em>Initiating Role ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.PerformsType#getRespondingRole <em>Responding Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.PerformsType#getRespondingRoleIDRef <em>Responding Role ID Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getPerformsType()
 * @model extendedMetaData="name='Performs_._type' kind='elementOnly'"
 * @generated
 */
public interface PerformsType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getPerformsType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Initiating Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiating Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiating Role</em>' attribute.
	 * @see #setInitiatingRole(String)
	 * @see org.ebxml.business.process.ProcessPackage#getPerformsType_InitiatingRole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='initiatingRole'"
	 * @generated
	 */
	String getInitiatingRole();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.PerformsType#getInitiatingRole <em>Initiating Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiating Role</em>' attribute.
	 * @see #getInitiatingRole()
	 * @generated
	 */
	void setInitiatingRole(String value);

	/**
	 * Returns the value of the '<em><b>Initiating Role ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiating Role ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiating Role ID Ref</em>' attribute.
	 * @see #setInitiatingRoleIDRef(String)
	 * @see org.ebxml.business.process.ProcessPackage#getPerformsType_InitiatingRoleIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='initiatingRoleIDRef'"
	 * @generated
	 */
	String getInitiatingRoleIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.PerformsType#getInitiatingRoleIDRef <em>Initiating Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiating Role ID Ref</em>' attribute.
	 * @see #getInitiatingRoleIDRef()
	 * @generated
	 */
	void setInitiatingRoleIDRef(String value);

	/**
	 * Returns the value of the '<em><b>Responding Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responding Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responding Role</em>' attribute.
	 * @see #setRespondingRole(String)
	 * @see org.ebxml.business.process.ProcessPackage#getPerformsType_RespondingRole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='respondingRole'"
	 * @generated
	 */
	String getRespondingRole();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.PerformsType#getRespondingRole <em>Responding Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responding Role</em>' attribute.
	 * @see #getRespondingRole()
	 * @generated
	 */
	void setRespondingRole(String value);

	/**
	 * Returns the value of the '<em><b>Responding Role ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responding Role ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responding Role ID Ref</em>' attribute.
	 * @see #setRespondingRoleIDRef(String)
	 * @see org.ebxml.business.process.ProcessPackage#getPerformsType_RespondingRoleIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='respondingRoleIDRef'"
	 * @generated
	 */
	String getRespondingRoleIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.PerformsType#getRespondingRoleIDRef <em>Responding Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responding Role ID Ref</em>' attribute.
	 * @see #getRespondingRoleIDRef()
	 * @generated
	 */
	void setRespondingRoleIDRef(String value);

} // PerformsType
