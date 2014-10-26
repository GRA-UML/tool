/**
 * 
 */
package org.ijis.gra.uml.m2t.ui;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.zip.ZipOutputStream;

import javax.script.ScriptEngine;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.ijis.gra.uml.m2t.SDD;
import org.ijis.gra.uml.ui.GraCommonAction;
import org.ijis.gra.uml.util.GraUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author Tom
 *
 */
public class SDDAction extends Rfp2DocAction
{
    private static final Logger LOG = LoggerFactory.getLogger(SDDAction.class);

	public SDDAction(String id, String name)
	{
	super(id, name);
	}
	protected String getGraDocumentTemplateType(){return "template_SDD_v_1.0.0";}
	protected String getGraDocumentType(){return "SDD";}
	protected String getGraDocumentTypeFragment(){return "_"+getGraDocumentType()+"_";}
	protected String getGraDocumentExtension(){return ".docx";}
	protected String getSddName(Model root){
		return getSspName(root).replace(getSspTypeFragment(),getGraDocumentTypeFragment());
	}
	protected String getMasterDocumentBuildDirectoryName(Model root){
		return getGraDocumentType();
	}
	
	protected String getDocumentParentPath(Model root){
		return "artifacts/";
	}
	protected String getDocumentName(Model root){
		return getDocumentParentPath(root)+getSddName(root)+getGraDocumentExtension();
	}
	protected String getDocumentTemplateResourceName(){
//		return "template/"+getGraDocumentType()+getGraDocumentExtension();
//		return "templates/edited/"+getGraDocumentTemplateType()+getGraDocumentExtension();
		return "org/ijis/gra/uml/m2t/"+getGraDocumentTemplateType()+getGraDocumentExtension();
	}
	 public Model getCurrentModelRootX(IFile modelFile){
		String pathName=modelFile.getFullPath().toString();
		org.eclipse.emf.common.util.URI uri=org.eclipse.emf.common.util.URI.createPlatformResourceURI(pathName, true);
		ResourceSet resourceSet=new ResourceSetImpl();
		UMLUtil.init(resourceSet);
		LOG.info("Get resource at "+uri);
		Resource resource=resourceSet.getResource(uri, true);
		LOG.info("Got resource "+resource);
		for(EObject test:resource.getContents()){
			if(test instanceof Model)return (Model)test;
		}
	    return null;
	}
	
	public void performModelToText(IProgressMonitor progressStatus,long startTime, IFile selectedIFile) throws IOException
	{
	    LOG.info("start model to text");
		currentAction=this;
		//log.log("starting master-document model to text");
		File selectedFile=selectedIFile.getLocation().toFile();
	    Model root = getCurrentModelRootX(selectedIFile);//project.getModel(); 
	    LOG.info("getting Target Directory");
		File targetGraFolder=GraUtility.getTargetDirectory(root);
	    LOG.info("Target Directory is "+targetGraFolder);
		
		File graWorkspaceFolder=targetGraFolder.getParentFile();
		File graFolder=targetGraFolder;
		if(graWorkspaceFolder==null){
			LOG.error("ERROR: stopping master-document provision; failed to resolve parent directory from targetDirectory "+targetGraFolder);
			return;
		}
		File masterDocumentTempDirectory=new File(getMasterDocumentBuildDirectory(root));
		InputStream inputStream=getClass().getClassLoader().getResourceAsStream(getDocumentTemplateResourceName());
		unzipDoc(inputStream,masterDocumentTempDirectory);
		modelToTextMasterDocument(root,targetGraFolder);

		//File masterDocumentTempDirectory=new File(mpdFromPimBaseDirectory.getAbsolutePath()+"/temp~/master-document");
		
		//File masterDocumentStaticDirectory=new File(getPluginDirectory()+"master-document.static");
		//File mpdStaticDirectory=new File(getPluginDirectory()+"mpd.static");
		File masterDocumentOdtFile=new File(graFolder,getDocumentName(root));
		File mpdFromPimFile=graWorkspaceFolder;
		
		masterDocumentTempDirectory.mkdirs();
		masterDocumentOdtFile.getParentFile().mkdirs();
		zipMasterDocumentOdt(masterDocumentTempDirectory,masterDocumentOdtFile);
		//staticMpdCopy(log,mpdStaticDirectory,mpdFile);
	}
	protected void modelToTextMasterDocument(Model root,File targetFolder) throws IOException{
		// startup transformation, passing in params 
    		List<String> args=new Vector<String>();
    	    //Model root = getCurrentModelRoot();//project.getModel(); 
    	    if(root==null)return;
    	    //log.log("start master document provisioning");
    		SDD masterDocument=new  SDD(root,  targetFolder,args);
    		masterDocument.doGenerate(new BasicMonitor());
    	    //log.log("completed master document provisioning");
    		
    		
	}
	/*
	public void updateState()
	{
		// enable if some editable top level model profiled with e2 provisioning profile
		
		Boolean enabled=false;
        Model root = getCurrentModelRoot();
        if(root!=null){
        	for(Package p:root.getNestedPackage()){
        		if(!(p instanceof Model))continue;
        		for(ProfileApplication pa:p.getProfileApplication()){
        			Profile pro=pa.getAppliedProfile();
        			if(pro==null)continue;
        			if(E2_PROVISIONING_PROFILE_NAME.equals(pro.getName())){
        				enabled=true;
        				break;
        			}
        		}
        		if(enabled)break;
        	}
        }

		setEnabled(enabled);
	}	
*/
	}