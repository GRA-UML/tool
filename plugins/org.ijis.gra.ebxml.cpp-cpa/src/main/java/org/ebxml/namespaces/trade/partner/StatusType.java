/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.StatusType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getStatusType()
 * @model extendedMetaData="name='Status_._type' kind='empty'"
 * @generated
 */
public interface StatusType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ebxml.namespaces.trade.partner.StatusValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.StatusValueType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(StatusValueType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getStatusType_Value()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	StatusValueType getValue();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.StatusType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.ebxml.namespaces.trade.partner.StatusValueType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(StatusValueType value);

	/**
	 * Unsets the value of the '{@link org.ebxml.namespaces.trade.partner.StatusType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(StatusValueType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.ebxml.namespaces.trade.partner.StatusType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(StatusValueType)
	 * @generated
	 */
	boolean isSetValue();

} // StatusType
