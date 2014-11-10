/**
 */
package data.grauml.graAnnotationModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A UseCase annotation represents one or more "real world effects" of a ServiceDescription.  In the annotation model, a UseCase instance may realize a UseCase or a Package in the logical model.  In the former case, Phase-1 will generate a single UseCase instance. In the latter case, Phase-1 will generate a UseCase instance for each UML UseCase contained in the realized Package.  In all cases the generated UseCases' Provider and Consumer properties are derived from Associations stereotyped «Provider» and «Consumer» between the logical UseCases and the logical Actors that correspond to Participants in the generated annotation model.
 *  
 *  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.UseCase#getProvider <em>Provider</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.UseCase#getConsumer <em>Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends GraServiceAnnotationBase {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants that provide services. Derived from associations stereotyped Provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getUseCase_Provider()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Participant> getProvider();

	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' containment reference list.
	 * The list contents are of type {@link data.grauml.graAnnotationModel.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants that consume services. Derived from associations stereotyped Consumer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumer</em>' containment reference list.
	 * @see data.grauml.graAnnotationModel.GraAnnotationModelPackage#getUseCase_Consumer()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Participant> getConsumer();

} // UseCase
