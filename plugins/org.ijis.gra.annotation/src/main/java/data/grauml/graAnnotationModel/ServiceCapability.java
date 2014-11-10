/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A free text format description of the capability provided by a service. Per GRA, a capability represents the provider's view of a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.ServiceCapability#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceCapability()
 * @model
 * @generated
 */
public interface ServiceCapability extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free text format description of the capability provided by a service.   Derived from the instance documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getServiceCapability_Documentation()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.ServiceCapability#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

} // ServiceCapability
