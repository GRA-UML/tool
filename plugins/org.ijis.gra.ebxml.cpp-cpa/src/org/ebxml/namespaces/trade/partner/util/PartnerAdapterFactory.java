/**
 */
package org.ebxml.namespaces.trade.partner.util;

import org.ebxml.namespaces.trade.partner.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage
 * @generated
 */
public class PartnerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PartnerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PartnerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartnerSwitch<Adapter> modelSwitch =
		new PartnerSwitch<Adapter>() {
			@Override
			public Adapter caseCertificateRefType(CertificateRefType object) {
				return createCertificateRefTypeAdapter();
			}
			@Override
			public Adapter caseCertificateType(CertificateType object) {
				return createCertificateTypeAdapter();
			}
			@Override
			public Adapter caseCharacteristicsType(CharacteristicsType object) {
				return createCharacteristicsTypeAdapter();
			}
			@Override
			public Adapter caseCollaborationProtocolAgreementType(CollaborationProtocolAgreementType object) {
				return createCollaborationProtocolAgreementTypeAdapter();
			}
			@Override
			public Adapter caseCollaborationProtocolProfileType(CollaborationProtocolProfileType object) {
				return createCollaborationProtocolProfileTypeAdapter();
			}
			@Override
			public Adapter caseCollaborationRoleType(CollaborationRoleType object) {
				return createCollaborationRoleTypeAdapter();
			}
			@Override
			public Adapter caseCommentType(CommentType object) {
				return createCommentTypeAdapter();
			}
			@Override
			public Adapter caseCompositeListType(CompositeListType object) {
				return createCompositeListTypeAdapter();
			}
			@Override
			public Adapter caseCompositeType(CompositeType object) {
				return createCompositeTypeAdapter();
			}
			@Override
			public Adapter caseConstituentType(ConstituentType object) {
				return createConstituentTypeAdapter();
			}
			@Override
			public Adapter caseConversationConstraintsType(ConversationConstraintsType object) {
				return createConversationConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseDeliveryChannelType(DeliveryChannelType object) {
				return createDeliveryChannelTypeAdapter();
			}
			@Override
			public Adapter caseDigitalEnvelopeType(DigitalEnvelopeType object) {
				return createDigitalEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseDocExchangeType(DocExchangeType object) {
				return createDocExchangeTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEbXMLBindingType(EbXMLBindingType object) {
				return createEbXMLBindingTypeAdapter();
			}
			@Override
			public Adapter caseEncapsulationType(EncapsulationType object) {
				return createEncapsulationTypeAdapter();
			}
			@Override
			public Adapter caseEndpointType(EndpointType object) {
				return createEndpointTypeAdapter();
			}
			@Override
			public Adapter caseNamespaceSupportedType(NamespaceSupportedType object) {
				return createNamespaceSupportedTypeAdapter();
			}
			@Override
			public Adapter caseNonRepudiationType(NonRepudiationType object) {
				return createNonRepudiationTypeAdapter();
			}
			@Override
			public Adapter caseOverrideType(OverrideType object) {
				return createOverrideTypeAdapter();
			}
			@Override
			public Adapter casePackagingType(PackagingType object) {
				return createPackagingTypeAdapter();
			}
			@Override
			public Adapter casePartyIdType(PartyIdType object) {
				return createPartyIdTypeAdapter();
			}
			@Override
			public Adapter casePartyInfoType(PartyInfoType object) {
				return createPartyInfoTypeAdapter();
			}
			@Override
			public Adapter casePartyRefType(PartyRefType object) {
				return createPartyRefTypeAdapter();
			}
			@Override
			public Adapter caseProcessingCapabilitiesType(ProcessingCapabilitiesType object) {
				return createProcessingCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseProcessSpecificationType(ProcessSpecificationType object) {
				return createProcessSpecificationTypeAdapter();
			}
			@Override
			public Adapter caseProtocolType(ProtocolType object) {
				return createProtocolTypeAdapter();
			}
			@Override
			public Adapter caseReliableMessagingType(ReliableMessagingType object) {
				return createReliableMessagingTypeAdapter();
			}
			@Override
			public Adapter caseRoleType(RoleType object) {
				return createRoleTypeAdapter();
			}
			@Override
			public Adapter caseServiceBindingType(ServiceBindingType object) {
				return createServiceBindingTypeAdapter();
			}
			@Override
			public Adapter caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			@Override
			public Adapter caseSimplePartType(SimplePartType object) {
				return createSimplePartTypeAdapter();
			}
			@Override
			public Adapter caseStatusType(StatusType object) {
				return createStatusTypeAdapter();
			}
			@Override
			public Adapter caseTransportSecurityType(TransportSecurityType object) {
				return createTransportSecurityTypeAdapter();
			}
			@Override
			public Adapter caseTransportType(TransportType object) {
				return createTransportTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.CertificateRefType <em>Certificate Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.CertificateRefType
	 * @generated
	 */
	public Adapter createCertificateRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.CertificateType <em>Certificate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.CertificateType
	 * @generated
	 */
	public Adapter createCertificateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType <em>Characteristics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.CharacteristicsType
	 * @generated
	 */
	public Adapter createCharacteristicsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType <em>Collaboration Protocol Agreement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType
	 * @generated
	 */
	public Adapter createCollaborationProtocolAgreementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType <em>Collaboration Protocol Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType
	 * @generated
	 */
	public Adapter createCollaborationProtocolProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType <em>Collaboration Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationRoleType
	 * @generated
	 */
	public Adapter createCollaborationRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.CommentType
	 * @generated
	 */
	public Adapter createCommentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.CompositeListType <em>Composite List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.CompositeListType
	 * @generated
	 */
	public Adapter createCompositeListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.CompositeType
	 * @generated
	 */
	public Adapter createCompositeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.ConstituentType <em>Constituent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.ConstituentType
	 * @generated
	 */
	public Adapter createConstituentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType <em>Conversation Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.ConversationConstraintsType
	 * @generated
	 */
	public Adapter createConversationConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType <em>Delivery Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.DeliveryChannelType
	 * @generated
	 */
	public Adapter createDeliveryChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.DigitalEnvelopeType <em>Digital Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.DigitalEnvelopeType
	 * @generated
	 */
	public Adapter createDigitalEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.DocExchangeType <em>Doc Exchange Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.DocExchangeType
	 * @generated
	 */
	public Adapter createDocExchangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType <em>Eb XML Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.EbXMLBindingType
	 * @generated
	 */
	public Adapter createEbXMLBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.EncapsulationType <em>Encapsulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.EncapsulationType
	 * @generated
	 */
	public Adapter createEncapsulationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.EndpointType <em>Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.EndpointType
	 * @generated
	 */
	public Adapter createEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.NamespaceSupportedType <em>Namespace Supported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.NamespaceSupportedType
	 * @generated
	 */
	public Adapter createNamespaceSupportedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.NonRepudiationType <em>Non Repudiation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.NonRepudiationType
	 * @generated
	 */
	public Adapter createNonRepudiationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.OverrideType <em>Override Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.OverrideType
	 * @generated
	 */
	public Adapter createOverrideTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.PackagingType <em>Packaging Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.PackagingType
	 * @generated
	 */
	public Adapter createPackagingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.PartyIdType <em>Party Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.PartyIdType
	 * @generated
	 */
	public Adapter createPartyIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.PartyInfoType <em>Party Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.PartyInfoType
	 * @generated
	 */
	public Adapter createPartyInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.PartyRefType <em>Party Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.PartyRefType
	 * @generated
	 */
	public Adapter createPartyRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType <em>Processing Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType
	 * @generated
	 */
	public Adapter createProcessingCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.ProcessSpecificationType <em>Process Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.ProcessSpecificationType
	 * @generated
	 */
	public Adapter createProcessSpecificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.ProtocolType
	 * @generated
	 */
	public Adapter createProtocolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType <em>Reliable Messaging Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.ReliableMessagingType
	 * @generated
	 */
	public Adapter createReliableMessagingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.RoleType
	 * @generated
	 */
	public Adapter createRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.ServiceBindingType <em>Service Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.ServiceBindingType
	 * @generated
	 */
	public Adapter createServiceBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.SimplePartType <em>Simple Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.SimplePartType
	 * @generated
	 */
	public Adapter createSimplePartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.StatusType
	 * @generated
	 */
	public Adapter createStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.TransportSecurityType <em>Transport Security Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.TransportSecurityType
	 * @generated
	 */
	public Adapter createTransportSecurityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.namespaces.trade.partner.TransportType <em>Transport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.namespaces.trade.partner.TransportType
	 * @generated
	 */
	public Adapter createTransportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PartnerAdapterFactory
