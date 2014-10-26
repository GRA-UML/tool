/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CompositeListType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CompositeListType#getEncapsulation <em>Encapsulation</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.CompositeListType#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCompositeListType()
 * @model extendedMetaData="name='CompositeList_._type' kind='elementOnly'"
 * @generated
 */
public interface CompositeListType extends EObject {
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCompositeListType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Encapsulation</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.EncapsulationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulation</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCompositeListType_Encapsulation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Encapsulation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EncapsulationType> getEncapsulation();

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.CompositeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getCompositeListType_Composite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Composite' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CompositeType> getComposite();

} // CompositeListType
