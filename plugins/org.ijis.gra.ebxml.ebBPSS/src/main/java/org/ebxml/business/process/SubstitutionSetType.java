/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substitution Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.SubstitutionSetType#getDocumentSubstitution <em>Document Substitution</em>}</li>
 *   <li>{@link org.ebxml.business.process.SubstitutionSetType#getAttributeSubstitution <em>Attribute Substitution</em>}</li>
 *   <li>{@link org.ebxml.business.process.SubstitutionSetType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.SubstitutionSetType#getApplyToScope <em>Apply To Scope</em>}</li>
 *   <li>{@link org.ebxml.business.process.SubstitutionSetType#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.SubstitutionSetType#getNameId <em>Name Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getSubstitutionSetType()
 * @model extendedMetaData="name='SubstitutionSet_._type' kind='elementOnly'"
 * @generated
 */
public interface SubstitutionSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.DocumentSubstitutionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Substitution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Substitution</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getSubstitutionSetType_DocumentSubstitution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DocumentSubstitution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentSubstitutionType> getDocumentSubstitution();

	/**
	 * Returns the value of the '<em><b>Attribute Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.AttributeSubstitutionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Substitution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Substitution</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getSubstitutionSetType_AttributeSubstitution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AttributeSubstitution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeSubstitutionType> getAttributeSubstitution();

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
	 * @see org.ebxml.business.process.ProcessPackage#getSubstitutionSetType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Apply To Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply To Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To Scope</em>' attribute.
	 * @see #setApplyToScope(String)
	 * @see org.ebxml.business.process.ProcessPackage#getSubstitutionSetType_ApplyToScope()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='applyToScope'"
	 * @generated
	 */
	String getApplyToScope();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.SubstitutionSetType#getApplyToScope <em>Apply To Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To Scope</em>' attribute.
	 * @see #getApplyToScope()
	 * @generated
	 */
	void setApplyToScope(String value);

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
	 * @see org.ebxml.business.process.ProcessPackage#getSubstitutionSetType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.SubstitutionSetType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Id</em>' attribute.
	 * @see #setNameId(String)
	 * @see org.ebxml.business.process.ProcessPackage#getSubstitutionSetType_NameId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='nameId'"
	 * @generated
	 */
	String getNameId();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.SubstitutionSetType#getNameId <em>Name Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Id</em>' attribute.
	 * @see #getNameId()
	 * @generated
	 */
	void setNameId(String value);

} // SubstitutionSetType
