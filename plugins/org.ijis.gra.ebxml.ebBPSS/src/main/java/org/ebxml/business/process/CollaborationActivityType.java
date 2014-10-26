/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Activity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.CollaborationActivityType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.CollaborationActivityType#getBinaryCollaboration <em>Binary Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.CollaborationActivityType#getBinaryCollaborationIDRef <em>Binary Collaboration ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.CollaborationActivityType#getFromAuthorizedRole <em>From Authorized Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.CollaborationActivityType#getFromAuthorizedRoleIDRef <em>From Authorized Role ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.CollaborationActivityType#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.CollaborationActivityType#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.CollaborationActivityType#getToAuthorizedRole <em>To Authorized Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.CollaborationActivityType#getToAuthorizedRoleIDRef <em>To Authorized Role ID Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getCollaborationActivityType()
 * @model extendedMetaData="name='CollaborationActivity_._type' kind='elementOnly'"
 * @generated
 */
public interface CollaborationActivityType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getCollaborationActivityType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Binary Collaboration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Collaboration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Collaboration</em>' attribute.
	 * @see #setBinaryCollaboration(String)
	 * @see org.ebxml.business.process.ProcessPackage#getCollaborationActivityType_BinaryCollaboration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='binaryCollaboration'"
	 * @generated
	 */
	String getBinaryCollaboration();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.CollaborationActivityType#getBinaryCollaboration <em>Binary Collaboration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Collaboration</em>' attribute.
	 * @see #getBinaryCollaboration()
	 * @generated
	 */
	void setBinaryCollaboration(String value);

	/**
	 * Returns the value of the '<em><b>Binary Collaboration ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Collaboration ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Collaboration ID Ref</em>' attribute.
	 * @see #setBinaryCollaborationIDRef(String)
	 * @see org.ebxml.business.process.ProcessPackage#getCollaborationActivityType_BinaryCollaborationIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='binaryCollaborationIDRef'"
	 * @generated
	 */
	String getBinaryCollaborationIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.CollaborationActivityType#getBinaryCollaborationIDRef <em>Binary Collaboration ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Collaboration ID Ref</em>' attribute.
	 * @see #getBinaryCollaborationIDRef()
	 * @generated
	 */
	void setBinaryCollaborationIDRef(String value);

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
	 * @see org.ebxml.business.process.ProcessPackage#getCollaborationActivityType_FromAuthorizedRole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='fromAuthorizedRole'"
	 * @generated
	 */
	String getFromAuthorizedRole();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.CollaborationActivityType#getFromAuthorizedRole <em>From Authorized Role</em>}' attribute.
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
	 * @see org.ebxml.business.process.ProcessPackage#getCollaborationActivityType_FromAuthorizedRoleIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='fromAuthorizedRoleIDRef'"
	 * @generated
	 */
	String getFromAuthorizedRoleIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.CollaborationActivityType#getFromAuthorizedRoleIDRef <em>From Authorized Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Authorized Role ID Ref</em>' attribute.
	 * @see #getFromAuthorizedRoleIDRef()
	 * @generated
	 */
	void setFromAuthorizedRoleIDRef(String value);

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
	 * @see org.ebxml.business.process.ProcessPackage#getCollaborationActivityType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.CollaborationActivityType#getName <em>Name</em>}' attribute.
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
	 * @see org.ebxml.business.process.ProcessPackage#getCollaborationActivityType_NameID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='nameID'"
	 * @generated
	 */
	String getNameID();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.CollaborationActivityType#getNameID <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ID</em>' attribute.
	 * @see #getNameID()
	 * @generated
	 */
	void setNameID(String value);

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
	 * @see org.ebxml.business.process.ProcessPackage#getCollaborationActivityType_ToAuthorizedRole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='toAuthorizedRole'"
	 * @generated
	 */
	String getToAuthorizedRole();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.CollaborationActivityType#getToAuthorizedRole <em>To Authorized Role</em>}' attribute.
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
	 * @see org.ebxml.business.process.ProcessPackage#getCollaborationActivityType_ToAuthorizedRoleIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='toAuthorizedRoleIDRef'"
	 * @generated
	 */
	String getToAuthorizedRoleIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.CollaborationActivityType#getToAuthorizedRoleIDRef <em>To Authorized Role ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Authorized Role ID Ref</em>' attribute.
	 * @see #getToAuthorizedRoleIDRef()
	 * @generated
	 */
	void setToAuthorizedRoleIDRef(String value);

} // CollaborationActivityType
