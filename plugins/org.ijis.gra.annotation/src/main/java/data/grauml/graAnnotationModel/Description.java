/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data structure used for the types of properties that are intended to document an element, with the possibility of a link to external documentation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Description#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.Description#getExternalDocumentation <em>External Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The documentation for the element. Derived from the instance documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getDescription_Documentation()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Description#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>External Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative URL of an artifact which documents the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Documentation</em>' attribute.
	 * @see #setExternalDocumentation(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getDescription_ExternalDocumentation()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getExternalDocumentation();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.Description#getExternalDocumentation <em>External Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Documentation</em>' attribute.
	 * @see #getExternalDocumentation()
	 * @generated
	 */
	void setExternalDocumentation(String value);

} // Description
