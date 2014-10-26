/**
 */
package org.ebxml.business.process.util;

import org.ebxml.business.process.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ebxml.business.process.ProcessPackage
 * @generated
 */
public class ProcessAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProcessPackage.eINSTANCE;
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
	protected ProcessSwitch<Adapter> modelSwitch =
		new ProcessSwitch<Adapter>() {
			@Override
			public Adapter caseAttachmentType(AttachmentType object) {
				return createAttachmentTypeAdapter();
			}
			@Override
			public Adapter caseAttributeSubstitutionType(AttributeSubstitutionType object) {
				return createAttributeSubstitutionTypeAdapter();
			}
			@Override
			public Adapter caseBinaryCollaborationType(BinaryCollaborationType object) {
				return createBinaryCollaborationTypeAdapter();
			}
			@Override
			public Adapter caseBusinessDocumentType(BusinessDocumentType object) {
				return createBusinessDocumentTypeAdapter();
			}
			@Override
			public Adapter caseBusinessPartnerRoleType(BusinessPartnerRoleType object) {
				return createBusinessPartnerRoleTypeAdapter();
			}
			@Override
			public Adapter caseBusinessTransactionActivityType(BusinessTransactionActivityType object) {
				return createBusinessTransactionActivityTypeAdapter();
			}
			@Override
			public Adapter caseBusinessTransactionType(BusinessTransactionType object) {
				return createBusinessTransactionTypeAdapter();
			}
			@Override
			public Adapter caseCollaborationActivityType(CollaborationActivityType object) {
				return createCollaborationActivityTypeAdapter();
			}
			@Override
			public Adapter caseConditionExpressionType(ConditionExpressionType object) {
				return createConditionExpressionTypeAdapter();
			}
			@Override
			public Adapter caseDocumentationType(DocumentationType object) {
				return createDocumentationTypeAdapter();
			}
			@Override
			public Adapter caseDocumentEnvelopeType(DocumentEnvelopeType object) {
				return createDocumentEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDocumentSubstitutionType(DocumentSubstitutionType object) {
				return createDocumentSubstitutionTypeAdapter();
			}
			@Override
			public Adapter caseFailureType(FailureType object) {
				return createFailureTypeAdapter();
			}
			@Override
			public Adapter caseForkType(ForkType object) {
				return createForkTypeAdapter();
			}
			@Override
			public Adapter caseIncludeType(IncludeType object) {
				return createIncludeTypeAdapter();
			}
			@Override
			public Adapter caseInitiatingRoleType(InitiatingRoleType object) {
				return createInitiatingRoleTypeAdapter();
			}
			@Override
			public Adapter caseJoinType(JoinType object) {
				return createJoinTypeAdapter();
			}
			@Override
			public Adapter caseMultiPartyCollaborationType(MultiPartyCollaborationType object) {
				return createMultiPartyCollaborationTypeAdapter();
			}
			@Override
			public Adapter casePackageType(PackageType object) {
				return createPackageTypeAdapter();
			}
			@Override
			public Adapter casePerformsType(PerformsType object) {
				return createPerformsTypeAdapter();
			}
			@Override
			public Adapter caseProcessSpecificationType(ProcessSpecificationType object) {
				return createProcessSpecificationTypeAdapter();
			}
			@Override
			public Adapter caseRequestingBusinessActivityType(RequestingBusinessActivityType object) {
				return createRequestingBusinessActivityTypeAdapter();
			}
			@Override
			public Adapter caseRespondingBusinessActivityType(RespondingBusinessActivityType object) {
				return createRespondingBusinessActivityTypeAdapter();
			}
			@Override
			public Adapter caseRespondingRoleType(RespondingRoleType object) {
				return createRespondingRoleTypeAdapter();
			}
			@Override
			public Adapter caseStartType(StartType object) {
				return createStartTypeAdapter();
			}
			@Override
			public Adapter caseSubstitutionSetType(SubstitutionSetType object) {
				return createSubstitutionSetTypeAdapter();
			}
			@Override
			public Adapter caseSuccessType(SuccessType object) {
				return createSuccessTypeAdapter();
			}
			@Override
			public Adapter caseTransitionType(TransitionType object) {
				return createTransitionTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.AttachmentType <em>Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.AttachmentType
	 * @generated
	 */
	public Adapter createAttachmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.AttributeSubstitutionType <em>Attribute Substitution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.AttributeSubstitutionType
	 * @generated
	 */
	public Adapter createAttributeSubstitutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.BinaryCollaborationType <em>Binary Collaboration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.BinaryCollaborationType
	 * @generated
	 */
	public Adapter createBinaryCollaborationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.BusinessDocumentType <em>Business Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.BusinessDocumentType
	 * @generated
	 */
	public Adapter createBusinessDocumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.BusinessPartnerRoleType <em>Business Partner Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.BusinessPartnerRoleType
	 * @generated
	 */
	public Adapter createBusinessPartnerRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.BusinessTransactionActivityType <em>Business Transaction Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType
	 * @generated
	 */
	public Adapter createBusinessTransactionActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.BusinessTransactionType <em>Business Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.BusinessTransactionType
	 * @generated
	 */
	public Adapter createBusinessTransactionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.CollaborationActivityType <em>Collaboration Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.CollaborationActivityType
	 * @generated
	 */
	public Adapter createCollaborationActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.ConditionExpressionType <em>Condition Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.ConditionExpressionType
	 * @generated
	 */
	public Adapter createConditionExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.DocumentationType <em>Documentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.DocumentationType
	 * @generated
	 */
	public Adapter createDocumentationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.DocumentEnvelopeType <em>Document Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.DocumentEnvelopeType
	 * @generated
	 */
	public Adapter createDocumentEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.DocumentSubstitutionType <em>Document Substitution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.DocumentSubstitutionType
	 * @generated
	 */
	public Adapter createDocumentSubstitutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.FailureType <em>Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.FailureType
	 * @generated
	 */
	public Adapter createFailureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.ForkType <em>Fork Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.ForkType
	 * @generated
	 */
	public Adapter createForkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.IncludeType
	 * @generated
	 */
	public Adapter createIncludeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.InitiatingRoleType <em>Initiating Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.InitiatingRoleType
	 * @generated
	 */
	public Adapter createInitiatingRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.JoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.JoinType
	 * @generated
	 */
	public Adapter createJoinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.MultiPartyCollaborationType <em>Multi Party Collaboration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.MultiPartyCollaborationType
	 * @generated
	 */
	public Adapter createMultiPartyCollaborationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.PackageType
	 * @generated
	 */
	public Adapter createPackageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.PerformsType <em>Performs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.PerformsType
	 * @generated
	 */
	public Adapter createPerformsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.ProcessSpecificationType <em>Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.ProcessSpecificationType
	 * @generated
	 */
	public Adapter createProcessSpecificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.RequestingBusinessActivityType <em>Requesting Business Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType
	 * @generated
	 */
	public Adapter createRequestingBusinessActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.RespondingBusinessActivityType <em>Responding Business Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.RespondingBusinessActivityType
	 * @generated
	 */
	public Adapter createRespondingBusinessActivityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.RespondingRoleType <em>Responding Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.RespondingRoleType
	 * @generated
	 */
	public Adapter createRespondingRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.StartType <em>Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.StartType
	 * @generated
	 */
	public Adapter createStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.SubstitutionSetType <em>Substitution Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.SubstitutionSetType
	 * @generated
	 */
	public Adapter createSubstitutionSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.SuccessType <em>Success Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.SuccessType
	 * @generated
	 */
	public Adapter createSuccessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ebxml.business.process.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ebxml.business.process.TransitionType
	 * @generated
	 */
	public Adapter createTransitionTypeAdapter() {
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

} //ProcessAdapterFactory
