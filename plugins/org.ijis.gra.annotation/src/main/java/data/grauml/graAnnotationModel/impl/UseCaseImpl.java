/**
 */
package data.grauml.graAnnotationModel.impl;

import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.Participant;
import data.grauml.graAnnotationModel.UseCase;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.grauml.graAnnotationModel.impl.UseCaseImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link data.grauml.graAnnotationModel.impl.UseCaseImpl#getConsumer <em>Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends GraServiceAnnotationBaseImpl implements UseCase {
	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> provider;

	/**
	 * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> consumer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraAnnotationModelPackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getProvider() {
		if (provider == null) {
			provider = new EObjectContainmentEList<Participant>(Participant.class, this, GraAnnotationModelPackage.USE_CASE__PROVIDER);
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getConsumer() {
		if (consumer == null) {
			consumer = new EObjectContainmentEList<Participant>(Participant.class, this, GraAnnotationModelPackage.USE_CASE__CONSUMER);
		}
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraAnnotationModelPackage.USE_CASE__PROVIDER:
				return ((InternalEList<?>)getProvider()).basicRemove(otherEnd, msgs);
			case GraAnnotationModelPackage.USE_CASE__CONSUMER:
				return ((InternalEList<?>)getConsumer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraAnnotationModelPackage.USE_CASE__PROVIDER:
				return getProvider();
			case GraAnnotationModelPackage.USE_CASE__CONSUMER:
				return getConsumer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraAnnotationModelPackage.USE_CASE__PROVIDER:
				getProvider().clear();
				getProvider().addAll((Collection<? extends Participant>)newValue);
				return;
			case GraAnnotationModelPackage.USE_CASE__CONSUMER:
				getConsumer().clear();
				getConsumer().addAll((Collection<? extends Participant>)newValue);
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
			case GraAnnotationModelPackage.USE_CASE__PROVIDER:
				getProvider().clear();
				return;
			case GraAnnotationModelPackage.USE_CASE__CONSUMER:
				getConsumer().clear();
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
			case GraAnnotationModelPackage.USE_CASE__PROVIDER:
				return provider != null && !provider.isEmpty();
			case GraAnnotationModelPackage.USE_CASE__CONSUMER:
				return consumer != null && !consumer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UseCaseImpl
