/**
 * 
 */
package org.ijis.gra.uml.util;

import java.io.File;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;

/**
 * @author tom
 *
 */
public class GraUtility implements GraConstants{
	public static File getTargetDirectory(Model root){
		URI modelDirectoryUri=getTargeDirectorytURI(root.eResource());
		File modelDirectory=null;
		if(modelDirectoryUri.isFile()){
			modelDirectory=new File(modelDirectoryUri.toFileString());
		}else{
			String filePath=modelDirectoryUri.toPlatformString(true);
			//IResource resource=ResourcesPlugin.getWorkspace().getRoot().findMember(path);
			Path path=new Path(filePath);
			IResource resource=ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
			modelDirectory=resource.getLocation().toFile();
		}
		File result=modelDirectory;
		/*
		URI modelUri=root.eResource().getURI();
		File modelFile=null;
		if(modelUri.isFile()){
			modelFile=new File(modelUri.toFileString());
		}else{
			String path=modelUri.toPlatformString(true);
			IResource resource=ResourcesPlugin.getWorkspace().getRoot().findMember(path);
			modelFile=resource.getLocation().toFile();
		}
		File modelFolder=modelFile.getParentFile();
		File result=new File(modelFolder,DEFAULT_GRA_PROVISIONING_FOLDER);
		*/
		if(!result.exists())result.mkdirs();
		return result;
	}
	public static URI getTargeDirectorytURI(Resource theSelectedResource){
		return theSelectedResource.getURI().trimFileExtension();
	}

	public static Boolean isEditable(Element element){
		Resource resource=element.eResource();
		if(resource!=null){
			URI uri=resource.getURI();
			if(uri!=null)
				return uri.isFile()||uri.isPlatformResource();
		}
		return false;
//		return element.isEditable();
//		return true;
	}
	
}
