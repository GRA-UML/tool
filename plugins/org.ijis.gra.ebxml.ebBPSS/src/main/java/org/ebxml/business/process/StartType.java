/**
 */
package org.ebxml.business.process;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.business.process.StartType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.StartType#getToBusinessState <em>To Business State</em>}</li>
 *   <li>{@link org.ebxml.business.process.StartType#getToBusinessStateIDRef <em>To Business State ID Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.business.process.ProcessPackage#getStartType()
 * @model extendedMetaData="name='Start_._type' kind='elementOnly'"
 * @generated
 */
public interface StartType extends EObject {
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
	 * @see org.ebxml.business.process.ProcessPackage#getStartType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentationType> getDocumentation();

	/**
	 * Returns the value of the '<em><b>To Business State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Business State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Business State</em>' attribute.
	 * @see #setToBusinessState(String)
	 * @see org.ebxml.business.process.ProcessPackage#getStartType_ToBusinessState()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='toBusinessState'"
	 * @generated
	 */
	String getToBusinessState();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.StartType#getToBusinessState <em>To Business State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Business State</em>' attribute.
	 * @see #getToBusinessState()
	 * @generated
	 */
	void setToBusinessState(String value);

	/**
	 * Returns the value of the '<em><b>To Business State ID Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Business State ID Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Business State ID Ref</em>' attribute.
	 * @see #setToBusinessStateIDRef(String)
	 * @see org.ebxml.business.process.ProcessPackage#getStartType_ToBusinessStateIDRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='toBusinessStateIDRef'"
	 * @generated
	 */
	String getToBusinessStateIDRef();

	/**
	 * Sets the value of the '{@link org.ebxml.business.process.StartType#getToBusinessStateIDRef <em>To Business State ID Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Business State ID Ref</em>' attribute.
	 * @see #getToBusinessStateIDRef()
	 * @generated
	 */
	void setToBusinessStateIDRef(String value);

} // StartType
