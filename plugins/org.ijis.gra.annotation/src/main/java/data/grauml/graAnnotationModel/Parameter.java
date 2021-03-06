/**
 */
package data.grauml.graAnnotationModel;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the information content of parameters defined in an operation.  If not declared as an annotation, derived during phase-1 provisioning for every UML Parameter in the service hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Parameter#getUse <em>Use</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Parameter#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * The literals are from the enumeration {@link data.grauml.graAnnotationModel.ParameterUse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "direction" of the message. Derived from the parameter's direction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see data.grauml.graAnnotationModel.ParameterUse
	 * @see #setUse(ParameterUse)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getParameter_Use()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParameterUse getUse();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Parameter#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see data.grauml.graAnnotationModel.ParameterUse
	 * @see #getUse()
	 * @generated
	 */
	void setUse(ParameterUse value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The information transferred in a parameter. Either explicitly declared or derived from the parameter's type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Message)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getParameter_Message()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Parameter#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

} // Parameter
