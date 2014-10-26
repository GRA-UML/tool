/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Partner Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.BusinessPartnerRoleType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessPartnerRoleType#getPerforms <em>Performs</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessPartnerRoleType#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessPartnerRoleType#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessPartnerRoleType#getNameID <em>Name ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getBusinessPartnerRoleType()
 * @model extendedMetaData="name='BusinessPartnerRole_._type' kind='elementOnly'"
 * @generated
 */
public interface BusinessPartnerRoleType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessPartnerRoleType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Performs</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.PerformsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessPartnerRoleType_Performs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Performs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PerformsType> getPerforms();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.TransitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessPartnerRoleType_Transition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Transition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TransitionType> getTransition();

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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessPartnerRoleType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessPartnerRoleType#getName <em>Name</em>}' attribute.
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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessPartnerRoleType_NameID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='nameID'"
	 * @generated
	 */
	String getNameID();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessPartnerRoleType#getNameID <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ID</em>' attribute.
	 * @see #getNameID()
	 * @generated
	 */
	void setNameID(String value);

} // BusinessPartnerRoleType
