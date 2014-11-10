/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interaction Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure containing information about a Service Interaction Profile.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInteractionProfile#getSipName <em>Sip Name</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceInteractionProfile#getSipVersion <em>Sip Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInteractionProfile()
 * @model
 * @generated
 */
public interface ServiceInteractionProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Sip Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the Service Interaction Profile.
	 * [Derived from] SIP Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sip Name</em>' attribute.
	 * @see #setSipName(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInteractionProfile_SipName()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSipName();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInteractionProfile#getSipName <em>Sip Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sip Name</em>' attribute.
	 * @see #getSipName()
	 * @generated
	 */
	void setSipName(String value);

	/**
	 * Returns the value of the '<em><b>Sip Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of the Service Interaction Profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sip Version</em>' attribute.
	 * @see #setSipVersion(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceInteractionProfile_SipVersion()
	 * @model dataType="types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSipVersion();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceInteractionProfile#getSipVersion <em>Sip Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sip Version</em>' attribute.
	 * @see #getSipVersion()
	 * @generated
	 */
	void setSipVersion(String value);

} // ServiceInteractionProfile
