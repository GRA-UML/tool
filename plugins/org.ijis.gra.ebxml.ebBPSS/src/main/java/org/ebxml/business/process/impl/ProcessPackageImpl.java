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
import org.ebxml.business.process.ConditionGuardType;
import org.ebxml.business.process.ConditionGuardType1;
import org.ebxml.business.process.ConditionGuardType2;
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
import org.ebxml.business.process.ProcessFactory;
import org.ebxml.business.process.ProcessPackage;
import org.ebxml.business.process.ProcessSpecificationType;
import org.ebxml.business.process.RequestingBusinessActivityType;
import org.ebxml.business.process.RespondingBusinessActivityType;
import org.ebxml.business.process.RespondingRoleType;
import org.ebxml.business.process.StartType;
import org.ebxml.business.process.SubstitutionSetType;
import org.ebxml.business.process.SuccessType;
import org.ebxml.business.process.TransitionType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessPackageImpl extends EPackageImpl implements ProcessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSubstitutionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryCollaborationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessDocumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessPartnerRoleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessTransactionActivityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessTransactionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationActivityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionExpressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEnvelopeTypeEClass = null;

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
	private EClass documentSubstitutionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initiatingRoleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPartyCollaborationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performsTypeEClass = null;

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
	private EClass requestingBusinessActivityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respondingBusinessActivityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respondingRoleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutionSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionGuardTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionGuardType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionGuardType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conditionGuardTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conditionGuardTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conditionGuardTypeObject2EDataType = null;

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
	 * @see org.ebxml.business.process.ProcessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcessPackageImpl() {
		super(eNS_URI, ProcessFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProcessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProcessPackage init() {
		if (isInited) return (ProcessPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);

		// Obtain or create and register package
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProcessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProcessPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProcessPackage.createPackageContents();

		// Initialize created meta-data
		theProcessPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProcessPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProcessPackage.eNS_URI, theProcessPackage);
		return theProcessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachmentType() {
		return attachmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachmentType_Documentation() {
		return (EReference)attachmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_BusinessDocument() {
		return (EAttribute)attachmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_BusinessDocumentIDRef() {
		return (EAttribute)attachmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_IsAuthenticated() {
		return (EAttribute)attachmentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_IsConfidential() {
		return (EAttribute)attachmentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_IsTamperProof() {
		return (EAttribute)attachmentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_MimeType() {
		return (EAttribute)attachmentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_Name() {
		return (EAttribute)attachmentTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_NameID() {
		return (EAttribute)attachmentTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_Specification() {
		return (EAttribute)attachmentTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachmentType_Version() {
		return (EAttribute)attachmentTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSubstitutionType() {
		return attributeSubstitutionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeSubstitutionType_Documentation() {
		return (EReference)attributeSubstitutionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeSubstitutionType_AttributeName() {
		return (EAttribute)attributeSubstitutionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeSubstitutionType_Value() {
		return (EAttribute)attributeSubstitutionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryCollaborationType() {
		return binaryCollaborationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_Documentation() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_InitiatingRole() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_RespondingRole() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryCollaborationType_Group() {
		return (EAttribute)binaryCollaborationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_Documentation1() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_Start() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_Transition() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_Success() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_Failure() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_BusinessTransactionActivity() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_CollaborationActivity() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_Fork() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryCollaborationType_Join() {
		return (EReference)binaryCollaborationTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryCollaborationType_BeginsWhen() {
		return (EAttribute)binaryCollaborationTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryCollaborationType_EndsWhen() {
		return (EAttribute)binaryCollaborationTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryCollaborationType_Name() {
		return (EAttribute)binaryCollaborationTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryCollaborationType_NameID() {
		return (EAttribute)binaryCollaborationTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryCollaborationType_Pattern() {
		return (EAttribute)binaryCollaborationTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryCollaborationType_PostCondition() {
		return (EAttribute)binaryCollaborationTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryCollaborationType_PreCondition() {
		return (EAttribute)binaryCollaborationTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryCollaborationType_TimeToPerform() {
		return (EAttribute)binaryCollaborationTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessDocumentType() {
		return businessDocumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessDocumentType_Documentation() {
		return (EReference)businessDocumentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessDocumentType_ConditionExpression() {
		return (EReference)businessDocumentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessDocumentType_Name() {
		return (EAttribute)businessDocumentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessDocumentType_NameID() {
		return (EAttribute)businessDocumentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessDocumentType_SpecificationElement() {
		return (EAttribute)businessDocumentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessDocumentType_SpecificationLocation() {
		return (EAttribute)businessDocumentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessPartnerRoleType() {
		return businessPartnerRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessPartnerRoleType_Documentation() {
		return (EReference)businessPartnerRoleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessPartnerRoleType_Performs() {
		return (EReference)businessPartnerRoleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessPartnerRoleType_Transition() {
		return (EReference)businessPartnerRoleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessPartnerRoleType_Name() {
		return (EAttribute)businessPartnerRoleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessPartnerRoleType_NameID() {
		return (EAttribute)businessPartnerRoleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessTransactionActivityType() {
		return businessTransactionActivityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessTransactionActivityType_Documentation() {
		return (EReference)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionActivityType_BusinessTransaction() {
		return (EAttribute)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionActivityType_BusinessTransactionIDRef() {
		return (EAttribute)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionActivityType_FromAuthorizedRole() {
		return (EAttribute)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionActivityType_FromAuthorizedRoleIDRef() {
		return (EAttribute)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionActivityType_IsConcurrent() {
		return (EAttribute)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionActivityType_IsLegallyBinding() {
		return (EAttribute)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionActivityType_Name() {
		return (EAttribute)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionActivityType_NameID() {
		return (EAttribute)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionActivityType_TimeToPerform() {
		return (EAttribute)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionActivityType_ToAuthorizedRole() {
		return (EAttribute)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionActivityType_ToAuthorizedRoleIDRef() {
		return (EAttribute)businessTransactionActivityTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessTransactionType() {
		return businessTransactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessTransactionType_Documentation() {
		return (EReference)businessTransactionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessTransactionType_RequestingBusinessActivity() {
		return (EReference)businessTransactionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessTransactionType_RespondingBusinessActivity() {
		return (EReference)businessTransactionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionType_BeginsWhen() {
		return (EAttribute)businessTransactionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionType_EndsWhen() {
		return (EAttribute)businessTransactionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionType_IsGuaranteedDeliveryRequired() {
		return (EAttribute)businessTransactionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionType_Name() {
		return (EAttribute)businessTransactionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionType_NameID() {
		return (EAttribute)businessTransactionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionType_Pattern() {
		return (EAttribute)businessTransactionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionType_PostCondition() {
		return (EAttribute)businessTransactionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessTransactionType_PreCondition() {
		return (EAttribute)businessTransactionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationActivityType() {
		return collaborationActivityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationActivityType_Documentation() {
		return (EReference)collaborationActivityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationActivityType_BinaryCollaboration() {
		return (EAttribute)collaborationActivityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationActivityType_BinaryCollaborationIDRef() {
		return (EAttribute)collaborationActivityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationActivityType_FromAuthorizedRole() {
		return (EAttribute)collaborationActivityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationActivityType_FromAuthorizedRoleIDRef() {
		return (EAttribute)collaborationActivityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationActivityType_Name() {
		return (EAttribute)collaborationActivityTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationActivityType_NameID() {
		return (EAttribute)collaborationActivityTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationActivityType_ToAuthorizedRole() {
		return (EAttribute)collaborationActivityTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborationActivityType_ToAuthorizedRoleIDRef() {
		return (EAttribute)collaborationActivityTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionExpressionType() {
		return conditionExpressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionExpressionType_Documentation() {
		return (EReference)conditionExpressionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionExpressionType_Expression() {
		return (EAttribute)conditionExpressionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionExpressionType_ExpressionLanguage() {
		return (EAttribute)conditionExpressionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationType() {
		return documentationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentationType_Value() {
		return (EAttribute)documentationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentationType_Uri() {
		return (EAttribute)documentationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentEnvelopeType() {
		return documentEnvelopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentEnvelopeType_Documentation() {
		return (EReference)documentEnvelopeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentEnvelopeType_Attachment() {
		return (EReference)documentEnvelopeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEnvelopeType_BusinessDocument() {
		return (EAttribute)documentEnvelopeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEnvelopeType_BusinessDocumentIDRef() {
		return (EAttribute)documentEnvelopeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEnvelopeType_IsAuthenticated() {
		return (EAttribute)documentEnvelopeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEnvelopeType_IsConfidential() {
		return (EAttribute)documentEnvelopeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEnvelopeType_IsPositiveResponse() {
		return (EAttribute)documentEnvelopeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentEnvelopeType_IsTamperProof() {
		return (EAttribute)documentEnvelopeTypeEClass.getEStructuralFeatures().get(7);
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
	public EReference getDocumentRoot_Attachment() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AttributeSubstitution() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BinaryCollaboration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BusinessDocument() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BusinessPartnerRole() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BusinessTransaction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BusinessTransactionActivity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CollaborationActivity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConditionExpression() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Documentation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentEnvelope() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSubstitution() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Failure() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Fork() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Include() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InitiatingRole() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Join() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiPartyCollaboration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Package() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Performs() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProcessSpecification() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequestingBusinessActivity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RespondingBusinessActivity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RespondingRole() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Start() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubstitutionSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Success() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transition() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentSubstitutionType() {
		return documentSubstitutionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentSubstitutionType_Documentation() {
		return (EReference)documentSubstitutionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentSubstitutionType_OriginalBusinessDocument() {
		return (EAttribute)documentSubstitutionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentSubstitutionType_OriginalBusinessDocumentID() {
		return (EAttribute)documentSubstitutionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentSubstitutionType_SubstituteBusinessDocument() {
		return (EAttribute)documentSubstitutionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentSubstitutionType_SubstituteBusinessDocumentId() {
		return (EAttribute)documentSubstitutionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureType() {
		return failureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureType_Documentation() {
		return (EReference)failureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailureType_ConditionExpression() {
		return (EReference)failureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureType_ConditionGuard() {
		return (EAttribute)failureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureType_FromBusinessState() {
		return (EAttribute)failureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFailureType_FromBusinessStateIDRef() {
		return (EAttribute)failureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkType() {
		return forkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkType_Documentation() {
		return (EReference)forkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkType_Name() {
		return (EAttribute)forkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForkType_NameID() {
		return (EAttribute)forkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeType() {
		return includeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludeType_Documentation() {
		return (EReference)includeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeType_Name() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeType_Uri() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeType_Uuid() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeType_Version() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitiatingRoleType() {
		return initiatingRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitiatingRoleType_Documentation() {
		return (EReference)initiatingRoleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiatingRoleType_Name() {
		return (EAttribute)initiatingRoleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiatingRoleType_NameID() {
		return (EAttribute)initiatingRoleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinType() {
		return joinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinType_Documentation() {
		return (EReference)joinTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinType_Name() {
		return (EAttribute)joinTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinType_NameID() {
		return (EAttribute)joinTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinType_WaitForAll() {
		return (EAttribute)joinTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPartyCollaborationType() {
		return multiPartyCollaborationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPartyCollaborationType_Documentation() {
		return (EReference)multiPartyCollaborationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPartyCollaborationType_BusinessPartnerRole() {
		return (EReference)multiPartyCollaborationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPartyCollaborationType_Name() {
		return (EAttribute)multiPartyCollaborationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPartyCollaborationType_NameID() {
		return (EAttribute)multiPartyCollaborationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageType() {
		return packageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_Documentation() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageType_Group() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_Package() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_BinaryCollaboration() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_BusinessTransaction() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageType_MultiPartyCollaboration() {
		return (EReference)packageTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageType_Name() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageType_NameID() {
		return (EAttribute)packageTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformsType() {
		return performsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformsType_Documentation() {
		return (EReference)performsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformsType_InitiatingRole() {
		return (EAttribute)performsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformsType_InitiatingRoleIDRef() {
		return (EAttribute)performsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformsType_RespondingRole() {
		return (EAttribute)performsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformsType_RespondingRoleIDRef() {
		return (EAttribute)performsTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getProcessSpecificationType_Documentation() {
		return (EReference)processSpecificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSpecificationType_SubstitutionSet() {
		return (EReference)processSpecificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessSpecificationType_Group() {
		return (EAttribute)processSpecificationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSpecificationType_Include() {
		return (EReference)processSpecificationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSpecificationType_BusinessDocument() {
		return (EReference)processSpecificationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSpecificationType_ProcessSpecification() {
		return (EReference)processSpecificationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSpecificationType_Package() {
		return (EReference)processSpecificationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSpecificationType_BinaryCollaboration() {
		return (EReference)processSpecificationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSpecificationType_BusinessTransaction() {
		return (EReference)processSpecificationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessSpecificationType_MultiPartyCollaboration() {
		return (EReference)processSpecificationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessSpecificationType_Name() {
		return (EAttribute)processSpecificationTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessSpecificationType_Uuid() {
		return (EAttribute)processSpecificationTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessSpecificationType_Version() {
		return (EAttribute)processSpecificationTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestingBusinessActivityType() {
		return requestingBusinessActivityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestingBusinessActivityType_Documentation() {
		return (EReference)requestingBusinessActivityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestingBusinessActivityType_DocumentEnvelope() {
		return (EReference)requestingBusinessActivityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestingBusinessActivityType_IsAuthorizationRequired() {
		return (EAttribute)requestingBusinessActivityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestingBusinessActivityType_IsIntelligibleCheckRequired() {
		return (EAttribute)requestingBusinessActivityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestingBusinessActivityType_IsNonRepudiationReceiptRequired() {
		return (EAttribute)requestingBusinessActivityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestingBusinessActivityType_IsNonRepudiationRequired() {
		return (EAttribute)requestingBusinessActivityTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestingBusinessActivityType_Name() {
		return (EAttribute)requestingBusinessActivityTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestingBusinessActivityType_NameID() {
		return (EAttribute)requestingBusinessActivityTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestingBusinessActivityType_TimeToAcknowledgeAcceptance() {
		return (EAttribute)requestingBusinessActivityTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestingBusinessActivityType_TimeToAcknowledgeReceipt() {
		return (EAttribute)requestingBusinessActivityTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespondingBusinessActivityType() {
		return respondingBusinessActivityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRespondingBusinessActivityType_Documentation() {
		return (EReference)respondingBusinessActivityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRespondingBusinessActivityType_DocumentEnvelope() {
		return (EReference)respondingBusinessActivityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespondingBusinessActivityType_IsAuthorizationRequired() {
		return (EAttribute)respondingBusinessActivityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespondingBusinessActivityType_IsIntelligibleCheckRequired() {
		return (EAttribute)respondingBusinessActivityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespondingBusinessActivityType_IsNonRepudiationReceiptRequired() {
		return (EAttribute)respondingBusinessActivityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespondingBusinessActivityType_IsNonRepudiationRequired() {
		return (EAttribute)respondingBusinessActivityTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespondingBusinessActivityType_Name() {
		return (EAttribute)respondingBusinessActivityTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespondingBusinessActivityType_NameID() {
		return (EAttribute)respondingBusinessActivityTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespondingBusinessActivityType_TimeToAcknowledgeReceipt() {
		return (EAttribute)respondingBusinessActivityTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespondingRoleType() {
		return respondingRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRespondingRoleType_Documentation() {
		return (EReference)respondingRoleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespondingRoleType_Name() {
		return (EAttribute)respondingRoleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespondingRoleType_NameID() {
		return (EAttribute)respondingRoleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartType() {
		return startTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartType_Documentation() {
		return (EReference)startTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartType_ToBusinessState() {
		return (EAttribute)startTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartType_ToBusinessStateIDRef() {
		return (EAttribute)startTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitutionSetType() {
		return substitutionSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitutionSetType_DocumentSubstitution() {
		return (EReference)substitutionSetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitutionSetType_AttributeSubstitution() {
		return (EReference)substitutionSetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitutionSetType_Documentation() {
		return (EReference)substitutionSetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstitutionSetType_ApplyToScope() {
		return (EAttribute)substitutionSetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstitutionSetType_Name() {
		return (EAttribute)substitutionSetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstitutionSetType_NameId() {
		return (EAttribute)substitutionSetTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuccessType() {
		return successTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuccessType_Documentation() {
		return (EReference)successTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuccessType_ConditionExpression() {
		return (EReference)successTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuccessType_ConditionGuard() {
		return (EAttribute)successTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuccessType_FromBusinessState() {
		return (EAttribute)successTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuccessType_FromBusinessStateIDRef() {
		return (EAttribute)successTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionType() {
		return transitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionType_Documentation() {
		return (EReference)transitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionType_ConditionExpression() {
		return (EReference)transitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_ConditionGuard() {
		return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_FromBusinessState() {
		return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_FromBusinessStateIDRef() {
		return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_OnInitiation() {
		return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_ToBusinessState() {
		return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_ToBusinessStateIDRef() {
		return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionGuardType() {
		return conditionGuardTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionGuardType1() {
		return conditionGuardType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionGuardType2() {
		return conditionGuardType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConditionGuardTypeObject() {
		return conditionGuardTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConditionGuardTypeObject1() {
		return conditionGuardTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConditionGuardTypeObject2() {
		return conditionGuardTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessFactory getProcessFactory() {
		return (ProcessFactory)getEFactoryInstance();
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
		attachmentTypeEClass = createEClass(ATTACHMENT_TYPE);
		createEReference(attachmentTypeEClass, ATTACHMENT_TYPE__DOCUMENTATION);
		createEAttribute(attachmentTypeEClass, ATTACHMENT_TYPE__BUSINESS_DOCUMENT);
		createEAttribute(attachmentTypeEClass, ATTACHMENT_TYPE__BUSINESS_DOCUMENT_ID_REF);
		createEAttribute(attachmentTypeEClass, ATTACHMENT_TYPE__IS_AUTHENTICATED);
		createEAttribute(attachmentTypeEClass, ATTACHMENT_TYPE__IS_CONFIDENTIAL);
		createEAttribute(attachmentTypeEClass, ATTACHMENT_TYPE__IS_TAMPER_PROOF);
		createEAttribute(attachmentTypeEClass, ATTACHMENT_TYPE__MIME_TYPE);
		createEAttribute(attachmentTypeEClass, ATTACHMENT_TYPE__NAME);
		createEAttribute(attachmentTypeEClass, ATTACHMENT_TYPE__NAME_ID);
		createEAttribute(attachmentTypeEClass, ATTACHMENT_TYPE__SPECIFICATION);
		createEAttribute(attachmentTypeEClass, ATTACHMENT_TYPE__VERSION);

		attributeSubstitutionTypeEClass = createEClass(ATTRIBUTE_SUBSTITUTION_TYPE);
		createEReference(attributeSubstitutionTypeEClass, ATTRIBUTE_SUBSTITUTION_TYPE__DOCUMENTATION);
		createEAttribute(attributeSubstitutionTypeEClass, ATTRIBUTE_SUBSTITUTION_TYPE__ATTRIBUTE_NAME);
		createEAttribute(attributeSubstitutionTypeEClass, ATTRIBUTE_SUBSTITUTION_TYPE__VALUE);

		binaryCollaborationTypeEClass = createEClass(BINARY_COLLABORATION_TYPE);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__DOCUMENTATION);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__INITIATING_ROLE);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__RESPONDING_ROLE);
		createEAttribute(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__GROUP);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__DOCUMENTATION1);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__START);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__TRANSITION);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__SUCCESS);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__FAILURE);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__BUSINESS_TRANSACTION_ACTIVITY);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__COLLABORATION_ACTIVITY);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__FORK);
		createEReference(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__JOIN);
		createEAttribute(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__BEGINS_WHEN);
		createEAttribute(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__ENDS_WHEN);
		createEAttribute(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__NAME);
		createEAttribute(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__NAME_ID);
		createEAttribute(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__PATTERN);
		createEAttribute(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__POST_CONDITION);
		createEAttribute(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__PRE_CONDITION);
		createEAttribute(binaryCollaborationTypeEClass, BINARY_COLLABORATION_TYPE__TIME_TO_PERFORM);

		businessDocumentTypeEClass = createEClass(BUSINESS_DOCUMENT_TYPE);
		createEReference(businessDocumentTypeEClass, BUSINESS_DOCUMENT_TYPE__DOCUMENTATION);
		createEReference(businessDocumentTypeEClass, BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION);
		createEAttribute(businessDocumentTypeEClass, BUSINESS_DOCUMENT_TYPE__NAME);
		createEAttribute(businessDocumentTypeEClass, BUSINESS_DOCUMENT_TYPE__NAME_ID);
		createEAttribute(businessDocumentTypeEClass, BUSINESS_DOCUMENT_TYPE__SPECIFICATION_ELEMENT);
		createEAttribute(businessDocumentTypeEClass, BUSINESS_DOCUMENT_TYPE__SPECIFICATION_LOCATION);

		businessPartnerRoleTypeEClass = createEClass(BUSINESS_PARTNER_ROLE_TYPE);
		createEReference(businessPartnerRoleTypeEClass, BUSINESS_PARTNER_ROLE_TYPE__DOCUMENTATION);
		createEReference(businessPartnerRoleTypeEClass, BUSINESS_PARTNER_ROLE_TYPE__PERFORMS);
		createEReference(businessPartnerRoleTypeEClass, BUSINESS_PARTNER_ROLE_TYPE__TRANSITION);
		createEAttribute(businessPartnerRoleTypeEClass, BUSINESS_PARTNER_ROLE_TYPE__NAME);
		createEAttribute(businessPartnerRoleTypeEClass, BUSINESS_PARTNER_ROLE_TYPE__NAME_ID);

		businessTransactionActivityTypeEClass = createEClass(BUSINESS_TRANSACTION_ACTIVITY_TYPE);
		createEReference(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__DOCUMENTATION);
		createEAttribute(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION);
		createEAttribute(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION_ID_REF);
		createEAttribute(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE);
		createEAttribute(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF);
		createEAttribute(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_CONCURRENT);
		createEAttribute(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_LEGALLY_BINDING);
		createEAttribute(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME);
		createEAttribute(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME_ID);
		createEAttribute(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__TIME_TO_PERFORM);
		createEAttribute(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE);
		createEAttribute(businessTransactionActivityTypeEClass, BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF);

		businessTransactionTypeEClass = createEClass(BUSINESS_TRANSACTION_TYPE);
		createEReference(businessTransactionTypeEClass, BUSINESS_TRANSACTION_TYPE__DOCUMENTATION);
		createEReference(businessTransactionTypeEClass, BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY);
		createEReference(businessTransactionTypeEClass, BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY);
		createEAttribute(businessTransactionTypeEClass, BUSINESS_TRANSACTION_TYPE__BEGINS_WHEN);
		createEAttribute(businessTransactionTypeEClass, BUSINESS_TRANSACTION_TYPE__ENDS_WHEN);
		createEAttribute(businessTransactionTypeEClass, BUSINESS_TRANSACTION_TYPE__IS_GUARANTEED_DELIVERY_REQUIRED);
		createEAttribute(businessTransactionTypeEClass, BUSINESS_TRANSACTION_TYPE__NAME);
		createEAttribute(businessTransactionTypeEClass, BUSINESS_TRANSACTION_TYPE__NAME_ID);
		createEAttribute(businessTransactionTypeEClass, BUSINESS_TRANSACTION_TYPE__PATTERN);
		createEAttribute(businessTransactionTypeEClass, BUSINESS_TRANSACTION_TYPE__POST_CONDITION);
		createEAttribute(businessTransactionTypeEClass, BUSINESS_TRANSACTION_TYPE__PRE_CONDITION);

		collaborationActivityTypeEClass = createEClass(COLLABORATION_ACTIVITY_TYPE);
		createEReference(collaborationActivityTypeEClass, COLLABORATION_ACTIVITY_TYPE__DOCUMENTATION);
		createEAttribute(collaborationActivityTypeEClass, COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION);
		createEAttribute(collaborationActivityTypeEClass, COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION_ID_REF);
		createEAttribute(collaborationActivityTypeEClass, COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE);
		createEAttribute(collaborationActivityTypeEClass, COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF);
		createEAttribute(collaborationActivityTypeEClass, COLLABORATION_ACTIVITY_TYPE__NAME);
		createEAttribute(collaborationActivityTypeEClass, COLLABORATION_ACTIVITY_TYPE__NAME_ID);
		createEAttribute(collaborationActivityTypeEClass, COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE);
		createEAttribute(collaborationActivityTypeEClass, COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF);

		conditionExpressionTypeEClass = createEClass(CONDITION_EXPRESSION_TYPE);
		createEReference(conditionExpressionTypeEClass, CONDITION_EXPRESSION_TYPE__DOCUMENTATION);
		createEAttribute(conditionExpressionTypeEClass, CONDITION_EXPRESSION_TYPE__EXPRESSION);
		createEAttribute(conditionExpressionTypeEClass, CONDITION_EXPRESSION_TYPE__EXPRESSION_LANGUAGE);

		documentationTypeEClass = createEClass(DOCUMENTATION_TYPE);
		createEAttribute(documentationTypeEClass, DOCUMENTATION_TYPE__VALUE);
		createEAttribute(documentationTypeEClass, DOCUMENTATION_TYPE__URI);

		documentEnvelopeTypeEClass = createEClass(DOCUMENT_ENVELOPE_TYPE);
		createEReference(documentEnvelopeTypeEClass, DOCUMENT_ENVELOPE_TYPE__DOCUMENTATION);
		createEReference(documentEnvelopeTypeEClass, DOCUMENT_ENVELOPE_TYPE__ATTACHMENT);
		createEAttribute(documentEnvelopeTypeEClass, DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT);
		createEAttribute(documentEnvelopeTypeEClass, DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT_ID_REF);
		createEAttribute(documentEnvelopeTypeEClass, DOCUMENT_ENVELOPE_TYPE__IS_AUTHENTICATED);
		createEAttribute(documentEnvelopeTypeEClass, DOCUMENT_ENVELOPE_TYPE__IS_CONFIDENTIAL);
		createEAttribute(documentEnvelopeTypeEClass, DOCUMENT_ENVELOPE_TYPE__IS_POSITIVE_RESPONSE);
		createEAttribute(documentEnvelopeTypeEClass, DOCUMENT_ENVELOPE_TYPE__IS_TAMPER_PROOF);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ATTACHMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ATTRIBUTE_SUBSTITUTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINARY_COLLABORATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUSINESS_DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUSINESS_PARTNER_ROLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUSINESS_TRANSACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUSINESS_TRANSACTION_ACTIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLLABORATION_ACTIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONDITION_EXPRESSION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENTATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENT_ENVELOPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENT_SUBSTITUTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FAILURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FORK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INCLUDE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INITIATING_ROLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__JOIN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MULTI_PARTY_COLLABORATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PACKAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERFORMS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROCESS_SPECIFICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUESTING_BUSINESS_ACTIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESPONDING_BUSINESS_ACTIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESPONDING_ROLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__START);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBSTITUTION_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUCCESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSITION);

		documentSubstitutionTypeEClass = createEClass(DOCUMENT_SUBSTITUTION_TYPE);
		createEReference(documentSubstitutionTypeEClass, DOCUMENT_SUBSTITUTION_TYPE__DOCUMENTATION);
		createEAttribute(documentSubstitutionTypeEClass, DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT);
		createEAttribute(documentSubstitutionTypeEClass, DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT_ID);
		createEAttribute(documentSubstitutionTypeEClass, DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT);
		createEAttribute(documentSubstitutionTypeEClass, DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT_ID);

		failureTypeEClass = createEClass(FAILURE_TYPE);
		createEReference(failureTypeEClass, FAILURE_TYPE__DOCUMENTATION);
		createEReference(failureTypeEClass, FAILURE_TYPE__CONDITION_EXPRESSION);
		createEAttribute(failureTypeEClass, FAILURE_TYPE__CONDITION_GUARD);
		createEAttribute(failureTypeEClass, FAILURE_TYPE__FROM_BUSINESS_STATE);
		createEAttribute(failureTypeEClass, FAILURE_TYPE__FROM_BUSINESS_STATE_ID_REF);

		forkTypeEClass = createEClass(FORK_TYPE);
		createEReference(forkTypeEClass, FORK_TYPE__DOCUMENTATION);
		createEAttribute(forkTypeEClass, FORK_TYPE__NAME);
		createEAttribute(forkTypeEClass, FORK_TYPE__NAME_ID);

		includeTypeEClass = createEClass(INCLUDE_TYPE);
		createEReference(includeTypeEClass, INCLUDE_TYPE__DOCUMENTATION);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__NAME);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__URI);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__UUID);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__VERSION);

		initiatingRoleTypeEClass = createEClass(INITIATING_ROLE_TYPE);
		createEReference(initiatingRoleTypeEClass, INITIATING_ROLE_TYPE__DOCUMENTATION);
		createEAttribute(initiatingRoleTypeEClass, INITIATING_ROLE_TYPE__NAME);
		createEAttribute(initiatingRoleTypeEClass, INITIATING_ROLE_TYPE__NAME_ID);

		joinTypeEClass = createEClass(JOIN_TYPE);
		createEReference(joinTypeEClass, JOIN_TYPE__DOCUMENTATION);
		createEAttribute(joinTypeEClass, JOIN_TYPE__NAME);
		createEAttribute(joinTypeEClass, JOIN_TYPE__NAME_ID);
		createEAttribute(joinTypeEClass, JOIN_TYPE__WAIT_FOR_ALL);

		multiPartyCollaborationTypeEClass = createEClass(MULTI_PARTY_COLLABORATION_TYPE);
		createEReference(multiPartyCollaborationTypeEClass, MULTI_PARTY_COLLABORATION_TYPE__DOCUMENTATION);
		createEReference(multiPartyCollaborationTypeEClass, MULTI_PARTY_COLLABORATION_TYPE__BUSINESS_PARTNER_ROLE);
		createEAttribute(multiPartyCollaborationTypeEClass, MULTI_PARTY_COLLABORATION_TYPE__NAME);
		createEAttribute(multiPartyCollaborationTypeEClass, MULTI_PARTY_COLLABORATION_TYPE__NAME_ID);

		packageTypeEClass = createEClass(PACKAGE_TYPE);
		createEReference(packageTypeEClass, PACKAGE_TYPE__DOCUMENTATION);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__GROUP);
		createEReference(packageTypeEClass, PACKAGE_TYPE__PACKAGE);
		createEReference(packageTypeEClass, PACKAGE_TYPE__BINARY_COLLABORATION);
		createEReference(packageTypeEClass, PACKAGE_TYPE__BUSINESS_TRANSACTION);
		createEReference(packageTypeEClass, PACKAGE_TYPE__MULTI_PARTY_COLLABORATION);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__NAME);
		createEAttribute(packageTypeEClass, PACKAGE_TYPE__NAME_ID);

		performsTypeEClass = createEClass(PERFORMS_TYPE);
		createEReference(performsTypeEClass, PERFORMS_TYPE__DOCUMENTATION);
		createEAttribute(performsTypeEClass, PERFORMS_TYPE__INITIATING_ROLE);
		createEAttribute(performsTypeEClass, PERFORMS_TYPE__INITIATING_ROLE_ID_REF);
		createEAttribute(performsTypeEClass, PERFORMS_TYPE__RESPONDING_ROLE);
		createEAttribute(performsTypeEClass, PERFORMS_TYPE__RESPONDING_ROLE_ID_REF);

		processSpecificationTypeEClass = createEClass(PROCESS_SPECIFICATION_TYPE);
		createEReference(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__DOCUMENTATION);
		createEReference(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__SUBSTITUTION_SET);
		createEAttribute(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__GROUP);
		createEReference(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__INCLUDE);
		createEReference(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__BUSINESS_DOCUMENT);
		createEReference(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__PROCESS_SPECIFICATION);
		createEReference(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__PACKAGE);
		createEReference(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__BINARY_COLLABORATION);
		createEReference(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__BUSINESS_TRANSACTION);
		createEReference(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__MULTI_PARTY_COLLABORATION);
		createEAttribute(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__NAME);
		createEAttribute(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__UUID);
		createEAttribute(processSpecificationTypeEClass, PROCESS_SPECIFICATION_TYPE__VERSION);

		requestingBusinessActivityTypeEClass = createEClass(REQUESTING_BUSINESS_ACTIVITY_TYPE);
		createEReference(requestingBusinessActivityTypeEClass, REQUESTING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION);
		createEReference(requestingBusinessActivityTypeEClass, REQUESTING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE);
		createEAttribute(requestingBusinessActivityTypeEClass, REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED);
		createEAttribute(requestingBusinessActivityTypeEClass, REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED);
		createEAttribute(requestingBusinessActivityTypeEClass, REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED);
		createEAttribute(requestingBusinessActivityTypeEClass, REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED);
		createEAttribute(requestingBusinessActivityTypeEClass, REQUESTING_BUSINESS_ACTIVITY_TYPE__NAME);
		createEAttribute(requestingBusinessActivityTypeEClass, REQUESTING_BUSINESS_ACTIVITY_TYPE__NAME_ID);
		createEAttribute(requestingBusinessActivityTypeEClass, REQUESTING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_ACCEPTANCE);
		createEAttribute(requestingBusinessActivityTypeEClass, REQUESTING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_RECEIPT);

		respondingBusinessActivityTypeEClass = createEClass(RESPONDING_BUSINESS_ACTIVITY_TYPE);
		createEReference(respondingBusinessActivityTypeEClass, RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION);
		createEReference(respondingBusinessActivityTypeEClass, RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE);
		createEAttribute(respondingBusinessActivityTypeEClass, RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED);
		createEAttribute(respondingBusinessActivityTypeEClass, RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED);
		createEAttribute(respondingBusinessActivityTypeEClass, RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED);
		createEAttribute(respondingBusinessActivityTypeEClass, RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED);
		createEAttribute(respondingBusinessActivityTypeEClass, RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME);
		createEAttribute(respondingBusinessActivityTypeEClass, RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME_ID);
		createEAttribute(respondingBusinessActivityTypeEClass, RESPONDING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_RECEIPT);

		respondingRoleTypeEClass = createEClass(RESPONDING_ROLE_TYPE);
		createEReference(respondingRoleTypeEClass, RESPONDING_ROLE_TYPE__DOCUMENTATION);
		createEAttribute(respondingRoleTypeEClass, RESPONDING_ROLE_TYPE__NAME);
		createEAttribute(respondingRoleTypeEClass, RESPONDING_ROLE_TYPE__NAME_ID);

		startTypeEClass = createEClass(START_TYPE);
		createEReference(startTypeEClass, START_TYPE__DOCUMENTATION);
		createEAttribute(startTypeEClass, START_TYPE__TO_BUSINESS_STATE);
		createEAttribute(startTypeEClass, START_TYPE__TO_BUSINESS_STATE_ID_REF);

		substitutionSetTypeEClass = createEClass(SUBSTITUTION_SET_TYPE);
		createEReference(substitutionSetTypeEClass, SUBSTITUTION_SET_TYPE__DOCUMENT_SUBSTITUTION);
		createEReference(substitutionSetTypeEClass, SUBSTITUTION_SET_TYPE__ATTRIBUTE_SUBSTITUTION);
		createEReference(substitutionSetTypeEClass, SUBSTITUTION_SET_TYPE__DOCUMENTATION);
		createEAttribute(substitutionSetTypeEClass, SUBSTITUTION_SET_TYPE__APPLY_TO_SCOPE);
		createEAttribute(substitutionSetTypeEClass, SUBSTITUTION_SET_TYPE__NAME);
		createEAttribute(substitutionSetTypeEClass, SUBSTITUTION_SET_TYPE__NAME_ID);

		successTypeEClass = createEClass(SUCCESS_TYPE);
		createEReference(successTypeEClass, SUCCESS_TYPE__DOCUMENTATION);
		createEReference(successTypeEClass, SUCCESS_TYPE__CONDITION_EXPRESSION);
		createEAttribute(successTypeEClass, SUCCESS_TYPE__CONDITION_GUARD);
		createEAttribute(successTypeEClass, SUCCESS_TYPE__FROM_BUSINESS_STATE);
		createEAttribute(successTypeEClass, SUCCESS_TYPE__FROM_BUSINESS_STATE_ID_REF);

		transitionTypeEClass = createEClass(TRANSITION_TYPE);
		createEReference(transitionTypeEClass, TRANSITION_TYPE__DOCUMENTATION);
		createEReference(transitionTypeEClass, TRANSITION_TYPE__CONDITION_EXPRESSION);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__CONDITION_GUARD);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__FROM_BUSINESS_STATE);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__FROM_BUSINESS_STATE_ID_REF);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__ON_INITIATION);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__TO_BUSINESS_STATE);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__TO_BUSINESS_STATE_ID_REF);

		// Create enums
		conditionGuardTypeEEnum = createEEnum(CONDITION_GUARD_TYPE);
		conditionGuardType1EEnum = createEEnum(CONDITION_GUARD_TYPE1);
		conditionGuardType2EEnum = createEEnum(CONDITION_GUARD_TYPE2);

		// Create data types
		conditionGuardTypeObjectEDataType = createEDataType(CONDITION_GUARD_TYPE_OBJECT);
		conditionGuardTypeObject1EDataType = createEDataType(CONDITION_GUARD_TYPE_OBJECT1);
		conditionGuardTypeObject2EDataType = createEDataType(CONDITION_GUARD_TYPE_OBJECT2);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(attachmentTypeEClass, AttachmentType.class, "AttachmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachmentType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, AttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachmentType_BusinessDocument(), theXMLTypePackage.getString(), "businessDocument", null, 0, 1, AttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachmentType_BusinessDocumentIDRef(), theXMLTypePackage.getIDREF(), "businessDocumentIDRef", null, 0, 1, AttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachmentType_IsAuthenticated(), theXMLTypePackage.getBoolean(), "isAuthenticated", "false", 0, 1, AttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachmentType_IsConfidential(), theXMLTypePackage.getBoolean(), "isConfidential", "false", 0, 1, AttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachmentType_IsTamperProof(), theXMLTypePackage.getBoolean(), "isTamperProof", "false", 0, 1, AttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachmentType_MimeType(), theXMLTypePackage.getString(), "mimeType", null, 1, 1, AttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachmentType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachmentType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, AttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachmentType_Specification(), theXMLTypePackage.getAnyURI(), "specification", null, 0, 1, AttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachmentType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, AttachmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeSubstitutionTypeEClass, AttributeSubstitutionType.class, "AttributeSubstitutionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeSubstitutionType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, AttributeSubstitutionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeSubstitutionType_AttributeName(), theXMLTypePackage.getString(), "attributeName", null, 0, 1, AttributeSubstitutionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeSubstitutionType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, AttributeSubstitutionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryCollaborationTypeEClass, BinaryCollaborationType.class, "BinaryCollaborationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryCollaborationType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCollaborationType_InitiatingRole(), this.getInitiatingRoleType(), null, "initiatingRole", null, 1, 1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCollaborationType_RespondingRole(), this.getRespondingRoleType(), null, "respondingRole", null, 1, 1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryCollaborationType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCollaborationType_Documentation1(), this.getDocumentationType(), null, "documentation1", null, 0, -1, BinaryCollaborationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCollaborationType_Start(), this.getStartType(), null, "start", null, 0, -1, BinaryCollaborationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCollaborationType_Transition(), this.getTransitionType(), null, "transition", null, 0, -1, BinaryCollaborationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCollaborationType_Success(), this.getSuccessType(), null, "success", null, 0, -1, BinaryCollaborationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCollaborationType_Failure(), this.getFailureType(), null, "failure", null, 0, -1, BinaryCollaborationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCollaborationType_BusinessTransactionActivity(), this.getBusinessTransactionActivityType(), null, "businessTransactionActivity", null, 0, -1, BinaryCollaborationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCollaborationType_CollaborationActivity(), this.getCollaborationActivityType(), null, "collaborationActivity", null, 0, -1, BinaryCollaborationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCollaborationType_Fork(), this.getForkType(), null, "fork", null, 0, -1, BinaryCollaborationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCollaborationType_Join(), this.getJoinType(), null, "join", null, 0, -1, BinaryCollaborationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryCollaborationType_BeginsWhen(), theXMLTypePackage.getString(), "beginsWhen", null, 0, 1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryCollaborationType_EndsWhen(), theXMLTypePackage.getString(), "endsWhen", null, 0, 1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryCollaborationType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryCollaborationType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryCollaborationType_Pattern(), theXMLTypePackage.getAnyURI(), "pattern", null, 0, 1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryCollaborationType_PostCondition(), theXMLTypePackage.getString(), "postCondition", null, 0, 1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryCollaborationType_PreCondition(), theXMLTypePackage.getString(), "preCondition", null, 0, 1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryCollaborationType_TimeToPerform(), theXMLTypePackage.getDuration(), "timeToPerform", null, 0, 1, BinaryCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessDocumentTypeEClass, BusinessDocumentType.class, "BusinessDocumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessDocumentType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, BusinessDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessDocumentType_ConditionExpression(), this.getConditionExpressionType(), null, "conditionExpression", null, 0, 1, BusinessDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessDocumentType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, BusinessDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessDocumentType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, BusinessDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessDocumentType_SpecificationElement(), theXMLTypePackage.getString(), "specificationElement", null, 0, 1, BusinessDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessDocumentType_SpecificationLocation(), theXMLTypePackage.getString(), "specificationLocation", null, 0, 1, BusinessDocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessPartnerRoleTypeEClass, BusinessPartnerRoleType.class, "BusinessPartnerRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessPartnerRoleType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, BusinessPartnerRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessPartnerRoleType_Performs(), this.getPerformsType(), null, "performs", null, 0, -1, BusinessPartnerRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessPartnerRoleType_Transition(), this.getTransitionType(), null, "transition", null, 0, -1, BusinessPartnerRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessPartnerRoleType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, BusinessPartnerRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessPartnerRoleType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, BusinessPartnerRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessTransactionActivityTypeEClass, BusinessTransactionActivityType.class, "BusinessTransactionActivityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessTransactionActivityType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionActivityType_BusinessTransaction(), theXMLTypePackage.getString(), "businessTransaction", null, 1, 1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionActivityType_BusinessTransactionIDRef(), theXMLTypePackage.getIDREF(), "businessTransactionIDRef", null, 0, 1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionActivityType_FromAuthorizedRole(), theXMLTypePackage.getString(), "fromAuthorizedRole", null, 1, 1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionActivityType_FromAuthorizedRoleIDRef(), theXMLTypePackage.getIDREF(), "fromAuthorizedRoleIDRef", null, 0, 1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionActivityType_IsConcurrent(), theXMLTypePackage.getBoolean(), "isConcurrent", "true", 0, 1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionActivityType_IsLegallyBinding(), theXMLTypePackage.getBoolean(), "isLegallyBinding", "true", 0, 1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionActivityType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionActivityType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionActivityType_TimeToPerform(), theXMLTypePackage.getDuration(), "timeToPerform", null, 0, 1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionActivityType_ToAuthorizedRole(), theXMLTypePackage.getString(), "toAuthorizedRole", null, 1, 1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionActivityType_ToAuthorizedRoleIDRef(), theXMLTypePackage.getIDREF(), "toAuthorizedRoleIDRef", null, 0, 1, BusinessTransactionActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessTransactionTypeEClass, BusinessTransactionType.class, "BusinessTransactionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessTransactionType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, BusinessTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessTransactionType_RequestingBusinessActivity(), this.getRequestingBusinessActivityType(), null, "requestingBusinessActivity", null, 1, 1, BusinessTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessTransactionType_RespondingBusinessActivity(), this.getRespondingBusinessActivityType(), null, "respondingBusinessActivity", null, 1, 1, BusinessTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionType_BeginsWhen(), theXMLTypePackage.getString(), "beginsWhen", null, 0, 1, BusinessTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionType_EndsWhen(), theXMLTypePackage.getString(), "endsWhen", null, 0, 1, BusinessTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionType_IsGuaranteedDeliveryRequired(), theXMLTypePackage.getBoolean(), "isGuaranteedDeliveryRequired", "false", 0, 1, BusinessTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, BusinessTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, BusinessTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionType_Pattern(), theXMLTypePackage.getAnyURI(), "pattern", null, 0, 1, BusinessTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionType_PostCondition(), theXMLTypePackage.getString(), "postCondition", null, 0, 1, BusinessTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTransactionType_PreCondition(), theXMLTypePackage.getString(), "preCondition", null, 0, 1, BusinessTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborationActivityTypeEClass, CollaborationActivityType.class, "CollaborationActivityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborationActivityType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, CollaborationActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationActivityType_BinaryCollaboration(), theXMLTypePackage.getString(), "binaryCollaboration", null, 1, 1, CollaborationActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationActivityType_BinaryCollaborationIDRef(), theXMLTypePackage.getIDREF(), "binaryCollaborationIDRef", null, 0, 1, CollaborationActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationActivityType_FromAuthorizedRole(), theXMLTypePackage.getString(), "fromAuthorizedRole", null, 1, 1, CollaborationActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationActivityType_FromAuthorizedRoleIDRef(), theXMLTypePackage.getIDREF(), "fromAuthorizedRoleIDRef", null, 0, 1, CollaborationActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationActivityType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, CollaborationActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationActivityType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, CollaborationActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationActivityType_ToAuthorizedRole(), theXMLTypePackage.getString(), "toAuthorizedRole", null, 1, 1, CollaborationActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborationActivityType_ToAuthorizedRoleIDRef(), theXMLTypePackage.getIDREF(), "toAuthorizedRoleIDRef", null, 0, 1, CollaborationActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionExpressionTypeEClass, ConditionExpressionType.class, "ConditionExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionExpressionType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, ConditionExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionExpressionType_Expression(), theXMLTypePackage.getString(), "expression", null, 0, 1, ConditionExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionExpressionType_ExpressionLanguage(), theXMLTypePackage.getString(), "expressionLanguage", null, 0, 1, ConditionExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationTypeEClass, DocumentationType.class, "DocumentationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentationType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, DocumentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentationType_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 0, 1, DocumentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEnvelopeTypeEClass, DocumentEnvelopeType.class, "DocumentEnvelopeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentEnvelopeType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, DocumentEnvelopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentEnvelopeType_Attachment(), this.getAttachmentType(), null, "attachment", null, 0, -1, DocumentEnvelopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEnvelopeType_BusinessDocument(), theXMLTypePackage.getString(), "businessDocument", null, 1, 1, DocumentEnvelopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEnvelopeType_BusinessDocumentIDRef(), theXMLTypePackage.getIDREF(), "businessDocumentIDRef", null, 0, 1, DocumentEnvelopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEnvelopeType_IsAuthenticated(), theXMLTypePackage.getBoolean(), "isAuthenticated", "false", 0, 1, DocumentEnvelopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEnvelopeType_IsConfidential(), theXMLTypePackage.getBoolean(), "isConfidential", "false", 0, 1, DocumentEnvelopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEnvelopeType_IsPositiveResponse(), theXMLTypePackage.getBoolean(), "isPositiveResponse", null, 0, 1, DocumentEnvelopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentEnvelopeType_IsTamperProof(), theXMLTypePackage.getBoolean(), "isTamperProof", "false", 0, 1, DocumentEnvelopeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Attachment(), this.getAttachmentType(), null, "attachment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AttributeSubstitution(), this.getAttributeSubstitutionType(), null, "attributeSubstitution", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BinaryCollaboration(), this.getBinaryCollaborationType(), null, "binaryCollaboration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BusinessDocument(), this.getBusinessDocumentType(), null, "businessDocument", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BusinessPartnerRole(), this.getBusinessPartnerRoleType(), null, "businessPartnerRole", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BusinessTransaction(), this.getBusinessTransactionType(), null, "businessTransaction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BusinessTransactionActivity(), this.getBusinessTransactionActivityType(), null, "businessTransactionActivity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CollaborationActivity(), this.getCollaborationActivityType(), null, "collaborationActivity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConditionExpression(), this.getConditionExpressionType(), null, "conditionExpression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DocumentEnvelope(), this.getDocumentEnvelopeType(), null, "documentEnvelope", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DocumentSubstitution(), this.getDocumentSubstitutionType(), null, "documentSubstitution", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Failure(), this.getFailureType(), null, "failure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Fork(), this.getForkType(), null, "fork", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Include(), this.getIncludeType(), null, "include", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InitiatingRole(), this.getInitiatingRoleType(), null, "initiatingRole", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Join(), this.getJoinType(), null, "join", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MultiPartyCollaboration(), this.getMultiPartyCollaborationType(), null, "multiPartyCollaboration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Package(), this.getPackageType(), null, "package", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Performs(), this.getPerformsType(), null, "performs", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ProcessSpecification(), this.getProcessSpecificationType(), null, "processSpecification", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequestingBusinessActivity(), this.getRequestingBusinessActivityType(), null, "requestingBusinessActivity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RespondingBusinessActivity(), this.getRespondingBusinessActivityType(), null, "respondingBusinessActivity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RespondingRole(), this.getRespondingRoleType(), null, "respondingRole", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Start(), this.getStartType(), null, "start", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SubstitutionSet(), this.getSubstitutionSetType(), null, "substitutionSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Success(), this.getSuccessType(), null, "success", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transition(), this.getTransitionType(), null, "transition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentSubstitutionTypeEClass, DocumentSubstitutionType.class, "DocumentSubstitutionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentSubstitutionType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, DocumentSubstitutionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentSubstitutionType_OriginalBusinessDocument(), theXMLTypePackage.getString(), "originalBusinessDocument", null, 0, 1, DocumentSubstitutionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentSubstitutionType_OriginalBusinessDocumentID(), theXMLTypePackage.getID(), "originalBusinessDocumentID", null, 0, 1, DocumentSubstitutionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentSubstitutionType_SubstituteBusinessDocument(), theXMLTypePackage.getString(), "substituteBusinessDocument", null, 0, 1, DocumentSubstitutionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentSubstitutionType_SubstituteBusinessDocumentId(), theXMLTypePackage.getString(), "substituteBusinessDocumentId", null, 0, 1, DocumentSubstitutionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureTypeEClass, FailureType.class, "FailureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailureType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, FailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureType_ConditionExpression(), this.getConditionExpressionType(), null, "conditionExpression", null, 0, 1, FailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureType_ConditionGuard(), this.getConditionGuardType1(), "conditionGuard", null, 0, 1, FailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureType_FromBusinessState(), theXMLTypePackage.getString(), "fromBusinessState", null, 1, 1, FailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureType_FromBusinessStateIDRef(), theXMLTypePackage.getIDREF(), "fromBusinessStateIDRef", null, 0, 1, FailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkTypeEClass, ForkType.class, "ForkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, ForkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForkType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ForkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForkType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, ForkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includeTypeEClass, IncludeType.class, "IncludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncludeType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 1, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Uuid(), theXMLTypePackage.getString(), "uuid", null, 1, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initiatingRoleTypeEClass, InitiatingRoleType.class, "InitiatingRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitiatingRoleType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, InitiatingRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitiatingRoleType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, InitiatingRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitiatingRoleType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, InitiatingRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinTypeEClass, JoinType.class, "JoinType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, JoinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, JoinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, JoinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinType_WaitForAll(), theXMLTypePackage.getBoolean(), "waitForAll", "true", 0, 1, JoinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiPartyCollaborationTypeEClass, MultiPartyCollaborationType.class, "MultiPartyCollaborationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiPartyCollaborationType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, MultiPartyCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiPartyCollaborationType_BusinessPartnerRole(), this.getBusinessPartnerRoleType(), null, "businessPartnerRole", null, 0, -1, MultiPartyCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiPartyCollaborationType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MultiPartyCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiPartyCollaborationType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, MultiPartyCollaborationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageTypeEClass, PackageType.class, "PackageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_Package(), this.getPackageType(), null, "package", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_BinaryCollaboration(), this.getBinaryCollaborationType(), null, "binaryCollaboration", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_BusinessTransaction(), this.getBusinessTransactionType(), null, "businessTransaction", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageType_MultiPartyCollaboration(), this.getMultiPartyCollaborationType(), null, "multiPartyCollaboration", null, 0, -1, PackageType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, PackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performsTypeEClass, PerformsType.class, "PerformsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformsType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, PerformsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformsType_InitiatingRole(), theXMLTypePackage.getString(), "initiatingRole", null, 0, 1, PerformsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformsType_InitiatingRoleIDRef(), theXMLTypePackage.getIDREF(), "initiatingRoleIDRef", null, 0, 1, PerformsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformsType_RespondingRole(), theXMLTypePackage.getString(), "respondingRole", null, 0, 1, PerformsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformsType_RespondingRoleIDRef(), theXMLTypePackage.getIDREF(), "respondingRoleIDRef", null, 0, 1, PerformsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processSpecificationTypeEClass, ProcessSpecificationType.class, "ProcessSpecificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessSpecificationType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, ProcessSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessSpecificationType_SubstitutionSet(), this.getSubstitutionSetType(), null, "substitutionSet", null, 0, -1, ProcessSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessSpecificationType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ProcessSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessSpecificationType_Include(), this.getIncludeType(), null, "include", null, 0, -1, ProcessSpecificationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProcessSpecificationType_BusinessDocument(), this.getBusinessDocumentType(), null, "businessDocument", null, 0, -1, ProcessSpecificationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProcessSpecificationType_ProcessSpecification(), this.getProcessSpecificationType(), null, "processSpecification", null, 0, -1, ProcessSpecificationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProcessSpecificationType_Package(), this.getPackageType(), null, "package", null, 0, -1, ProcessSpecificationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProcessSpecificationType_BinaryCollaboration(), this.getBinaryCollaborationType(), null, "binaryCollaboration", null, 0, -1, ProcessSpecificationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProcessSpecificationType_BusinessTransaction(), this.getBusinessTransactionType(), null, "businessTransaction", null, 0, -1, ProcessSpecificationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProcessSpecificationType_MultiPartyCollaboration(), this.getMultiPartyCollaborationType(), null, "multiPartyCollaboration", null, 0, -1, ProcessSpecificationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessSpecificationType_Name(), theXMLTypePackage.getID(), "name", null, 1, 1, ProcessSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessSpecificationType_Uuid(), theXMLTypePackage.getString(), "uuid", null, 1, 1, ProcessSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessSpecificationType_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, ProcessSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestingBusinessActivityTypeEClass, RequestingBusinessActivityType.class, "RequestingBusinessActivityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestingBusinessActivityType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, RequestingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestingBusinessActivityType_DocumentEnvelope(), this.getDocumentEnvelopeType(), null, "documentEnvelope", null, 1, 1, RequestingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestingBusinessActivityType_IsAuthorizationRequired(), theXMLTypePackage.getBoolean(), "isAuthorizationRequired", "false", 0, 1, RequestingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestingBusinessActivityType_IsIntelligibleCheckRequired(), theXMLTypePackage.getBoolean(), "isIntelligibleCheckRequired", "false", 0, 1, RequestingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestingBusinessActivityType_IsNonRepudiationReceiptRequired(), theXMLTypePackage.getBoolean(), "isNonRepudiationReceiptRequired", "false", 0, 1, RequestingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestingBusinessActivityType_IsNonRepudiationRequired(), theXMLTypePackage.getBoolean(), "isNonRepudiationRequired", "false", 0, 1, RequestingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestingBusinessActivityType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RequestingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestingBusinessActivityType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, RequestingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestingBusinessActivityType_TimeToAcknowledgeAcceptance(), theXMLTypePackage.getDuration(), "timeToAcknowledgeAcceptance", null, 0, 1, RequestingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestingBusinessActivityType_TimeToAcknowledgeReceipt(), theXMLTypePackage.getDuration(), "timeToAcknowledgeReceipt", null, 0, 1, RequestingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(respondingBusinessActivityTypeEClass, RespondingBusinessActivityType.class, "RespondingBusinessActivityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRespondingBusinessActivityType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, RespondingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRespondingBusinessActivityType_DocumentEnvelope(), this.getDocumentEnvelopeType(), null, "documentEnvelope", null, 0, -1, RespondingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespondingBusinessActivityType_IsAuthorizationRequired(), theXMLTypePackage.getBoolean(), "isAuthorizationRequired", "false", 0, 1, RespondingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespondingBusinessActivityType_IsIntelligibleCheckRequired(), theXMLTypePackage.getBoolean(), "isIntelligibleCheckRequired", "false", 0, 1, RespondingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespondingBusinessActivityType_IsNonRepudiationReceiptRequired(), theXMLTypePackage.getBoolean(), "isNonRepudiationReceiptRequired", "false", 0, 1, RespondingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespondingBusinessActivityType_IsNonRepudiationRequired(), theXMLTypePackage.getBoolean(), "isNonRepudiationRequired", "false", 0, 1, RespondingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespondingBusinessActivityType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RespondingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespondingBusinessActivityType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, RespondingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespondingBusinessActivityType_TimeToAcknowledgeReceipt(), theXMLTypePackage.getDuration(), "timeToAcknowledgeReceipt", null, 0, 1, RespondingBusinessActivityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(respondingRoleTypeEClass, RespondingRoleType.class, "RespondingRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRespondingRoleType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, RespondingRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespondingRoleType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RespondingRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespondingRoleType_NameID(), theXMLTypePackage.getID(), "nameID", null, 0, 1, RespondingRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startTypeEClass, StartType.class, "StartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, StartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartType_ToBusinessState(), theXMLTypePackage.getString(), "toBusinessState", null, 1, 1, StartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStartType_ToBusinessStateIDRef(), theXMLTypePackage.getIDREF(), "toBusinessStateIDRef", null, 0, 1, StartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substitutionSetTypeEClass, SubstitutionSetType.class, "SubstitutionSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstitutionSetType_DocumentSubstitution(), this.getDocumentSubstitutionType(), null, "documentSubstitution", null, 0, -1, SubstitutionSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstitutionSetType_AttributeSubstitution(), this.getAttributeSubstitutionType(), null, "attributeSubstitution", null, 0, -1, SubstitutionSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstitutionSetType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, SubstitutionSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstitutionSetType_ApplyToScope(), theXMLTypePackage.getString(), "applyToScope", null, 0, 1, SubstitutionSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstitutionSetType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SubstitutionSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstitutionSetType_NameId(), theXMLTypePackage.getID(), "nameId", null, 0, 1, SubstitutionSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(successTypeEClass, SuccessType.class, "SuccessType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuccessType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, SuccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuccessType_ConditionExpression(), this.getConditionExpressionType(), null, "conditionExpression", null, 0, 1, SuccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuccessType_ConditionGuard(), this.getConditionGuardType(), "conditionGuard", null, 0, 1, SuccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuccessType_FromBusinessState(), theXMLTypePackage.getString(), "fromBusinessState", null, 1, 1, SuccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuccessType_FromBusinessStateIDRef(), theXMLTypePackage.getIDREF(), "fromBusinessStateIDRef", null, 0, 1, SuccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionTypeEClass, TransitionType.class, "TransitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionType_ConditionExpression(), this.getConditionExpressionType(), null, "conditionExpression", null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_ConditionGuard(), this.getConditionGuardType2(), "conditionGuard", null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_FromBusinessState(), theXMLTypePackage.getString(), "fromBusinessState", null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_FromBusinessStateIDRef(), theXMLTypePackage.getIDREF(), "fromBusinessStateIDRef", null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_OnInitiation(), theXMLTypePackage.getBoolean(), "onInitiation", "false", 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_ToBusinessState(), theXMLTypePackage.getString(), "toBusinessState", null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionType_ToBusinessStateIDRef(), theXMLTypePackage.getIDREF(), "toBusinessStateIDRef", null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(conditionGuardTypeEEnum, ConditionGuardType.class, "ConditionGuardType");
		addEEnumLiteral(conditionGuardTypeEEnum, ConditionGuardType.SUCCESS);
		addEEnumLiteral(conditionGuardTypeEEnum, ConditionGuardType.BUSINESS_FAILURE);
		addEEnumLiteral(conditionGuardTypeEEnum, ConditionGuardType.TECHNICAL_FAILURE);
		addEEnumLiteral(conditionGuardTypeEEnum, ConditionGuardType.ANY_FAILURE);

		initEEnum(conditionGuardType1EEnum, ConditionGuardType1.class, "ConditionGuardType1");
		addEEnumLiteral(conditionGuardType1EEnum, ConditionGuardType1.SUCCESS);
		addEEnumLiteral(conditionGuardType1EEnum, ConditionGuardType1.BUSINESS_FAILURE);
		addEEnumLiteral(conditionGuardType1EEnum, ConditionGuardType1.TECHNICAL_FAILURE);
		addEEnumLiteral(conditionGuardType1EEnum, ConditionGuardType1.ANY_FAILURE);

		initEEnum(conditionGuardType2EEnum, ConditionGuardType2.class, "ConditionGuardType2");
		addEEnumLiteral(conditionGuardType2EEnum, ConditionGuardType2.SUCCESS);
		addEEnumLiteral(conditionGuardType2EEnum, ConditionGuardType2.BUSINESS_FAILURE);
		addEEnumLiteral(conditionGuardType2EEnum, ConditionGuardType2.TECHNICAL_FAILURE);
		addEEnumLiteral(conditionGuardType2EEnum, ConditionGuardType2.ANY_FAILURE);

		// Initialize data types
		initEDataType(conditionGuardTypeObjectEDataType, ConditionGuardType.class, "ConditionGuardTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(conditionGuardTypeObject1EDataType, ConditionGuardType1.class, "ConditionGuardTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(conditionGuardTypeObject2EDataType, ConditionGuardType2.class, "ConditionGuardTypeObject2", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (attachmentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Attachment_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAttachmentType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttachmentType_BusinessDocument(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "businessDocument"
		   });		
		addAnnotation
		  (getAttachmentType_BusinessDocumentIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "businessDocumentIDRef"
		   });		
		addAnnotation
		  (getAttachmentType_IsAuthenticated(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isAuthenticated"
		   });		
		addAnnotation
		  (getAttachmentType_IsConfidential(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isConfidential"
		   });		
		addAnnotation
		  (getAttachmentType_IsTamperProof(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isTamperProof"
		   });		
		addAnnotation
		  (getAttachmentType_MimeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimeType"
		   });		
		addAnnotation
		  (getAttachmentType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getAttachmentType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (getAttachmentType_Specification(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specification"
		   });		
		addAnnotation
		  (getAttachmentType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (attributeSubstitutionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AttributeSubstitution_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAttributeSubstitutionType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeSubstitutionType_AttributeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attributeName"
		   });		
		addAnnotation
		  (getAttributeSubstitutionType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (binaryCollaborationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BinaryCollaboration_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_InitiatingRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InitiatingRole",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_RespondingRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RespondingRole",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_Documentation1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_Start(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Start",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_Transition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transition",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_Success(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Success",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_Failure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Failure",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_BusinessTransactionActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessTransactionActivity",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_CollaborationActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CollaborationActivity",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_Fork(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fork",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_Join(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Join",
			 "namespace", "##targetNamespace",
			 "group", "#group:3"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_BeginsWhen(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "beginsWhen"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_EndsWhen(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endsWhen"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_Pattern(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pattern"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_PostCondition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "postCondition"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_PreCondition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preCondition"
		   });		
		addAnnotation
		  (getBinaryCollaborationType_TimeToPerform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timeToPerform"
		   });		
		addAnnotation
		  (businessDocumentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BusinessDocument_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBusinessDocumentType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessDocumentType_ConditionExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConditionExpression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessDocumentType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getBusinessDocumentType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (getBusinessDocumentType_SpecificationElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specificationElement"
		   });		
		addAnnotation
		  (getBusinessDocumentType_SpecificationLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specificationLocation"
		   });		
		addAnnotation
		  (businessPartnerRoleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BusinessPartnerRole_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBusinessPartnerRoleType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessPartnerRoleType_Performs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Performs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessPartnerRoleType_Transition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transition",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessPartnerRoleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getBusinessPartnerRoleType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (businessTransactionActivityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BusinessTransactionActivity_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_BusinessTransaction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "businessTransaction"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_BusinessTransactionIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "businessTransactionIDRef"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_FromAuthorizedRole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromAuthorizedRole"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_FromAuthorizedRoleIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromAuthorizedRoleIDRef"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_IsConcurrent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isConcurrent"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_IsLegallyBinding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isLegallyBinding"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_TimeToPerform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timeToPerform"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_ToAuthorizedRole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toAuthorizedRole"
		   });		
		addAnnotation
		  (getBusinessTransactionActivityType_ToAuthorizedRoleIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toAuthorizedRoleIDRef"
		   });		
		addAnnotation
		  (businessTransactionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BusinessTransaction_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBusinessTransactionType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessTransactionType_RequestingBusinessActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestingBusinessActivity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessTransactionType_RespondingBusinessActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RespondingBusinessActivity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBusinessTransactionType_BeginsWhen(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "beginsWhen"
		   });		
		addAnnotation
		  (getBusinessTransactionType_EndsWhen(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endsWhen"
		   });		
		addAnnotation
		  (getBusinessTransactionType_IsGuaranteedDeliveryRequired(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isGuaranteedDeliveryRequired"
		   });		
		addAnnotation
		  (getBusinessTransactionType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getBusinessTransactionType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (getBusinessTransactionType_Pattern(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pattern"
		   });		
		addAnnotation
		  (getBusinessTransactionType_PostCondition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "postCondition"
		   });		
		addAnnotation
		  (getBusinessTransactionType_PreCondition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preCondition"
		   });		
		addAnnotation
		  (collaborationActivityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CollaborationActivity_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCollaborationActivityType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollaborationActivityType_BinaryCollaboration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "binaryCollaboration"
		   });		
		addAnnotation
		  (getCollaborationActivityType_BinaryCollaborationIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "binaryCollaborationIDRef"
		   });		
		addAnnotation
		  (getCollaborationActivityType_FromAuthorizedRole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromAuthorizedRole"
		   });		
		addAnnotation
		  (getCollaborationActivityType_FromAuthorizedRoleIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromAuthorizedRoleIDRef"
		   });		
		addAnnotation
		  (getCollaborationActivityType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getCollaborationActivityType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (getCollaborationActivityType_ToAuthorizedRole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toAuthorizedRole"
		   });		
		addAnnotation
		  (getCollaborationActivityType_ToAuthorizedRoleIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toAuthorizedRoleIDRef"
		   });		
		addAnnotation
		  (conditionExpressionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ConditionExpression_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConditionExpressionType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConditionExpressionType_Expression(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "expression"
		   });		
		addAnnotation
		  (getConditionExpressionType_ExpressionLanguage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "expressionLanguage"
		   });		
		addAnnotation
		  (conditionGuardTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "conditionGuard_._type"
		   });		
		addAnnotation
		  (conditionGuardType1EEnum, 
		   source, 
		   new String[] {
			 "name", "conditionGuard_._1_._type"
		   });		
		addAnnotation
		  (conditionGuardType2EEnum, 
		   source, 
		   new String[] {
			 "name", "conditionGuard_._2_._type"
		   });		
		addAnnotation
		  (conditionGuardTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "conditionGuard_._type:Object",
			 "baseType", "conditionGuard_._type"
		   });		
		addAnnotation
		  (conditionGuardTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "conditionGuard_._1_._type:Object",
			 "baseType", "conditionGuard_._1_._type"
		   });		
		addAnnotation
		  (conditionGuardTypeObject2EDataType, 
		   source, 
		   new String[] {
			 "name", "conditionGuard_._2_._type:Object",
			 "baseType", "conditionGuard_._2_._type"
		   });		
		addAnnotation
		  (documentationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Documentation_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDocumentationType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDocumentationType_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });		
		addAnnotation
		  (documentEnvelopeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DocumentEnvelope_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocumentEnvelopeType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentEnvelopeType_Attachment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Attachment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentEnvelopeType_BusinessDocument(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "businessDocument"
		   });		
		addAnnotation
		  (getDocumentEnvelopeType_BusinessDocumentIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "businessDocumentIDRef"
		   });		
		addAnnotation
		  (getDocumentEnvelopeType_IsAuthenticated(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isAuthenticated"
		   });		
		addAnnotation
		  (getDocumentEnvelopeType_IsConfidential(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isConfidential"
		   });		
		addAnnotation
		  (getDocumentEnvelopeType_IsPositiveResponse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isPositiveResponse"
		   });		
		addAnnotation
		  (getDocumentEnvelopeType_IsTamperProof(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isTamperProof"
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
		  (getDocumentRoot_Attachment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Attachment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AttributeSubstitution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AttributeSubstitution",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BinaryCollaboration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BinaryCollaboration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BusinessDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessDocument",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BusinessPartnerRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessPartnerRole",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BusinessTransaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessTransaction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BusinessTransactionActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessTransactionActivity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CollaborationActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CollaborationActivity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ConditionExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConditionExpression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DocumentEnvelope(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DocumentEnvelope",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DocumentSubstitution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DocumentSubstitution",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Failure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Failure",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Fork(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fork",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Include",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_InitiatingRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InitiatingRole",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Join(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Join",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MultiPartyCollaboration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MultiPartyCollaboration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Package(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Package",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Performs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Performs",
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
		  (getDocumentRoot_RequestingBusinessActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequestingBusinessActivity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RespondingBusinessActivity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RespondingBusinessActivity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RespondingRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RespondingRole",
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
		  (getDocumentRoot_SubstitutionSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SubstitutionSet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Success(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Success",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Transition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transition",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentSubstitutionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DocumentSubstitution_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocumentSubstitutionType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentSubstitutionType_OriginalBusinessDocument(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "originalBusinessDocument"
		   });		
		addAnnotation
		  (getDocumentSubstitutionType_OriginalBusinessDocumentID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "originalBusinessDocumentID"
		   });		
		addAnnotation
		  (getDocumentSubstitutionType_SubstituteBusinessDocument(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "substituteBusinessDocument"
		   });		
		addAnnotation
		  (getDocumentSubstitutionType_SubstituteBusinessDocumentId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "substituteBusinessDocumentId"
		   });		
		addAnnotation
		  (failureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Failure_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFailureType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFailureType_ConditionExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConditionExpression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFailureType_ConditionGuard(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "conditionGuard"
		   });		
		addAnnotation
		  (getFailureType_FromBusinessState(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromBusinessState"
		   });		
		addAnnotation
		  (getFailureType_FromBusinessStateIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromBusinessStateIDRef"
		   });		
		addAnnotation
		  (forkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Fork_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getForkType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getForkType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getForkType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (includeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Include_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIncludeType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIncludeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getIncludeType_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });		
		addAnnotation
		  (getIncludeType_Uuid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uuid"
		   });		
		addAnnotation
		  (getIncludeType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (initiatingRoleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InitiatingRole_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInitiatingRoleType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInitiatingRoleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getInitiatingRoleType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (joinTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Join_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getJoinType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getJoinType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getJoinType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (getJoinType_WaitForAll(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "waitForAll"
		   });		
		addAnnotation
		  (multiPartyCollaborationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MultiPartyCollaboration_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMultiPartyCollaborationType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMultiPartyCollaborationType_BusinessPartnerRole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessPartnerRole",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMultiPartyCollaborationType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getMultiPartyCollaborationType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (packageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Package_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPackageType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPackageType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getPackageType_Package(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Package",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPackageType_BinaryCollaboration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BinaryCollaboration",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPackageType_BusinessTransaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessTransaction",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPackageType_MultiPartyCollaboration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MultiPartyCollaboration",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPackageType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getPackageType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (performsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Performs_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPerformsType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPerformsType_InitiatingRole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "initiatingRole"
		   });		
		addAnnotation
		  (getPerformsType_InitiatingRoleIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "initiatingRoleIDRef"
		   });		
		addAnnotation
		  (getPerformsType_RespondingRole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "respondingRole"
		   });		
		addAnnotation
		  (getPerformsType_RespondingRoleIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "respondingRoleIDRef"
		   });		
		addAnnotation
		  (processSpecificationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProcessSpecification_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProcessSpecificationType_SubstitutionSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SubstitutionSet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:2"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Include",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getProcessSpecificationType_BusinessDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessDocument",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getProcessSpecificationType_ProcessSpecification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProcessSpecification",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Package(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Package",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getProcessSpecificationType_BinaryCollaboration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BinaryCollaboration",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getProcessSpecificationType_BusinessTransaction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessTransaction",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getProcessSpecificationType_MultiPartyCollaboration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MultiPartyCollaboration",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Uuid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uuid"
		   });		
		addAnnotation
		  (getProcessSpecificationType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (requestingBusinessActivityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RequestingBusinessActivity_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRequestingBusinessActivityType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRequestingBusinessActivityType_DocumentEnvelope(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DocumentEnvelope",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRequestingBusinessActivityType_IsAuthorizationRequired(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isAuthorizationRequired"
		   });		
		addAnnotation
		  (getRequestingBusinessActivityType_IsIntelligibleCheckRequired(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isIntelligibleCheckRequired"
		   });		
		addAnnotation
		  (getRequestingBusinessActivityType_IsNonRepudiationReceiptRequired(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isNonRepudiationReceiptRequired"
		   });		
		addAnnotation
		  (getRequestingBusinessActivityType_IsNonRepudiationRequired(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isNonRepudiationRequired"
		   });		
		addAnnotation
		  (getRequestingBusinessActivityType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getRequestingBusinessActivityType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (getRequestingBusinessActivityType_TimeToAcknowledgeAcceptance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timeToAcknowledgeAcceptance"
		   });		
		addAnnotation
		  (getRequestingBusinessActivityType_TimeToAcknowledgeReceipt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timeToAcknowledgeReceipt"
		   });		
		addAnnotation
		  (respondingBusinessActivityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RespondingBusinessActivity_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRespondingBusinessActivityType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRespondingBusinessActivityType_DocumentEnvelope(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DocumentEnvelope",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRespondingBusinessActivityType_IsAuthorizationRequired(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isAuthorizationRequired"
		   });		
		addAnnotation
		  (getRespondingBusinessActivityType_IsIntelligibleCheckRequired(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isIntelligibleCheckRequired"
		   });		
		addAnnotation
		  (getRespondingBusinessActivityType_IsNonRepudiationReceiptRequired(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isNonRepudiationReceiptRequired"
		   });		
		addAnnotation
		  (getRespondingBusinessActivityType_IsNonRepudiationRequired(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isNonRepudiationRequired"
		   });		
		addAnnotation
		  (getRespondingBusinessActivityType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getRespondingBusinessActivityType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (getRespondingBusinessActivityType_TimeToAcknowledgeReceipt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timeToAcknowledgeReceipt"
		   });		
		addAnnotation
		  (respondingRoleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RespondingRole_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRespondingRoleType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRespondingRoleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getRespondingRoleType_NameID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameID"
		   });		
		addAnnotation
		  (startTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Start_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStartType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStartType_ToBusinessState(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toBusinessState"
		   });		
		addAnnotation
		  (getStartType_ToBusinessStateIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toBusinessStateIDRef"
		   });		
		addAnnotation
		  (substitutionSetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SubstitutionSet_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubstitutionSetType_DocumentSubstitution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DocumentSubstitution",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubstitutionSetType_AttributeSubstitution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AttributeSubstitution",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubstitutionSetType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubstitutionSetType_ApplyToScope(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "applyToScope"
		   });		
		addAnnotation
		  (getSubstitutionSetType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getSubstitutionSetType_NameId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameId"
		   });		
		addAnnotation
		  (successTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Success_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSuccessType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSuccessType_ConditionExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConditionExpression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSuccessType_ConditionGuard(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "conditionGuard"
		   });		
		addAnnotation
		  (getSuccessType_FromBusinessState(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromBusinessState"
		   });		
		addAnnotation
		  (getSuccessType_FromBusinessStateIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromBusinessStateIDRef"
		   });		
		addAnnotation
		  (transitionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Transition_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransitionType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransitionType_ConditionExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConditionExpression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransitionType_ConditionGuard(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "conditionGuard"
		   });		
		addAnnotation
		  (getTransitionType_FromBusinessState(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromBusinessState"
		   });		
		addAnnotation
		  (getTransitionType_FromBusinessStateIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fromBusinessStateIDRef"
		   });		
		addAnnotation
		  (getTransitionType_OnInitiation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onInitiation"
		   });		
		addAnnotation
		  (getTransitionType_ToBusinessState(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toBusinessState"
		   });		
		addAnnotation
		  (getTransitionType_ToBusinessStateIDRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "toBusinessStateIDRef"
		   });
	}

} //ProcessPackageImpl
