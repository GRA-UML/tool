/**
 */
package org.w3._2000._09.xmldsig.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.X509DataType;
import org.w3._2000._09.xmldsig.X509IssuerSerialType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>X509 Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.X509DataTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.X509DataTypeImpl#getX509IssuerSerial <em>X509 Issuer Serial</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.X509DataTypeImpl#getX509SKI <em>X509SKI</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.X509DataTypeImpl#getX509SubjectName <em>X509 Subject Name</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.X509DataTypeImpl#getX509Certificate <em>X509 Certificate</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.X509DataTypeImpl#getX509CRL <em>X509CRL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class X509DataTypeImpl extends MinimalEObjectImpl.Container implements X509DataType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getX509CRL() <em>X509CRL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX509CRL()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] X509_CRL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX509CRL() <em>X509CRL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX509CRL()
	 * @generated
	 * @ordered
	 */
	protected byte[] x509CRL = X509_CRL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected X509DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.X509_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XmldsigPackage.X509_DATA_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<X509IssuerSerialType> getX509IssuerSerial() {
		return getGroup().list(XmldsigPackage.Literals.X509_DATA_TYPE__X509_ISSUER_SERIAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<byte[]> getX509SKI() {
		return getGroup().list(XmldsigPackage.Literals.X509_DATA_TYPE__X509_SKI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getX509SubjectName() {
		return getGroup().list(XmldsigPackage.Literals.X509_DATA_TYPE__X509_SUBJECT_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<byte[]> getX509Certificate() {
		return getGroup().list(XmldsigPackage.Literals.X509_DATA_TYPE__X509_CERTIFICATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getX509CRL() {
		return x509CRL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX509CRL(byte[] newX509CRL) {
		byte[] oldX509CRL = x509CRL;
		x509CRL = newX509CRL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.X509_DATA_TYPE__X509_CRL, oldX509CRL, x509CRL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmldsigPackage.X509_DATA_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XmldsigPackage.X509_DATA_TYPE__X509_ISSUER_SERIAL:
				return ((InternalEList<?>)getX509IssuerSerial()).basicRemove(otherEnd, msgs);
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
			case XmldsigPackage.X509_DATA_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XmldsigPackage.X509_DATA_TYPE__X509_ISSUER_SERIAL:
				return getX509IssuerSerial();
			case XmldsigPackage.X509_DATA_TYPE__X509_SKI:
				return getX509SKI();
			case XmldsigPackage.X509_DATA_TYPE__X509_SUBJECT_NAME:
				return getX509SubjectName();
			case XmldsigPackage.X509_DATA_TYPE__X509_CERTIFICATE:
				return getX509Certificate();
			case XmldsigPackage.X509_DATA_TYPE__X509_CRL:
				return getX509CRL();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmldsigPackage.X509_DATA_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XmldsigPackage.X509_DATA_TYPE__X509_ISSUER_SERIAL:
				getX509IssuerSerial().clear();
				getX509IssuerSerial().addAll((Collection<? extends X509IssuerSerialType>)newValue);
				return;
			case XmldsigPackage.X509_DATA_TYPE__X509_SKI:
				getX509SKI().clear();
				getX509SKI().addAll((Collection<? extends byte[]>)newValue);
				return;
			case XmldsigPackage.X509_DATA_TYPE__X509_SUBJECT_NAME:
				getX509SubjectName().clear();
				getX509SubjectName().addAll((Collection<? extends String>)newValue);
				return;
			case XmldsigPackage.X509_DATA_TYPE__X509_CERTIFICATE:
				getX509Certificate().clear();
				getX509Certificate().addAll((Collection<? extends byte[]>)newValue);
				return;
			case XmldsigPackage.X509_DATA_TYPE__X509_CRL:
				setX509CRL((byte[])newValue);
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
			case XmldsigPackage.X509_DATA_TYPE__GROUP:
				getGroup().clear();
				return;
			case XmldsigPackage.X509_DATA_TYPE__X509_ISSUER_SERIAL:
				getX509IssuerSerial().clear();
				return;
			case XmldsigPackage.X509_DATA_TYPE__X509_SKI:
				getX509SKI().clear();
				return;
			case XmldsigPackage.X509_DATA_TYPE__X509_SUBJECT_NAME:
				getX509SubjectName().clear();
				return;
			case XmldsigPackage.X509_DATA_TYPE__X509_CERTIFICATE:
				getX509Certificate().clear();
				return;
			case XmldsigPackage.X509_DATA_TYPE__X509_CRL:
				setX509CRL(X509_CRL_EDEFAULT);
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
			case XmldsigPackage.X509_DATA_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XmldsigPackage.X509_DATA_TYPE__X509_ISSUER_SERIAL:
				return !getX509IssuerSerial().isEmpty();
			case XmldsigPackage.X509_DATA_TYPE__X509_SKI:
				return !getX509SKI().isEmpty();
			case XmldsigPackage.X509_DATA_TYPE__X509_SUBJECT_NAME:
				return !getX509SubjectName().isEmpty();
			case XmldsigPackage.X509_DATA_TYPE__X509_CERTIFICATE:
				return !getX509Certificate().isEmpty();
			case XmldsigPackage.X509_DATA_TYPE__X509_CRL:
				return X509_CRL_EDEFAULT == null ? x509CRL != null : !X509_CRL_EDEFAULT.equals(x509CRL);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", x509CRL: ");
		result.append(x509CRL);
		result.append(')');
		return result.toString();
	}

} //X509DataTypeImpl
