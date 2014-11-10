/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.Description;
import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.DescriptionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.DescriptionImpl#getExternalDocumentation <em>External Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptionImpl extends MinimalEObjectImpl.Container implements Description {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalDocumentation() <em>External Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDocumentation() <em>External Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String externalDocumentation = EXTERNAL_DOCUMENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.DESCRIPTION__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalDocumentation() {
		return externalDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDocumentation(String newExternalDocumentation) {
		String oldExternalDocumentation = externalDocumentation;
		externalDocumentation = newExternalDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.DESCRIPTION__EXTERNAL_DOCUMENTATION, oldExternalDocumentation, externalDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraAnnotationModelPackage.DESCRIPTION__DOCUMENTATION:
				return getDocumentation();
			case GraAnnotationModelPackage.DESCRIPTION__EXTERNAL_DOCUMENTATION:
				return getExternalDocumentation();
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
			case GraAnnotationModelPackage.DESCRIPTION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case GraAnnotationModelPackage.DESCRIPTION__EXTERNAL_DOCUMENTATION:
				setExternalDocumentation((String)newValue);
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
			case GraAnnotationModelPackage.DESCRIPTION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.DESCRIPTION__EXTERNAL_DOCUMENTATION:
				setExternalDocumentation(EXTERNAL_DOCUMENTATION_EDEFAULT);
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
			case GraAnnotationModelPackage.DESCRIPTION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case GraAnnotationModelPackage.DESCRIPTION__EXTERNAL_DOCUMENTATION:
				return EXTERNAL_DOCUMENTATION_EDEFAULT == null ? externalDocumentation != null : !EXTERNAL_DOCUMENTATION_EDEFAULT.equals(externalDocumentation);
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", externalDocumentation: ");
		result.append(externalDocumentation);
		result.append(')');
		return result.toString();
	}

} //DescriptionImpl
