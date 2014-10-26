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
import org.ijis.gra.uml.m2t.SDD;
import org.ijis.gra.uml.m2t.SIDD;
import org.ijis.gra.uml.util.GraUtility;



/**
 * @author Tom
 *
 */
public class SIDDAction extends SDDAction
{
	// TODO: multiple SIDD documents, one per Interface
	public SIDDAction(String id, String name)
	{
	super(id, name);
	}
	protected String getGraDocumentTemplateType(){return "template_SIDD_v_1.0.0";}
	protected String getGraDocumentType(){return "SIDD";}
	protected String getDocumentParentPath(Model root){
		return super.getDocumentParentPath(root)+getArtifactPackageName(root)+"/";
	}
	protected String getArtifactPackageName(Model root){
		// TODO:  name of current interface
		return getGraDocumentType();
	}
	
	protected void modelToTextMasterDocument(Model root,File targetFolder) throws IOException{
		// startup transformation, passing in params 
    		List<String> args=new Vector<String>();
    	    //Model root = getCurrentModelRoot();//project.getModel(); 
    	    if(root==null)return;
    	    //log.log("start master document provisioning");
    		SIDD masterDocument=new  SIDD(root,  targetFolder,args);
    		masterDocument.doGenerate(new BasicMonitor());
    	    //log.log("completed master document provisioning");
    		
    		
	}

	}