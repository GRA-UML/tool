/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.ServiceInteractionProfile;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Interaction Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInteractionProfileImpl#getSipName <em>Sip Name</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.ServiceInteractionProfileImpl#getSipVersion <em>Sip Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceInteractionProfileImpl extends MinimalEObjectImpl.Container implements ServiceInteractionProfile {
	/**
	 * The default value of the '{@link #getSipName() <em>Sip Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSipName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSipName() <em>Sip Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSipName()
	 * @generated
	 * @ordered
	 */
	protected String sipName = SIP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSipVersion() <em>Sip Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSipVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SIP_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSipVersion() <em>Sip Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSipVersion()
	 * @generated
	 * @ordered
	 */
	protected String sipVersion = SIP_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInteractionProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.SERVICE_INTERACTION_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSipName() {
		return sipName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSipName(String newSipName) {
		String oldSipName = sipName;
		sipName = newSipName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE__SIP_NAME, oldSipName, sipName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSipVersion() {
		return sipVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSipVersion(String newSipVersion) {
		String oldSipVersion = sipVersion;
		sipVersion = newSipVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE__SIP_VERSION, oldSipVersion, sipVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE__SIP_NAME:
				return getSipName();
			case GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE__SIP_VERSION:
				return getSipVersion();
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
			case GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE__SIP_NAME:
				setSipName((String)newValue);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE__SIP_VERSION:
				setSipVersion((String)newValue);
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
			case GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE__SIP_NAME:
				setSipName(SIP_NAME_EDEFAULT);
				return;
			case GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE__SIP_VERSION:
				setSipVersion(SIP_VERSION_EDEFAULT);
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
			case GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE__SIP_NAME:
				return SIP_NAME_EDEFAULT == null ? sipName != null : !SIP_NAME_EDEFAULT.equals(sipName);
			case GraAnnotationModelPackage.SERVICE_INTERACTION_PROFILE__SIP_VERSION:
				return SIP_VERSION_EDEFAULT == null ? sipVersion != null : !SIP_VERSION_EDEFAULT.equals(sipVersion);
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
		result.append(" (sipName: ");
		result.append(sipName);
		result.append(", sipVersion: ");
		result.append(sipVersion);
		result.append(')');
		return result.toString();
	}

} //ServiceInteractionProfileImpl
