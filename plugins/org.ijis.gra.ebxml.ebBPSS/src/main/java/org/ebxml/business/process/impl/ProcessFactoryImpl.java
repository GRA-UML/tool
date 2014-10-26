/**
 */
package org.ebxml.business.process.impl;

import org.ebxml.business.process.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessFactoryImpl extends EFactoryImpl implements ProcessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessFactory init() {
		try {
			ProcessFactory theProcessFactory = (ProcessFactory)EPackage.Registry.INSTANCE.getEFactory(ProcessPackage.eNS_URI);
			if (theProcessFactory != null) {
				return theProcessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProcessPackage.ATTACHMENT_TYPE: return createAttachmentType();
			case ProcessPackage.ATTRIBUTE_SUBSTITUTION_TYPE: return createAttributeSubstitutionType();
			case ProcessPackage.BINARY_COLLABORATION_TYPE: return createBinaryCollaborationType();
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE: return createBusinessDocumentType();
			case ProcessPackage.BUSINESS_PARTNER_ROLE_TYPE: return createBusinessPartnerRoleType();
			case ProcessPackage.BUSINESS_TRANSACTION_ACTIVITY_TYPE: return createBusinessTransactionActivityType();
			case ProcessPackage.BUSINESS_TRANSACTION_TYPE: return createBusinessTransactionType();
			case ProcessPackage.COLLABORATION_ACTIVITY_TYPE: return createCollaborationActivityType();
			case ProcessPackage.CONDITION_EXPRESSION_TYPE: return createConditionExpressionType();
			case ProcessPackage.DOCUMENTATION_TYPE: return createDocumentationType();
			case ProcessPackage.DOCUMENT_ENVELOPE_TYPE: return createDocumentEnvelopeType();
			case ProcessPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ProcessPackage.DOCUMENT_SUBSTITUTION_TYPE: return createDocumentSubstitutionType();
			case ProcessPackage.FAILURE_TYPE: return createFailureType();
			case ProcessPackage.FORK_TYPE: return createForkType();
			case ProcessPackage.INCLUDE_TYPE: return createIncludeType();
			case ProcessPackage.INITIATING_ROLE_TYPE: return createInitiatingRoleType();
			case ProcessPackage.JOIN_TYPE: return createJoinType();
			case ProcessPackage.MULTI_PARTY_COLLABORATION_TYPE: return createMultiPartyCollaborationType();
			case ProcessPackage.PACKAGE_TYPE: return createPackageType();
			case ProcessPackage.PERFORMS_TYPE: return createPerformsType();
			case ProcessPackage.PROCESS_SPECIFICATION_TYPE: return createProcessSpecificationType();
			case ProcessPackage.REQUESTING_BUSINESS_ACTIVITY_TYPE: return createRequestingBusinessActivityType();
			case ProcessPackage.RESPONDING_BUSINESS_ACTIVITY_TYPE: return createRespondingBusinessActivityType();
			case ProcessPackage.RESPONDING_ROLE_TYPE: return createRespondingRoleType();
			case ProcessPackage.START_TYPE: return createStartType();
			case ProcessPackage.SUBSTITUTION_SET_TYPE: return createSubstitutionSetType();
			case ProcessPackage.SUCCESS_TYPE: return createSuccessType();
			case ProcessPackage.TRANSITION_TYPE: return createTransitionType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProcessPackage.CONDITION_GUARD_TYPE:
				return createConditionGuardTypeFromString(eDataType, initialValue);
			case ProcessPackage.CONDITION_GUARD_TYPE1:
				return createConditionGuardType1FromString(eDataType, initialValue);
			case ProcessPackage.CONDITION_GUARD_TYPE2:
				return createConditionGuardType2FromString(eDataType, initialValue);
			case ProcessPackage.CONDITION_GUARD_TYPE_OBJECT:
				return createConditionGuardTypeObjectFromString(eDataType, initialValue);
			case ProcessPackage.CONDITION_GUARD_TYPE_OBJECT1:
				return createConditionGuardTypeObject1FromString(eDataType, initialValue);
			case ProcessPackage.CONDITION_GUARD_TYPE_OBJECT2:
				return createConditionGuardTypeObject2FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProcessPackage.CONDITION_GUARD_TYPE:
				return convertConditionGuardTypeToString(eDataType, instanceValue);
			case ProcessPackage.CONDITION_GUARD_TYPE1:
				return convertConditionGuardType1ToString(eDataType, instanceValue);
			case ProcessPackage.CONDITION_GUARD_TYPE2:
				return convertConditionGuardType2ToString(eDataType, instanceValue);
			case ProcessPackage.CONDITION_GUARD_TYPE_OBJECT:
				return convertConditionGuardTypeObjectToString(eDataType, instanceValue);
			case ProcessPackage.CONDITION_GUARD_TYPE_OBJECT1:
				return convertConditionGuardTypeObject1ToString(eDataType, instanceValue);
			case ProcessPackage.CONDITION_GUARD_TYPE_OBJECT2:
				return convertConditionGuardTypeObject2ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentType createAttachmentType() {
		AttachmentTypeImpl attachmentType = new AttachmentTypeImpl();
		return attachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSubstitutionType createAttributeSubstitutionType() {
		AttributeSubstitutionTypeImpl attributeSubstitutionType = new AttributeSubstitutionTypeImpl();
		return attributeSubstitutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryCollaborationType createBinaryCollaborationType() {
		BinaryCollaborationTypeImpl binaryCollaborationType = new BinaryCollaborationTypeImpl();
		return binaryCollaborationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessDocumentType createBusinessDocumentType() {
		BusinessDocumentTypeImpl businessDocumentType = new BusinessDocumentTypeImpl();
		return businessDocumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessPartnerRoleType createBusinessPartnerRoleType() {
		BusinessPartnerRoleTypeImpl businessPartnerRoleType = new BusinessPartnerRoleTypeImpl();
		return businessPartnerRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessTransactionActivityType createBusinessTransactionActivityType() {
		BusinessTransactionActivityTypeImpl businessTransactionActivityType = new BusinessTransactionActivityTypeImpl();
		return businessTransactionActivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessTransactionType createBusinessTransactionType() {
		BusinessTransactionTypeImpl businessTransactionType = new BusinessTransactionTypeImpl();
		return businessTransactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationActivityType createCollaborationActivityType() {
		CollaborationActivityTypeImpl collaborationActivityType = new CollaborationActivityTypeImpl();
		return collaborationActivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpressionType createConditionExpressionType() {
		ConditionExpressionTypeImpl conditionExpressionType = new ConditionExpressionTypeImpl();
		return conditionExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationType createDocumentationType() {
		DocumentationTypeImpl documentationType = new DocumentationTypeImpl();
		return documentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentEnvelopeType createDocumentEnvelopeType() {
		DocumentEnvelopeTypeImpl documentEnvelopeType = new DocumentEnvelopeTypeImpl();
		return documentEnvelopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentSubstitutionType createDocumentSubstitutionType() {
		DocumentSubstitutionTypeImpl documentSubstitutionType = new DocumentSubstitutionTypeImpl();
		return documentSubstitutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureType createFailureType() {
		FailureTypeImpl failureType = new FailureTypeImpl();
		return failureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkType createForkType() {
		ForkTypeImpl forkType = new ForkTypeImpl();
		return forkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType createIncludeType() {
		IncludeTypeImpl includeType = new IncludeTypeImpl();
		return includeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiatingRoleType createInitiatingRoleType() {
		InitiatingRoleTypeImpl initiatingRoleType = new InitiatingRoleTypeImpl();
		return initiatingRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinType createJoinType() {
		JoinTypeImpl joinType = new JoinTypeImpl();
		return joinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPartyCollaborationType createMultiPartyCollaborationType() {
		MultiPartyCollaborationTypeImpl multiPartyCollaborationType = new MultiPartyCollaborationTypeImpl();
		return multiPartyCollaborationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType createPackageType() {
		PackageTypeImpl packageType = new PackageTypeImpl();
		return packageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformsType createPerformsType() {
		PerformsTypeImpl performsType = new PerformsTypeImpl();
		return performsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSpecificationType createProcessSpecificationType() {
		ProcessSpecificationTypeImpl processSpecificationType = new ProcessSpecificationTypeImpl();
		return processSpecificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestingBusinessActivityType createRequestingBusinessActivityType() {
		RequestingBusinessActivityTypeImpl requestingBusinessActivityType = new RequestingBusinessActivityTypeImpl();
		return requestingBusinessActivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespondingBusinessActivityType createRespondingBusinessActivityType() {
		RespondingBusinessActivityTypeImpl respondingBusinessActivityType = new RespondingBusinessActivityTypeImpl();
		return respondingBusinessActivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespondingRoleType createRespondingRoleType() {
		RespondingRoleTypeImpl respondingRoleType = new RespondingRoleTypeImpl();
		return respondingRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartType createStartType() {
		StartTypeImpl startType = new StartTypeImpl();
		return startType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionSetType createSubstitutionSetType() {
		SubstitutionSetTypeImpl substitutionSetType = new SubstitutionSetTypeImpl();
		return substitutionSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessType createSuccessType() {
		SuccessTypeImpl successType = new SuccessTypeImpl();
		return successType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType createTransitionType() {
		TransitionTypeImpl transitionType = new TransitionTypeImpl();
		return transitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionGuardType createConditionGuardTypeFromString(EDataType eDataType, String initialValue) {
		ConditionGuardType result = ConditionGuardType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionGuardTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionGuardType1 createConditionGuardType1FromString(EDataType eDataType, String initialValue) {
		ConditionGuardType1 result = ConditionGuardType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionGuardType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionGuardType2 createConditionGuardType2FromString(EDataType eDataType, String initialValue) {
		ConditionGuardType2 result = ConditionGuardType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionGuardType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionGuardType createConditionGuardTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConditionGuardTypeFromString(ProcessPackage.Literals.CONDITION_GUARD_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionGuardTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConditionGuardTypeToString(ProcessPackage.Literals.CONDITION_GUARD_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionGuardType1 createConditionGuardTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createConditionGuardType1FromString(ProcessPackage.Literals.CONDITION_GUARD_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionGuardTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertConditionGuardType1ToString(ProcessPackage.Literals.CONDITION_GUARD_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionGuardType2 createConditionGuardTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createConditionGuardType2FromString(ProcessPackage.Literals.CONDITION_GUARD_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionGuardTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertConditionGuardType2ToString(ProcessPackage.Literals.CONDITION_GUARD_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPackage getProcessPackage() {
		return (ProcessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessPackage getPackage() {
		return ProcessPackage.eINSTANCE;
	}

} //ProcessFactoryImpl
