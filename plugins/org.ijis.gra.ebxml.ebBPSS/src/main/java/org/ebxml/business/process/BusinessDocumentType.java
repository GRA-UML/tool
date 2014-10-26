/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.BusinessDocumentType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessDocumentType#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessDocumentType#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessDocumentType#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessDocumentType#getSpecificationElement <em>Specification Element</em>}</li>
 *   <li>{@link org.ebxml.business.process.BusinessDocumentType#getSpecificationLocation <em>Specification Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getBusinessDocumentType()
 * @model extendedMetaData="name='BusinessDocument_._type' kind='elementOnly'"
 * @generated
 */
public interface BusinessDocumentType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessDocumentType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expression</em>' containment reference.
	 * @see #setConditionExpression(ConditionExpressionType)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessDocumentType_ConditionExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionExpressionType getConditionExpression();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessDocumentType#getConditionExpression <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' containment reference.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(ConditionExpressionType value);

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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessDocumentType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessDocumentType#getName <em>Name</em>}' attribute.
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
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessDocumentType_NameID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='nameID'"
	 * @generated
	 */
	String getNameID();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessDocumentType#getNameID <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ID</em>' attribute.
	 * @see #getNameID()
	 * @generated
	 */
	void setNameID(String value);

	/**
	 * Returns the value of the '<em><b>Specification Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Element</em>' attribute.
	 * @see #setSpecificationElement(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessDocumentType_SpecificationElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specificationElement'"
	 * @generated
	 */
	String getSpecificationElement();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessDocumentType#getSpecificationElement <em>Specification Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Element</em>' attribute.
	 * @see #getSpecificationElement()
	 * @generated
	 */
	void setSpecificationElement(String value);

	/**
	 * Returns the value of the '<em><b>Specification Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Location</em>' attribute.
	 * @see #setSpecificationLocation(String)
	 * @see org.ebxml.business.process.ProcessPackage#getBusinessDocumentType_SpecificationLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='specificationLocation'"
	 * @generated
	 */
	String getSpecificationLocation();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.BusinessDocumentType#getSpecificationLocation <em>Specification Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Location</em>' attribute.
	 * @see #getSpecificationLocation()
	 * @generated
	 */
	void setSpecificationLocation(String value);

} // BusinessDocumentType
