/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getAttributeSubstitution <em>Attribute Substitution</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getBinaryCollaboration <em>Binary Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getBusinessDocument <em>Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getBusinessPartnerRole <em>Business Partner Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getBusinessTransactionActivity <em>Business Transaction Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getCollaborationActivity <em>Collaboration Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getDocumentEnvelope <em>Document Envelope</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getDocumentSubstitution <em>Document Substitution</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getFailure <em>Failure</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getFork <em>Fork</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getInclude <em>Include</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getInitiatingRole <em>Initiating Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getJoin <em>Join</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getMultiPartyCollaboration <em>Multi Party Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getPackage <em>Package</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getPerforms <em>Performs</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getProcessSpecification <em>Process Specification</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getRequestingBusinessActivity <em>Requesting Business Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getRespondingBusinessActivity <em>Responding Business Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getRespondingRole <em>Responding Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getStart <em>Start</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getSubstitutionSet <em>Substitution Set</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getSuccess <em>Success</em>}</li>
 *   <li>{@link org.ebxml.business.process.DocumentRoot#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference.
	 * @see #setAttachment(AttachmentType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Attachment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Attachment' namespace='##targetNamespace'"
	 * @generated
	 */
	AttachmentType getAttachment();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getAttachment <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' containment reference.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(AttachmentType value);

	/**
	 * Returns the value of the '<em><b>Attribute Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Substitution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Substitution</em>' containment reference.
	 * @see #setAttributeSubstitution(AttributeSubstitutionType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_AttributeSubstitution()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AttributeSubstitution' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeSubstitutionType getAttributeSubstitution();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getAttributeSubstitution <em>Attribute Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Substitution</em>' containment reference.
	 * @see #getAttributeSubstitution()
	 * @generated
	 */
	void setAttributeSubstitution(AttributeSubstitutionType value);

	/**
	 * Returns the value of the '<em><b>Binary Collaboration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Collaboration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Collaboration</em>' containment reference.
	 * @see #setBinaryCollaboration(BinaryCollaborationType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_BinaryCollaboration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinaryCollaboration' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryCollaborationType getBinaryCollaboration();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getBinaryCollaboration <em>Binary Collaboration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Collaboration</em>' containment reference.
	 * @see #getBinaryCollaboration()
	 * @generated
	 */
	void setBinaryCollaboration(BinaryCollaborationType value);

	/**
	 * Returns the value of the '<em><b>Business Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Document</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Document</em>' containment reference.
	 * @see #setBusinessDocument(BusinessDocumentType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_BusinessDocument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	BusinessDocumentType getBusinessDocument();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getBusinessDocument <em>Business Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Document</em>' containment reference.
	 * @see #getBusinessDocument()
	 * @generated
	 */
	void setBusinessDocument(BusinessDocumentType value);

	/**
	 * Returns the value of the '<em><b>Business Partner Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Partner Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Partner Role</em>' containment reference.
	 * @see #setBusinessPartnerRole(BusinessPartnerRoleType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_BusinessPartnerRole()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessPartnerRole' namespace='##targetNamespace'"
	 * @generated
	 */
	BusinessPartnerRoleType getBusinessPartnerRole();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getBusinessPartnerRole <em>Business Partner Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Partner Role</em>' containment reference.
	 * @see #getBusinessPartnerRole()
	 * @generated
	 */
	void setBusinessPartnerRole(BusinessPartnerRoleType value);

	/**
	 * Returns the value of the '<em><b>Business Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Transaction</em>' containment reference.
	 * @see #setBusinessTransaction(BusinessTransactionType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_BusinessTransaction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessTransaction' namespace='##targetNamespace'"
	 * @generated
	 */
	BusinessTransactionType getBusinessTransaction();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getBusinessTransaction <em>Business Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Transaction</em>' containment reference.
	 * @see #getBusinessTransaction()
	 * @generated
	 */
	void setBusinessTransaction(BusinessTransactionType value);

	/**
	 * Returns the value of the '<em><b>Business Transaction Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Transaction Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Transaction Activity</em>' containment reference.
	 * @see #setBusinessTransactionActivity(BusinessTransactionActivityType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_BusinessTransactionActivity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessTransactionActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	BusinessTransactionActivityType getBusinessTransactionActivity();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getBusinessTransactionActivity <em>Business Transaction Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Transaction Activity</em>' containment reference.
	 * @see #getBusinessTransactionActivity()
	 * @generated
	 */
	void setBusinessTransactionActivity(BusinessTransactionActivityType value);

	/**
	 * Returns the value of the '<em><b>Collaboration Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration Activity</em>' containment reference.
	 * @see #setCollaborationActivity(CollaborationActivityType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_CollaborationActivity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CollaborationActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	CollaborationActivityType getCollaborationActivity();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getCollaborationActivity <em>Collaboration Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaboration Activity</em>' containment reference.
	 * @see #getCollaborationActivity()
	 * @generated
	 */
	void setCollaborationActivity(CollaborationActivityType value);

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
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_ConditionExpression()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConditionExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionExpressionType getConditionExpression();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getConditionExpression <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' containment reference.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(ConditionExpressionType value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(DocumentationType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Documentation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentationType getDocumentation();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(DocumentationType value);

	/**
	 * Returns the value of the '<em><b>Document Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Envelope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Envelope</em>' containment reference.
	 * @see #setDocumentEnvelope(DocumentEnvelopeType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_DocumentEnvelope()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentEnvelope' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentEnvelopeType getDocumentEnvelope();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getDocumentEnvelope <em>Document Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Envelope</em>' containment reference.
	 * @see #getDocumentEnvelope()
	 * @generated
	 */
	void setDocumentEnvelope(DocumentEnvelopeType value);

	/**
	 * Returns the value of the '<em><b>Document Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Substitution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Substitution</em>' containment reference.
	 * @see #setDocumentSubstitution(DocumentSubstitutionType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_DocumentSubstitution()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentSubstitution' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentSubstitutionType getDocumentSubstitution();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getDocumentSubstitution <em>Document Substitution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Substitution</em>' containment reference.
	 * @see #getDocumentSubstitution()
	 * @generated
	 */
	void setDocumentSubstitution(DocumentSubstitutionType value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' containment reference.
	 * @see #setFailure(FailureType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Failure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Failure' namespace='##targetNamespace'"
	 * @generated
	 */
	FailureType getFailure();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getFailure <em>Failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' containment reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(FailureType value);

	/**
	 * Returns the value of the '<em><b>Fork</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork</em>' containment reference.
	 * @see #setFork(ForkType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Fork()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Fork' namespace='##targetNamespace'"
	 * @generated
	 */
	ForkType getFork();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getFork <em>Fork</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork</em>' containment reference.
	 * @see #getFork()
	 * @generated
	 */
	void setFork(ForkType value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference.
	 * @see #setInclude(IncludeType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Include()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Include' namespace='##targetNamespace'"
	 * @generated
	 */
	IncludeType getInclude();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getInclude <em>Include</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' containment reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(IncludeType value);

	/**
	 * Returns the value of the '<em><b>Initiating Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiating Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiating Role</em>' containment reference.
	 * @see #setInitiatingRole(InitiatingRoleType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_InitiatingRole()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InitiatingRole' namespace='##targetNamespace'"
	 * @generated
	 */
	InitiatingRoleType getInitiatingRole();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getInitiatingRole <em>Initiating Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiating Role</em>' containment reference.
	 * @see #getInitiatingRole()
	 * @generated
	 */
	void setInitiatingRole(InitiatingRoleType value);

	/**
	 * Returns the value of the '<em><b>Join</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' containment reference.
	 * @see #setJoin(JoinType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Join()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Join' namespace='##targetNamespace'"
	 * @generated
	 */
	JoinType getJoin();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getJoin <em>Join</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' containment reference.
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(JoinType value);

	/**
	 * Returns the value of the '<em><b>Multi Party Collaboration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Party Collaboration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Party Collaboration</em>' containment reference.
	 * @see #setMultiPartyCollaboration(MultiPartyCollaborationType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_MultiPartyCollaboration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiPartyCollaboration' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiPartyCollaborationType getMultiPartyCollaboration();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getMultiPartyCollaboration <em>Multi Party Collaboration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Party Collaboration</em>' containment reference.
	 * @see #getMultiPartyCollaboration()
	 * @generated
	 */
	void setMultiPartyCollaboration(MultiPartyCollaborationType value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(PackageType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Package()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Package' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageType getPackage();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(PackageType value);

	/**
	 * Returns the value of the '<em><b>Performs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs</em>' containment reference.
	 * @see #setPerforms(PerformsType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Performs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Performs' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformsType getPerforms();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getPerforms <em>Performs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performs</em>' containment reference.
	 * @see #getPerforms()
	 * @generated
	 */
	void setPerforms(PerformsType value);

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
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_ProcessSpecification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProcessSpecification' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessSpecificationType getProcessSpecification();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getProcessSpecification <em>Process Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Specification</em>' containment reference.
	 * @see #getProcessSpecification()
	 * @generated
	 */
	void setProcessSpecification(ProcessSpecificationType value);

	/**
	 * Returns the value of the '<em><b>Requesting Business Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requesting Business Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requesting Business Activity</em>' containment reference.
	 * @see #setRequestingBusinessActivity(RequestingBusinessActivityType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_RequestingBusinessActivity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RequestingBusinessActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestingBusinessActivityType getRequestingBusinessActivity();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getRequestingBusinessActivity <em>Requesting Business Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requesting Business Activity</em>' containment reference.
	 * @see #getRequestingBusinessActivity()
	 * @generated
	 */
	void setRequestingBusinessActivity(RequestingBusinessActivityType value);

	/**
	 * Returns the value of the '<em><b>Responding Business Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responding Business Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responding Business Activity</em>' containment reference.
	 * @see #setRespondingBusinessActivity(RespondingBusinessActivityType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_RespondingBusinessActivity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RespondingBusinessActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	RespondingBusinessActivityType getRespondingBusinessActivity();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getRespondingBusinessActivity <em>Responding Business Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responding Business Activity</em>' containment reference.
	 * @see #getRespondingBusinessActivity()
	 * @generated
	 */
	void setRespondingBusinessActivity(RespondingBusinessActivityType value);

	/**
	 * Returns the value of the '<em><b>Responding Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responding Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responding Role</em>' containment reference.
	 * @see #setRespondingRole(RespondingRoleType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_RespondingRole()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RespondingRole' namespace='##targetNamespace'"
	 * @generated
	 */
	RespondingRoleType getRespondingRole();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getRespondingRole <em>Responding Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responding Role</em>' containment reference.
	 * @see #getRespondingRole()
	 * @generated
	 */
	void setRespondingRole(RespondingRoleType value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(StartType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Start()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Start' namespace='##targetNamespace'"
	 * @generated
	 */
	StartType getStart();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(StartType value);

	/**
	 * Returns the value of the '<em><b>Substitution Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution Set</em>' containment reference.
	 * @see #setSubstitutionSet(SubstitutionSetType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_SubstitutionSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubstitutionSet' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstitutionSetType getSubstitutionSet();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getSubstitutionSet <em>Substitution Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution Set</em>' containment reference.
	 * @see #getSubstitutionSet()
	 * @generated
	 */
	void setSubstitutionSet(SubstitutionSetType value);

	/**
	 * Returns the value of the '<em><b>Success</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success</em>' containment reference.
	 * @see #setSuccess(SuccessType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Success()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Success' namespace='##targetNamespace'"
	 * @generated
	 */
	SuccessType getSuccess();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getSuccess <em>Success</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success</em>' containment reference.
	 * @see #getSuccess()
	 * @generated
	 */
	void setSuccess(SuccessType value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference.
	 * @see #setTransition(TransitionType)
	 * @see org.ebxml.business.process.ProcessPackage#getDocumentRoot_Transition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Transition' namespace='##targetNamespace'"
	 * @generated
	 */
	TransitionType getTransition();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.DocumentRoot#getTransition <em>Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' containment reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(TransitionType value);

} // DocumentRoot
