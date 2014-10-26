/**
 */
package org.ebxml.namespaces.trade.partner;

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
 * @see org.ebxml.namespaces.trade.partner.PartnerFactory
 * @model kind="package"
 * @generated
 */
public interface PartnerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "partner";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ebxml.org/namespaces/tradePartner";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "partner";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartnerPackage eINSTANCE = org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.CertificateRefTypeImpl <em>Certificate Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.CertificateRefTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCertificateRefType()
	 * @generated
	 */
	int CERTIFICATE_REF_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Cert Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_REF_TYPE__CERT_ID = 0;

	/**
	 * The number of structural features of the '<em>Certificate Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_REF_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Certificate Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.CertificateTypeImpl <em>Certificate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.CertificateTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCertificateType()
	 * @generated
	 */
	int CERTIFICATE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Key Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_TYPE__KEY_INFO = 0;

	/**
	 * The feature id for the '<em><b>Cert Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_TYPE__CERT_ID = 1;

	/**
	 * The number of structural features of the '<em>Certificate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Certificate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.CharacteristicsTypeImpl <em>Characteristics Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.CharacteristicsTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCharacteristicsType()
	 * @generated
	 */
	int CHARACTERISTICS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_TYPE__AUTHENTICATED = 0;

	/**
	 * The feature id for the '<em><b>Authorized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_TYPE__AUTHORIZED = 1;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_TYPE__CONFIDENTIALITY = 2;

	/**
	 * The feature id for the '<em><b>Nonrepudiation Of Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_TYPE__NONREPUDIATION_OF_ORIGIN = 3;

	/**
	 * The feature id for the '<em><b>Nonrepudiation Of Receipt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_TYPE__NONREPUDIATION_OF_RECEIPT = 4;

	/**
	 * The feature id for the '<em><b>Secure Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_TYPE__SECURE_TRANSPORT = 5;

	/**
	 * The feature id for the '<em><b>Sync Reply Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_TYPE__SYNC_REPLY_MODE = 6;

	/**
	 * The number of structural features of the '<em>Characteristics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Characteristics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTICS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl <em>Collaboration Protocol Agreement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCollaborationProtocolAgreementType()
	 * @generated
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE__END = 2;

	/**
	 * The feature id for the '<em><b>Conversation Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS = 3;

	/**
	 * The feature id for the '<em><b>Party Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PARTY_INFO = 4;

	/**
	 * The feature id for the '<em><b>Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING = 5;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE__SIGNATURE = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE__COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Cpaid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CPAID = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE__VERSION = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Collaboration Protocol Agreement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Collaboration Protocol Agreement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_AGREEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolProfileTypeImpl <em>Collaboration Protocol Profile Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolProfileTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCollaborationProtocolProfileType()
	 * @generated
	 */
	int COLLABORATION_PROTOCOL_PROFILE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Party Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_PROFILE_TYPE__PARTY_INFO = 0;

	/**
	 * The feature id for the '<em><b>Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING = 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_PROFILE_TYPE__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_PROFILE_TYPE__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_PROFILE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Collaboration Protocol Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_PROFILE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Collaboration Protocol Profile Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_PROTOCOL_PROFILE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.CollaborationRoleTypeImpl <em>Collaboration Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.CollaborationRoleTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCollaborationRoleType()
	 * @generated
	 */
	int COLLABORATION_ROLE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Process Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ROLE_TYPE__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Certificate Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ROLE_TYPE__CERTIFICATE_REF = 2;

	/**
	 * The feature id for the '<em><b>Service Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ROLE_TYPE__SERVICE_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ROLE_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Collaboration Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ROLE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Collaboration Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_ROLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.CommentTypeImpl <em>Comment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.CommentTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCommentType()
	 * @generated
	 */
	int COMMENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__LANG = 1;

	/**
	 * The number of structural features of the '<em>Comment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Comment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.CompositeListTypeImpl <em>Composite List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.CompositeListTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCompositeListType()
	 * @generated
	 */
	int COMPOSITE_LIST_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_LIST_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Encapsulation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_LIST_TYPE__ENCAPSULATION = 1;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_LIST_TYPE__COMPOSITE = 2;

	/**
	 * The number of structural features of the '<em>Composite List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_LIST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Composite List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.CompositeTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCompositeType()
	 * @generated
	 */
	int COMPOSITE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Constituent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__CONSTITUENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Mimeparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__MIMEPARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__MIMETYPE = 3;

	/**
	 * The number of structural features of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.ConstituentTypeImpl <em>Constituent Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.ConstituentTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getConstituentType()
	 * @generated
	 */
	int CONSTITUENT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_TYPE__IDREF = 0;

	/**
	 * The number of structural features of the '<em>Constituent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constituent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.ConversationConstraintsTypeImpl <em>Conversation Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.ConversationConstraintsTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getConversationConstraintsType()
	 * @generated
	 */
	int CONVERSATION_CONSTRAINTS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Concurrent Conversations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_CONSTRAINTS_TYPE__CONCURRENT_CONVERSATIONS = 0;

	/**
	 * The feature id for the '<em><b>Invocation Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_CONSTRAINTS_TYPE__INVOCATION_LIMIT = 1;

	/**
	 * The number of structural features of the '<em>Conversation Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_CONSTRAINTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conversation Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.DeliveryChannelTypeImpl <em>Delivery Channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.DeliveryChannelTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDeliveryChannelType()
	 * @generated
	 */
	int DELIVERY_CHANNEL_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CHANNEL_TYPE__CHARACTERISTICS = 0;

	/**
	 * The feature id for the '<em><b>Channel Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CHANNEL_TYPE__CHANNEL_ID = 1;

	/**
	 * The feature id for the '<em><b>Doc Exchange Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CHANNEL_TYPE__DOC_EXCHANGE_ID = 2;

	/**
	 * The feature id for the '<em><b>Transport Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CHANNEL_TYPE__TRANSPORT_ID = 3;

	/**
	 * The number of structural features of the '<em>Delivery Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CHANNEL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Delivery Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CHANNEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.DigitalEnvelopeTypeImpl <em>Digital Envelope Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.DigitalEnvelopeTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDigitalEnvelopeType()
	 * @generated
	 */
	int DIGITAL_ENVELOPE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ENVELOPE_TYPE__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ENVELOPE_TYPE__ENCRYPTION_ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Certificate Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ENVELOPE_TYPE__CERTIFICATE_REF = 2;

	/**
	 * The number of structural features of the '<em>Digital Envelope Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ENVELOPE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Digital Envelope Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ENVELOPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.DocExchangeTypeImpl <em>Doc Exchange Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.DocExchangeTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDocExchangeType()
	 * @generated
	 */
	int DOC_EXCHANGE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Eb XML Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_EXCHANGE_TYPE__EB_XML_BINDING = 0;

	/**
	 * The feature id for the '<em><b>Doc Exchange Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_EXCHANGE_TYPE__DOC_EXCHANGE_ID = 1;

	/**
	 * The number of structural features of the '<em>Doc Exchange Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_EXCHANGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Doc Exchange Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_EXCHANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 14;

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
	 * The feature id for the '<em><b>Certificate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CERTIFICATE = 3;

	/**
	 * The feature id for the '<em><b>Certificate Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CERTIFICATE_REF = 4;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHARACTERISTICS = 5;

	/**
	 * The feature id for the '<em><b>Collaboration Protocol Agreement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLABORATION_PROTOCOL_AGREEMENT = 6;

	/**
	 * The feature id for the '<em><b>Collaboration Protocol Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLABORATION_PROTOCOL_PROFILE = 7;

	/**
	 * The feature id for the '<em><b>Collaboration Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLABORATION_ROLE = 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMENT = 9;

	/**
	 * The feature id for the '<em><b>Constituent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONSTITUENT = 10;

	/**
	 * The feature id for the '<em><b>Conversation Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONVERSATION_CONSTRAINTS = 11;

	/**
	 * The feature id for the '<em><b>Delivery Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELIVERY_CHANNEL = 12;

	/**
	 * The feature id for the '<em><b>Digital Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIGITAL_ENVELOPE = 13;

	/**
	 * The feature id for the '<em><b>Doc Exchange</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOC_EXCHANGE = 14;

	/**
	 * The feature id for the '<em><b>Eb XML Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EB_XML_BINDING = 15;

	/**
	 * The feature id for the '<em><b>Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCRYPTION_ALGORITHM = 16;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END = 17;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENDPOINT = 18;

	/**
	 * The feature id for the '<em><b>Hash Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HASH_FUNCTION = 19;

	/**
	 * The feature id for the '<em><b>Namespace Supported</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAMESPACE_SUPPORTED = 20;

	/**
	 * The feature id for the '<em><b>Non Repudiation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NON_REPUDIATION = 21;

	/**
	 * The feature id for the '<em><b>Override</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OVERRIDE = 22;

	/**
	 * The feature id for the '<em><b>Packaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKAGING = 23;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARTY_ID = 24;

	/**
	 * The feature id for the '<em><b>Party Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARTY_INFO = 25;

	/**
	 * The feature id for the '<em><b>Party Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARTY_REF = 26;

	/**
	 * The feature id for the '<em><b>Process Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROCESS_SPECIFICATION = 27;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROTOCOL = 28;

	/**
	 * The feature id for the '<em><b>Receiving Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECEIVING_PROTOCOL = 29;

	/**
	 * The feature id for the '<em><b>Reliable Messaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELIABLE_MESSAGING = 30;

	/**
	 * The feature id for the '<em><b>Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RETRIES = 31;

	/**
	 * The feature id for the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RETRY_INTERVAL = 32;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE = 33;

	/**
	 * The feature id for the '<em><b>Sending Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SENDING_PROTOCOL = 34;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE = 35;

	/**
	 * The feature id for the '<em><b>Service Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE_BINDING = 36;

	/**
	 * The feature id for the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIGNATURE_ALGORITHM = 37;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START = 38;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATUS = 39;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSPORT = 40;

	/**
	 * The feature id for the '<em><b>Transport Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSPORT_SECURITY = 41;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 43;

	/**
	 * The feature id for the '<em><b>Idref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDREF = 44;

	/**
	 * The feature id for the '<em><b>Sync Reply Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYNC_REPLY_MODE = 45;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VERSION = 46;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 47;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.EbXMLBindingTypeImpl <em>Eb XML Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.EbXMLBindingTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getEbXMLBindingType()
	 * @generated
	 */
	int EB_XML_BINDING_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Reliable Messaging</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EB_XML_BINDING_TYPE__RELIABLE_MESSAGING = 0;

	/**
	 * The feature id for the '<em><b>Non Repudiation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EB_XML_BINDING_TYPE__NON_REPUDIATION = 1;

	/**
	 * The feature id for the '<em><b>Digital Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE = 2;

	/**
	 * The feature id for the '<em><b>Namespace Supported</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EB_XML_BINDING_TYPE__NAMESPACE_SUPPORTED = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EB_XML_BINDING_TYPE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Eb XML Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EB_XML_BINDING_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Eb XML Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EB_XML_BINDING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.EncapsulationTypeImpl <em>Encapsulation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.EncapsulationTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getEncapsulationType()
	 * @generated
	 */
	int ENCAPSULATION_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Constituent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATION_TYPE__CONSTITUENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATION_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Mimeparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATION_TYPE__MIMEPARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATION_TYPE__MIMETYPE = 3;

	/**
	 * The number of structural features of the '<em>Encapsulation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Encapsulation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.EndpointTypeImpl <em>Endpoint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.EndpointTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getEndpointType()
	 * @generated
	 */
	int ENDPOINT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_TYPE__URI = 1;

	/**
	 * The number of structural features of the '<em>Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Endpoint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.NamespaceSupportedTypeImpl <em>Namespace Supported Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.NamespaceSupportedTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getNamespaceSupportedType()
	 * @generated
	 */
	int NAMESPACE_SUPPORTED_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SUPPORTED_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SUPPORTED_TYPE__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SUPPORTED_TYPE__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Namespace Supported Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SUPPORTED_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Namespace Supported Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SUPPORTED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.NonRepudiationTypeImpl <em>Non Repudiation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.NonRepudiationTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getNonRepudiationType()
	 * @generated
	 */
	int NON_REPUDIATION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_REPUDIATION_TYPE__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Hash Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_REPUDIATION_TYPE__HASH_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_REPUDIATION_TYPE__SIGNATURE_ALGORITHM = 2;

	/**
	 * The feature id for the '<em><b>Certificate Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_REPUDIATION_TYPE__CERTIFICATE_REF = 3;

	/**
	 * The number of structural features of the '<em>Non Repudiation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_REPUDIATION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Non Repudiation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_REPUDIATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.OverrideTypeImpl <em>Override Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.OverrideTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getOverrideType()
	 * @generated
	 */
	int OVERRIDE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Channel Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_TYPE__CHANNEL_ID = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_TYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Package Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_TYPE__PACKAGE_ID = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_TYPE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Override Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Override Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.PackagingTypeImpl <em>Packaging Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.PackagingTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getPackagingType()
	 * @generated
	 */
	int PACKAGING_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Processing Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_TYPE__PROCESSING_CAPABILITIES = 0;

	/**
	 * The feature id for the '<em><b>Simple Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_TYPE__SIMPLE_PART = 1;

	/**
	 * The feature id for the '<em><b>Composite List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_TYPE__COMPOSITE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Packaging Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Packaging Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.PartyIdTypeImpl <em>Party Id Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.PartyIdTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getPartyIdType()
	 * @generated
	 */
	int PARTY_ID_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ID_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ID_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Party Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ID_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Party Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.PartyInfoTypeImpl <em>Party Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.PartyInfoTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getPartyInfoType()
	 * @generated
	 */
	int PARTY_INFO_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INFO_TYPE__PARTY_ID = 0;

	/**
	 * The feature id for the '<em><b>Party Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INFO_TYPE__PARTY_REF = 1;

	/**
	 * The feature id for the '<em><b>Collaboration Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INFO_TYPE__COLLABORATION_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INFO_TYPE__CERTIFICATE = 3;

	/**
	 * The feature id for the '<em><b>Delivery Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INFO_TYPE__DELIVERY_CHANNEL = 4;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INFO_TYPE__TRANSPORT = 5;

	/**
	 * The feature id for the '<em><b>Doc Exchange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INFO_TYPE__DOC_EXCHANGE = 6;

	/**
	 * The number of structural features of the '<em>Party Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INFO_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Party Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INFO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.PartyRefTypeImpl <em>Party Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.PartyRefTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getPartyRefType()
	 * @generated
	 */
	int PARTY_REF_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REF_TYPE__HREF = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REF_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REF_TYPE__TYPE1 = 2;

	/**
	 * The number of structural features of the '<em>Party Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REF_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Party Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.ProcessingCapabilitiesTypeImpl <em>Processing Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.ProcessingCapabilitiesTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getProcessingCapabilitiesType()
	 * @generated
	 */
	int PROCESSING_CAPABILITIES_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CAPABILITIES_TYPE__GENERATE = 0;

	/**
	 * The feature id for the '<em><b>Parse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CAPABILITIES_TYPE__PARSE = 1;

	/**
	 * The number of structural features of the '<em>Processing Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CAPABILITIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Processing Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CAPABILITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.ProcessSpecificationTypeImpl <em>Process Specification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.ProcessSpecificationTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getProcessSpecificationType()
	 * @generated
	 */
	int PROCESS_SPECIFICATION_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__HREF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Process Specification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Process Specification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_SPECIFICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.ProtocolTypeImpl <em>Protocol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.ProtocolTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getProtocolType()
	 * @generated
	 */
	int PROTOCOL_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.ReliableMessagingTypeImpl <em>Reliable Messaging Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.ReliableMessagingTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getReliableMessagingType()
	 * @generated
	 */
	int RELIABLE_MESSAGING_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABLE_MESSAGING_TYPE__RETRIES = 0;

	/**
	 * The feature id for the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABLE_MESSAGING_TYPE__RETRY_INTERVAL = 1;

	/**
	 * The feature id for the '<em><b>Persist Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABLE_MESSAGING_TYPE__PERSIST_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Delivery Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABLE_MESSAGING_TYPE__DELIVERY_SEMANTICS = 3;

	/**
	 * The feature id for the '<em><b>Idempotency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABLE_MESSAGING_TYPE__IDEMPOTENCY = 4;

	/**
	 * The feature id for the '<em><b>Message Order Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABLE_MESSAGING_TYPE__MESSAGE_ORDER_SEMANTICS = 5;

	/**
	 * The number of structural features of the '<em>Reliable Messaging Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABLE_MESSAGING_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Reliable Messaging Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABLE_MESSAGING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.RoleTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__HREF = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.ServiceBindingTypeImpl <em>Service Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.ServiceBindingTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getServiceBindingType()
	 * @generated
	 */
	int SERVICE_BINDING_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__OVERRIDE = 1;

	/**
	 * The feature id for the '<em><b>Channel Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__CHANNEL_ID = 2;

	/**
	 * The feature id for the '<em><b>Package Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE__PACKAGE_ID = 3;

	/**
	 * The number of structural features of the '<em>Service Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.ServiceTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.SimplePartTypeImpl <em>Simple Part Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.SimplePartTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getSimplePartType()
	 * @generated
	 */
	int SIMPLE_PART_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Namespace Supported</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PART_TYPE__NAMESPACE_SUPPORTED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PART_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Mimeparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PART_TYPE__MIMEPARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PART_TYPE__MIMETYPE = 3;

	/**
	 * The number of structural features of the '<em>Simple Part Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PART_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Simple Part Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PART_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.StatusTypeImpl <em>Status Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.StatusTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.TransportSecurityTypeImpl <em>Transport Security Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.TransportSecurityTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getTransportSecurityType()
	 * @generated
	 */
	int TRANSPORT_SECURITY_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_SECURITY_TYPE__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Certificate Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF = 1;

	/**
	 * The number of structural features of the '<em>Transport Security Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_SECURITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transport Security Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_SECURITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.impl.TransportTypeImpl <em>Transport Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.impl.TransportTypeImpl
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getTransportType()
	 * @generated
	 */
	int TRANSPORT_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Sending Protocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_TYPE__SENDING_PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Receiving Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_TYPE__RECEIVING_PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_TYPE__ENDPOINT = 2;

	/**
	 * The feature id for the '<em><b>Transport Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_TYPE__TRANSPORT_SECURITY = 3;

	/**
	 * The feature id for the '<em><b>Transport Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_TYPE__TRANSPORT_ID = 4;

	/**
	 * The number of structural features of the '<em>Transport Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transport Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.DsType <em>Ds Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.DsType
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDsType()
	 * @generated
	 */
	int DS_TYPE = 36;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.EndpointTypeType <em>Endpoint Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.EndpointTypeType
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getEndpointTypeType()
	 * @generated
	 */
	int ENDPOINT_TYPE_TYPE = 37;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.MosType <em>Mos Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.MosType
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getMosType()
	 * @generated
	 */
	int MOS_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.StatusValueType <em>Status Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.StatusValueType
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getStatusValueType()
	 * @generated
	 */
	int STATUS_VALUE_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.ebxml.namespaces.trade.partner.SyncReplyModeType <em>Sync Reply Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.SyncReplyModeType
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getSyncReplyModeType()
	 * @generated
	 */
	int SYNC_REPLY_MODE_TYPE = 40;

	/**
	 * The meta object id for the '<em>Ds Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.DsType
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDsTypeObject()
	 * @generated
	 */
	int DS_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Endpoint Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.EndpointTypeType
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getEndpointTypeTypeObject()
	 * @generated
	 */
	int ENDPOINT_TYPE_TYPE_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Mos Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.MosType
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getMosTypeObject()
	 * @generated
	 */
	int MOS_TYPE_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Non Empty String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getNonEmptyString()
	 * @generated
	 */
	int NON_EMPTY_STRING = 44;

	/**
	 * The meta object id for the '<em>Status Value Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.StatusValueType
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getStatusValueTypeObject()
	 * @generated
	 */
	int STATUS_VALUE_TYPE_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Sync Reply Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ebxml.namespaces.trade.partner.SyncReplyModeType
	 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getSyncReplyModeTypeObject()
	 * @generated
	 */
	int SYNC_REPLY_MODE_TYPE_OBJECT = 46;


	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.CertificateRefType <em>Certificate Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate Ref Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CertificateRefType
	 * @generated
	 */
	EClass getCertificateRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CertificateRefType#getCertId <em>Cert Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cert Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CertificateRefType#getCertId()
	 * @see #getCertificateRefType()
	 * @generated
	 */
	EAttribute getCertificateRefType_CertId();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.CertificateType <em>Certificate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CertificateType
	 * @generated
	 */
	EClass getCertificateType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.CertificateType#getKeyInfo <em>Key Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Info</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CertificateType#getKeyInfo()
	 * @see #getCertificateType()
	 * @generated
	 */
	EReference getCertificateType_KeyInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CertificateType#getCertId <em>Cert Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cert Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CertificateType#getCertId()
	 * @see #getCertificateType()
	 * @generated
	 */
	EAttribute getCertificateType_CertId();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType <em>Characteristics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristics Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CharacteristicsType
	 * @generated
	 */
	EClass getCharacteristicsType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthenticated <em>Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authenticated</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthenticated()
	 * @see #getCharacteristicsType()
	 * @generated
	 */
	EAttribute getCharacteristicsType_Authenticated();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthorized <em>Authorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorized</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CharacteristicsType#isAuthorized()
	 * @see #getCharacteristicsType()
	 * @generated
	 */
	EAttribute getCharacteristicsType_Authorized();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CharacteristicsType#isConfidentiality()
	 * @see #getCharacteristicsType()
	 * @generated
	 */
	EAttribute getCharacteristicsType_Confidentiality();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfOrigin <em>Nonrepudiation Of Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nonrepudiation Of Origin</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfOrigin()
	 * @see #getCharacteristicsType()
	 * @generated
	 */
	EAttribute getCharacteristicsType_NonrepudiationOfOrigin();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfReceipt <em>Nonrepudiation Of Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nonrepudiation Of Receipt</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CharacteristicsType#isNonrepudiationOfReceipt()
	 * @see #getCharacteristicsType()
	 * @generated
	 */
	EAttribute getCharacteristicsType_NonrepudiationOfReceipt();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#isSecureTransport <em>Secure Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure Transport</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CharacteristicsType#isSecureTransport()
	 * @see #getCharacteristicsType()
	 * @generated
	 */
	EAttribute getCharacteristicsType_SecureTransport();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CharacteristicsType#getSyncReplyMode <em>Sync Reply Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Reply Mode</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CharacteristicsType#getSyncReplyMode()
	 * @see #getCharacteristicsType()
	 * @generated
	 */
	EAttribute getCharacteristicsType_SyncReplyMode();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType <em>Collaboration Protocol Agreement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration Protocol Agreement Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType
	 * @generated
	 */
	EClass getCollaborationProtocolAgreementType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getStatus()
	 * @see #getCollaborationProtocolAgreementType()
	 * @generated
	 */
	EReference getCollaborationProtocolAgreementType_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getStart()
	 * @see #getCollaborationProtocolAgreementType()
	 * @generated
	 */
	EAttribute getCollaborationProtocolAgreementType_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getEnd()
	 * @see #getCollaborationProtocolAgreementType()
	 * @generated
	 */
	EAttribute getCollaborationProtocolAgreementType_End();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getConversationConstraints <em>Conversation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation Constraints</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getConversationConstraints()
	 * @see #getCollaborationProtocolAgreementType()
	 * @generated
	 */
	EReference getCollaborationProtocolAgreementType_ConversationConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getPartyInfo <em>Party Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Party Info</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getPartyInfo()
	 * @see #getCollaborationProtocolAgreementType()
	 * @generated
	 */
	EReference getCollaborationProtocolAgreementType_PartyInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getPackaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packaging</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getPackaging()
	 * @see #getCollaborationProtocolAgreementType()
	 * @generated
	 */
	EReference getCollaborationProtocolAgreementType_Packaging();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getSignature()
	 * @see #getCollaborationProtocolAgreementType()
	 * @generated
	 */
	EReference getCollaborationProtocolAgreementType_Signature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getComment()
	 * @see #getCollaborationProtocolAgreementType()
	 * @generated
	 */
	EReference getCollaborationProtocolAgreementType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getCpaid <em>Cpaid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpaid</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getCpaid()
	 * @see #getCollaborationProtocolAgreementType()
	 * @generated
	 */
	EAttribute getCollaborationProtocolAgreementType_Cpaid();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getVersion()
	 * @see #getCollaborationProtocolAgreementType()
	 * @generated
	 */
	EAttribute getCollaborationProtocolAgreementType_Version();

	/**
	 * Returns the meta object for the attribute list '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType#getAnyAttribute()
	 * @see #getCollaborationProtocolAgreementType()
	 * @generated
	 */
	EAttribute getCollaborationProtocolAgreementType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType <em>Collaboration Protocol Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration Protocol Profile Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType
	 * @generated
	 */
	EClass getCollaborationProtocolProfileType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getPartyInfo <em>Party Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Party Info</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getPartyInfo()
	 * @see #getCollaborationProtocolProfileType()
	 * @generated
	 */
	EReference getCollaborationProtocolProfileType_PartyInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getPackaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packaging</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getPackaging()
	 * @see #getCollaborationProtocolProfileType()
	 * @generated
	 */
	EReference getCollaborationProtocolProfileType_Packaging();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getSignature()
	 * @see #getCollaborationProtocolProfileType()
	 * @generated
	 */
	EReference getCollaborationProtocolProfileType_Signature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getComment()
	 * @see #getCollaborationProtocolProfileType()
	 * @generated
	 */
	EReference getCollaborationProtocolProfileType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getVersion()
	 * @see #getCollaborationProtocolProfileType()
	 * @generated
	 */
	EAttribute getCollaborationProtocolProfileType_Version();

	/**
	 * Returns the meta object for the attribute list '{@link org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType#getAnyAttribute()
	 * @see #getCollaborationProtocolProfileType()
	 * @generated
	 */
	EAttribute getCollaborationProtocolProfileType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType <em>Collaboration Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration Role Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationRoleType
	 * @generated
	 */
	EClass getCollaborationRoleType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getProcessSpecification <em>Process Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Specification</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationRoleType#getProcessSpecification()
	 * @see #getCollaborationRoleType()
	 * @generated
	 */
	EReference getCollaborationRoleType_ProcessSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationRoleType#getRole()
	 * @see #getCollaborationRoleType()
	 * @generated
	 */
	EReference getCollaborationRoleType_Role();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getCertificateRef <em>Certificate Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificate Ref</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationRoleType#getCertificateRef()
	 * @see #getCollaborationRoleType()
	 * @generated
	 */
	EReference getCollaborationRoleType_CertificateRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getServiceBinding <em>Service Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Binding</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationRoleType#getServiceBinding()
	 * @see #getCollaborationRoleType()
	 * @generated
	 */
	EReference getCollaborationRoleType_ServiceBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CollaborationRoleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CollaborationRoleType#getId()
	 * @see #getCollaborationRoleType()
	 * @generated
	 */
	EAttribute getCollaborationRoleType_Id();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CommentType
	 * @generated
	 */
	EClass getCommentType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CommentType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CommentType#getValue()
	 * @see #getCommentType()
	 * @generated
	 */
	EAttribute getCommentType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CommentType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CommentType#getLang()
	 * @see #getCommentType()
	 * @generated
	 */
	EAttribute getCommentType_Lang();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.CompositeListType <em>Composite List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite List Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CompositeListType
	 * @generated
	 */
	EClass getCompositeListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.ebxml.namespaces.trade.partner.CompositeListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CompositeListType#getGroup()
	 * @see #getCompositeListType()
	 * @generated
	 */
	EAttribute getCompositeListType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.CompositeListType#getEncapsulation <em>Encapsulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Encapsulation</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CompositeListType#getEncapsulation()
	 * @see #getCompositeListType()
	 * @generated
	 */
	EReference getCompositeListType_Encapsulation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.CompositeListType#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CompositeListType#getComposite()
	 * @see #getCompositeListType()
	 * @generated
	 */
	EReference getCompositeListType_Composite();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CompositeType
	 * @generated
	 */
	EClass getCompositeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.CompositeType#getConstituent <em>Constituent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constituent</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CompositeType#getConstituent()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_Constituent();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CompositeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CompositeType#getId()
	 * @see #getCompositeType()
	 * @generated
	 */
	EAttribute getCompositeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CompositeType#getMimeparameters <em>Mimeparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimeparameters</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CompositeType#getMimeparameters()
	 * @see #getCompositeType()
	 * @generated
	 */
	EAttribute getCompositeType_Mimeparameters();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.CompositeType#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see org.ebxml.namespaces.trade.partner.CompositeType#getMimetype()
	 * @see #getCompositeType()
	 * @generated
	 */
	EAttribute getCompositeType_Mimetype();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.ConstituentType <em>Constituent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constituent Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ConstituentType
	 * @generated
	 */
	EClass getConstituentType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ConstituentType#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idref</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ConstituentType#getIdref()
	 * @see #getConstituentType()
	 * @generated
	 */
	EAttribute getConstituentType_Idref();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType <em>Conversation Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation Constraints Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ConversationConstraintsType
	 * @generated
	 */
	EClass getConversationConstraintsType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getConcurrentConversations <em>Concurrent Conversations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrent Conversations</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getConcurrentConversations()
	 * @see #getConversationConstraintsType()
	 * @generated
	 */
	EAttribute getConversationConstraintsType_ConcurrentConversations();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getInvocationLimit <em>Invocation Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invocation Limit</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ConversationConstraintsType#getInvocationLimit()
	 * @see #getConversationConstraintsType()
	 * @generated
	 */
	EAttribute getConversationConstraintsType_InvocationLimit();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType <em>Delivery Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Channel Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DeliveryChannelType
	 * @generated
	 */
	EClass getDeliveryChannelType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Characteristics</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DeliveryChannelType#getCharacteristics()
	 * @see #getDeliveryChannelType()
	 * @generated
	 */
	EReference getDeliveryChannelType_Characteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getChannelId <em>Channel Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DeliveryChannelType#getChannelId()
	 * @see #getDeliveryChannelType()
	 * @generated
	 */
	EAttribute getDeliveryChannelType_ChannelId();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getDocExchangeId <em>Doc Exchange Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Exchange Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DeliveryChannelType#getDocExchangeId()
	 * @see #getDeliveryChannelType()
	 * @generated
	 */
	EAttribute getDeliveryChannelType_DocExchangeId();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DeliveryChannelType#getTransportId <em>Transport Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DeliveryChannelType#getTransportId()
	 * @see #getDeliveryChannelType()
	 * @generated
	 */
	EAttribute getDeliveryChannelType_TransportId();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.DigitalEnvelopeType <em>Digital Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Envelope Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DigitalEnvelopeType
	 * @generated
	 */
	EClass getDigitalEnvelopeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getProtocol()
	 * @see #getDigitalEnvelopeType()
	 * @generated
	 */
	EReference getDigitalEnvelopeType_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getEncryptionAlgorithm <em>Encryption Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption Algorithm</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getEncryptionAlgorithm()
	 * @see #getDigitalEnvelopeType()
	 * @generated
	 */
	EAttribute getDigitalEnvelopeType_EncryptionAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getCertificateRef <em>Certificate Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificate Ref</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DigitalEnvelopeType#getCertificateRef()
	 * @see #getDigitalEnvelopeType()
	 * @generated
	 */
	EReference getDigitalEnvelopeType_CertificateRef();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.DocExchangeType <em>Doc Exchange Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Exchange Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocExchangeType
	 * @generated
	 */
	EClass getDocExchangeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocExchangeType#getEbXMLBinding <em>Eb XML Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eb XML Binding</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocExchangeType#getEbXMLBinding()
	 * @see #getDocExchangeType()
	 * @generated
	 */
	EReference getDocExchangeType_EbXMLBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocExchangeType#getDocExchangeId <em>Doc Exchange Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Exchange Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocExchangeType#getDocExchangeId()
	 * @see #getDocExchangeType()
	 * @generated
	 */
	EAttribute getDocExchangeType_DocExchangeId();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificate</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getCertificate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Certificate();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCertificateRef <em>Certificate Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificate Ref</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getCertificateRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CertificateRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Characteristics</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getCharacteristics()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Characteristics();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationProtocolAgreement <em>Collaboration Protocol Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collaboration Protocol Agreement</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationProtocolAgreement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CollaborationProtocolAgreement();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationProtocolProfile <em>Collaboration Protocol Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collaboration Protocol Profile</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationProtocolProfile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CollaborationProtocolProfile();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationRole <em>Collaboration Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collaboration Role</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getCollaborationRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CollaborationRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getComment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getConstituent <em>Constituent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constituent</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getConstituent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Constituent();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getConversationConstraints <em>Conversation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation Constraints</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getConversationConstraints()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConversationConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getDeliveryChannel <em>Delivery Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delivery Channel</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getDeliveryChannel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DeliveryChannel();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getDigitalEnvelope <em>Digital Envelope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digital Envelope</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getDigitalEnvelope()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DigitalEnvelope();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getDocExchange <em>Doc Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doc Exchange</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getDocExchange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DocExchange();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEbXMLBinding <em>Eb XML Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eb XML Binding</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getEbXMLBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EbXMLBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEncryptionAlgorithm <em>Encryption Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption Algorithm</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getEncryptionAlgorithm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EncryptionAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getEnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_End();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getEndpoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Endpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getHashFunction <em>Hash Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Function</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getHashFunction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HashFunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getNamespaceSupported <em>Namespace Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Namespace Supported</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getNamespaceSupported()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NamespaceSupported();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getNonRepudiation <em>Non Repudiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non Repudiation</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getNonRepudiation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NonRepudiation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Override</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getOverride()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Override();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPackaging <em>Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packaging</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getPackaging()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Packaging();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Party Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PartyId();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyInfo <em>Party Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Party Info</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PartyInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyRef <em>Party Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Party Ref</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getPartyRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PartyRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getProcessSpecification <em>Process Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Specification</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getProcessSpecification()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ProcessSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getProtocol()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getReceivingProtocol <em>Receiving Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiving Protocol</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getReceivingProtocol()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReceivingProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getReliableMessaging <em>Reliable Messaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reliable Messaging</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getReliableMessaging()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReliableMessaging();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getRetries <em>Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retries</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getRetries()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Retries();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getRetryInterval <em>Retry Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Interval</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getRetryInterval()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RetryInterval();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Role();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getSendingProtocol <em>Sending Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sending Protocol</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getSendingProtocol()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SendingProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getService()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Service();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getServiceBinding <em>Service Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Binding</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getServiceBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServiceBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getSignatureAlgorithm <em>Signature Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature Algorithm</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getSignatureAlgorithm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SignatureAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getStart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getStatus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Status();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getTransport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transport();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getTransportSecurity <em>Transport Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Security</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getTransportSecurity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransportSecurity();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getIdref <em>Idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idref</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getIdref()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Idref();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getSyncReplyMode <em>Sync Reply Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Reply Mode</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getSyncReplyMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SyncReplyMode();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.DocumentRoot#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DocumentRoot#getVersion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Version();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType <em>Eb XML Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eb XML Binding Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EbXMLBindingType
	 * @generated
	 */
	EClass getEbXMLBindingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getReliableMessaging <em>Reliable Messaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reliable Messaging</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EbXMLBindingType#getReliableMessaging()
	 * @see #getEbXMLBindingType()
	 * @generated
	 */
	EReference getEbXMLBindingType_ReliableMessaging();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getNonRepudiation <em>Non Repudiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non Repudiation</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EbXMLBindingType#getNonRepudiation()
	 * @see #getEbXMLBindingType()
	 * @generated
	 */
	EReference getEbXMLBindingType_NonRepudiation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getDigitalEnvelope <em>Digital Envelope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digital Envelope</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EbXMLBindingType#getDigitalEnvelope()
	 * @see #getEbXMLBindingType()
	 * @generated
	 */
	EReference getEbXMLBindingType_DigitalEnvelope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getNamespaceSupported <em>Namespace Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespace Supported</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EbXMLBindingType#getNamespaceSupported()
	 * @see #getEbXMLBindingType()
	 * @generated
	 */
	EReference getEbXMLBindingType_NamespaceSupported();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.EbXMLBindingType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EbXMLBindingType#getVersion()
	 * @see #getEbXMLBindingType()
	 * @generated
	 */
	EAttribute getEbXMLBindingType_Version();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.EncapsulationType <em>Encapsulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encapsulation Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EncapsulationType
	 * @generated
	 */
	EClass getEncapsulationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getConstituent <em>Constituent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constituent</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EncapsulationType#getConstituent()
	 * @see #getEncapsulationType()
	 * @generated
	 */
	EReference getEncapsulationType_Constituent();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EncapsulationType#getId()
	 * @see #getEncapsulationType()
	 * @generated
	 */
	EAttribute getEncapsulationType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getMimeparameters <em>Mimeparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimeparameters</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EncapsulationType#getMimeparameters()
	 * @see #getEncapsulationType()
	 * @generated
	 */
	EAttribute getEncapsulationType_Mimeparameters();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EncapsulationType#getMimetype()
	 * @see #getEncapsulationType()
	 * @generated
	 */
	EAttribute getEncapsulationType_Mimetype();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.EndpointType <em>Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EndpointType
	 * @generated
	 */
	EClass getEndpointType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.EndpointType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EndpointType#getType()
	 * @see #getEndpointType()
	 * @generated
	 */
	EAttribute getEndpointType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.EndpointType#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EndpointType#getUri()
	 * @see #getEndpointType()
	 * @generated
	 */
	EAttribute getEndpointType_Uri();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.NamespaceSupportedType <em>Namespace Supported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Supported Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.NamespaceSupportedType
	 * @generated
	 */
	EClass getNamespaceSupportedType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.NamespaceSupportedType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ebxml.namespaces.trade.partner.NamespaceSupportedType#getValue()
	 * @see #getNamespaceSupportedType()
	 * @generated
	 */
	EAttribute getNamespaceSupportedType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.NamespaceSupportedType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.ebxml.namespaces.trade.partner.NamespaceSupportedType#getLocation()
	 * @see #getNamespaceSupportedType()
	 * @generated
	 */
	EAttribute getNamespaceSupportedType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.NamespaceSupportedType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ebxml.namespaces.trade.partner.NamespaceSupportedType#getVersion()
	 * @see #getNamespaceSupportedType()
	 * @generated
	 */
	EAttribute getNamespaceSupportedType_Version();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.NonRepudiationType <em>Non Repudiation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Repudiation Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.NonRepudiationType
	 * @generated
	 */
	EClass getNonRepudiationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol</em>'.
	 * @see org.ebxml.namespaces.trade.partner.NonRepudiationType#getProtocol()
	 * @see #getNonRepudiationType()
	 * @generated
	 */
	EReference getNonRepudiationType_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getHashFunction <em>Hash Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Function</em>'.
	 * @see org.ebxml.namespaces.trade.partner.NonRepudiationType#getHashFunction()
	 * @see #getNonRepudiationType()
	 * @generated
	 */
	EAttribute getNonRepudiationType_HashFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getSignatureAlgorithm <em>Signature Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature Algorithm</em>'.
	 * @see org.ebxml.namespaces.trade.partner.NonRepudiationType#getSignatureAlgorithm()
	 * @see #getNonRepudiationType()
	 * @generated
	 */
	EAttribute getNonRepudiationType_SignatureAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.NonRepudiationType#getCertificateRef <em>Certificate Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificate Ref</em>'.
	 * @see org.ebxml.namespaces.trade.partner.NonRepudiationType#getCertificateRef()
	 * @see #getNonRepudiationType()
	 * @generated
	 */
	EReference getNonRepudiationType_CertificateRef();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.OverrideType <em>Override Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Override Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.OverrideType
	 * @generated
	 */
	EClass getOverrideType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.OverrideType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.ebxml.namespaces.trade.partner.OverrideType#getAction()
	 * @see #getOverrideType()
	 * @generated
	 */
	EAttribute getOverrideType_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.OverrideType#getChannelId <em>Channel Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.OverrideType#getChannelId()
	 * @see #getOverrideType()
	 * @generated
	 */
	EAttribute getOverrideType_ChannelId();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.OverrideType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.ebxml.namespaces.trade.partner.OverrideType#getHref()
	 * @see #getOverrideType()
	 * @generated
	 */
	EAttribute getOverrideType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.OverrideType#getPackageId <em>Package Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.OverrideType#getPackageId()
	 * @see #getOverrideType()
	 * @generated
	 */
	EAttribute getOverrideType_PackageId();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.OverrideType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.OverrideType#getType()
	 * @see #getOverrideType()
	 * @generated
	 */
	EAttribute getOverrideType_Type();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.PackagingType <em>Packaging Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packaging Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PackagingType
	 * @generated
	 */
	EClass getPackagingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.PackagingType#getProcessingCapabilities <em>Processing Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Capabilities</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PackagingType#getProcessingCapabilities()
	 * @see #getPackagingType()
	 * @generated
	 */
	EReference getPackagingType_ProcessingCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.PackagingType#getSimplePart <em>Simple Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Part</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PackagingType#getSimplePart()
	 * @see #getPackagingType()
	 * @generated
	 */
	EReference getPackagingType_SimplePart();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.PackagingType#getCompositeList <em>Composite List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite List</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PackagingType#getCompositeList()
	 * @see #getPackagingType()
	 * @generated
	 */
	EReference getPackagingType_CompositeList();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.PackagingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PackagingType#getId()
	 * @see #getPackagingType()
	 * @generated
	 */
	EAttribute getPackagingType_Id();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.PartyIdType <em>Party Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Id Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyIdType
	 * @generated
	 */
	EClass getPartyIdType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.PartyIdType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyIdType#getValue()
	 * @see #getPartyIdType()
	 * @generated
	 */
	EAttribute getPartyIdType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.PartyIdType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyIdType#getType()
	 * @see #getPartyIdType()
	 * @generated
	 */
	EAttribute getPartyIdType_Type();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.PartyInfoType <em>Party Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Info Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyInfoType
	 * @generated
	 */
	EClass getPartyInfoType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Party Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyInfoType#getPartyId()
	 * @see #getPartyInfoType()
	 * @generated
	 */
	EReference getPartyInfoType_PartyId();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getPartyRef <em>Party Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Party Ref</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyInfoType#getPartyRef()
	 * @see #getPartyInfoType()
	 * @generated
	 */
	EReference getPartyInfoType_PartyRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getCollaborationRole <em>Collaboration Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collaboration Role</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyInfoType#getCollaborationRole()
	 * @see #getPartyInfoType()
	 * @generated
	 */
	EReference getPartyInfoType_CollaborationRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Certificate</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyInfoType#getCertificate()
	 * @see #getPartyInfoType()
	 * @generated
	 */
	EReference getPartyInfoType_Certificate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getDeliveryChannel <em>Delivery Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delivery Channel</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyInfoType#getDeliveryChannel()
	 * @see #getPartyInfoType()
	 * @generated
	 */
	EReference getPartyInfoType_DeliveryChannel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transport</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyInfoType#getTransport()
	 * @see #getPartyInfoType()
	 * @generated
	 */
	EReference getPartyInfoType_Transport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.PartyInfoType#getDocExchange <em>Doc Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc Exchange</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyInfoType#getDocExchange()
	 * @see #getPartyInfoType()
	 * @generated
	 */
	EReference getPartyInfoType_DocExchange();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.PartyRefType <em>Party Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Ref Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyRefType
	 * @generated
	 */
	EClass getPartyRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.PartyRefType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyRefType#getHref()
	 * @see #getPartyRefType()
	 * @generated
	 */
	EAttribute getPartyRefType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.PartyRefType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyRefType#getType()
	 * @see #getPartyRefType()
	 * @generated
	 */
	EAttribute getPartyRefType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.PartyRefType#getType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type1</em>'.
	 * @see org.ebxml.namespaces.trade.partner.PartyRefType#getType1()
	 * @see #getPartyRefType()
	 * @generated
	 */
	EAttribute getPartyRefType_Type1();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType <em>Processing Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Capabilities Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType
	 * @generated
	 */
	EClass getProcessingCapabilitiesType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isGenerate <em>Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isGenerate()
	 * @see #getProcessingCapabilitiesType()
	 * @generated
	 */
	EAttribute getProcessingCapabilitiesType_Generate();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isParse <em>Parse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parse</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isParse()
	 * @see #getProcessingCapabilitiesType()
	 * @generated
	 */
	EAttribute getProcessingCapabilitiesType_Parse();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.ProcessSpecificationType <em>Process Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Specification Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProcessSpecificationType
	 * @generated
	 */
	EClass getProcessSpecificationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.ProcessSpecificationType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProcessSpecificationType#getReference()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EReference getProcessSpecificationType_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ProcessSpecificationType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProcessSpecificationType#getHref()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EAttribute getProcessSpecificationType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ProcessSpecificationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProcessSpecificationType#getName()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EAttribute getProcessSpecificationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ProcessSpecificationType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProcessSpecificationType#getType()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EAttribute getProcessSpecificationType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ProcessSpecificationType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProcessSpecificationType#getVersion()
	 * @see #getProcessSpecificationType()
	 * @generated
	 */
	EAttribute getProcessSpecificationType_Version();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.ProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProtocolType
	 * @generated
	 */
	EClass getProtocolType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ProtocolType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProtocolType#getValue()
	 * @see #getProtocolType()
	 * @generated
	 */
	EAttribute getProtocolType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ProtocolType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ProtocolType#getVersion()
	 * @see #getProtocolType()
	 * @generated
	 */
	EAttribute getProtocolType_Version();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType <em>Reliable Messaging Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliable Messaging Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ReliableMessagingType
	 * @generated
	 */
	EClass getReliableMessagingType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getRetries <em>Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retries</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ReliableMessagingType#getRetries()
	 * @see #getReliableMessagingType()
	 * @generated
	 */
	EAttribute getReliableMessagingType_Retries();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getRetryInterval <em>Retry Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Interval</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ReliableMessagingType#getRetryInterval()
	 * @see #getReliableMessagingType()
	 * @generated
	 */
	EAttribute getReliableMessagingType_RetryInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getPersistDuration <em>Persist Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persist Duration</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ReliableMessagingType#getPersistDuration()
	 * @see #getReliableMessagingType()
	 * @generated
	 */
	EAttribute getReliableMessagingType_PersistDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getDeliverySemantics <em>Delivery Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Semantics</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ReliableMessagingType#getDeliverySemantics()
	 * @see #getReliableMessagingType()
	 * @generated
	 */
	EAttribute getReliableMessagingType_DeliverySemantics();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#isIdempotency <em>Idempotency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idempotency</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ReliableMessagingType#isIdempotency()
	 * @see #getReliableMessagingType()
	 * @generated
	 */
	EAttribute getReliableMessagingType_Idempotency();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ReliableMessagingType#getMessageOrderSemantics <em>Message Order Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Order Semantics</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ReliableMessagingType#getMessageOrderSemantics()
	 * @see #getReliableMessagingType()
	 * @generated
	 */
	EAttribute getReliableMessagingType_MessageOrderSemantics();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.RoleType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.ebxml.namespaces.trade.partner.RoleType#getHref()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.RoleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ebxml.namespaces.trade.partner.RoleType#getName()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.RoleType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.RoleType#getType()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Type();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.ServiceBindingType <em>Service Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Binding Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ServiceBindingType
	 * @generated
	 */
	EClass getServiceBindingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.ServiceBindingType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ServiceBindingType#getService()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EReference getServiceBindingType_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.ServiceBindingType#getOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Override</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ServiceBindingType#getOverride()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EReference getServiceBindingType_Override();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ServiceBindingType#getChannelId <em>Channel Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ServiceBindingType#getChannelId()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EAttribute getServiceBindingType_ChannelId();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ServiceBindingType#getPackageId <em>Package Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ServiceBindingType#getPackageId()
	 * @see #getServiceBindingType()
	 * @generated
	 */
	EAttribute getServiceBindingType_PackageId();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ServiceType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ServiceType#getValue()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.ServiceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.ServiceType#getType()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Type();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.SimplePartType <em>Simple Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Part Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.SimplePartType
	 * @generated
	 */
	EClass getSimplePartType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.SimplePartType#getNamespaceSupported <em>Namespace Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespace Supported</em>'.
	 * @see org.ebxml.namespaces.trade.partner.SimplePartType#getNamespaceSupported()
	 * @see #getSimplePartType()
	 * @generated
	 */
	EReference getSimplePartType_NamespaceSupported();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.SimplePartType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.SimplePartType#getId()
	 * @see #getSimplePartType()
	 * @generated
	 */
	EAttribute getSimplePartType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.SimplePartType#getMimeparameters <em>Mimeparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimeparameters</em>'.
	 * @see org.ebxml.namespaces.trade.partner.SimplePartType#getMimeparameters()
	 * @see #getSimplePartType()
	 * @generated
	 */
	EAttribute getSimplePartType_Mimeparameters();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.SimplePartType#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see org.ebxml.namespaces.trade.partner.SimplePartType#getMimetype()
	 * @see #getSimplePartType()
	 * @generated
	 */
	EAttribute getSimplePartType_Mimetype();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.StatusType
	 * @generated
	 */
	EClass getStatusType();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.StatusType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ebxml.namespaces.trade.partner.StatusType#getValue()
	 * @see #getStatusType()
	 * @generated
	 */
	EAttribute getStatusType_Value();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.TransportSecurityType <em>Transport Security Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Security Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.TransportSecurityType
	 * @generated
	 */
	EClass getTransportSecurityType();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.TransportSecurityType#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol</em>'.
	 * @see org.ebxml.namespaces.trade.partner.TransportSecurityType#getProtocol()
	 * @see #getTransportSecurityType()
	 * @generated
	 */
	EReference getTransportSecurityType_Protocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.TransportSecurityType#getCertificateRef <em>Certificate Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificate Ref</em>'.
	 * @see org.ebxml.namespaces.trade.partner.TransportSecurityType#getCertificateRef()
	 * @see #getTransportSecurityType()
	 * @generated
	 */
	EReference getTransportSecurityType_CertificateRef();

	/**
	 * Returns the meta object for class '{@link org.ebxml.namespaces.trade.partner.TransportType <em>Transport Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.TransportType
	 * @generated
	 */
	EClass getTransportType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.TransportType#getSendingProtocol <em>Sending Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sending Protocol</em>'.
	 * @see org.ebxml.namespaces.trade.partner.TransportType#getSendingProtocol()
	 * @see #getTransportType()
	 * @generated
	 */
	EReference getTransportType_SendingProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.TransportType#getReceivingProtocol <em>Receiving Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiving Protocol</em>'.
	 * @see org.ebxml.namespaces.trade.partner.TransportType#getReceivingProtocol()
	 * @see #getTransportType()
	 * @generated
	 */
	EReference getTransportType_ReceivingProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ebxml.namespaces.trade.partner.TransportType#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoint</em>'.
	 * @see org.ebxml.namespaces.trade.partner.TransportType#getEndpoint()
	 * @see #getTransportType()
	 * @generated
	 */
	EReference getTransportType_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.ebxml.namespaces.trade.partner.TransportType#getTransportSecurity <em>Transport Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport Security</em>'.
	 * @see org.ebxml.namespaces.trade.partner.TransportType#getTransportSecurity()
	 * @see #getTransportType()
	 * @generated
	 */
	EReference getTransportType_TransportSecurity();

	/**
	 * Returns the meta object for the attribute '{@link org.ebxml.namespaces.trade.partner.TransportType#getTransportId <em>Transport Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Id</em>'.
	 * @see org.ebxml.namespaces.trade.partner.TransportType#getTransportId()
	 * @see #getTransportType()
	 * @generated
	 */
	EAttribute getTransportType_TransportId();

	/**
	 * Returns the meta object for enum '{@link org.ebxml.namespaces.trade.partner.DsType <em>Ds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ds Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DsType
	 * @generated
	 */
	EEnum getDsType();

	/**
	 * Returns the meta object for enum '{@link org.ebxml.namespaces.trade.partner.EndpointTypeType <em>Endpoint Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endpoint Type Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EndpointTypeType
	 * @generated
	 */
	EEnum getEndpointTypeType();

	/**
	 * Returns the meta object for enum '{@link org.ebxml.namespaces.trade.partner.MosType <em>Mos Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mos Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.MosType
	 * @generated
	 */
	EEnum getMosType();

	/**
	 * Returns the meta object for enum '{@link org.ebxml.namespaces.trade.partner.StatusValueType <em>Status Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Value Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.StatusValueType
	 * @generated
	 */
	EEnum getStatusValueType();

	/**
	 * Returns the meta object for enum '{@link org.ebxml.namespaces.trade.partner.SyncReplyModeType <em>Sync Reply Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sync Reply Mode Type</em>'.
	 * @see org.ebxml.namespaces.trade.partner.SyncReplyModeType
	 * @generated
	 */
	EEnum getSyncReplyModeType();

	/**
	 * Returns the meta object for data type '{@link org.ebxml.namespaces.trade.partner.DsType <em>Ds Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ds Type Object</em>'.
	 * @see org.ebxml.namespaces.trade.partner.DsType
	 * @model instanceClass="org.ebxml.namespaces.trade.partner.DsType"
	 *        extendedMetaData="name='ds.type:Object' baseType='ds.type'"
	 * @generated
	 */
	EDataType getDsTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.ebxml.namespaces.trade.partner.EndpointTypeType <em>Endpoint Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Endpoint Type Type Object</em>'.
	 * @see org.ebxml.namespaces.trade.partner.EndpointTypeType
	 * @model instanceClass="org.ebxml.namespaces.trade.partner.EndpointTypeType"
	 *        extendedMetaData="name='endpointType.type:Object' baseType='endpointType.type'"
	 * @generated
	 */
	EDataType getEndpointTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.ebxml.namespaces.trade.partner.MosType <em>Mos Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mos Type Object</em>'.
	 * @see org.ebxml.namespaces.trade.partner.MosType
	 * @model instanceClass="org.ebxml.namespaces.trade.partner.MosType"
	 *        extendedMetaData="name='mos.type:Object' baseType='mos.type'"
	 * @generated
	 */
	EDataType getMosTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Non Empty String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Empty String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='non-empty-string' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1'"
	 * @generated
	 */
	EDataType getNonEmptyString();

	/**
	 * Returns the meta object for data type '{@link org.ebxml.namespaces.trade.partner.StatusValueType <em>Status Value Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Status Value Type Object</em>'.
	 * @see org.ebxml.namespaces.trade.partner.StatusValueType
	 * @model instanceClass="org.ebxml.namespaces.trade.partner.StatusValueType"
	 *        extendedMetaData="name='statusValue.type:Object' baseType='statusValue.type'"
	 * @generated
	 */
	EDataType getStatusValueTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.ebxml.namespaces.trade.partner.SyncReplyModeType <em>Sync Reply Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sync Reply Mode Type Object</em>'.
	 * @see org.ebxml.namespaces.trade.partner.SyncReplyModeType
	 * @model instanceClass="org.ebxml.namespaces.trade.partner.SyncReplyModeType"
	 *        extendedMetaData="name='syncReplyMode.type:Object' baseType='syncReplyMode.type'"
	 * @generated
	 */
	EDataType getSyncReplyModeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PartnerFactory getPartnerFactory();

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
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.CertificateRefTypeImpl <em>Certificate Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.CertificateRefTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCertificateRefType()
		 * @generated
		 */
		EClass CERTIFICATE_REF_TYPE = eINSTANCE.getCertificateRefType();

		/**
		 * The meta object literal for the '<em><b>Cert Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_REF_TYPE__CERT_ID = eINSTANCE.getCertificateRefType_CertId();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.CertificateTypeImpl <em>Certificate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.CertificateTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCertificateType()
		 * @generated
		 */
		EClass CERTIFICATE_TYPE = eINSTANCE.getCertificateType();

		/**
		 * The meta object literal for the '<em><b>Key Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CERTIFICATE_TYPE__KEY_INFO = eINSTANCE.getCertificateType_KeyInfo();

		/**
		 * The meta object literal for the '<em><b>Cert Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_TYPE__CERT_ID = eINSTANCE.getCertificateType_CertId();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.CharacteristicsTypeImpl <em>Characteristics Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.CharacteristicsTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCharacteristicsType()
		 * @generated
		 */
		EClass CHARACTERISTICS_TYPE = eINSTANCE.getCharacteristicsType();

		/**
		 * The meta object literal for the '<em><b>Authenticated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTICS_TYPE__AUTHENTICATED = eINSTANCE.getCharacteristicsType_Authenticated();

		/**
		 * The meta object literal for the '<em><b>Authorized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTICS_TYPE__AUTHORIZED = eINSTANCE.getCharacteristicsType_Authorized();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTICS_TYPE__CONFIDENTIALITY = eINSTANCE.getCharacteristicsType_Confidentiality();

		/**
		 * The meta object literal for the '<em><b>Nonrepudiation Of Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTICS_TYPE__NONREPUDIATION_OF_ORIGIN = eINSTANCE.getCharacteristicsType_NonrepudiationOfOrigin();

		/**
		 * The meta object literal for the '<em><b>Nonrepudiation Of Receipt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTICS_TYPE__NONREPUDIATION_OF_RECEIPT = eINSTANCE.getCharacteristicsType_NonrepudiationOfReceipt();

		/**
		 * The meta object literal for the '<em><b>Secure Transport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTICS_TYPE__SECURE_TRANSPORT = eINSTANCE.getCharacteristicsType_SecureTransport();

		/**
		 * The meta object literal for the '<em><b>Sync Reply Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTICS_TYPE__SYNC_REPLY_MODE = eINSTANCE.getCharacteristicsType_SyncReplyMode();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl <em>Collaboration Protocol Agreement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolAgreementTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCollaborationProtocolAgreementType()
		 * @generated
		 */
		EClass COLLABORATION_PROTOCOL_AGREEMENT_TYPE = eINSTANCE.getCollaborationProtocolAgreementType();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_PROTOCOL_AGREEMENT_TYPE__STATUS = eINSTANCE.getCollaborationProtocolAgreementType_Status();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_PROTOCOL_AGREEMENT_TYPE__START = eINSTANCE.getCollaborationProtocolAgreementType_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_PROTOCOL_AGREEMENT_TYPE__END = eINSTANCE.getCollaborationProtocolAgreementType_End();

		/**
		 * The meta object literal for the '<em><b>Conversation Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CONVERSATION_CONSTRAINTS = eINSTANCE.getCollaborationProtocolAgreementType_ConversationConstraints();

		/**
		 * The meta object literal for the '<em><b>Party Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PARTY_INFO = eINSTANCE.getCollaborationProtocolAgreementType_PartyInfo();

		/**
		 * The meta object literal for the '<em><b>Packaging</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_PROTOCOL_AGREEMENT_TYPE__PACKAGING = eINSTANCE.getCollaborationProtocolAgreementType_Packaging();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_PROTOCOL_AGREEMENT_TYPE__SIGNATURE = eINSTANCE.getCollaborationProtocolAgreementType_Signature();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_PROTOCOL_AGREEMENT_TYPE__COMMENT = eINSTANCE.getCollaborationProtocolAgreementType_Comment();

		/**
		 * The meta object literal for the '<em><b>Cpaid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_PROTOCOL_AGREEMENT_TYPE__CPAID = eINSTANCE.getCollaborationProtocolAgreementType_Cpaid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_PROTOCOL_AGREEMENT_TYPE__VERSION = eINSTANCE.getCollaborationProtocolAgreementType_Version();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_PROTOCOL_AGREEMENT_TYPE__ANY_ATTRIBUTE = eINSTANCE.getCollaborationProtocolAgreementType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolProfileTypeImpl <em>Collaboration Protocol Profile Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.CollaborationProtocolProfileTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCollaborationProtocolProfileType()
		 * @generated
		 */
		EClass COLLABORATION_PROTOCOL_PROFILE_TYPE = eINSTANCE.getCollaborationProtocolProfileType();

		/**
		 * The meta object literal for the '<em><b>Party Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_PROTOCOL_PROFILE_TYPE__PARTY_INFO = eINSTANCE.getCollaborationProtocolProfileType_PartyInfo();

		/**
		 * The meta object literal for the '<em><b>Packaging</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_PROTOCOL_PROFILE_TYPE__PACKAGING = eINSTANCE.getCollaborationProtocolProfileType_Packaging();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_PROTOCOL_PROFILE_TYPE__SIGNATURE = eINSTANCE.getCollaborationProtocolProfileType_Signature();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_PROTOCOL_PROFILE_TYPE__COMMENT = eINSTANCE.getCollaborationProtocolProfileType_Comment();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_PROTOCOL_PROFILE_TYPE__VERSION = eINSTANCE.getCollaborationProtocolProfileType_Version();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_PROTOCOL_PROFILE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getCollaborationProtocolProfileType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.CollaborationRoleTypeImpl <em>Collaboration Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.CollaborationRoleTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCollaborationRoleType()
		 * @generated
		 */
		EClass COLLABORATION_ROLE_TYPE = eINSTANCE.getCollaborationRoleType();

		/**
		 * The meta object literal for the '<em><b>Process Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_ROLE_TYPE__PROCESS_SPECIFICATION = eINSTANCE.getCollaborationRoleType_ProcessSpecification();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_ROLE_TYPE__ROLE = eINSTANCE.getCollaborationRoleType_Role();

		/**
		 * The meta object literal for the '<em><b>Certificate Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_ROLE_TYPE__CERTIFICATE_REF = eINSTANCE.getCollaborationRoleType_CertificateRef();

		/**
		 * The meta object literal for the '<em><b>Service Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION_ROLE_TYPE__SERVICE_BINDING = eINSTANCE.getCollaborationRoleType_ServiceBinding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_ROLE_TYPE__ID = eINSTANCE.getCollaborationRoleType_Id();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.CommentTypeImpl <em>Comment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.CommentTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCommentType()
		 * @generated
		 */
		EClass COMMENT_TYPE = eINSTANCE.getCommentType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_TYPE__VALUE = eINSTANCE.getCommentType_Value();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_TYPE__LANG = eINSTANCE.getCommentType_Lang();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.CompositeListTypeImpl <em>Composite List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.CompositeListTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCompositeListType()
		 * @generated
		 */
		EClass COMPOSITE_LIST_TYPE = eINSTANCE.getCompositeListType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_LIST_TYPE__GROUP = eINSTANCE.getCompositeListType_Group();

		/**
		 * The meta object literal for the '<em><b>Encapsulation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_LIST_TYPE__ENCAPSULATION = eINSTANCE.getCompositeListType_Encapsulation();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_LIST_TYPE__COMPOSITE = eINSTANCE.getCompositeListType_Composite();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.CompositeTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getCompositeType()
		 * @generated
		 */
		EClass COMPOSITE_TYPE = eINSTANCE.getCompositeType();

		/**
		 * The meta object literal for the '<em><b>Constituent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__CONSTITUENT = eINSTANCE.getCompositeType_Constituent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_TYPE__ID = eINSTANCE.getCompositeType_Id();

		/**
		 * The meta object literal for the '<em><b>Mimeparameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_TYPE__MIMEPARAMETERS = eINSTANCE.getCompositeType_Mimeparameters();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_TYPE__MIMETYPE = eINSTANCE.getCompositeType_Mimetype();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.ConstituentTypeImpl <em>Constituent Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.ConstituentTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getConstituentType()
		 * @generated
		 */
		EClass CONSTITUENT_TYPE = eINSTANCE.getConstituentType();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTITUENT_TYPE__IDREF = eINSTANCE.getConstituentType_Idref();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.ConversationConstraintsTypeImpl <em>Conversation Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.ConversationConstraintsTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getConversationConstraintsType()
		 * @generated
		 */
		EClass CONVERSATION_CONSTRAINTS_TYPE = eINSTANCE.getConversationConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Concurrent Conversations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSATION_CONSTRAINTS_TYPE__CONCURRENT_CONVERSATIONS = eINSTANCE.getConversationConstraintsType_ConcurrentConversations();

		/**
		 * The meta object literal for the '<em><b>Invocation Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSATION_CONSTRAINTS_TYPE__INVOCATION_LIMIT = eINSTANCE.getConversationConstraintsType_InvocationLimit();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.DeliveryChannelTypeImpl <em>Delivery Channel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.DeliveryChannelTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDeliveryChannelType()
		 * @generated
		 */
		EClass DELIVERY_CHANNEL_TYPE = eINSTANCE.getDeliveryChannelType();

		/**
		 * The meta object literal for the '<em><b>Characteristics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY_CHANNEL_TYPE__CHARACTERISTICS = eINSTANCE.getDeliveryChannelType_Characteristics();

		/**
		 * The meta object literal for the '<em><b>Channel Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_CHANNEL_TYPE__CHANNEL_ID = eINSTANCE.getDeliveryChannelType_ChannelId();

		/**
		 * The meta object literal for the '<em><b>Doc Exchange Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_CHANNEL_TYPE__DOC_EXCHANGE_ID = eINSTANCE.getDeliveryChannelType_DocExchangeId();

		/**
		 * The meta object literal for the '<em><b>Transport Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_CHANNEL_TYPE__TRANSPORT_ID = eINSTANCE.getDeliveryChannelType_TransportId();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.DigitalEnvelopeTypeImpl <em>Digital Envelope Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.DigitalEnvelopeTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDigitalEnvelopeType()
		 * @generated
		 */
		EClass DIGITAL_ENVELOPE_TYPE = eINSTANCE.getDigitalEnvelopeType();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_ENVELOPE_TYPE__PROTOCOL = eINSTANCE.getDigitalEnvelopeType_Protocol();

		/**
		 * The meta object literal for the '<em><b>Encryption Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_ENVELOPE_TYPE__ENCRYPTION_ALGORITHM = eINSTANCE.getDigitalEnvelopeType_EncryptionAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Certificate Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_ENVELOPE_TYPE__CERTIFICATE_REF = eINSTANCE.getDigitalEnvelopeType_CertificateRef();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.DocExchangeTypeImpl <em>Doc Exchange Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.DocExchangeTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDocExchangeType()
		 * @generated
		 */
		EClass DOC_EXCHANGE_TYPE = eINSTANCE.getDocExchangeType();

		/**
		 * The meta object literal for the '<em><b>Eb XML Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_EXCHANGE_TYPE__EB_XML_BINDING = eINSTANCE.getDocExchangeType_EbXMLBinding();

		/**
		 * The meta object literal for the '<em><b>Doc Exchange Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC_EXCHANGE_TYPE__DOC_EXCHANGE_ID = eINSTANCE.getDocExchangeType_DocExchangeId();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Certificate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CERTIFICATE = eINSTANCE.getDocumentRoot_Certificate();

		/**
		 * The meta object literal for the '<em><b>Certificate Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CERTIFICATE_REF = eINSTANCE.getDocumentRoot_CertificateRef();

		/**
		 * The meta object literal for the '<em><b>Characteristics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHARACTERISTICS = eINSTANCE.getDocumentRoot_Characteristics();

		/**
		 * The meta object literal for the '<em><b>Collaboration Protocol Agreement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLLABORATION_PROTOCOL_AGREEMENT = eINSTANCE.getDocumentRoot_CollaborationProtocolAgreement();

		/**
		 * The meta object literal for the '<em><b>Collaboration Protocol Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLLABORATION_PROTOCOL_PROFILE = eINSTANCE.getDocumentRoot_CollaborationProtocolProfile();

		/**
		 * The meta object literal for the '<em><b>Collaboration Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLLABORATION_ROLE = eINSTANCE.getDocumentRoot_CollaborationRole();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMMENT = eINSTANCE.getDocumentRoot_Comment();

		/**
		 * The meta object literal for the '<em><b>Constituent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONSTITUENT = eINSTANCE.getDocumentRoot_Constituent();

		/**
		 * The meta object literal for the '<em><b>Conversation Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONVERSATION_CONSTRAINTS = eINSTANCE.getDocumentRoot_ConversationConstraints();

		/**
		 * The meta object literal for the '<em><b>Delivery Channel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELIVERY_CHANNEL = eINSTANCE.getDocumentRoot_DeliveryChannel();

		/**
		 * The meta object literal for the '<em><b>Digital Envelope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIGITAL_ENVELOPE = eINSTANCE.getDocumentRoot_DigitalEnvelope();

		/**
		 * The meta object literal for the '<em><b>Doc Exchange</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOC_EXCHANGE = eINSTANCE.getDocumentRoot_DocExchange();

		/**
		 * The meta object literal for the '<em><b>Eb XML Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EB_XML_BINDING = eINSTANCE.getDocumentRoot_EbXMLBinding();

		/**
		 * The meta object literal for the '<em><b>Encryption Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ENCRYPTION_ALGORITHM = eINSTANCE.getDocumentRoot_EncryptionAlgorithm();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__END = eINSTANCE.getDocumentRoot_End();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENDPOINT = eINSTANCE.getDocumentRoot_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Hash Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HASH_FUNCTION = eINSTANCE.getDocumentRoot_HashFunction();

		/**
		 * The meta object literal for the '<em><b>Namespace Supported</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NAMESPACE_SUPPORTED = eINSTANCE.getDocumentRoot_NamespaceSupported();

		/**
		 * The meta object literal for the '<em><b>Non Repudiation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NON_REPUDIATION = eINSTANCE.getDocumentRoot_NonRepudiation();

		/**
		 * The meta object literal for the '<em><b>Override</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OVERRIDE = eINSTANCE.getDocumentRoot_Override();

		/**
		 * The meta object literal for the '<em><b>Packaging</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PACKAGING = eINSTANCE.getDocumentRoot_Packaging();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARTY_ID = eINSTANCE.getDocumentRoot_PartyId();

		/**
		 * The meta object literal for the '<em><b>Party Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARTY_INFO = eINSTANCE.getDocumentRoot_PartyInfo();

		/**
		 * The meta object literal for the '<em><b>Party Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARTY_REF = eINSTANCE.getDocumentRoot_PartyRef();

		/**
		 * The meta object literal for the '<em><b>Process Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROCESS_SPECIFICATION = eINSTANCE.getDocumentRoot_ProcessSpecification();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROTOCOL = eINSTANCE.getDocumentRoot_Protocol();

		/**
		 * The meta object literal for the '<em><b>Receiving Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RECEIVING_PROTOCOL = eINSTANCE.getDocumentRoot_ReceivingProtocol();

		/**
		 * The meta object literal for the '<em><b>Reliable Messaging</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELIABLE_MESSAGING = eINSTANCE.getDocumentRoot_ReliableMessaging();

		/**
		 * The meta object literal for the '<em><b>Retries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RETRIES = eINSTANCE.getDocumentRoot_Retries();

		/**
		 * The meta object literal for the '<em><b>Retry Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RETRY_INTERVAL = eINSTANCE.getDocumentRoot_RetryInterval();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROLE = eINSTANCE.getDocumentRoot_Role();

		/**
		 * The meta object literal for the '<em><b>Sending Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SENDING_PROTOCOL = eINSTANCE.getDocumentRoot_SendingProtocol();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE = eINSTANCE.getDocumentRoot_Service();

		/**
		 * The meta object literal for the '<em><b>Service Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE_BINDING = eINSTANCE.getDocumentRoot_ServiceBinding();

		/**
		 * The meta object literal for the '<em><b>Signature Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SIGNATURE_ALGORITHM = eINSTANCE.getDocumentRoot_SignatureAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__START = eINSTANCE.getDocumentRoot_Start();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STATUS = eINSTANCE.getDocumentRoot_Status();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSPORT = eINSTANCE.getDocumentRoot_Transport();

		/**
		 * The meta object literal for the '<em><b>Transport Security</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSPORT_SECURITY = eINSTANCE.getDocumentRoot_TransportSecurity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_Id();

		/**
		 * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IDREF = eINSTANCE.getDocumentRoot_Idref();

		/**
		 * The meta object literal for the '<em><b>Sync Reply Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SYNC_REPLY_MODE = eINSTANCE.getDocumentRoot_SyncReplyMode();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VERSION = eINSTANCE.getDocumentRoot_Version();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.EbXMLBindingTypeImpl <em>Eb XML Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.EbXMLBindingTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getEbXMLBindingType()
		 * @generated
		 */
		EClass EB_XML_BINDING_TYPE = eINSTANCE.getEbXMLBindingType();

		/**
		 * The meta object literal for the '<em><b>Reliable Messaging</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EB_XML_BINDING_TYPE__RELIABLE_MESSAGING = eINSTANCE.getEbXMLBindingType_ReliableMessaging();

		/**
		 * The meta object literal for the '<em><b>Non Repudiation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EB_XML_BINDING_TYPE__NON_REPUDIATION = eINSTANCE.getEbXMLBindingType_NonRepudiation();

		/**
		 * The meta object literal for the '<em><b>Digital Envelope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EB_XML_BINDING_TYPE__DIGITAL_ENVELOPE = eINSTANCE.getEbXMLBindingType_DigitalEnvelope();

		/**
		 * The meta object literal for the '<em><b>Namespace Supported</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EB_XML_BINDING_TYPE__NAMESPACE_SUPPORTED = eINSTANCE.getEbXMLBindingType_NamespaceSupported();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EB_XML_BINDING_TYPE__VERSION = eINSTANCE.getEbXMLBindingType_Version();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.EncapsulationTypeImpl <em>Encapsulation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.EncapsulationTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getEncapsulationType()
		 * @generated
		 */
		EClass ENCAPSULATION_TYPE = eINSTANCE.getEncapsulationType();

		/**
		 * The meta object literal for the '<em><b>Constituent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCAPSULATION_TYPE__CONSTITUENT = eINSTANCE.getEncapsulationType_Constituent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATION_TYPE__ID = eINSTANCE.getEncapsulationType_Id();

		/**
		 * The meta object literal for the '<em><b>Mimeparameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATION_TYPE__MIMEPARAMETERS = eINSTANCE.getEncapsulationType_Mimeparameters();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCAPSULATION_TYPE__MIMETYPE = eINSTANCE.getEncapsulationType_Mimetype();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.EndpointTypeImpl <em>Endpoint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.EndpointTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getEndpointType()
		 * @generated
		 */
		EClass ENDPOINT_TYPE = eINSTANCE.getEndpointType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_TYPE__TYPE = eINSTANCE.getEndpointType_Type();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_TYPE__URI = eINSTANCE.getEndpointType_Uri();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.NamespaceSupportedTypeImpl <em>Namespace Supported Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.NamespaceSupportedTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getNamespaceSupportedType()
		 * @generated
		 */
		EClass NAMESPACE_SUPPORTED_TYPE = eINSTANCE.getNamespaceSupportedType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_SUPPORTED_TYPE__VALUE = eINSTANCE.getNamespaceSupportedType_Value();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_SUPPORTED_TYPE__LOCATION = eINSTANCE.getNamespaceSupportedType_Location();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_SUPPORTED_TYPE__VERSION = eINSTANCE.getNamespaceSupportedType_Version();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.NonRepudiationTypeImpl <em>Non Repudiation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.NonRepudiationTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getNonRepudiationType()
		 * @generated
		 */
		EClass NON_REPUDIATION_TYPE = eINSTANCE.getNonRepudiationType();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_REPUDIATION_TYPE__PROTOCOL = eINSTANCE.getNonRepudiationType_Protocol();

		/**
		 * The meta object literal for the '<em><b>Hash Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_REPUDIATION_TYPE__HASH_FUNCTION = eINSTANCE.getNonRepudiationType_HashFunction();

		/**
		 * The meta object literal for the '<em><b>Signature Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_REPUDIATION_TYPE__SIGNATURE_ALGORITHM = eINSTANCE.getNonRepudiationType_SignatureAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Certificate Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_REPUDIATION_TYPE__CERTIFICATE_REF = eINSTANCE.getNonRepudiationType_CertificateRef();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.OverrideTypeImpl <em>Override Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.OverrideTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getOverrideType()
		 * @generated
		 */
		EClass OVERRIDE_TYPE = eINSTANCE.getOverrideType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERRIDE_TYPE__ACTION = eINSTANCE.getOverrideType_Action();

		/**
		 * The meta object literal for the '<em><b>Channel Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERRIDE_TYPE__CHANNEL_ID = eINSTANCE.getOverrideType_ChannelId();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERRIDE_TYPE__HREF = eINSTANCE.getOverrideType_Href();

		/**
		 * The meta object literal for the '<em><b>Package Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERRIDE_TYPE__PACKAGE_ID = eINSTANCE.getOverrideType_PackageId();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERRIDE_TYPE__TYPE = eINSTANCE.getOverrideType_Type();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.PackagingTypeImpl <em>Packaging Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.PackagingTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getPackagingType()
		 * @generated
		 */
		EClass PACKAGING_TYPE = eINSTANCE.getPackagingType();

		/**
		 * The meta object literal for the '<em><b>Processing Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGING_TYPE__PROCESSING_CAPABILITIES = eINSTANCE.getPackagingType_ProcessingCapabilities();

		/**
		 * The meta object literal for the '<em><b>Simple Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGING_TYPE__SIMPLE_PART = eINSTANCE.getPackagingType_SimplePart();

		/**
		 * The meta object literal for the '<em><b>Composite List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGING_TYPE__COMPOSITE_LIST = eINSTANCE.getPackagingType_CompositeList();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGING_TYPE__ID = eINSTANCE.getPackagingType_Id();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.PartyIdTypeImpl <em>Party Id Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.PartyIdTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getPartyIdType()
		 * @generated
		 */
		EClass PARTY_ID_TYPE = eINSTANCE.getPartyIdType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ID_TYPE__VALUE = eINSTANCE.getPartyIdType_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ID_TYPE__TYPE = eINSTANCE.getPartyIdType_Type();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.PartyInfoTypeImpl <em>Party Info Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.PartyInfoTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getPartyInfoType()
		 * @generated
		 */
		EClass PARTY_INFO_TYPE = eINSTANCE.getPartyInfoType();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INFO_TYPE__PARTY_ID = eINSTANCE.getPartyInfoType_PartyId();

		/**
		 * The meta object literal for the '<em><b>Party Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INFO_TYPE__PARTY_REF = eINSTANCE.getPartyInfoType_PartyRef();

		/**
		 * The meta object literal for the '<em><b>Collaboration Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INFO_TYPE__COLLABORATION_ROLE = eINSTANCE.getPartyInfoType_CollaborationRole();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INFO_TYPE__CERTIFICATE = eINSTANCE.getPartyInfoType_Certificate();

		/**
		 * The meta object literal for the '<em><b>Delivery Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INFO_TYPE__DELIVERY_CHANNEL = eINSTANCE.getPartyInfoType_DeliveryChannel();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INFO_TYPE__TRANSPORT = eINSTANCE.getPartyInfoType_Transport();

		/**
		 * The meta object literal for the '<em><b>Doc Exchange</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INFO_TYPE__DOC_EXCHANGE = eINSTANCE.getPartyInfoType_DocExchange();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.PartyRefTypeImpl <em>Party Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.PartyRefTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getPartyRefType()
		 * @generated
		 */
		EClass PARTY_REF_TYPE = eINSTANCE.getPartyRefType();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_REF_TYPE__HREF = eINSTANCE.getPartyRefType_Href();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_REF_TYPE__TYPE = eINSTANCE.getPartyRefType_Type();

		/**
		 * The meta object literal for the '<em><b>Type1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_REF_TYPE__TYPE1 = eINSTANCE.getPartyRefType_Type1();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.ProcessingCapabilitiesTypeImpl <em>Processing Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.ProcessingCapabilitiesTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getProcessingCapabilitiesType()
		 * @generated
		 */
		EClass PROCESSING_CAPABILITIES_TYPE = eINSTANCE.getProcessingCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_CAPABILITIES_TYPE__GENERATE = eINSTANCE.getProcessingCapabilitiesType_Generate();

		/**
		 * The meta object literal for the '<em><b>Parse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_CAPABILITIES_TYPE__PARSE = eINSTANCE.getProcessingCapabilitiesType_Parse();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.ProcessSpecificationTypeImpl <em>Process Specification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.ProcessSpecificationTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getProcessSpecificationType()
		 * @generated
		 */
		EClass PROCESS_SPECIFICATION_TYPE = eINSTANCE.getProcessSpecificationType();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_SPECIFICATION_TYPE__REFERENCE = eINSTANCE.getProcessSpecificationType_Reference();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_SPECIFICATION_TYPE__HREF = eINSTANCE.getProcessSpecificationType_Href();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_SPECIFICATION_TYPE__NAME = eINSTANCE.getProcessSpecificationType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_SPECIFICATION_TYPE__TYPE = eINSTANCE.getProcessSpecificationType_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_SPECIFICATION_TYPE__VERSION = eINSTANCE.getProcessSpecificationType_Version();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.ProtocolTypeImpl <em>Protocol Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.ProtocolTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getProtocolType()
		 * @generated
		 */
		EClass PROTOCOL_TYPE = eINSTANCE.getProtocolType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_TYPE__VALUE = eINSTANCE.getProtocolType_Value();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_TYPE__VERSION = eINSTANCE.getProtocolType_Version();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.ReliableMessagingTypeImpl <em>Reliable Messaging Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.ReliableMessagingTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getReliableMessagingType()
		 * @generated
		 */
		EClass RELIABLE_MESSAGING_TYPE = eINSTANCE.getReliableMessagingType();

		/**
		 * The meta object literal for the '<em><b>Retries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABLE_MESSAGING_TYPE__RETRIES = eINSTANCE.getReliableMessagingType_Retries();

		/**
		 * The meta object literal for the '<em><b>Retry Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABLE_MESSAGING_TYPE__RETRY_INTERVAL = eINSTANCE.getReliableMessagingType_RetryInterval();

		/**
		 * The meta object literal for the '<em><b>Persist Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABLE_MESSAGING_TYPE__PERSIST_DURATION = eINSTANCE.getReliableMessagingType_PersistDuration();

		/**
		 * The meta object literal for the '<em><b>Delivery Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABLE_MESSAGING_TYPE__DELIVERY_SEMANTICS = eINSTANCE.getReliableMessagingType_DeliverySemantics();

		/**
		 * The meta object literal for the '<em><b>Idempotency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABLE_MESSAGING_TYPE__IDEMPOTENCY = eINSTANCE.getReliableMessagingType_Idempotency();

		/**
		 * The meta object literal for the '<em><b>Message Order Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABLE_MESSAGING_TYPE__MESSAGE_ORDER_SEMANTICS = eINSTANCE.getReliableMessagingType_MessageOrderSemantics();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.RoleTypeImpl <em>Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.RoleTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getRoleType()
		 * @generated
		 */
		EClass ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__HREF = eINSTANCE.getRoleType_Href();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__NAME = eINSTANCE.getRoleType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__TYPE = eINSTANCE.getRoleType_Type();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.ServiceBindingTypeImpl <em>Service Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.ServiceBindingTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getServiceBindingType()
		 * @generated
		 */
		EClass SERVICE_BINDING_TYPE = eINSTANCE.getServiceBindingType();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BINDING_TYPE__SERVICE = eINSTANCE.getServiceBindingType_Service();

		/**
		 * The meta object literal for the '<em><b>Override</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BINDING_TYPE__OVERRIDE = eINSTANCE.getServiceBindingType_Override();

		/**
		 * The meta object literal for the '<em><b>Channel Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BINDING_TYPE__CHANNEL_ID = eINSTANCE.getServiceBindingType_ChannelId();

		/**
		 * The meta object literal for the '<em><b>Package Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BINDING_TYPE__PACKAGE_ID = eINSTANCE.getServiceBindingType_PackageId();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.ServiceTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__VALUE = eINSTANCE.getServiceType_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__TYPE = eINSTANCE.getServiceType_Type();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.SimplePartTypeImpl <em>Simple Part Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.SimplePartTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getSimplePartType()
		 * @generated
		 */
		EClass SIMPLE_PART_TYPE = eINSTANCE.getSimplePartType();

		/**
		 * The meta object literal for the '<em><b>Namespace Supported</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PART_TYPE__NAMESPACE_SUPPORTED = eINSTANCE.getSimplePartType_NamespaceSupported();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PART_TYPE__ID = eINSTANCE.getSimplePartType_Id();

		/**
		 * The meta object literal for the '<em><b>Mimeparameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PART_TYPE__MIMEPARAMETERS = eINSTANCE.getSimplePartType_Mimeparameters();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PART_TYPE__MIMETYPE = eINSTANCE.getSimplePartType_Mimetype();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.StatusTypeImpl <em>Status Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.StatusTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getStatusType()
		 * @generated
		 */
		EClass STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_TYPE__VALUE = eINSTANCE.getStatusType_Value();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.TransportSecurityTypeImpl <em>Transport Security Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.TransportSecurityTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getTransportSecurityType()
		 * @generated
		 */
		EClass TRANSPORT_SECURITY_TYPE = eINSTANCE.getTransportSecurityType();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_SECURITY_TYPE__PROTOCOL = eINSTANCE.getTransportSecurityType_Protocol();

		/**
		 * The meta object literal for the '<em><b>Certificate Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_SECURITY_TYPE__CERTIFICATE_REF = eINSTANCE.getTransportSecurityType_CertificateRef();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.impl.TransportTypeImpl <em>Transport Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.impl.TransportTypeImpl
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getTransportType()
		 * @generated
		 */
		EClass TRANSPORT_TYPE = eINSTANCE.getTransportType();

		/**
		 * The meta object literal for the '<em><b>Sending Protocol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_TYPE__SENDING_PROTOCOL = eINSTANCE.getTransportType_SendingProtocol();

		/**
		 * The meta object literal for the '<em><b>Receiving Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_TYPE__RECEIVING_PROTOCOL = eINSTANCE.getTransportType_ReceivingProtocol();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_TYPE__ENDPOINT = eINSTANCE.getTransportType_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Transport Security</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_TYPE__TRANSPORT_SECURITY = eINSTANCE.getTransportType_TransportSecurity();

		/**
		 * The meta object literal for the '<em><b>Transport Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_TYPE__TRANSPORT_ID = eINSTANCE.getTransportType_TransportId();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.DsType <em>Ds Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.DsType
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDsType()
		 * @generated
		 */
		EEnum DS_TYPE = eINSTANCE.getDsType();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.EndpointTypeType <em>Endpoint Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.EndpointTypeType
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getEndpointTypeType()
		 * @generated
		 */
		EEnum ENDPOINT_TYPE_TYPE = eINSTANCE.getEndpointTypeType();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.MosType <em>Mos Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.MosType
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getMosType()
		 * @generated
		 */
		EEnum MOS_TYPE = eINSTANCE.getMosType();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.StatusValueType <em>Status Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.StatusValueType
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getStatusValueType()
		 * @generated
		 */
		EEnum STATUS_VALUE_TYPE = eINSTANCE.getStatusValueType();

		/**
		 * The meta object literal for the '{@link org.ebxml.namespaces.trade.partner.SyncReplyModeType <em>Sync Reply Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.SyncReplyModeType
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getSyncReplyModeType()
		 * @generated
		 */
		EEnum SYNC_REPLY_MODE_TYPE = eINSTANCE.getSyncReplyModeType();

		/**
		 * The meta object literal for the '<em>Ds Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.DsType
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getDsTypeObject()
		 * @generated
		 */
		EDataType DS_TYPE_OBJECT = eINSTANCE.getDsTypeObject();

		/**
		 * The meta object literal for the '<em>Endpoint Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.EndpointTypeType
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getEndpointTypeTypeObject()
		 * @generated
		 */
		EDataType ENDPOINT_TYPE_TYPE_OBJECT = eINSTANCE.getEndpointTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Mos Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.MosType
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getMosTypeObject()
		 * @generated
		 */
		EDataType MOS_TYPE_OBJECT = eINSTANCE.getMosTypeObject();

		/**
		 * The meta object literal for the '<em>Non Empty String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getNonEmptyString()
		 * @generated
		 */
		EDataType NON_EMPTY_STRING = eINSTANCE.getNonEmptyString();

		/**
		 * The meta object literal for the '<em>Status Value Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.StatusValueType
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getStatusValueTypeObject()
		 * @generated
		 */
		EDataType STATUS_VALUE_TYPE_OBJECT = eINSTANCE.getStatusValueTypeObject();

		/**
		 * The meta object literal for the '<em>Sync Reply Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ebxml.namespaces.trade.partner.SyncReplyModeType
		 * @see org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl#getSyncReplyModeTypeObject()
		 * @generated
		 */
		EDataType SYNC_REPLY_MODE_TYPE_OBJECT = eINSTANCE.getSyncReplyModeTypeObject();

	}

} //PartnerPackage
