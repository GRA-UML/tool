/**
 */
package org.ebxml.namespaces.trade.partner.util;

import org.ebxml.namespaces.trade.partner.*;

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
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage
 * @generated
 */
public class PartnerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PartnerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerSwitch() {
		if (modelPackage == null) {
			modelPackage = PartnerPackage.eINSTANCE;
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
			case PartnerPackage.CERTIFICATE_REF_TYPE: {
				CertificateRefType certificateRefType = (CertificateRefType)theEObject;
				T result = caseCertificateRefType(certificateRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.CERTIFICATE_TYPE: {
				CertificateType certificateType = (CertificateType)theEObject;
				T result = caseCertificateType(certificateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.CHARACTERISTICS_TYPE: {
				CharacteristicsType characteristicsType = (CharacteristicsType)theEObject;
				T result = caseCharacteristicsType(characteristicsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.COLLABORATION_PROTOCOL_AGREEMENT_TYPE: {
				CollaborationProtocolAgreementType collaborationProtocolAgreementType = (CollaborationProtocolAgreementType)theEObject;
				T result = caseCollaborationProtocolAgreementType(collaborationProtocolAgreementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.COLLABORATION_PROTOCOL_PROFILE_TYPE: {
				CollaborationProtocolProfileType collaborationProtocolProfileType = (CollaborationProtocolProfileType)theEObject;
				T result = caseCollaborationProtocolProfileType(collaborationProtocolProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.COLLABORATION_ROLE_TYPE: {
				CollaborationRoleType collaborationRoleType = (CollaborationRoleType)theEObject;
				T result = caseCollaborationRoleType(collaborationRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.COMMENT_TYPE: {
				CommentType commentType = (CommentType)theEObject;
				T result = caseCommentType(commentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.COMPOSITE_LIST_TYPE: {
				CompositeListType compositeListType = (CompositeListType)theEObject;
				T result = caseCompositeListType(compositeListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.COMPOSITE_TYPE: {
				CompositeType compositeType = (CompositeType)theEObject;
				T result = caseCompositeType(compositeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.CONSTITUENT_TYPE: {
				ConstituentType constituentType = (ConstituentType)theEObject;
				T result = caseConstituentType(constituentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.CONVERSATION_CONSTRAINTS_TYPE: {
				ConversationConstraintsType conversationConstraintsType = (ConversationConstraintsType)theEObject;
				T result = caseConversationConstraintsType(conversationConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.DELIVERY_CHANNEL_TYPE: {
				DeliveryChannelType deliveryChannelType = (DeliveryChannelType)theEObject;
				T result = caseDeliveryChannelType(deliveryChannelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.DIGITAL_ENVELOPE_TYPE: {
				DigitalEnvelopeType digitalEnvelopeType = (DigitalEnvelopeType)theEObject;
				T result = caseDigitalEnvelopeType(digitalEnvelopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.DOC_EXCHANGE_TYPE: {
				DocExchangeType docExchangeType = (DocExchangeType)theEObject;
				T result = caseDocExchangeType(docExchangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.EB_XML_BINDING_TYPE: {
				EbXMLBindingType ebXMLBindingType = (EbXMLBindingType)theEObject;
				T result = caseEbXMLBindingType(ebXMLBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.ENCAPSULATION_TYPE: {
				EncapsulationType encapsulationType = (EncapsulationType)theEObject;
				T result = caseEncapsulationType(encapsulationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.ENDPOINT_TYPE: {
				EndpointType endpointType = (EndpointType)theEObject;
				T result = caseEndpointType(endpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.NAMESPACE_SUPPORTED_TYPE: {
				NamespaceSupportedType namespaceSupportedType = (NamespaceSupportedType)theEObject;
				T result = caseNamespaceSupportedType(namespaceSupportedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.NON_REPUDIATION_TYPE: {
				NonRepudiationType nonRepudiationType = (NonRepudiationType)theEObject;
				T result = caseNonRepudiationType(nonRepudiationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.OVERRIDE_TYPE: {
				OverrideType overrideType = (OverrideType)theEObject;
				T result = caseOverrideType(overrideType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.PACKAGING_TYPE: {
				PackagingType packagingType = (PackagingType)theEObject;
				T result = casePackagingType(packagingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.PARTY_ID_TYPE: {
				PartyIdType partyIdType = (PartyIdType)theEObject;
				T result = casePartyIdType(partyIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.PARTY_INFO_TYPE: {
				PartyInfoType partyInfoType = (PartyInfoType)theEObject;
				T result = casePartyInfoType(partyInfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.PARTY_REF_TYPE: {
				PartyRefType partyRefType = (PartyRefType)theEObject;
				T result = casePartyRefType(partyRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.PROCESSING_CAPABILITIES_TYPE: {
				ProcessingCapabilitiesType processingCapabilitiesType = (ProcessingCapabilitiesType)theEObject;
				T result = caseProcessingCapabilitiesType(processingCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.PROCESS_SPECIFICATION_TYPE: {
				ProcessSpecificationType processSpecificationType = (ProcessSpecificationType)theEObject;
				T result = caseProcessSpecificationType(processSpecificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.PROTOCOL_TYPE: {
				ProtocolType protocolType = (ProtocolType)theEObject;
				T result = caseProtocolType(protocolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.RELIABLE_MESSAGING_TYPE: {
				ReliableMessagingType reliableMessagingType = (ReliableMessagingType)theEObject;
				T result = caseReliableMessagingType(reliableMessagingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.ROLE_TYPE: {
				RoleType roleType = (RoleType)theEObject;
				T result = caseRoleType(roleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.SERVICE_BINDING_TYPE: {
				ServiceBindingType serviceBindingType = (ServiceBindingType)theEObject;
				T result = caseServiceBindingType(serviceBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.SERVICE_TYPE: {
				ServiceType serviceType = (ServiceType)theEObject;
				T result = caseServiceType(serviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.SIMPLE_PART_TYPE: {
				SimplePartType simplePartType = (SimplePartType)theEObject;
				T result = caseSimplePartType(simplePartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.STATUS_TYPE: {
				StatusType statusType = (StatusType)theEObject;
				T result = caseStatusType(statusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.TRANSPORT_SECURITY_TYPE: {
				TransportSecurityType transportSecurityType = (TransportSecurityType)theEObject;
				T result = caseTransportSecurityType(transportSecurityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PartnerPackage.TRANSPORT_TYPE: {
				TransportType transportType = (TransportType)theEObject;
				T result = caseTransportType(transportType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificate Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificate Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificateRefType(CertificateRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificateType(CertificateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristics Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristics Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicsType(CharacteristicsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration Protocol Agreement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration Protocol Agreement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborationProtocolAgreementType(CollaborationProtocolAgreementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration Protocol Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration Protocol Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborationProtocolProfileType(CollaborationProtocolProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborationRoleType(CollaborationRoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentType(CommentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeListType(CompositeListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeType(CompositeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constituent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constituent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstituentType(ConstituentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversation Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversation Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversationConstraintsType(ConversationConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeliveryChannelType(DeliveryChannelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Envelope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Envelope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalEnvelopeType(DigitalEnvelopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Exchange Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Exchange Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocExchangeType(DocExchangeType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Eb XML Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eb XML Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEbXMLBindingType(EbXMLBindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulationType(EncapsulationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointType(EndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Supported Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Supported Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceSupportedType(NamespaceSupportedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Repudiation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Repudiation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonRepudiationType(NonRepudiationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Override Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Override Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverrideType(OverrideType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packaging Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packaging Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackagingType(PackagingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartyIdType(PartyIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartyInfoType(PartyInfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartyRefType(PartyRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingCapabilitiesType(ProcessingCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Specification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Specification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessSpecificationType(ProcessSpecificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolType(ProtocolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliable Messaging Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliable Messaging Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliableMessagingType(ReliableMessagingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleType(RoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBindingType(ServiceBindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceType(ServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Part Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Part Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimplePartType(SimplePartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusType(StatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Security Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Security Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportSecurityType(TransportSecurityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportType(TransportType object) {
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

} //PartnerSwitch
