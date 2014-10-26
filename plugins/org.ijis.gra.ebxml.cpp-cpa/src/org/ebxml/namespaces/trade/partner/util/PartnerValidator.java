/**
 */
package org.ebxml.namespaces.trade.partner.util;

import java.util.Map;

import org.ebxml.namespaces.trade.partner.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage
 * @generated
 */
public class PartnerValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PartnerValidator INSTANCE = new PartnerValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.ebxml.namespaces.trade.partner";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PartnerPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PartnerPackage.CERTIFICATE_REF_TYPE:
				return validateCertificateRefType((CertificateRefType)value, diagnostics, context);
			case PartnerPackage.CERTIFICATE_TYPE:
				return validateCertificateType((CertificateType)value, diagnostics, context);
			case PartnerPackage.CHARACTERISTICS_TYPE:
				return validateCharacteristicsType((CharacteristicsType)value, diagnostics, context);
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE:
				return validateCollaborationProtocolAgreementType((CollaborationProtocolAgreementType)value, diagnostics, context);
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE:
				return validateCollaborationProtocolProfileType((CollaborationProtocolProfileType)value, diagnostics, context);
			case PartnerPackage.COLLABORATION_ROLE_TYPE:
				return validateCollaborationRoleType((CollaborationRoleType)value, diagnostics, context);
			case PartnerPackage.COMMENT_TYPE:
				return validateCommentType((CommentType)value, diagnostics, context);
			case PartnerPackage.COMPOSITE_LIST_TYPE:
				return validateCompositeListType((CompositeListType)value, diagnostics, context);
			case PartnerPackage.COMPOSITE_TYPE:
				return validateCompositeType((CompositeType)value, diagnostics, context);
			case PartnerPackage.CONSTITUENT_TYPE:
				return validateConstituentType((ConstituentType)value, diagnostics, context);
			case PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE:
				return validateConversationConstraintsType((ConversationConstraintsType)value, diagnostics, context);
			case PartnerPackage.DELIVERY_CHANNEL_TYPE:
				return validateDeliveryChannelType((DeliveryChannelType)value, diagnostics, context);
			case PartnerPackage.DIGITAL_ENVELOPE_TYPE:
				return validateDigitalEnvelopeType((DigitalEnvelopeType)value, diagnostics, context);
			case PartnerPackage.DOC_EXCHANGE_TYPE:
				return validateDocExchangeType((DocExchangeType)value, diagnostics, context);
			case PartnerPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case PartnerPackage.EB_XML_BINDING_TYPE:
				return validateEbXMLBindingType((EbXMLBindingType)value, diagnostics, context);
			case PartnerPackage.ENCAPSULATION_TYPE:
				return validateEncapsulationType((EncapsulationType)value, diagnostics, context);
			case PartnerPackage.ENDPOINT_TYPE:
				return validateEndpointType((EndpointType)value, diagnostics, context);
			case PartnerPackage.NAMESPACE_SUPPORTED_TYPE:
				return validateNamespaceSupportedType((NamespaceSupportedType)value, diagnostics, context);
			case PartnerPackage.NON_REPUDIATION_TYPE:
				return validateNonRepudiationType((NonRepudiationType)value, diagnostics, context);
			case PartnerPackage.OVERRIDE_TYPE:
				return validateOverrideType((OverrideType)value, diagnostics, context);
			case PartnerPackage.PACKAGING_TYPE:
				return validatePackagingType((PackagingType)value, diagnostics, context);
			case PartnerPackage.PARTY_ID_TYPE:
				return validatePartyIdType((PartyIdType)value, diagnostics, context);
			case PartnerPackage.PARTY_INFO_TYPE:
				return validatePartyInfoType((PartyInfoType)value, diagnostics, context);
			case PartnerPackage.PARTY_REF_TYPE:
				return validatePartyRefType((PartyRefType)value, diagnostics, context);
			case PartnerPackage.PROCESSING_CAPABILITIES_TYPE:
				return validateProcessingCapabilitiesType((ProcessingCapabilitiesType)value, diagnostics, context);
			case PartnerPackage.PROCESS_SPECIFICATION_TYPE:
				return validateProcessSpecificationType((ProcessSpecificationType)value, diagnostics, context);
			case PartnerPackage.PROTOCOL_TYPE:
				return validateProtocolType((ProtocolType)value, diagnostics, context);
			case PartnerPackage.RELIABLE_MESSAGING_TYPE:
				return validateReliableMessagingType((ReliableMessagingType)value, diagnostics, context);
			case PartnerPackage.ROLE_TYPE:
				return validateRoleType((RoleType)value, diagnostics, context);
			case PartnerPackage.SERVICE_BINDING_TYPE:
				return validateServiceBindingType((ServiceBindingType)value, diagnostics, context);
			case PartnerPackage.SERVICE_TYPE:
				return validateServiceType((ServiceType)value, diagnostics, context);
			case PartnerPackage.SIMPLE_PART_TYPE:
				return validateSimplePartType((SimplePartType)value, diagnostics, context);
			case PartnerPackage.STATUS_TYPE:
				return validateStatusType((StatusType)value, diagnostics, context);
			case PartnerPackage.TRANSPORT_SECURITY_TYPE:
				return validateTransportSecurityType((TransportSecurityType)value, diagnostics, context);
			case PartnerPackage.TRANSPORT_TYPE:
				return validateTransportType((TransportType)value, diagnostics, context);
			case PartnerPackage.DS_TYPE:
				return validateDsType((DsType)value, diagnostics, context);
			case PartnerPackage.ENDPOINT_TYPE_TYPE:
				return validateEndpointTypeType((EndpointTypeType)value, diagnostics, context);
			case PartnerPackage.MOS_TYPE:
				return validateMosType((MosType)value, diagnostics, context);
			case PartnerPackage.STATUS_VALUE_TYPE:
				return validateStatusValueType((StatusValueType)value, diagnostics, context);
			case PartnerPackage.SYNC_REPLY_MODE_TYPE:
				return validateSyncReplyModeType((SyncReplyModeType)value, diagnostics, context);
			case PartnerPackage.DS_TYPE_OBJECT:
				return validateDsTypeObject((DsType)value, diagnostics, context);
			case PartnerPackage.ENDPOINT_TYPE_TYPE_OBJECT:
				return validateEndpointTypeTypeObject((EndpointTypeType)value, diagnostics, context);
			case PartnerPackage.MOS_TYPE_OBJECT:
				return validateMosTypeObject((MosType)value, diagnostics, context);
			case PartnerPackage.NON_EMPTY_STRING:
				return validateNonEmptyString((String)value, diagnostics, context);
			case PartnerPackage.STATUS_VALUE_TYPE_OBJECT:
				return validateStatusValueTypeObject((StatusValueType)value, diagnostics, context);
			case PartnerPackage.SYNC_REPLY_MODE_TYPE_OBJECT:
				return validateSyncReplyModeTypeObject((SyncReplyModeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificateRefType(CertificateRefType certificateRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(certificateRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificateType(CertificateType certificateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(certificateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicsType(CharacteristicsType characteristicsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characteristicsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationProtocolAgreementType(CollaborationProtocolAgreementType collaborationProtocolAgreementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collaborationProtocolAgreementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationProtocolProfileType(CollaborationProtocolProfileType collaborationProtocolProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collaborationProtocolProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationRoleType(CollaborationRoleType collaborationRoleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collaborationRoleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentType(CommentType commentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeListType(CompositeListType compositeListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeType(CompositeType compositeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstituentType(ConstituentType constituentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constituentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversationConstraintsType(ConversationConstraintsType conversationConstraintsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversationConstraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeliveryChannelType(DeliveryChannelType deliveryChannelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deliveryChannelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDigitalEnvelopeType(DigitalEnvelopeType digitalEnvelopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(digitalEnvelopeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocExchangeType(DocExchangeType docExchangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(docExchangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEbXMLBindingType(EbXMLBindingType ebXMLBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ebXMLBindingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncapsulationType(EncapsulationType encapsulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encapsulationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointType(EndpointType endpointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespaceSupportedType(NamespaceSupportedType namespaceSupportedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namespaceSupportedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonRepudiationType(NonRepudiationType nonRepudiationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonRepudiationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideType(OverrideType overrideType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(overrideType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackagingType(PackagingType packagingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packagingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartyIdType(PartyIdType partyIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partyIdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartyInfoType(PartyInfoType partyInfoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partyInfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartyRefType(PartyRefType partyRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partyRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingCapabilitiesType(ProcessingCapabilitiesType processingCapabilitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processingCapabilitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessSpecificationType(ProcessSpecificationType processSpecificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processSpecificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolType(ProtocolType protocolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReliableMessagingType(ReliableMessagingType reliableMessagingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reliableMessagingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleType(RoleType roleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceBindingType(ServiceBindingType serviceBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceBindingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceType(ServiceType serviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimplePartType(SimplePartType simplePartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simplePartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusType(StatusType statusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportSecurityType(TransportSecurityType transportSecurityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transportSecurityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportType(TransportType transportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDsType(DsType dsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointTypeType(EndpointTypeType endpointTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMosType(MosType mosType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusValueType(StatusValueType statusValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSyncReplyModeType(SyncReplyModeType syncReplyModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDsTypeObject(DsType dsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointTypeTypeObject(EndpointTypeType endpointTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMosTypeObject(MosType mosTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonEmptyString_MinLength(nonEmptyString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Non Empty String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString_MinLength(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nonEmptyString.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(PartnerPackage.Literals.NON_EMPTY_STRING, nonEmptyString, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusValueTypeObject(StatusValueType statusValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSyncReplyModeTypeObject(SyncReplyModeType syncReplyModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PartnerValidator
