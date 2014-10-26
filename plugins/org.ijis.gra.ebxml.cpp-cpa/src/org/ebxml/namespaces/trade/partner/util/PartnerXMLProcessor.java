/**
 */
package org.ebxml.namespaces.trade.partner.util;

import java.util.Map;

import org.ebxml.namespaces.trade.partner.PartnerPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartnerXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		PartnerPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the PartnerResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new PartnerResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new PartnerResourceFactoryImpl());
		}
		return registrations;
	}

} //PartnerXMLProcessor
