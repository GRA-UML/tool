/**
 */
package org.ebxml.business.process.util;

import org.ebxml.business.process.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ebxml.business.process.ProcessPackage
 * @generated
 */
public class ProcessSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSwitch() {
		if (modelPackage == null) {
			modelPackage = ProcessPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProcessPackage.ATTACHMENT_TYPE: {
				AttachmentType attachmentType = (AttachmentType)theEObject;
				T result = caseAttachmentType(attachmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.ATTRIBUTE_SUBSTITUTION_TYPE: {
				AttributeSubstitutionType attributeSubstitutionType = (AttributeSubstitutionType)theEObject;
				T result = caseAttributeSubstitutionType(attributeSubstitutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.BINARY_COLLABORATION_TYPE: {
				BinaryCollaborationType binaryCollaborationType = (BinaryCollaborationType)theEObject;
				T result = caseBinaryCollaborationType(binaryCollaborationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE: {
				BusinessDocumentType businessDocumentType = (BusinessDocumentType)theEObject;
				T result = caseBusinessDocumentType(businessDocumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE: {
				BusinessPartnerRoleType businessPartnerRoleType = (BusinessPartnerRoleType)theEObject;
				T result = caseBusinessPartnerRoleType(businessPartnerRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE: {
				BusinessTransactionActivityType businessTransactionActivityType = (BusinessTransactionActivityType)theEObject;
				T result = caseBusinessTransactionActivityType(businessTransactionActivityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE: {
				BusinessTransactionType businessTransactionType = (BusinessTransactionType)theEObject;
				T result = caseBusinessTransactionType(businessTransactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE: {
				CollaborationActivityType collaborationActivityType = (CollaborationActivityType)theEObject;
				T result = caseCollaborationActivityType(collaborationActivityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.CONDITION_EXPRESSION_TYPE: {
				ConditionExpressionType conditionExpressionType = (ConditionExpressionType)theEObject;
				T result = caseConditionExpressionType(conditionExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.DOCUMENTATION_TYPE: {
				DocumentationType documentationType = (DocumentationType)theEObject;
				T result = caseDocumentationType(documentationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE: {
				DocumentEnvelopeType documentEnvelopeType = (DocumentEnvelopeType)theEObject;
				T result = caseDocumentEnvelopeType(documentEnvelopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE: {
				DocumentSubstitutionType documentSubstitutionType = (DocumentSubstitutionType)theEObject;
				T result = caseDocumentSubstitutionType(documentSubstitutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.FAILURE_TYPE: {
				FailureType failureType = (FailureType)theEObject;
				T result = caseFailureType(failureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.FORK_TYPE: {
				ForkType forkType = (ForkType)theEObject;
				T result = caseForkType(forkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.INCLUDE_TYPE: {
				IncludeType includeType = (IncludeType)theEObject;
				T result = caseIncludeType(includeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.INITIATING_ROLE_TYPE: {
				InitiatingRoleType initiatingRoleType = (InitiatingRoleType)theEObject;
				T result = caseInitiatingRoleType(initiatingRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.JOIN_TYPE: {
				JoinType joinType = (JoinType)theEObject;
				T result = caseJoinType(joinType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE: {
				MultiPartyCollaborationType multiPartyCollaborationType = (MultiPartyCollaborationType)theEObject;
				T result = caseMultiPartyCollaborationType(multiPartyCollaborationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.PACKAGE_TYPE: {
				PackageType packageType = (PackageType)theEObject;
				T result = casePackageType(packageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.PERFORMS_TYPE: {
				PerformsType performsType = (PerformsType)theEObject;
				T result = casePerformsType(performsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE: {
				ProcessSpecificationType processSpecificationType = (ProcessSpecificationType)theEObject;
				T result = caseProcessSpecificationType(processSpecificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.REQUESTING_BUSINESS_ACTIVITY_TYPE: {
				RequestingBusinessActivityType requestingBusinessActivityType = (RequestingBusinessActivityType)theEObject;
				T result = caseRequestingBusinessActivityType(requestingBusinessActivityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE: {
				RespondingBusinessActivityType respondingBusinessActivityType = (RespondingBusinessActivityType)theEObject;
				T result = caseRespondingBusinessActivityType(respondingBusinessActivityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.RESPONDING_ROLE_TYPE: {
				RespondingRoleType respondingRoleType = (RespondingRoleType)theEObject;
				T result = caseRespondingRoleType(respondingRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.START_TYPE: {
				StartType startType = (StartType)theEObject;
				T result = caseStartType(startType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.SUBSTITUTION_SET_TYPE: {
				SubstitutionSetType substitutionSetType = (SubstitutionSetType)theEObject;
				T result = caseSubstitutionSetType(substitutionSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.SUCCESS_TYPE: {
				SuccessType successType = (SuccessType)theEObject;
				T result = caseSuccessType(successType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessPackage.TRANSITION_TYPE: {
				TransitionType transitionType = (TransitionType)theEObject;
				T result = caseTransitionType(transitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachmentType(AttachmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Substitution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Substitution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeSubstitutionType(AttributeSubstitutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Collaboration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Collaboration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryCollaborationType(BinaryCollaborationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessDocumentType(BusinessDocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Partner Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Partner Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessPartnerRoleType(BusinessPartnerRoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Transaction Activity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Transaction Activity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessTransactionActivityType(BusinessTransactionActivityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Transaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessTransactionType(BusinessTransactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration Activity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration Activity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborationActivityType(CollaborationActivityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionExpressionType(ConditionExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationType(DocumentationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Envelope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Envelope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentEnvelopeType(DocumentEnvelopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Substitution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Substitution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentSubstitutionType(DocumentSubstitutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureType(FailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkType(ForkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeType(IncludeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initiating Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initiating Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitiatingRoleType(InitiatingRoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinType(JoinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Party Collaboration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Party Collaboration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPartyCollaborationType(MultiPartyCollaborationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageType(PackageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformsType(PerformsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessSpecificationType(ProcessSpecificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requesting Business Activity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requesting Business Activity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestingBusinessActivityType(RequestingBusinessActivityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responding Business Activity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responding Business Activity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespondingBusinessActivityType(RespondingBusinessActivityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responding Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responding Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespondingRoleType(RespondingRoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartType(StartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substitution Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substitution Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitutionSetType(SubstitutionSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessType(SuccessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionType(TransitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProcessSwitch
