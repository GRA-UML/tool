/*
 * This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IJIS - initial API and implementation
 *
 */
package org.ijis.gra.uml.qvt.ui.handlers;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static org.apache.commons.io.FileUtils.writeStringToFile;
import static org.apache.commons.lang.StringUtils.isBlank;
import static org.eclipse.core.resources.IResource.DEPTH_INFINITE;
import static org.eclipse.emf.common.util.URI.createURI;
import static org.eclipse.emf.ecore.util.EcoreUtil.getObjectsByType;
import static org.search.niem.mpd.Constants.CHANGELOG_PURPOSE;
import static org.search.niem.mpd.Constants.EXCHANGE_SCHEMA_NATURE;
import static org.search.niem.mpd.Constants.EXCHANGE_SCHEMA_SET_PURPOSE;
import static org.search.niem.mpd.Constants.SAMPLE_PURPOSE;
import static org.search.niem.mpd.Constants.TEXT_NATURE;
import static org.search.niem.mpd.Constants.XML_NATURE;
import static org.search.niem.mpd.cat.util.CatExt.addCatalogFile;
import static org.search.niem.uml.qvt.ui.preferences.PreferenceConstants.P_CHANGELOG_FILE_NAME;
import static org.search.niem.uml.qvt.ui.preferences.PreferenceConstants.P_MPD_CATALOG_FILE_NAME;
import static org.search.niem.uml.qvt.ui.preferences.PreferenceConstants.P_SAMPLE_XML_SUFFIX;
import static org.search.niem.uml.qvt.ui.preferences.PreferenceConstants.P_XML_SAMPLES_FOLDER;
import static org.ijis.gra.uml.util.NIEMUmlExt.findPsmMpd;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDAuthoritativeSourceName;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDBaseURI;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDClassCode;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDCreationDate;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDDomains;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDKeywords;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDLastRevisionDate;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDPointOfContactEmailAddresses;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDPointOfContactName;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDPointOfContactPhoneNumbers;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDPointsOfContact;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDSecurityMarking;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDVersionID;
import static org.ijis.gra.uml.util.URIExt.appendPath;
import static org.ijis.gra.uml.util.URIExt.relativize;
import static org.ijis.gra.uml.util.URIExt.toFile;
import static org.ijis.gra.uml.util.URIExt.toIFolder;
import gov.ojp.it.gsp.services._1._0.util.graResourceFactoryImpl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EMOFResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.EMOFResourceImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Element;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.WSDLPackage;
import org.eclipse.wst.wsdl.util.WSDLResourceImpl;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDSchema;
import org.ijis.gra.catalog.Catalog.CatalogType1;
import org.ijis.gra.catalog.Catalog.DocumentRoot;
import org.ijis.gra.catalog.Catalog.IepdCatalogType;
import org.ijis.gra.catalog.Catalog.util.CatalogResourceFactoryImpl;
import org.ijis.gra.uml.m2t.ui.Rfp2DocAction;
/*
import org.search.niem.mpd.cat.CatFactory;
import org.search.niem.mpd.cat.CatPackage;
import org.search.niem.mpd.cat.CatalogType;
import org.search.niem.mpd.cat.FileSetType;
import org.search.niem.mpd.cat.FileType;
import org.search.niem.mpd.cat.util.CatExt;
import org.search.niem.mpd.cat.util.CatResourceFactoryImpl;
*/
import org.ijis.gra.uml.qvt.ui.Activator;
import org.ijis.gra.uml.util.GraUtility;
import org.search.niem.mpd.cat.CatFactory;
import org.search.niem.mpd.cat.CatPackage;
import org.search.niem.mpd.cat.CatalogType;
import org.search.niem.mpd.cat.FileSetType;
import org.search.niem.mpd.cat.FileType;
import org.search.niem.mpd.cat.util.CatExt;
import org.search.niem.mpd.cat.util.CatResourceFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;









import data.grauml.graAnnotationModel.GraAnnotationModelPackage;
import data.grauml.graAnnotationModel.ServiceDescription;
//import data.grauml.graAnnotationModel.graaPackage;
import data.grauml.graAnnotationModel.util.GraAnnotationModelAdapterFactory;
//import data.grauml.graAnnotationModel.util.graaAdapterFactory;

final class GraSppModel2artifactDelegate 
//	extends NIEMpsm2xsdDelegate 
	extends TransformDelegate
	{
	private static final Logger LOG = LoggerFactory.getLogger(GraSppModel2artifactDelegate.class);

//    private static final String CHANGELOG_TEXT = "Changelog for %s%nVersion %s %s%nDescription of Changes:";
    //private ModelExtent theTargetContents;
    protected URI targetFolder;
    
    protected ModelExtent catTarget;
    protected ModelExtent metadataTarget;
    protected ModelExtent wsdlTarget;
    protected ModelExtent annotationTarget;

    protected GraSppModel2artifactDelegate(final URI selection) {
        super(selection, org.ijis.gra.uml.qvt.Activator.INSTANCE.getGraSppmodel2artifactLocation(), Activator.INSTANCE
                .getString("_UI_GRAmpdmodel2artifact_Command_name"));
    }
/*
    @Override
    protected String getValidationMessage(final IStatus status) {
        return Activator.INSTANCE.getString("_UI_NIEMmpdmodel2artifact_validation_dialog_message");
    }

    @Override
    protected IStatus validate() {
        final MultiStatus theValidationStatus = new MultiStatus(Activator.PLUGIN_ID, IStatus.OK,
                Activator.INSTANCE.getString("_UI_NIEMmpdmodel2artifact_status_message"), null);
        final Element theMPD = findPsmMpd(theSelectedResource);
        if (theMPD == null) {
            return theValidationStatus;
        }
        if (isBlank(getMPDVersionID(theMPD))) {
            thePropertyIsMissing(theValidationStatus, "_UI_CatalogType_mpdVersionID_feature");
        }
        if (isBlank(getMPDBaseURI(theMPD))) {
            thePropertyIsMissing(theValidationStatus, "_UI_CatalogType_mpdURI_feature");
        }
        if (getMPDClassCode(theMPD) == null) {
            thePropertyIsMissing(theValidationStatus, "_UI_CatalogType_mpdClassCode_feature");
        }
        if (isBlank(getMPDCreationDate(theMPD))) {
            thePropertyIsMissing(theValidationStatus, "_UI_MetadataType_creationDate_feature");
        }
        if (isBlank(getMPDSecurityMarking(theMPD))) {
            thePropertyIsMissing(theValidationStatus, "_UI_MetadataType_securityMarkingText_feature");
        }
        if (getMPDDomains(theMPD).isEmpty()) {
            thePropertyIsMissing(theValidationStatus, "_UI_MetadataType_domainText_feature");
        }
        if (getMPDKeywords(theMPD).isEmpty()) {
            thePropertyIsMissing(theValidationStatus, "_UI_MetadataType_keywordText_feature");
        }
        if (isBlank(getMPDAuthoritativeSourceName(theMPD))) {
            thePropertyIsMissing(theValidationStatus, "_UI_AuthoritativeSourceType_aSName_feature");
        }
        final List<EObject> mpdPointsOfContact = getMPDPointsOfContact(theMPD);
        if (mpdPointsOfContact.isEmpty()) {
            thePropertyIsMissing(theValidationStatus, "_UI_AuthoritativeSourceType_pOC_feature");
        }
        for (final EObject poc : mpdPointsOfContact) {
            if (isBlank(getMPDPointOfContactName(poc))) {
                thePropertyIsMissing(theValidationStatus, "_UI_POCType_pOCName_feature");
            }
            if (getMPDPointOfContactEmailAddresses(poc).isEmpty()) {
                thePropertyIsMissing(theValidationStatus, "_UI_POCType_pOCEmail_feature");
            }
            if (getMPDPointOfContactPhoneNumbers(poc).isEmpty()) {
                thePropertyIsMissing(theValidationStatus, "_UI_POCType_pOCTelephone_feature");
            }
        }
        return theValidationStatus;
    }
*/
    @Override
    protected final ModelExtent[] arguments() {
    	/*
        theTargetContents = new BasicModelExtent(Collections.<EObject> emptyList());
        final ModelExtent targetLocation = new BasicModelExtent(Collections.<EObject> emptyList());
        final List<ModelExtent> arguments = new ArrayList<>(asList(super.arguments()));
        arguments.add(arguments.size() - 1, targetLocation);
        arguments.add(theTargetContents);
        return arguments.toArray(new ModelExtent[arguments.size()]);
        */
        /*
         * in uml:UML,out cat:SPPCAT,out metadata:METADATA,out wsdl:WSDL
         */
        //targetFolder = theSelectedResource.getURI().trimFileExtension();
        targetFolder=GraUtility.getTargeDirectorytURI(theSelectedResource);
        final URI infrastructureTargetFolder = createURI(appendPath(targetFolder, getXmlSchemasFolder()).toString() + "/",
                true);
        
        ModelExtent psmContents = new BasicModelExtent(theSelectedResource.getContents());
        catTarget = new BasicModelExtent(Collections.<EObject> emptyList());
        metadataTarget = new BasicModelExtent(Collections.<EObject> emptyList());
        wsdlTarget = new BasicModelExtent(Collections.<EObject> emptyList());
        annotationTarget = new BasicModelExtent(Collections.<EObject> emptyList());
        final Collection<ModelExtent> modelExtents = new ArrayList<>();
        modelExtents.add(psmContents);
        for (final URI infrastructureSchemaLocation : org.ijis.gra.xsd.library.Activator.INSTANCE
                .getInfrastructureSchemaLocations()) {
            modelExtents.add(new BasicModelExtent(getInfrastructureResource(infrastructureSchemaLocation,
                    infrastructureTargetFolder).getContents()));
            break;
        }
        
        modelExtents.add(catTarget);
        modelExtents.add(metadataTarget);
        //modelExtents.add(wsdlTarget);// no longer
        modelExtents.add(annotationTarget);
        return modelExtents.toArray(new ModelExtent[modelExtents.size()]);
    	
    }
    protected URI targetGraFolder() {
        return targetFolder;
    }

    @Override
    protected final void persist() throws IOException {
        final URI theCatalogURI = appendPath(targetGraFolder(), getMPDCatalogName());
        final URI theCatalogParent = theCatalogURI.trimSegments(1);
        LOG.info("catalog URI "+theCatalogURI+", base "+targetGraFolder()+", catalog "+getMPDCatalogName());
        refresh();// refresh now to pick up possible added target folder, otherwise will get "resource already exists" error
        final Resource theCatalog = new CatalogResourceFactoryImpl().createResource(theCatalogURI);
        theCatalog.getContents().addAll(catTarget.getContents());
        theCatalog.save(resourceSet.getLoadOptions());

        final URI theMetadataURI = appendPath(targetGraFolder(), getMetadataName());
        final Resource theMetadata = new graResourceFactoryImpl().createResource(theMetadataURI);
        theMetadata.getContents().addAll(metadataTarget.getContents());
        theMetadata.save(resourceSet.getLoadOptions());

        // multiple wsdls
        LOG.info("wsdls "+wsdlTarget.getContents()+", "+getTargetWsdls());
        for (final Definition definition : getTargetWsdls()) {
            final Resource wsdl = new WSDLResourceImpl(appendPath(targetFolder, definition.getLocation()));
            resourceSet.getResources().add(wsdl);
            wsdl.getContents().add(definition);
            wsdl.save(resourceSet.getLoadOptions());
        }
        
        LOG.info("annotations "+annotationTarget.getContents()+", "+getTargetAnnotations());
        String templateURI="http://lib.modeldriven.org/MDLibrary/trunk/Specifications/GRA/GRA-UML-Modeling-Tool/StandardTemplate/SSP/";
        for (final ServiceDescription serviceDescription : getTargetAnnotations()) {
        	String testTransformationURI=serviceDescription.getTransformationUri();
        	if((testTransformationURI!=null)&&(testTransformationURI.length()>0)){
                LOG.info("TransformationURI at "+testTransformationURI);
        		templateURI=testTransformationURI+"/";
        	}
        	GraAnnotationModelAdapterFactory graAnnotationModelAdapterFactory=new GraAnnotationModelAdapterFactory();
            resourceSet.getAdapterFactories().add(graAnnotationModelAdapterFactory);
            URI annotationUri=appendPath(targetFolder, "artifacts/annotations.xmi");
            EMOFResourceFactoryImpl emofResourceFactoryImpl=new EMOFResourceFactoryImpl();
            
            final EMOFResourceImpl annotationResource=(EMOFResourceImpl)emofResourceFactoryImpl.createResource(annotationUri);
            resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
            resourceSet.getResources().add(annotationResource);
            annotationResource.getContents().add(serviceDescription);
            // need to fixup result, so save as string, fixup, then save to file
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            annotationResource.save(baos, annotationResource.getDefaultSaveOptions());
            String xmlDocument=baos.toString().replace("@", "").replace("xmi:version=\"2.0\"", "")
            		.replace("xmi:type=","xsi:type=")
            		.replace("xmlns:xmi=\"http://www.omg.org/XMI\"", 
            				"xmlns:xmi=\"http://www.omg.org/spec/XMI/20110701\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""+
            				" xsi:schemaLocation=\"http://ijis.org/GRA/Annotations  http://lib.modeldriven.org/MDLibrary/trunk/Specifications/GRA/GRA-UML-Modeling-Tool/plugins/org.ijis.gra.annotation/src/main/resources/model/data.grauml.graAnnotationModelXMI.xsd http:/ijis.org/GRA/WSDLAnnotations http://lib.modeldriven.org/MDLibrary/trunk/Specifications/GRA/GRA-UML-Modeling-Tool/plugins/org.ijis.gra.annotation/src/main/resources/model/data.grauml.graWsdlXMI.xsd\""
					// supposedly, the OMG AB would not like this (harmless) emof declaration inserted by eclipse
					);
            xmlDocument=xmlDocument.replace("xmlns:emof=\"http://schema.omg.org/spec/MOF/2.0/emof.xml\"","");
            						
            //LOG.info("TransformationURI emof check "+xmlDocument);
            

            OutputStream fos=resourceSet.getURIConverter().createOutputStream(annotationUri);
            fos.write(xmlDocument.getBytes());
            fos.close();
        }
        
        
        refresh();
        // at this point, we could do a pim to niem mpd for each iepd;
        //  we need to read the spp catalog, find the iepd entries, use that as the target
        //		and selectively execute to pim to niem for each target 
        // this could be a CompostedTransformation if we could hand off some state to the pim-niem set
        // for now, look at catalog and determine the iepd
		System.out.println("GraSppMod2artifactDelegate catalog "+theCatalog);
        for(EObject test:theCatalog.getContents()){
    		System.out.println("GraSppModel2artifactDelegate catalog content "+test);
        	if(test instanceof DocumentRoot){
        		DocumentRoot documentRoot=(DocumentRoot)test;
        		CatalogType1 catalog=documentRoot.getCatalog();
        		for(IepdCatalogType iepdCatalog:catalog.getIepdCatalog()){
	        		if(iepdCatalog==null){
	            		System.out.println("GraSppMod2artifactDelegate FAILED to get iepd Catalog "+catalog);
	        			
	        		}else{
	        		String href=iepdCatalog.getHref();
	        		System.out.println("GraSppMod2artifactDelegate iepd at "+href);
	        		}
        		}
        	}
        }
        // and we want to generate the SDD/SIDD in this sequence as well
        // determine the "template" location, by default:
        String antScriptURI=templateURI+"graPhase2.ant.xml";
        
        // copy antScript and execute it
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        URI templateAntURI=URI.createURI(antScriptURI);
        InputStream fis=resourceSet.getURIConverter().createInputStream(templateAntURI);
        byte byteArray[]=new byte[10000];
        int count=0;
        while((count=fis.read(byteArray))>0){
        	baos.write(byteArray, 0, count);
        }
        fis.close();
        URI theAntURI = appendPath(targetGraFolder(), "graPhase2.ant.xml");
        OutputStream fos=resourceSet.getURIConverter().createOutputStream(theAntURI);
        fos.write(baos.toByteArray());
        fos.close();
        // execute the ant in context of eclipse
        AntRunner antRunner=new AntRunner();
        //String buildFileLocation=theAntURI.toFileString();
        String platform=theAntURI.toPlatformString(true);
		File file=ResourcesPlugin.getWorkspace().getRoot().findMember(platform).getRawLocation().toFile();
		String buildFileLocation=file.getAbsolutePath();
        antRunner.setBuildFileLocation(buildFileLocation);
        
        try {
            LOG.info("run ant "+buildFileLocation+", "+theAntURI+", "+platform);
			antRunner.run();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    protected final Iterable<Definition> getTargetWsdls() {
        return getObjectsByType(wsdlTarget.getContents(), WSDLPackage.Literals.DEFINITION);
    }
    protected final Iterable<ServiceDescription> getTargetAnnotations() {
//        return getObjectsByType(annotationTarget.getContents(), GraAnnotationModelPackage.Literals.SERVICE_DESCRIPTION);
        return getObjectsByType(annotationTarget.getContents(), GraAnnotationModelPackage.Literals.SERVICE_DESCRIPTION);
    }
    
/*
    private void thePropertyIsMissing(final MultiStatus theStatusAccumulator, final String thePropertyKey) {
        theStatusAccumulator.add(new Status(IStatus.WARNING, Activator.PLUGIN_ID, Activator.INSTANCE.getString(
                "_UI_NIEMmpdmodel2artifact_status_missing_property",
                new Object[] { org.search.niem.mpd.Activator.INSTANCE.getString(thePropertyKey) })));
    }

    private void addFile(final String id, final String nature, final String purpose, final String relativePath) {
        final FileType aFile = CatFactory.eINSTANCE.createFileType();
        aFile.setId(id);
        aFile.setNatureURI(nature);
        aFile.setPurposeURI(purpose);
        aFile.setRelativePathName(relativePath);
        addCatalogFile(getTheCatalog(), aFile);
    }
*/    
// TODO: niem inaccessible, is private in superclass, also via preference, and constant P_MPD_CATALOG_FILE_NAME inaccessible
    protected String getMPDCatalogName() {
        //return getThePrefenceStore().getString(P_MPD_CATALOG_FILE_NAME);
    	return "catalog.xml";
    }
    protected String getMetadataName() {
//    	return "Metadata.xml";
    	return "metadata.xml";
    }
    /*

    private String getXmlSamplesDirectory() {
        //return getThePrefenceStore().getString(P_XML_SAMPLES_FOLDER);
    	return "XMLsamples";
    }

    private String getSampleXmlSuffix() {
       // return getThePrefenceStore().getString(P_SAMPLE_XML_SUFFIX);
    	return "xml";
    }
    private String getChangelogName() {
        //return getThePrefenceStore().getString(P_CHANGELOG_FILE_NAME);
        return "changelog.xml";
    }
    private IPreferenceStore getThePrefenceStore() {
        return Activator.getPlugin().getPreferenceStore();
    }

    private Iterable<XSDSchema> getTheExchangeSchemas() {
        final Collection<XSDSchema> theExchangeSchemas = new ArrayList<>();
        final CatalogType theCatalog = getTheCatalog();
        @SuppressWarnings("unchecked")
        final Collection<FileSetType> fileSets = (Collection<FileSetType>) theCatalog.getArtifactGroup().get(
                CatPackage.Literals.DOCUMENT_ROOT__FILE_SET, false);
        for (final FileSetType fileSet : fileSets) {
            if (isExchangeSchemaSet(fileSet)) {
                final List<FileType> files = fileSet.getFile();
                for (final FileType file : files) {
                    if (isExchangeSchema(file)) {
                        theExchangeSchemas.add(findSchemaFor(file));
                    }
                }
            }
        }
        @SuppressWarnings("unchecked")
        final Collection<FileType> files = (Collection<FileType>) theCatalog.getArtifactGroup().get(
                CatPackage.Literals.DOCUMENT_ROOT__FILE, false);
        for (final FileType file : files) {
            if (isExchangeSchema(file)) {
                theExchangeSchemas.add(findSchemaFor(file));
            }
        }
        return theExchangeSchemas;
    }

    private CatalogType getTheCatalog() {
        return CatExt.getTheCatalog((EObject) EcoreUtil.getObjectByType(theTargetContents.getContents(),
                CatPackage.Literals.DOCUMENT_ROOT));
    }

    private XSDSchema findSchemaFor(final FileType file) {
        final Iterable<XSDSchema> targetSchemas = getTargetSchemas();
        final String[] pathSegments = file.getRelativePathName().replaceFirst("^\\./", "").split("/");
        NEXT_SCHEMA: for (final XSDSchema nextSchema : targetSchemas) {
            final URI nextSchemaURI = nextSchema.eResource().getURI();
            final int segmentCount = nextSchemaURI.segmentCount();
            if (pathSegments.length > segmentCount) {
                continue NEXT_SCHEMA;
            }
            for (int i = 0; i < pathSegments.length; i++) {
                if (!pathSegments[pathSegments.length - 1 - i].equals(nextSchemaURI.segment(segmentCount - 1 - i))) {
                    continue NEXT_SCHEMA;
                }
            }
            return nextSchema;
        }
        return null;
    }

    private boolean isExchangeSchemaSet(final FileSetType fileSet) {
        final String purposeURI = fileSet.getPurposeURI();
        return EXCHANGE_SCHEMA_SET_PURPOSE.equals(purposeURI);
    }

    private boolean isExchangeSchema(final FileType file) {
        final String natureURI = file.getNatureURI();
        return EXCHANGE_SCHEMA_NATURE.equals(natureURI);
    }
*/
    protected void refresh() {
    	// do this synchronously to make sure resources visible
        try {
        toIFolder(targetGraFolder()).refreshLocal(DEPTH_INFINITE, new NullProgressMonitor());
        } catch (final CoreException e) {
            Activator.INSTANCE.log(e);
        }
        /*
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                try {
//                    toIFolder(targetFolder()).refreshLocal(DEPTH_INFINITE, new NullProgressMonitor());
                    toIFolder(targetGraFolder()).refreshLocal(DEPTH_INFINITE, new NullProgressMonitor());
                    
                } catch (final CoreException e) {
                    Activator.INSTANCE.log(e);
                }
            }
        });
        */
    }
/*
    private Iterable<Resource> generateTheXmlSamples(final URI theSamplesDirectory) {
        toFile(theSamplesDirectory).mkdirs();
        final Collection<Resource> theXmlSamples = new ArrayList<>();
        for (final XSDSchema xsdSchema : getTheExchangeSchemas()) {
            for (final XSDElementDeclaration xsdElementDeclaration : xsdSchema.getElementDeclarations()) {
                final String elementName = xsdElementDeclaration.getName();
                if (xsdElementDeclaration.getSchema() == xsdSchema && elementName != null) {
                    SafeRunner.run(new ISafeRunnable() {
                        @Override
                        public void run() throws Exception {
                            final Resource anXmlSample = new NewXMLGeneratorExtension(xsdSchema, theSamplesDirectory
                                    .appendSegment(elementName + getSampleXmlSuffix()).appendFileExtension("xml"),
                                    elementName).generateSample();
                            theXmlSamples.add(anXmlSample);
                        }

                        @Override
                        public void handleException(final Throwable e) {
                            Activator.INSTANCE.log(e);
                        }
                    });
                }
            }
        }
        return theXmlSamples;
    }
    */
}