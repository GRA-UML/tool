/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Substitution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.DocumentSubstitutionType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentSubstitutionType#getOriginalBusinessDocument <em>Original Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentSubstitutionType#getOriginalBusinessDocumentID <em>Original Business Document ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentSubstitutionType#getSubstituteBusinessDocument <em>Substitute Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentSubstitutionType#getSubstituteBusinessDocumentId <em>Substitute Business Document Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getDocumentSubstitutionType()
 * @model extendedMetaData="name='DocumentSubstitution_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentSubstitutionType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentSubstitutionType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Original Business Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Business Document</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Business Document</em>' attribute.
	 * @see #setOriginalBusinessDocument(String)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentSubstitutionType_OriginalBusinessDocument()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='originalBusinessDocument'"
	 * @generated
	 */
	String getOriginalBusinessDocument();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentSubstitutionType#getOriginalBusinessDocument <em>Original Business Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Business Document</em>' attribute.
	 * @see #getOriginalBusinessDocument()
	 * @generated
	 */
	void setOriginalBusinessDocument(String value);

	/**
	 * Returns the value of the '<em><b>Original Business Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Business Document ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Business Document ID</em>' attribute.
	 * @see #setOriginalBusinessDocumentID(String)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentSubstitutionType_OriginalBusinessDocumentID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='originalBusinessDocumentID'"
	 * @generated
	 */
	String getOriginalBusinessDocumentID();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentSubstitutionType#getOriginalBusinessDocumentID <em>Original Business Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Business Document ID</em>' attribute.
	 * @see #getOriginalBusinessDocumentID()
	 * @generated
	 */
	void setOriginalBusinessDocumentID(String value);

	/**
	 * Returns the value of the '<em><b>Substitute Business Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitute Business Document</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitute Business Document</em>' attribute.
	 * @see #setSubstituteBusinessDocument(String)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentSubstitutionType_SubstituteBusinessDocument()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='substituteBusinessDocument'"
	 * @generated
	 */
	String getSubstituteBusinessDocument();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentSubstitutionType#getSubstituteBusinessDocument <em>Substitute Business Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitute Business Document</em>' attribute.
	 * @see #getSubstituteBusinessDocument()
	 * @generated
	 */
	void setSubstituteBusinessDocument(String value);

	/**
	 * Returns the value of the '<em><b>Substitute Business Document Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitute Business Document Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitute Business Document Id</em>' attribute.
	 * @see #setSubstituteBusinessDocumentId(String)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentSubstitutionType_SubstituteBusinessDocumentId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='substituteBusinessDocumentId'"
	 * @generated
	 */
	String getSubstituteBusinessDocumentId();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentSubstitutionType#getSubstituteBusinessDocumentId <em>Substitute Business Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitute Business Document Id</em>' attribute.
	 * @see #getSubstituteBusinessDocumentId()
	 * @generated
	 */
	void setSubstituteBusinessDocumentId(String value);

} // DocumentSubstitutionType
