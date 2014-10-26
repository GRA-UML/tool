/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getProcessSpecification <em>Process Specification</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getRole <em>Role</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getCertificateRef <em>Certificate Ref</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getServiceBinding <em>Service Binding</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationRoleType()
 * @model extendedMetaData="name='CollaborationRole_._type' kind='elementOnly'"
 * @generated
 */
public interface CollaborationRoleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Process Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Specification</em>' containment reference.
	 * @see #setProcessSpecification(ProcessSpecificationType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationRoleType_ProcessSpecification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ProcessSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessSpecificationType getProcessSpecification();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getProcessSpecification <em>Process Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Specification</em>' containment reference.
	 * @see #getProcessSpecification()
	 * @generated
	 */
	void setProcessSpecification(ProcessSpecificationType value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(RoleType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationRoleType_Role()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleType getRole();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleType value);

	/**
	 * Returns the value of the '<em><b>Certificate Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Ref</em>' containment reference.
	 * @see #setCertificateRef(CertificateRefType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationRoleType_CertificateRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CertificateRef' namespace='##targetNamespace'"
	 * @generated
	 */
	CertificateRefType getCertificateRef();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getCertificateRef <em>Certificate Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Ref</em>' containment reference.
	 * @see #getCertificateRef()
	 * @generated
	 */
	void setCertificateRef(CertificateRefType value);

	/**
	 * Returns the value of the '<em><b>Service Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.ServiceBindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Binding</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationRoleType_ServiceBinding()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceBindingType> getServiceBinding();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCollaborationRoleType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // CollaborationRoleType
