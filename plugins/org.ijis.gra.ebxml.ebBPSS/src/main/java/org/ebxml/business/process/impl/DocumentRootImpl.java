/**
 */
package org.ebxml.business.process.impl;

import org.ebxml.business.process.AttachmentType;
import org.ebxml.business.process.AttributeSubstitutionType;
import org.ebxml.business.process.BinaryCollaborationType;
import org.ebxml.business.process.BusinessDocumentType;
import org.ebxml.business.process.BusinessPartnerRoleType;
import org.ebxml.business.process.BusinessTransactionActivityType;
import org.ebxml.business.process.BusinessTransactionType;
import org.ebxml.business.process.CollaborationActivityType;
import org.ebxml.business.process.ConditionExpressionType;
import org.ebxml.business.process.DocumentEnvelopeType;
import org.ebxml.business.process.DocumentRoot;
import org.ebxml.business.process.DocumentSubstitutionType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.FailureType;
import org.ebxml.business.process.ForkType;
import org.ebxml.business.process.IncludeType;
import org.ebxml.business.process.InitiatingRoleType;
import org.ebxml.business.process.JoinType;
import org.ebxml.business.process.MultiPartyCollaborationType;
import org.ebxml.business.process.PackageType;
import org.ebxml.business.process.PerformsType;
import org.ebxml.business.process.ProcessPackage;
import org.ebxml.business.process.ProcessSpecificationType;
import org.ebxml.business.process.RequestingBusinessActivityType;
import org.ebxml.business.process.RespondingBusinessActivityType;
import org.ebxml.business.process.RespondingRoleType;
import org.ebxml.business.process.StartType;
import org.ebxml.business.process.SubstitutionSetType;
import org.ebxml.business.process.SuccessType;
import org.ebxml.business.process.TransitionType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getAttributeSubstitution <em>Attribute Substitution</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getBinaryCollaboration <em>Binary Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getBusinessDocument <em>Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getBusinessPartnerRole <em>Business Partner Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getBusinessTransactionActivity <em>Business Transaction Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getCollaborationActivity <em>Collaboration Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getDocumentEnvelope <em>Document Envelope</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getDocumentSubstitution <em>Document Substitution</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getFork <em>Fork</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getInitiatingRole <em>Initiating Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getMultiPartyCollaboration <em>Multi Party Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getPerforms <em>Performs</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getProcessSpecification <em>Process Specification</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getRequestingBusinessActivity <em>Requesting Business Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getRespondingBusinessActivity <em>Responding Business Activity</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getRespondingRole <em>Responding Role</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getSubstitutionSet <em>Substitution Set</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getSuccess <em>Success</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.DocumentRootImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ProcessPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentType getAttachment() {
		return (AttachmentType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__ATTACHMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment(AttachmentType newAttachment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__ATTACHMENT, newAttachment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment(AttachmentType newAttachment) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__ATTACHMENT, newAttachment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSubstitutionType getAttributeSubstitution() {
		return (AttributeSubstitutionType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE_SUBSTITUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeSubstitution(AttributeSubstitutionType newAttributeSubstitution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE_SUBSTITUTION, newAttributeSubstitution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeSubstitution(AttributeSubstitutionType newAttributeSubstitution) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE_SUBSTITUTION, newAttributeSubstitution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryCollaborationType getBinaryCollaboration() {
		return (BinaryCollaborationType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__BINARY_COLLABORATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryCollaboration(BinaryCollaborationType newBinaryCollaboration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__BINARY_COLLABORATION, newBinaryCollaboration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryCollaboration(BinaryCollaborationType newBinaryCollaboration) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__BINARY_COLLABORATION, newBinaryCollaboration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessDocumentType getBusinessDocument() {
		return (BusinessDocumentType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessDocument(BusinessDocumentType newBusinessDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_DOCUMENT, newBusinessDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessDocument(BusinessDocumentType newBusinessDocument) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_DOCUMENT, newBusinessDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessPartnerRoleType getBusinessPartnerRole() {
		return (BusinessPartnerRoleType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_PARTNER_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessPartnerRole(BusinessPartnerRoleType newBusinessPartnerRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_PARTNER_ROLE, newBusinessPartnerRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessPartnerRole(BusinessPartnerRoleType newBusinessPartnerRole) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_PARTNER_ROLE, newBusinessPartnerRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessTransactionType getBusinessTransaction() {
		return (BusinessTransactionType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_TRANSACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessTransaction(BusinessTransactionType newBusinessTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_TRANSACTION, newBusinessTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessTransaction(BusinessTransactionType newBusinessTransaction) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_TRANSACTION, newBusinessTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessTransactionActivityType getBusinessTransactionActivity() {
		return (BusinessTransactionActivityType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_TRANSACTION_ACTIVITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessTransactionActivity(BusinessTransactionActivityType newBusinessTransactionActivity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_TRANSACTION_ACTIVITY, newBusinessTransactionActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessTransactionActivity(BusinessTransactionActivityType newBusinessTransactionActivity) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__BUSINESS_TRANSACTION_ACTIVITY, newBusinessTransactionActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationActivityType getCollaborationActivity() {
		return (CollaborationActivityType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__COLLABORATION_ACTIVITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollaborationActivity(CollaborationActivityType newCollaborationActivity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__COLLABORATION_ACTIVITY, newCollaborationActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollaborationActivity(CollaborationActivityType newCollaborationActivity) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__COLLABORATION_ACTIVITY, newCollaborationActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpressionType getConditionExpression() {
		return (ConditionExpressionType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__CONDITION_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionExpression(ConditionExpressionType newConditionExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__CONDITION_EXPRESSION, newConditionExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionExpression(ConditionExpressionType newConditionExpression) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__CONDITION_EXPRESSION, newConditionExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationType getDocumentation() {
		return (DocumentationType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(DocumentationType newDocumentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(DocumentationType newDocumentation) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentEnvelopeType getDocumentEnvelope() {
		return (DocumentEnvelopeType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__DOCUMENT_ENVELOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentEnvelope(DocumentEnvelopeType newDocumentEnvelope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__DOCUMENT_ENVELOPE, newDocumentEnvelope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentEnvelope(DocumentEnvelopeType newDocumentEnvelope) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__DOCUMENT_ENVELOPE, newDocumentEnvelope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentSubstitutionType getDocumentSubstitution() {
		return (DocumentSubstitutionType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__DOCUMENT_SUBSTITUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentSubstitution(DocumentSubstitutionType newDocumentSubstitution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__DOCUMENT_SUBSTITUTION, newDocumentSubstitution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentSubstitution(DocumentSubstitutionType newDocumentSubstitution) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__DOCUMENT_SUBSTITUTION, newDocumentSubstitution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureType getFailure() {
		return (FailureType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__FAILURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailure(FailureType newFailure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__FAILURE, newFailure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailure(FailureType newFailure) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__FAILURE, newFailure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkType getFork() {
		return (ForkType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__FORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFork(ForkType newFork, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__FORK, newFork, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFork(ForkType newFork) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__FORK, newFork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType getInclude() {
		return (IncludeType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__INCLUDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclude(IncludeType newInclude, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__INCLUDE, newInclude, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(IncludeType newInclude) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__INCLUDE, newInclude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiatingRoleType getInitiatingRole() {
		return (InitiatingRoleType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__INITIATING_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiatingRole(InitiatingRoleType newInitiatingRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__INITIATING_ROLE, newInitiatingRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiatingRole(InitiatingRoleType newInitiatingRole) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__INITIATING_ROLE, newInitiatingRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinType getJoin() {
		return (JoinType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__JOIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoin(JoinType newJoin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__JOIN, newJoin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoin(JoinType newJoin) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__JOIN, newJoin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPartyCollaborationType getMultiPartyCollaboration() {
		return (MultiPartyCollaborationType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__MULTI_PARTY_COLLABORATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPartyCollaboration(MultiPartyCollaborationType newMultiPartyCollaboration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__MULTI_PARTY_COLLABORATION, newMultiPartyCollaboration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPartyCollaboration(MultiPartyCollaborationType newMultiPartyCollaboration) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__MULTI_PARTY_COLLABORATION, newMultiPartyCollaboration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType getPackage() {
		return (PackageType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(PackageType newPackage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__PACKAGE, newPackage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(PackageType newPackage) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformsType getPerforms() {
		return (PerformsType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__PERFORMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerforms(PerformsType newPerforms, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__PERFORMS, newPerforms, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerforms(PerformsType newPerforms) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__PERFORMS, newPerforms);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSpecificationType getProcessSpecification() {
		return (ProcessSpecificationType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__PROCESS_SPECIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessSpecification(ProcessSpecificationType newProcessSpecification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__PROCESS_SPECIFICATION, newProcessSpecification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessSpecification(ProcessSpecificationType newProcessSpecification) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__PROCESS_SPECIFICATION, newProcessSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestingBusinessActivityType getRequestingBusinessActivity() {
		return (RequestingBusinessActivityType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__REQUESTING_BUSINESS_ACTIVITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestingBusinessActivity(RequestingBusinessActivityType newRequestingBusinessActivity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__REQUESTING_BUSINESS_ACTIVITY, newRequestingBusinessActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestingBusinessActivity(RequestingBusinessActivityType newRequestingBusinessActivity) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__REQUESTING_BUSINESS_ACTIVITY, newRequestingBusinessActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespondingBusinessActivityType getRespondingBusinessActivity() {
		return (RespondingBusinessActivityType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__RESPONDING_BUSINESS_ACTIVITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRespondingBusinessActivity(RespondingBusinessActivityType newRespondingBusinessActivity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__RESPONDING_BUSINESS_ACTIVITY, newRespondingBusinessActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespondingBusinessActivity(RespondingBusinessActivityType newRespondingBusinessActivity) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__RESPONDING_BUSINESS_ACTIVITY, newRespondingBusinessActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespondingRoleType getRespondingRole() {
		return (RespondingRoleType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__RESPONDING_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRespondingRole(RespondingRoleType newRespondingRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__RESPONDING_ROLE, newRespondingRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespondingRole(RespondingRoleType newRespondingRole) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__RESPONDING_ROLE, newRespondingRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartType getStart() {
		return (StartType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(StartType newStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__START, newStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(StartType newStart) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionSetType getSubstitutionSet() {
		return (SubstitutionSetType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__SUBSTITUTION_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstitutionSet(SubstitutionSetType newSubstitutionSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__SUBSTITUTION_SET, newSubstitutionSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutionSet(SubstitutionSetType newSubstitutionSet) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__SUBSTITUTION_SET, newSubstitutionSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessType getSuccess() {
		return (SuccessType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__SUCCESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccess(SuccessType newSuccess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__SUCCESS, newSuccess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccess(SuccessType newSuccess) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__SUCCESS, newSuccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getTransition() {
		return (TransitionType)getMixed().get(ProcessPackage.Literals.DOCUMENT_ROOT__TRANSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(TransitionType newTransition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProcessPackage.Literals.DOCUMENT_ROOT__TRANSITION, newTransition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(TransitionType newTransition) {
		((FeatureMap.Internal)getMixed()).set(ProcessPackage.Literals.DOCUMENT_ROOT__TRANSITION, newTransition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.DOCUMENT_ROOT__ATTACHMENT:
				return basicSetAttachment(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__ATTRIBUTE_SUBSTITUTION:
				return basicSetAttributeSubstitution(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__BINARY_COLLABORATION:
				return basicSetBinaryCollaboration(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_DOCUMENT:
				return basicSetBusinessDocument(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_PARTNER_ROLE:
				return basicSetBusinessPartnerRole(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_TRANSACTION:
				return basicSetBusinessTransaction(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_TRANSACTION_ACTIVITY:
				return basicSetBusinessTransactionActivity(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__COLLABORATION_ACTIVITY:
				return basicSetCollaborationActivity(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__CONDITION_EXPRESSION:
				return basicSetConditionExpression(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENT_ENVELOPE:
				return basicSetDocumentEnvelope(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENT_SUBSTITUTION:
				return basicSetDocumentSubstitution(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__FAILURE:
				return basicSetFailure(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__FORK:
				return basicSetFork(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__INCLUDE:
				return basicSetInclude(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__INITIATING_ROLE:
				return basicSetInitiatingRole(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__JOIN:
				return basicSetJoin(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__MULTI_PARTY_COLLABORATION:
				return basicSetMultiPartyCollaboration(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__PACKAGE:
				return basicSetPackage(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__PERFORMS:
				return basicSetPerforms(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__PROCESS_SPECIFICATION:
				return basicSetProcessSpecification(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__REQUESTING_BUSINESS_ACTIVITY:
				return basicSetRequestingBusinessActivity(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__RESPONDING_BUSINESS_ACTIVITY:
				return basicSetRespondingBusinessActivity(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__RESPONDING_ROLE:
				return basicSetRespondingRole(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__START:
				return basicSetStart(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__SUBSTITUTION_SET:
				return basicSetSubstitutionSet(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__SUCCESS:
				return basicSetSuccess(null, msgs);
			case ProcessPackage.DOCUMENT_ROOT__TRANSITION:
				return basicSetTransition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ProcessPackage.DOCUMENT_ROOT__ATTACHMENT:
				return getAttachment();
			case ProcessPackage.DOCUMENT_ROOT__ATTRIBUTE_SUBSTITUTION:
				return getAttributeSubstitution();
			case ProcessPackage.DOCUMENT_ROOT__BINARY_COLLABORATION:
				return getBinaryCollaboration();
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_DOCUMENT:
				return getBusinessDocument();
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_PARTNER_ROLE:
				return getBusinessPartnerRole();
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_TRANSACTION:
				return getBusinessTransaction();
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_TRANSACTION_ACTIVITY:
				return getBusinessTransactionActivity();
			case ProcessPackage.DOCUMENT_ROOT__COLLABORATION_ACTIVITY:
				return getCollaborationActivity();
			case ProcessPackage.DOCUMENT_ROOT__CONDITION_EXPRESSION:
				return getConditionExpression();
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENT_ENVELOPE:
				return getDocumentEnvelope();
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENT_SUBSTITUTION:
				return getDocumentSubstitution();
			case ProcessPackage.DOCUMENT_ROOT__FAILURE:
				return getFailure();
			case ProcessPackage.DOCUMENT_ROOT__FORK:
				return getFork();
			case ProcessPackage.DOCUMENT_ROOT__INCLUDE:
				return getInclude();
			case ProcessPackage.DOCUMENT_ROOT__INITIATING_ROLE:
				return getInitiatingRole();
			case ProcessPackage.DOCUMENT_ROOT__JOIN:
				return getJoin();
			case ProcessPackage.DOCUMENT_ROOT__MULTI_PARTY_COLLABORATION:
				return getMultiPartyCollaboration();
			case ProcessPackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage();
			case ProcessPackage.DOCUMENT_ROOT__PERFORMS:
				return getPerforms();
			case ProcessPackage.DOCUMENT_ROOT__PROCESS_SPECIFICATION:
				return getProcessSpecification();
			case ProcessPackage.DOCUMENT_ROOT__REQUESTING_BUSINESS_ACTIVITY:
				return getRequestingBusinessActivity();
			case ProcessPackage.DOCUMENT_ROOT__RESPONDING_BUSINESS_ACTIVITY:
				return getRespondingBusinessActivity();
			case ProcessPackage.DOCUMENT_ROOT__RESPONDING_ROLE:
				return getRespondingRole();
			case ProcessPackage.DOCUMENT_ROOT__START:
				return getStart();
			case ProcessPackage.DOCUMENT_ROOT__SUBSTITUTION_SET:
				return getSubstitutionSet();
			case ProcessPackage.DOCUMENT_ROOT__SUCCESS:
				return getSuccess();
			case ProcessPackage.DOCUMENT_ROOT__TRANSITION:
				return getTransition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__ATTACHMENT:
				setAttachment((AttachmentType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__ATTRIBUTE_SUBSTITUTION:
				setAttributeSubstitution((AttributeSubstitutionType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__BINARY_COLLABORATION:
				setBinaryCollaboration((BinaryCollaborationType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_DOCUMENT:
				setBusinessDocument((BusinessDocumentType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_PARTNER_ROLE:
				setBusinessPartnerRole((BusinessPartnerRoleType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_TRANSACTION:
				setBusinessTransaction((BusinessTransactionType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_TRANSACTION_ACTIVITY:
				setBusinessTransactionActivity((BusinessTransactionActivityType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__COLLABORATION_ACTIVITY:
				setCollaborationActivity((CollaborationActivityType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__CONDITION_EXPRESSION:
				setConditionExpression((ConditionExpressionType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((DocumentationType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENT_ENVELOPE:
				setDocumentEnvelope((DocumentEnvelopeType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENT_SUBSTITUTION:
				setDocumentSubstitution((DocumentSubstitutionType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__FAILURE:
				setFailure((FailureType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__FORK:
				setFork((ForkType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__INCLUDE:
				setInclude((IncludeType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__INITIATING_ROLE:
				setInitiatingRole((InitiatingRoleType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__JOIN:
				setJoin((JoinType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__MULTI_PARTY_COLLABORATION:
				setMultiPartyCollaboration((MultiPartyCollaborationType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((PackageType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__PERFORMS:
				setPerforms((PerformsType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__PROCESS_SPECIFICATION:
				setProcessSpecification((ProcessSpecificationType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__REQUESTING_BUSINESS_ACTIVITY:
				setRequestingBusinessActivity((RequestingBusinessActivityType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__RESPONDING_BUSINESS_ACTIVITY:
				setRespondingBusinessActivity((RespondingBusinessActivityType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__RESPONDING_ROLE:
				setRespondingRole((RespondingRoleType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__START:
				setStart((StartType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__SUBSTITUTION_SET:
				setSubstitutionSet((SubstitutionSetType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__SUCCESS:
				setSuccess((SuccessType)newValue);
				return;
			case ProcessPackage.DOCUMENT_ROOT__TRANSITION:
				setTransition((TransitionType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcessPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ProcessPackage.DOCUMENT_ROOT__ATTACHMENT:
				setAttachment((AttachmentType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__ATTRIBUTE_SUBSTITUTION:
				setAttributeSubstitution((AttributeSubstitutionType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__BINARY_COLLABORATION:
				setBinaryCollaboration((BinaryCollaborationType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_DOCUMENT:
				setBusinessDocument((BusinessDocumentType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_PARTNER_ROLE:
				setBusinessPartnerRole((BusinessPartnerRoleType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_TRANSACTION:
				setBusinessTransaction((BusinessTransactionType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_TRANSACTION_ACTIVITY:
				setBusinessTransactionActivity((BusinessTransactionActivityType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__COLLABORATION_ACTIVITY:
				setCollaborationActivity((CollaborationActivityType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__CONDITION_EXPRESSION:
				setConditionExpression((ConditionExpressionType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENTATION:
				setDocumentation((DocumentationType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENT_ENVELOPE:
				setDocumentEnvelope((DocumentEnvelopeType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENT_SUBSTITUTION:
				setDocumentSubstitution((DocumentSubstitutionType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__FAILURE:
				setFailure((FailureType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__FORK:
				setFork((ForkType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__INCLUDE:
				setInclude((IncludeType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__INITIATING_ROLE:
				setInitiatingRole((InitiatingRoleType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__JOIN:
				setJoin((JoinType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__MULTI_PARTY_COLLABORATION:
				setMultiPartyCollaboration((MultiPartyCollaborationType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((PackageType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__PERFORMS:
				setPerforms((PerformsType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__PROCESS_SPECIFICATION:
				setProcessSpecification((ProcessSpecificationType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__REQUESTING_BUSINESS_ACTIVITY:
				setRequestingBusinessActivity((RequestingBusinessActivityType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__RESPONDING_BUSINESS_ACTIVITY:
				setRespondingBusinessActivity((RespondingBusinessActivityType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__RESPONDING_ROLE:
				setRespondingRole((RespondingRoleType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__START:
				setStart((StartType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__SUBSTITUTION_SET:
				setSubstitutionSet((SubstitutionSetType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__SUCCESS:
				setSuccess((SuccessType)null);
				return;
			case ProcessPackage.DOCUMENT_ROOT__TRANSITION:
				setTransition((TransitionType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcessPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ProcessPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ProcessPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ProcessPackage.DOCUMENT_ROOT__ATTACHMENT:
				return getAttachment() != null;
			case ProcessPackage.DOCUMENT_ROOT__ATTRIBUTE_SUBSTITUTION:
				return getAttributeSubstitution() != null;
			case ProcessPackage.DOCUMENT_ROOT__BINARY_COLLABORATION:
				return getBinaryCollaboration() != null;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_DOCUMENT:
				return getBusinessDocument() != null;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_PARTNER_ROLE:
				return getBusinessPartnerRole() != null;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_TRANSACTION:
				return getBusinessTransaction() != null;
			case ProcessPackage.DOCUMENT_ROOT__BUSINESS_TRANSACTION_ACTIVITY:
				return getBusinessTransactionActivity() != null;
			case ProcessPackage.DOCUMENT_ROOT__COLLABORATION_ACTIVITY:
				return getCollaborationActivity() != null;
			case ProcessPackage.DOCUMENT_ROOT__CONDITION_EXPRESSION:
				return getConditionExpression() != null;
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENTATION:
				return getDocumentation() != null;
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENT_ENVELOPE:
				return getDocumentEnvelope() != null;
			case ProcessPackage.DOCUMENT_ROOT__DOCUMENT_SUBSTITUTION:
				return getDocumentSubstitution() != null;
			case ProcessPackage.DOCUMENT_ROOT__FAILURE:
				return getFailure() != null;
			case ProcessPackage.DOCUMENT_ROOT__FORK:
				return getFork() != null;
			case ProcessPackage.DOCUMENT_ROOT__INCLUDE:
				return getInclude() != null;
			case ProcessPackage.DOCUMENT_ROOT__INITIATING_ROLE:
				return getInitiatingRole() != null;
			case ProcessPackage.DOCUMENT_ROOT__JOIN:
				return getJoin() != null;
			case ProcessPackage.DOCUMENT_ROOT__MULTI_PARTY_COLLABORATION:
				return getMultiPartyCollaboration() != null;
			case ProcessPackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage() != null;
			case ProcessPackage.DOCUMENT_ROOT__PERFORMS:
				return getPerforms() != null;
			case ProcessPackage.DOCUMENT_ROOT__PROCESS_SPECIFICATION:
				return getProcessSpecification() != null;
			case ProcessPackage.DOCUMENT_ROOT__REQUESTING_BUSINESS_ACTIVITY:
				return getRequestingBusinessActivity() != null;
			case ProcessPackage.DOCUMENT_ROOT__RESPONDING_BUSINESS_ACTIVITY:
				return getRespondingBusinessActivity() != null;
			case ProcessPackage.DOCUMENT_ROOT__RESPONDING_ROLE:
				return getRespondingRole() != null;
			case ProcessPackage.DOCUMENT_ROOT__START:
				return getStart() != null;
			case ProcessPackage.DOCUMENT_ROOT__SUBSTITUTION_SET:
				return getSubstitutionSet() != null;
			case ProcessPackage.DOCUMENT_ROOT__SUCCESS:
				return getSuccess() != null;
			case ProcessPackage.DOCUMENT_ROOT__TRANSITION:
				return getTransition() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
