/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.CertificateRefType;
import org.ebxml.namespaces.trade.partner.CertificateType;
import org.ebxml.namespaces.trade.partner.CharacteristicsType;
import org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType;
import org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType;
import org.ebxml.namespaces.trade.partner.CollaborationRoleType;
import org.ebxml.namespaces.trade.partner.CommentType;
import org.ebxml.namespaces.trade.partner.CompositeListType;
import org.ebxml.namespaces.trade.partner.CompositeType;
import org.ebxml.namespaces.trade.partner.ConstituentType;
import org.ebxml.namespaces.trade.partner.ConversationConstraintsType;
import org.ebxml.namespaces.trade.partner.DeliveryChannelType;
import org.ebxml.namespaces.trade.partner.DigitalEnvelopeType;
import org.ebxml.namespaces.trade.partner.DocExchangeType;
import org.ebxml.namespaces.trade.partner.DocumentRoot;
import org.ebxml.namespaces.trade.partner.DsType;
import org.ebxml.namespaces.trade.partner.EbXMLBindingType;
import org.ebxml.namespaces.trade.partner.EncapsulationType;
import org.ebxml.namespaces.trade.partner.EndpointType;
import org.ebxml.namespaces.trade.partner.EndpointTypeType;
import org.ebxml.namespaces.trade.partner.MosType;
import org.ebxml.namespaces.trade.partner.NamespaceSupportedType;
import org.ebxml.namespaces.trade.partner.NonRepudiationType;
import org.ebxml.namespaces.trade.partner.OverrideType;
import org.ebxml.namespaces.trade.partner.PackagingType;
import org.ebxml.namespaces.trade.partner.PartnerFactory;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.PartyIdType;
import org.ebxml.namespaces.trade.partner.PartyInfoType;
import org.ebxml.namespaces.trade.partner.PartyRefType;
import org.ebxml.namespaces.trade.partner.ProcessSpecificationType;
import org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType;
import org.ebxml.namespaces.trade.partner.ProtocolType;
import org.ebxml.namespaces.trade.partner.ReliableMessagingType;
import org.ebxml.namespaces.trade.partner.RoleType;
import org.ebxml.namespaces.trade.partner.ServiceBindingType;
import org.ebxml.namespaces.trade.partner.ServiceType;
import org.ebxml.namespaces.trade.partner.SimplePartType;
import org.ebxml.namespaces.trade.partner.StatusType;
import org.ebxml.namespaces.trade.partner.StatusValueType;
import org.ebxml.namespaces.trade.partner.SyncReplyModeType;
import org.ebxml.namespaces.trade.partner.TransportSecurityType;
import org.ebxml.namespaces.trade.partner.TransportType;
import org.ebxml.namespaces.trade.partner.util.PartnerValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.w3._1999.xlink.XlinkPackage;
import org.w3._1999.xlink.impl.XlinkPackageImpl;
import org.w3._2000._09.xmldsig.XmldsigPackage;
import org.w3._2000._09.xmldsig.impl.XmldsigPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartnerPackageImpl extends EPackageImpl implements PartnerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificateRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationProtocolAgreementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationProtocolProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationRoleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constituentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversationConstraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryChannelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalEnvelopeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docExchangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ebXMLBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceSupportedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonRepudiationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overrideTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packagingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyIdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingCapabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processSpecificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliableMessagingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplePartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportSecurityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endpointTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mosTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusValueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum syncReplyModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType endpointTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mosTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonEmptyStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statusValueTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType syncReplyModeTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PartnerPackageImpl() {
		super(eNS_URI, PartnerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PartnerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PartnerPackage init() {
		if (isInited) return (PartnerPackage)EPackage.Registry.INSTANCE.getEPackage(PartnerPackage.eNS_URI);

		// Obtain or create and register package
		PartnerPackageImpl thePartnerPackage = (PartnerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PartnerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PartnerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) instanceof XmldsigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI) : XmldsigPackage.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);

		// Create package meta-data objects
		thePartnerPackage.createPackageContents();
		theXmldsigPackage.createPackageContents();
		theXlinkPackage.createPackageContents();

		// Initialize created meta-data
		thePartnerPackage.initializePackageContents();
		theXmldsigPackage.initializePackageContents();
		theXlinkPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePartnerPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PartnerValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePartnerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PartnerPackage.eNS_URI, thePartnerPackage);
		return thePartnerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificateRefType() {
		return certificateRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateRefType_CertId() {
		return (EAttribute)certificateRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificateType() {
		return certificateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCertificateType_KeyInfo() {
		return (EReference)certificateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateType_CertId() {
		return (EAttribute)certificateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicsType() {
		return characteristicsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicsType_Authenticated() {
		return (EAttribute)characteristicsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicsType_Authorized() {
		return (EAttribute)characteristicsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicsType_Confidentiality() {
		return (EAttribute)characteristicsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicsType_NonrepudiationOfOrigin() {
		return (EAttribute)characteristicsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicsType_NonrepudiationOfReceipt() {
		return (EAttribute)characteristicsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicsType_SecureTransport() {
		return (EAttribute)characteristicsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicsType_SyncReplyMode() {
		return (EAttribute)characteristicsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationProtocolAgreementType() {
		return collaborationProtocolAgreementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationProtocolAgreementType_Status() {
		return (EReference)collaborationProtocolAgreementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationProtocolAgreementType_Start() {
		return (EAttribute)collaborationProtocolAgreementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationProtocolAgreementType_End() {
		return (EAttribute)collaborationProtocolAgreementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationProtocolAgreementType_ConversationConstraints() {
		return (EReference)collaborationProtocolAgreementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationProtocolAgreementType_PartyInfo() {
		return (EReference)collaborationProtocolAgreementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationProtocolAgreementType_Packaging() {
		return (EReference)collaborationProtocolAgreementTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationProtocolAgreementType_Signature() {
		return (EReference)collaborationProtocolAgreementTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationProtocolAgreementType_Comment() {
		return (EReference)collaborationProtocolAgreementTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationProtocolAgreementType_Cpaid() {
		return (EAttribute)collaborationProtocolAgreementTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationProtocolAgreementType_Version() {
		return (EAttribute)collaborationProtocolAgreementTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationProtocolAgreementType_AnyAttribute() {
		return (EAttribute)collaborationProtocolAgreementTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationProtocolProfileType() {
		return collaborationProtocolProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationProtocolProfileType_PartyInfo() {
		return (EReference)collaborationProtocolProfileTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationProtocolProfileType_Packaging() {
		return (EReference)collaborationProtocolProfileTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationProtocolProfileType_Signature() {
		return (EReference)collaborationProtocolProfileTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationProtocolProfileType_Comment() {
		return (EReference)collaborationProtocolProfileTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationProtocolProfileType_Version() {
		return (EAttribute)collaborationProtocolProfileTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationProtocolProfileType_AnyAttribute() {
		return (EAttribute)collaborationProtocolProfileTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationRoleType() {
		return collaborationRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationRoleType_ProcessSpecification() {
		return (EReference)collaborationRoleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationRoleType_Role() {
		return (EReference)collaborationRoleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationRoleType_CertificateRef() {
		return (EReference)collaborationRoleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationRoleType_ServiceBinding() {
		return (EReference)collaborationRoleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationRoleType_Id() {
		return (EAttribute)collaborationRoleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentType() {
		return commentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentType_Value() {
		return (EAttribute)commentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentType_Lang() {
		return (EAttribute)commentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeListType() {
		return compositeListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeListType_Group() {
		return (EAttribute)compositeListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeListType_Encapsulation() {
		return (EReference)compositeListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeListType_Composite() {
		return (EReference)compositeListTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeType() {
		return compositeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeType_Constituent() {
		return (EReference)compositeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeType_Id() {
		return (EAttribute)compositeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeType_Mimeparameters() {
		return (EAttribute)compositeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeType_Mimetype() {
		return (EAttribute)compositeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstituentType() {
		return constituentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstituentType_Idref() {
		return (EAttribute)constituentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversationConstraintsType() {
		return conversationConstraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversationConstraintsType_ConcurrentConversations() {
		return (EAttribute)conversationConstraintsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversationConstraintsType_InvocationLimit() {
		return (EAttribute)conversationConstraintsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeliveryChannelType() {
		return deliveryChannelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeliveryChannelType_Characteristics() {
		return (EReference)deliveryChannelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryChannelType_ChannelId() {
		return (EAttribute)deliveryChannelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryChannelType_DocExchangeId() {
		return (EAttribute)deliveryChannelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeliveryChannelType_TransportId() {
		return (EAttribute)deliveryChannelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalEnvelopeType() {
		return digitalEnvelopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalEnvelopeType_Protocol() {
		return (EReference)digitalEnvelopeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalEnvelopeType_EncryptionAlgorithm() {
		return (EAttribute)digitalEnvelopeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDigitalEnvelopeType_CertificateRef() {
		return (EReference)digitalEnvelopeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocExchangeType() {
		return docExchangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocExchangeType_EbXMLBinding() {
		return (EReference)docExchangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocExchangeType_DocExchangeId() {
		return (EAttribute)docExchangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Certificate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CertificateRef() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Characteristics() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CollaborationProtocolAgreement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CollaborationProtocolProfile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CollaborationRole() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Comment() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Constituent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConversationConstraints() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeliveryChannel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DigitalEnvelope() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocExchange() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EbXMLBinding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EncryptionAlgorithm() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_End() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Endpoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HashFunction() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NamespaceSupported() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NonRepudiation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Override() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Packaging() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PartyId() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PartyInfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PartyRef() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProcessSpecification() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Protocol() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReceivingProtocol() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReliableMessaging() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Retries() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RetryInterval() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Role() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SendingProtocol() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Service() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ServiceBinding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SignatureAlgorithm() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Start() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Status() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transport() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransportSecurity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Type() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Id() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Idref() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SyncReplyMode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Version() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEbXMLBindingType() {
		return ebXMLBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEbXMLBindingType_ReliableMessaging() {
		return (EReference)ebXMLBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEbXMLBindingType_NonRepudiation() {
		return (EReference)ebXMLBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEbXMLBindingType_DigitalEnvelope() {
		return (EReference)ebXMLBindingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEbXMLBindingType_NamespaceSupported() {
		return (EReference)ebXMLBindingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEbXMLBindingType_Version() {
		return (EAttribute)ebXMLBindingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncapsulationType() {
		return encapsulationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulationType_Constituent() {
		return (EReference)encapsulationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulationType_Id() {
		return (EAttribute)encapsulationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulationType_Mimeparameters() {
		return (EAttribute)encapsulationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulationType_Mimetype() {
		return (EAttribute)encapsulationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointType() {
		return endpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointType_Type() {
		return (EAttribute)endpointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointType_Uri() {
		return (EAttribute)endpointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceSupportedType() {
		return namespaceSupportedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceSupportedType_Value() {
		return (EAttribute)namespaceSupportedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceSupportedType_Location() {
		return (EAttribute)namespaceSupportedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceSupportedType_Version() {
		return (EAttribute)namespaceSupportedTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonRepudiationType() {
		return nonRepudiationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonRepudiationType_Protocol() {
		return (EReference)nonRepudiationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonRepudiationType_HashFunction() {
		return (EAttribute)nonRepudiationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonRepudiationType_SignatureAlgorithm() {
		return (EAttribute)nonRepudiationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonRepudiationType_CertificateRef() {
		return (EReference)nonRepudiationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverrideType() {
		return overrideTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverrideType_Action() {
		return (EAttribute)overrideTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverrideType_ChannelId() {
		return (EAttribute)overrideTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverrideType_Href() {
		return (EAttribute)overrideTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverrideType_PackageId() {
		return (EAttribute)overrideTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverrideType_Type() {
		return (EAttribute)overrideTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackagingType() {
		return packagingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackagingType_ProcessingCapabilities() {
		return (EReference)packagingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackagingType_SimplePart() {
		return (EReference)packagingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackagingType_CompositeList() {
		return (EReference)packagingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackagingType_Id() {
		return (EAttribute)packagingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartyIdType() {
		return partyIdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartyIdType_Value() {
		return (EAttribute)partyIdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartyIdType_Type() {
		return (EAttribute)partyIdTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartyInfoType() {
		return partyInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartyInfoType_PartyId() {
		return (EReference)partyInfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartyInfoType_PartyRef() {
		return (EReference)partyInfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartyInfoType_CollaborationRole() {
		return (EReference)partyInfoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartyInfoType_Certificate() {
		return (EReference)partyInfoTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartyInfoType_DeliveryChannel() {
		return (EReference)partyInfoTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartyInfoType_Transport() {
		return (EReference)partyInfoTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartyInfoType_DocExchange() {
		return (EReference)partyInfoTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartyRefType() {
		return partyRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartyRefType_Href() {
		return (EAttribute)partyRefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartyRefType_Type() {
		return (EAttribute)partyRefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartyRefType_Type1() {
		return (EAttribute)partyRefTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingCapabilitiesType() {
		return processingCapabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingCapabilitiesType_Generate() {
		return (EAttribute)processingCapabilitiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingCapabilitiesType_Parse() {
		return (EAttribute)processingCapabilitiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessSpecificationType() {
		return processSpecificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSpecificationType_Reference() {
		return (EReference)processSpecificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessSpecificationType_Href() {
		return (EAttribute)processSpecificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessSpecificationType_Name() {
		return (EAttribute)processSpecificationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessSpecificationType_Type() {
		return (EAttribute)processSpecificationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessSpecificationType_Version() {
		return (EAttribute)processSpecificationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolType() {
		return protocolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolType_Value() {
		return (EAttribute)protocolTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolType_Version() {
		return (EAttribute)protocolTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReliableMessagingType() {
		return reliableMessagingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliableMessagingType_Retries() {
		return (EAttribute)reliableMessagingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliableMessagingType_RetryInterval() {
		return (EAttribute)reliableMessagingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliableMessagingType_PersistDuration() {
		return (EAttribute)reliableMessagingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliableMessagingType_DeliverySemantics() {
		return (EAttribute)reliableMessagingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliableMessagingType_Idempotency() {
		return (EAttribute)reliableMessagingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliableMessagingType_MessageOrderSemantics() {
		return (EAttribute)reliableMessagingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleType() {
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleType_Href() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleType_Name() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleType_Type() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBindingType() {
		return serviceBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBindingType_Service() {
		return (EReference)serviceBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceBindingType_Override() {
		return (EReference)serviceBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBindingType_ChannelId() {
		return (EAttribute)serviceBindingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBindingType_PackageId() {
		return (EAttribute)serviceBindingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceType() {
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceType_Value() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceType_Type() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimplePartType() {
		return simplePartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplePartType_NamespaceSupported() {
		return (EReference)simplePartTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimplePartType_Id() {
		return (EAttribute)simplePartTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimplePartType_Mimeparameters() {
		return (EAttribute)simplePartTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimplePartType_Mimetype() {
		return (EAttribute)simplePartTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusType() {
		return statusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusType_Value() {
		return (EAttribute)statusTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportSecurityType() {
		return transportSecurityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportSecurityType_Protocol() {
		return (EReference)transportSecurityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportSecurityType_CertificateRef() {
		return (EReference)transportSecurityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportType() {
		return transportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportType_SendingProtocol() {
		return (EReference)transportTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportType_ReceivingProtocol() {
		return (EReference)transportTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportType_Endpoint() {
		return (EReference)transportTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportType_TransportSecurity() {
		return (EReference)transportTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportType_TransportId() {
		return (EAttribute)transportTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDsType() {
		return dsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEndpointTypeType() {
		return endpointTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMosType() {
		return mosTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusValueType() {
		return statusValueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSyncReplyModeType() {
		return syncReplyModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDsTypeObject() {
		return dsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEndpointTypeTypeObject() {
		return endpointTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMosTypeObject() {
		return mosTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonEmptyString() {
		return nonEmptyStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStatusValueTypeObject() {
		return statusValueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSyncReplyModeTypeObject() {
		return syncReplyModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerFactory getPartnerFactory() {
		return (PartnerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		certificateRefTypeEClass = createEClass(CERTIFICATE_REF_TYPE);
		createEAttribute(certificateRefTypeEClass, CERTIFICATE_REF_TYPE__CERT_ID);

		certificateTypeEClass = createEClass(CERTIFICATE_TYPE);
		createEReference(certificateTypeEClass, CERTIFICATE_TYPE__KEY_INFO);
		createEAttribute(certificateTypeEClass, CERTIFICATE_TYPE__CERT_ID);

		characteristicsTypeEClass = createEClass(CHARACTERISTICS_TYPE);
		createEAttribute(characteristicsTypeEClass, CHARACTERISTICS_TYPE__AUTHENTICATED);
		createEAttribute(characteristicsTypeEClass, CHARACTERISTICS_TYPE__AUTHORIZED);
		createEAttribute(characteristicsTypeEClass, CHARACTERISTICS_TYPE__CONFIDENTIALITY);
		createEAttribute(characteristicsTypeEClass, CHARACTERISTICS_TYPE__NONREPUDIATION_OF_ORIGIN);
		createEAttribute(characteristicsTypeEClass, CHARACTERISTICS_TYPE__NONREPUDIATION_OF_RECEIPT);
		createEAttribute(characteristicsTypeEClass, CHARACTERISTICS_TYPE__SECURE_TRANSPORT);
		createEAttribute(characteristicsTypeEClass, CHARACTERISTICS_TYPE__SYNC_REPLY_MODE);

		collaborationProtocolAgreementTypeEClass = createEClass(COLLABORATION_PROTOCOL_AGREEMENT_TYPE);
		createEReference(collaborationProtocolAgreementTypeEClass, COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS);
		createEAttribute(collaborationProtocolAgreementTypeEClass, COLLABORATION_PROTOCOL_AGREEMENT_TYPE__START);
		createEAttribute(collaborationProtocolAgreementTypeEClass, COLLABORATION_PROTOCOL_AGREEMENT_TYPE__END);
		createEReference(collaborationProtocolAgreementTypeEClass, COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS);
		createEReference(collaborationProtocolAgreementTypeEClass, COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PARTY_INFO);
		createEReference(collaborationProtocolAgreementTypeEClass, COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING);
		createEReference(collaborationProtocolAgreementTypeEClass, COLLABORATION_PROTOCOL_AGREEMENT_TYPE__SIGNATURE);
		createEReference(collaborationProtocolAgreementTypeEClass, COLLABORATION_PROTOCOL_AGREEMENT_TYPE__COMMENT);
		createEAttribute(collaborationProtocolAgreementTypeEClass, COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CPAID);
		createEAttribute(collaborationProtocolAgreementTypeEClass, COLLABORATION_PROTOCOL_AGREEMENT_TYPE__VERSION);
		createEAttribute(collaborationProtocolAgreementTypeEClass, COLLABORATION_PROTOCOL_AGREEMENT_TYPE__ANY_ATTRIBUTE);

		collaborationProtocolProfileTypeEClass = createEClass(COLLABORATION_PROTOCOL_PROFILE_TYPE);
		createEReference(collaborationProtocolProfileTypeEClass, COLLABORATION_PROTOCOL_PROFILE_TYPE__PARTY_INFO);
		createEReference(collaborationProtocolProfileTypeEClass, COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING);
		createEReference(collaborationProtocolProfileTypeEClass, COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE);
		createEReference(collaborationProtocolProfileTypeEClass, COLLABORATION_PROTOCOL_PROFILE_TYPE__COMMENT);
		createEAttribute(collaborationProtocolProfileTypeEClass, COLLABORATION_PROTOCOL_PROFILE_TYPE__VERSION);
		createEAttribute(collaborationProtocolProfileTypeEClass, COLLABORATION_PROTOCOL_PROFILE_TYPE__ANY_ATTRIBUTE);

		collaborationRoleTypeEClass = createEClass(COLLABORATION_ROLE_TYPE);
		createEReference(collaborationRoleTypeEClass, COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION);
		createEReference(collaborationRoleTypeEClass, COLLABORATION_ROLE_TYPE__ROLE);
		createEReference(collaborationRoleTypeEClass, COLLABORATION_ROLE_TYPE__CERTIFICATE_REF);
		createEReference(collaborationRoleTypeEClass, COLLABORATION_ROLE_TYPE__SERVICE_BINDING);
		createEAttribute(collaborationRoleTypeEClass, COLLABORATION_ROLE_TYPE__ID);

		commentTypeEClass = createEClass(COMMENT_TYPE);
		createEAttribute(commentTypeEClass, COMMENT_TYPE__VALUE);
		createEAttribute(commentTypeEClass, COMMENT_TYPE__LANG);

		compositeListTypeEClass = createEClass(COMPOSITE_LIST_TYPE);
		createEAttribute(compositeListTypeEClass, COMPOSITE_LIST_TYPE__GROUP);
		createEReference(compositeListTypeEClass, COMPOSITE_LIST_TYPE__ENCAPSULATION);
		createEReference(compositeListTypeEClass, COMPOSITE_LIST_TYPE__COMPOSITE);

		compositeTypeEClass = createEClass(COMPOSITE_TYPE);
		createEReference(compositeTypeEClass, COMPOSITE_TYPE__CONSTITUENT);
		createEAttribute(compositeTypeEClass, COMPOSITE_TYPE__ID);
		createEAttribute(compositeTypeEClass, COMPOSITE_TYPE__MIMEPARAMETERS);
		createEAttribute(compositeTypeEClass, COMPOSITE_TYPE__MIMETYPE);

		constituentTypeEClass = createEClass(CONSTITUENT_TYPE);
		createEAttribute(constituentTypeEClass, CONSTITUENT_TYPE__IDREF);

		conversationConstraintsTypeEClass = createEClass(CONVERSATION_CONSTRAINTS_TYPE);
		createEAttribute(conversationConstraintsTypeEClass, CONVERSATION_CONSTRAINTS_TYPE__CONCURRENT_CONVERSATIONS);
		createEAttribute(conversationConstraintsTypeEClass, CONVERSATION_CONSTRAINTS_TYPE__INVOCATION_LIMIT);

		deliveryChannelTypeEClass = createEClass(DELIVERY_CHANNEL_TYPE);
		createEReference(deliveryChannelTypeEClass, DELIVERY_CHANNEL_TYPE__CHARACTERISTICS);
		createEAttribute(deliveryChannelTypeEClass, DELIVERY_CHANNEL_TYPE__CHANNEL_ID);
		createEAttribute(deliveryChannelTypeEClass, DELIVERY_CHANNEL_TYPE__DOC_EXCHANGE_ID);
		createEAttribute(deliveryChannelTypeEClass, DELIVERY_CHANNEL_TYPE__TRANSPORT_ID);

		digitalEnvelopeTypeEClass = createEClass(DIGITAL_ENVELOPE_TYPE);
		createEReference(digitalEnvelopeTypeEClass, DIGITAL_ENVELOPE_TYPE__PROTOCOL);
		createEAttribute(digitalEnvelopeTypeEClass, DIGITAL_ENVELOPE_TYPE__ENCRYPTION_ALGORITHM);
		createEReference(digitalEnvelopeTypeEClass, DIGITAL_ENVELOPE_TYPE__CERTIFICATE_REF);

		docExchangeTypeEClass = createEClass(DOC_EXCHANGE_TYPE);
		createEReference(docExchangeTypeEClass, DOC_EXCHANGE_TYPE__EB_XML_BINDING);
		createEAttribute(docExchangeTypeEClass, DOC_EXCHANGE_TYPE__DOC_EXCHANGE_ID);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CERTIFICATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CERTIFICATE_REF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHARACTERISTICS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLLABORATION_PROTOCOL_AGREEMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLLABORATION_PROTOCOL_PROFILE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLLABORATION_ROLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONSTITUENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONVERSATION_CONSTRAINTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DELIVERY_CHANNEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIGITAL_ENVELOPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOC_EXCHANGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EB_XML_BINDING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ENCRYPTION_ALGORITHM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__END);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENDPOINT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HASH_FUNCTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAMESPACE_SUPPORTED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NON_REPUDIATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OVERRIDE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PACKAGING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARTY_ID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARTY_INFO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARTY_REF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROCESS_SPECIFICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROTOCOL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RECEIVING_PROTOCOL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELIABLE_MESSAGING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RETRIES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RETRY_INTERVAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SENDING_PROTOCOL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE_BINDING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_ALGORITHM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__START);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STATUS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSPORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSPORT_SECURITY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IDREF);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SYNC_REPLY_MODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VERSION);

		ebXMLBindingTypeEClass = createEClass(EB_XML_BINDING_TYPE);
		createEReference(ebXMLBindingTypeEClass, EB_XML_BINDING_TYPE__RELIABLE_MESSAGING);
		createEReference(ebXMLBindingTypeEClass, EB_XML_BINDING_TYPE__NON_REPUDIATION);
		createEReference(ebXMLBindingTypeEClass, EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE);
		createEReference(ebXMLBindingTypeEClass, EB_XML_BINDING_TYPE__NAMESPACE_SUPPORTED);
		createEAttribute(ebXMLBindingTypeEClass, EB_XML_BINDING_TYPE__VERSION);

		encapsulationTypeEClass = createEClass(ENCAPSULATION_TYPE);
		createEReference(encapsulationTypeEClass, ENCAPSULATION_TYPE__CONSTITUENT);
		createEAttribute(encapsulationTypeEClass, ENCAPSULATION_TYPE__ID);
		createEAttribute(encapsulationTypeEClass, ENCAPSULATION_TYPE__MIMEPARAMETERS);
		createEAttribute(encapsulationTypeEClass, ENCAPSULATION_TYPE__MIMETYPE);

		endpointTypeEClass = createEClass(ENDPOINT_TYPE);
		createEAttribute(endpointTypeEClass, ENDPOINT_TYPE__TYPE);
		createEAttribute(endpointTypeEClass, ENDPOINT_TYPE__URI);

		namespaceSupportedTypeEClass = createEClass(NAMESPACE_SUPPORTED_TYPE);
		createEAttribute(namespaceSupportedTypeEClass, NAMESPACE_SUPPORTED_TYPE__VALUE);
		createEAttribute(namespaceSupportedTypeEClass, NAMESPACE_SUPPORTED_TYPE__LOCATION);
		createEAttribute(namespaceSupportedTypeEClass, NAMESPACE_SUPPORTED_TYPE__VERSION);

		nonRepudiationTypeEClass = createEClass(NON_REPUDIATION_TYPE);
		createEReference(nonRepudiationTypeEClass, NON_REPUDIATION_TYPE__PROTOCOL);
		createEAttribute(nonRepudiationTypeEClass, NON_REPUDIATION_TYPE__HASH_FUNCTION);
		createEAttribute(nonRepudiationTypeEClass, NON_REPUDIATION_TYPE__SIGNATURE_ALGORITHM);
		createEReference(nonRepudiationTypeEClass, NON_REPUDIATION_TYPE__CERTIFICATE_REF);

		overrideTypeEClass = createEClass(OVERRIDE_TYPE);
		createEAttribute(overrideTypeEClass, OVERRIDE_TYPE__ACTION);
		createEAttribute(overrideTypeEClass, OVERRIDE_TYPE__CHANNEL_ID);
		createEAttribute(overrideTypeEClass, OVERRIDE_TYPE__HREF);
		createEAttribute(overrideTypeEClass, OVERRIDE_TYPE__PACKAGE_ID);
		createEAttribute(overrideTypeEClass, OVERRIDE_TYPE__TYPE);

		packagingTypeEClass = createEClass(PACKAGING_TYPE);
		createEReference(packagingTypeEClass, PACKAGING_TYPE__PROCESSING_CAPABILITIES);
		createEReference(packagingTypeEClass, PACKAGING_TYPE__SIMPLE_PART);
		createEReference(packagingTypeEClass, PACKAGING_TYPE__COMPOSITE_LIST);
		createEAttribute(packagingTypeEClass, PACKAGING_TYPE__ID);

		partyIdTypeEClass = createEClass(PARTY_ID_TYPE);
		createEAttribute(partyIdTypeEClass, PARTY_ID_TYPE__VALUE);
		createEAttribute(partyIdTypeEClass, PARTY_ID_TYPE__TYPE);

		partyInfoTypeEClass = createEClass(PARTY_INFO_TYPE);
		createEReference(partyInfoTypeEClass, PARTY_INFO_TYPE__PARTY_ID);
		createEReference(partyInfoTypeEClass, PARTY_INFO_TYPE__PARTY_REF);
		createEReference(partyInfoTypeEClass, PARTY_INFO_TYPE__COLLABORATION_ROLE);
		createEReference(partyInfoTypeEClass, PARTY_INFO_TYPE__CERTIFICATE);
		createEReference(partyInfoTypeEClass, PARTY_INFO_TYPE__DELIVERY_CHANNEL);
		createEReference(partyInfoTypeEClass, PARTY_INFO_TYPE__TRANSPORT);
		createEReference(partyInfoTypeEClass, PARTY_INFO_TYPE__DOC_EXCHANGE);

		partyRefTypeEClass = createEClass(PARTY_REF_TYPE);
		createEAttribute(partyRefTypeEClass, PARTY_REF_TYPE__HREF);
		createEAttribute(partyRefTypeEClass, PARTY_REF_TYPE__TYPE);
		createEAttribute(partyRefTypeEClass, PARTY_REF_TYPE__TYPE1);

		processingCapabilitiesTypeEClass = createEClass(PROCESSING_CAPABILITIES_TYPE);
		createEAttribute(processingCapabilitiesTypeEClass, PROCESSING_CAPABILITIES_TYPE__GENERATE);
		createEAttribute(processingCapabilitiesTypeEClass, PROCESSING_CAPABILITIES_TYPE__PARSE);

		processSpecificationTypeEClass = createEClass(PROCESS_SPECIFICATION_TYPE);
		createEReference(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__REFERENCE);
		createEAttribute(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__HREF);
		createEAttribute(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__NAME);
		createEAttribute(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__TYPE);
		createEAttribute(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__VERSION);

		protocolTypeEClass = createEClass(PROTOCOL_TYPE);
		createEAttribute(protocolTypeEClass, PROTOCOL_TYPE__VALUE);
		createEAttribute(protocolTypeEClass, PROTOCOL_TYPE__VERSION);

		reliableMessagingTypeEClass = createEClass(RELIABLE_MESSAGING_TYPE);
		createEAttribute(reliableMessagingTypeEClass, RELIABLE_MESSAGING_TYPE__RETRIES);
		createEAttribute(reliableMessagingTypeEClass, RELIABLE_MESSAGING_TYPE__RETRY_INTERVAL);
		createEAttribute(reliableMessagingTypeEClass, RELIABLE_MESSAGING_TYPE__PERSIST_DURATION);
		createEAttribute(reliableMessagingTypeEClass, RELIABLE_MESSAGING_TYPE__DELIVERY_SEMANTICS);
		createEAttribute(reliableMessagingTypeEClass, RELIABLE_MESSAGING_TYPE__IDEMPOTENCY);
		createEAttribute(reliableMessagingTypeEClass, RELIABLE_MESSAGING_TYPE__MESSAGE_ORDER_SEMANTICS);

		roleTypeEClass = createEClass(ROLE_TYPE);
		createEAttribute(roleTypeEClass, ROLE_TYPE__HREF);
		createEAttribute(roleTypeEClass, ROLE_TYPE__NAME);
		createEAttribute(roleTypeEClass, ROLE_TYPE__TYPE);

		serviceBindingTypeEClass = createEClass(SERVICE_BINDING_TYPE);
		createEReference(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__SERVICE);
		createEReference(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__OVERRIDE);
		createEAttribute(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__CHANNEL_ID);
		createEAttribute(serviceBindingTypeEClass, SERVICE_BINDING_TYPE__PACKAGE_ID);

		serviceTypeEClass = createEClass(SERVICE_TYPE);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__VALUE);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__TYPE);

		simplePartTypeEClass = createEClass(SIMPLE_PART_TYPE);
		createEReference(simplePartTypeEClass, SIMPLE_PART_TYPE__NAMESPACE_SUPPORTED);
		createEAttribute(simplePartTypeEClass, SIMPLE_PART_TYPE__ID);
		createEAttribute(simplePartTypeEClass, SIMPLE_PART_TYPE__MIMEPARAMETERS);
		createEAttribute(simplePartTypeEClass, SIMPLE_PART_TYPE__MIMETYPE);

		statusTypeEClass = createEClass(STATUS_TYPE);
		createEAttribute(statusTypeEClass, STATUS_TYPE__VALUE);

		transportSecurityTypeEClass = createEClass(TRANSPORT_SECURITY_TYPE);
		createEReference(transportSecurityTypeEClass, TRANSPORT_SECURITY_TYPE__PROTOCOL);
		createEReference(transportSecurityTypeEClass, TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF);

		transportTypeEClass = createEClass(TRANSPORT_TYPE);
		createEReference(transportTypeEClass, TRANSPORT_TYPE__SENDING_PROTOCOL);
		createEReference(transportTypeEClass, TRANSPORT_TYPE__RECEIVING_PROTOCOL);
		createEReference(transportTypeEClass, TRANSPORT_TYPE__ENDPOINT);
		createEReference(transportTypeEClass, TRANSPORT_TYPE__TRANSPORT_SECURITY);
		createEAttribute(transportTypeEClass, TRANSPORT_TYPE__TRANSPORT_ID);

		// Create enums
		dsTypeEEnum = createEEnum(DS_TYPE);
		endpointTypeTypeEEnum = createEEnum(ENDPOINT_TYPE_TYPE);
		mosTypeEEnum = createEEnum(MOS_TYPE);
		statusValueTypeEEnum = createEEnum(STATUS_VALUE_TYPE);
		syncReplyModeTypeEEnum = createEEnum(SYNC_REPLY_MODE_TYPE);

		// Create data types
		dsTypeObjectEDataType = createEDataType(DS_TYPE_OBJECT);
		endpointTypeTypeObjectEDataType = createEDataType(ENDPOINT_TYPE_TYPE_OBJECT);
		mosTypeObjectEDataType = createEDataType(MOS_TYPE_OBJECT);
		nonEmptyStringEDataType = createEDataType(NON_EMPTY_STRING);
		statusValueTypeObjectEDataType = createEDataType(STATUS_VALUE_TYPE_OBJECT);
		syncReplyModeTypeObjectEDataType = createEDataType(SYNC_REPLY_MODE_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		XmldsigPackage theXmldsigPackage = (XmldsigPackage)EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI);
		XlinkPackage theXlinkPackage = (XlinkPackage)EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(certificateRefTypeEClass, CertificateRefType.class, "CertificateRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificateRefType_CertId(), theXMLTypePackage.getIDREF(), "certId", null, 1, 1, CertificateRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificateTypeEClass, CertificateType.class, "CertificateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCertificateType_KeyInfo(), theXmldsigPackage.getKeyInfoType(), null, "keyInfo", null, 1, 1, CertificateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateType_CertId(), theXMLTypePackage.getID(), "certId", null, 1, 1, CertificateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicsTypeEClass, CharacteristicsType.class, "CharacteristicsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacteristicsType_Authenticated(), theXMLTypePackage.getBoolean(), "authenticated", null, 0, 1, CharacteristicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristicsType_Authorized(), theXMLTypePackage.getBoolean(), "authorized", null, 0, 1, CharacteristicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristicsType_Confidentiality(), theXMLTypePackage.getBoolean(), "confidentiality", null, 0, 1, CharacteristicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristicsType_NonrepudiationOfOrigin(), theXMLTypePackage.getBoolean(), "nonrepudiationOfOrigin", null, 0, 1, CharacteristicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristicsType_NonrepudiationOfReceipt(), theXMLTypePackage.getBoolean(), "nonrepudiationOfReceipt", null, 0, 1, CharacteristicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristicsType_SecureTransport(), theXMLTypePackage.getBoolean(), "secureTransport", null, 0, 1, CharacteristicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristicsType_SyncReplyMode(), this.getSyncReplyModeType(), "syncReplyMode", null, 0, 1, CharacteristicsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborationProtocolAgreementTypeEClass, CollaborationProtocolAgreementType.class, "CollaborationProtocolAgreementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborationProtocolAgreementType_Status(), this.getStatusType(), null, "status", null, 1, 1, CollaborationProtocolAgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationProtocolAgreementType_Start(), theXMLTypePackage.getDateTime(), "start", null, 1, 1, CollaborationProtocolAgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationProtocolAgreementType_End(), theXMLTypePackage.getDateTime(), "end", null, 1, 1, CollaborationProtocolAgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationProtocolAgreementType_ConversationConstraints(), this.getConversationConstraintsType(), null, "conversationConstraints", null, 0, 1, CollaborationProtocolAgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationProtocolAgreementType_PartyInfo(), this.getPartyInfoType(), null, "partyInfo", null, 1, -1, CollaborationProtocolAgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationProtocolAgreementType_Packaging(), this.getPackagingType(), null, "packaging", null, 1, 1, CollaborationProtocolAgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationProtocolAgreementType_Signature(), theXmldsigPackage.getSignatureType(), null, "signature", null, 0, -1, CollaborationProtocolAgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationProtocolAgreementType_Comment(), this.getCommentType(), null, "comment", null, 0, -1, CollaborationProtocolAgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationProtocolAgreementType_Cpaid(), this.getNonEmptyString(), "cpaid", null, 0, 1, CollaborationProtocolAgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationProtocolAgreementType_Version(), this.getNonEmptyString(), "version", null, 0, 1, CollaborationProtocolAgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationProtocolAgreementType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, CollaborationProtocolAgreementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborationProtocolProfileTypeEClass, CollaborationProtocolProfileType.class, "CollaborationProtocolProfileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborationProtocolProfileType_PartyInfo(), this.getPartyInfoType(), null, "partyInfo", null, 1, -1, CollaborationProtocolProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationProtocolProfileType_Packaging(), this.getPackagingType(), null, "packaging", null, 1, 1, CollaborationProtocolProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationProtocolProfileType_Signature(), theXmldsigPackage.getSignatureType(), null, "signature", null, 0, 1, CollaborationProtocolProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationProtocolProfileType_Comment(), this.getCommentType(), null, "comment", null, 0, -1, CollaborationProtocolProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationProtocolProfileType_Version(), this.getNonEmptyString(), "version", null, 0, 1, CollaborationProtocolProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationProtocolProfileType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, CollaborationProtocolProfileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborationRoleTypeEClass, CollaborationRoleType.class, "CollaborationRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborationRoleType_ProcessSpecification(), this.getProcessSpecificationType(), null, "processSpecification", null, 1, 1, CollaborationRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationRoleType_Role(), this.getRoleType(), null, "role", null, 1, 1, CollaborationRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationRoleType_CertificateRef(), this.getCertificateRefType(), null, "certificateRef", null, 0, 1, CollaborationRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborationRoleType_ServiceBinding(), this.getServiceBindingType(), null, "serviceBinding", null, 1, -1, CollaborationRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationRoleType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CollaborationRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentTypeEClass, CommentType.class, "CommentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentType_Value(), this.getNonEmptyString(), "value", null, 0, 1, CommentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommentType_Lang(), theXMLTypePackage.getLanguage(), "lang", null, 0, 1, CommentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeListTypeEClass, CompositeListType.class, "CompositeListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeListType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CompositeListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeListType_Encapsulation(), this.getEncapsulationType(), null, "encapsulation", null, 0, -1, CompositeListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeListType_Composite(), this.getCompositeType(), null, "composite", null, 0, -1, CompositeListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(compositeTypeEClass, CompositeType.class, "CompositeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeType_Constituent(), this.getConstituentType(), null, "constituent", null, 1, -1, CompositeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CompositeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeType_Mimeparameters(), this.getNonEmptyString(), "mimeparameters", null, 0, 1, CompositeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeType_Mimetype(), this.getNonEmptyString(), "mimetype", null, 1, 1, CompositeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constituentTypeEClass, ConstituentType.class, "ConstituentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstituentType_Idref(), theXMLTypePackage.getIDREF(), "idref", null, 0, 1, ConstituentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conversationConstraintsTypeEClass, ConversationConstraintsType.class, "ConversationConstraintsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConversationConstraintsType_ConcurrentConversations(), theXMLTypePackage.getInt(), "concurrentConversations", null, 0, 1, ConversationConstraintsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConversationConstraintsType_InvocationLimit(), theXMLTypePackage.getInt(), "invocationLimit", null, 0, 1, ConversationConstraintsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliveryChannelTypeEClass, DeliveryChannelType.class, "DeliveryChannelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeliveryChannelType_Characteristics(), this.getCharacteristicsType(), null, "characteristics", null, 1, 1, DeliveryChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryChannelType_ChannelId(), theXMLTypePackage.getID(), "channelId", null, 1, 1, DeliveryChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryChannelType_DocExchangeId(), theXMLTypePackage.getIDREF(), "docExchangeId", null, 1, 1, DeliveryChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryChannelType_TransportId(), theXMLTypePackage.getIDREF(), "transportId", null, 1, 1, DeliveryChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalEnvelopeTypeEClass, DigitalEnvelopeType.class, "DigitalEnvelopeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDigitalEnvelopeType_Protocol(), this.getProtocolType(), null, "protocol", null, 1, 1, DigitalEnvelopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigitalEnvelopeType_EncryptionAlgorithm(), theXMLTypePackage.getString(), "encryptionAlgorithm", null, 1, 1, DigitalEnvelopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDigitalEnvelopeType_CertificateRef(), this.getCertificateRefType(), null, "certificateRef", null, 1, 1, DigitalEnvelopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(docExchangeTypeEClass, DocExchangeType.class, "DocExchangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocExchangeType_EbXMLBinding(), this.getEbXMLBindingType(), null, "ebXMLBinding", null, 1, 1, DocExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocExchangeType_DocExchangeId(), theXMLTypePackage.getID(), "docExchangeId", null, 1, 1, DocExchangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Certificate(), this.getCertificateType(), null, "certificate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CertificateRef(), this.getCertificateRefType(), null, "certificateRef", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Characteristics(), this.getCharacteristicsType(), null, "characteristics", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CollaborationProtocolAgreement(), this.getCollaborationProtocolAgreementType(), null, "collaborationProtocolAgreement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CollaborationProtocolProfile(), this.getCollaborationProtocolProfileType(), null, "collaborationProtocolProfile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CollaborationRole(), this.getCollaborationRoleType(), null, "collaborationRole", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Comment(), this.getCommentType(), null, "comment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Constituent(), this.getConstituentType(), null, "constituent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConversationConstraints(), this.getConversationConstraintsType(), null, "conversationConstraints", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DeliveryChannel(), this.getDeliveryChannelType(), null, "deliveryChannel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DigitalEnvelope(), this.getDigitalEnvelopeType(), null, "digitalEnvelope", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DocExchange(), this.getDocExchangeType(), null, "docExchange", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EbXMLBinding(), this.getEbXMLBindingType(), null, "ebXMLBinding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EncryptionAlgorithm(), theXMLTypePackage.getString(), "encryptionAlgorithm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_End(), theXMLTypePackage.getDateTime(), "end", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Endpoint(), this.getEndpointType(), null, "endpoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HashFunction(), theXMLTypePackage.getString(), "hashFunction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NamespaceSupported(), this.getNamespaceSupportedType(), null, "namespaceSupported", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NonRepudiation(), this.getNonRepudiationType(), null, "nonRepudiation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Override(), this.getOverrideType(), null, "override", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Packaging(), this.getPackagingType(), null, "packaging", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PartyId(), this.getPartyIdType(), null, "partyId", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PartyInfo(), this.getPartyInfoType(), null, "partyInfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PartyRef(), this.getPartyRefType(), null, "partyRef", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProcessSpecification(), this.getProcessSpecificationType(), null, "processSpecification", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Protocol(), this.getProtocolType(), null, "protocol", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReceivingProtocol(), this.getProtocolType(), null, "receivingProtocol", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReliableMessaging(), this.getReliableMessagingType(), null, "reliableMessaging", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Retries(), theXMLTypePackage.getString(), "retries", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RetryInterval(), theXMLTypePackage.getString(), "retryInterval", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Role(), this.getRoleType(), null, "role", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SendingProtocol(), this.getProtocolType(), null, "sendingProtocol", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Service(), this.getServiceType(), null, "service", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ServiceBinding(), this.getServiceBindingType(), null, "serviceBinding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SignatureAlgorithm(), theXMLTypePackage.getString(), "signatureAlgorithm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Start(), theXMLTypePackage.getDateTime(), "start", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Status(), this.getStatusType(), null, "status", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transport(), this.getTransportType(), null, "transport", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TransportSecurity(), this.getTransportSecurityType(), null, "transportSecurity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Type(), theXMLTypePackage.getString(), "type", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Idref(), theXMLTypePackage.getIDREF(), "idref", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SyncReplyMode(), this.getSyncReplyModeType(), "syncReplyMode", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Version(), this.getNonEmptyString(), "version", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ebXMLBindingTypeEClass, EbXMLBindingType.class, "EbXMLBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEbXMLBindingType_ReliableMessaging(), this.getReliableMessagingType(), null, "reliableMessaging", null, 0, 1, EbXMLBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEbXMLBindingType_NonRepudiation(), this.getNonRepudiationType(), null, "nonRepudiation", null, 0, 1, EbXMLBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEbXMLBindingType_DigitalEnvelope(), this.getDigitalEnvelopeType(), null, "digitalEnvelope", null, 0, 1, EbXMLBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEbXMLBindingType_NamespaceSupported(), this.getNamespaceSupportedType(), null, "namespaceSupported", null, 0, -1, EbXMLBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEbXMLBindingType_Version(), this.getNonEmptyString(), "version", null, 0, 1, EbXMLBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encapsulationTypeEClass, EncapsulationType.class, "EncapsulationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncapsulationType_Constituent(), this.getConstituentType(), null, "constituent", null, 1, 1, EncapsulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncapsulationType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EncapsulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncapsulationType_Mimeparameters(), this.getNonEmptyString(), "mimeparameters", null, 0, 1, EncapsulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncapsulationType_Mimetype(), this.getNonEmptyString(), "mimetype", null, 1, 1, EncapsulationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointTypeEClass, EndpointType.class, "EndpointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpointType_Type(), this.getEndpointTypeType(), "type", "allPurpose", 0, 1, EndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointType_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 1, 1, EndpointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceSupportedTypeEClass, NamespaceSupportedType.class, "NamespaceSupportedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespaceSupportedType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, NamespaceSupportedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespaceSupportedType_Location(), theXMLTypePackage.getAnyURI(), "location", null, 1, 1, NamespaceSupportedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespaceSupportedType_Version(), this.getNonEmptyString(), "version", null, 0, 1, NamespaceSupportedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonRepudiationTypeEClass, NonRepudiationType.class, "NonRepudiationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonRepudiationType_Protocol(), this.getProtocolType(), null, "protocol", null, 1, 1, NonRepudiationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonRepudiationType_HashFunction(), theXMLTypePackage.getString(), "hashFunction", null, 1, 1, NonRepudiationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonRepudiationType_SignatureAlgorithm(), theXMLTypePackage.getString(), "signatureAlgorithm", null, 1, 1, NonRepudiationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNonRepudiationType_CertificateRef(), this.getCertificateRefType(), null, "certificateRef", null, 1, 1, NonRepudiationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overrideTypeEClass, OverrideType.class, "OverrideType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverrideType_Action(), this.getNonEmptyString(), "action", null, 1, 1, OverrideType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverrideType_ChannelId(), theXMLTypePackage.getID(), "channelId", null, 1, 1, OverrideType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverrideType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, OverrideType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverrideType_PackageId(), theXMLTypePackage.getIDREF(), "packageId", null, 1, 1, OverrideType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverrideType_Type(), theXlinkPackage.getTypeType(), "type", null, 0, 1, OverrideType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packagingTypeEClass, PackagingType.class, "PackagingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackagingType_ProcessingCapabilities(), this.getProcessingCapabilitiesType(), null, "processingCapabilities", null, 1, 1, PackagingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackagingType_SimplePart(), this.getSimplePartType(), null, "simplePart", null, 1, -1, PackagingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackagingType_CompositeList(), this.getCompositeListType(), null, "compositeList", null, 0, 1, PackagingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackagingType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PackagingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyIdTypeEClass, PartyIdType.class, "PartyIdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyIdType_Value(), this.getNonEmptyString(), "value", null, 0, 1, PartyIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyIdType_Type(), this.getNonEmptyString(), "type", null, 0, 1, PartyIdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyInfoTypeEClass, PartyInfoType.class, "PartyInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartyInfoType_PartyId(), this.getPartyIdType(), null, "partyId", null, 1, -1, PartyInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInfoType_PartyRef(), this.getPartyRefType(), null, "partyRef", null, 1, 1, PartyInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInfoType_CollaborationRole(), this.getCollaborationRoleType(), null, "collaborationRole", null, 1, -1, PartyInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInfoType_Certificate(), this.getCertificateType(), null, "certificate", null, 1, -1, PartyInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInfoType_DeliveryChannel(), this.getDeliveryChannelType(), null, "deliveryChannel", null, 1, -1, PartyInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInfoType_Transport(), this.getTransportType(), null, "transport", null, 1, -1, PartyInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInfoType_DocExchange(), this.getDocExchangeType(), null, "docExchange", null, 1, -1, PartyInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyRefTypeEClass, PartyRefType.class, "PartyRefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyRefType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, PartyRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRefType_Type(), theXlinkPackage.getTypeType(), "type", null, 0, 1, PartyRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRefType_Type1(), this.getNonEmptyString(), "type1", null, 0, 1, PartyRefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingCapabilitiesTypeEClass, ProcessingCapabilitiesType.class, "ProcessingCapabilitiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingCapabilitiesType_Generate(), theXMLTypePackage.getBoolean(), "generate", null, 1, 1, ProcessingCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingCapabilitiesType_Parse(), theXMLTypePackage.getBoolean(), "parse", null, 1, 1, ProcessingCapabilitiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processSpecificationTypeEClass, ProcessSpecificationType.class, "ProcessSpecificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessSpecificationType_Reference(), theXmldsigPackage.getReferenceType(), null, "reference", null, 0, 1, ProcessSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessSpecificationType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, ProcessSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessSpecificationType_Name(), this.getNonEmptyString(), "name", null, 1, 1, ProcessSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessSpecificationType_Type(), theXlinkPackage.getTypeType(), "type", null, 0, 1, ProcessSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessSpecificationType_Version(), this.getNonEmptyString(), "version", null, 0, 1, ProcessSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolTypeEClass, ProtocolType.class, "ProtocolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocolType_Value(), this.getNonEmptyString(), "value", null, 0, 1, ProtocolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtocolType_Version(), this.getNonEmptyString(), "version", null, 0, 1, ProtocolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reliableMessagingTypeEClass, ReliableMessagingType.class, "ReliableMessagingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReliableMessagingType_Retries(), theXMLTypePackage.getString(), "retries", null, 0, 1, ReliableMessagingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReliableMessagingType_RetryInterval(), theXMLTypePackage.getString(), "retryInterval", null, 0, 1, ReliableMessagingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReliableMessagingType_PersistDuration(), theXMLTypePackage.getDuration(), "persistDuration", null, 0, 1, ReliableMessagingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReliableMessagingType_DeliverySemantics(), this.getDsType(), "deliverySemantics", null, 1, 1, ReliableMessagingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReliableMessagingType_Idempotency(), theXMLTypePackage.getBoolean(), "idempotency", null, 1, 1, ReliableMessagingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReliableMessagingType_MessageOrderSemantics(), this.getMosType(), "messageOrderSemantics", "NotGuaranteed", 0, 1, ReliableMessagingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleType_Name(), this.getNonEmptyString(), "name", null, 1, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleType_Type(), theXlinkPackage.getTypeType(), "type", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceBindingTypeEClass, ServiceBindingType.class, "ServiceBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceBindingType_Service(), this.getServiceType(), null, "service", null, 1, 1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceBindingType_Override(), this.getOverrideType(), null, "override", null, 0, -1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBindingType_ChannelId(), theXMLTypePackage.getIDREF(), "channelId", null, 1, 1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBindingType_PackageId(), theXMLTypePackage.getIDREF(), "packageId", null, 1, 1, ServiceBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceType_Value(), this.getNonEmptyString(), "value", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceType_Type(), this.getNonEmptyString(), "type", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simplePartTypeEClass, SimplePartType.class, "SimplePartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimplePartType_NamespaceSupported(), this.getNamespaceSupportedType(), null, "namespaceSupported", null, 0, -1, SimplePartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimplePartType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SimplePartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimplePartType_Mimeparameters(), this.getNonEmptyString(), "mimeparameters", null, 0, 1, SimplePartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimplePartType_Mimetype(), this.getNonEmptyString(), "mimetype", null, 1, 1, SimplePartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusTypeEClass, StatusType.class, "StatusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusType_Value(), this.getStatusValueType(), "value", null, 1, 1, StatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportSecurityTypeEClass, TransportSecurityType.class, "TransportSecurityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransportSecurityType_Protocol(), this.getProtocolType(), null, "protocol", null, 1, 1, TransportSecurityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportSecurityType_CertificateRef(), this.getCertificateRefType(), null, "certificateRef", null, 0, 1, TransportSecurityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportTypeEClass, TransportType.class, "TransportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransportType_SendingProtocol(), this.getProtocolType(), null, "sendingProtocol", null, 1, -1, TransportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportType_ReceivingProtocol(), this.getProtocolType(), null, "receivingProtocol", null, 1, 1, TransportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportType_Endpoint(), this.getEndpointType(), null, "endpoint", null, 1, -1, TransportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportType_TransportSecurity(), this.getTransportSecurityType(), null, "transportSecurity", null, 0, 1, TransportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportType_TransportId(), theXMLTypePackage.getID(), "transportId", null, 1, 1, TransportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dsTypeEEnum, DsType.class, "DsType");
		addEEnumLiteral(dsTypeEEnum, DsType.ONCE_AND_ONLY_ONCE);
		addEEnumLiteral(dsTypeEEnum, DsType.BEST_EFFORT);

		initEEnum(endpointTypeTypeEEnum, EndpointTypeType.class, "EndpointTypeType");
		addEEnumLiteral(endpointTypeTypeEEnum, EndpointTypeType.LOGIN);
		addEEnumLiteral(endpointTypeTypeEEnum, EndpointTypeType.REQUEST);
		addEEnumLiteral(endpointTypeTypeEEnum, EndpointTypeType.RESPONSE);
		addEEnumLiteral(endpointTypeTypeEEnum, EndpointTypeType.ERROR);
		addEEnumLiteral(endpointTypeTypeEEnum, EndpointTypeType.ALL_PURPOSE);

		initEEnum(mosTypeEEnum, MosType.class, "MosType");
		addEEnumLiteral(mosTypeEEnum, MosType.GUARANTEED);
		addEEnumLiteral(mosTypeEEnum, MosType.NOT_GUARANTEED);

		initEEnum(statusValueTypeEEnum, StatusValueType.class, "StatusValueType");
		addEEnumLiteral(statusValueTypeEEnum, StatusValueType.AGREED);
		addEEnumLiteral(statusValueTypeEEnum, StatusValueType.SIGNED);
		addEEnumLiteral(statusValueTypeEEnum, StatusValueType.PROPOSED);

		initEEnum(syncReplyModeTypeEEnum, SyncReplyModeType.class, "SyncReplyModeType");
		addEEnumLiteral(syncReplyModeTypeEEnum, SyncReplyModeType.RESPONSE_ONLY);
		addEEnumLiteral(syncReplyModeTypeEEnum, SyncReplyModeType.SIGNALS_AND_RESPONSE);
		addEEnumLiteral(syncReplyModeTypeEEnum, SyncReplyModeType.SIGNALS_ONLY);
		addEEnumLiteral(syncReplyModeTypeEEnum, SyncReplyModeType.NONE);

		// Initialize data types
		initEDataType(dsTypeObjectEDataType, DsType.class, "DsTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(endpointTypeTypeObjectEDataType, EndpointTypeType.class, "EndpointTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mosTypeObjectEDataType, MosType.class, "MosTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonEmptyStringEDataType, String.class, "NonEmptyString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(statusValueTypeObjectEDataType, StatusValueType.class, "StatusValueTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(syncReplyModeTypeObjectEDataType, SyncReplyModeType.class, "SyncReplyModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (certificateRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CertificateRef_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCertificateRefType_CertId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "certId"
		   });		
		addAnnotation
		  (certificateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Certificate_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCertificateType_KeyInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyInfo",
			 "namespace", "http://www.w3.org/2000/09/xmldsig#"
		   });		
		addAnnotation
		  (getCertificateType_CertId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "certId"
		   });		
		addAnnotation
		  (characteristicsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Characteristics_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCharacteristicsType_Authenticated(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "authenticated"
		   });		
		addAnnotation
		  (getCharacteristicsType_Authorized(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "authorized"
		   });		
		addAnnotation
		  (getCharacteristicsType_Confidentiality(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "confidentiality"
		   });		
		addAnnotation
		  (getCharacteristicsType_NonrepudiationOfOrigin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nonrepudiationOfOrigin"
		   });		
		addAnnotation
		  (getCharacteristicsType_NonrepudiationOfReceipt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nonrepudiationOfReceipt"
		   });		
		addAnnotation
		  (getCharacteristicsType_SecureTransport(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "secureTransport"
		   });		
		addAnnotation
		  (getCharacteristicsType_SyncReplyMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "syncReplyMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (collaborationProtocolAgreementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CollaborationProtocolAgreement_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCollaborationProtocolAgreementType_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Status",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolAgreementType_Start(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolAgreementType_End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "End",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolAgreementType_ConversationConstraints(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConversationConstraints",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolAgreementType_PartyInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PartyInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolAgreementType_Packaging(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packaging",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolAgreementType_Signature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Signature",
			 "namespace", "http://www.w3.org/2000/09/xmldsig#"
		   });		
		addAnnotation
		  (getCollaborationProtocolAgreementType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolAgreementType_Cpaid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cpaid"
		   });		
		addAnnotation
		  (getCollaborationProtocolAgreementType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolAgreementType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##targetNamespace http://www.w3.org/2000/10/XMLSchema-instance",
			 "name", ":10",
			 "processing", "lax"
		   });		
		addAnnotation
		  (collaborationProtocolProfileTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CollaborationProtocolProfile_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCollaborationProtocolProfileType_PartyInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PartyInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolProfileType_Packaging(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packaging",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolProfileType_Signature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Signature",
			 "namespace", "http://www.w3.org/2000/09/xmldsig#"
		   });		
		addAnnotation
		  (getCollaborationProtocolProfileType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolProfileType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationProtocolProfileType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##targetNamespace http://www.w3.org/2000/10/XMLSchema-instance",
			 "name", ":5",
			 "processing", "lax"
		   });		
		addAnnotation
		  (collaborationRoleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CollaborationRole_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCollaborationRoleType_ProcessSpecification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProcessSpecification",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationRoleType_Role(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Role",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationRoleType_CertificateRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CertificateRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationRoleType_ServiceBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBinding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationRoleType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (commentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Comment_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCommentType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCommentType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (compositeListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CompositeList_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCompositeListType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getCompositeListType_Encapsulation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Encapsulation",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCompositeListType_Composite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Composite",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (compositeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Composite_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCompositeType_Constituent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Constituent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCompositeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCompositeType_Mimeparameters(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimeparameters"
		   });		
		addAnnotation
		  (getCompositeType_Mimetype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimetype"
		   });		
		addAnnotation
		  (constituentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Constituent_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getConstituentType_Idref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "idref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (conversationConstraintsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ConversationConstraints_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getConversationConstraintsType_ConcurrentConversations(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "concurrentConversations"
		   });		
		addAnnotation
		  (getConversationConstraintsType_InvocationLimit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "invocationLimit"
		   });		
		addAnnotation
		  (deliveryChannelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DeliveryChannel_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDeliveryChannelType_Characteristics(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Characteristics",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeliveryChannelType_ChannelId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "channelId"
		   });		
		addAnnotation
		  (getDeliveryChannelType_DocExchangeId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "docExchangeId"
		   });		
		addAnnotation
		  (getDeliveryChannelType_TransportId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transportId"
		   });		
		addAnnotation
		  (digitalEnvelopeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DigitalEnvelope_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDigitalEnvelopeType_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Protocol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDigitalEnvelopeType_EncryptionAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EncryptionAlgorithm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDigitalEnvelopeType_CertificateRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CertificateRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (docExchangeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DocExchange_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocExchangeType_EbXMLBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ebXMLBinding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocExchangeType_DocExchangeId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "docExchangeId"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Certificate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Certificate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CertificateRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CertificateRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Characteristics(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Characteristics",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CollaborationProtocolAgreement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CollaborationProtocolAgreement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CollaborationProtocolProfile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CollaborationProtocolProfile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CollaborationRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CollaborationRole",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Constituent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Constituent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ConversationConstraints(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConversationConstraints",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DeliveryChannel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DeliveryChannel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DigitalEnvelope(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigitalEnvelope",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DocExchange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DocExchange",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EbXMLBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ebXMLBinding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EncryptionAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EncryptionAlgorithm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "End",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Endpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Endpoint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HashFunction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HashFunction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NamespaceSupported(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NamespaceSupported",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NonRepudiation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NonRepudiation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Override(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Override",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Packaging(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Packaging",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PartyId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PartyId",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PartyInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PartyInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PartyRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PartyRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProcessSpecification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProcessSpecification",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Protocol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ReceivingProtocol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReceivingProtocol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ReliableMessaging(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReliableMessaging",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Retries(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Retries",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RetryInterval(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RetryInterval",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Role(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Role",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SendingProtocol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SendingProtocol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Service",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ServiceBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ServiceBinding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureAlgorithm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Start(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Start",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Status",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Transport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transport",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransportSecurity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransportSecurity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Idref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "idref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SyncReplyMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "syncReplyMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dsTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ds.type"
		   });		
		addAnnotation
		  (dsTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ds.type:Object",
			 "baseType", "ds.type"
		   });		
		addAnnotation
		  (ebXMLBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ebXMLBinding_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEbXMLBindingType_ReliableMessaging(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReliableMessaging",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEbXMLBindingType_NonRepudiation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NonRepudiation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEbXMLBindingType_DigitalEnvelope(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigitalEnvelope",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEbXMLBindingType_NamespaceSupported(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NamespaceSupported",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEbXMLBindingType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (encapsulationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Encapsulation_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEncapsulationType_Constituent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Constituent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEncapsulationType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEncapsulationType_Mimeparameters(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimeparameters"
		   });		
		addAnnotation
		  (getEncapsulationType_Mimetype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimetype"
		   });		
		addAnnotation
		  (endpointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Endpoint_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getEndpointType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (getEndpointType_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });		
		addAnnotation
		  (endpointTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "endpointType.type"
		   });		
		addAnnotation
		  (endpointTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "endpointType.type:Object",
			 "baseType", "endpointType.type"
		   });		
		addAnnotation
		  (mosTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "mos.type"
		   });		
		addAnnotation
		  (mosTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mos.type:Object",
			 "baseType", "mos.type"
		   });		
		addAnnotation
		  (namespaceSupportedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NamespaceSupported_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getNamespaceSupportedType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getNamespaceSupportedType_Location(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "location"
		   });		
		addAnnotation
		  (getNamespaceSupportedType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (nonEmptyStringEDataType, 
		   source, 
		   new String[] {
			 "name", "non-empty-string",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1"
		   });		
		addAnnotation
		  (nonRepudiationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NonRepudiation_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNonRepudiationType_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Protocol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNonRepudiationType_HashFunction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HashFunction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNonRepudiationType_SignatureAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureAlgorithm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNonRepudiationType_CertificateRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CertificateRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (overrideTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Override_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getOverrideType_Action(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "action"
		   });		
		addAnnotation
		  (getOverrideType_ChannelId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "channelId"
		   });		
		addAnnotation
		  (getOverrideType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getOverrideType_PackageId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "packageId"
		   });		
		addAnnotation
		  (getOverrideType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (packagingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Packaging_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPackagingType_ProcessingCapabilities(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProcessingCapabilities",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPackagingType_SimplePart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SimplePart",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPackagingType_CompositeList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CompositeList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPackagingType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (partyIdTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PartyId_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getPartyIdType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getPartyIdType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (partyInfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PartyInfo_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPartyInfoType_PartyId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PartyId",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartyInfoType_PartyRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PartyRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartyInfoType_CollaborationRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CollaborationRole",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartyInfoType_Certificate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Certificate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartyInfoType_DeliveryChannel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DeliveryChannel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartyInfoType_Transport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transport",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartyInfoType_DocExchange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DocExchange",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (partyRefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PartyRef_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPartyRefType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getPartyRefType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getPartyRefType_Type1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (processingCapabilitiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProcessingCapabilities_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getProcessingCapabilitiesType_Generate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "generate"
		   });		
		addAnnotation
		  (getProcessingCapabilitiesType_Parse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parse"
		   });		
		addAnnotation
		  (processSpecificationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProcessSpecification_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "http://www.w3.org/2000/09/xmldsig#"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (protocolTypeEClass, 
		   source, 
		   new String[] {
			 "name", "protocol.type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getProtocolType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getProtocolType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (reliableMessagingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ReliableMessaging_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReliableMessagingType_Retries(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Retries",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReliableMessagingType_RetryInterval(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RetryInterval",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReliableMessagingType_PersistDuration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PersistDuration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReliableMessagingType_DeliverySemantics(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "deliverySemantics"
		   });		
		addAnnotation
		  (getReliableMessagingType_Idempotency(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "idempotency"
		   });		
		addAnnotation
		  (getReliableMessagingType_MessageOrderSemantics(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "messageOrderSemantics"
		   });		
		addAnnotation
		  (roleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Role_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRoleType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getRoleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getRoleType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (serviceBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ServiceBinding_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getServiceBindingType_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Service",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getServiceBindingType_Override(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Override",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getServiceBindingType_ChannelId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "channelId"
		   });		
		addAnnotation
		  (getServiceBindingType_PackageId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "packageId"
		   });		
		addAnnotation
		  (serviceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "service.type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getServiceType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getServiceType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (simplePartTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SimplePart_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSimplePartType_NamespaceSupported(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NamespaceSupported",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSimplePartType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSimplePartType_Mimeparameters(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimeparameters"
		   });		
		addAnnotation
		  (getSimplePartType_Mimetype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimetype"
		   });		
		addAnnotation
		  (statusTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Status_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getStatusType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (statusValueTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "statusValue.type"
		   });		
		addAnnotation
		  (statusValueTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "statusValue.type:Object",
			 "baseType", "statusValue.type"
		   });		
		addAnnotation
		  (syncReplyModeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "syncReplyMode.type"
		   });		
		addAnnotation
		  (syncReplyModeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "syncReplyMode.type:Object",
			 "baseType", "syncReplyMode.type"
		   });		
		addAnnotation
		  (transportSecurityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TransportSecurity_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransportSecurityType_Protocol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Protocol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportSecurityType_CertificateRef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CertificateRef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (transportTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Transport_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransportType_SendingProtocol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SendingProtocol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportType_ReceivingProtocol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReceivingProtocol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportType_Endpoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Endpoint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportType_TransportSecurity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransportSecurity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportType_TransportId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transportId"
		   });
	}

} //PartnerPackageImpl
