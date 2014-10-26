/**
 * 
 */
package org.ijis.gra.uml.m2t.ui;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.zip.ZipOutputStream;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.internal.qvt.oml.evaluator.TransformationInstance;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModuleImport;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.uml2.uml.Model;
import org.ijis.gra.uml.ui.GraCommonAction;
import org.ijis.gra.uml.util.GraUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




/**
 * @author Tom
 *
 */
public class Rfp2DocAction extends GraCommonAction
{
    private static final Logger LOG = LoggerFactory.getLogger(Rfp2DocAction.class);
	static protected Rfp2DocAction currentAction=null;
	public Rfp2DocAction(String id, String name)
	{
	super(id, name);
	currentAction=this;
	}
	static public Rfp2DocAction getCurrentAction(){return currentAction;}
	/**
	* Entered when button pushed.
	 * @throws IOException 
	*/
	public void performTransform(IProgressMonitor progressStatus,long startTime, IFile selectedFile) throws IOException
	{
		LOG.info("Start perform M2T");
		currentAction=this;
	    //MDLog log=new MDLog(progressStatus);
	    try {
			performModelToText(progressStatus, startTime,  selectedFile);			
	    }
	    finally{}
			return;
	}
	/*
	public void updateState()
	{
		// enabled if current project contains component stereotyped with mpd
		Boolean enabled=false;// not currently implemented getRfpModel()!=null;
	    setEnabled(enabled);
	}
	*/	
	//////////////////////////////////////////////////////////////////////////////////////
	/*
	protected void initializeQvtModels() throws IOException
	{
		if(compositeQVTMap!=null)return;
		// do a qvt to initialize set of qvt models
	    ScriptEngine qvtEngine = getQvtEngine();
	    if(qvtEngine==null)return;
	    ExecutionContextImpl executionContext=new ExecutionContextImpl();
	    executionContext.setLog(log);
	    qvtEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
	    registerPackages(log,qvtEngine);
	    setTransform("composite.qvto",qvtEngine);

	    log.log("start loading MOF QVT resources");
        try {
			qvtEngine.eval((String) null);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			log.log("initializeQvtModels ERROR "+e);
			e.printStackTrace();
		}
		
	}
	*/
	//static protected Module compositeQVT=null;
	/*
	static protected Map<String,Module> compositeQVTMap=null;
	static public Module getModule(String name){
		return compositeQVTMap.get(name);
	}
	static public void setCompositeQVT(Module module){
		//log("set composite QVT "+module.getClass().getName()+" : "+module);
		compositeQVTMap=new HashMap<String,Module>();
		setCompositeQVTEntries(module);
	}
	static protected void setCompositeQVTEntries(Module module){
		if(compositeQVTMap.containsKey(module.getName()))return;
		//log("set composite QVT Entry "+module.getName()+" : "+module);
		compositeQVTMap.put(module.getName(),module);
		for(ModuleImport moduleImport:module.getModuleImport()){
			setCompositeQVTEntries(moduleImport.getImportedModule());
		}
	}
	*/
	public File getTargetDirectoryParent(Model root){
		return GraUtility.getTargetDirectory(root).getParentFile();
	}
	protected String getMasterDocumentBuildDirectoryName(Model root){
		return getSspName(root);
	}
	public String getMasterDocumentBuildDirectory(Model root){
		String result= getTargetDirectoryParent(root).getAbsolutePath()+"/temp~/"+getMasterDocumentBuildDirectoryName(root);
		File buildDirectory=new File(result);
		if(!buildDirectory.exists())buildDirectory.mkdirs();
		return result;
	}
	protected void performModelToText(IProgressMonitor progressStatus,long startTime, IFile selectedIFile) throws IOException
	{
		//log.log("starting rfp model to text document");
		File selectedFile=selectedIFile.getLocation().toFile();
	    Model root = getCurrentModelRoot(selectedIFile);//project.getModel(); 
		File targetDirectory=GraUtility.getTargetDirectory(root);
		File mpdFile=targetDirectory;
		File masterDocumentTempDirectory=new File(getMasterDocumentBuildDirectory(root));
		//File masterDocumentStaticDirectory=new File(getPluginDirectory()+"master-document.static");
		File masterDocumentOdtFile=new File(mpdFile,getSspName(root)+".docx");
		if(masterDocumentOdtFile.exists()&&!masterDocumentOdtFile.canWrite()){
	    	//javax.swing.JOptionPane.showMessageDialog( getFrame(), "Target Document is currently not writable: "+masterDocumentOdtFile);
			return;
		}
		//log.log("using directory "+targetDirectory.getAbsolutePath()+", "+getProject().getName());
	    registerFactories();
//if(false)// no longer used	    
//	    initializeQvtModels(/*log*/);
		modelToTextMasterDocument(root,targetDirectory);
		masterDocumentTempDirectory.mkdirs();
		zipMasterDocumentOdt(masterDocumentTempDirectory,masterDocumentOdtFile);
		// open browser to view document
		// does not work
		//NativeWebBrowserLauncher.openURL(masterDocumentOdtFile.toURL().toExternalForm());
	}
	protected String getSspTypeFragment(){return "_SSP_";}
	
	protected String getSspName(Model root){
			//return getProject().getName();
		String name=root.eResource().getURI().lastSegment();
		//String name=modelFile.getName();
		int index=name.lastIndexOf(".");
		if(index>0)name=name.substring(0,index);
		return name;
	}
	protected void modelToTextMasterDocument(Model root,File targetFolder) throws IOException{
		// startup transformation, passing in params 
    		List<String> args=new Vector<String>();
//    	    Model root = getCurrentModelRoot();//project.getModel(); 
    	    if(root==null)return;
    	    //log.log("start rfp document provisioning "+root+", "+root.getName());
    	    /* not currently implemented
    	    OmgRfpNiem masterDocument=new  OmgRfpNiem(root,  targetFolder,args);
    		masterDocument.doGenerate(new BasicMonitor());
    		*/
    	    //log.log("completed rfp document provisioning");
    		
    		
	}
	
	}