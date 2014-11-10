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

import static org.eclipse.emf.common.util.URI.createURI;
import static org.eclipse.emf.ecore.util.EcoreUtil.getObjectsByType;
import static org.search.niem.uml.qvt.ui.preferences.PreferenceConstants.P_XML_SCHEMAS_FOLDER;
import static org.ijis.gra.uml.util.URIExt.appendPath;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.validation.internal.util.Log;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.uml2.uml.Model;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDSchema;
import org.ijis.gra.uml.qvt.ui.Activator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// tjd: note that the class is not public either
class NIEMpsm2xsdDelegate extends TransformDelegate {
	private static final Logger LOG = LoggerFactory.getLogger(NIEMpsm2xsdDelegate.class);


    private ModelExtent targetContents;
    private URI targetFolder;

    protected NIEMpsm2xsdDelegate(final URI selection) {
        this(selection, org.ijis.gra.uml.qvt.Activator.INSTANCE.getNIEMpsm2xsdLocation(), Activator.INSTANCE
                .getString("_UI_NIEMpsm2xsd_Command_name"));
    }

    protected NIEMpsm2xsdDelegate(final URI selection, final URI transformationURI, final String name) {
        super(selection, transformationURI, name);
    }


    @Override
    protected Map<String, Object> getConfigProperties() {
        final Map<String, Object> configProperties = super.getConfigProperties();
        configProperties.put("xmlSchemasFolder", getXmlSchemasFolder());
        return configProperties;
    }
    
    // tjd added retrieval of active psm iepd model
    protected org.eclipse.uml2.uml.Package getPsmIepdModel(){
		// top model
    	for(EObject top:theSelectedResource.getContents()){
    		if(top instanceof Model){
    			// PSM
    			org.eclipse.uml2.uml.Package psm=((Model)top).getNestedPackage("PSM");
    			for(org.eclipse.uml2.uml.Package iepd:psm.getNestedPackages()){
    				if(isActiveIepdComponent(iepd))return iepd;
    			}
    		}
    	}
    	return null;
    }
    protected boolean isActiveIepdComponent(org.eclipse.uml2.uml.Package iepd){
    	return true;  // initially
    }
    
    @Override
    protected ModelExtent[] arguments() {
        final ModelExtent psmContents = new BasicModelExtent(theSelectedResource.getContents());
        targetContents = new BasicModelExtent(Collections.<EObject> emptyList());
        targetFolder = theSelectedResource.getURI().trimFileExtension();
        
        // tjd add gra path to targetFolder
        // tjd TODO: need to support multiple IEPDs and name each one
        //  we could iterate at a higher level and adjust the targetFolder for each iteration
        //  but can not override the final transform of TransformDelegate, so would need to be outside the delegate pattern
        //  in any case, assume the qualifying PSM MPD Model is the name of the IEPD
        org.eclipse.uml2.uml.Package psmIepdModel=getPsmIepdModel();
        String iepdName="IEPD";
        if(psmIepdModel!=null)iepdName=psmIepdModel.getName();
        targetFolder = createURI(appendPath(targetFolder,"artifacts/service model/information model/"+iepdName).toString()+"/",true);
        
        final URI infrastructureTargetFolder = createURI(appendPath(targetFolder, getXmlSchemasFolder()).toString() + "/",
                true);

        final Collection<ModelExtent> modelExtents = new ArrayList<>(6);
        modelExtents.add(psmContents);
        for (final URI infrastructureSchemaLocation : org.ijis.gra.xsd.library.Activator.INSTANCE
                .getInfrastructureSchemaLocations()) {
            modelExtents.add(new BasicModelExtent(getInfrastructureResource(infrastructureSchemaLocation,
                    infrastructureTargetFolder).getContents()));
        }
        modelExtents.add(targetContents);
        return modelExtents.toArray(new ModelExtent[modelExtents.size()]);
    }

    protected final Iterable<XSDSchema> getTargetSchemas() {
        return getObjectsByType(targetContents.getContents(), XSDPackage.Literals.XSD_SCHEMA);
    }

    @Override
    protected void persist() throws IOException {
    	// make sure eclipse workspace uptodate
    	for(IProject project:ResourcesPlugin.getWorkspace().getRoot().getProjects()){
    		try {
				project.refreshLocal(IProject.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
        final HashMap<Object, Object> saveOptions = new HashMap<>(resourceSet.getLoadOptions());
        for (final Resource infrastructureResource : infrastructureResources) {
            infrastructureResource.save(saveOptions);
        }
        for (final XSDSchema schema : getTargetSchemas()) {
            final Resource xsd = resourceSet.createResource(appendPath(targetFolder, schema.getSchemaLocation()));
            xsd.getContents().add(schema);
            LOG.info("Persist to "+xsd.getURI());
            xsd.save(saveOptions);
        }
    }

    protected final URI targetFolder() {
        return targetFolder;
    }
}