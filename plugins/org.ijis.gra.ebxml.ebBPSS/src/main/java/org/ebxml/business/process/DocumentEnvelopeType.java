/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.DocumentEnvelopeType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentEnvelopeType#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentEnvelopeType#getBusinessDocument <em>Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentEnvelopeType#getBusinessDocumentIDRef <em>Business Document ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentEnvelopeType#isIsAuthenticated <em>Is Authenticated</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentEnvelopeType#isIsConfidential <em>Is Confidential</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentEnvelopeType#isIsPositiveResponse <em>Is Positive Response</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentEnvelopeType#isIsTamperProof <em>Is Tamper Proof</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getDocumentEnvelopeType()
 * @model extendedMetaData="name='DocumentEnvelope_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentEnvelopeType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentEnvelopeType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.AttachmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentEnvelopeType_Attachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attachment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttachmentType> getAttachment();

	/**
	 * Returns the value of the '<em><b>Business Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Document</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Document</em>' attribute.
	 * @see #setBusinessDocument(String)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentEnvelopeType_BusinessDocument()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='businessDocument'"
	 * @generated
	 */
	String getBusinessDocument();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#getBusinessDocument <em>Business Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Document</em>' attribute.
	 * @see #getBusinessDocument()
	 * @generated
	 */
	void setBusinessDocument(String value);

	/**
	 * Returns the value of the '<em><b>Business Document ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Document ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Document ID Ref</em>' attribute.
	 * @see #setBusinessDocumentIDRef(String)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentEnvelopeType_BusinessDocumentIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='businessDocumentIDRef'"
	 * @generated
	 */
	String getBusinessDocumentIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#getBusinessDocumentIDRef <em>Business Document ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Document ID Ref</em>' attribute.
	 * @see #getBusinessDocumentIDRef()
	 * @generated
	 */
	void setBusinessDocumentIDRef(String value);

	/**
	 * Returns the value of the '<em><b>Is Authenticated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Authenticated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authenticated</em>' attribute.
	 * @see #isSetIsAuthenticated()
	 * @see #unsetIsAuthenticated()
	 * @see #setIsAuthenticated(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentEnvelopeType_IsAuthenticated()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isAuthenticated'"
	 * @generated
	 */
	boolean isIsAuthenticated();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsAuthenticated <em>Is Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authenticated</em>' attribute.
	 * @see #isSetIsAuthenticated()
	 * @see #unsetIsAuthenticated()
	 * @see #isIsAuthenticated()
	 * @generated
	 */
	void setIsAuthenticated(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsAuthenticated <em>Is Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAuthenticated()
	 * @see #isIsAuthenticated()
	 * @see #setIsAuthenticated(boolean)
	 * @generated
	 */
	void unsetIsAuthenticated();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsAuthenticated <em>Is Authenticated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Authenticated</em>' attribute is set.
	 * @see #unsetIsAuthenticated()
	 * @see #isIsAuthenticated()
	 * @see #setIsAuthenticated(boolean)
	 * @generated
	 */
	boolean isSetIsAuthenticated();

	/**
	 * Returns the value of the '<em><b>Is Confidential</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Confidential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Confidential</em>' attribute.
	 * @see #isSetIsConfidential()
	 * @see #unsetIsConfidential()
	 * @see #setIsConfidential(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentEnvelopeType_IsConfidential()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isConfidential'"
	 * @generated
	 */
	boolean isIsConfidential();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsConfidential <em>Is Confidential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Confidential</em>' attribute.
	 * @see #isSetIsConfidential()
	 * @see #unsetIsConfidential()
	 * @see #isIsConfidential()
	 * @generated
	 */
	void setIsConfidential(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsConfidential <em>Is Confidential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConfidential()
	 * @see #isIsConfidential()
	 * @see #setIsConfidential(boolean)
	 * @generated
	 */
	void unsetIsConfidential();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsConfidential <em>Is Confidential</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Confidential</em>' attribute is set.
	 * @see #unsetIsConfidential()
	 * @see #isIsConfidential()
	 * @see #setIsConfidential(boolean)
	 * @generated
	 */
	boolean isSetIsConfidential();

	/**
	 * Returns the value of the '<em><b>Is Positive Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Positive Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Positive Response</em>' attribute.
	 * @see #isSetIsPositiveResponse()
	 * @see #unsetIsPositiveResponse()
	 * @see #setIsPositiveResponse(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentEnvelopeType_IsPositiveResponse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isPositiveResponse'"
	 * @generated
	 */
	boolean isIsPositiveResponse();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsPositiveResponse <em>Is Positive Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Positive Response</em>' attribute.
	 * @see #isSetIsPositiveResponse()
	 * @see #unsetIsPositiveResponse()
	 * @see #isIsPositiveResponse()
	 * @generated
	 */
	void setIsPositiveResponse(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsPositiveResponse <em>Is Positive Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPositiveResponse()
	 * @see #isIsPositiveResponse()
	 * @see #setIsPositiveResponse(boolean)
	 * @generated
	 */
	void unsetIsPositiveResponse();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsPositiveResponse <em>Is Positive Response</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Positive Response</em>' attribute is set.
	 * @see #unsetIsPositiveResponse()
	 * @see #isIsPositiveResponse()
	 * @see #setIsPositiveResponse(boolean)
	 * @generated
	 */
	boolean isSetIsPositiveResponse();

	/**
	 * Returns the value of the '<em><b>Is Tamper Proof</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tamper Proof</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tamper Proof</em>' attribute.
	 * @see #isSetIsTamperProof()
	 * @see #unsetIsTamperProof()
	 * @see #setIsTamperProof(boolean)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentEnvelopeType_IsTamperProof()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isTamperProof'"
	 * @generated
	 */
	boolean isIsTamperProof();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsTamperProof <em>Is Tamper Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tamper Proof</em>' attribute.
	 * @see #isSetIsTamperProof()
	 * @see #unsetIsTamperProof()
	 * @see #isIsTamperProof()
	 * @generated
	 */
	void setIsTamperProof(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsTamperProof <em>Is Tamper Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsTamperProof()
	 * @see #isIsTamperProof()
	 * @see #setIsTamperProof(boolean)
	 * @generated
	 */
	void unsetIsTamperProof();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsTamperProof <em>Is Tamper Proof</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Tamper Proof</em>' attribute is set.
	 * @see #unsetIsTamperProof()
	 * @see #isIsTamperProof()
	 * @see #setIsTamperProof(boolean)
	 * @generated
	 */
	boolean isSetIsTamperProof();

} // DocumentEnvelopeType
