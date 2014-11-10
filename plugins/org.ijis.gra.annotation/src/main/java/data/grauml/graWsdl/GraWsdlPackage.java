/**
 */
package data.grauml.graWsdl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see data.grauml.graWsdl.GraWsdlFactory
 * @model kind="package"
 * @generated
 */
public interface GraWsdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graWsdl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ijis.org/GRA/WSDLAnnotations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graw";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraWsdlPackage eINSTANCE = data.grauml.graWsdl.impl.GraWsdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.impl.WsdlInterfaceImpl <em>Wsdl Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.impl.WsdlInterfaceImpl
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlInterface()
	 * @generated
	 */
	int WSDL_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__NAME = GraAnnotationModelPackage.INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__DOCUMENTATION = GraAnnotationModelPackage.INTERFACE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__TEMPLATE = GraAnnotationModelPackage.INTERFACE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__REQUIREMENT = GraAnnotationModelPackage.INTERFACE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__MODEL_REFERENCE = GraAnnotationModelPackage.INTERFACE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__FLAG = GraAnnotationModelPackage.INTERFACE__FLAG;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__DIAGNOSTICS = GraAnnotationModelPackage.INTERFACE__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__OPERATION = GraAnnotationModelPackage.INTERFACE__OPERATION;

	/**
	 * The feature id for the '<em><b>Binding Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE__BINDING_CODE = GraAnnotationModelPackage.INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wsdl Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE_FEATURE_COUNT = GraAnnotationModelPackage.INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wsdl Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_INTERFACE_OPERATION_COUNT = GraAnnotationModelPackage.INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.impl.WsdlOperationImpl <em>Wsdl Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.impl.WsdlOperationImpl
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlOperation()
	 * @generated
	 */
	int WSDL_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__NAME = GraAnnotationModelPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__DOCUMENTATION = GraAnnotationModelPackage.OPERATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__TEMPLATE = GraAnnotationModelPackage.OPERATION__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__REQUIREMENT = GraAnnotationModelPackage.OPERATION__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__MODEL_REFERENCE = GraAnnotationModelPackage.OPERATION__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__FLAG = GraAnnotationModelPackage.OPERATION__FLAG;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__DIAGNOSTICS = GraAnnotationModelPackage.OPERATION__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__PARAMETER = GraAnnotationModelPackage.OPERATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Message Exchange Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__MESSAGE_EXCHANGE_PATTERN = GraAnnotationModelPackage.OPERATION__MESSAGE_EXCHANGE_PATTERN;

	/**
	 * The feature id for the '<em><b>Is Asynchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__IS_ASYNCHRONOUS = GraAnnotationModelPackage.OPERATION__IS_ASYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__ACTION_NAME = GraAnnotationModelPackage.OPERATION__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Action Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__ACTION_PURPOSE = GraAnnotationModelPackage.OPERATION__ACTION_PURPOSE;

	/**
	 * The feature id for the '<em><b>Action Provenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__ACTION_PROVENANCE = GraAnnotationModelPackage.OPERATION__ACTION_PROVENANCE;

	/**
	 * The feature id for the '<em><b>Operation Kind Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION__OPERATION_KIND_CODE = GraAnnotationModelPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wsdl Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION_FEATURE_COUNT = GraAnnotationModelPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wsdl Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_OPERATION_OPERATION_COUNT = GraAnnotationModelPackage.OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.impl.WsdlMessageImpl <em>Wsdl Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.impl.WsdlMessageImpl
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlMessage()
	 * @generated
	 */
	int WSDL_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__NAME = GraAnnotationModelPackage.MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__DOCUMENTATION = GraAnnotationModelPackage.MESSAGE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__TEMPLATE = GraAnnotationModelPackage.MESSAGE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__REQUIREMENT = GraAnnotationModelPackage.MESSAGE__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__MODEL_REFERENCE = GraAnnotationModelPackage.MESSAGE__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__FLAG = GraAnnotationModelPackage.MESSAGE__FLAG;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__DIAGNOSTICS = GraAnnotationModelPackage.MESSAGE__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__PREFIX = GraAnnotationModelPackage.MESSAGE__PREFIX;

	/**
	 * The feature id for the '<em><b>Element Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__ELEMENT_PREFIX = GraAnnotationModelPackage.MESSAGE__ELEMENT_PREFIX;

	/**
	 * The feature id for the '<em><b>Element Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__ELEMENT_MODEL_REFERENCE = GraAnnotationModelPackage.MESSAGE__ELEMENT_MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__ELEMENT_NAME = GraAnnotationModelPackage.MESSAGE__ELEMENT_NAME;

	/**
	 * The feature id for the '<em><b>Message Location Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE__MESSAGE_LOCATION_CODE = GraAnnotationModelPackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wsdl Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE_FEATURE_COUNT = GraAnnotationModelPackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wsdl Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_MESSAGE_OPERATION_COUNT = GraAnnotationModelPackage.MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.impl.WsdlParameterImpl <em>Wsdl Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.impl.WsdlParameterImpl
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlParameter()
	 * @generated
	 */
	int WSDL_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__NAME = GraAnnotationModelPackage.PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__DOCUMENTATION = GraAnnotationModelPackage.PARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__TEMPLATE = GraAnnotationModelPackage.PARAMETER__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__REQUIREMENT = GraAnnotationModelPackage.PARAMETER__REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__MODEL_REFERENCE = GraAnnotationModelPackage.PARAMETER__MODEL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__FLAG = GraAnnotationModelPackage.PARAMETER__FLAG;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__DIAGNOSTICS = GraAnnotationModelPackage.PARAMETER__DIAGNOSTICS;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__USE = GraAnnotationModelPackage.PARAMETER__USE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__MESSAGE = GraAnnotationModelPackage.PARAMETER__MESSAGE;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER__MIME_TYPE = GraAnnotationModelPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wsdl Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER_FEATURE_COUNT = GraAnnotationModelPackage.PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wsdl Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSDL_PARAMETER_OPERATION_COUNT = GraAnnotationModelPackage.PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.BindingType <em>Binding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.BindingType
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getBindingType()
	 * @generated
	 */
	int BINDING_TYPE = 4;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.OperationKind <em>Operation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.OperationKind
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getOperationKind()
	 * @generated
	 */
	int OPERATION_KIND = 5;

	/**
	 * The meta object id for the '{@link data.grauml.graWsdl.MessageLocation <em>Message Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see data.grauml.graWsdl.MessageLocation
	 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getMessageLocation()
	 * @generated
	 */
	int MESSAGE_LOCATION = 6;


	/**
	 * Returns the meta object for class '{@link data.grauml.graWsdl.WsdlInterface <em>Wsdl Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Interface</em>'.
	 * @see data.grauml.graWsdl.WsdlInterface
	 * @generated
	 */
	EClass getWsdlInterface();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graWsdl.WsdlInterface#getBindingCode <em>Binding Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Code</em>'.
	 * @see data.grauml.graWsdl.WsdlInterface#getBindingCode()
	 * @see #getWsdlInterface()
	 * @generated
	 */
	EAttribute getWsdlInterface_BindingCode();

	/**
	 * Returns the meta object for class '{@link data.grauml.graWsdl.WsdlOperation <em>Wsdl Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Operation</em>'.
	 * @see data.grauml.graWsdl.WsdlOperation
	 * @generated
	 */
	EClass getWsdlOperation();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graWsdl.WsdlOperation#getOperationKindCode <em>Operation Kind Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Kind Code</em>'.
	 * @see data.grauml.graWsdl.WsdlOperation#getOperationKindCode()
	 * @see #getWsdlOperation()
	 * @generated
	 */
	EAttribute getWsdlOperation_OperationKindCode();

	/**
	 * Returns the meta object for class '{@link data.grauml.graWsdl.WsdlMessage <em>Wsdl Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Message</em>'.
	 * @see data.grauml.graWsdl.WsdlMessage
	 * @generated
	 */
	EClass getWsdlMessage();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graWsdl.WsdlMessage#getMessageLocationCode <em>Message Location Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Location Code</em>'.
	 * @see data.grauml.graWsdl.WsdlMessage#getMessageLocationCode()
	 * @see #getWsdlMessage()
	 * @generated
	 */
	EAttribute getWsdlMessage_MessageLocationCode();

	/**
	 * Returns the meta object for class '{@link data.grauml.graWsdl.WsdlParameter <em>Wsdl Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsdl Parameter</em>'.
	 * @see data.grauml.graWsdl.WsdlParameter
	 * @generated
	 */
	EClass getWsdlParameter();

	/**
	 * Returns the meta object for the attribute '{@link data.grauml.graWsdl.WsdlParameter#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see data.grauml.graWsdl.WsdlParameter#getMimeType()
	 * @see #getWsdlParameter()
	 * @generated
	 */
	EAttribute getWsdlParameter_MimeType();

	/**
	 * Returns the meta object for enum '{@link data.grauml.graWsdl.BindingType <em>Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Type</em>'.
	 * @see data.grauml.graWsdl.BindingType
	 * @generated
	 */
	EEnum getBindingType();

	/**
	 * Returns the meta object for enum '{@link data.grauml.graWsdl.OperationKind <em>Operation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Kind</em>'.
	 * @see data.grauml.graWsdl.OperationKind
	 * @generated
	 */
	EEnum getOperationKind();

	/**
	 * Returns the meta object for enum '{@link data.grauml.graWsdl.MessageLocation <em>Message Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Location</em>'.
	 * @see data.grauml.graWsdl.MessageLocation
	 * @generated
	 */
	EEnum getMessageLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraWsdlFactory getGraWsdlFactory();

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
		 * The meta object literal for the '{@link data.grauml.graWsdl.impl.WsdlInterfaceImpl <em>Wsdl Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.impl.WsdlInterfaceImpl
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlInterface()
		 * @generated
		 */
		EClass WSDL_INTERFACE = eINSTANCE.getWsdlInterface();

		/**
		 * The meta object literal for the '<em><b>Binding Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_INTERFACE__BINDING_CODE = eINSTANCE.getWsdlInterface_BindingCode();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.impl.WsdlOperationImpl <em>Wsdl Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.impl.WsdlOperationImpl
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlOperation()
		 * @generated
		 */
		EClass WSDL_OPERATION = eINSTANCE.getWsdlOperation();

		/**
		 * The meta object literal for the '<em><b>Operation Kind Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_OPERATION__OPERATION_KIND_CODE = eINSTANCE.getWsdlOperation_OperationKindCode();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.impl.WsdlMessageImpl <em>Wsdl Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.impl.WsdlMessageImpl
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlMessage()
		 * @generated
		 */
		EClass WSDL_MESSAGE = eINSTANCE.getWsdlMessage();

		/**
		 * The meta object literal for the '<em><b>Message Location Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_MESSAGE__MESSAGE_LOCATION_CODE = eINSTANCE.getWsdlMessage_MessageLocationCode();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.impl.WsdlParameterImpl <em>Wsdl Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.impl.WsdlParameterImpl
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getWsdlParameter()
		 * @generated
		 */
		EClass WSDL_PARAMETER = eINSTANCE.getWsdlParameter();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WSDL_PARAMETER__MIME_TYPE = eINSTANCE.getWsdlParameter_MimeType();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.BindingType <em>Binding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.BindingType
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getBindingType()
		 * @generated
		 */
		EEnum BINDING_TYPE = eINSTANCE.getBindingType();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.OperationKind <em>Operation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.OperationKind
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getOperationKind()
		 * @generated
		 */
		EEnum OPERATION_KIND = eINSTANCE.getOperationKind();

		/**
		 * The meta object literal for the '{@link data.grauml.graWsdl.MessageLocation <em>Message Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see data.grauml.graWsdl.MessageLocation
		 * @see data.grauml.graWsdl.impl.GraWsdlPackageImpl#getMessageLocation()
		 * @generated
		 */
		EEnum MESSAGE_LOCATION = eINSTANCE.getMessageLocation();

	}

} //GraWsdlPackage
