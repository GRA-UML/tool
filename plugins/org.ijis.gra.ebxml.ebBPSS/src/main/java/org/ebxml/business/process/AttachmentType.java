/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.AttachmentType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.AttachmentType#getBusinessDocument <em>Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.AttachmentType#getBusinessDocumentIDRef <em>Business Document ID Ref</em>}</li>
 *   <li>{@link org.ebxml.business.process.AttachmentType#isIsAuthenticated <em>Is Authenticated</em>}</li>
 *   <li>{@link org.ebxml.business.process.AttachmentType#isIsConfidential <em>Is Confidential</em>}</li>
 *   <li>{@link org.ebxml.business.process.AttachmentType#isIsTamperProof <em>Is Tamper Proof</em>}</li>
 *   <li>{@link org.ebxml.business.process.AttachmentType#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.ebxml.business.process.AttachmentType#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.AttachmentType#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.AttachmentType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.ebxml.business.process.AttachmentType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType()
 * @model extendedMetaData="name='Attachment_._type' kind='elementOnly'"
 * @generated
 */
public interface AttachmentType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

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
	 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType_BusinessDocument()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='businessDocument'"
	 * @generated
	 */
	String getBusinessDocument();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.AttachmentType#getBusinessDocument <em>Business Document</em>}' attribute.
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
	 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType_BusinessDocumentIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='businessDocumentIDRef'"
	 * @generated
	 */
	String getBusinessDocumentIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.AttachmentType#getBusinessDocumentIDRef <em>Business Document ID Ref</em>}' attribute.
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
	 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType_IsAuthenticated()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isAuthenticated'"
	 * @generated
	 */
	boolean isIsAuthenticated();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.AttachmentType#isIsAuthenticated <em>Is Authenticated</em>}' attribute.
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
	 * Unsets the value of the '{@link org.ebxml.business.process.AttachmentType#isIsAuthenticated <em>Is Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAuthenticated()
	 * @see #isIsAuthenticated()
	 * @see #setIsAuthenticated(boolean)
	 * @generated
	 */
	void unsetIsAuthenticated();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.AttachmentType#isIsAuthenticated <em>Is Authenticated</em>}' attribute is set.
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
	 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType_IsConfidential()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isConfidential'"
	 * @generated
	 */
	boolean isIsConfidential();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.AttachmentType#isIsConfidential <em>Is Confidential</em>}' attribute.
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
	 * Unsets the value of the '{@link org.ebxml.business.process.AttachmentType#isIsConfidential <em>Is Confidential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConfidential()
	 * @see #isIsConfidential()
	 * @see #setIsConfidential(boolean)
	 * @generated
	 */
	void unsetIsConfidential();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.AttachmentType#isIsConfidential <em>Is Confidential</em>}' attribute is set.
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
	 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType_IsTamperProof()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isTamperProof'"
	 * @generated
	 */
	boolean isIsTamperProof();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.AttachmentType#isIsTamperProof <em>Is Tamper Proof</em>}' attribute.
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
	 * Unsets the value of the '{@link org.ebxml.business.process.AttachmentType#isIsTamperProof <em>Is Tamper Proof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsTamperProof()
	 * @see #isIsTamperProof()
	 * @see #setIsTamperProof(boolean)
	 * @generated
	 */
	void unsetIsTamperProof();

	/**
	 * Returns whether the value of the '{@link org.ebxml.business.process.AttachmentType#isIsTamperProof <em>Is Tamper Proof</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Tamper Proof</em>' attribute is set.
	 * @see #unsetIsTamperProof()
	 * @see #isIsTamperProof()
	 * @see #setIsTamperProof(boolean)
	 * @generated
	 */
	boolean isSetIsTamperProof();

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType_MimeType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='mimeType'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.AttachmentType#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

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
	 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.AttachmentType#getName <em>Name</em>}' attribute.
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
	 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType_NameID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='nameID'"
	 * @generated
	 */
	String getNameID();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.AttachmentType#getNameID <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ID</em>' attribute.
	 * @see #getNameID()
	 * @generated
	 */
	void setNameID(String value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType_Specification()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='specification'"
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.AttachmentType#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.ebxml.business.process.ProcessPackage#getAttachmentType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.AttachmentType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // AttachmentType
