/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ebxml.business.process.ProcessFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "process";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ebxml.org/BusinessProcess";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "process";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessPackage eINSTANCE = org.ebxml.business.process.impl.ProcessPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.AttachmentTypeImpl <em>Attachment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.AttachmentTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getAttachmentType()
	 * @generated
	 */
	int ATTACHMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Business Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE__BUSINESS_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Business Document ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE__BUSINESS_DOCUMENT_ID_REF = 2;

	/**
	 * The feature id for the '<em><b>Is Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE__IS_AUTHENTICATED = 3;

	/**
	 * The feature id for the '<em><b>Is Confidential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE__IS_CONFIDENTIAL = 4;

	/**
	 * The feature id for the '<em><b>Is Tamper Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE__IS_TAMPER_PROOF = 5;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE__MIME_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE__NAME_ID = 8;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE__SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE__VERSION = 10;

	/**
	 * The number of structural features of the '<em>Attachment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Attachment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.AttributeSubstitutionTypeImpl <em>Attribute Substitution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.AttributeSubstitutionTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getAttributeSubstitutionType()
	 * @generated
	 */
	int ATTRIBUTE_SUBSTITUTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SUBSTITUTION_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SUBSTITUTION_TYPE__ATTRIBUTE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SUBSTITUTION_TYPE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Attribute Substitution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SUBSTITUTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute Substitution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SUBSTITUTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl <em>Binary Collaboration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.BinaryCollaborationTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getBinaryCollaborationType()
	 * @generated
	 */
	int BINARY_COLLABORATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Initiating Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__INITIATING_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Responding Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__RESPONDING_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__GROUP = 3;

	/**
	 * The feature id for the '<em><b>Documentation1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__DOCUMENTATION1 = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__START = 5;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Success</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__SUCCESS = 7;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__FAILURE = 8;

	/**
	 * The feature id for the '<em><b>Business Transaction Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__BUSINESS_TRANSACTION_ACTIVITY = 9;

	/**
	 * The feature id for the '<em><b>Collaboration Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__COLLABORATION_ACTIVITY = 10;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__FORK = 11;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__JOIN = 12;

	/**
	 * The feature id for the '<em><b>Begins When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__BEGINS_WHEN = 13;

	/**
	 * The feature id for the '<em><b>Ends When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__ENDS_WHEN = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__NAME = 15;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__NAME_ID = 16;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__PATTERN = 17;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__POST_CONDITION = 18;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__PRE_CONDITION = 19;

	/**
	 * The feature id for the '<em><b>Time To Perform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE__TIME_TO_PERFORM = 20;

	/**
	 * The number of structural features of the '<em>Binary Collaboration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Binary Collaboration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COLLABORATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.BusinessDocumentTypeImpl <em>Business Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.BusinessDocumentTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getBusinessDocumentType()
	 * @generated
	 */
	int BUSINESS_DOCUMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOCUMENT_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOCUMENT_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOCUMENT_TYPE__NAME_ID = 3;

	/**
	 * The feature id for the '<em><b>Specification Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOCUMENT_TYPE__SPECIFICATION_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Specification Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOCUMENT_TYPE__SPECIFICATION_LOCATION = 5;

	/**
	 * The number of structural features of the '<em>Business Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOCUMENT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Business Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOCUMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.BusinessPartnerRoleTypeImpl <em>Business Partner Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.BusinessPartnerRoleTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getBusinessPartnerRoleType()
	 * @generated
	 */
	int BUSINESS_PARTNER_ROLE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARTNER_ROLE_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARTNER_ROLE_TYPE__PERFORMS = 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARTNER_ROLE_TYPE__TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARTNER_ROLE_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARTNER_ROLE_TYPE__NAME_ID = 4;

	/**
	 * The number of structural features of the '<em>Business Partner Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARTNER_ROLE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Business Partner Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PARTNER_ROLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl <em>Business Transaction Activity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getBusinessTransactionActivityType()
	 * @generated
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Business Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION = 1;

	/**
	 * The feature id for the '<em><b>Business Transaction ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION_ID_REF = 2;

	/**
	 * The feature id for the '<em><b>From Authorized Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE = 3;

	/**
	 * The feature id for the '<em><b>From Authorized Role ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF = 4;

	/**
	 * The feature id for the '<em><b>Is Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_CONCURRENT = 5;

	/**
	 * The feature id for the '<em><b>Is Legally Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_LEGALLY_BINDING = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME_ID = 8;

	/**
	 * The feature id for the '<em><b>Time To Perform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__TIME_TO_PERFORM = 9;

	/**
	 * The feature id for the '<em><b>To Authorized Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE = 10;

	/**
	 * The feature id for the '<em><b>To Authorized Role ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF = 11;

	/**
	 * The number of structural features of the '<em>Business Transaction Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Business Transaction Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_ACTIVITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl <em>Business Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.BusinessTransactionTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getBusinessTransactionType()
	 * @generated
	 */
	int BUSINESS_TRANSACTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Requesting Business Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Responding Business Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Begins When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE__BEGINS_WHEN = 3;

	/**
	 * The feature id for the '<em><b>Ends When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE__ENDS_WHEN = 4;

	/**
	 * The feature id for the '<em><b>Is Guaranteed Delivery Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE__IS_GUARANTEED_DELIVERY_REQUIRED = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE__NAME_ID = 7;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE__PATTERN = 8;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE__POST_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE__PRE_CONDITION = 10;

	/**
	 * The number of structural features of the '<em>Business Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Business Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.CollaborationActivityTypeImpl <em>Collaboration Activity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.CollaborationActivityTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getCollaborationActivityType()
	 * @generated
	 */
	int COLLABORATION_ACTIVITY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ACTIVITY_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Binary Collaboration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION = 1;

	/**
	 * The feature id for the '<em><b>Binary Collaboration ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION_ID_REF = 2;

	/**
	 * The feature id for the '<em><b>From Authorized Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE = 3;

	/**
	 * The feature id for the '<em><b>From Authorized Role ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ACTIVITY_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ACTIVITY_TYPE__NAME_ID = 6;

	/**
	 * The feature id for the '<em><b>To Authorized Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE = 7;

	/**
	 * The feature id for the '<em><b>To Authorized Role ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF = 8;

	/**
	 * The number of structural features of the '<em>Collaboration Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ACTIVITY_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Collaboration Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ACTIVITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.ConditionExpressionTypeImpl <em>Condition Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.ConditionExpressionTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionExpressionType()
	 * @generated
	 */
	int CONDITION_EXPRESSION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_TYPE__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_TYPE__EXPRESSION_LANGUAGE = 2;

	/**
	 * The number of structural features of the '<em>Condition Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Condition Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.DocumentationTypeImpl <em>Documentation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.DocumentationTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getDocumentationType()
	 * @generated
	 */
	int DOCUMENTATION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TYPE__URI = 1;

	/**
	 * The number of structural features of the '<em>Documentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Documentation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl <em>Document Envelope Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getDocumentEnvelopeType()
	 * @generated
	 */
	int DOCUMENT_ENVELOPE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENVELOPE_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENVELOPE_TYPE__ATTACHMENT = 1;

	/**
	 * The feature id for the '<em><b>Business Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Business Document ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT_ID_REF = 3;

	/**
	 * The feature id for the '<em><b>Is Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENVELOPE_TYPE__IS_AUTHENTICATED = 4;

	/**
	 * The feature id for the '<em><b>Is Confidential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENVELOPE_TYPE__IS_CONFIDENTIAL = 5;

	/**
	 * The feature id for the '<em><b>Is Positive Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENVELOPE_TYPE__IS_POSITIVE_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Is Tamper Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENVELOPE_TYPE__IS_TAMPER_PROOF = 7;

	/**
	 * The number of structural features of the '<em>Document Envelope Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENVELOPE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Document Envelope Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ENVELOPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.DocumentRootImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTACHMENT = 3;

	/**
	 * The feature id for the '<em><b>Attribute Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTE_SUBSTITUTION = 4;

	/**
	 * The feature id for the '<em><b>Binary Collaboration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINARY_COLLABORATION = 5;

	/**
	 * The feature id for the '<em><b>Business Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUSINESS_DOCUMENT = 6;

	/**
	 * The feature id for the '<em><b>Business Partner Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUSINESS_PARTNER_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Business Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUSINESS_TRANSACTION = 8;

	/**
	 * The feature id for the '<em><b>Business Transaction Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUSINESS_TRANSACTION_ACTIVITY = 9;

	/**
	 * The feature id for the '<em><b>Collaboration Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLABORATION_ACTIVITY = 10;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONDITION_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENTATION = 12;

	/**
	 * The feature id for the '<em><b>Document Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT_ENVELOPE = 13;

	/**
	 * The feature id for the '<em><b>Document Substitution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT_SUBSTITUTION = 14;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FAILURE = 15;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORK = 16;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INCLUDE = 17;

	/**
	 * The feature id for the '<em><b>Initiating Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INITIATING_ROLE = 18;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOIN = 19;

	/**
	 * The feature id for the '<em><b>Multi Party Collaboration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTI_PARTY_COLLABORATION = 20;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKAGE = 21;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERFORMS = 22;

	/**
	 * The feature id for the '<em><b>Process Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCESS_SPECIFICATION = 23;

	/**
	 * The feature id for the '<em><b>Requesting Business Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REQUESTING_BUSINESS_ACTIVITY = 24;

	/**
	 * The feature id for the '<em><b>Responding Business Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESPONDING_BUSINESS_ACTIVITY = 25;

	/**
	 * The feature id for the '<em><b>Responding Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESPONDING_ROLE = 26;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START = 27;

	/**
	 * The feature id for the '<em><b>Substitution Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBSTITUTION_SET = 28;

	/**
	 * The feature id for the '<em><b>Success</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUCCESS = 29;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSITION = 30;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 31;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.DocumentSubstitutionTypeImpl <em>Document Substitution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.DocumentSubstitutionTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getDocumentSubstitutionType()
	 * @generated
	 */
	int DOCUMENT_SUBSTITUTION_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SUBSTITUTION_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Original Business Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Original Business Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Substitute Business Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Substitute Business Document Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT_ID = 4;

	/**
	 * The number of structural features of the '<em>Document Substitution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SUBSTITUTION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Substitution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SUBSTITUTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.FailureTypeImpl <em>Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.FailureTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getFailureType()
	 * @generated
	 */
	int FAILURE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__CONDITION_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Condition Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__CONDITION_GUARD = 2;

	/**
	 * The feature id for the '<em><b>From Business State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__FROM_BUSINESS_STATE = 3;

	/**
	 * The feature id for the '<em><b>From Business State ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE__FROM_BUSINESS_STATE_ID_REF = 4;

	/**
	 * The number of structural features of the '<em>Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.ForkTypeImpl <em>Fork Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.ForkTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getForkType()
	 * @generated
	 */
	int FORK_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__NAME_ID = 2;

	/**
	 * The number of structural features of the '<em>Fork Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fork Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.IncludeTypeImpl <em>Include Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.IncludeTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getIncludeType()
	 * @generated
	 */
	int INCLUDE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__URI = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__UUID = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.InitiatingRoleTypeImpl <em>Initiating Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.InitiatingRoleTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getInitiatingRoleType()
	 * @generated
	 */
	int INITIATING_ROLE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATING_ROLE_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATING_ROLE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATING_ROLE_TYPE__NAME_ID = 2;

	/**
	 * The number of structural features of the '<em>Initiating Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATING_ROLE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Initiating Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATING_ROLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.JoinTypeImpl <em>Join Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.JoinTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getJoinType()
	 * @generated
	 */
	int JOIN_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__NAME_ID = 2;

	/**
	 * The feature id for the '<em><b>Wait For All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__WAIT_FOR_ALL = 3;

	/**
	 * The number of structural features of the '<em>Join Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Join Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.MultiPartyCollaborationTypeImpl <em>Multi Party Collaboration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.MultiPartyCollaborationTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getMultiPartyCollaborationType()
	 * @generated
	 */
	int MULTI_PARTY_COLLABORATION_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTY_COLLABORATION_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Business Partner Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTY_COLLABORATION_TYPE__BUSINESS_PARTNER_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTY_COLLABORATION_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTY_COLLABORATION_TYPE__NAME_ID = 3;

	/**
	 * The number of structural features of the '<em>Multi Party Collaboration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTY_COLLABORATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Multi Party Collaboration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTY_COLLABORATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.PackageTypeImpl <em>Package Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.PackageTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getPackageType()
	 * @generated
	 */
	int PACKAGE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Binary Collaboration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__BINARY_COLLABORATION = 3;

	/**
	 * The feature id for the '<em><b>Business Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__BUSINESS_TRANSACTION = 4;

	/**
	 * The feature id for the '<em><b>Multi Party Collaboration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__MULTI_PARTY_COLLABORATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE__NAME_ID = 7;

	/**
	 * The number of structural features of the '<em>Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Package Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.PerformsTypeImpl <em>Performs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.PerformsTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getPerformsType()
	 * @generated
	 */
	int PERFORMS_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMS_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Initiating Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMS_TYPE__INITIATING_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Initiating Role ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMS_TYPE__INITIATING_ROLE_ID_REF = 2;

	/**
	 * The feature id for the '<em><b>Responding Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMS_TYPE__RESPONDING_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Responding Role ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMS_TYPE__RESPONDING_ROLE_ID_REF = 4;

	/**
	 * The number of structural features of the '<em>Performs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Performs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl <em>Specification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.ProcessSpecificationTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getProcessSpecificationType()
	 * @generated
	 */
	int PROCESS_SPECIFICATION_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Substitution Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__SUBSTITUTION_SET = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__INCLUDE = 3;

	/**
	 * The feature id for the '<em><b>Business Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__BUSINESS_DOCUMENT = 4;

	/**
	 * The feature id for the '<em><b>Process Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__PROCESS_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Binary Collaboration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__BINARY_COLLABORATION = 7;

	/**
	 * The feature id for the '<em><b>Business Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__BUSINESS_TRANSACTION = 8;

	/**
	 * The feature id for the '<em><b>Multi Party Collaboration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__MULTI_PARTY_COLLABORATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__NAME = 10;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__UUID = 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__VERSION = 12;

	/**
	 * The number of structural features of the '<em>Specification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Specification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.RequestingBusinessActivityTypeImpl <em>Requesting Business Activity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.RequestingBusinessActivityTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getRequestingBusinessActivityType()
	 * @generated
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Document Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE = 1;

	/**
	 * The feature id for the '<em><b>Is Authorization Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Is Intelligible Check Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Is Non Repudiation Receipt Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED = 4;

	/**
	 * The feature id for the '<em><b>Is Non Repudiation Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE__NAME_ID = 7;

	/**
	 * The feature id for the '<em><b>Time To Acknowledge Acceptance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_ACCEPTANCE = 8;

	/**
	 * The feature id for the '<em><b>Time To Acknowledge Receipt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_RECEIPT = 9;

	/**
	 * The number of structural features of the '<em>Requesting Business Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Requesting Business Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTING_BUSINESS_ACTIVITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl <em>Responding Business Activity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getRespondingBusinessActivityType()
	 * @generated
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Document Envelope</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE = 1;

	/**
	 * The feature id for the '<em><b>Is Authorization Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Is Intelligible Check Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Is Non Repudiation Receipt Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED = 4;

	/**
	 * The feature id for the '<em><b>Is Non Repudiation Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME_ID = 7;

	/**
	 * The feature id for the '<em><b>Time To Acknowledge Receipt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_RECEIPT = 8;

	/**
	 * The number of structural features of the '<em>Responding Business Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Responding Business Activity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_BUSINESS_ACTIVITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.RespondingRoleTypeImpl <em>Responding Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.RespondingRoleTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getRespondingRoleType()
	 * @generated
	 */
	int RESPONDING_ROLE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_ROLE_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_ROLE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_ROLE_TYPE__NAME_ID = 2;

	/**
	 * The number of structural features of the '<em>Responding Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_ROLE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Responding Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_ROLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.StartTypeImpl <em>Start Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.StartTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getStartType()
	 * @generated
	 */
	int START_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>To Business State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__TO_BUSINESS_STATE = 1;

	/**
	 * The feature id for the '<em><b>To Business State ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__TO_BUSINESS_STATE_ID_REF = 2;

	/**
	 * The number of structural features of the '<em>Start Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Start Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.SubstitutionSetTypeImpl <em>Substitution Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.SubstitutionSetTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getSubstitutionSetType()
	 * @generated
	 */
	int SUBSTITUTION_SET_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Document Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_SET_TYPE__DOCUMENT_SUBSTITUTION = 0;

	/**
	 * The feature id for the '<em><b>Attribute Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_SET_TYPE__ATTRIBUTE_SUBSTITUTION = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_SET_TYPE__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Apply To Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_SET_TYPE__APPLY_TO_SCOPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_SET_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Name Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_SET_TYPE__NAME_ID = 5;

	/**
	 * The number of structural features of the '<em>Substitution Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_SET_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Substitution Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_SET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.SuccessTypeImpl <em>Success Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.SuccessTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getSuccessType()
	 * @generated
	 */
	int SUCCESS_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_TYPE__CONDITION_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Condition Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_TYPE__CONDITION_GUARD = 2;

	/**
	 * The feature id for the '<em><b>From Business State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_TYPE__FROM_BUSINESS_STATE = 3;

	/**
	 * The feature id for the '<em><b>From Business State ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_TYPE__FROM_BUSINESS_STATE_ID_REF = 4;

	/**
	 * The number of structural features of the '<em>Success Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Success Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.impl.TransitionTypeImpl
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__CONDITION_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Condition Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__CONDITION_GUARD = 2;

	/**
	 * The feature id for the '<em><b>From Business State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__FROM_BUSINESS_STATE = 3;

	/**
	 * The feature id for the '<em><b>From Business State ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__FROM_BUSINESS_STATE_ID_REF = 4;

	/**
	 * The feature id for the '<em><b>On Initiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__ON_INITIATION = 5;

	/**
	 * The feature id for the '<em><b>To Business State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TO_BUSINESS_STATE = 6;

	/**
	 * The feature id for the '<em><b>To Business State ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TO_BUSINESS_STATE_ID_REF = 7;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.ConditionGuardType <em>Condition Guard Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.ConditionGuardType
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardType()
	 * @generated
	 */
	int CONDITION_GUARD_TYPE = 29;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.ConditionGuardType1 <em>Condition Guard Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.ConditionGuardType1
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardType1()
	 * @generated
	 */
	int CONDITION_GUARD_TYPE1 = 30;

	/**
	 * The meta object id for the '{@link org.ebxml.business.process.ConditionGuardType2 <em>Condition Guard Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.ConditionGuardType2
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardType2()
	 * @generated
	 */
	int CONDITION_GUARD_TYPE2 = 31;

	/**
	 * The meta object id for the '<em>Condition Guard Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.ConditionGuardType
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardTypeObject()
	 * @generated
	 */
	int CONDITION_GUARD_TYPE_OBJECT = 32;

	/**
	 * The meta object id for the '<em>Condition Guard Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.ConditionGuardType1
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardTypeObject1()
	 * @generated
	 */
	int CONDITION_GUARD_TYPE_OBJECT1 = 33;

	/**
	 * The meta object id for the '<em>Condition Guard Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.business.process.ConditionGuardType2
	 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardTypeObject2()
	 * @generated
	 */
	int CONDITION_GUARD_TYPE_OBJECT2 = 34;


	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.AttachmentType <em>Attachment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Type</em>'.
	 * @see org.ebxml.business.process.AttachmentType
	 * @generated
	 */
	EClass getAttachmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.AttachmentType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.AttachmentType#getDocumentation()
	 * @see #getAttachmentType()
	 * @generated
	 */
	EReference getAttachmentType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttachmentType#getBusinessDocument <em>Business Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Document</em>'.
	 * @see org.ebxml.business.process.AttachmentType#getBusinessDocument()
	 * @see #getAttachmentType()
	 * @generated
	 */
	EAttribute getAttachmentType_BusinessDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttachmentType#getBusinessDocumentIDRef <em>Business Document ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Document ID Ref</em>'.
	 * @see org.ebxml.business.process.AttachmentType#getBusinessDocumentIDRef()
	 * @see #getAttachmentType()
	 * @generated
	 */
	EAttribute getAttachmentType_BusinessDocumentIDRef();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttachmentType#isIsAuthenticated <em>Is Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Authenticated</em>'.
	 * @see org.ebxml.business.process.AttachmentType#isIsAuthenticated()
	 * @see #getAttachmentType()
	 * @generated
	 */
	EAttribute getAttachmentType_IsAuthenticated();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttachmentType#isIsConfidential <em>Is Confidential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Confidential</em>'.
	 * @see org.ebxml.business.process.AttachmentType#isIsConfidential()
	 * @see #getAttachmentType()
	 * @generated
	 */
	EAttribute getAttachmentType_IsConfidential();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttachmentType#isIsTamperProof <em>Is Tamper Proof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tamper Proof</em>'.
	 * @see org.ebxml.business.process.AttachmentType#isIsTamperProof()
	 * @see #getAttachmentType()
	 * @generated
	 */
	EAttribute getAttachmentType_IsTamperProof();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttachmentType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.ebxml.business.process.AttachmentType#getMimeType()
	 * @see #getAttachmentType()
	 * @generated
	 */
	EAttribute getAttachmentType_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttachmentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.AttachmentType#getName()
	 * @see #getAttachmentType()
	 * @generated
	 */
	EAttribute getAttachmentType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttachmentType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.AttachmentType#getNameID()
	 * @see #getAttachmentType()
	 * @generated
	 */
	EAttribute getAttachmentType_NameID();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttachmentType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.ebxml.business.process.AttachmentType#getSpecification()
	 * @see #getAttachmentType()
	 * @generated
	 */
	EAttribute getAttachmentType_Specification();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttachmentType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ebxml.business.process.AttachmentType#getVersion()
	 * @see #getAttachmentType()
	 * @generated
	 */
	EAttribute getAttachmentType_Version();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.AttributeSubstitutionType <em>Attribute Substitution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Substitution Type</em>'.
	 * @see org.ebxml.business.process.AttributeSubstitutionType
	 * @generated
	 */
	EClass getAttributeSubstitutionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.AttributeSubstitutionType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.AttributeSubstitutionType#getDocumentation()
	 * @see #getAttributeSubstitutionType()
	 * @generated
	 */
	EReference getAttributeSubstitutionType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttributeSubstitutionType#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.ebxml.business.process.AttributeSubstitutionType#getAttributeName()
	 * @see #getAttributeSubstitutionType()
	 * @generated
	 */
	EAttribute getAttributeSubstitutionType_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.AttributeSubstitutionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ebxml.business.process.AttributeSubstitutionType#getValue()
	 * @see #getAttributeSubstitutionType()
	 * @generated
	 */
	EAttribute getAttributeSubstitutionType_Value();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.BinaryCollaborationType <em>Binary Collaboration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Collaboration Type</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType
	 * @generated
	 */
	EClass getBinaryCollaborationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BinaryCollaborationType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getDocumentation()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.BinaryCollaborationType#getInitiatingRole <em>Initiating Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initiating Role</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getInitiatingRole()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_InitiatingRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.BinaryCollaborationType#getRespondingRole <em>Responding Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responding Role</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getRespondingRole()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_RespondingRole();

	/**
	 * Returns the meta object for the attribute list '{@link org.ebxml.business.process.BinaryCollaborationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getGroup()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EAttribute getBinaryCollaborationType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BinaryCollaborationType#getDocumentation1 <em>Documentation1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation1</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getDocumentation1()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_Documentation1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BinaryCollaborationType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getStart()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BinaryCollaborationType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getTransition()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BinaryCollaborationType#getSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Success</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getSuccess()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_Success();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BinaryCollaborationType#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getFailure()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_Failure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BinaryCollaborationType#getBusinessTransactionActivity <em>Business Transaction Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Transaction Activity</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getBusinessTransactionActivity()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_BusinessTransactionActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BinaryCollaborationType#getCollaborationActivity <em>Collaboration Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collaboration Activity</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getCollaborationActivity()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_CollaborationActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BinaryCollaborationType#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fork</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getFork()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_Fork();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BinaryCollaborationType#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getJoin()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EReference getBinaryCollaborationType_Join();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BinaryCollaborationType#getBeginsWhen <em>Begins When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begins When</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getBeginsWhen()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EAttribute getBinaryCollaborationType_BeginsWhen();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BinaryCollaborationType#getEndsWhen <em>Ends When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ends When</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getEndsWhen()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EAttribute getBinaryCollaborationType_EndsWhen();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BinaryCollaborationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getName()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EAttribute getBinaryCollaborationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BinaryCollaborationType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getNameID()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EAttribute getBinaryCollaborationType_NameID();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BinaryCollaborationType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getPattern()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EAttribute getBinaryCollaborationType_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BinaryCollaborationType#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Condition</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getPostCondition()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EAttribute getBinaryCollaborationType_PostCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BinaryCollaborationType#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Condition</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getPreCondition()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EAttribute getBinaryCollaborationType_PreCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BinaryCollaborationType#getTimeToPerform <em>Time To Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Perform</em>'.
	 * @see org.ebxml.business.process.BinaryCollaborationType#getTimeToPerform()
	 * @see #getBinaryCollaborationType()
	 * @generated
	 */
	EAttribute getBinaryCollaborationType_TimeToPerform();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.BusinessDocumentType <em>Business Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Document Type</em>'.
	 * @see org.ebxml.business.process.BusinessDocumentType
	 * @generated
	 */
	EClass getBusinessDocumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BusinessDocumentType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.BusinessDocumentType#getDocumentation()
	 * @see #getBusinessDocumentType()
	 * @generated
	 */
	EReference getBusinessDocumentType_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.BusinessDocumentType#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expression</em>'.
	 * @see org.ebxml.business.process.BusinessDocumentType#getConditionExpression()
	 * @see #getBusinessDocumentType()
	 * @generated
	 */
	EReference getBusinessDocumentType_ConditionExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessDocumentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.BusinessDocumentType#getName()
	 * @see #getBusinessDocumentType()
	 * @generated
	 */
	EAttribute getBusinessDocumentType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessDocumentType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.BusinessDocumentType#getNameID()
	 * @see #getBusinessDocumentType()
	 * @generated
	 */
	EAttribute getBusinessDocumentType_NameID();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessDocumentType#getSpecificationElement <em>Specification Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification Element</em>'.
	 * @see org.ebxml.business.process.BusinessDocumentType#getSpecificationElement()
	 * @see #getBusinessDocumentType()
	 * @generated
	 */
	EAttribute getBusinessDocumentType_SpecificationElement();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessDocumentType#getSpecificationLocation <em>Specification Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification Location</em>'.
	 * @see org.ebxml.business.process.BusinessDocumentType#getSpecificationLocation()
	 * @see #getBusinessDocumentType()
	 * @generated
	 */
	EAttribute getBusinessDocumentType_SpecificationLocation();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.BusinessPartnerRoleType <em>Business Partner Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Partner Role Type</em>'.
	 * @see org.ebxml.business.process.BusinessPartnerRoleType
	 * @generated
	 */
	EClass getBusinessPartnerRoleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BusinessPartnerRoleType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.BusinessPartnerRoleType#getDocumentation()
	 * @see #getBusinessPartnerRoleType()
	 * @generated
	 */
	EReference getBusinessPartnerRoleType_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BusinessPartnerRoleType#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performs</em>'.
	 * @see org.ebxml.business.process.BusinessPartnerRoleType#getPerforms()
	 * @see #getBusinessPartnerRoleType()
	 * @generated
	 */
	EReference getBusinessPartnerRoleType_Performs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BusinessPartnerRoleType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see org.ebxml.business.process.BusinessPartnerRoleType#getTransition()
	 * @see #getBusinessPartnerRoleType()
	 * @generated
	 */
	EReference getBusinessPartnerRoleType_Transition();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessPartnerRoleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.BusinessPartnerRoleType#getName()
	 * @see #getBusinessPartnerRoleType()
	 * @generated
	 */
	EAttribute getBusinessPartnerRoleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessPartnerRoleType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.BusinessPartnerRoleType#getNameID()
	 * @see #getBusinessPartnerRoleType()
	 * @generated
	 */
	EAttribute getBusinessPartnerRoleType_NameID();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.BusinessTransactionActivityType <em>Business Transaction Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Transaction Activity Type</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType
	 * @generated
	 */
	EClass getBusinessTransactionActivityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BusinessTransactionActivityType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#getDocumentation()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EReference getBusinessTransactionActivityType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionActivityType#getBusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Transaction</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#getBusinessTransaction()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EAttribute getBusinessTransactionActivityType_BusinessTransaction();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionActivityType#getBusinessTransactionIDRef <em>Business Transaction ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Transaction ID Ref</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#getBusinessTransactionIDRef()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EAttribute getBusinessTransactionActivityType_BusinessTransactionIDRef();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionActivityType#getFromAuthorizedRole <em>From Authorized Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Authorized Role</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#getFromAuthorizedRole()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EAttribute getBusinessTransactionActivityType_FromAuthorizedRole();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionActivityType#getFromAuthorizedRoleIDRef <em>From Authorized Role ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Authorized Role ID Ref</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#getFromAuthorizedRoleIDRef()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EAttribute getBusinessTransactionActivityType_FromAuthorizedRoleIDRef();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionActivityType#isIsConcurrent <em>Is Concurrent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Concurrent</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#isIsConcurrent()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EAttribute getBusinessTransactionActivityType_IsConcurrent();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionActivityType#isIsLegallyBinding <em>Is Legally Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Legally Binding</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#isIsLegallyBinding()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EAttribute getBusinessTransactionActivityType_IsLegallyBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionActivityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#getName()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EAttribute getBusinessTransactionActivityType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionActivityType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#getNameID()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EAttribute getBusinessTransactionActivityType_NameID();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionActivityType#getTimeToPerform <em>Time To Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Perform</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#getTimeToPerform()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EAttribute getBusinessTransactionActivityType_TimeToPerform();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionActivityType#getToAuthorizedRole <em>To Authorized Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Authorized Role</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#getToAuthorizedRole()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EAttribute getBusinessTransactionActivityType_ToAuthorizedRole();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionActivityType#getToAuthorizedRoleIDRef <em>To Authorized Role ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Authorized Role ID Ref</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionActivityType#getToAuthorizedRoleIDRef()
	 * @see #getBusinessTransactionActivityType()
	 * @generated
	 */
	EAttribute getBusinessTransactionActivityType_ToAuthorizedRoleIDRef();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.BusinessTransactionType <em>Business Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Transaction Type</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType
	 * @generated
	 */
	EClass getBusinessTransactionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.BusinessTransactionType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType#getDocumentation()
	 * @see #getBusinessTransactionType()
	 * @generated
	 */
	EReference getBusinessTransactionType_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.BusinessTransactionType#getRequestingBusinessActivity <em>Requesting Business Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requesting Business Activity</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType#getRequestingBusinessActivity()
	 * @see #getBusinessTransactionType()
	 * @generated
	 */
	EReference getBusinessTransactionType_RequestingBusinessActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.BusinessTransactionType#getRespondingBusinessActivity <em>Responding Business Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responding Business Activity</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType#getRespondingBusinessActivity()
	 * @see #getBusinessTransactionType()
	 * @generated
	 */
	EReference getBusinessTransactionType_RespondingBusinessActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionType#getBeginsWhen <em>Begins When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begins When</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType#getBeginsWhen()
	 * @see #getBusinessTransactionType()
	 * @generated
	 */
	EAttribute getBusinessTransactionType_BeginsWhen();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionType#getEndsWhen <em>Ends When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ends When</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType#getEndsWhen()
	 * @see #getBusinessTransactionType()
	 * @generated
	 */
	EAttribute getBusinessTransactionType_EndsWhen();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionType#isIsGuaranteedDeliveryRequired <em>Is Guaranteed Delivery Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Guaranteed Delivery Required</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType#isIsGuaranteedDeliveryRequired()
	 * @see #getBusinessTransactionType()
	 * @generated
	 */
	EAttribute getBusinessTransactionType_IsGuaranteedDeliveryRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType#getName()
	 * @see #getBusinessTransactionType()
	 * @generated
	 */
	EAttribute getBusinessTransactionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType#getNameID()
	 * @see #getBusinessTransactionType()
	 * @generated
	 */
	EAttribute getBusinessTransactionType_NameID();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType#getPattern()
	 * @see #getBusinessTransactionType()
	 * @generated
	 */
	EAttribute getBusinessTransactionType_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionType#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Condition</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType#getPostCondition()
	 * @see #getBusinessTransactionType()
	 * @generated
	 */
	EAttribute getBusinessTransactionType_PostCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.BusinessTransactionType#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Condition</em>'.
	 * @see org.ebxml.business.process.BusinessTransactionType#getPreCondition()
	 * @see #getBusinessTransactionType()
	 * @generated
	 */
	EAttribute getBusinessTransactionType_PreCondition();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.CollaborationActivityType <em>Collaboration Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration Activity Type</em>'.
	 * @see org.ebxml.business.process.CollaborationActivityType
	 * @generated
	 */
	EClass getCollaborationActivityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.CollaborationActivityType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.CollaborationActivityType#getDocumentation()
	 * @see #getCollaborationActivityType()
	 * @generated
	 */
	EReference getCollaborationActivityType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.CollaborationActivityType#getBinaryCollaboration <em>Binary Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Collaboration</em>'.
	 * @see org.ebxml.business.process.CollaborationActivityType#getBinaryCollaboration()
	 * @see #getCollaborationActivityType()
	 * @generated
	 */
	EAttribute getCollaborationActivityType_BinaryCollaboration();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.CollaborationActivityType#getBinaryCollaborationIDRef <em>Binary Collaboration ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Collaboration ID Ref</em>'.
	 * @see org.ebxml.business.process.CollaborationActivityType#getBinaryCollaborationIDRef()
	 * @see #getCollaborationActivityType()
	 * @generated
	 */
	EAttribute getCollaborationActivityType_BinaryCollaborationIDRef();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.CollaborationActivityType#getFromAuthorizedRole <em>From Authorized Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Authorized Role</em>'.
	 * @see org.ebxml.business.process.CollaborationActivityType#getFromAuthorizedRole()
	 * @see #getCollaborationActivityType()
	 * @generated
	 */
	EAttribute getCollaborationActivityType_FromAuthorizedRole();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.CollaborationActivityType#getFromAuthorizedRoleIDRef <em>From Authorized Role ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Authorized Role ID Ref</em>'.
	 * @see org.ebxml.business.process.CollaborationActivityType#getFromAuthorizedRoleIDRef()
	 * @see #getCollaborationActivityType()
	 * @generated
	 */
	EAttribute getCollaborationActivityType_FromAuthorizedRoleIDRef();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.CollaborationActivityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.CollaborationActivityType#getName()
	 * @see #getCollaborationActivityType()
	 * @generated
	 */
	EAttribute getCollaborationActivityType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.CollaborationActivityType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.CollaborationActivityType#getNameID()
	 * @see #getCollaborationActivityType()
	 * @generated
	 */
	EAttribute getCollaborationActivityType_NameID();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.CollaborationActivityType#getToAuthorizedRole <em>To Authorized Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Authorized Role</em>'.
	 * @see org.ebxml.business.process.CollaborationActivityType#getToAuthorizedRole()
	 * @see #getCollaborationActivityType()
	 * @generated
	 */
	EAttribute getCollaborationActivityType_ToAuthorizedRole();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.CollaborationActivityType#getToAuthorizedRoleIDRef <em>To Authorized Role ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Authorized Role ID Ref</em>'.
	 * @see org.ebxml.business.process.CollaborationActivityType#getToAuthorizedRoleIDRef()
	 * @see #getCollaborationActivityType()
	 * @generated
	 */
	EAttribute getCollaborationActivityType_ToAuthorizedRoleIDRef();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.ConditionExpressionType <em>Condition Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Expression Type</em>'.
	 * @see org.ebxml.business.process.ConditionExpressionType
	 * @generated
	 */
	EClass getConditionExpressionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.ConditionExpressionType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.ConditionExpressionType#getDocumentation()
	 * @see #getConditionExpressionType()
	 * @generated
	 */
	EReference getConditionExpressionType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.ConditionExpressionType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.ebxml.business.process.ConditionExpressionType#getExpression()
	 * @see #getConditionExpressionType()
	 * @generated
	 */
	EAttribute getConditionExpressionType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.ConditionExpressionType#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.ebxml.business.process.ConditionExpressionType#getExpressionLanguage()
	 * @see #getConditionExpressionType()
	 * @generated
	 */
	EAttribute getConditionExpressionType_ExpressionLanguage();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.DocumentationType <em>Documentation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation Type</em>'.
	 * @see org.ebxml.business.process.DocumentationType
	 * @generated
	 */
	EClass getDocumentationType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ebxml.business.process.DocumentationType#getValue()
	 * @see #getDocumentationType()
	 * @generated
	 */
	EAttribute getDocumentationType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentationType#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.ebxml.business.process.DocumentationType#getUri()
	 * @see #getDocumentationType()
	 * @generated
	 */
	EAttribute getDocumentationType_Uri();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.DocumentEnvelopeType <em>Document Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Envelope Type</em>'.
	 * @see org.ebxml.business.process.DocumentEnvelopeType
	 * @generated
	 */
	EClass getDocumentEnvelopeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.DocumentEnvelopeType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.DocumentEnvelopeType#getDocumentation()
	 * @see #getDocumentEnvelopeType()
	 * @generated
	 */
	EReference getDocumentEnvelopeType_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.DocumentEnvelopeType#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachment</em>'.
	 * @see org.ebxml.business.process.DocumentEnvelopeType#getAttachment()
	 * @see #getDocumentEnvelopeType()
	 * @generated
	 */
	EReference getDocumentEnvelopeType_Attachment();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentEnvelopeType#getBusinessDocument <em>Business Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Document</em>'.
	 * @see org.ebxml.business.process.DocumentEnvelopeType#getBusinessDocument()
	 * @see #getDocumentEnvelopeType()
	 * @generated
	 */
	EAttribute getDocumentEnvelopeType_BusinessDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentEnvelopeType#getBusinessDocumentIDRef <em>Business Document ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Document ID Ref</em>'.
	 * @see org.ebxml.business.process.DocumentEnvelopeType#getBusinessDocumentIDRef()
	 * @see #getDocumentEnvelopeType()
	 * @generated
	 */
	EAttribute getDocumentEnvelopeType_BusinessDocumentIDRef();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsAuthenticated <em>Is Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Authenticated</em>'.
	 * @see org.ebxml.business.process.DocumentEnvelopeType#isIsAuthenticated()
	 * @see #getDocumentEnvelopeType()
	 * @generated
	 */
	EAttribute getDocumentEnvelopeType_IsAuthenticated();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsConfidential <em>Is Confidential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Confidential</em>'.
	 * @see org.ebxml.business.process.DocumentEnvelopeType#isIsConfidential()
	 * @see #getDocumentEnvelopeType()
	 * @generated
	 */
	EAttribute getDocumentEnvelopeType_IsConfidential();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsPositiveResponse <em>Is Positive Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Positive Response</em>'.
	 * @see org.ebxml.business.process.DocumentEnvelopeType#isIsPositiveResponse()
	 * @see #getDocumentEnvelopeType()
	 * @generated
	 */
	EAttribute getDocumentEnvelopeType_IsPositiveResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentEnvelopeType#isIsTamperProof <em>Is Tamper Proof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tamper Proof</em>'.
	 * @see org.ebxml.business.process.DocumentEnvelopeType#isIsTamperProof()
	 * @see #getDocumentEnvelopeType()
	 * @generated
	 */
	EAttribute getDocumentEnvelopeType_IsTamperProof();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.ebxml.business.process.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.ebxml.business.process.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.ebxml.business.process.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.ebxml.business.process.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attachment</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getAttachment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Attachment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getAttributeSubstitution <em>Attribute Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Substitution</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getAttributeSubstitution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AttributeSubstitution();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getBinaryCollaboration <em>Binary Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary Collaboration</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getBinaryCollaboration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BinaryCollaboration();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getBusinessDocument <em>Business Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Document</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getBusinessDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BusinessDocument();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getBusinessPartnerRole <em>Business Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Partner Role</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getBusinessPartnerRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BusinessPartnerRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getBusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Transaction</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getBusinessTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BusinessTransaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getBusinessTransactionActivity <em>Business Transaction Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Transaction Activity</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getBusinessTransactionActivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BusinessTransactionActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getCollaborationActivity <em>Collaboration Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collaboration Activity</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getCollaborationActivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CollaborationActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expression</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getConditionExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConditionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getDocumentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getDocumentEnvelope <em>Document Envelope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Envelope</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getDocumentEnvelope()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DocumentEnvelope();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getDocumentSubstitution <em>Document Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Substitution</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getDocumentSubstitution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DocumentSubstitution();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failure</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getFailure()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Failure();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fork</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getFork()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Fork();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getInclude()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Include();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getInitiatingRole <em>Initiating Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initiating Role</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getInitiatingRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InitiatingRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getJoin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Join();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getMultiPartyCollaboration <em>Multi Party Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Party Collaboration</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getMultiPartyCollaboration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MultiPartyCollaboration();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getPackage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Package();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performs</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getPerforms()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Performs();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getProcessSpecification <em>Process Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Specification</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getProcessSpecification()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProcessSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getRequestingBusinessActivity <em>Requesting Business Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requesting Business Activity</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getRequestingBusinessActivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RequestingBusinessActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getRespondingBusinessActivity <em>Responding Business Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responding Business Activity</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getRespondingBusinessActivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RespondingBusinessActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getRespondingRole <em>Responding Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responding Role</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getRespondingRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RespondingRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getStart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getSubstitutionSet <em>Substitution Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Substitution Set</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getSubstitutionSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubstitutionSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Success</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getSuccess()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Success();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.DocumentRoot#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see org.ebxml.business.process.DocumentRoot#getTransition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transition();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.DocumentSubstitutionType <em>Document Substitution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Substitution Type</em>'.
	 * @see org.ebxml.business.process.DocumentSubstitutionType
	 * @generated
	 */
	EClass getDocumentSubstitutionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.DocumentSubstitutionType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.DocumentSubstitutionType#getDocumentation()
	 * @see #getDocumentSubstitutionType()
	 * @generated
	 */
	EReference getDocumentSubstitutionType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentSubstitutionType#getOriginalBusinessDocument <em>Original Business Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Business Document</em>'.
	 * @see org.ebxml.business.process.DocumentSubstitutionType#getOriginalBusinessDocument()
	 * @see #getDocumentSubstitutionType()
	 * @generated
	 */
	EAttribute getDocumentSubstitutionType_OriginalBusinessDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentSubstitutionType#getOriginalBusinessDocumentID <em>Original Business Document ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Business Document ID</em>'.
	 * @see org.ebxml.business.process.DocumentSubstitutionType#getOriginalBusinessDocumentID()
	 * @see #getDocumentSubstitutionType()
	 * @generated
	 */
	EAttribute getDocumentSubstitutionType_OriginalBusinessDocumentID();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentSubstitutionType#getSubstituteBusinessDocument <em>Substitute Business Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substitute Business Document</em>'.
	 * @see org.ebxml.business.process.DocumentSubstitutionType#getSubstituteBusinessDocument()
	 * @see #getDocumentSubstitutionType()
	 * @generated
	 */
	EAttribute getDocumentSubstitutionType_SubstituteBusinessDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.DocumentSubstitutionType#getSubstituteBusinessDocumentId <em>Substitute Business Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substitute Business Document Id</em>'.
	 * @see org.ebxml.business.process.DocumentSubstitutionType#getSubstituteBusinessDocumentId()
	 * @see #getDocumentSubstitutionType()
	 * @generated
	 */
	EAttribute getDocumentSubstitutionType_SubstituteBusinessDocumentId();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.FailureType <em>Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Type</em>'.
	 * @see org.ebxml.business.process.FailureType
	 * @generated
	 */
	EClass getFailureType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.FailureType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.FailureType#getDocumentation()
	 * @see #getFailureType()
	 * @generated
	 */
	EReference getFailureType_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.FailureType#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expression</em>'.
	 * @see org.ebxml.business.process.FailureType#getConditionExpression()
	 * @see #getFailureType()
	 * @generated
	 */
	EReference getFailureType_ConditionExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.FailureType#getConditionGuard <em>Condition Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Guard</em>'.
	 * @see org.ebxml.business.process.FailureType#getConditionGuard()
	 * @see #getFailureType()
	 * @generated
	 */
	EAttribute getFailureType_ConditionGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.FailureType#getFromBusinessState <em>From Business State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Business State</em>'.
	 * @see org.ebxml.business.process.FailureType#getFromBusinessState()
	 * @see #getFailureType()
	 * @generated
	 */
	EAttribute getFailureType_FromBusinessState();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.FailureType#getFromBusinessStateIDRef <em>From Business State ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Business State ID Ref</em>'.
	 * @see org.ebxml.business.process.FailureType#getFromBusinessStateIDRef()
	 * @see #getFailureType()
	 * @generated
	 */
	EAttribute getFailureType_FromBusinessStateIDRef();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.ForkType <em>Fork Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Type</em>'.
	 * @see org.ebxml.business.process.ForkType
	 * @generated
	 */
	EClass getForkType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.ForkType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.ForkType#getDocumentation()
	 * @see #getForkType()
	 * @generated
	 */
	EReference getForkType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.ForkType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.ForkType#getName()
	 * @see #getForkType()
	 * @generated
	 */
	EAttribute getForkType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.ForkType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.ForkType#getNameID()
	 * @see #getForkType()
	 * @generated
	 */
	EAttribute getForkType_NameID();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Type</em>'.
	 * @see org.ebxml.business.process.IncludeType
	 * @generated
	 */
	EClass getIncludeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.IncludeType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.IncludeType#getDocumentation()
	 * @see #getIncludeType()
	 * @generated
	 */
	EReference getIncludeType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.IncludeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.IncludeType#getName()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.IncludeType#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.ebxml.business.process.IncludeType#getUri()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.IncludeType#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.ebxml.business.process.IncludeType#getUuid()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.IncludeType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ebxml.business.process.IncludeType#getVersion()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Version();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.InitiatingRoleType <em>Initiating Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initiating Role Type</em>'.
	 * @see org.ebxml.business.process.InitiatingRoleType
	 * @generated
	 */
	EClass getInitiatingRoleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.InitiatingRoleType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.InitiatingRoleType#getDocumentation()
	 * @see #getInitiatingRoleType()
	 * @generated
	 */
	EReference getInitiatingRoleType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.InitiatingRoleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.InitiatingRoleType#getName()
	 * @see #getInitiatingRoleType()
	 * @generated
	 */
	EAttribute getInitiatingRoleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.InitiatingRoleType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.InitiatingRoleType#getNameID()
	 * @see #getInitiatingRoleType()
	 * @generated
	 */
	EAttribute getInitiatingRoleType_NameID();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.JoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Type</em>'.
	 * @see org.ebxml.business.process.JoinType
	 * @generated
	 */
	EClass getJoinType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.JoinType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.JoinType#getDocumentation()
	 * @see #getJoinType()
	 * @generated
	 */
	EReference getJoinType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.JoinType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.JoinType#getName()
	 * @see #getJoinType()
	 * @generated
	 */
	EAttribute getJoinType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.JoinType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.JoinType#getNameID()
	 * @see #getJoinType()
	 * @generated
	 */
	EAttribute getJoinType_NameID();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.JoinType#isWaitForAll <em>Wait For All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait For All</em>'.
	 * @see org.ebxml.business.process.JoinType#isWaitForAll()
	 * @see #getJoinType()
	 * @generated
	 */
	EAttribute getJoinType_WaitForAll();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.MultiPartyCollaborationType <em>Multi Party Collaboration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Party Collaboration Type</em>'.
	 * @see org.ebxml.business.process.MultiPartyCollaborationType
	 * @generated
	 */
	EClass getMultiPartyCollaborationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.MultiPartyCollaborationType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.MultiPartyCollaborationType#getDocumentation()
	 * @see #getMultiPartyCollaborationType()
	 * @generated
	 */
	EReference getMultiPartyCollaborationType_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.MultiPartyCollaborationType#getBusinessPartnerRole <em>Business Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Partner Role</em>'.
	 * @see org.ebxml.business.process.MultiPartyCollaborationType#getBusinessPartnerRole()
	 * @see #getMultiPartyCollaborationType()
	 * @generated
	 */
	EReference getMultiPartyCollaborationType_BusinessPartnerRole();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.MultiPartyCollaborationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.MultiPartyCollaborationType#getName()
	 * @see #getMultiPartyCollaborationType()
	 * @generated
	 */
	EAttribute getMultiPartyCollaborationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.MultiPartyCollaborationType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.MultiPartyCollaborationType#getNameID()
	 * @see #getMultiPartyCollaborationType()
	 * @generated
	 */
	EAttribute getMultiPartyCollaborationType_NameID();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Type</em>'.
	 * @see org.ebxml.business.process.PackageType
	 * @generated
	 */
	EClass getPackageType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.PackageType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.PackageType#getDocumentation()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_Documentation();

	/**
	 * Returns the meta object for the attribute list '{@link org.ebxml.business.process.PackageType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.ebxml.business.process.PackageType#getGroup()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.PackageType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see org.ebxml.business.process.PackageType#getPackage()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.PackageType#getBinaryCollaboration <em>Binary Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary Collaboration</em>'.
	 * @see org.ebxml.business.process.PackageType#getBinaryCollaboration()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_BinaryCollaboration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.PackageType#getBusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Transaction</em>'.
	 * @see org.ebxml.business.process.PackageType#getBusinessTransaction()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_BusinessTransaction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.PackageType#getMultiPartyCollaboration <em>Multi Party Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Party Collaboration</em>'.
	 * @see org.ebxml.business.process.PackageType#getMultiPartyCollaboration()
	 * @see #getPackageType()
	 * @generated
	 */
	EReference getPackageType_MultiPartyCollaboration();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.PackageType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.PackageType#getName()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.PackageType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.PackageType#getNameID()
	 * @see #getPackageType()
	 * @generated
	 */
	EAttribute getPackageType_NameID();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.PerformsType <em>Performs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performs Type</em>'.
	 * @see org.ebxml.business.process.PerformsType
	 * @generated
	 */
	EClass getPerformsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.PerformsType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.PerformsType#getDocumentation()
	 * @see #getPerformsType()
	 * @generated
	 */
	EReference getPerformsType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.PerformsType#getInitiatingRole <em>Initiating Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiating Role</em>'.
	 * @see org.ebxml.business.process.PerformsType#getInitiatingRole()
	 * @see #getPerformsType()
	 * @generated
	 */
	EAttribute getPerformsType_InitiatingRole();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.PerformsType#getInitiatingRoleIDRef <em>Initiating Role ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiating Role ID Ref</em>'.
	 * @see org.ebxml.business.process.PerformsType#getInitiatingRoleIDRef()
	 * @see #getPerformsType()
	 * @generated
	 */
	EAttribute getPerformsType_InitiatingRoleIDRef();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.PerformsType#getRespondingRole <em>Responding Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responding Role</em>'.
	 * @see org.ebxml.business.process.PerformsType#getRespondingRole()
	 * @see #getPerformsType()
	 * @generated
	 */
	EAttribute getPerformsType_RespondingRole();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.PerformsType#getRespondingRoleIDRef <em>Responding Role ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responding Role ID Ref</em>'.
	 * @see org.ebxml.business.process.PerformsType#getRespondingRoleIDRef()
	 * @see #getPerformsType()
	 * @generated
	 */
	EAttribute getPerformsType_RespondingRoleIDRef();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.ProcessSpecificationType <em>Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Type</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType
	 * @generated
	 */
	EClass getProcessSpecificationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.ProcessSpecificationType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getDocumentation()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EReference getProcessSpecificationType_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.ProcessSpecificationType#getSubstitutionSet <em>Substitution Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substitution Set</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getSubstitutionSet()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EReference getProcessSpecificationType_SubstitutionSet();

	/**
	 * Returns the meta object for the attribute list '{@link org.ebxml.business.process.ProcessSpecificationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getGroup()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EAttribute getProcessSpecificationType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.ProcessSpecificationType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getInclude()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EReference getProcessSpecificationType_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.ProcessSpecificationType#getBusinessDocument <em>Business Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Document</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getBusinessDocument()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EReference getProcessSpecificationType_BusinessDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.ProcessSpecificationType#getProcessSpecification <em>Process Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Specification</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getProcessSpecification()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EReference getProcessSpecificationType_ProcessSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.ProcessSpecificationType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getPackage()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EReference getProcessSpecificationType_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.ProcessSpecificationType#getBinaryCollaboration <em>Binary Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary Collaboration</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getBinaryCollaboration()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EReference getProcessSpecificationType_BinaryCollaboration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.ProcessSpecificationType#getBusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Transaction</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getBusinessTransaction()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EReference getProcessSpecificationType_BusinessTransaction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.ProcessSpecificationType#getMultiPartyCollaboration <em>Multi Party Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Party Collaboration</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getMultiPartyCollaboration()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EReference getProcessSpecificationType_MultiPartyCollaboration();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.ProcessSpecificationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getName()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EAttribute getProcessSpecificationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.ProcessSpecificationType#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getUuid()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EAttribute getProcessSpecificationType_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.ProcessSpecificationType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ebxml.business.process.ProcessSpecificationType#getVersion()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EAttribute getProcessSpecificationType_Version();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.RequestingBusinessActivityType <em>Requesting Business Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requesting Business Activity Type</em>'.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType
	 * @generated
	 */
	EClass getRequestingBusinessActivityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.RequestingBusinessActivityType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType#getDocumentation()
	 * @see #getRequestingBusinessActivityType()
	 * @generated
	 */
	EReference getRequestingBusinessActivityType_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.RequestingBusinessActivityType#getDocumentEnvelope <em>Document Envelope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Envelope</em>'.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType#getDocumentEnvelope()
	 * @see #getRequestingBusinessActivityType()
	 * @generated
	 */
	EReference getRequestingBusinessActivityType_DocumentEnvelope();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsAuthorizationRequired <em>Is Authorization Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Authorization Required</em>'.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType#isIsAuthorizationRequired()
	 * @see #getRequestingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRequestingBusinessActivityType_IsAuthorizationRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsIntelligibleCheckRequired <em>Is Intelligible Check Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Intelligible Check Required</em>'.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType#isIsIntelligibleCheckRequired()
	 * @see #getRequestingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRequestingBusinessActivityType_IsIntelligibleCheckRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationReceiptRequired <em>Is Non Repudiation Receipt Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Non Repudiation Receipt Required</em>'.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationReceiptRequired()
	 * @see #getRequestingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRequestingBusinessActivityType_IsNonRepudiationReceiptRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationRequired <em>Is Non Repudiation Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Non Repudiation Required</em>'.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType#isIsNonRepudiationRequired()
	 * @see #getRequestingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRequestingBusinessActivityType_IsNonRepudiationRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RequestingBusinessActivityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType#getName()
	 * @see #getRequestingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRequestingBusinessActivityType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RequestingBusinessActivityType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType#getNameID()
	 * @see #getRequestingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRequestingBusinessActivityType_NameID();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RequestingBusinessActivityType#getTimeToAcknowledgeAcceptance <em>Time To Acknowledge Acceptance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Acknowledge Acceptance</em>'.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType#getTimeToAcknowledgeAcceptance()
	 * @see #getRequestingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRequestingBusinessActivityType_TimeToAcknowledgeAcceptance();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RequestingBusinessActivityType#getTimeToAcknowledgeReceipt <em>Time To Acknowledge Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Acknowledge Receipt</em>'.
	 * @see org.ebxml.business.process.RequestingBusinessActivityType#getTimeToAcknowledgeReceipt()
	 * @see #getRequestingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRequestingBusinessActivityType_TimeToAcknowledgeReceipt();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.RespondingBusinessActivityType <em>Responding Business Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responding Business Activity Type</em>'.
	 * @see org.ebxml.business.process.RespondingBusinessActivityType
	 * @generated
	 */
	EClass getRespondingBusinessActivityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.RespondingBusinessActivityType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.RespondingBusinessActivityType#getDocumentation()
	 * @see #getRespondingBusinessActivityType()
	 * @generated
	 */
	EReference getRespondingBusinessActivityType_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.RespondingBusinessActivityType#getDocumentEnvelope <em>Document Envelope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document Envelope</em>'.
	 * @see org.ebxml.business.process.RespondingBusinessActivityType#getDocumentEnvelope()
	 * @see #getRespondingBusinessActivityType()
	 * @generated
	 */
	EReference getRespondingBusinessActivityType_DocumentEnvelope();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RespondingBusinessActivityType#isIsAuthorizationRequired <em>Is Authorization Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Authorization Required</em>'.
	 * @see org.ebxml.business.process.RespondingBusinessActivityType#isIsAuthorizationRequired()
	 * @see #getRespondingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRespondingBusinessActivityType_IsAuthorizationRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RespondingBusinessActivityType#isIsIntelligibleCheckRequired <em>Is Intelligible Check Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Intelligible Check Required</em>'.
	 * @see org.ebxml.business.process.RespondingBusinessActivityType#isIsIntelligibleCheckRequired()
	 * @see #getRespondingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRespondingBusinessActivityType_IsIntelligibleCheckRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RespondingBusinessActivityType#isIsNonRepudiationReceiptRequired <em>Is Non Repudiation Receipt Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Non Repudiation Receipt Required</em>'.
	 * @see org.ebxml.business.process.RespondingBusinessActivityType#isIsNonRepudiationReceiptRequired()
	 * @see #getRespondingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRespondingBusinessActivityType_IsNonRepudiationReceiptRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RespondingBusinessActivityType#isIsNonRepudiationRequired <em>Is Non Repudiation Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Non Repudiation Required</em>'.
	 * @see org.ebxml.business.process.RespondingBusinessActivityType#isIsNonRepudiationRequired()
	 * @see #getRespondingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRespondingBusinessActivityType_IsNonRepudiationRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RespondingBusinessActivityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.RespondingBusinessActivityType#getName()
	 * @see #getRespondingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRespondingBusinessActivityType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RespondingBusinessActivityType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.RespondingBusinessActivityType#getNameID()
	 * @see #getRespondingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRespondingBusinessActivityType_NameID();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RespondingBusinessActivityType#getTimeToAcknowledgeReceipt <em>Time To Acknowledge Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Acknowledge Receipt</em>'.
	 * @see org.ebxml.business.process.RespondingBusinessActivityType#getTimeToAcknowledgeReceipt()
	 * @see #getRespondingBusinessActivityType()
	 * @generated
	 */
	EAttribute getRespondingBusinessActivityType_TimeToAcknowledgeReceipt();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.RespondingRoleType <em>Responding Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responding Role Type</em>'.
	 * @see org.ebxml.business.process.RespondingRoleType
	 * @generated
	 */
	EClass getRespondingRoleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.RespondingRoleType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.RespondingRoleType#getDocumentation()
	 * @see #getRespondingRoleType()
	 * @generated
	 */
	EReference getRespondingRoleType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RespondingRoleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.RespondingRoleType#getName()
	 * @see #getRespondingRoleType()
	 * @generated
	 */
	EAttribute getRespondingRoleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.RespondingRoleType#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see org.ebxml.business.process.RespondingRoleType#getNameID()
	 * @see #getRespondingRoleType()
	 * @generated
	 */
	EAttribute getRespondingRoleType_NameID();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.StartType <em>Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Type</em>'.
	 * @see org.ebxml.business.process.StartType
	 * @generated
	 */
	EClass getStartType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.StartType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.StartType#getDocumentation()
	 * @see #getStartType()
	 * @generated
	 */
	EReference getStartType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.StartType#getToBusinessState <em>To Business State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Business State</em>'.
	 * @see org.ebxml.business.process.StartType#getToBusinessState()
	 * @see #getStartType()
	 * @generated
	 */
	EAttribute getStartType_ToBusinessState();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.StartType#getToBusinessStateIDRef <em>To Business State ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Business State ID Ref</em>'.
	 * @see org.ebxml.business.process.StartType#getToBusinessStateIDRef()
	 * @see #getStartType()
	 * @generated
	 */
	EAttribute getStartType_ToBusinessStateIDRef();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.SubstitutionSetType <em>Substitution Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substitution Set Type</em>'.
	 * @see org.ebxml.business.process.SubstitutionSetType
	 * @generated
	 */
	EClass getSubstitutionSetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.SubstitutionSetType#getDocumentSubstitution <em>Document Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document Substitution</em>'.
	 * @see org.ebxml.business.process.SubstitutionSetType#getDocumentSubstitution()
	 * @see #getSubstitutionSetType()
	 * @generated
	 */
	EReference getSubstitutionSetType_DocumentSubstitution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.SubstitutionSetType#getAttributeSubstitution <em>Attribute Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Substitution</em>'.
	 * @see org.ebxml.business.process.SubstitutionSetType#getAttributeSubstitution()
	 * @see #getSubstitutionSetType()
	 * @generated
	 */
	EReference getSubstitutionSetType_AttributeSubstitution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.SubstitutionSetType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.SubstitutionSetType#getDocumentation()
	 * @see #getSubstitutionSetType()
	 * @generated
	 */
	EReference getSubstitutionSetType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.SubstitutionSetType#getApplyToScope <em>Apply To Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To Scope</em>'.
	 * @see org.ebxml.business.process.SubstitutionSetType#getApplyToScope()
	 * @see #getSubstitutionSetType()
	 * @generated
	 */
	EAttribute getSubstitutionSetType_ApplyToScope();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.SubstitutionSetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.business.process.SubstitutionSetType#getName()
	 * @see #getSubstitutionSetType()
	 * @generated
	 */
	EAttribute getSubstitutionSetType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.SubstitutionSetType#getNameId <em>Name Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Id</em>'.
	 * @see org.ebxml.business.process.SubstitutionSetType#getNameId()
	 * @see #getSubstitutionSetType()
	 * @generated
	 */
	EAttribute getSubstitutionSetType_NameId();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.SuccessType <em>Success Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Type</em>'.
	 * @see org.ebxml.business.process.SuccessType
	 * @generated
	 */
	EClass getSuccessType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.SuccessType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.SuccessType#getDocumentation()
	 * @see #getSuccessType()
	 * @generated
	 */
	EReference getSuccessType_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.SuccessType#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expression</em>'.
	 * @see org.ebxml.business.process.SuccessType#getConditionExpression()
	 * @see #getSuccessType()
	 * @generated
	 */
	EReference getSuccessType_ConditionExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.SuccessType#getConditionGuard <em>Condition Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Guard</em>'.
	 * @see org.ebxml.business.process.SuccessType#getConditionGuard()
	 * @see #getSuccessType()
	 * @generated
	 */
	EAttribute getSuccessType_ConditionGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.SuccessType#getFromBusinessState <em>From Business State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Business State</em>'.
	 * @see org.ebxml.business.process.SuccessType#getFromBusinessState()
	 * @see #getSuccessType()
	 * @generated
	 */
	EAttribute getSuccessType_FromBusinessState();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.SuccessType#getFromBusinessStateIDRef <em>From Business State ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Business State ID Ref</em>'.
	 * @see org.ebxml.business.process.SuccessType#getFromBusinessStateIDRef()
	 * @see #getSuccessType()
	 * @generated
	 */
	EAttribute getSuccessType_FromBusinessStateIDRef();

	/**
	 * Returns the meta object for class '{@link org.ebxml.business.process.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see org.ebxml.business.process.TransitionType
	 * @generated
	 */
	EClass getTransitionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.business.process.TransitionType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.ebxml.business.process.TransitionType#getDocumentation()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.business.process.TransitionType#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expression</em>'.
	 * @see org.ebxml.business.process.TransitionType#getConditionExpression()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_ConditionExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.TransitionType#getConditionGuard <em>Condition Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Guard</em>'.
	 * @see org.ebxml.business.process.TransitionType#getConditionGuard()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_ConditionGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.TransitionType#getFromBusinessState <em>From Business State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Business State</em>'.
	 * @see org.ebxml.business.process.TransitionType#getFromBusinessState()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_FromBusinessState();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.TransitionType#getFromBusinessStateIDRef <em>From Business State ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Business State ID Ref</em>'.
	 * @see org.ebxml.business.process.TransitionType#getFromBusinessStateIDRef()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_FromBusinessStateIDRef();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.TransitionType#isOnInitiation <em>On Initiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Initiation</em>'.
	 * @see org.ebxml.business.process.TransitionType#isOnInitiation()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_OnInitiation();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.TransitionType#getToBusinessState <em>To Business State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Business State</em>'.
	 * @see org.ebxml.business.process.TransitionType#getToBusinessState()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_ToBusinessState();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.business.process.TransitionType#getToBusinessStateIDRef <em>To Business State ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Business State ID Ref</em>'.
	 * @see org.ebxml.business.process.TransitionType#getToBusinessStateIDRef()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_ToBusinessStateIDRef();

	/**
	 * Returns the meta object for enum '{@link org.ebxml.business.process.ConditionGuardType <em>Condition Guard Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Guard Type</em>'.
	 * @see org.ebxml.business.process.ConditionGuardType
	 * @generated
	 */
	EEnum getConditionGuardType();

	/**
	 * Returns the meta object for enum '{@link org.ebxml.business.process.ConditionGuardType1 <em>Condition Guard Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Guard Type1</em>'.
	 * @see org.ebxml.business.process.ConditionGuardType1
	 * @generated
	 */
	EEnum getConditionGuardType1();

	/**
	 * Returns the meta object for enum '{@link org.ebxml.business.process.ConditionGuardType2 <em>Condition Guard Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Guard Type2</em>'.
	 * @see org.ebxml.business.process.ConditionGuardType2
	 * @generated
	 */
	EEnum getConditionGuardType2();

	/**
	 * Returns the meta object for data type '{@link org.ebxml.business.process.ConditionGuardType <em>Condition Guard Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Condition Guard Type Object</em>'.
	 * @see org.ebxml.business.process.ConditionGuardType
	 * @model instanceClass="org.ebxml.business.process.ConditionGuardType"
	 *        extendedMetaData="name='conditionGuard_._type:Object' baseType='conditionGuard_._type'"
	 * @generated
	 */
	EDataType getConditionGuardTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.ebxml.business.process.ConditionGuardType1 <em>Condition Guard Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Condition Guard Type Object1</em>'.
	 * @see org.ebxml.business.process.ConditionGuardType1
	 * @model instanceClass="org.ebxml.business.process.ConditionGuardType1"
	 *        extendedMetaData="name='conditionGuard_._1_._type:Object' baseType='conditionGuard_._1_._type'"
	 * @generated
	 */
	EDataType getConditionGuardTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.ebxml.business.process.ConditionGuardType2 <em>Condition Guard Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Condition Guard Type Object2</em>'.
	 * @see org.ebxml.business.process.ConditionGuardType2
	 * @model instanceClass="org.ebxml.business.process.ConditionGuardType2"
	 *        extendedMetaData="name='conditionGuard_._2_._type:Object' baseType='conditionGuard_._2_._type'"
	 * @generated
	 */
	EDataType getConditionGuardTypeObject2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessFactory getProcessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.AttachmentTypeImpl <em>Attachment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.AttachmentTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getAttachmentType()
		 * @generated
		 */
		EClass ATTACHMENT_TYPE = eINSTANCE.getAttachmentType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_TYPE__DOCUMENTATION = eINSTANCE.getAttachmentType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Business Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_TYPE__BUSINESS_DOCUMENT = eINSTANCE.getAttachmentType_BusinessDocument();

		/**
		 * The meta object literal for the '<em><b>Business Document ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_TYPE__BUSINESS_DOCUMENT_ID_REF = eINSTANCE.getAttachmentType_BusinessDocumentIDRef();

		/**
		 * The meta object literal for the '<em><b>Is Authenticated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_TYPE__IS_AUTHENTICATED = eINSTANCE.getAttachmentType_IsAuthenticated();

		/**
		 * The meta object literal for the '<em><b>Is Confidential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_TYPE__IS_CONFIDENTIAL = eINSTANCE.getAttachmentType_IsConfidential();

		/**
		 * The meta object literal for the '<em><b>Is Tamper Proof</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_TYPE__IS_TAMPER_PROOF = eINSTANCE.getAttachmentType_IsTamperProof();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_TYPE__MIME_TYPE = eINSTANCE.getAttachmentType_MimeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_TYPE__NAME = eINSTANCE.getAttachmentType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_TYPE__NAME_ID = eINSTANCE.getAttachmentType_NameID();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_TYPE__SPECIFICATION = eINSTANCE.getAttachmentType_Specification();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_TYPE__VERSION = eINSTANCE.getAttachmentType_Version();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.AttributeSubstitutionTypeImpl <em>Attribute Substitution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.AttributeSubstitutionTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getAttributeSubstitutionType()
		 * @generated
		 */
		EClass ATTRIBUTE_SUBSTITUTION_TYPE = eINSTANCE.getAttributeSubstitutionType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_SUBSTITUTION_TYPE__DOCUMENTATION = eINSTANCE.getAttributeSubstitutionType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_SUBSTITUTION_TYPE__ATTRIBUTE_NAME = eINSTANCE.getAttributeSubstitutionType_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_SUBSTITUTION_TYPE__VALUE = eINSTANCE.getAttributeSubstitutionType_Value();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.BinaryCollaborationTypeImpl <em>Binary Collaboration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.BinaryCollaborationTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getBinaryCollaborationType()
		 * @generated
		 */
		EClass BINARY_COLLABORATION_TYPE = eINSTANCE.getBinaryCollaborationType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__DOCUMENTATION = eINSTANCE.getBinaryCollaborationType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Initiating Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__INITIATING_ROLE = eINSTANCE.getBinaryCollaborationType_InitiatingRole();

		/**
		 * The meta object literal for the '<em><b>Responding Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__RESPONDING_ROLE = eINSTANCE.getBinaryCollaborationType_RespondingRole();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_COLLABORATION_TYPE__GROUP = eINSTANCE.getBinaryCollaborationType_Group();

		/**
		 * The meta object literal for the '<em><b>Documentation1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__DOCUMENTATION1 = eINSTANCE.getBinaryCollaborationType_Documentation1();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__START = eINSTANCE.getBinaryCollaborationType_Start();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__TRANSITION = eINSTANCE.getBinaryCollaborationType_Transition();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__SUCCESS = eINSTANCE.getBinaryCollaborationType_Success();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__FAILURE = eINSTANCE.getBinaryCollaborationType_Failure();

		/**
		 * The meta object literal for the '<em><b>Business Transaction Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__BUSINESS_TRANSACTION_ACTIVITY = eINSTANCE.getBinaryCollaborationType_BusinessTransactionActivity();

		/**
		 * The meta object literal for the '<em><b>Collaboration Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__COLLABORATION_ACTIVITY = eINSTANCE.getBinaryCollaborationType_CollaborationActivity();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__FORK = eINSTANCE.getBinaryCollaborationType_Fork();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COLLABORATION_TYPE__JOIN = eINSTANCE.getBinaryCollaborationType_Join();

		/**
		 * The meta object literal for the '<em><b>Begins When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_COLLABORATION_TYPE__BEGINS_WHEN = eINSTANCE.getBinaryCollaborationType_BeginsWhen();

		/**
		 * The meta object literal for the '<em><b>Ends When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_COLLABORATION_TYPE__ENDS_WHEN = eINSTANCE.getBinaryCollaborationType_EndsWhen();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_COLLABORATION_TYPE__NAME = eINSTANCE.getBinaryCollaborationType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_COLLABORATION_TYPE__NAME_ID = eINSTANCE.getBinaryCollaborationType_NameID();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_COLLABORATION_TYPE__PATTERN = eINSTANCE.getBinaryCollaborationType_Pattern();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_COLLABORATION_TYPE__POST_CONDITION = eINSTANCE.getBinaryCollaborationType_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_COLLABORATION_TYPE__PRE_CONDITION = eINSTANCE.getBinaryCollaborationType_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Time To Perform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_COLLABORATION_TYPE__TIME_TO_PERFORM = eINSTANCE.getBinaryCollaborationType_TimeToPerform();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.BusinessDocumentTypeImpl <em>Business Document Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.BusinessDocumentTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getBusinessDocumentType()
		 * @generated
		 */
		EClass BUSINESS_DOCUMENT_TYPE = eINSTANCE.getBusinessDocumentType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_DOCUMENT_TYPE__DOCUMENTATION = eINSTANCE.getBusinessDocumentType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION = eINSTANCE.getBusinessDocumentType_ConditionExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOCUMENT_TYPE__NAME = eINSTANCE.getBusinessDocumentType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOCUMENT_TYPE__NAME_ID = eINSTANCE.getBusinessDocumentType_NameID();

		/**
		 * The meta object literal for the '<em><b>Specification Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOCUMENT_TYPE__SPECIFICATION_ELEMENT = eINSTANCE.getBusinessDocumentType_SpecificationElement();

		/**
		 * The meta object literal for the '<em><b>Specification Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_DOCUMENT_TYPE__SPECIFICATION_LOCATION = eINSTANCE.getBusinessDocumentType_SpecificationLocation();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.BusinessPartnerRoleTypeImpl <em>Business Partner Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.BusinessPartnerRoleTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getBusinessPartnerRoleType()
		 * @generated
		 */
		EClass BUSINESS_PARTNER_ROLE_TYPE = eINSTANCE.getBusinessPartnerRoleType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PARTNER_ROLE_TYPE__DOCUMENTATION = eINSTANCE.getBusinessPartnerRoleType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Performs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PARTNER_ROLE_TYPE__PERFORMS = eINSTANCE.getBusinessPartnerRoleType_Performs();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PARTNER_ROLE_TYPE__TRANSITION = eINSTANCE.getBusinessPartnerRoleType_Transition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PARTNER_ROLE_TYPE__NAME = eINSTANCE.getBusinessPartnerRoleType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PARTNER_ROLE_TYPE__NAME_ID = eINSTANCE.getBusinessPartnerRoleType_NameID();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl <em>Business Transaction Activity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.BusinessTransactionActivityTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getBusinessTransactionActivityType()
		 * @generated
		 */
		EClass BUSINESS_TRANSACTION_ACTIVITY_TYPE = eINSTANCE.getBusinessTransactionActivityType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_TRANSACTION_ACTIVITY_TYPE__DOCUMENTATION = eINSTANCE.getBusinessTransactionActivityType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Business Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION = eINSTANCE.getBusinessTransactionActivityType_BusinessTransaction();

		/**
		 * The meta object literal for the '<em><b>Business Transaction ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_ACTIVITY_TYPE__BUSINESS_TRANSACTION_ID_REF = eINSTANCE.getBusinessTransactionActivityType_BusinessTransactionIDRef();

		/**
		 * The meta object literal for the '<em><b>From Authorized Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE = eINSTANCE.getBusinessTransactionActivityType_FromAuthorizedRole();

		/**
		 * The meta object literal for the '<em><b>From Authorized Role ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF = eINSTANCE.getBusinessTransactionActivityType_FromAuthorizedRoleIDRef();

		/**
		 * The meta object literal for the '<em><b>Is Concurrent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_CONCURRENT = eINSTANCE.getBusinessTransactionActivityType_IsConcurrent();

		/**
		 * The meta object literal for the '<em><b>Is Legally Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_ACTIVITY_TYPE__IS_LEGALLY_BINDING = eINSTANCE.getBusinessTransactionActivityType_IsLegallyBinding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME = eINSTANCE.getBusinessTransactionActivityType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_ACTIVITY_TYPE__NAME_ID = eINSTANCE.getBusinessTransactionActivityType_NameID();

		/**
		 * The meta object literal for the '<em><b>Time To Perform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_ACTIVITY_TYPE__TIME_TO_PERFORM = eINSTANCE.getBusinessTransactionActivityType_TimeToPerform();

		/**
		 * The meta object literal for the '<em><b>To Authorized Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE = eINSTANCE.getBusinessTransactionActivityType_ToAuthorizedRole();

		/**
		 * The meta object literal for the '<em><b>To Authorized Role ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF = eINSTANCE.getBusinessTransactionActivityType_ToAuthorizedRoleIDRef();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.BusinessTransactionTypeImpl <em>Business Transaction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.BusinessTransactionTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getBusinessTransactionType()
		 * @generated
		 */
		EClass BUSINESS_TRANSACTION_TYPE = eINSTANCE.getBusinessTransactionType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_TRANSACTION_TYPE__DOCUMENTATION = eINSTANCE.getBusinessTransactionType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Requesting Business Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_TRANSACTION_TYPE__REQUESTING_BUSINESS_ACTIVITY = eINSTANCE.getBusinessTransactionType_RequestingBusinessActivity();

		/**
		 * The meta object literal for the '<em><b>Responding Business Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_TRANSACTION_TYPE__RESPONDING_BUSINESS_ACTIVITY = eINSTANCE.getBusinessTransactionType_RespondingBusinessActivity();

		/**
		 * The meta object literal for the '<em><b>Begins When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_TYPE__BEGINS_WHEN = eINSTANCE.getBusinessTransactionType_BeginsWhen();

		/**
		 * The meta object literal for the '<em><b>Ends When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_TYPE__ENDS_WHEN = eINSTANCE.getBusinessTransactionType_EndsWhen();

		/**
		 * The meta object literal for the '<em><b>Is Guaranteed Delivery Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_TYPE__IS_GUARANTEED_DELIVERY_REQUIRED = eINSTANCE.getBusinessTransactionType_IsGuaranteedDeliveryRequired();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_TYPE__NAME = eINSTANCE.getBusinessTransactionType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_TYPE__NAME_ID = eINSTANCE.getBusinessTransactionType_NameID();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_TYPE__PATTERN = eINSTANCE.getBusinessTransactionType_Pattern();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_TYPE__POST_CONDITION = eINSTANCE.getBusinessTransactionType_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TRANSACTION_TYPE__PRE_CONDITION = eINSTANCE.getBusinessTransactionType_PreCondition();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.CollaborationActivityTypeImpl <em>Collaboration Activity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.CollaborationActivityTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getCollaborationActivityType()
		 * @generated
		 */
		EClass COLLABORATION_ACTIVITY_TYPE = eINSTANCE.getCollaborationActivityType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_ACTIVITY_TYPE__DOCUMENTATION = eINSTANCE.getCollaborationActivityType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Binary Collaboration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION = eINSTANCE.getCollaborationActivityType_BinaryCollaboration();

		/**
		 * The meta object literal for the '<em><b>Binary Collaboration ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_ACTIVITY_TYPE__BINARY_COLLABORATION_ID_REF = eINSTANCE.getCollaborationActivityType_BinaryCollaborationIDRef();

		/**
		 * The meta object literal for the '<em><b>From Authorized Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE = eINSTANCE.getCollaborationActivityType_FromAuthorizedRole();

		/**
		 * The meta object literal for the '<em><b>From Authorized Role ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_ACTIVITY_TYPE__FROM_AUTHORIZED_ROLE_ID_REF = eINSTANCE.getCollaborationActivityType_FromAuthorizedRoleIDRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_ACTIVITY_TYPE__NAME = eINSTANCE.getCollaborationActivityType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_ACTIVITY_TYPE__NAME_ID = eINSTANCE.getCollaborationActivityType_NameID();

		/**
		 * The meta object literal for the '<em><b>To Authorized Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE = eINSTANCE.getCollaborationActivityType_ToAuthorizedRole();

		/**
		 * The meta object literal for the '<em><b>To Authorized Role ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_ACTIVITY_TYPE__TO_AUTHORIZED_ROLE_ID_REF = eINSTANCE.getCollaborationActivityType_ToAuthorizedRoleIDRef();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.ConditionExpressionTypeImpl <em>Condition Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.ConditionExpressionTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionExpressionType()
		 * @generated
		 */
		EClass CONDITION_EXPRESSION_TYPE = eINSTANCE.getConditionExpressionType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_EXPRESSION_TYPE__DOCUMENTATION = eINSTANCE.getConditionExpressionType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_EXPRESSION_TYPE__EXPRESSION = eINSTANCE.getConditionExpressionType_Expression();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_EXPRESSION_TYPE__EXPRESSION_LANGUAGE = eINSTANCE.getConditionExpressionType_ExpressionLanguage();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.DocumentationTypeImpl <em>Documentation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.DocumentationTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getDocumentationType()
		 * @generated
		 */
		EClass DOCUMENTATION_TYPE = eINSTANCE.getDocumentationType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION_TYPE__VALUE = eINSTANCE.getDocumentationType_Value();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION_TYPE__URI = eINSTANCE.getDocumentationType_Uri();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl <em>Document Envelope Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.DocumentEnvelopeTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getDocumentEnvelopeType()
		 * @generated
		 */
		EClass DOCUMENT_ENVELOPE_TYPE = eINSTANCE.getDocumentEnvelopeType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ENVELOPE_TYPE__DOCUMENTATION = eINSTANCE.getDocumentEnvelopeType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ENVELOPE_TYPE__ATTACHMENT = eINSTANCE.getDocumentEnvelopeType_Attachment();

		/**
		 * The meta object literal for the '<em><b>Business Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT = eINSTANCE.getDocumentEnvelopeType_BusinessDocument();

		/**
		 * The meta object literal for the '<em><b>Business Document ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ENVELOPE_TYPE__BUSINESS_DOCUMENT_ID_REF = eINSTANCE.getDocumentEnvelopeType_BusinessDocumentIDRef();

		/**
		 * The meta object literal for the '<em><b>Is Authenticated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ENVELOPE_TYPE__IS_AUTHENTICATED = eINSTANCE.getDocumentEnvelopeType_IsAuthenticated();

		/**
		 * The meta object literal for the '<em><b>Is Confidential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ENVELOPE_TYPE__IS_CONFIDENTIAL = eINSTANCE.getDocumentEnvelopeType_IsConfidential();

		/**
		 * The meta object literal for the '<em><b>Is Positive Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ENVELOPE_TYPE__IS_POSITIVE_RESPONSE = eINSTANCE.getDocumentEnvelopeType_IsPositiveResponse();

		/**
		 * The meta object literal for the '<em><b>Is Tamper Proof</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ENVELOPE_TYPE__IS_TAMPER_PROOF = eINSTANCE.getDocumentEnvelopeType_IsTamperProof();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.DocumentRootImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTACHMENT = eINSTANCE.getDocumentRoot_Attachment();

		/**
		 * The meta object literal for the '<em><b>Attribute Substitution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTE_SUBSTITUTION = eINSTANCE.getDocumentRoot_AttributeSubstitution();

		/**
		 * The meta object literal for the '<em><b>Binary Collaboration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BINARY_COLLABORATION = eINSTANCE.getDocumentRoot_BinaryCollaboration();

		/**
		 * The meta object literal for the '<em><b>Business Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUSINESS_DOCUMENT = eINSTANCE.getDocumentRoot_BusinessDocument();

		/**
		 * The meta object literal for the '<em><b>Business Partner Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUSINESS_PARTNER_ROLE = eINSTANCE.getDocumentRoot_BusinessPartnerRole();

		/**
		 * The meta object literal for the '<em><b>Business Transaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUSINESS_TRANSACTION = eINSTANCE.getDocumentRoot_BusinessTransaction();

		/**
		 * The meta object literal for the '<em><b>Business Transaction Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUSINESS_TRANSACTION_ACTIVITY = eINSTANCE.getDocumentRoot_BusinessTransactionActivity();

		/**
		 * The meta object literal for the '<em><b>Collaboration Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLLABORATION_ACTIVITY = eINSTANCE.getDocumentRoot_CollaborationActivity();

		/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONDITION_EXPRESSION = eINSTANCE.getDocumentRoot_ConditionExpression();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

		/**
		 * The meta object literal for the '<em><b>Document Envelope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENT_ENVELOPE = eINSTANCE.getDocumentRoot_DocumentEnvelope();

		/**
		 * The meta object literal for the '<em><b>Document Substitution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENT_SUBSTITUTION = eINSTANCE.getDocumentRoot_DocumentSubstitution();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FAILURE = eINSTANCE.getDocumentRoot_Failure();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FORK = eINSTANCE.getDocumentRoot_Fork();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INCLUDE = eINSTANCE.getDocumentRoot_Include();

		/**
		 * The meta object literal for the '<em><b>Initiating Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INITIATING_ROLE = eINSTANCE.getDocumentRoot_InitiatingRole();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__JOIN = eINSTANCE.getDocumentRoot_Join();

		/**
		 * The meta object literal for the '<em><b>Multi Party Collaboration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MULTI_PARTY_COLLABORATION = eINSTANCE.getDocumentRoot_MultiPartyCollaboration();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PACKAGE = eINSTANCE.getDocumentRoot_Package();

		/**
		 * The meta object literal for the '<em><b>Performs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERFORMS = eINSTANCE.getDocumentRoot_Performs();

		/**
		 * The meta object literal for the '<em><b>Process Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROCESS_SPECIFICATION = eINSTANCE.getDocumentRoot_ProcessSpecification();

		/**
		 * The meta object literal for the '<em><b>Requesting Business Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REQUESTING_BUSINESS_ACTIVITY = eINSTANCE.getDocumentRoot_RequestingBusinessActivity();

		/**
		 * The meta object literal for the '<em><b>Responding Business Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESPONDING_BUSINESS_ACTIVITY = eINSTANCE.getDocumentRoot_RespondingBusinessActivity();

		/**
		 * The meta object literal for the '<em><b>Responding Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESPONDING_ROLE = eINSTANCE.getDocumentRoot_RespondingRole();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__START = eINSTANCE.getDocumentRoot_Start();

		/**
		 * The meta object literal for the '<em><b>Substitution Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBSTITUTION_SET = eINSTANCE.getDocumentRoot_SubstitutionSet();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUCCESS = eINSTANCE.getDocumentRoot_Success();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSITION = eINSTANCE.getDocumentRoot_Transition();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.DocumentSubstitutionTypeImpl <em>Document Substitution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.DocumentSubstitutionTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getDocumentSubstitutionType()
		 * @generated
		 */
		EClass DOCUMENT_SUBSTITUTION_TYPE = eINSTANCE.getDocumentSubstitutionType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_SUBSTITUTION_TYPE__DOCUMENTATION = eINSTANCE.getDocumentSubstitutionType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Original Business Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT = eINSTANCE.getDocumentSubstitutionType_OriginalBusinessDocument();

		/**
		 * The meta object literal for the '<em><b>Original Business Document ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_SUBSTITUTION_TYPE__ORIGINAL_BUSINESS_DOCUMENT_ID = eINSTANCE.getDocumentSubstitutionType_OriginalBusinessDocumentID();

		/**
		 * The meta object literal for the '<em><b>Substitute Business Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT = eINSTANCE.getDocumentSubstitutionType_SubstituteBusinessDocument();

		/**
		 * The meta object literal for the '<em><b>Substitute Business Document Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_SUBSTITUTION_TYPE__SUBSTITUTE_BUSINESS_DOCUMENT_ID = eINSTANCE.getDocumentSubstitutionType_SubstituteBusinessDocumentId();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.FailureTypeImpl <em>Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.FailureTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getFailureType()
		 * @generated
		 */
		EClass FAILURE_TYPE = eINSTANCE.getFailureType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_TYPE__DOCUMENTATION = eINSTANCE.getFailureType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_TYPE__CONDITION_EXPRESSION = eINSTANCE.getFailureType_ConditionExpression();

		/**
		 * The meta object literal for the '<em><b>Condition Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_TYPE__CONDITION_GUARD = eINSTANCE.getFailureType_ConditionGuard();

		/**
		 * The meta object literal for the '<em><b>From Business State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_TYPE__FROM_BUSINESS_STATE = eINSTANCE.getFailureType_FromBusinessState();

		/**
		 * The meta object literal for the '<em><b>From Business State ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_TYPE__FROM_BUSINESS_STATE_ID_REF = eINSTANCE.getFailureType_FromBusinessStateIDRef();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.ForkTypeImpl <em>Fork Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.ForkTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getForkType()
		 * @generated
		 */
		EClass FORK_TYPE = eINSTANCE.getForkType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_TYPE__DOCUMENTATION = eINSTANCE.getForkType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORK_TYPE__NAME = eINSTANCE.getForkType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORK_TYPE__NAME_ID = eINSTANCE.getForkType_NameID();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.IncludeTypeImpl <em>Include Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.IncludeTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getIncludeType()
		 * @generated
		 */
		EClass INCLUDE_TYPE = eINSTANCE.getIncludeType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE_TYPE__DOCUMENTATION = eINSTANCE.getIncludeType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__NAME = eINSTANCE.getIncludeType_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__URI = eINSTANCE.getIncludeType_Uri();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__UUID = eINSTANCE.getIncludeType_Uuid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__VERSION = eINSTANCE.getIncludeType_Version();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.InitiatingRoleTypeImpl <em>Initiating Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.InitiatingRoleTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getInitiatingRoleType()
		 * @generated
		 */
		EClass INITIATING_ROLE_TYPE = eINSTANCE.getInitiatingRoleType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIATING_ROLE_TYPE__DOCUMENTATION = eINSTANCE.getInitiatingRoleType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIATING_ROLE_TYPE__NAME = eINSTANCE.getInitiatingRoleType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIATING_ROLE_TYPE__NAME_ID = eINSTANCE.getInitiatingRoleType_NameID();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.JoinTypeImpl <em>Join Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.JoinTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getJoinType()
		 * @generated
		 */
		EClass JOIN_TYPE = eINSTANCE.getJoinType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_TYPE__DOCUMENTATION = eINSTANCE.getJoinType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TYPE__NAME = eINSTANCE.getJoinType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TYPE__NAME_ID = eINSTANCE.getJoinType_NameID();

		/**
		 * The meta object literal for the '<em><b>Wait For All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TYPE__WAIT_FOR_ALL = eINSTANCE.getJoinType_WaitForAll();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.MultiPartyCollaborationTypeImpl <em>Multi Party Collaboration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.MultiPartyCollaborationTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getMultiPartyCollaborationType()
		 * @generated
		 */
		EClass MULTI_PARTY_COLLABORATION_TYPE = eINSTANCE.getMultiPartyCollaborationType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PARTY_COLLABORATION_TYPE__DOCUMENTATION = eINSTANCE.getMultiPartyCollaborationType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Business Partner Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PARTY_COLLABORATION_TYPE__BUSINESS_PARTNER_ROLE = eINSTANCE.getMultiPartyCollaborationType_BusinessPartnerRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PARTY_COLLABORATION_TYPE__NAME = eINSTANCE.getMultiPartyCollaborationType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PARTY_COLLABORATION_TYPE__NAME_ID = eINSTANCE.getMultiPartyCollaborationType_NameID();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.PackageTypeImpl <em>Package Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.PackageTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getPackageType()
		 * @generated
		 */
		EClass PACKAGE_TYPE = eINSTANCE.getPackageType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__DOCUMENTATION = eINSTANCE.getPackageType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__GROUP = eINSTANCE.getPackageType_Group();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__PACKAGE = eINSTANCE.getPackageType_Package();

		/**
		 * The meta object literal for the '<em><b>Binary Collaboration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__BINARY_COLLABORATION = eINSTANCE.getPackageType_BinaryCollaboration();

		/**
		 * The meta object literal for the '<em><b>Business Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__BUSINESS_TRANSACTION = eINSTANCE.getPackageType_BusinessTransaction();

		/**
		 * The meta object literal for the '<em><b>Multi Party Collaboration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_TYPE__MULTI_PARTY_COLLABORATION = eINSTANCE.getPackageType_MultiPartyCollaboration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__NAME = eINSTANCE.getPackageType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_TYPE__NAME_ID = eINSTANCE.getPackageType_NameID();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.PerformsTypeImpl <em>Performs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.PerformsTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getPerformsType()
		 * @generated
		 */
		EClass PERFORMS_TYPE = eINSTANCE.getPerformsType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMS_TYPE__DOCUMENTATION = eINSTANCE.getPerformsType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Initiating Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMS_TYPE__INITIATING_ROLE = eINSTANCE.getPerformsType_InitiatingRole();

		/**
		 * The meta object literal for the '<em><b>Initiating Role ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMS_TYPE__INITIATING_ROLE_ID_REF = eINSTANCE.getPerformsType_InitiatingRoleIDRef();

		/**
		 * The meta object literal for the '<em><b>Responding Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMS_TYPE__RESPONDING_ROLE = eINSTANCE.getPerformsType_RespondingRole();

		/**
		 * The meta object literal for the '<em><b>Responding Role ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMS_TYPE__RESPONDING_ROLE_ID_REF = eINSTANCE.getPerformsType_RespondingRoleIDRef();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.ProcessSpecificationTypeImpl <em>Specification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.ProcessSpecificationTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getProcessSpecificationType()
		 * @generated
		 */
		EClass PROCESS_SPECIFICATION_TYPE = eINSTANCE.getProcessSpecificationType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_SPECIFICATION_TYPE__DOCUMENTATION = eINSTANCE.getProcessSpecificationType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Substitution Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_SPECIFICATION_TYPE__SUBSTITUTION_SET = eINSTANCE.getProcessSpecificationType_SubstitutionSet();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_SPECIFICATION_TYPE__GROUP = eINSTANCE.getProcessSpecificationType_Group();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_SPECIFICATION_TYPE__INCLUDE = eINSTANCE.getProcessSpecificationType_Include();

		/**
		 * The meta object literal for the '<em><b>Business Document</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_SPECIFICATION_TYPE__BUSINESS_DOCUMENT = eINSTANCE.getProcessSpecificationType_BusinessDocument();

		/**
		 * The meta object literal for the '<em><b>Process Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_SPECIFICATION_TYPE__PROCESS_SPECIFICATION = eINSTANCE.getProcessSpecificationType_ProcessSpecification();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_SPECIFICATION_TYPE__PACKAGE = eINSTANCE.getProcessSpecificationType_Package();

		/**
		 * The meta object literal for the '<em><b>Binary Collaboration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_SPECIFICATION_TYPE__BINARY_COLLABORATION = eINSTANCE.getProcessSpecificationType_BinaryCollaboration();

		/**
		 * The meta object literal for the '<em><b>Business Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_SPECIFICATION_TYPE__BUSINESS_TRANSACTION = eINSTANCE.getProcessSpecificationType_BusinessTransaction();

		/**
		 * The meta object literal for the '<em><b>Multi Party Collaboration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_SPECIFICATION_TYPE__MULTI_PARTY_COLLABORATION = eINSTANCE.getProcessSpecificationType_MultiPartyCollaboration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_SPECIFICATION_TYPE__NAME = eINSTANCE.getProcessSpecificationType_Name();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_SPECIFICATION_TYPE__UUID = eINSTANCE.getProcessSpecificationType_Uuid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_SPECIFICATION_TYPE__VERSION = eINSTANCE.getProcessSpecificationType_Version();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.RequestingBusinessActivityTypeImpl <em>Requesting Business Activity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.RequestingBusinessActivityTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getRequestingBusinessActivityType()
		 * @generated
		 */
		EClass REQUESTING_BUSINESS_ACTIVITY_TYPE = eINSTANCE.getRequestingBusinessActivityType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUESTING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION = eINSTANCE.getRequestingBusinessActivityType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Document Envelope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUESTING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE = eINSTANCE.getRequestingBusinessActivityType_DocumentEnvelope();

		/**
		 * The meta object literal for the '<em><b>Is Authorization Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED = eINSTANCE.getRequestingBusinessActivityType_IsAuthorizationRequired();

		/**
		 * The meta object literal for the '<em><b>Is Intelligible Check Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED = eINSTANCE.getRequestingBusinessActivityType_IsIntelligibleCheckRequired();

		/**
		 * The meta object literal for the '<em><b>Is Non Repudiation Receipt Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED = eINSTANCE.getRequestingBusinessActivityType_IsNonRepudiationReceiptRequired();

		/**
		 * The meta object literal for the '<em><b>Is Non Repudiation Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED = eINSTANCE.getRequestingBusinessActivityType_IsNonRepudiationRequired();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTING_BUSINESS_ACTIVITY_TYPE__NAME = eINSTANCE.getRequestingBusinessActivityType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTING_BUSINESS_ACTIVITY_TYPE__NAME_ID = eINSTANCE.getRequestingBusinessActivityType_NameID();

		/**
		 * The meta object literal for the '<em><b>Time To Acknowledge Acceptance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_ACCEPTANCE = eINSTANCE.getRequestingBusinessActivityType_TimeToAcknowledgeAcceptance();

		/**
		 * The meta object literal for the '<em><b>Time To Acknowledge Receipt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_RECEIPT = eINSTANCE.getRequestingBusinessActivityType_TimeToAcknowledgeReceipt();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl <em>Responding Business Activity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.RespondingBusinessActivityTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getRespondingBusinessActivityType()
		 * @generated
		 */
		EClass RESPONDING_BUSINESS_ACTIVITY_TYPE = eINSTANCE.getRespondingBusinessActivityType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENTATION = eINSTANCE.getRespondingBusinessActivityType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Document Envelope</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONDING_BUSINESS_ACTIVITY_TYPE__DOCUMENT_ENVELOPE = eINSTANCE.getRespondingBusinessActivityType_DocumentEnvelope();

		/**
		 * The meta object literal for the '<em><b>Is Authorization Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_AUTHORIZATION_REQUIRED = eINSTANCE.getRespondingBusinessActivityType_IsAuthorizationRequired();

		/**
		 * The meta object literal for the '<em><b>Is Intelligible Check Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_INTELLIGIBLE_CHECK_REQUIRED = eINSTANCE.getRespondingBusinessActivityType_IsIntelligibleCheckRequired();

		/**
		 * The meta object literal for the '<em><b>Is Non Repudiation Receipt Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_RECEIPT_REQUIRED = eINSTANCE.getRespondingBusinessActivityType_IsNonRepudiationReceiptRequired();

		/**
		 * The meta object literal for the '<em><b>Is Non Repudiation Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONDING_BUSINESS_ACTIVITY_TYPE__IS_NON_REPUDIATION_REQUIRED = eINSTANCE.getRespondingBusinessActivityType_IsNonRepudiationRequired();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME = eINSTANCE.getRespondingBusinessActivityType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONDING_BUSINESS_ACTIVITY_TYPE__NAME_ID = eINSTANCE.getRespondingBusinessActivityType_NameID();

		/**
		 * The meta object literal for the '<em><b>Time To Acknowledge Receipt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONDING_BUSINESS_ACTIVITY_TYPE__TIME_TO_ACKNOWLEDGE_RECEIPT = eINSTANCE.getRespondingBusinessActivityType_TimeToAcknowledgeReceipt();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.RespondingRoleTypeImpl <em>Responding Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.RespondingRoleTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getRespondingRoleType()
		 * @generated
		 */
		EClass RESPONDING_ROLE_TYPE = eINSTANCE.getRespondingRoleType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONDING_ROLE_TYPE__DOCUMENTATION = eINSTANCE.getRespondingRoleType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONDING_ROLE_TYPE__NAME = eINSTANCE.getRespondingRoleType_Name();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONDING_ROLE_TYPE__NAME_ID = eINSTANCE.getRespondingRoleType_NameID();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.StartTypeImpl <em>Start Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.StartTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getStartType()
		 * @generated
		 */
		EClass START_TYPE = eINSTANCE.getStartType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_TYPE__DOCUMENTATION = eINSTANCE.getStartType_Documentation();

		/**
		 * The meta object literal for the '<em><b>To Business State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TYPE__TO_BUSINESS_STATE = eINSTANCE.getStartType_ToBusinessState();

		/**
		 * The meta object literal for the '<em><b>To Business State ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TYPE__TO_BUSINESS_STATE_ID_REF = eINSTANCE.getStartType_ToBusinessStateIDRef();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.SubstitutionSetTypeImpl <em>Substitution Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.SubstitutionSetTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getSubstitutionSetType()
		 * @generated
		 */
		EClass SUBSTITUTION_SET_TYPE = eINSTANCE.getSubstitutionSetType();

		/**
		 * The meta object literal for the '<em><b>Document Substitution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTION_SET_TYPE__DOCUMENT_SUBSTITUTION = eINSTANCE.getSubstitutionSetType_DocumentSubstitution();

		/**
		 * The meta object literal for the '<em><b>Attribute Substitution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTION_SET_TYPE__ATTRIBUTE_SUBSTITUTION = eINSTANCE.getSubstitutionSetType_AttributeSubstitution();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTION_SET_TYPE__DOCUMENTATION = eINSTANCE.getSubstitutionSetType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Apply To Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTION_SET_TYPE__APPLY_TO_SCOPE = eINSTANCE.getSubstitutionSetType_ApplyToScope();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTION_SET_TYPE__NAME = eINSTANCE.getSubstitutionSetType_Name();

		/**
		 * The meta object literal for the '<em><b>Name Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTION_SET_TYPE__NAME_ID = eINSTANCE.getSubstitutionSetType_NameId();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.SuccessTypeImpl <em>Success Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.SuccessTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getSuccessType()
		 * @generated
		 */
		EClass SUCCESS_TYPE = eINSTANCE.getSuccessType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS_TYPE__DOCUMENTATION = eINSTANCE.getSuccessType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS_TYPE__CONDITION_EXPRESSION = eINSTANCE.getSuccessType_ConditionExpression();

		/**
		 * The meta object literal for the '<em><b>Condition Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCESS_TYPE__CONDITION_GUARD = eINSTANCE.getSuccessType_ConditionGuard();

		/**
		 * The meta object literal for the '<em><b>From Business State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCESS_TYPE__FROM_BUSINESS_STATE = eINSTANCE.getSuccessType_FromBusinessState();

		/**
		 * The meta object literal for the '<em><b>From Business State ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCESS_TYPE__FROM_BUSINESS_STATE_ID_REF = eINSTANCE.getSuccessType_FromBusinessStateIDRef();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.impl.TransitionTypeImpl
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getTransitionType()
		 * @generated
		 */
		EClass TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__DOCUMENTATION = eINSTANCE.getTransitionType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TYPE__CONDITION_EXPRESSION = eINSTANCE.getTransitionType_ConditionExpression();

		/**
		 * The meta object literal for the '<em><b>Condition Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__CONDITION_GUARD = eINSTANCE.getTransitionType_ConditionGuard();

		/**
		 * The meta object literal for the '<em><b>From Business State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__FROM_BUSINESS_STATE = eINSTANCE.getTransitionType_FromBusinessState();

		/**
		 * The meta object literal for the '<em><b>From Business State ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__FROM_BUSINESS_STATE_ID_REF = eINSTANCE.getTransitionType_FromBusinessStateIDRef();

		/**
		 * The meta object literal for the '<em><b>On Initiation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__ON_INITIATION = eINSTANCE.getTransitionType_OnInitiation();

		/**
		 * The meta object literal for the '<em><b>To Business State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__TO_BUSINESS_STATE = eINSTANCE.getTransitionType_ToBusinessState();

		/**
		 * The meta object literal for the '<em><b>To Business State ID Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_TYPE__TO_BUSINESS_STATE_ID_REF = eINSTANCE.getTransitionType_ToBusinessStateIDRef();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.ConditionGuardType <em>Condition Guard Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.ConditionGuardType
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardType()
		 * @generated
		 */
		EEnum CONDITION_GUARD_TYPE = eINSTANCE.getConditionGuardType();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.ConditionGuardType1 <em>Condition Guard Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.ConditionGuardType1
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardType1()
		 * @generated
		 */
		EEnum CONDITION_GUARD_TYPE1 = eINSTANCE.getConditionGuardType1();

		/**
		 * The meta object literal for the '{@link org.ebxml.business.process.ConditionGuardType2 <em>Condition Guard Type2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.ConditionGuardType2
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardType2()
		 * @generated
		 */
		EEnum CONDITION_GUARD_TYPE2 = eINSTANCE.getConditionGuardType2();

		/**
		 * The meta object literal for the '<em>Condition Guard Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.ConditionGuardType
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardTypeObject()
		 * @generated
		 */
		EDataType CONDITION_GUARD_TYPE_OBJECT = eINSTANCE.getConditionGuardTypeObject();

		/**
		 * The meta object literal for the '<em>Condition Guard Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.ConditionGuardType1
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardTypeObject1()
		 * @generated
		 */
		EDataType CONDITION_GUARD_TYPE_OBJECT1 = eINSTANCE.getConditionGuardTypeObject1();

		/**
		 * The meta object literal for the '<em>Condition Guard Type Object2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.business.process.ConditionGuardType2
		 * @see org.ebxml.business.process.impl.ProcessPackageImpl#getConditionGuardTypeObject2()
		 * @generated
		 */
		EDataType CONDITION_GUARD_TYPE_OBJECT2 = eINSTANCE.getConditionGuardTypeObject2();

	}

} //ProcessPackage
