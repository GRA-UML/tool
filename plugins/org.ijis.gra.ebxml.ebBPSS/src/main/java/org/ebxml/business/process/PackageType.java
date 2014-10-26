/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.PackageType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.PackageType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ebxml.business.process.PackageType#getPackage <em>Package</em>}</li>
 *   <li>{@link org.ebxml.business.process.PackageType#getBinaryCollaboration <em>Binary Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.PackageType#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link org.ebxml.business.process.PackageType#getMultiPartyCollaboration <em>Multi Party Collaboration</em>}</li>
 *   <li>{@link org.ebxml.business.process.PackageType#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.PackageType#getNameID <em>Name ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getPackageType()
 * @model extendedMetaData="name='Package_._type' kind='elementOnly'"
 * @generated
 */
public interface PackageType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getPackageType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

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
	 * @see org.ebxml.business.process.ProcessPackage#getPackageType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see org.ebxml.business.process.ProcessPackage#getPackageType_Package()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Package' namespace='##targetNamespace' group='#group:1'"
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
	 * @see org.ebxml.business.process.ProcessPackage#getPackageType_BinaryCollaboration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinaryCollaboration' namespace='##targetNamespace' group='#group:1'"
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
	 * @see org.ebxml.business.process.ProcessPackage#getPackageType_BusinessTransaction()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusinessTransaction' namespace='##targetNamespace' group='#group:1'"
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
	 * @see org.ebxml.business.process.ProcessPackage#getPackageType_MultiPartyCollaboration()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiPartyCollaboration' namespace='##targetNamespace' group='#group:1'"
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
	 * @see org.ebxml.business.process.ProcessPackage#getPackageType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.PackageType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name ID</em>' attribute.
	 * @see #setNameID(String)
	 * @see org.ebxml.business.process.ProcessPackage#getPackageType_NameID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='nameID'"
	 * @generated
	 */
	String getNameID();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.PackageType#getNameID <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ID</em>' attribute.
	 * @see #getNameID()
	 * @generated
	 */
	void setNameID(String value);

} // PackageType
