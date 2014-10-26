/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.ebxml.namespaces.trade.partner.CertificateRefType;
import org.ebxml.namespaces.trade.partner.CertificateType;
import org.ebxml.namespaces.trade.partner.CharacteristicsType;
import org.ebxml.namespaces.trade.partner.CollaborationProtocolAgreementType;
import org.ebxml.namespaces.trade.partner.CollaborationProtocolProfileType;
import org.ebxml.namespaces.trade.partner.CollaborationRoleType;
import org.ebxml.namespaces.trade.partner.CommentType;
import org.ebxml.namespaces.trade.partner.ConstituentType;
import org.ebxml.namespaces.trade.partner.ConversationConstraintsType;
import org.ebxml.namespaces.trade.partner.DeliveryChannelType;
import org.ebxml.namespaces.trade.partner.DigitalEnvelopeType;
import org.ebxml.namespaces.trade.partner.DocExchangeType;
import org.ebxml.namespaces.trade.partner.DocumentRoot;
import org.ebxml.namespaces.trade.partner.EbXMLBindingType;
import org.ebxml.namespaces.trade.partner.EndpointType;
import org.ebxml.namespaces.trade.partner.NamespaceSupportedType;
import org.ebxml.namespaces.trade.partner.NonRepudiationType;
import org.ebxml.namespaces.trade.partner.OverrideType;
import org.ebxml.namespaces.trade.partner.PackagingType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.PartyIdType;
import org.ebxml.namespaces.trade.partner.PartyInfoType;
import org.ebxml.namespaces.trade.partner.PartyRefType;
import org.ebxml.namespaces.trade.partner.ProcessSpecificationType;
import org.ebxml.namespaces.trade.partner.ProtocolType;
import org.ebxml.namespaces.trade.partner.ReliableMessagingType;
import org.ebxml.namespaces.trade.partner.RoleType;
import org.ebxml.namespaces.trade.partner.ServiceBindingType;
import org.ebxml.namespaces.trade.partner.ServiceType;
import org.ebxml.namespaces.trade.partner.StatusType;
import org.ebxml.namespaces.trade.partner.SyncReplyModeType;
import org.ebxml.namespaces.trade.partner.TransportSecurityType;
import org.ebxml.namespaces.trade.partner.TransportType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getCertificateRef <em>Certificate Ref</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getCollaborationProtocolAgreement <em>Collaboration Protocol Agreement</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getCollaborationProtocolProfile <em>Collaboration Protocol Profile</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getCollaborationRole <em>Collaboration Role</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getConstituent <em>Constituent</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getConversationConstraints <em>Conversation Constraints</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getDeliveryChannel <em>Delivery Channel</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getDigitalEnvelope <em>Digital Envelope</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getDocExchange <em>Doc Exchange</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getEbXMLBinding <em>Eb XML Binding</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getEncryptionAlgorithm <em>Encryption Algorithm</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getHashFunction <em>Hash Function</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getNamespaceSupported <em>Namespace Supported</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getNonRepudiation <em>Non Repudiation</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getOverride <em>Override</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getPackaging <em>Packaging</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getPartyInfo <em>Party Info</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getPartyRef <em>Party Ref</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getProcessSpecification <em>Process Specification</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getReceivingProtocol <em>Receiving Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getReliableMessaging <em>Reliable Messaging</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getRetries <em>Retries</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getSendingProtocol <em>Sending Protocol</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getServiceBinding <em>Service Binding</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getTransportSecurity <em>Transport Security</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getIdref <em>Idref</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getSyncReplyMode <em>Sync Reply Mode</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocumentRootImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getEncryptionAlgorithm() <em>Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTION_ALGORITHM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHashFunction() <em>Hash Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_FUNCTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRetries() <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries()
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String RETRY_INTERVAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_ALGORITHM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdref() <em>Idref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdref()
	 * @generated
	 * @ordered
	 */
	protected static final String IDREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdref() <em>Idref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdref()
	 * @generated
	 * @ordered
	 */
	protected String idref = IDREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyncReplyMode() <em>Sync Reply Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncReplyMode()
	 * @generated
	 * @ordered
	 */
	protected static final SyncReplyModeType SYNC_REPLY_MODE_EDEFAULT = SyncReplyModeType.RESPONSE_ONLY;

	/**
	 * The cached value of the '{@link #getSyncReplyMode() <em>Sync Reply Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncReplyMode()
	 * @generated
	 * @ordered
	 */
	protected SyncReplyModeType syncReplyMode = SYNC_REPLY_MODE_EDEFAULT;

	/**
	 * This is true if the Sync Reply Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean syncReplyModeESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, PartnerPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PartnerPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, PartnerPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateType getCertificate() {
		return (CertificateType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__CERTIFICATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertificate(CertificateType newCertificate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__CERTIFICATE, newCertificate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificate(CertificateType newCertificate) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__CERTIFICATE, newCertificate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateRefType getCertificateRef() {
		return (CertificateRefType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__CERTIFICATE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertificateRef(CertificateRefType newCertificateRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__CERTIFICATE_REF, newCertificateRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateRef(CertificateRefType newCertificateRef) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__CERTIFICATE_REF, newCertificateRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicsType getCharacteristics() {
		return (CharacteristicsType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacteristics(CharacteristicsType newCharacteristics, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__CHARACTERISTICS, newCharacteristics, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristics(CharacteristicsType newCharacteristics) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__CHARACTERISTICS, newCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationProtocolAgreementType getCollaborationProtocolAgreement() {
		return (CollaborationProtocolAgreementType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_AGREEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollaborationProtocolAgreement(CollaborationProtocolAgreementType newCollaborationProtocolAgreement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_AGREEMENT, newCollaborationProtocolAgreement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollaborationProtocolAgreement(CollaborationProtocolAgreementType newCollaborationProtocolAgreement) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_AGREEMENT, newCollaborationProtocolAgreement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationProtocolProfileType getCollaborationProtocolProfile() {
		return (CollaborationProtocolProfileType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_PROFILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollaborationProtocolProfile(CollaborationProtocolProfileType newCollaborationProtocolProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_PROFILE, newCollaborationProtocolProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollaborationProtocolProfile(CollaborationProtocolProfileType newCollaborationProtocolProfile) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_PROFILE, newCollaborationProtocolProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationRoleType getCollaborationRole() {
		return (CollaborationRoleType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__COLLABORATION_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollaborationRole(CollaborationRoleType newCollaborationRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__COLLABORATION_ROLE, newCollaborationRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollaborationRole(CollaborationRoleType newCollaborationRole) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__COLLABORATION_ROLE, newCollaborationRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentType getComment() {
		return (CommentType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(CommentType newComment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__COMMENT, newComment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(CommentType newComment) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstituentType getConstituent() {
		return (ConstituentType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__CONSTITUENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstituent(ConstituentType newConstituent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__CONSTITUENT, newConstituent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstituent(ConstituentType newConstituent) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__CONSTITUENT, newConstituent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationConstraintsType getConversationConstraints() {
		return (ConversationConstraintsType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__CONVERSATION_CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversationConstraints(ConversationConstraintsType newConversationConstraints, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__CONVERSATION_CONSTRAINTS, newConversationConstraints, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversationConstraints(ConversationConstraintsType newConversationConstraints) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__CONVERSATION_CONSTRAINTS, newConversationConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryChannelType getDeliveryChannel() {
		return (DeliveryChannelType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__DELIVERY_CHANNEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeliveryChannel(DeliveryChannelType newDeliveryChannel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__DELIVERY_CHANNEL, newDeliveryChannel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryChannel(DeliveryChannelType newDeliveryChannel) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__DELIVERY_CHANNEL, newDeliveryChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalEnvelopeType getDigitalEnvelope() {
		return (DigitalEnvelopeType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__DIGITAL_ENVELOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDigitalEnvelope(DigitalEnvelopeType newDigitalEnvelope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__DIGITAL_ENVELOPE, newDigitalEnvelope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigitalEnvelope(DigitalEnvelopeType newDigitalEnvelope) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__DIGITAL_ENVELOPE, newDigitalEnvelope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocExchangeType getDocExchange() {
		return (DocExchangeType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__DOC_EXCHANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocExchange(DocExchangeType newDocExchange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__DOC_EXCHANGE, newDocExchange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocExchange(DocExchangeType newDocExchange) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__DOC_EXCHANGE, newDocExchange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EbXMLBindingType getEbXMLBinding() {
		return (EbXMLBindingType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__EB_XML_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEbXMLBinding(EbXMLBindingType newEbXMLBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__EB_XML_BINDING, newEbXMLBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEbXMLBinding(EbXMLBindingType newEbXMLBinding) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__EB_XML_BINDING, newEbXMLBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncryptionAlgorithm() {
		return (String)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptionAlgorithm(String newEncryptionAlgorithm) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM, newEncryptionAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEnd() {
		return (XMLGregorianCalendar)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(XMLGregorianCalendar newEnd) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointType getEndpoint() {
		return (EndpointType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__ENDPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(EndpointType newEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__ENDPOINT, newEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(EndpointType newEndpoint) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__ENDPOINT, newEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHashFunction() {
		return (String)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__HASH_FUNCTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashFunction(String newHashFunction) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__HASH_FUNCTION, newHashFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceSupportedType getNamespaceSupported() {
		return (NamespaceSupportedType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__NAMESPACE_SUPPORTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespaceSupported(NamespaceSupportedType newNamespaceSupported, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__NAMESPACE_SUPPORTED, newNamespaceSupported, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceSupported(NamespaceSupportedType newNamespaceSupported) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__NAMESPACE_SUPPORTED, newNamespaceSupported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonRepudiationType getNonRepudiation() {
		return (NonRepudiationType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__NON_REPUDIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonRepudiation(NonRepudiationType newNonRepudiation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__NON_REPUDIATION, newNonRepudiation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonRepudiation(NonRepudiationType newNonRepudiation) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__NON_REPUDIATION, newNonRepudiation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverrideType getOverride() {
		return (OverrideType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__OVERRIDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverride(OverrideType newOverride, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__OVERRIDE, newOverride, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverride(OverrideType newOverride) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__OVERRIDE, newOverride);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagingType getPackaging() {
		return (PackagingType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__PACKAGING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackaging(PackagingType newPackaging, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__PACKAGING, newPackaging, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackaging(PackagingType newPackaging) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__PACKAGING, newPackaging);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyIdType getPartyId() {
		return (PartyIdType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartyId(PartyIdType newPartyId, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__PARTY_ID, newPartyId, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartyId(PartyIdType newPartyId) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyInfoType getPartyInfo() {
		return (PartyInfoType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__PARTY_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartyInfo(PartyInfoType newPartyInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__PARTY_INFO, newPartyInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartyInfo(PartyInfoType newPartyInfo) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__PARTY_INFO, newPartyInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyRefType getPartyRef() {
		return (PartyRefType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__PARTY_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartyRef(PartyRefType newPartyRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__PARTY_REF, newPartyRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartyRef(PartyRefType newPartyRef) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__PARTY_REF, newPartyRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSpecificationType getProcessSpecification() {
		return (ProcessSpecificationType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__PROCESS_SPECIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessSpecification(ProcessSpecificationType newProcessSpecification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__PROCESS_SPECIFICATION, newProcessSpecification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessSpecification(ProcessSpecificationType newProcessSpecification) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__PROCESS_SPECIFICATION, newProcessSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType getProtocol() {
		return (ProtocolType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__PROTOCOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(ProtocolType newProtocol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__PROTOCOL, newProtocol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolType newProtocol) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__PROTOCOL, newProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType getReceivingProtocol() {
		return (ProtocolType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__RECEIVING_PROTOCOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivingProtocol(ProtocolType newReceivingProtocol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__RECEIVING_PROTOCOL, newReceivingProtocol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingProtocol(ProtocolType newReceivingProtocol) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__RECEIVING_PROTOCOL, newReceivingProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliableMessagingType getReliableMessaging() {
		return (ReliableMessagingType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__RELIABLE_MESSAGING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliableMessaging(ReliableMessagingType newReliableMessaging, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__RELIABLE_MESSAGING, newReliableMessaging, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliableMessaging(ReliableMessagingType newReliableMessaging) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__RELIABLE_MESSAGING, newReliableMessaging);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetries() {
		return (String)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__RETRIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetries(String newRetries) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__RETRIES, newRetries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetryInterval() {
		return (String)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__RETRY_INTERVAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryInterval(String newRetryInterval) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__RETRY_INTERVAL, newRetryInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRole() {
		return (RoleType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(RoleType newRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__ROLE, newRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(RoleType newRole) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolType getSendingProtocol() {
		return (ProtocolType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__SENDING_PROTOCOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendingProtocol(ProtocolType newSendingProtocol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__SENDING_PROTOCOL, newSendingProtocol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendingProtocol(ProtocolType newSendingProtocol) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__SENDING_PROTOCOL, newSendingProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getService() {
		return (ServiceType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(ServiceType newService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__SERVICE, newService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(ServiceType newService) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBindingType getServiceBinding() {
		return (ServiceBindingType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceBinding(ServiceBindingType newServiceBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING, newServiceBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBinding(ServiceBindingType newServiceBinding) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__SERVICE_BINDING, newServiceBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignatureAlgorithm() {
		return (String)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__SIGNATURE_ALGORITHM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureAlgorithm(String newSignatureAlgorithm) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__SIGNATURE_ALGORITHM, newSignatureAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStart() {
		return (XMLGregorianCalendar)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(XMLGregorianCalendar newStart) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return (StatusType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(StatusType newStatus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__STATUS, newStatus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportType getTransport() {
		return (TransportType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__TRANSPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransport(TransportType newTransport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__TRANSPORT, newTransport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransport(TransportType newTransport) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__TRANSPORT, newTransport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportSecurityType getTransportSecurity() {
		return (TransportSecurityType)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__TRANSPORT_SECURITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportSecurity(TransportSecurityType newTransportSecurity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(PartnerPackage.Literals.DOCUMENT_ROOT__TRANSPORT_SECURITY, newTransportSecurity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportSecurity(TransportSecurityType newTransportSecurity) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__TRANSPORT_SECURITY, newTransportSecurity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)getMixed().get(PartnerPackage.Literals.DOCUMENT_ROOT__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		((FeatureMap.Internal)getMixed()).set(PartnerPackage.Literals.DOCUMENT_ROOT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.DOCUMENT_ROOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdref() {
		return idref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdref(String newIdref) {
		String oldIdref = idref;
		idref = newIdref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.DOCUMENT_ROOT__IDREF, oldIdref, idref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncReplyModeType getSyncReplyMode() {
		return syncReplyMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncReplyMode(SyncReplyModeType newSyncReplyMode) {
		SyncReplyModeType oldSyncReplyMode = syncReplyMode;
		syncReplyMode = newSyncReplyMode == null ? SYNC_REPLY_MODE_EDEFAULT : newSyncReplyMode;
		boolean oldSyncReplyModeESet = syncReplyModeESet;
		syncReplyModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.DOCUMENT_ROOT__SYNC_REPLY_MODE, oldSyncReplyMode, syncReplyMode, !oldSyncReplyModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSyncReplyMode() {
		SyncReplyModeType oldSyncReplyMode = syncReplyMode;
		boolean oldSyncReplyModeESet = syncReplyModeESet;
		syncReplyMode = SYNC_REPLY_MODE_EDEFAULT;
		syncReplyModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.DOCUMENT_ROOT__SYNC_REPLY_MODE, oldSyncReplyMode, SYNC_REPLY_MODE_EDEFAULT, oldSyncReplyModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSyncReplyMode() {
		return syncReplyModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.DOCUMENT_ROOT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case PartnerPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case PartnerPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case PartnerPackage.DOCUMENT_ROOT__CERTIFICATE:
				return basicSetCertificate(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__CERTIFICATE_REF:
				return basicSetCertificateRef(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__CHARACTERISTICS:
				return basicSetCharacteristics(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_AGREEMENT:
				return basicSetCollaborationProtocolAgreement(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_PROFILE:
				return basicSetCollaborationProtocolProfile(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_ROLE:
				return basicSetCollaborationRole(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__COMMENT:
				return basicSetComment(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__CONSTITUENT:
				return basicSetConstituent(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__CONVERSATION_CONSTRAINTS:
				return basicSetConversationConstraints(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__DELIVERY_CHANNEL:
				return basicSetDeliveryChannel(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__DIGITAL_ENVELOPE:
				return basicSetDigitalEnvelope(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__DOC_EXCHANGE:
				return basicSetDocExchange(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__EB_XML_BINDING:
				return basicSetEbXMLBinding(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__NAMESPACE_SUPPORTED:
				return basicSetNamespaceSupported(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__NON_REPUDIATION:
				return basicSetNonRepudiation(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__OVERRIDE:
				return basicSetOverride(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__PACKAGING:
				return basicSetPackaging(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__PARTY_ID:
				return basicSetPartyId(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__PARTY_INFO:
				return basicSetPartyInfo(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__PARTY_REF:
				return basicSetPartyRef(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__PROCESS_SPECIFICATION:
				return basicSetProcessSpecification(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__PROTOCOL:
				return basicSetProtocol(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__RECEIVING_PROTOCOL:
				return basicSetReceivingProtocol(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__RELIABLE_MESSAGING:
				return basicSetReliableMessaging(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__ROLE:
				return basicSetRole(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__SENDING_PROTOCOL:
				return basicSetSendingProtocol(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__SERVICE:
				return basicSetService(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__SERVICE_BINDING:
				return basicSetServiceBinding(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__STATUS:
				return basicSetStatus(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__TRANSPORT:
				return basicSetTransport(null, msgs);
			case PartnerPackage.DOCUMENT_ROOT__TRANSPORT_SECURITY:
				return basicSetTransportSecurity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartnerPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case PartnerPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case PartnerPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case PartnerPackage.DOCUMENT_ROOT__CERTIFICATE:
				return getCertificate();
			case PartnerPackage.DOCUMENT_ROOT__CERTIFICATE_REF:
				return getCertificateRef();
			case PartnerPackage.DOCUMENT_ROOT__CHARACTERISTICS:
				return getCharacteristics();
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_AGREEMENT:
				return getCollaborationProtocolAgreement();
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_PROFILE:
				return getCollaborationProtocolProfile();
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_ROLE:
				return getCollaborationRole();
			case PartnerPackage.DOCUMENT_ROOT__COMMENT:
				return getComment();
			case PartnerPackage.DOCUMENT_ROOT__CONSTITUENT:
				return getConstituent();
			case PartnerPackage.DOCUMENT_ROOT__CONVERSATION_CONSTRAINTS:
				return getConversationConstraints();
			case PartnerPackage.DOCUMENT_ROOT__DELIVERY_CHANNEL:
				return getDeliveryChannel();
			case PartnerPackage.DOCUMENT_ROOT__DIGITAL_ENVELOPE:
				return getDigitalEnvelope();
			case PartnerPackage.DOCUMENT_ROOT__DOC_EXCHANGE:
				return getDocExchange();
			case PartnerPackage.DOCUMENT_ROOT__EB_XML_BINDING:
				return getEbXMLBinding();
			case PartnerPackage.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM:
				return getEncryptionAlgorithm();
			case PartnerPackage.DOCUMENT_ROOT__END:
				return getEnd();
			case PartnerPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint();
			case PartnerPackage.DOCUMENT_ROOT__HASH_FUNCTION:
				return getHashFunction();
			case PartnerPackage.DOCUMENT_ROOT__NAMESPACE_SUPPORTED:
				return getNamespaceSupported();
			case PartnerPackage.DOCUMENT_ROOT__NON_REPUDIATION:
				return getNonRepudiation();
			case PartnerPackage.DOCUMENT_ROOT__OVERRIDE:
				return getOverride();
			case PartnerPackage.DOCUMENT_ROOT__PACKAGING:
				return getPackaging();
			case PartnerPackage.DOCUMENT_ROOT__PARTY_ID:
				return getPartyId();
			case PartnerPackage.DOCUMENT_ROOT__PARTY_INFO:
				return getPartyInfo();
			case PartnerPackage.DOCUMENT_ROOT__PARTY_REF:
				return getPartyRef();
			case PartnerPackage.DOCUMENT_ROOT__PROCESS_SPECIFICATION:
				return getProcessSpecification();
			case PartnerPackage.DOCUMENT_ROOT__PROTOCOL:
				return getProtocol();
			case PartnerPackage.DOCUMENT_ROOT__RECEIVING_PROTOCOL:
				return getReceivingProtocol();
			case PartnerPackage.DOCUMENT_ROOT__RELIABLE_MESSAGING:
				return getReliableMessaging();
			case PartnerPackage.DOCUMENT_ROOT__RETRIES:
				return getRetries();
			case PartnerPackage.DOCUMENT_ROOT__RETRY_INTERVAL:
				return getRetryInterval();
			case PartnerPackage.DOCUMENT_ROOT__ROLE:
				return getRole();
			case PartnerPackage.DOCUMENT_ROOT__SENDING_PROTOCOL:
				return getSendingProtocol();
			case PartnerPackage.DOCUMENT_ROOT__SERVICE:
				return getService();
			case PartnerPackage.DOCUMENT_ROOT__SERVICE_BINDING:
				return getServiceBinding();
			case PartnerPackage.DOCUMENT_ROOT__SIGNATURE_ALGORITHM:
				return getSignatureAlgorithm();
			case PartnerPackage.DOCUMENT_ROOT__START:
				return getStart();
			case PartnerPackage.DOCUMENT_ROOT__STATUS:
				return getStatus();
			case PartnerPackage.DOCUMENT_ROOT__TRANSPORT:
				return getTransport();
			case PartnerPackage.DOCUMENT_ROOT__TRANSPORT_SECURITY:
				return getTransportSecurity();
			case PartnerPackage.DOCUMENT_ROOT__TYPE:
				return getType();
			case PartnerPackage.DOCUMENT_ROOT__ID:
				return getId();
			case PartnerPackage.DOCUMENT_ROOT__IDREF:
				return getIdref();
			case PartnerPackage.DOCUMENT_ROOT__SYNC_REPLY_MODE:
				return getSyncReplyMode();
			case PartnerPackage.DOCUMENT_ROOT__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartnerPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__CERTIFICATE:
				setCertificate((CertificateType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__CERTIFICATE_REF:
				setCertificateRef((CertificateRefType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__CHARACTERISTICS:
				setCharacteristics((CharacteristicsType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_AGREEMENT:
				setCollaborationProtocolAgreement((CollaborationProtocolAgreementType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_PROFILE:
				setCollaborationProtocolProfile((CollaborationProtocolProfileType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_ROLE:
				setCollaborationRole((CollaborationRoleType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__COMMENT:
				setComment((CommentType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__CONSTITUENT:
				setConstituent((ConstituentType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__CONVERSATION_CONSTRAINTS:
				setConversationConstraints((ConversationConstraintsType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__DELIVERY_CHANNEL:
				setDeliveryChannel((DeliveryChannelType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__DIGITAL_ENVELOPE:
				setDigitalEnvelope((DigitalEnvelopeType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__DOC_EXCHANGE:
				setDocExchange((DocExchangeType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__EB_XML_BINDING:
				setEbXMLBinding((EbXMLBindingType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM:
				setEncryptionAlgorithm((String)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__END:
				setEnd((XMLGregorianCalendar)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((EndpointType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__HASH_FUNCTION:
				setHashFunction((String)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__NAMESPACE_SUPPORTED:
				setNamespaceSupported((NamespaceSupportedType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__NON_REPUDIATION:
				setNonRepudiation((NonRepudiationType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__OVERRIDE:
				setOverride((OverrideType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PACKAGING:
				setPackaging((PackagingType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PARTY_ID:
				setPartyId((PartyIdType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PARTY_INFO:
				setPartyInfo((PartyInfoType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PARTY_REF:
				setPartyRef((PartyRefType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PROCESS_SPECIFICATION:
				setProcessSpecification((ProcessSpecificationType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PROTOCOL:
				setProtocol((ProtocolType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__RECEIVING_PROTOCOL:
				setReceivingProtocol((ProtocolType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__RELIABLE_MESSAGING:
				setReliableMessaging((ReliableMessagingType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__RETRIES:
				setRetries((String)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__RETRY_INTERVAL:
				setRetryInterval((String)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__ROLE:
				setRole((RoleType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__SENDING_PROTOCOL:
				setSendingProtocol((ProtocolType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__SERVICE:
				setService((ServiceType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__SERVICE_BINDING:
				setServiceBinding((ServiceBindingType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm((String)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__START:
				setStart((XMLGregorianCalendar)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__STATUS:
				setStatus((StatusType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__TRANSPORT:
				setTransport((TransportType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__TRANSPORT_SECURITY:
				setTransportSecurity((TransportSecurityType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__TYPE:
				setType((String)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__ID:
				setId((String)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__IDREF:
				setIdref((String)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__SYNC_REPLY_MODE:
				setSyncReplyMode((SyncReplyModeType)newValue);
				return;
			case PartnerPackage.DOCUMENT_ROOT__VERSION:
				setVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PartnerPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case PartnerPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case PartnerPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case PartnerPackage.DOCUMENT_ROOT__CERTIFICATE:
				setCertificate((CertificateType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__CERTIFICATE_REF:
				setCertificateRef((CertificateRefType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__CHARACTERISTICS:
				setCharacteristics((CharacteristicsType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_AGREEMENT:
				setCollaborationProtocolAgreement((CollaborationProtocolAgreementType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_PROFILE:
				setCollaborationProtocolProfile((CollaborationProtocolProfileType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_ROLE:
				setCollaborationRole((CollaborationRoleType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__COMMENT:
				setComment((CommentType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__CONSTITUENT:
				setConstituent((ConstituentType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__CONVERSATION_CONSTRAINTS:
				setConversationConstraints((ConversationConstraintsType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__DELIVERY_CHANNEL:
				setDeliveryChannel((DeliveryChannelType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__DIGITAL_ENVELOPE:
				setDigitalEnvelope((DigitalEnvelopeType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__DOC_EXCHANGE:
				setDocExchange((DocExchangeType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__EB_XML_BINDING:
				setEbXMLBinding((EbXMLBindingType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM:
				setEncryptionAlgorithm(ENCRYPTION_ALGORITHM_EDEFAULT);
				return;
			case PartnerPackage.DOCUMENT_ROOT__END:
				setEnd(END_EDEFAULT);
				return;
			case PartnerPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((EndpointType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__HASH_FUNCTION:
				setHashFunction(HASH_FUNCTION_EDEFAULT);
				return;
			case PartnerPackage.DOCUMENT_ROOT__NAMESPACE_SUPPORTED:
				setNamespaceSupported((NamespaceSupportedType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__NON_REPUDIATION:
				setNonRepudiation((NonRepudiationType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__OVERRIDE:
				setOverride((OverrideType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PACKAGING:
				setPackaging((PackagingType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PARTY_ID:
				setPartyId((PartyIdType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PARTY_INFO:
				setPartyInfo((PartyInfoType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PARTY_REF:
				setPartyRef((PartyRefType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PROCESS_SPECIFICATION:
				setProcessSpecification((ProcessSpecificationType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__PROTOCOL:
				setProtocol((ProtocolType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__RECEIVING_PROTOCOL:
				setReceivingProtocol((ProtocolType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__RELIABLE_MESSAGING:
				setReliableMessaging((ReliableMessagingType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__RETRIES:
				setRetries(RETRIES_EDEFAULT);
				return;
			case PartnerPackage.DOCUMENT_ROOT__RETRY_INTERVAL:
				setRetryInterval(RETRY_INTERVAL_EDEFAULT);
				return;
			case PartnerPackage.DOCUMENT_ROOT__ROLE:
				setRole((RoleType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__SENDING_PROTOCOL:
				setSendingProtocol((ProtocolType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__SERVICE:
				setService((ServiceType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__SERVICE_BINDING:
				setServiceBinding((ServiceBindingType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm(SIGNATURE_ALGORITHM_EDEFAULT);
				return;
			case PartnerPackage.DOCUMENT_ROOT__START:
				setStart(START_EDEFAULT);
				return;
			case PartnerPackage.DOCUMENT_ROOT__STATUS:
				setStatus((StatusType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__TRANSPORT:
				setTransport((TransportType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__TRANSPORT_SECURITY:
				setTransportSecurity((TransportSecurityType)null);
				return;
			case PartnerPackage.DOCUMENT_ROOT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case PartnerPackage.DOCUMENT_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case PartnerPackage.DOCUMENT_ROOT__IDREF:
				setIdref(IDREF_EDEFAULT);
				return;
			case PartnerPackage.DOCUMENT_ROOT__SYNC_REPLY_MODE:
				unsetSyncReplyMode();
				return;
			case PartnerPackage.DOCUMENT_ROOT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PartnerPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case PartnerPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case PartnerPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case PartnerPackage.DOCUMENT_ROOT__CERTIFICATE:
				return getCertificate() != null;
			case PartnerPackage.DOCUMENT_ROOT__CERTIFICATE_REF:
				return getCertificateRef() != null;
			case PartnerPackage.DOCUMENT_ROOT__CHARACTERISTICS:
				return getCharacteristics() != null;
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_AGREEMENT:
				return getCollaborationProtocolAgreement() != null;
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_PROTOCOL_PROFILE:
				return getCollaborationProtocolProfile() != null;
			case PartnerPackage.DOCUMENT_ROOT__COLLABORATION_ROLE:
				return getCollaborationRole() != null;
			case PartnerPackage.DOCUMENT_ROOT__COMMENT:
				return getComment() != null;
			case PartnerPackage.DOCUMENT_ROOT__CONSTITUENT:
				return getConstituent() != null;
			case PartnerPackage.DOCUMENT_ROOT__CONVERSATION_CONSTRAINTS:
				return getConversationConstraints() != null;
			case PartnerPackage.DOCUMENT_ROOT__DELIVERY_CHANNEL:
				return getDeliveryChannel() != null;
			case PartnerPackage.DOCUMENT_ROOT__DIGITAL_ENVELOPE:
				return getDigitalEnvelope() != null;
			case PartnerPackage.DOCUMENT_ROOT__DOC_EXCHANGE:
				return getDocExchange() != null;
			case PartnerPackage.DOCUMENT_ROOT__EB_XML_BINDING:
				return getEbXMLBinding() != null;
			case PartnerPackage.DOCUMENT_ROOT__ENCRYPTION_ALGORITHM:
				return ENCRYPTION_ALGORITHM_EDEFAULT == null ? getEncryptionAlgorithm() != null : !ENCRYPTION_ALGORITHM_EDEFAULT.equals(getEncryptionAlgorithm());
			case PartnerPackage.DOCUMENT_ROOT__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
			case PartnerPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint() != null;
			case PartnerPackage.DOCUMENT_ROOT__HASH_FUNCTION:
				return HASH_FUNCTION_EDEFAULT == null ? getHashFunction() != null : !HASH_FUNCTION_EDEFAULT.equals(getHashFunction());
			case PartnerPackage.DOCUMENT_ROOT__NAMESPACE_SUPPORTED:
				return getNamespaceSupported() != null;
			case PartnerPackage.DOCUMENT_ROOT__NON_REPUDIATION:
				return getNonRepudiation() != null;
			case PartnerPackage.DOCUMENT_ROOT__OVERRIDE:
				return getOverride() != null;
			case PartnerPackage.DOCUMENT_ROOT__PACKAGING:
				return getPackaging() != null;
			case PartnerPackage.DOCUMENT_ROOT__PARTY_ID:
				return getPartyId() != null;
			case PartnerPackage.DOCUMENT_ROOT__PARTY_INFO:
				return getPartyInfo() != null;
			case PartnerPackage.DOCUMENT_ROOT__PARTY_REF:
				return getPartyRef() != null;
			case PartnerPackage.DOCUMENT_ROOT__PROCESS_SPECIFICATION:
				return getProcessSpecification() != null;
			case PartnerPackage.DOCUMENT_ROOT__PROTOCOL:
				return getProtocol() != null;
			case PartnerPackage.DOCUMENT_ROOT__RECEIVING_PROTOCOL:
				return getReceivingProtocol() != null;
			case PartnerPackage.DOCUMENT_ROOT__RELIABLE_MESSAGING:
				return getReliableMessaging() != null;
			case PartnerPackage.DOCUMENT_ROOT__RETRIES:
				return RETRIES_EDEFAULT == null ? getRetries() != null : !RETRIES_EDEFAULT.equals(getRetries());
			case PartnerPackage.DOCUMENT_ROOT__RETRY_INTERVAL:
				return RETRY_INTERVAL_EDEFAULT == null ? getRetryInterval() != null : !RETRY_INTERVAL_EDEFAULT.equals(getRetryInterval());
			case PartnerPackage.DOCUMENT_ROOT__ROLE:
				return getRole() != null;
			case PartnerPackage.DOCUMENT_ROOT__SENDING_PROTOCOL:
				return getSendingProtocol() != null;
			case PartnerPackage.DOCUMENT_ROOT__SERVICE:
				return getService() != null;
			case PartnerPackage.DOCUMENT_ROOT__SERVICE_BINDING:
				return getServiceBinding() != null;
			case PartnerPackage.DOCUMENT_ROOT__SIGNATURE_ALGORITHM:
				return SIGNATURE_ALGORITHM_EDEFAULT == null ? getSignatureAlgorithm() != null : !SIGNATURE_ALGORITHM_EDEFAULT.equals(getSignatureAlgorithm());
			case PartnerPackage.DOCUMENT_ROOT__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case PartnerPackage.DOCUMENT_ROOT__STATUS:
				return getStatus() != null;
			case PartnerPackage.DOCUMENT_ROOT__TRANSPORT:
				return getTransport() != null;
			case PartnerPackage.DOCUMENT_ROOT__TRANSPORT_SECURITY:
				return getTransportSecurity() != null;
			case PartnerPackage.DOCUMENT_ROOT__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case PartnerPackage.DOCUMENT_ROOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PartnerPackage.DOCUMENT_ROOT__IDREF:
				return IDREF_EDEFAULT == null ? idref != null : !IDREF_EDEFAULT.equals(idref);
			case PartnerPackage.DOCUMENT_ROOT__SYNC_REPLY_MODE:
				return isSetSyncReplyMode();
			case PartnerPackage.DOCUMENT_ROOT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", id: ");
		result.append(id);
		result.append(", idref: ");
		result.append(idref);
		result.append(", syncReplyMode: ");
		if (syncReplyModeESet) result.append(syncReplyMode); else result.append("<unset>");
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
