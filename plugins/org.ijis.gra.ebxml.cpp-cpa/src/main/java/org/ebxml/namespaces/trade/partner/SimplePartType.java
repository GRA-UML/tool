/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Part Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.SimplePartType#getNamespaceSupported <em>Namespace Supported</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.SimplePartType#getId <em>Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.SimplePartType#getMimeparameters <em>Mimeparameters</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.SimplePartType#getMimetype <em>Mimetype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getSimplePartType()
 * @model extendedMetaData="name='SimplePart_._type' kind='elementOnly'"
 * @generated
 */
public interface SimplePartType extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace Supported</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.NamespaceSupportedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Supported</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Supported</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getSimplePartType_NamespaceSupported()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NamespaceSupported' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NamespaceSupportedType> getNamespaceSupported();

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getSimplePartType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.SimplePartType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Mimeparameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mimeparameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mimeparameters</em>' attribute.
	 * @see #setMimeparameters(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getSimplePartType_Mimeparameters()
	 * @model dataType="org.ebxml.namespaces.trade.partner.NonEmptyString"
	 *        extendedMetaData="kind='attribute' name='mimeparameters'"
	 * @generated
	 */
	String getMimeparameters();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.SimplePartType#getMimeparameters <em>Mimeparameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mimeparameters</em>' attribute.
	 * @see #getMimeparameters()
	 * @generated
	 */
	void setMimeparameters(String value);

	/**
	 * Returns the value of the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mimetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mimetype</em>' attribute.
	 * @see #setMimetype(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getSimplePartType_Mimetype()
	 * @model dataType="org.ebxml.namespaces.trade.partner.NonEmptyString" required="true"
	 *        extendedMetaData="kind='attribute' name='mimetype'"
	 * @generated
	 */
	String getMimetype();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.SimplePartType#getMimetype <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mimetype</em>' attribute.
	 * @see #getMimetype()
	 * @generated
	 */
	void setMimetype(String value);

} // SimplePartType
