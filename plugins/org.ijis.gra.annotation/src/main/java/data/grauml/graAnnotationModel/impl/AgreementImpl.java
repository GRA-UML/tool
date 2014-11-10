/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.Agreement;
import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.AgreementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.AgreementImpl#getAgreementUri <em>Agreement Uri</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.AgreementImpl#isAutomatedAgreementIndicator <em>Automated Agreement Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgreementImpl extends MinimalEObjectImpl.Container implements Agreement {
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
	 * The default value of the '{@link #getAgreementUri() <em>Agreement Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementUri()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreementUri() <em>Agreement Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementUri()
	 * @generated
	 * @ordered
	 */
	protected String agreementUri = AGREEMENT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutomatedAgreementIndicator() <em>Automated Agreement Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomatedAgreementIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATED_AGREEMENT_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutomatedAgreementIndicator() <em>Automated Agreement Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomatedAgreementIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean automatedAgreementIndicator = AUTOMATED_AGREEMENT_INDICATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.AGREEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.AGREEMENT__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgreementUri() {
		return agreementUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreementUri(String newAgreementUri) {
		String oldAgreementUri = agreementUri;
		agreementUri = newAgreementUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.AGREEMENT__AGREEMENT_URI, oldAgreementUri, agreementUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutomatedAgreementIndicator() {
		return automatedAgreementIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomatedAgreementIndicator(boolean newAutomatedAgreementIndicator) {
		boolean oldAutomatedAgreementIndicator = automatedAgreementIndicator;
		automatedAgreementIndicator = newAutomatedAgreementIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraAnnotationModelPackage.AGREEMENT__AUTOMATED_AGREEMENT_INDICATOR, oldAutomatedAgreementIndicator, automatedAgreementIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraAnnotationModelPackage.AGREEMENT__DOCUMENTATION:
				return getDocumentation();
			case GraAnnotationModelPackage.AGREEMENT__AGREEMENT_URI:
				return getAgreementUri();
			case GraAnnotationModelPackage.AGREEMENT__AUTOMATED_AGREEMENT_INDICATOR:
				return isAutomatedAgreementIndicator();
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
			case GraAnnotationModelPackage.AGREEMENT__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case GraAnnotationModelPackage.AGREEMENT__AGREEMENT_URI:
				setAgreementUri((String)newValue);
				return;
			case GraAnnotationModelPackage.AGREEMENT__AUTOMATED_AGREEMENT_INDICATOR:
				setAutomatedAgreementIndicator((Boolean)newValue);
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
			case GraAnnotationModelPackage.AGREEMENT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case GraAnnotationModelPackage.AGREEMENT__AGREEMENT_URI:
				setAgreementUri(AGREEMENT_URI_EDEFAULT);
				return;
			case GraAnnotationModelPackage.AGREEMENT__AUTOMATED_AGREEMENT_INDICATOR:
				setAutomatedAgreementIndicator(AUTOMATED_AGREEMENT_INDICATOR_EDEFAULT);
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
			case GraAnnotationModelPackage.AGREEMENT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case GraAnnotationModelPackage.AGREEMENT__AGREEMENT_URI:
				return AGREEMENT_URI_EDEFAULT == null ? agreementUri != null : !AGREEMENT_URI_EDEFAULT.equals(agreementUri);
			case GraAnnotationModelPackage.AGREEMENT__AUTOMATED_AGREEMENT_INDICATOR:
				return automatedAgreementIndicator != AUTOMATED_AGREEMENT_INDICATOR_EDEFAULT;
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
		result.append(", agreementUri: ");
		result.append(agreementUri);
		result.append(", automatedAgreementIndicator: ");
		result.append(automatedAgreementIndicator);
		result.append(')');
		return result.toString();
	}

} //AgreementImpl
