/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gra Service Annotation Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for GRA Service annotation metadata classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getName <em>Name</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getTemplate <em>Template</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getFlag <em>Flag</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getDiagnostics <em>Diagnostics</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getGraServiceAnnotationBase()
 * @model abstract="true"
 * @generated
 */
public interface GraServiceAnnotationBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element name. Derived from the instance's name, or if that is empty to the corresponding element's name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getGraServiceAnnotationBase_Name()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The documentation for this element.  Derived from a realized or corresponding element's documentation or, if not provided, the instance's documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getGraServiceAnnotationBase_Documentation()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Template is the name of a phase-2 template that will be called to process the containing element thus overriding the default mapping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #setTemplate(String)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getGraServiceAnnotationBase_Template()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getTemplate();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service interaction requirements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference.
	 * @see #setRequirement(InteractionRequirements)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getGraServiceAnnotationBase_Requirement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InteractionRequirements getRequirement();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getRequirement <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' containment reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(InteractionRequirements value);

	/**
	 * Returns the value of the '<em><b>Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived reference to a model element realized by or corresponding to this element, used for traceability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Reference</em>' containment reference.
	 * @see #setModelReference(ModelReference)
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getGraServiceAnnotationBase_ModelReference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ModelReference getModelReference();

	/**
	 * Sets the value of the '{@link data.grauml.graAnnotationModel.GraServiceAnnotationBase#getModelReference <em>Model Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Reference</em>' containment reference.
	 * @see #getModelReference()
	 * @generated
	 */
	void setModelReference(ModelReference value);

	/**
	 * Returns the value of the '<em><b>Flag</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag provides an arbitrary extension mechanism whereby any business or technology choice may be notated on the containing element. The intent is that a user-supplied phase-2 template will then respect these flags and produce the desired result. Unknown flags are ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flag</em>' attribute list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getGraServiceAnnotationBase_Flag()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	EList<String> getFlag();

	/**
	 * Returns the value of the '<em><b>Diagnostics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagnostic information for this element.  Derived during phase-1 provisioning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostics</em>' attribute list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getGraServiceAnnotationBase_Diagnostics()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	EList<String> getDiagnostics();

} // GraServiceAnnotationBase
