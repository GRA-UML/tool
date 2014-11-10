/**
 */
package data.grauml.graWsdl.impl;

import data.grauml.graAnnotationModel.impl.MessageImpl;
import data.grauml.graWsdl.GraWsdlPackage;
import data.grauml.graWsdl.MessageLocation;
import data.grauml.graWsdl.WsdlMessage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wsdl Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graWsdl.impl.WsdlMessageImpl#getMessageLocationCode <em>Message Location Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WsdlMessageImpl extends MessageImpl implements WsdlMessage {
	/**
	 * The default value of the '{@link #getMessageLocationCode() <em>Message Location Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageLocationCode()
	 * @generated
	 * @ordered
	 */
	protected static final MessageLocation MESSAGE_LOCATION_CODE_EDEFAULT = MessageLocation.BODY;

	/**
	 * The cached value of the '{@link #getMessageLocationCode() <em>Message Location Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageLocationCode()
	 * @generated
	 * @ordered
	 */
	protected MessageLocation messageLocationCode = MESSAGE_LOCATION_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WsdlMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraWsdlPackage.Literals.WSDL_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageLocation getMessageLocationCode() {
		return messageLocationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageLocationCode(MessageLocation newMessageLocationCode) {
		MessageLocation oldMessageLocationCode = messageLocationCode;
		messageLocationCode = newMessageLocationCode == null ? MESSAGE_LOCATION_CODE_EDEFAULT : newMessageLocationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraWsdlPackage.WSDL_MESSAGE__MESSAGE_LOCATION_CODE, oldMessageLocationCode, messageLocationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraWsdlPackage.WSDL_MESSAGE__MESSAGE_LOCATION_CODE:
				return getMessageLocationCode();
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
			case GraWsdlPackage.WSDL_MESSAGE__MESSAGE_LOCATION_CODE:
				setMessageLocationCode((MessageLocation)newValue);
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
			case GraWsdlPackage.WSDL_MESSAGE__MESSAGE_LOCATION_CODE:
				setMessageLocationCode(MESSAGE_LOCATION_CODE_EDEFAULT);
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
			case GraWsdlPackage.WSDL_MESSAGE__MESSAGE_LOCATION_CODE:
				return messageLocationCode != MESSAGE_LOCATION_CODE_EDEFAULT;
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
		result.append(" (messageLocationCode: ");
		result.append(messageLocationCode);
		result.append(')');
		return result.toString();
	}

} //WsdlMessageImpl
