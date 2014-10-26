/**
 */
package org.ebxml.namespaces.trade.partner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ServiceBindingType#getService <em>Service</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ServiceBindingType#getOverride <em>Override</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ServiceBindingType#getChannelId <em>Channel Id</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.ServiceBindingType#getPackageId <em>Package Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getServiceBindingType()
 * @model extendedMetaData="name='ServiceBinding_._type' kind='elementOnly'"
 * @generated
 */
public interface ServiceBindingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(ServiceType)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getServiceBindingType_Service()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Service' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceType getService();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ServiceBindingType#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Override</b></em>' containment reference list.
	 * The list contents are of type {@link org.ebxml.namespaces.trade.partner.OverrideType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override</em>' containment reference list.
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getServiceBindingType_Override()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Override' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OverrideType> getOverride();

	/**
	 * Returns the value of the '<em><b>Channel Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Id</em>' attribute.
	 * @see #setChannelId(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getServiceBindingType_ChannelId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='channelId'"
	 * @generated
	 */
	String getChannelId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ServiceBindingType#getChannelId <em>Channel Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Id</em>' attribute.
	 * @see #getChannelId()
	 * @generated
	 */
	void setChannelId(String value);

	/**
	 * Returns the value of the '<em><b>Package Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Id</em>' attribute.
	 * @see #setPackageId(String)
	 * @see org.ebxml.namespaces.trade.partner.PartnerPackage#getServiceBindingType_PackageId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='packageId'"
	 * @generated
	 */
	String getPackageId();

	/**
	 * Sets the value of the '{@link org.ebxml.namespaces.trade.partner.ServiceBindingType#getPackageId <em>Package Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Id</em>' attribute.
	 * @see #getPackageId()
	 * @generated
	 */
	void setPackageId(String value);

} // ServiceBindingType
