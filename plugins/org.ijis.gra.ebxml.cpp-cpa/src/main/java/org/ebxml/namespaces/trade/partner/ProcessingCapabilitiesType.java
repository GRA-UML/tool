/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isGenerate <em>Generate</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isParse <em>Parse</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getProcessingCapabilitiesType()
 * @model extendedMetaData="name='ProcessingCapabilities_._type' kind='empty'"
 * @generated
 */
public interface ProcessingCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate</em>' attribute.
	 * @see #isSetGenerate()
	 * @see #unsetGenerate()
	 * @see #setGenerate(boolean)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getProcessingCapabilitiesType_Generate()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='generate'"
	 * @generated
	 */
	boolean isGenerate();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isGenerate <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate</em>' attribute.
	 * @see #isSetGenerate()
	 * @see #unsetGenerate()
	 * @see #isGenerate()
	 * @generated
	 */
	void setGenerate(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isGenerate <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenerate()
	 * @see #isGenerate()
	 * @see #setGenerate(boolean)
	 * @generated
	 */
	void unsetGenerate();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isGenerate <em>Generate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Generate</em>' attribute is set.
	 * @see #unsetGenerate()
	 * @see #isGenerate()
	 * @see #setGenerate(boolean)
	 * @generated
	 */
	boolean isSetGenerate();

	/**
	 * Returns the value of the '<em><b>Parse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parse</em>' attribute.
	 * @see #isSetParse()
	 * @see #unsetParse()
	 * @see #setParse(boolean)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getProcessingCapabilitiesType_Parse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='parse'"
	 * @generated
	 */
	boolean isParse();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isParse <em>Parse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parse</em>' attribute.
	 * @see #isSetParse()
	 * @see #unsetParse()
	 * @see #isParse()
	 * @generated
	 */
	void setParse(boolean value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isParse <em>Parse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParse()
	 * @see #isParse()
	 * @see #setParse(boolean)
	 * @generated
	 */
	void unsetParse();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType#isParse <em>Parse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parse</em>' attribute is set.
	 * @see #unsetParse()
	 * @see #isParse()
	 * @see #setParse(boolean)
	 * @generated
	 */
	boolean isSetParse();

} // ProcessingCapabilitiesType
