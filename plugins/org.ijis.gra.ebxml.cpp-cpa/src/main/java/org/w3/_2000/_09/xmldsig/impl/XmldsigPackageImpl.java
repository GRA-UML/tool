/**
 */
package org.w3._2000._09.xmldsig.impl;

import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.impl.PartnerPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.w3._1999.xlink.XlinkPackage;
import org.w3._1999.xlink.impl.XlinkPackageImpl;
import org.w3._2000._09.xmldsig.CanonicalizationMethodType;
import org.w3._2000._09.xmldsig.DSAKeyValueType;
import org.w3._2000._09.xmldsig.DigestMethodType;
import org.w3._2000._09.xmldsig.DocumentRoot;
import org.w3._2000._09.xmldsig.KeyInfoType;
import org.w3._2000._09.xmldsig.KeyValueType;
import org.w3._2000._09.xmldsig.ManifestType;
import org.w3._2000._09.xmldsig.ObjectType;
import org.w3._2000._09.xmldsig.PGPDataType;
import org.w3._2000._09.xmldsig.RSAKeyValueType;
import org.w3._2000._09.xmldsig.ReferenceType;
import org.w3._2000._09.xmldsig.RetrievalMethodType;
import org.w3._2000._09.xmldsig.SignatureMethodType;
import org.w3._2000._09.xmldsig.SignaturePropertiesType;
import org.w3._2000._09.xmldsig.SignaturePropertyType;
import org.w3._2000._09.xmldsig.SignatureType;
import org.w3._2000._09.xmldsig.SignedInfoType;
import org.w3._2000._09.xmldsig.TransformType;
import org.w3._2000._09.xmldsig.TransformsType;
import org.w3._2000._09.xmldsig.X509DataType;
import org.w3._2000._09.xmldsig.X509IssuerSerialType;
import org.w3._2000._09.xmldsig.XmldsigFactory;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmldsigPackageImpl extends EPackageImpl implements XmldsigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canonicalizationMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digestMethodTypeEClass = null;

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
	private EClass dsaKeyValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pgpDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retrievalMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsaKeyValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signaturePropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signaturePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signedInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x509DataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x509IssuerSerialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cryptoBinaryEDataType = null;

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmldsigPackageImpl() {
		super(eNS_URI, XmldsigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XmldsigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XmldsigPackage init() {
		if (isInited) return (XmldsigPackage)EPackage.Registry.INSTANCE.getEPackage(XmldsigPackage.eNS_URI);

		// Obtain or create and register package
		XmldsigPackageImpl theXmldsigPackage = (XmldsigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XmldsigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XmldsigPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PartnerPackageImpl thePartnerPackage = (PartnerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PartnerPackage.eNS_URI) instanceof PartnerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PartnerPackage.eNS_URI) : PartnerPackage.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);

		// Create package meta-data objects
		theXmldsigPackage.createPackageContents();
		thePartnerPackage.createPackageContents();
		theXlinkPackage.createPackageContents();

		// Initialize created meta-data
		theXmldsigPackage.initializePackageContents();
		thePartnerPackage.initializePackageContents();
		theXlinkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXmldsigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XmldsigPackage.eNS_URI, theXmldsigPackage);
		return theXmldsigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanonicalizationMethodType() {
		return canonicalizationMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanonicalizationMethodType_Any() {
		return (EAttribute)canonicalizationMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCanonicalizationMethodType_Algorithm() {
		return (EAttribute)canonicalizationMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigestMethodType() {
		return digestMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestMethodType_Any() {
		return (EAttribute)digestMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestMethodType_Algorithm() {
		return (EAttribute)digestMethodTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_CanonicalizationMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DigestMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DigestValue() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DSAKeyValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HMACOutputLength() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyInfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeyValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Manifest() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Object() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PGPData() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Reference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RetrievalMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RSAKeyValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Signature() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureMethod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureProperties() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignatureProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SignatureValue() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SignedInfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SPKIData() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transform() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transforms() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_X509Data() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_X509IssuerSerial() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSAKeyValueType() {
		return dsaKeyValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_P() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_Q() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_G() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_Y() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_J() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_Seed() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSAKeyValueType_PgenCounter() {
		return (EAttribute)dsaKeyValueTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyInfoType() {
		return keyInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_Group() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_Any() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_KeyName() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType_KeyValue() {
		return (EReference)keyInfoTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType_RetrievalMethod() {
		return (EReference)keyInfoTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType_X509Data() {
		return (EReference)keyInfoTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyInfoType_PGPData() {
		return (EReference)keyInfoTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_SPKIData() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_MgmtData() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyInfoType_Id() {
		return (EAttribute)keyInfoTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValueType() {
		return keyValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueType_Mixed() {
		return (EAttribute)keyValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueType_Any() {
		return (EAttribute)keyValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValueType_DSAKeyValue() {
		return (EReference)keyValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValueType_RSAKeyValue() {
		return (EReference)keyValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestType() {
		return manifestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestType_Reference() {
		return (EReference)manifestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestType_Id() {
		return (EAttribute)manifestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Mixed() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Group() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Any() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Encoding() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Id() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_MimeType() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPGPDataType() {
		return pgpDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType_Any() {
		return (EAttribute)pgpDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType_PGPKeyID() {
		return (EAttribute)pgpDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPGPDataType_PGPKeyPacket() {
		return (EAttribute)pgpDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType() {
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceType_Transforms() {
		return (EReference)referenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceType_DigestMethod() {
		return (EReference)referenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_DigestValue() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Id() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Type() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_URI() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetrievalMethodType() {
		return retrievalMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRetrievalMethodType_Transforms() {
		return (EReference)retrievalMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrievalMethodType_Type() {
		return (EAttribute)retrievalMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetrievalMethodType_URI() {
		return (EAttribute)retrievalMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSAKeyValueType() {
		return rsaKeyValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRSAKeyValueType_Modulus() {
		return (EAttribute)rsaKeyValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRSAKeyValueType_Exponent() {
		return (EAttribute)rsaKeyValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureMethodType() {
		return signatureMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureMethodType_Any() {
		return (EAttribute)signatureMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureMethodType_Algorithm() {
		return (EAttribute)signatureMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignaturePropertiesType() {
		return signaturePropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignaturePropertiesType_SignatureProperty() {
		return (EReference)signaturePropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertiesType_Id() {
		return (EAttribute)signaturePropertiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignaturePropertyType() {
		return signaturePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType_Mixed() {
		return (EAttribute)signaturePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType_Group() {
		return (EAttribute)signaturePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType_Any() {
		return (EAttribute)signaturePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType_Id() {
		return (EAttribute)signaturePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignaturePropertyType_Target() {
		return (EAttribute)signaturePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureType() {
		return signatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureType_SignedInfo() {
		return (EReference)signatureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureType_SignatureValue() {
		return (EAttribute)signatureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureType_KeyInfo() {
		return (EReference)signatureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureType_Object() {
		return (EReference)signatureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignatureType_Id() {
		return (EAttribute)signatureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignedInfoType() {
		return signedInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignedInfoType_CanonicalizationMethod() {
		return (EReference)signedInfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignedInfoType_SignatureMethod() {
		return (EReference)signedInfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignedInfoType_Reference() {
		return (EReference)signedInfoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignedInfoType_Id() {
		return (EAttribute)signedInfoTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformsType() {
		return transformsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformsType_Transform() {
		return (EReference)transformsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformType() {
		return transformTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Group() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Any() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_XSLT() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_XPath() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformType_Algorithm() {
		return (EAttribute)transformTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX509DataType() {
		return x509DataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType_Group() {
		return (EAttribute)x509DataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getX509DataType_X509IssuerSerial() {
		return (EReference)x509DataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType_X509SKI() {
		return (EAttribute)x509DataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType_X509SubjectName() {
		return (EAttribute)x509DataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType_X509Certificate() {
		return (EAttribute)x509DataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509DataType_X509CRL() {
		return (EAttribute)x509DataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX509IssuerSerialType() {
		return x509IssuerSerialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509IssuerSerialType_X509IssuerName() {
		return (EAttribute)x509IssuerSerialTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX509IssuerSerialType_X509SerialNumber() {
		return (EAttribute)x509IssuerSerialTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCryptoBinary() {
		return cryptoBinaryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmldsigFactory getXmldsigFactory() {
		return (XmldsigFactory)getEFactoryInstance();
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
		canonicalizationMethodTypeEClass = createEClass(CANONICALIZATION_METHOD_TYPE);
		createEAttribute(canonicalizationMethodTypeEClass, CANONICALIZATION_METHOD_TYPE__ANY);
		createEAttribute(canonicalizationMethodTypeEClass, CANONICALIZATION_METHOD_TYPE__ALGORITHM);

		digestMethodTypeEClass = createEClass(DIGEST_METHOD_TYPE);
		createEAttribute(digestMethodTypeEClass, DIGEST_METHOD_TYPE__ANY);
		createEAttribute(digestMethodTypeEClass, DIGEST_METHOD_TYPE__ALGORITHM);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CANONICALIZATION_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIGEST_METHOD);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIGEST_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DSA_KEY_VALUE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HMAC_OUTPUT_LENGTH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_INFO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MANIFEST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PGP_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RETRIEVAL_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RSA_KEY_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_METHOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_PROPERTIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_PROPERTY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SIGNATURE_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIGNED_INFO);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPKI_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSFORMS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__X509_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__X509_ISSUER_SERIAL);

		dsaKeyValueTypeEClass = createEClass(DSA_KEY_VALUE_TYPE);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__P);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__Q);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__G);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__Y);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__J);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__SEED);
		createEAttribute(dsaKeyValueTypeEClass, DSA_KEY_VALUE_TYPE__PGEN_COUNTER);

		keyInfoTypeEClass = createEClass(KEY_INFO_TYPE);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__GROUP);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__ANY);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__KEY_NAME);
		createEReference(keyInfoTypeEClass, KEY_INFO_TYPE__KEY_VALUE);
		createEReference(keyInfoTypeEClass, KEY_INFO_TYPE__RETRIEVAL_METHOD);
		createEReference(keyInfoTypeEClass, KEY_INFO_TYPE__X509_DATA);
		createEReference(keyInfoTypeEClass, KEY_INFO_TYPE__PGP_DATA);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__SPKI_DATA);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__MGMT_DATA);
		createEAttribute(keyInfoTypeEClass, KEY_INFO_TYPE__ID);

		keyValueTypeEClass = createEClass(KEY_VALUE_TYPE);
		createEAttribute(keyValueTypeEClass, KEY_VALUE_TYPE__MIXED);
		createEAttribute(keyValueTypeEClass, KEY_VALUE_TYPE__ANY);
		createEReference(keyValueTypeEClass, KEY_VALUE_TYPE__DSA_KEY_VALUE);
		createEReference(keyValueTypeEClass, KEY_VALUE_TYPE__RSA_KEY_VALUE);

		manifestTypeEClass = createEClass(MANIFEST_TYPE);
		createEReference(manifestTypeEClass, MANIFEST_TYPE__REFERENCE);
		createEAttribute(manifestTypeEClass, MANIFEST_TYPE__ID);

		objectTypeEClass = createEClass(OBJECT_TYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__MIXED);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__GROUP);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__ANY);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__ENCODING);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__ID);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__MIME_TYPE);

		pgpDataTypeEClass = createEClass(PGP_DATA_TYPE);
		createEAttribute(pgpDataTypeEClass, PGP_DATA_TYPE__ANY);
		createEAttribute(pgpDataTypeEClass, PGP_DATA_TYPE__PGP_KEY_ID);
		createEAttribute(pgpDataTypeEClass, PGP_DATA_TYPE__PGP_KEY_PACKET);

		referenceTypeEClass = createEClass(REFERENCE_TYPE);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__TRANSFORMS);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__DIGEST_METHOD);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__DIGEST_VALUE);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__ID);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__TYPE);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__URI);

		retrievalMethodTypeEClass = createEClass(RETRIEVAL_METHOD_TYPE);
		createEReference(retrievalMethodTypeEClass, RETRIEVAL_METHOD_TYPE__TRANSFORMS);
		createEAttribute(retrievalMethodTypeEClass, RETRIEVAL_METHOD_TYPE__TYPE);
		createEAttribute(retrievalMethodTypeEClass, RETRIEVAL_METHOD_TYPE__URI);

		rsaKeyValueTypeEClass = createEClass(RSA_KEY_VALUE_TYPE);
		createEAttribute(rsaKeyValueTypeEClass, RSA_KEY_VALUE_TYPE__MODULUS);
		createEAttribute(rsaKeyValueTypeEClass, RSA_KEY_VALUE_TYPE__EXPONENT);

		signatureMethodTypeEClass = createEClass(SIGNATURE_METHOD_TYPE);
		createEAttribute(signatureMethodTypeEClass, SIGNATURE_METHOD_TYPE__ANY);
		createEAttribute(signatureMethodTypeEClass, SIGNATURE_METHOD_TYPE__ALGORITHM);

		signaturePropertiesTypeEClass = createEClass(SIGNATURE_PROPERTIES_TYPE);
		createEReference(signaturePropertiesTypeEClass, SIGNATURE_PROPERTIES_TYPE__SIGNATURE_PROPERTY);
		createEAttribute(signaturePropertiesTypeEClass, SIGNATURE_PROPERTIES_TYPE__ID);

		signaturePropertyTypeEClass = createEClass(SIGNATURE_PROPERTY_TYPE);
		createEAttribute(signaturePropertyTypeEClass, SIGNATURE_PROPERTY_TYPE__MIXED);
		createEAttribute(signaturePropertyTypeEClass, SIGNATURE_PROPERTY_TYPE__GROUP);
		createEAttribute(signaturePropertyTypeEClass, SIGNATURE_PROPERTY_TYPE__ANY);
		createEAttribute(signaturePropertyTypeEClass, SIGNATURE_PROPERTY_TYPE__ID);
		createEAttribute(signaturePropertyTypeEClass, SIGNATURE_PROPERTY_TYPE__TARGET);

		signatureTypeEClass = createEClass(SIGNATURE_TYPE);
		createEReference(signatureTypeEClass, SIGNATURE_TYPE__SIGNED_INFO);
		createEAttribute(signatureTypeEClass, SIGNATURE_TYPE__SIGNATURE_VALUE);
		createEReference(signatureTypeEClass, SIGNATURE_TYPE__KEY_INFO);
		createEReference(signatureTypeEClass, SIGNATURE_TYPE__OBJECT);
		createEAttribute(signatureTypeEClass, SIGNATURE_TYPE__ID);

		signedInfoTypeEClass = createEClass(SIGNED_INFO_TYPE);
		createEReference(signedInfoTypeEClass, SIGNED_INFO_TYPE__CANONICALIZATION_METHOD);
		createEReference(signedInfoTypeEClass, SIGNED_INFO_TYPE__SIGNATURE_METHOD);
		createEReference(signedInfoTypeEClass, SIGNED_INFO_TYPE__REFERENCE);
		createEAttribute(signedInfoTypeEClass, SIGNED_INFO_TYPE__ID);

		transformsTypeEClass = createEClass(TRANSFORMS_TYPE);
		createEReference(transformsTypeEClass, TRANSFORMS_TYPE__TRANSFORM);

		transformTypeEClass = createEClass(TRANSFORM_TYPE);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__GROUP);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__ANY);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__XSLT);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__XPATH);
		createEAttribute(transformTypeEClass, TRANSFORM_TYPE__ALGORITHM);

		x509DataTypeEClass = createEClass(X509_DATA_TYPE);
		createEAttribute(x509DataTypeEClass, X509_DATA_TYPE__GROUP);
		createEReference(x509DataTypeEClass, X509_DATA_TYPE__X509_ISSUER_SERIAL);
		createEAttribute(x509DataTypeEClass, X509_DATA_TYPE__X509_SKI);
		createEAttribute(x509DataTypeEClass, X509_DATA_TYPE__X509_SUBJECT_NAME);
		createEAttribute(x509DataTypeEClass, X509_DATA_TYPE__X509_CERTIFICATE);
		createEAttribute(x509DataTypeEClass, X509_DATA_TYPE__X509_CRL);

		x509IssuerSerialTypeEClass = createEClass(X509_ISSUER_SERIAL_TYPE);
		createEAttribute(x509IssuerSerialTypeEClass, X509_ISSUER_SERIAL_TYPE__X509_ISSUER_NAME);
		createEAttribute(x509IssuerSerialTypeEClass, X509_ISSUER_SERIAL_TYPE__X509_SERIAL_NUMBER);

		// Create data types
		cryptoBinaryEDataType = createEDataType(CRYPTO_BINARY);
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
		initEClass(canonicalizationMethodTypeEClass, CanonicalizationMethodType.class, "CanonicalizationMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCanonicalizationMethodType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, CanonicalizationMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCanonicalizationMethodType_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, CanonicalizationMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digestMethodTypeEClass, DigestMethodType.class, "DigestMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigestMethodType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, DigestMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestMethodType_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, DigestMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CanonicalizationMethod(), this.getCanonicalizationMethodType(), null, "canonicalizationMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DigestMethod(), this.getDigestMethodType(), null, "digestMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DigestValue(), this.getCryptoBinary(), "digestValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DSAKeyValue(), this.getDSAKeyValueType(), null, "dSAKeyValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HMACOutputLength(), theXMLTypePackage.getInteger(), "hMACOutputLength", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeyInfo(), this.getKeyInfoType(), null, "keyInfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeyValue(), this.getKeyValueType(), null, "keyValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Manifest(), this.getManifestType(), null, "manifest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Object(), this.getObjectType(), null, "object", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PGPData(), this.getPGPDataType(), null, "pGPData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Reference(), this.getReferenceType(), null, "reference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RetrievalMethod(), this.getRetrievalMethodType(), null, "retrievalMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RSAKeyValue(), this.getRSAKeyValueType(), null, "rSAKeyValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Signature(), this.getSignatureType(), null, "signature", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureMethod(), this.getSignatureMethodType(), null, "signatureMethod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureProperties(), this.getSignaturePropertiesType(), null, "signatureProperties", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignatureProperty(), this.getSignaturePropertyType(), null, "signatureProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SignatureValue(), this.getCryptoBinary(), "signatureValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SignedInfo(), this.getSignedInfoType(), null, "signedInfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SPKIData(), theXMLTypePackage.getString(), "sPKIData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transform(), this.getTransformType(), null, "transform", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transforms(), this.getTransformsType(), null, "transforms", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_X509Data(), this.getX509DataType(), null, "x509Data", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_X509IssuerSerial(), this.getX509IssuerSerialType(), null, "x509IssuerSerial", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dsaKeyValueTypeEClass, DSAKeyValueType.class, "DSAKeyValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSAKeyValueType_P(), this.getCryptoBinary(), "p", null, 1, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_Q(), this.getCryptoBinary(), "q", null, 1, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_G(), this.getCryptoBinary(), "g", null, 1, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_Y(), this.getCryptoBinary(), "y", null, 1, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_J(), this.getCryptoBinary(), "j", null, 0, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_Seed(), this.getCryptoBinary(), "seed", null, 0, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSAKeyValueType_PgenCounter(), this.getCryptoBinary(), "pgenCounter", null, 0, 1, DSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyInfoTypeEClass, KeyInfoType.class, "KeyInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyInfoType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, KeyInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType_KeyName(), theXMLTypePackage.getString(), "keyName", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType_KeyValue(), this.getKeyValueType(), null, "keyValue", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType_RetrievalMethod(), this.getRetrievalMethodType(), null, "retrievalMethod", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType_X509Data(), this.getX509DataType(), null, "x509Data", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyInfoType_PGPData(), this.getPGPDataType(), null, "pGPData", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType_SPKIData(), theXMLTypePackage.getString(), "sPKIData", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType_MgmtData(), theXMLTypePackage.getString(), "mgmtData", null, 0, -1, KeyInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyInfoType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, KeyInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValueTypeEClass, KeyValueType.class, "KeyValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValueType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, KeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValueType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, KeyValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValueType_DSAKeyValue(), this.getDSAKeyValueType(), null, "dSAKeyValue", null, 0, 1, KeyValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValueType_RSAKeyValue(), this.getRSAKeyValueType(), null, "rSAKeyValue", null, 0, 1, KeyValueType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(manifestTypeEClass, ManifestType.class, "ManifestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManifestType_Reference(), this.getReferenceType(), null, "reference", null, 1, -1, ManifestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManifestType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ManifestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeEClass, ObjectType.class, "ObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Encoding(), theXMLTypePackage.getAnyURI(), "encoding", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_MimeType(), theXMLTypePackage.getString(), "mimeType", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pgpDataTypeEClass, PGPDataType.class, "PGPDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPGPDataType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PGPDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPGPDataType_PGPKeyID(), theXMLTypePackage.getString(), "pGPKeyID", null, 0, 1, PGPDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPGPDataType_PGPKeyPacket(), this.getCryptoBinary(), "pGPKeyPacket", null, 0, 1, PGPDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTypeEClass, ReferenceType.class, "ReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceType_Transforms(), this.getTransformsType(), null, "transforms", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceType_DigestMethod(), this.getDigestMethodType(), null, "digestMethod", null, 1, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_DigestValue(), this.getCryptoBinary(), "digestValue", null, 1, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_Type(), theXMLTypePackage.getAnyURI(), "type", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retrievalMethodTypeEClass, RetrievalMethodType.class, "RetrievalMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRetrievalMethodType_Transforms(), this.getTransformsType(), null, "transforms", null, 0, 1, RetrievalMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetrievalMethodType_Type(), theXMLTypePackage.getAnyURI(), "type", null, 0, 1, RetrievalMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetrievalMethodType_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 0, 1, RetrievalMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rsaKeyValueTypeEClass, RSAKeyValueType.class, "RSAKeyValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRSAKeyValueType_Modulus(), this.getCryptoBinary(), "modulus", null, 1, 1, RSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRSAKeyValueType_Exponent(), this.getCryptoBinary(), "exponent", null, 1, 1, RSAKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureMethodTypeEClass, SignatureMethodType.class, "SignatureMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignatureMethodType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SignatureMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureMethodType_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, SignatureMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signaturePropertiesTypeEClass, SignaturePropertiesType.class, "SignaturePropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignaturePropertiesType_SignatureProperty(), this.getSignaturePropertyType(), null, "signatureProperty", null, 1, -1, SignaturePropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertiesType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignaturePropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signaturePropertyTypeEClass, SignaturePropertyType.class, "SignaturePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignaturePropertyType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SignaturePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SignaturePropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SignaturePropertyType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignaturePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignaturePropertyType_Target(), theXMLTypePackage.getAnyURI(), "target", null, 1, 1, SignaturePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureTypeEClass, SignatureType.class, "SignatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignatureType_SignedInfo(), this.getSignedInfoType(), null, "signedInfo", null, 1, 1, SignatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureType_SignatureValue(), this.getCryptoBinary(), "signatureValue", null, 1, 1, SignatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureType_KeyInfo(), this.getKeyInfoType(), null, "keyInfo", null, 0, 1, SignatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureType_Object(), this.getObjectType(), null, "object", null, 0, -1, SignatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignatureType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signedInfoTypeEClass, SignedInfoType.class, "SignedInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignedInfoType_CanonicalizationMethod(), this.getCanonicalizationMethodType(), null, "canonicalizationMethod", null, 1, 1, SignedInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignedInfoType_SignatureMethod(), this.getSignatureMethodType(), null, "signatureMethod", null, 1, 1, SignedInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignedInfoType_Reference(), this.getReferenceType(), null, "reference", null, 1, -1, SignedInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignedInfoType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SignedInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformsTypeEClass, TransformsType.class, "TransformsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformsType_Transform(), this.getTransformType(), null, "transform", null, 1, -1, TransformsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformTypeEClass, TransformType.class, "TransformType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_XSLT(), theXMLTypePackage.getString(), "xSLT", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_XPath(), theXMLTypePackage.getString(), "xPath", null, 0, -1, TransformType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformType_Algorithm(), theXMLTypePackage.getAnyURI(), "algorithm", null, 1, 1, TransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x509DataTypeEClass, X509DataType.class, "X509DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX509DataType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, X509DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getX509DataType_X509IssuerSerial(), this.getX509IssuerSerialType(), null, "x509IssuerSerial", null, 0, -1, X509DataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType_X509SKI(), this.getCryptoBinary(), "x509SKI", null, 0, -1, X509DataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType_X509SubjectName(), theXMLTypePackage.getString(), "x509SubjectName", null, 0, -1, X509DataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType_X509Certificate(), this.getCryptoBinary(), "x509Certificate", null, 0, -1, X509DataType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509DataType_X509CRL(), this.getCryptoBinary(), "x509CRL", null, 0, 1, X509DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x509IssuerSerialTypeEClass, X509IssuerSerialType.class, "X509IssuerSerialType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX509IssuerSerialType_X509IssuerName(), theXMLTypePackage.getString(), "x509IssuerName", null, 1, 1, X509IssuerSerialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX509IssuerSerialType_X509SerialNumber(), theXMLTypePackage.getInteger(), "x509SerialNumber", null, 1, 1, X509IssuerSerialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(cryptoBinaryEDataType, byte[].class, "CryptoBinary", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (canonicalizationMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CanonicalizationMethod_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCanonicalizationMethodType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getCanonicalizationMethodType_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
		   });		
		addAnnotation
		  (cryptoBinaryEDataType, 
		   source, 
		   new String[] {
			 "name", "CryptoBinary",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#base64Binary"
		   });		
		addAnnotation
		  (digestMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DigestMethod_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDigestMethodType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getDigestMethodType_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
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
		  (getDocumentRoot_CanonicalizationMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CanonicalizationMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DigestMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DigestValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DSAKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HMACOutputLength(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HMACOutputLength",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Manifest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Manifest",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PGPData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPData",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RetrievalMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RetrievalMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RSAKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Signature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Signature",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureProperties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignatureValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SignedInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SPKIData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPKIData",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Transform(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Transforms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transforms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_X509Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509Data",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_X509IssuerSerial(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509IssuerSerial",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dsaKeyValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DSAKeyValue_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDSAKeyValueType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "P",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_Q(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Q",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_G(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "G",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Y",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_J(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "J",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_Seed(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Seed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDSAKeyValueType_PgenCounter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PgenCounter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (keyInfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "KeyInfo_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getKeyInfoType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getKeyInfoType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getKeyInfoType_KeyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyName",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getKeyInfoType_KeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyValue",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getKeyInfoType_RetrievalMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RetrievalMethod",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getKeyInfoType_X509Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509Data",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getKeyInfoType_PGPData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPData",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getKeyInfoType_SPKIData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPKIData",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getKeyInfoType_MgmtData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MgmtData",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getKeyInfoType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (keyValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "KeyValue_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getKeyValueType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getKeyValueType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getKeyValueType_DSAKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getKeyValueType_RSAKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RSAKeyValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (manifestTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Manifest_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getManifestType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getManifestType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (objectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Object_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getObjectType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getObjectType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getObjectType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_Encoding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Encoding"
		   });		
		addAnnotation
		  (getObjectType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (getObjectType_MimeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MimeType"
		   });		
		addAnnotation
		  (pgpDataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PGPData_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPGPDataType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getPGPDataType_PGPKeyID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPKeyID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPGPDataType_PGPKeyPacket(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PGPKeyPacket",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (referenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Reference_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReferenceType_Transforms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transforms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceType_DigestMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceType_DigestValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DigestValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (getReferenceType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });		
		addAnnotation
		  (getReferenceType_URI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "URI"
		   });		
		addAnnotation
		  (retrievalMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RetrievalMethod_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRetrievalMethodType_Transforms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transforms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRetrievalMethodType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });		
		addAnnotation
		  (getRetrievalMethodType_URI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "URI"
		   });		
		addAnnotation
		  (rsaKeyValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RSAKeyValue_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRSAKeyValueType_Modulus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Modulus",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRSAKeyValueType_Exponent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Exponent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (signatureMethodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignatureMethod_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSignatureMethodType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getSignatureMethodType_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
		   });		
		addAnnotation
		  (signaturePropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignatureProperties_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSignaturePropertiesType_SignatureProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignaturePropertiesType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (signaturePropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignatureProperty_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSignaturePropertyType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getSignaturePropertyType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getSignaturePropertyType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getSignaturePropertyType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (getSignaturePropertyType_Target(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Target"
		   });		
		addAnnotation
		  (signatureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Signature_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSignatureType_SignedInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignedInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType_SignatureValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureValue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType_KeyInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeyInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignatureType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (signedInfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SignedInfo_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSignedInfoType_CanonicalizationMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CanonicalizationMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignedInfoType_SignatureMethod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SignatureMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignedInfoType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSignedInfoType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (transformsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Transforms_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransformsType_Transform(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (transformTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Transform_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransformType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTransformType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getTransformType_XSLT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XSLT",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getTransformType_XPath(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XPath",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getTransformType_Algorithm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Algorithm"
		   });		
		addAnnotation
		  (x509DataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "X509Data_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getX509DataType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getX509DataType_X509IssuerSerial(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509IssuerSerial",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType_X509SKI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509SKI",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType_X509SubjectName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509SubjectName",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType_X509Certificate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509Certificate",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getX509DataType_X509CRL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509CRL",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (x509IssuerSerialTypeEClass, 
		   source, 
		   new String[] {
			 "name", "X509IssuerSerial_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getX509IssuerSerialType_X509IssuerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509IssuerName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX509IssuerSerialType_X509SerialNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X509SerialNumber",
			 "namespace", "##targetNamespace"
		   });
	}

} //XmldsigPackageImpl
