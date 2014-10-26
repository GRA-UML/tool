/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartnerFactoryImpl extends EFactoryImpl implements PartnerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartnerFactory init() {
		try {
			PartnerFactory thePartnerFactory = (PartnerFactory)EPackage.Registry.INSTANCE.getEFactory(PartnerPackage.eNS_URI);
			if (thePartnerFactory != null) {
				return thePartnerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PartnerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerFactoryImpl() {
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
			case PartnerPackage.CERTIFICATE_REF_TYPE: return createCertificateRefType();
			case PartnerPackage.CERTIFICATE_TYPE: return createCertificateType();
			case PartnerPackage.CHARACTERISTICS_TYPE: return createCharacteristicsType();
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE: return createCollaborationProtocolAgreementType();
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE: return createCollaborationProtocolProfileType();
			case PartnerPackage.COLLABORATION_ROLE_TYPE: return createCollaborationRoleType();
			case PartnerPackage.COMMENT_TYPE: return createCommentType();
			case PartnerPackage.COMPOSITE_LIST_TYPE: return createCompositeListType();
			case PartnerPackage.COMPOSITE_TYPE: return createCompositeType();
			case PartnerPackage.CONSTITUENT_TYPE: return createConstituentType();
			case PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE: return createConversationConstraintsType();
			case PartnerPackage.DELIVERY_CHANNEL_TYPE: return createDeliveryChannelType();
			case PartnerPackage.DIGITAL_ENVELOPE_TYPE: return createDigitalEnvelopeType();
			case PartnerPackage.DOC_EXCHANGE_TYPE: return createDocExchangeType();
			case PartnerPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case PartnerPackage.EB_XML_BINDING_TYPE: return createEbXMLBindingType();
			case PartnerPackage.ENCAPSULATION_TYPE: return createEncapsulationType();
			case PartnerPackage.ENDPOINT_TYPE: return createEndpointType();
			case PartnerPackage.NAMESPACE_SUPPORTED_TYPE: return createNamespaceSupportedType();
			case PartnerPackage.NON_REPUDIATION_TYPE: return createNonRepudiationType();
			case PartnerPackage.OVERRIDE_TYPE: return createOverrideType();
			case PartnerPackage.PACKAGING_TYPE: return createPackagingType();
			case PartnerPackage.PARTY_ID_TYPE: return createPartyIdType();
			case PartnerPackage.PARTY_INFO_TYPE: return createPartyInfoType();
			case PartnerPackage.PARTY_REF_TYPE: return createPartyRefType();
			case PartnerPackage.PROCESSING_CAPABILITIES_TYPE: return createProcessingCapabilitiesType();
			case PartnerPackage.PROCESS_SPECIFICATION_TYPE: return createProcessSpecificationType();
			case PartnerPackage.PROTOCOL_TYPE: return createProtocolType();
			case PartnerPackage.RELIABLE_MESSAGING_TYPE: return createReliableMessagingType();
			case PartnerPackage.ROLE_TYPE: return createRoleType();
			case PartnerPackage.SERVICE_BINDING_TYPE: return createServiceBindingType();
			case PartnerPackage.SERVICE_TYPE: return createServiceType();
			case PartnerPackage.SIMPLE_PART_TYPE: return createSimplePartType();
			case PartnerPackage.STATUS_TYPE: return createStatusType();
			case PartnerPackage.TRANSPORT_SECURITY_TYPE: return createTransportSecurityType();
			case PartnerPackage.TRANSPORT_TYPE: return createTransportType();
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
			case PartnerPackage.DS_TYPE:
				return createDsTypeFromString(eDataType, initialValue);
			case PartnerPackage.ENDPOINT_TYPE_TYPE:
				return createEndpointTypeTypeFromString(eDataType, initialValue);
			case PartnerPackage.MOS_TYPE:
				return createMosTypeFromString(eDataType, initialValue);
			case PartnerPackage.STATUS_VALUE_TYPE:
				return createStatusValueTypeFromString(eDataType, initialValue);
			case PartnerPackage.SYNC_REPLY_MODE_TYPE:
				return createSyncReplyModeTypeFromString(eDataType, initialValue);
			case PartnerPackage.DS_TYPE_OBJECT:
				return createDsTypeObjectFromString(eDataType, initialValue);
			case PartnerPackage.ENDPOINT_TYPE_TYPE_OBJECT:
				return createEndpointTypeTypeObjectFromString(eDataType, initialValue);
			case PartnerPackage.MOS_TYPE_OBJECT:
				return createMosTypeObjectFromString(eDataType, initialValue);
			case PartnerPackage.NON_EMPTY_STRING:
				return createNonEmptyStringFromString(eDataType, initialValue);
			case PartnerPackage.STATUS_VALUE_TYPE_OBJECT:
				return createStatusValueTypeObjectFromString(eDataType, initialValue);
			case PartnerPackage.SYNC_REPLY_MODE_TYPE_OBJECT:
				return createSyncReplyModeTypeObjectFromString(eDataType, initialValue);
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
			case PartnerPackage.DS_TYPE:
				return convertDsTypeToString(eDataType, instanceValue);
			case PartnerPackage.ENDPOINT_TYPE_TYPE:
				return convertEndpointTypeTypeToString(eDataType, instanceValue);
			case PartnerPackage.MOS_TYPE:
				return convertMosTypeToString(eDataType, instanceValue);
			case PartnerPackage.STATUS_VALUE_TYPE:
				return convertStatusValueTypeToString(eDataType, instanceValue);
			case PartnerPackage.SYNC_REPLY_MODE_TYPE:
				return convertSyncReplyModeTypeToString(eDataType, instanceValue);
			case PartnerPackage.DS_TYPE_OBJECT:
				return convertDsTypeObjectToString(eDataType, instanceValue);
			case PartnerPackage.ENDPOINT_TYPE_TYPE_OBJECT:
				return convertEndpointTypeTypeObjectToString(eDataType, instanceValue);
			case PartnerPackage.MOS_TYPE_OBJECT:
				return convertMosTypeObjectToString(eDataType, instanceValue);
			case PartnerPackage.NON_EMPTY_STRING:
				return convertNonEmptyStringToString(eDataType, instanceValue);
			case PartnerPackage.STATUS_VALUE_TYPE_OBJECT:
				return convertStatusValueTypeObjectToString(eDataType, instanceValue);
			case PartnerPackage.SYNC_REPLY_MODE_TYPE_OBJECT:
				return convertSyncReplyModeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateRefType createCertificateRefType() {
		CertificateRefTypeImpl certificateRefType = new CertificateRefTypeImpl();
		return certificateRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateType createCertificateType() {
		CertificateTypeImpl certificateType = new CertificateTypeImpl();
		return certificateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsType createCharacteristicsType() {
		CharacteristicsTypeImpl characteristicsType = new CharacteristicsTypeImpl();
		return characteristicsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationProtocolAgreementType createCollaborationProtocolAgreementType() {
		CollaborationProtocolAgreementTypeImpl collaborationProtocolAgreementType = new CollaborationProtocolAgreementTypeImpl();
		return collaborationProtocolAgreementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationProtocolProfileType createCollaborationProtocolProfileType() {
		CollaborationProtocolProfileTypeImpl collaborationProtocolProfileType = new CollaborationProtocolProfileTypeImpl();
		return collaborationProtocolProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationRoleType createCollaborationRoleType() {
		CollaborationRoleTypeImpl collaborationRoleType = new CollaborationRoleTypeImpl();
		return collaborationRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentType createCommentType() {
		CommentTypeImpl commentType = new CommentTypeImpl();
		return commentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeListType createCompositeListType() {
		CompositeListTypeImpl compositeListType = new CompositeListTypeImpl();
		return compositeListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeType createCompositeType() {
		CompositeTypeImpl compositeType = new CompositeTypeImpl();
		return compositeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstituentType createConstituentType() {
		ConstituentTypeImpl constituentType = new ConstituentTypeImpl();
		return constituentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationConstraintsType createConversationConstraintsType() {
		ConversationConstraintsTypeImpl conversationConstraintsType = new ConversationConstraintsTypeImpl();
		return conversationConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryChannelType createDeliveryChannelType() {
		DeliveryChannelTypeImpl deliveryChannelType = new DeliveryChannelTypeImpl();
		return deliveryChannelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalEnvelopeType createDigitalEnvelopeType() {
		DigitalEnvelopeTypeImpl digitalEnvelopeType = new DigitalEnvelopeTypeImpl();
		return digitalEnvelopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocExchangeType createDocExchangeType() {
		DocExchangeTypeImpl docExchangeType = new DocExchangeTypeImpl();
		return docExchangeType;
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
	public EbXMLBindingType createEbXMLBindingType() {
		EbXMLBindingTypeImpl ebXMLBindingType = new EbXMLBindingTypeImpl();
		return ebXMLBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulationType createEncapsulationType() {
		EncapsulationTypeImpl encapsulationType = new EncapsulationTypeImpl();
		return encapsulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointType createEndpointType() {
		EndpointTypeImpl endpointType = new EndpointTypeImpl();
		return endpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceSupportedType createNamespaceSupportedType() {
		NamespaceSupportedTypeImpl namespaceSupportedType = new NamespaceSupportedTypeImpl();
		return namespaceSupportedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonRepudiationType createNonRepudiationType() {
		NonRepudiationTypeImpl nonRepudiationType = new NonRepudiationTypeImpl();
		return nonRepudiationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverrideType createOverrideType() {
		OverrideTypeImpl overrideType = new OverrideTypeImpl();
		return overrideType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagingType createPackagingType() {
		PackagingTypeImpl packagingType = new PackagingTypeImpl();
		return packagingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyIdType createPartyIdType() {
		PartyIdTypeImpl partyIdType = new PartyIdTypeImpl();
		return partyIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyInfoType createPartyInfoType() {
		PartyInfoTypeImpl partyInfoType = new PartyInfoTypeImpl();
		return partyInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyRefType createPartyRefType() {
		PartyRefTypeImpl partyRefType = new PartyRefTypeImpl();
		return partyRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingCapabilitiesType createProcessingCapabilitiesType() {
		ProcessingCapabilitiesTypeImpl processingCapabilitiesType = new ProcessingCapabilitiesTypeImpl();
		return processingCapabilitiesType;
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
	public ProtocolType createProtocolType() {
		ProtocolTypeImpl protocolType = new ProtocolTypeImpl();
		return protocolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliableMessagingType createReliableMessagingType() {
		ReliableMessagingTypeImpl reliableMessagingType = new ReliableMessagingTypeImpl();
		return reliableMessagingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBindingType createServiceBindingType() {
		ServiceBindingTypeImpl serviceBindingType = new ServiceBindingTypeImpl();
		return serviceBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePartType createSimplePartType() {
		SimplePartTypeImpl simplePartType = new SimplePartTypeImpl();
		return simplePartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusType() {
		StatusTypeImpl statusType = new StatusTypeImpl();
		return statusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportSecurityType createTransportSecurityType() {
		TransportSecurityTypeImpl transportSecurityType = new TransportSecurityTypeImpl();
		return transportSecurityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportType createTransportType() {
		TransportTypeImpl transportType = new TransportTypeImpl();
		return transportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsType createDsTypeFromString(EDataType eDataType, String initialValue) {
		DsType result = DsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointTypeType createEndpointTypeTypeFromString(EDataType eDataType, String initialValue) {
		EndpointTypeType result = EndpointTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MosType createMosTypeFromString(EDataType eDataType, String initialValue) {
		MosType result = MosType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMosTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusValueType createStatusValueTypeFromString(EDataType eDataType, String initialValue) {
		StatusValueType result = StatusValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncReplyModeType createSyncReplyModeTypeFromString(EDataType eDataType, String initialValue) {
		SyncReplyModeType result = SyncReplyModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSyncReplyModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsType createDsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDsTypeFromString(PartnerPackage.Literals.DS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDsTypeToString(PartnerPackage.Literals.DS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointTypeType createEndpointTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEndpointTypeTypeFromString(PartnerPackage.Literals.ENDPOINT_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndpointTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndpointTypeTypeToString(PartnerPackage.Literals.ENDPOINT_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MosType createMosTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMosTypeFromString(PartnerPackage.Literals.MOS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMosTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMosTypeToString(PartnerPackage.Literals.MOS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonEmptyStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonEmptyStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusValueType createStatusValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStatusValueTypeFromString(PartnerPackage.Literals.STATUS_VALUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStatusValueTypeToString(PartnerPackage.Literals.STATUS_VALUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncReplyModeType createSyncReplyModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSyncReplyModeTypeFromString(PartnerPackage.Literals.SYNC_REPLY_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSyncReplyModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSyncReplyModeTypeToString(PartnerPackage.Literals.SYNC_REPLY_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerPackage getPartnerPackage() {
		return (PartnerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PartnerPackage getPackage() {
		return PartnerPackage.eINSTANCE;
	}

} //PartnerFactoryImpl
