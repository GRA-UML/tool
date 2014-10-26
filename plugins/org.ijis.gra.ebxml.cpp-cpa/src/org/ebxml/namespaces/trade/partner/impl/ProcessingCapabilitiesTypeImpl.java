/**
 */
package org.ebxml.namespaces.trade.partner.impl;

import org.ebxml.namespaces.trade.partner.PartnerPackage;
import org.ebxml.namespaces.trade.partner.ProcessingCapabilitiesType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ProcessingCapabilitiesTypeImpl#isGenerate <em>Generate</em>}</li>
 *   <li>{@link org.ebxml.namespaces.trade.partner.impl.ProcessingCapabilitiesTypeImpl#isParse <em>Parse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessingCapabilitiesTypeImpl extends MinimalEObjectImpl.Container implements ProcessingCapabilitiesType {
	/**
	 * The default value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected boolean generate = GENERATE_EDEFAULT;

	/**
	 * This is true if the Generate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean generateESet;

	/**
	 * The default value of the '{@link #isParse() <em>Parse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParse() <em>Parse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParse()
	 * @generated
	 * @ordered
	 */
	protected boolean parse = PARSE_EDEFAULT;

	/**
	 * This is true if the Parse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingCapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartnerPackage.Literals.PROCESSING_CAPABILITIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerate() {
		return generate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerate(boolean newGenerate) {
		boolean oldGenerate = generate;
		generate = newGenerate;
		boolean oldGenerateESet = generateESet;
		generateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.PROCESSING_CAPABILITIES_TYPE__GENERATE, oldGenerate, generate, !oldGenerateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGenerate() {
		boolean oldGenerate = generate;
		boolean oldGenerateESet = generateESet;
		generate = GENERATE_EDEFAULT;
		generateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.PROCESSING_CAPABILITIES_TYPE__GENERATE, oldGenerate, GENERATE_EDEFAULT, oldGenerateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenerate() {
		return generateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParse() {
		return parse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParse(boolean newParse) {
		boolean oldParse = parse;
		parse = newParse;
		boolean oldParseESet = parseESet;
		parseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartnerPackage.PROCESSING_CAPABILITIES_TYPE__PARSE, oldParse, parse, !oldParseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParse() {
		boolean oldParse = parse;
		boolean oldParseESet = parseESet;
		parse = PARSE_EDEFAULT;
		parseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PartnerPackage.PROCESSING_CAPABILITIES_TYPE__PARSE, oldParse, PARSE_EDEFAULT, oldParseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParse() {
		return parseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartnerPackage.PROCESSING_CAPABILITIES_TYPE__GENERATE:
				return isGenerate();
			case PartnerPackage.PROCESSING_CAPABILITIES_TYPE__PARSE:
				return isParse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartnerPackage.PROCESSING_CAPABILITIES_TYPE__GENERATE:
				setGenerate((Boolean)newValue);
				return;
			case PartnerPackage.PROCESSING_CAPABILITIES_TYPE__PARSE:
				setParse((Boolean)newValue);
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
			case PartnerPackage.PROCESSING_CAPABILITIES_TYPE__GENERATE:
				unsetGenerate();
				return;
			case PartnerPackage.PROCESSING_CAPABILITIES_TYPE__PARSE:
				unsetParse();
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
			case PartnerPackage.PROCESSING_CAPABILITIES_TYPE__GENERATE:
				return isSetGenerate();
			case PartnerPackage.PROCESSING_CAPABILITIES_TYPE__PARSE:
				return isSetParse();
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
		result.append(" (generate: ");
		if (generateESet) result.append(generate); else result.append("<unset>");
		result.append(", parse: ");
		if (parseESet) result.append(parse); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProcessingCapabilitiesTypeImpl
