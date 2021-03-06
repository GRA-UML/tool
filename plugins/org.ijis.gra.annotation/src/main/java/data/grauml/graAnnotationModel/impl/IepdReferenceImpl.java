/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.IepdReference;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iepd Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.IepdReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.IepdReferenceImpl#getIepdurl <em>Iepdurl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IepdReferenceImpl extends MinimalEObjectImpl.Container implements IepdReference {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIepdurl() <em>Iepdurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIepdurl()
	 * @generated
	 * @ordered
	 */
	protected static final String IEPDURL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIepdurl() <em>Iepdurl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIepdurl()
	 * @generated
	 * @ordered
	 */
	protected String iepdurl = IEPDURL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IepdReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.IEPD_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.IEPD_REFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIepdurl() {
		return iepdurl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIepdurl(String newIepdurl) {
		String oldIepdurl = iepdurl;
		iepdurl = newIepdurl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.IEPD_REFERENCE__IEPDURL, oldIepdurl, iepdurl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraAnnotationModelPackage.IEPD_REFERENCE__NAME:
				return getName();
			case GraAnnotationModelPackage.IEPD_REFERENCE__IEPDURL:
				return getIepdurl();
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
			case GraAnnotationModelPackage.IEPD_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case GraAnnotationModelPackage.IEPD_REFERENCE__IEPDURL:
				setIepdurl((String)newValue);
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
			case GraAnnotationModelPackage.IEPD_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraAnnotationModelPackage.IEPD_REFERENCE__IEPDURL:
				setIepdurl(IEPDURL_EDEFAULT);
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
			case GraAnnotationModelPackage.IEPD_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraAnnotationModelPackage.IEPD_REFERENCE__IEPDURL:
				return IEPDURL_EDEFAULT == null ? iepdurl != null : !IEPDURL_EDEFAULT.equals(iepdurl);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", iepdurl: ");
		result.append(iepdurl);
		result.append(')');
		return result.toString();
	}

} //IepdReferenceImpl
