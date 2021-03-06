/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an abstract service interface.  If not declared as an annotation, derived during phase-1 provisioning for every UML Interface in the service hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.Interface#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operations contained by the interface. Either explicitly declared or derived during phase-1 provisioning from the Operations/Receptions in the service hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getInterface_Operation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Operation> getOperation();

} // Interface
