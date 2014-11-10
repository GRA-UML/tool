/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a service port. If not declared as an annotation, derived during phase-1 provisioning for every UML Port in the service hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Port#getInterface <em>Interface</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Port#getAddressUri <em>Address Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interfaces provided by the Port.  Either explicitly declared or derived during phase-1 provisioning from the interfaces of Ports in the service hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getPort_Interface()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getInterface();

	/**
	 * Returns the value of the '<em><b>Address Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The <soap:address> location of a <wsdl:port>. Derived by default in phase-2 from ServiceURI+"/"+"Name" but MAY be changed in the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Uri</em>' attribute.
	 * @see #setAddressUri(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getPort_AddressUri()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getAddressUri();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Port#getAddressUri <em>Address Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Uri</em>' attribute.
	 * @see #getAddressUri()
	 * @generated
	 */
	void setAddressUri(String value);

} // Port
