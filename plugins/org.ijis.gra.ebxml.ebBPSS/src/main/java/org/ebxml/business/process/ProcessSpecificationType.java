/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getSubstitutionSet <em>Substitution Set</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getInclude <em>Include</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getBusinessDocument <em>Business Document</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getProcessSpecification <em>Process Specification</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getPackage <em>Package</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getBinaryCollaboration <em>Binary Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getMultiPartyCollaboration <em>Multi Party Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.ebxml.business.process.ProcessSpecificationType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType()
 * @model extendedMetaData="name='ProcessSpecification_._type' kind='elementOnly'"
 * @generated
 */
public interface ProcessSpecificationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.DocumentationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Substitution Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.SubstitutionSetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution Set</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_SubstitutionSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubstitutionSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstitutionSetType> getSubstitutionSet();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:2'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.IncludeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_Include()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Include' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<IncludeType> getInclude();

	/**
	 * Returns the value of the '<em><b>Business Document</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.BusinessDocumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Document</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_BusinessDocument()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessDocument' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<BusinessDocumentType> getBusinessDocument();

	/**
	 * Returns the value of the '<em><b>Process Specification</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.ProcessSpecificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Specification</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_ProcessSpecification()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProcessSpecification' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<ProcessSpecificationType> getProcessSpecification();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.PackageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_Package()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Package' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<PackageType> getPackage();

	/**
	 * Returns the value of the '<em><b>Binary Collaboration</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.BinaryCollaborationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Collaboration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Collaboration</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_BinaryCollaboration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinaryCollaboration' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<BinaryCollaborationType> getBinaryCollaboration();

	/**
	 * Returns the value of the '<em><b>Business Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.BusinessTransactionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Transaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Transaction</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_BusinessTransaction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessTransaction' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<BusinessTransactionType> getBusinessTransaction();

	/**
	 * Returns the value of the '<em><b>Multi Party Collaboration</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.business.process.MultiPartyCollaborationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Party Collaboration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Party Collaboration</em>' containment reference list.
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_MultiPartyCollaboration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiPartyCollaboration' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<MultiPartyCollaborationType> getMultiPartyCollaboration();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.ProcessSpecificationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_Uuid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.ProcessSpecificationType#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.ebxml.business.process.ProcessPackage#getProcessSpecificationType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.ProcessSpecificationType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // ProcessSpecificationType
