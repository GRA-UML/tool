/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.DocExchangeType;
import org.ebxml.namespaces.trade.partner.EbXMLBindingType;
import org.ebxml.namespaces.trade.partner.PartnerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc Exchange Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocExchangeTypeImpl#getEbXMLBinding <em>Eb XML Binding</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.DocExchangeTypeImpl#getDocExchangeId <em>Doc Exchange Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocExchangeTypeImpl extends MinimalEObjectImpl.Container implements DocExchangeType {
	/**
	 * The cached value of the '{@link #getEbXMLBinding() <em>Eb XML Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEbXMLBinding()
	 * @generated
	 * @ordered
	 */
	protected EbXMLBindingType ebXMLBinding;

	/**
	 * The default value of the '{@link #getDocExchangeId() <em>Doc Exchange Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocExchangeId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_EXCHANGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocExchangeId() <em>Doc Exchange Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocExchangeId()
	 * @generated
	 * @ordered
	 */
	protected String docExchangeId = DOC_EXCHANGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocExchangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.DOC_EXCHANGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EbXMLBindingType getEbXMLBinding() {
		return ebXMLBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEbXMLBinding(EbXMLBindingType newEbXMLBinding, NotificationChain msgs) {
		EbXMLBindingType oldEbXMLBinding = ebXMLBinding;
		ebXMLBinding = newEbXMLBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartnerPackage.DOC_EXCHANGE_TYPE__EB_XML_BINDING, oldEbXMLBinding, newEbXMLBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEbXMLBinding(EbXMLBindingType newEbXMLBinding) {
		if (newEbXMLBinding != ebXMLBinding) {
			NotificationChain msgs = null;
			if (ebXMLBinding != null)
				msgs = ((InternalEObject)ebXMLBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.DOC_EXCHANGE_TYPE__EB_XML_BINDING, null, msgs);
			if (newEbXMLBinding != null)
				msgs = ((InternalEObject)newEbXMLBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartnerPackage.DOC_EXCHANGE_TYPE__EB_XML_BINDING, null, msgs);
			msgs = basicSetEbXMLBinding(newEbXMLBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.DOC_EXCHANGE_TYPE__EB_XML_BINDING, newEbXMLBinding, newEbXMLBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocExchangeId() {
		return docExchangeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocExchangeId(String newDocExchangeId) {
		String oldDocExchangeId = docExchangeId;
		docExchangeId = newDocExchangeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.DOC_EXCHANGE_TYPE__DOC_EXCHANGE_ID, oldDocExchangeId, docExchangeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartnerPackage.DOC_EXCHANGE_TYPE__EB_XML_BINDING:
				return basicSetEbXMLBinding(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartnerPackage.DOC_EXCHANGE_TYPE__EB_XML_BINDING:
				return getEbXMLBinding();
			case PartnerPackage.DOC_EXCHANGE_TYPE__DOC_EXCHANGE_ID:
				return getDocExchangeId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartnerPackage.DOC_EXCHANGE_TYPE__EB_XML_BINDING:
				setEbXMLBinding((EbXMLBindingType)newValue);
				return;
			case PartnerPackage.DOC_EXCHANGE_TYPE__DOC_EXCHANGE_ID:
				setDocExchangeId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PartnerPackage.DOC_EXCHANGE_TYPE__EB_XML_BINDING:
				setEbXMLBinding((EbXMLBindingType)null);
				return;
			case PartnerPackage.DOC_EXCHANGE_TYPE__DOC_EXCHANGE_ID:
				setDocExchangeId(DOC_EXCHANGE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PartnerPackage.DOC_EXCHANGE_TYPE__EB_XML_BINDING:
				return ebXMLBinding != null;
			case PartnerPackage.DOC_EXCHANGE_TYPE__DOC_EXCHANGE_ID:
				return DOC_EXCHANGE_ID_EDEFAULT == null ? docExchangeId != null : !DOC_EXCHANGE_ID_EDEFAULT.equals(docExchangeId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (docExchangeId: ");
		result.append(docExchangeId);
		result.append(')');
		return result.toString();
	}

} //DocExchangeTypeImpl
