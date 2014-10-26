/**
 */
package org.ebxml.business.process.impl;

import java.util.Collection;

import org.ebxml.business.process.BusinessDocumentType;
import org.ebxml.business.process.ConditionExpressionType;
import org.ebxml.business.process.DocumentationType;
import org.ebxml.business.process.ProcessPackage;

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
 * An implementation of the model object '<em><b>Business Document Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.business.process.impl.BusinessDocumentTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessDocumentTypeImpl#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessDocumentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessDocumentTypeImpl#getNameID <em>Name ID</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessDocumentTypeImpl#getSpecificationElement <em>Specification Element</em>}</li>
 *   <li>{@link org.ebxml.business.process.impl.BusinessDocumentTypeImpl#getSpecificationLocation <em>Specification Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessDocumentTypeImpl extends MinimalEObjectImpl.Container implements BusinessDocumentType {
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
	 * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpressionType conditionExpression;

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
	 * The default value of the '{@link #getNameID() <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameID()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameID() <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameID()
	 * @generated
	 * @ordered
	 */
	protected String nameID = NAME_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecificationElement() <em>Specification Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationElement()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificationElement() <em>Specification Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationElement()
	 * @generated
	 * @ordered
	 */
	protected String specificationElement = SPECIFICATION_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecificationLocation() <em>Specification Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificationLocation() <em>Specification Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationLocation()
	 * @generated
	 * @ordered
	 */
	protected String specificationLocation = SPECIFICATION_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessDocumentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.BUSINESS_DOCUMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationType> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<DocumentationType>(DocumentationType.class, this, ProcessPackage.BUSINESS_DOCUMENT_TYPE__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpressionType getConditionExpression() {
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionExpression(ConditionExpressionType newConditionExpression, NotificationChain msgs) {
		ConditionExpressionType oldConditionExpression = conditionExpression;
		conditionExpression = newConditionExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION, oldConditionExpression, newConditionExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionExpression(ConditionExpressionType newConditionExpression) {
		if (newConditionExpression != conditionExpression) {
			NotificationChain msgs = null;
			if (conditionExpression != null)
				msgs = ((InternalEObject)conditionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION, null, msgs);
			if (newConditionExpression != null)
				msgs = ((InternalEObject)newConditionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION, null, msgs);
			msgs = basicSetConditionExpression(newConditionExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION, newConditionExpression, newConditionExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_DOCUMENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameID() {
		return nameID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameID(String newNameID) {
		String oldNameID = nameID;
		nameID = newNameID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_DOCUMENT_TYPE__NAME_ID, oldNameID, nameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificationElement() {
		return specificationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationElement(String newSpecificationElement) {
		String oldSpecificationElement = specificationElement;
		specificationElement = newSpecificationElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_DOCUMENT_TYPE__SPECIFICATION_ELEMENT, oldSpecificationElement, specificationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificationLocation() {
		return specificationLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationLocation(String newSpecificationLocation) {
		String oldSpecificationLocation = specificationLocation;
		specificationLocation = newSpecificationLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.BUSINESS_DOCUMENT_TYPE__SPECIFICATION_LOCATION, oldSpecificationLocation, specificationLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION:
				return basicSetConditionExpression(null, msgs);
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
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__DOCUMENTATION:
				return getDocumentation();
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION:
				return getConditionExpression();
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__NAME:
				return getName();
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__NAME_ID:
				return getNameID();
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__SPECIFICATION_ELEMENT:
				return getSpecificationElement();
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__SPECIFICATION_LOCATION:
				return getSpecificationLocation();
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
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends DocumentationType>)newValue);
				return;
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION:
				setConditionExpression((ConditionExpressionType)newValue);
				return;
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__NAME_ID:
				setNameID((String)newValue);
				return;
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__SPECIFICATION_ELEMENT:
				setSpecificationElement((String)newValue);
				return;
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__SPECIFICATION_LOCATION:
				setSpecificationLocation((String)newValue);
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
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION:
				setConditionExpression((ConditionExpressionType)null);
				return;
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__NAME_ID:
				setNameID(NAME_ID_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__SPECIFICATION_ELEMENT:
				setSpecificationElement(SPECIFICATION_ELEMENT_EDEFAULT);
				return;
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__SPECIFICATION_LOCATION:
				setSpecificationLocation(SPECIFICATION_LOCATION_EDEFAULT);
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
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__CONDITION_EXPRESSION:
				return conditionExpression != null;
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__NAME_ID:
				return NAME_ID_EDEFAULT == null ? nameID != null : !NAME_ID_EDEFAULT.equals(nameID);
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__SPECIFICATION_ELEMENT:
				return SPECIFICATION_ELEMENT_EDEFAULT == null ? specificationElement != null : !SPECIFICATION_ELEMENT_EDEFAULT.equals(specificationElement);
			case ProcessPackage.BUSINESS_DOCUMENT_TYPE__SPECIFICATION_LOCATION:
				return SPECIFICATION_LOCATION_EDEFAULT == null ? specificationLocation != null : !SPECIFICATION_LOCATION_EDEFAULT.equals(specificationLocation);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", nameID: ");
		result.append(nameID);
		result.append(", specificationElement: ");
		result.append(specificationElement);
		result.append(", specificationLocation: ");
		result.append(specificationLocation);
		result.append(')');
		return result.toString();
	}

} //BusinessDocumentTypeImpl
