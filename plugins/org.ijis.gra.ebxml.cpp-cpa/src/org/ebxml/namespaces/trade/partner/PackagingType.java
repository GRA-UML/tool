/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaging Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.PackagingType#getProcessingCapabilities <em>Processing Capabilities</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.PackagingType#getSimplePart <em>Simple Part</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.PackagingType#getCompositeList <em>Composite List</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.PackagingType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPackagingType()
 * @model extendedMetaData="name='Packaging_._type' kind='elementOnly'"
 * @generated
 */
public interface PackagingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Processing Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Capabilities</em>' containment reference.
	 * @see #setProcessingCapabilities(ProcessingCapabilitiesType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPackagingType_ProcessingCapabilities()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ProcessingCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessingCapabilitiesType getProcessingCapabilities();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.PackagingType#getProcessingCapabilities <em>Processing Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Capabilities</em>' containment reference.
	 * @see #getProcessingCapabilities()
	 * @generated
	 */
	void setProcessingCapabilities(ProcessingCapabilitiesType value);

	/**
	 * Returns the value of the '<em><b>Simple Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.SimplePartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Part</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPackagingType_SimplePart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SimplePart' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SimplePartType> getSimplePart();

	/**
	 * Returns the value of the '<em><b>Composite List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite List</em>' containment reference.
	 * @see #setCompositeList(CompositeListType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPackagingType_CompositeList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CompositeList' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositeListType getCompositeList();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.PackagingType#getCompositeList <em>Composite List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite List</em>' containment reference.
	 * @see #getCompositeList()
	 * @generated
	 */
	void setCompositeList(CompositeListType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getPackagingType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.PackagingType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PackagingType
