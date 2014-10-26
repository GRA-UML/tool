/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encapsulation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getConstituent <em>Constituent</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getId <em>Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getMimeparameters <em>Mimeparameters</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getMimetype <em>Mimetype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEncapsulationType()
 * @model extendedMetaData="name='Encapsulation_._type' kind='elementOnly'"
 * @generated
 */
public interface EncapsulationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Constituent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constituent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constituent</em>' containment reference.
	 * @see #setConstituent(ConstituentType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEncapsulationType_Constituent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Constituent' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstituentType getConstituent();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getConstituent <em>Constituent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constituent</em>' containment reference.
	 * @see #getConstituent()
	 * @generated
	 */
	void setConstituent(ConstituentType value);

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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEncapsulationType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getId <em>Id</em>}' attribute.
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEncapsulationType_Mimeparameters()
	 * @model dataType="org.ebxml.namespaces.trade.partner.NonEmptyString"
	 *        extendedMetaData="kind='attribute' name='mimeparameters'"
	 * @generated
	 */
	String getMimeparameters();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getMimeparameters <em>Mimeparameters</em>}' attribute.
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
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getEncapsulationType_Mimetype()
	 * @model dataType="org.ebxml.namespaces.trade.partner.NonEmptyString" required="true"
	 *        extendedMetaData="kind='attribute' name='mimetype'"
	 * @generated
	 */
	String getMimetype();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.EncapsulationType#getMimetype <em>Mimetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mimetype</em>' attribute.
	 * @see #getMimetype()
	 * @generated
	 */
	void setMimetype(String value);

} // EncapsulationType
