/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.AttributeSubstitutionType;
import org.ebxml.business.process.DocumentSubstitutionType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.ProcessPackage;
import org.ebxml.business.process.SubstitutionSetType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substitution Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.SubstitutionSetTypeImpl#getDocumentSubstitution <em>Document Substitution</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.SubstitutionSetTypeImpl#getAttributeSubstitution <em>Attribute Substitution</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.SubstitutionSetTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.SubstitutionSetTypeImpl#getApplyToScope <em>Apply To Scope</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.SubstitutionSetTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.SubstitutionSetTypeImpl#getNameId <em>Name Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstitutionSetTypeImpl extends MinimalEObjectImpl.Container implements SubstitutionSetType {
	/**
	 * The cached value of the '{@link #getDocumentSubstitution() <em>Document Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSubstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentSubstitutionType> documentSubstitution;

	/**
	 * The cached value of the '{@link #getAttributeSubstitution() <em>Attribute Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeSubstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeSubstitutionType> attributeSubstitution;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentationType> documentation;

	/**
	 * The default value of the '{@link #getApplyToScope() <em>Apply To Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyToScope()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLY_TO_SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplyToScope() <em>Apply To Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyToScope()
	 * @generated
	 * @ordered
	 */
	protected String applyToScope = APPLY_TO_SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameId() <em>Name Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameId()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameId() <em>Name Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameId()
	 * @generated
	 * @ordered
	 */
	protected String nameId = NAME_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstitutionSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.SUBSTITUTION_SET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentSubstitutionType> getDocumentSubstitution() {
		if (documentSubstitution == null) {
			documentSubstitution = new EObjectContainmentEList<DocumentSubstitutionType>(DocumentSubstitutionType.class, this, ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENT_SUBSTITUTION);
		}
		return documentSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeSubstitutionType> getAttributeSubstitution() {
		if (attributeSubstitution == null) {
			attributeSubstitution = new EObjectContainmentEList<AttributeSubstitutionType>(AttributeSubstitutionType.class, this, ProcessPackage.SUBSTITUTION_SET_TYPE__ATTRIBUTE_SUBSTITUTION);
		}
		return attributeSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplyToScope() {
		return applyToScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyToScope(String newApplyToScope) {
		String oldApplyToScope = applyToScope;
		applyToScope = newApplyToScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.SUBSTITUTION_SET_TYPE__APPLY_TO_SCOPE, oldApplyToScope, applyToScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.SUBSTITUTION_SET_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameId() {
		return nameId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameId(String newNameId) {
		String oldNameId = nameId;
		nameId = newNameId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.SUBSTITUTION_SET_TYPE__NAME_ID, oldNameId, nameId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENT_SUBSTITUTION:
				return ((InternalEList<?>)getDocumentSubstitution()).basicRemove(otherEnd, msgs);
			case ProcessPackage.SUBSTITUTION_SET_TYPE__ATTRIBUTE_SUBSTITUTION:
				return ((InternalEList<?>)getAttributeSubstitution()).basicRemove(otherEnd, msgs);
			case ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENT_SUBSTITUTION:
				return getDocumentSubstitution();
			case ProcessPackage.SUBSTITUTION_SET_TYPE__ATTRIBUTE_SUBSTITUTION:
				return getAttributeSubstitution();
			case ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.SUBSTITUTION_SET_TYPE__APPLY_TO_SCOPE:
				return getApplyToScope();
			case ProcessPackage.SUBSTITUTION_SET_TYPE__NAME:
				return getName();
			case ProcessPackage.SUBSTITUTION_SET_TYPE__NAME_ID:
				return getNameId();
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
			case ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENT_SUBSTITUTION:
				getDocumentSubstitution().clear();
				getDocumentSubstitution().addAll((Collection<? extends DocumentSubstitutionType>)newValue);
				return;
			case ProcessPackage.SUBSTITUTION_SET_TYPE__ATTRIBUTE_SUBSTITUTION:
				getAttributeSubstitution().clear();
				getAttributeSubstitution().addAll((Collection<? extends AttributeSubstitutionType>)newValue);
				return;
			case ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.SUBSTITUTION_SET_TYPE__APPLY_TO_SCOPE:
				setApplyToScope((String)newValue);
				return;
			case ProcessPackage.SUBSTITUTION_SET_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.SUBSTITUTION_SET_TYPE__NAME_ID:
				setNameId((String)newValue);
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
			case ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENT_SUBSTITUTION:
				getDocumentSubstitution().clear();
				return;
			case ProcessPackage.SUBSTITUTION_SET_TYPE__ATTRIBUTE_SUBSTITUTION:
				getAttributeSubstitution().clear();
				return;
			case ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.SUBSTITUTION_SET_TYPE__APPLY_TO_SCOPE:
				setApplyToScope(APPLY_TO_SCOPE_EDEFAULT);
				return;
			case ProcessPackage.SUBSTITUTION_SET_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.SUBSTITUTION_SET_TYPE__NAME_ID:
				setNameId(NAME_ID_EDEFAULT);
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
			case ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENT_SUBSTITUTION:
				return documentSubstitution != null && !documentSubstitution.isEmpty();
			case ProcessPackage.SUBSTITUTION_SET_TYPE__ATTRIBUTE_SUBSTITUTION:
				return attributeSubstitution != null && !attributeSubstitution.isEmpty();
			case ProcessPackage.SUBSTITUTION_SET_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.SUBSTITUTION_SET_TYPE__APPLY_TO_SCOPE:
				return APPLY_TO_SCOPE_EDEFAULT == null ? applyToScope != null : !APPLY_TO_SCOPE_EDEFAULT.equals(applyToScope);
			case ProcessPackage.SUBSTITUTION_SET_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.SUBSTITUTION_SET_TYPE__NAME_ID:
				return NAME_ID_EDEFAULT == null ? nameId != null : !NAME_ID_EDEFAULT.equals(nameId);
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
		result.append(" (applyToScope: ");
		result.append(applyToScope);
		result.append(", name: ");
		result.append(name);
		result.append(", nameId: ");
		result.append(nameId);
		result.append(')');
		return result.toString();
	}

} //SubstitutionSetTypeImpl
