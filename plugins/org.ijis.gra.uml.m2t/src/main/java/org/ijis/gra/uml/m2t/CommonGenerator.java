/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.ijis.gra.uml.m2t;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.acceleo.common.AcceleoCommonPlugin;
import org.eclipse.acceleo.common.IAcceleoConstants;
import org.eclipse.acceleo.common.utils.ModelUtils;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.acceleo.model.mtl.Module;
import org.eclipse.acceleo.model.mtl.resource.EMtlResourceFactoryImpl;
import org.eclipse.acceleo.model.mtl.util.MtlResourceFactoryImpl;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.packageadmin.PackageAdmin;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Entry point of the 'CommonGenerator'  module.
 *
 */
abstract public class CommonGenerator extends AbstractAcceleoGenerator {
	static File saveTargetDirectory=null;
	static File getLastTargetDirectory(){return saveTargetDirectory;}
	/**
	 * Allows the public constructor to be used. Note that a generator created
	 * this way cannot be used to launch generations before one of
	 * {@link #initialize(EObject, File, List)} or
	 * {@link #initialize(URI, File, List)} is called.
	 * <p>
	 * The main reason for this constructor is to allow clients of this
	 * generation to call it from another Java file, as it allows for the
	 * retrieval of {@link #getProperties()} and
	 * {@link #getGenerationListeners()}.
	 * </p>
	 *
	 * @generated
	 */
	public CommonGenerator() {
    // Empty implementation
  }
	/**
	 * This will initialize all required information for this generator.
	 * 
	 * @param element
	 *            We'll iterate over the content of this element to find Objects matching the first parameter
	 *            of the template we need to call.
	 * @param folder
	 *            This will be used as the output folder for this generation : it will be the base path
	 *            against which all file block URLs will be resolved.
	 * @param arguments
	 *            If the template which will be called requires more than one argument taken from the model,
	 *            pass them here.
	 * @throws IOException
	 *             This can be thrown in two scenarios : the module cannot be found, or it cannot be loaded.
	 */
	public void initialize(EObject element, File folder, List<? extends Object> arguments) throws IOException {
		// previous logic no longer works? try again
		/*
		ResourceSet resourceSet = new ResourceSetImpl();
		originalResources.addAll(resourceSet.getResources());

		// make sure that metamodel projects in the workspace override those in plugins
		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());

		registerResourceFactories(resourceSet);
		registerPackages(resourceSet);

		addListeners();
		addProperties();

		String moduleName = getModuleName();

		if (moduleName.endsWith('.' + IAcceleoConstants.MTL_FILE_EXTENSION)) {
			moduleName = moduleName.substring(0, moduleName.lastIndexOf('.'));
		}
		if (!moduleName.endsWith('.' + IAcceleoConstants.EMTL_FILE_EXTENSION)) {
			moduleName += '.' + IAcceleoConstants.EMTL_FILE_EXTENSION;
		}

		URL moduleURL = findModuleURL(moduleName);
		//QvtCommonAction.log("CommonGenerator.initialize "+moduleURL);
		if (moduleURL == null) {
			throw new IOException("'" + getModuleName() + ".emtl' not found"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		URI moduleURI = createTemplateURI(moduleURL.toString());
		//QvtCommonAction.log("CommonGenerator.initialize moduleURI "+moduleURI);
		module = (Module)ModelUtils.load(moduleURI, resourceSet);
		//QvtCommonAction.log("CommonGenerator.initialize module "+module+", "+element);
		model = element;
		targetFolder = folder;
		saveTargetDirectory=folder;
		generationArguments = arguments;
		*/
		// and this does not work either
		super.initialize(element, folder, arguments);
		saveTargetDirectory=folder;
		// why can we not get applied Stereotypes?
		
		System.out.println("CommonGenerator.initialize model "+model);
		// check if any stereotypes applied at all
		// not a single one
		/*
		TreeIterator<EObject> tree=model.eResource().getAllContents();
		while(tree.hasNext()){
			EObject eObject=tree.next();
			if(eObject instanceof Element){
				Element umlElement=(Element)eObject;
				if(!umlElement.getAppliedStereotypes().isEmpty()){
					System.out.println("CommonGenerator found "+umlElement);
				}
			}
		}
		*/
		/*
		for(EObject eObject:model.eResource().getContents()){
			if(!(eObject instanceof Element)){
				Element umlElement=UMLUtil.getBaseElement(eObject);
				if(umlElement!=null){
					UMLUtil.setBaseElement(eObject, umlElement);
					System.out.println("CommonGenerator.initialize baseElement "+umlElement+", "+eObject+", "+umlElement.getStereotypeApplications());
				}else{
					
					Element testElement=getBaseElement(eObject.eClass(),eObject);
					if(testElement!=null){
						UMLUtil.setBaseElement(eObject, testElement);
						System.out.println("CommonGenerator.initialize setbaseElement "+testElement+", "+eObject+", "+testElement.getStereotypeApplications());
					}else{
						System.out.println("CommonGenerator.initialize no uml base element "+eObject+", "+eObject.eClass().getEPackage()+", "+eObject.eCrossReferences());
					}
				}
			}
	}
	*/
	}
/*
	protected  Element getBaseElement(EClass definition,
			EObject stereotypeApplication) {

		for (EStructuralFeature eStructuralFeature : definition
			.getEAllStructuralFeatures()) {

			if (eStructuralFeature.getName().startsWith(
				Extension.METACLASS_ROLE_PREFIX)) {

				Object value = stereotypeApplication.eGet(eStructuralFeature);
				System.out.println("CommonGenerator.initialize base "+value);

				if (value instanceof Element) {
					return (Element) value;
				}
			}else{
				if (eStructuralFeature.getName().equals("anyAttribute")) {

						Object value = stereotypeApplication.eGet(eStructuralFeature);
						System.out.println("CommonGenerator.initialize anyAttribute "+value);
						if(value instanceof Collection){
							for(Object test:(Collection)value){
								if (test instanceof Element) {
									return (Element) value;
								}
								if(test instanceof FeatureMap.Entry){
									FeatureMap.Entry entry=(FeatureMap.Entry)test;
										EStructuralFeature feature=entry.getEStructuralFeature();
										Object featureValue=entry.getValue();
										System.out.println("CommonGenerator.initialize featureMap value "+feature+", "+featureValue+", "+featureValue.getClass().getName());
								}
								System.out.println("CommonGenerator.initialize anyAttribute value "+test+", "+test.getClass().getName());
							}
						}
					}else{
						//System.out.println("CommonGenerator.initialize non-base property "+eStructuralFeature);
						
					}
				System.out.println("CommonGenerator.initialize non-base property "+eStructuralFeature);
				
			}
		}

		return null;
	}
*/
	  ////////////////////////////////////////////////////////////////
	/**
	 * Clients can override this if the default behavior doesn't properly find the emtl module URL.
	 * 
	 * @param moduleName
	 *            Name of the module we're searching for.
	 * @return The template's URL. This will use Eclipse-specific behavior if possible, and use the class
	 *         loader otherwise.
	 */
	// no longer works
	//protected URL findModuleURL(String moduleName) {return findModuleURLUtility(moduleName,getClass());}
	/**
	 * Creates the URI that will be used to resolve the template that is to be launched.
	 * 
	 * @param entry
	 *            The path towards the template file. Could be a jar or file scheme URI, or we'll assume it
	 *            represents a relative path.
	 * @return The actual URI from which the template file can be resolved.
	 */
	// no longer works
	//protected URI createTemplateURI(String entry) {return createTemplateURIUtility(entry);}
	/**
	 * Creates the URI that will be used to resolve the template that is to be launched.
	 * 
	 * @param entry
	 *            The path towards the template file. Could be a jar or file scheme URI, or we'll assume it
	 *            represents a relative path.
	 * @return The actual URI from which the template file can be resolved.
	 */
	/*
	public static URI createTemplateURIUtility(String entry) {
		if (entry.startsWith("file:") || entry.startsWith("jar:") || entry.startsWith("bundleentry:")||entry.startsWith("platform:")) { //$NON-NLS-1$ //$NON-NLS-2$ 
			URI result=URI.createURI(URI.decode(entry));
//			URI result=URI.createURI(entry); // no difference?
			//QvtCommonAction.log("CommonGenerator.createTemplateURI "+result+", "+entry);
			return result;
		}
		return URI.createFileURI(URI.decode(entry));
	}
	*/
	/**
	 * 
	 * @param moduleName
	 *            Name of the module we're searching for.
	 * @return The template's URL. This will use Eclipse-specific behavior if possible, and use the class
	 *         loader otherwise.
	 */
	/*
	static public URL findModuleURLUtility(String moduleName,Class clazz) {
		URL moduleURL = null;
			moduleURL = clazz.getResource(moduleName);
		return moduleURL;
	}
	*/
	/**
	 * This will try and find a resource of the given name using the bundle from which was originally loaded
	 * the given class so as to try and detect if it is jarred. If <code>clazz</code> hasn't been loaded from
	 * a bundle class loader, we'll resort to the default class loader mechanism. This will only return
	 * <code>null</code> in the case where the resource at <code>resourcePath</code> cannot be located at all.
	 * 
	 * @param clazz
	 *            Class which class loader will be used to try and locate the resource.
	 * @param resourcePath
	 *            Path of the resource we seek, relative to the class.
	 * @return The URL of the resource as we could locate it.
	 * @throws IOException
	 *             This will be thrown if we fail to convert bundle-scheme URIs into file-scheme URIs.
	 */
	
	public static URL getResourceURLSUPPRESS(Class<?> clazz, String resourcePath) throws IOException {
		BundleContext context = AcceleoCommonPlugin.getDefault().getContext();
		ServiceReference packageAdminReference = context.getServiceReference(PackageAdmin.class.getName());
		PackageAdmin packageAdmin = null;
		if (packageAdminReference != null) {
			packageAdmin = (PackageAdmin)context.getService(packageAdminReference);
		}

		URL resourceURL = null;
		System.out.println("CommonGenerator.getResourceURL "+packageAdmin+", "+clazz.getName()+", "+resourcePath);
		if (packageAdmin != null) {
			Bundle bundle = packageAdmin.getBundle(clazz);
			if (bundle != null) {
				final String pathSeparator = "/"; //$NON-NLS-1$
				// We found the appropriate bundle. We'll now try and determine whether the emtl is jarred
				Enumeration<?> emtlFiles = bundle.findEntries(pathSeparator, resourcePath, true);
				if (emtlFiles != null && emtlFiles.hasMoreElements()) {
					resourceURL = (URL)emtlFiles.nextElement();
				}
				// This can only be a bundle-scheme URL if we found the URL. Convert it to file or jar scheme
				String urlPath=resourceURL.getPath();
				URI uri=URI.createPlatformPluginURI("/"+bundle.getSymbolicName()+urlPath,true);
				resourceURL=new URL(uri.toString());
				System.out.println("CommonGenerator.getResourceURL "+resourceURL+", "+urlPath);
								
if(false)				
				if (resourceURL != null) {
					resourceURL = FileLocator.resolve(resourceURL);
				}
System.out.println("CommonGenerator.getResourceURL "+resourceURL);
			}
		}
		/*
		 * We couldn't locate either the bundle which loaded the class or the resource. Resort to the class
		 * loader and return null if it cannot locate the resource either.
		 */
		if (resourceURL == null) {
			resourceURL = clazz.getResource(resourcePath);
		}

		if (packageAdminReference != null) {
			context.ungetService(packageAdminReference);
		}
		return resourceURL;
	}
	
	  ////////////////////////////////////////////////////////////////
	
	/**
	 * This can be used to update the resource set's package registry with all needed EPackages.
	 * 
	 * @param resourceSet
	 *            The resource set which registry has to be updated.
	 */
	@Override
	public void registerPackages(ResourceSet resourceSet) {
	//	org.eclipse.acceleo.engine.internal.evaluation.AcceleoEvaluationVisitor x;
		UMLResourcesUtil.init(resourceSet);
		super.registerPackages(resourceSet);
    //resourceSet.getPackageRegistry().put(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getNsURI(), org.eclipse.uml2.uml.UMLPackage.eINSTANCE);

    resourceSet.getPackageRegistry().put(org.eclipse.ocl.ecore.EcorePackage.eINSTANCE.getNsURI(), org.eclipse.ocl.ecore.EcorePackage.eINSTANCE);
    // TODO If you need additional package registrations, do them here. The following line is an example for UML.
    // resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
    // get catalog metamodel
    /*
    resourceSet.getPackageRegistry().put("http://reference.niem.gov/niem/resource/mpd/catalog/1.0/", 
    		gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.mpdcatPackage.eINSTANCE);
    */
    // we need to get profile definitions
//    resourceSet.getPackageRegistry().put("http://www.eclipse.org/uml2/2.1.0/UML", org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
    // these do not help the applied stereotype problem
    //resourceSet.getPackageRegistry().put("http://www.omg.org/spec/UML/20110701", org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
    //resourceSet.getPackageRegistry().put("http://www.eclipse.org/uml2/4.0.0/UML", org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
	//UMLUtil.init(resourceSet);
    
/*
    platform:/plugin/plugin-name_1.2.3/...

  A folder to folder mapping, i.e., where both source and target end in /, will remap entire subtrees, not just instances that match exactly. 

  URI mappings can also be defined from the source code with the org.eclipse.emf.ecore.resource.URIConverter.URI_MAP as follows: 
*/
/*
    URIConverter.URI_MAP.put(URI.createURI("pathmap://NIEM_PROFILES/"), URI.createURI("platform:/plugin/gov.niem.uml.resources/profiles/"));
    URIConverter.URI_MAP.put(URI.createURI("pathmap://NIEM_LIBRARIES/"), URI.createURI("platform:/plugin/gov.niem.uml.resources/libraries/"));
    URIConverter.URI_MAP.put(URI.createURI("pathmap://UML_LIBRARIES/"), URI.createURI("platform:/plugin/org.eclipse.uml2.uml.resources/libraries/"));
    URIConverter.URI_MAP.put(URI.createURI("pathmap://NIEM_PSM_PROFILES/"), URI.createURI("platform:/plugin/gov.niem.uml.psm.resources/profiles/"));
*/
 
//    URIConverter.URI_MAP.put(URI.createURI("pathmap://MAGICDRAW/"), URI.createURI("platform:/plugin/gov.niem.uml.psm.resources/magicdraw/"));
//    URIConverter.URI_MAP.put(URI.createURI("pathmap://MAGICDRAW/UML.ecore"), URI.createURI("http://www.nomagic.com/magicdraw/UML/2.4.1"));
//    resourceSet.getPackageRegistry().put("http://www.nomagic.com/magicdraw/UML/2.4.1", UMLPackage.eINSTANCE);
//    resourceSet.getPackageRegistry().put("pathmap://MAGICDRAW/UML.ecore", UMLPackage.eINSTANCE);

    ResourceSet myResourceSet=new ResourceSetImpl();
//    myResourceSet.getPackageRegistry().put(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getNsURI(), org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
//    myResourceSet.getPackageRegistry().put("http://www.eclipse.org/uml2/2.1.0/UML", org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
    myResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
//    myResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml",UMLResource.Factory.INSTANCE);
    
    
    
  }
	/**
	 * This can be used to update the resource set's resource factory registry with all needed factories.
	 * 
	 * @param resourceSet
	 *            The resource set which registry has to be updated.
	 */
	@Override
	public void registerResourceFactories(ResourceSet resourceSet) {
		UMLResourcesUtil.init(resourceSet);
    super.registerResourceFactories(resourceSet);
    // TODO If you need additional resource factories registrations, do them here. The following line is an example for UML.
    // resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
    //resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mpdcat",  new gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.util.mpdcatResourceFactoryImpl());
//    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emtl",  new org.eclipse.acceleo.model.mtl.resource.EMtlBinaryResourceFactoryImpl());
//    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("mtl",  new EMtlResourceFactoryImpl());

//    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emtl",  new EMtlResourceFactoryImpl());
     //resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", UMLResource.Factory.INSTANCE);
  }
	
}
