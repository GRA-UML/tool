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
package org.ijis.gra.uml.m2t;

import static java.util.Arrays.asList;
import static org.apache.commons.lang.StringUtils.defaultIfBlank;
//import static org.eclipse.uml2.uml.util.UMLUtil.getBaseElement;
import static org.ijis.gra.uml.library.Activator.APPINFO2_NAMESPACE;
import static org.ijis.gra.uml.library.Activator.APPINFO_NAMESPACE;
import static org.ijis.gra.uml.resources.Activator.getNiemUmlProfile;
import static org.ijis.gra.uml.resources.Activator.getXmlPrimitiveTypes;
import static org.ijis.gra.uml.util.NIEMTypes.NIEM_PIM_Profile;
import static org.ijis.gra.uml.util.NIEMUmlExt.createPOC;
import static org.ijis.gra.uml.util.NIEMUmlExt.getAppliedReferencesStereotype;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDPointsOfContact;
import static org.ijis.gra.uml.util.NIEMUmlExt.getReferenceNameStereotypeApplication;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDAuthoritativeSourceAddress;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDAuthoritativeSourceName;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDAuthoritativeSourceWebsiteURL;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDBaseURI;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDCreationDate;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDDescription;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDDomains;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDExchangePartnerName;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDExchangePatternText;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDKeywords;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDPackageCode;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDPointOfContactEmailAddresses;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDPointOfContactName;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDPointOfContactPhoneNumbers;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDPurpose;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDSecurityMarking;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDStatusText;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDVersionID;
import static org.ijis.gra.uml.util.UMLExt.copyAttributes;
import static org.ijis.gra.uml.util.UMLExt.getStereotypeValue;
import static org.ijis.gra.uml.util.UMLExt.remove;
import static org.ijis.gra.uml.util.UMLExt.setStereotypeValue;
import static org.ijis.gra.uml.util.URIExt.appendPath;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.xsd.XSDAnnotation;
import org.eclipse.xsd.XSDImport;
import org.eclipse.xsd.XSDSchema;
import org.ijis.gra.uml.util.GraUtility;
import org.ijis.gra.uml.util.UMLExt;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GraM2tLibrary {

//	protected static Boolean isWord=true;
	protected static Boolean isWord=false;
	public String log(String text){
		System.out.println(text);
		return "";
	}
	public List<String> getDevelopmentArtifactPaths(Model mpd){
		// list this project's development artifacts 
		List<String> result=new Vector<String>();
		/*
		Resource resource=mpd.eResource();
		if(resource==null)return result;
		URI uri=resource.getURI();
		if(uri==null)return result;
		File file=null;
		if(uri.isFile()){
			 file=new File(uri.toFileString());//.getParentFile();
		}else if(uri.isPlatformResource()){
			URI parentUri=uri;//.trimSegments(1);
			String path=parentUri.toPlatformString(true);
			IWorkspace workspace=ResourcesPlugin.getWorkspace();
			IResource parentResource=workspace.getRoot().findMember(path);
			 file=parentResource.getLocation().toFile();
		}
		if(file==null)return result;
		*/
		File targetDirectory=GraUtility.getTargetDirectory(mpd);

		addArtifactPaths(targetDirectory,targetDirectory,result,true);
		/*
		// scan model for references
		Project project=getProject();
		Collection<com.nomagic.ci.persistence.IProject> projects=ProjectUtilities.getAllProjects(project);
		for(com.nomagic.ci.persistence.IProject p:projects){
			URI uri=p.getLocationURI();
			String filePath=uri.toFileString();
			if(filePath!=null){
				File file=new File(filePath);
				// if this is in eclipse project, expand project, otherwise just record the model location
				File eclipseProject=getEclipseProject(file);
				if(eclipseProject==null){
					result.add(file.getName());
					
				}else{
					addArtifactPaths(eclipseProject,eclipseProject,result,true);
				}
			}
		}
		*/
		return result;
	}
	protected File getEclipseProject(File file){
		if(isEclipseProject(file))return file;
		File parent=file.getParentFile();
		if(parent!=null)return getEclipseProject(parent);
		return null;
	}
	protected boolean isEclipseProject(File file){
		if(!file.isDirectory())return isEclipseProject(file.getParentFile());
		File test=new File(file,".project");
		return test.exists();
	}
	public List<String> getArtifactPaths(){
		return getArtifactPathsCommon(false);
	}
	protected List<String> getArtifactPathsCommon(boolean isDevelopment){
		File provisionFolder=CommonGenerator.getLastTargetDirectory();
		List<String> result=new Vector<String>();
		File projectFolder=provisionFolder.getParentFile();
		// if in model folder, may as well go one higher
		if("model".equals(projectFolder.getName()))projectFolder=projectFolder.getParentFile();
		addArtifactPaths(projectFolder,projectFolder,result,isDevelopment);
		return result;
	}
	protected void addArtifactPaths(File projectFolder,File subFolder,List<String> result,boolean isDevelopment){
		if(!subFolder.isDirectory())return;
		File workspaceFolder=projectFolder.getParentFile();
		for(File subFile:subFolder.listFiles()){
			// filter out some files/folders
			String fileName=subFile.getName();
			//if(fileName.startsWith("."))continue;
			if(fileName.startsWith(".svn"))continue;
			if(fileName.endsWith(".bak"))continue;
			if(fileName.startsWith("~"))continue;
			//if(fileName.equals("build.xml"))continue;
			if(fileName.equals("temp~"))continue;
			
			if(!subFile.isDirectory()){
//			result.add(subFile.getAbsolutePath().substring(projectFolder.getAbsolutePath().length()).replace("\\", "/"));
				if(isDevelopment==isDevelopmentFile(subFile)){
					result.add(subFile.getAbsolutePath().substring(workspaceFolder.getAbsolutePath().length()).replace("\\", "/"));
				}
			}else{
				// if this is a staging area for a workspace project, 
				// then expand that project instead of the staging area
				File otherProject=new File(workspaceFolder,fileName);
				if(otherProject.exists()){
					addArtifactPaths(otherProject,otherProject,result,isDevelopment);
				}else{
					addArtifactPaths(projectFolder,subFile,result,isDevelopment);
				}
			}
		}
	}
	protected boolean isDevelopmentFile(File file){
		String name=file.getName();
		if(name.endsWith(".mdzip"))return true;
		if(name.endsWith(".bak"))return true;
		if(name.endsWith(".ecore"))return true;
		if(name.endsWith(".genmodel"))return true;
		if(name.endsWith(".xsd"))return true;
		if(name.endsWith(".idl"))return true;
		if(name.endsWith(".java"))return true;
		if(name.startsWith("."))return true;
		if(name.equals("build.xml"))return true;
		return false;
	}
	public String getProjectName(Element element){
		return element.eResource().getURI().lastSegment().replace(".uml","");
	}
	/*
	protected Project getProject(){
		return Application.getInstance().getProject();
	}
	public Element getElementByID(String id){
		return (Element) getProject().getElementByID(id);
	}
	*/
	public EObject getElementByID(String id,EObject context){
		Resource resource=context.eResource();
		return resource.getEObject(id);
//		return (Element) getProject().getElementByID(id);
	}
	
	public String getID(Element element){
		Resource resource=element.eResource();
		return resource.getURIFragment(element);
		//return element.getID();
		//return E2Helper.getID(element);
	}
	
	public Boolean isEditable(Element element){
		return GraUtility.isEditable(element);
		/*
		Resource resource=element.eResource();
		if(resource!=null){
			URI uri=resource.getURI();
			if(uri!=null)
				return uri.isFile()||uri.isPlatformResource();
		}
		return false;
		*/
//		return element.isEditable();
//		return true;
	}
	protected static String anchorHeadBase="&lt;a href=\"";
	protected static String anchorHead="&lt;a href=\"mdel://";
	protected static String hrefTail="\">";
	protected static String anchorEndHead="&lt;";
	protected static String anchorEndTail="/a>";
	protected static String anchorEnd=anchorEndHead+anchorEndTail;
	protected int getNextAnchor(String html){
		int result=-1;
		int head=html.indexOf(anchorHeadBase);
		if(head>=0){
			int end=html.indexOf(anchorEnd, head);
			if(end>=0){
				return head;
			}
		}
		return result;
	}
	public String getCommentBody(Comment comment){
		String result=comment.getBody();
		if(result.contains("A specified classification (type or kind) of the MPD.")){
			log("getCommentBody "+result);
		}
		return result;
	}
	/*
	 * <a href="http://www.w3.org/TR/xmlschema-2/"><font size="3">http://www.w3.org/TR/xmlschema-2/</font></a>
	 */
	public String convertAnchors(String html,EObject context){
		String result=convertAnchorsInternal(html,context);
		return result;
	}
	protected String convertAnchorsInternal(String html,EObject context){
		String result=convertAllAnchors(html,context);
		result=convertPreformatted(result);
		return result;
	}
	protected static String preformatHead="&lt;pre>";
	protected static String preformatTail="&lt;/pre>";
	protected int getNextPreformatted(String html){
		int result=-1;
		int head=html.indexOf(preformatHead);
		if(head>=0){
			int end=html.indexOf(preformatTail, head);
			String tail=html.substring(end+preformatTail.length());
			if(end>=0){
				return head;
			}else{
				result=getNextPreformatted(tail);
				if(result>=0){
					return end+preformatTail.length()+result;
				}	
			}
		}
		return result;
	}
	protected static String preformatContentHead="&lt;font color=\"#";
	protected static String preformatContentTail="&lt;/font>";
	protected int getNextPreformattedContent(String html){
		int result=-1;
		int head=html.indexOf(preformatContentHead);
		if(head>=0){
			int end=html.indexOf(preformatContentTail, head);
			if(end>=0){
				String anchor=html.substring(head,end+preformatContentTail.length());
				String tail=html.substring(end+preformatContentTail.length());
				if(anchor.matches("&lt;font color=\"#[^\"]*\">[ ]*&lt;/font>")	){
					return head;
				}else{
					result=getNextPreformattedContent(tail);
					if(result>=0){
						return end+preformatContentTail.length()+result;
					}	
				}
			}
		}
		return result;
	}
	static protected String nextPreformattedText="</text:p><text:p text:style-name=\"Preformatted_20_Text\">";
	protected String convertPreformattedContent(String html){
		// find <font color="#0000ff">  </font> pattern and wrap embedded parts with odt 
		
		String result=html;
		int head=getNextPreformattedContent(result);
		if(head>=0){
			String prefix=result.substring(0,head);
			String bodyCheck=result.substring(head+preformatContentHead.length());
			int bodyStart=bodyCheck.indexOf(">");
			String body=bodyCheck.substring(bodyStart+1);
			int bodyEnd=body.indexOf(preformatContentTail);
			//String bodyFragment=body.substring(0,bodyEnd);
			String tail=body.substring(bodyEnd+preformatContentTail.length());
			int column=bodyEnd;
			result=prefix
				+nextPreformattedText+"<text:span text:style-name=\"T8\"><text:s text:c=\""+column+"\"/></text:span>"
				+convertPreformattedContent(tail);
		}
		return result;
	}
	protected int leadingSpaces(String html){
		int i=0;
		for(;i<html.length();i++){
			if(html.charAt(i)!=' ')break;
		}
		return i;
		
	}
	protected String convertPreformatted(String html){
		// find <pre>...</pre> and wrap embedded parts with odt 
		String result=html;
		int head=getNextPreformatted(result);
		if(head>=0){
			String prefix=result.substring(0,head);
			String body=result.substring(head+preformatHead.length());
			int bodyEnd=body.indexOf(preformatTail);
			String bodyFragment=body.substring(0,bodyEnd);
			String preformattedBody=convertPreformattedContent(bodyFragment);
			// blank line
			preformattedBody=Pattern.compile("^ *$",Pattern.MULTILINE).matcher(preformattedBody).replaceAll(nextPreformattedText);
			// leading blanks
			preformattedBody=Pattern.compile("^",Pattern.MULTILINE).matcher(preformattedBody).replaceAll("<>");
			String[] splits=preformattedBody.split("<>");
			preformattedBody="";
			for(String split:splits){
				// if starts with spaces then add
				int leadingSpaces=leadingSpaces(split);
				if(leadingSpaces>0){
					preformattedBody+=nextPreformattedText+"<text:span text:style-name=\"T8\"><text:s text:c=\""+leadingSpaces+"\"/></text:span>";
				}
				if(leadingSpaces<split.length())preformattedBody+="\n"+split.substring(leadingSpaces);
				
			}
			String tail=body.substring(bodyEnd+preformatTail.length());
			result=prefix+""+preformattedBody+""+"</text:p><text:p text:style-name=\"PT10TIMES\">"+convertPreformatted(tail);
		}
		return result;
	}
	protected String refName(String name){
		return refName(name,"a");
	}
	protected String refName(String name,String prefix){
		return prefix+name.replaceAll("\\.","").replaceAll(" ","").replaceAll("_","").replaceAll("-","");
	}
	protected String convertAllAnchors(String html,EObject context){
		String result=html;
		int head=getNextAnchor(result);
		if(head>=0){
			String prefix=result.substring(0,head);
			String href=result.substring(head+anchorHeadBase.length());
			int hrefEnd=href.indexOf(hrefTail);
			String hrefFragment=href.substring(0,hrefEnd).replace("mdel://","#");
			String rest=href.substring(hrefEnd+hrefTail.length());
			int anchorEndx=rest.indexOf(anchorEnd);
			if(anchorEndx<0){
				log("ERROR:failed to find anchor end for "+rest);
				return result;
			}
			String tail=rest.substring(anchorEndx+anchorEnd.length());
			String name="?";
			if(hrefFragment.startsWith("#")){
				String refFragment=hrefFragment.replace("#","");
//				Element element=E2Helper.getElementByID(context,refFragment);
				Element element=(Element)getElementByID(refFragment,context);
				if(NamedElement.class.isInstance(element))name=((NamedElement)element).getName();
				String refFragmentSave=refFragment;
				refFragment=refName(refFragment);
				hrefFragment="#"+refFragment;
					if(OpaqueBehavior.class.isInstance(element)){
					// add additional reference information
					name+=" (clause <text:bookmark-ref text:reference-format=\"chapter\" text:ref-name=\""
					+refFragment+"\"></text:bookmark-ref>, page <text:bookmark-ref text:reference-format=\"page\" text:ref-name=\""
						+refFragment+"\"></text:bookmark-ref>) ";
				}	
				else if(NamedElement.class.isInstance(element)){
				}
			}else{
				name=rest.substring(0,anchorEndx);
			}
			result=prefix+"<text:a xlink:type=\"simple\" xlink:href=\""+hrefFragment+"\">"+name+"</text:a>"+convertAnchorsInternal(tail,context);
		}
		return result;
	}
	protected void copyFile( File f1 , File f2 ) throws IOException{
		  InputStream in = new FileInputStream(f1);
		  //For Overwrite the file.
		  f2.createNewFile();
		  OutputStream out = new FileOutputStream(f2);

		  byte[] buf = new byte[1024];
		  int len;
		  while ((len = in.read(buf)) > 0){
		  out.write(buf, 0, len);
		  }
		  in.close();
		  out.close();
		  }	
	public String createRfpDiagramImage(String diagramName,Element element){
		return doCreateDiagramImage(diagramName,getProjectName(element));
	}
	protected String doCreateDiagramImage(String diagramName,String folderName){
		long start=System.currentTimeMillis();
		String relativeLocation="Pictures~/"+diagramName+".png";
		
		// copy file from model diagram folder to odt area
		//  getDiagramNames
		File provisionFolder=CommonGenerator.getLastTargetDirectory();
		File sourcefile=new File(provisionFolder.getAbsolutePath()+"/"+relativeLocation);
		//../temp~/master-document/
		File tempFolder=new File(provisionFolder.getParentFile(),"temp~");
		// TODO:  this is not master-document for rfp
		File masterFolder=new File(tempFolder,folderName);
		File pictureFolder=new File(masterFolder,"Pictures");
		File targetfile=new File(masterFolder.getAbsolutePath()+"/"+relativeLocation.replace("~/", "/"));
		
		pictureFolder.mkdirs();
				// create and save image
				try {
					copyFile(sourcefile,targetfile);
					// determine size
					String result= getDrawFrameFragment(targetfile,diagramName,diagramName);
					System.out.println("UC2Helper.createDiagramImage complete "+(System.currentTimeMillis()-start));
					return result;
				} catch (IOException e) {
					log("ERROR: fail to save diagram "+diagramName+" to "+targetfile+" : "+e);
				}
		return "";
	}
	/*
	protected boolean isMasterDocumentDiagramProvisioned(Project project){
		boolean result=true;
			return result;
	}
*/
	/* TODO for papyrus
	public String createDiagramImage(Diagram diagram){
		long start=System.currentTimeMillis();
		Project project=getProject();
		if(!isMasterDocumentDiagramProvisioned(project)){
			log("UC2Helper.createDiagramImage "+diagram.getName()+" suppressed for this project");
			return "";
		}
		String relativeLocation="Pictures/"+diagram.getName()+".png";
		File file=new File(Rfp2DocAction.getCurrentAction().getMasterDocumentBuildDirectory()+"/"+relativeLocation);
		file.getParentFile().mkdirs();
		for(DiagramPresentationElement diagramTest:project.getDiagrams()){
			if(diagram.equals(diagramTest.getDiagram())){
				int size=diagramTest.getUsedModelElements(false).size();
								
				log("UC2Helper.createDiagramImage target "+file+", element count="+size);
				System.out.println("UC2Helper.createDiagramImage target "+file);
				if(size>2000){
					log("UC2Helper.createDiagramImage suppress image due to excessive complexity/detail for type of target document");
					return "";
				}
				// create and save image
				try {
					ImageExporter.export(diagramTest, ImageExporter.PNG, file);
					// determine size
					String result= getDrawFrameFragment(file,diagram.getName(),getID(diagram));
					log("UC2Helper.createDiagramImage complete "+(System.currentTimeMillis()-start));
					System.out.println("UC2Helper.createDiagramImage complete "+(System.currentTimeMillis()-start));
					return result;
				} catch (IOException e) {
					log("ERROR: fail to save diagram "+diagram.getName()+" to "+file+" : "+e);
					return "";
				}
			}
		}
		return "";
	}
	*/
	protected float scale=(float) 0.5;
	protected String getDrawFrameFragment(File file,String diagramName,String eobjectURI){
		int height=0;
		int width=0;
		String relativeLocation=file.getParentFile().getName()+"/"+file.getName();
		// determine size
		ImageIcon image=new ImageIcon(file.getAbsolutePath()) ;
		  height=image.getIconHeight();
		  width=image.getIconWidth();
		  Image awtImage=image.getImage();
		  if(awtImage!=null)awtImage.flush();
		  // scale result
		  height=(int) (height*scale);
		  width=(int) (width*scale);
		if(height<0)height=0;
		if(width<0)width=0;
		
		if((height==0)||(width==0)){
			log("ERROR: failed to determine size of diagram at "+file+", height "+height+", width "+width);
		}
		
		String drawFrame="";
		if(isWord){
		 drawFrame=
			""
			+"</text:p>"
			+"<text:p text:style-name=\"Caption\">"
			+"<text:span>"
			+"<draw:frame draw:style-name=\"fr7\" draw:name=\""+refName(diagramName)+"7\" "
			+"text:anchor-type=\"paragraph\" "
			+"svg:x=\"0.0016in\" svg:y=\"0.0008in\" svg:width=\""+width+"pt\" style:rel-width=\"100%\" "
			+"svg:height=\""+height+"pt\" "
			+"style:rel-height=\"100%\" draw:z-index=\"140\">"
			+"<draw:image xlink:href=\""+relativeLocation+"\" "
			+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
			+"</draw:frame>"
			+"</text:span>"
			+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>"
			+"Figure"
			+" "
			+diagramName
			+"<text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
			;
		}else{
			drawFrame=
				""
	+			"<draw:frame draw:style-name=\"fr2x\" draw:name=\""+diagramName+"\" "
							+"text:anchor-type=\"paragraph\" svg:width=\""+width+"pt\"   "
							+"svg:x=\"0.0016in\" "
							+"  draw:z-index=\"139\">"
							+"<draw:text-box fo:min-height=\""+height+"pt\">"
								+"<text:p text:style-name=\"Figure\">"
									+"<draw:frame draw:style-name=\"fr4x\" draw:name=\""+refName(diagramName)+"7\" "
										+"text:anchor-type=\"paragraph\" "
										+"svg:x=\"0.0016in\" svg:y=\"0.0008in\" svg:width=\""+width+"pt\" style:rel-width=\"100%\" "
										+"svg:height=\""+height+"pt\" "
										+"style:rel-height=\"scale\" "
										+"draw:z-index=\"140\">"
										+"<draw:image xlink:href=\""+relativeLocation+"\" "
											+"xlink:type=\"simple\" xlink:show=\"embed\" xlink:actuate=\"onLoad\" />"
									+"</draw:frame>"
									
									+"Figure <text:sequence text:ref-name=\""+refName(eobjectURI,"_Ref")+"\" text:name=\"Figure\" text:formula=\"ooow:Figure+1\" style:num-format=\"1\">1</text:sequence> - "
									+diagramName
									+"<text:bookmark-start text:name=\""+refName(eobjectURI)+"\"/>  <text:bookmark-end text:name=\""+refName(eobjectURI)+"\"/>"
								+"</text:p>"
								
							+"</draw:text-box>"
				+"</draw:frame>"
				;
			
		}
		return drawFrame;//relativeLocation;
	}
	public String date(){
		return new Date().toString();
	}
	public String month(){
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG);
		StringBuffer toAppendTo=new StringBuffer();
		FieldPosition fieldPosition=new FieldPosition(DateFormat.MONTH_FIELD);
		dateFormat.format(new Date(), toAppendTo, fieldPosition);
		return toAppendTo.toString().substring(fieldPosition.getBeginIndex(), fieldPosition.getEndIndex());
	}
	public String year(){
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG);
		StringBuffer toAppendTo=new StringBuffer();
		FieldPosition fieldPosition=new FieldPosition(DateFormat.YEAR_FIELD);
		dateFormat.format(new Date(), toAppendTo, fieldPosition);
		return toAppendTo.toString().substring(fieldPosition.getBeginIndex(), fieldPosition.getEndIndex());
	}
	public String getUriFragment(EObject eObject){
		try{
		if((eObject==null)||(eObject.eResource()==null))return "";
		String result= eObject.eResource().getURIFragment(eObject);
		if(result==null)result="";
		return result;
		}catch(Throwable t){
			t.printStackTrace();
			return "";
		}
	}
	/////////////////////////////////////////
	public String getNodeName(Object any){
		String result="";
		if(org.w3c.dom.Node.class.isInstance(any)){
			result=((org.w3c.dom.Node)any).getNodeName();
		}
		return result;
	}
	public String getNodeValue(Object any){
		String result="";
		if(org.w3c.dom.Node.class.isInstance(any)){
			result=((org.w3c.dom.Node)any).getNodeValue();
		}
		return result;
	}
	public String getTextContent(Object any){
		String result="";
		if(org.w3c.dom.Element.class.isInstance(any)){
			result=((org.w3c.dom.Element)any).getTextContent();
		}
		return result;
	}
	//////////////////////////////////////
//	public InstanceSpecification getApplication(Element element){
	public EList<EObject> getApplication(Element element){
//		return element.getAppliedStereotypeInstance();
		return element.getStereotypeApplications();
		}
	public Boolean hasAppliedStereotype(Element element,String stereotypeName){
		return getStereotype(element,stereotypeName)!=null;
		}
	public Stereotype getStereotype(Element element,String stereotypeName){
		if((element==null)||(stereotypeName==null))return null;
		Stereotype result=null;
		for(Stereotype stereotype:element.getAppliedStereotypes()){
			if(isStereotypeMatch(stereotype,stereotypeName)){
				result=stereotype;
				break;
			}
		}
		return result;
	}
	protected boolean isStereotypeMatch(Stereotype stereotype,String stereotypeName){
		if(isStereotypeNameMatch(stereotype,stereotypeName)){
			return true;
		}else{
			for(Classifier classifier:allParents(stereotype)){
				if(isStereotypeNameMatch(classifier,stereotypeName)){
					return true;
				}
			}
		}
		return false;
	}
	protected Set<Classifier> allParents(Classifier classifier){
		Set<Classifier> result=new HashSet<Classifier>();
		for(Classifier parent:classifier.getGenerals()) allParents(parent,result);
		return result;
	}
	protected void allParents(Classifier classifier,Set<Classifier> didThat){
		if(didThat.contains(classifier)) return;
		didThat.add(classifier);
		for(Classifier parent:classifier.getGenerals()) allParents(parent,didThat);
	}
	protected boolean isStereotypeNameMatch(Classifier stereotype,String stereotypeName){
		if(stereotypeName.equals(stereotype.getName())
				||stereotypeName.equals(stereotype.getQualifiedName())
				||stereotypeName.replace("::","_").equals(stereotype.getName())
				){
			return true;
		}
		return false;
	}
	public List<Object> getValues(Element element,String tagName){
		List<Object> result=new Vector<Object>();
		for(Stereotype stereotype:element.getAppliedStereotypes()){
			Object test=element.getValue(stereotype, tagName);
			if(test!=null){
				if(result instanceof Collection){
					result.addAll((Collection)test);
				}else{
					result.add(test);
				}
			}
		}
		return result;
	}
	public Boolean IsStereotypeApplied(Element element,Stereotype stereotype){
		return element.isStereotypeApplied(stereotype);
	}
	public List<Object> getManyValues(Element element,Stereotype stereotype,String tagName){
		List<Object> result=new Vector<Object>();
		result.addAll((Collection)element.getValue(stereotype, tagName));
		return result;
	}
	public List<String> getValidationResults(){
		List<String> results=new Vector<String>();
		return results;
	}
	public String getValidationElement(String annotation){
		String result= annotation.split(";")[0];
		return result;
	}
	public String getValidationSeverity(String annotation){
		return annotation.split(";")[1];
	}
	public String getValidationAbbreviation(String annotation){
		return annotation.split(";")[2];
	}
	public String getValidationMessage(String annotation){
		return annotation.split(";",4)[3];
	}

	///////////////////
	public static class NamespaceMapEntry{
		protected String key=null;
		protected String value=null;
		public NamespaceMapEntry(String k,String v){
			key=k;
			value=v;
		}
		public String getPrefix(){return key;}
		public String getSchemaLocation(){return value;}
		public void setSchemaLocation(String schemaLocation){value=schemaLocation;}
	}
	public static class QNamePrefixToNamespaceMap{
		protected int nextID=0;
		protected Map<String,NamespaceMapEntry> entries=null;
		public QNamePrefixToNamespaceMap(Map<String,NamespaceMapEntry> entriesIn){
			entries=entriesIn;
		}
		public Map<String,NamespaceMapEntry> getEntries(){return entries;}
		public int nextID(){return nextID++;}
	}
	///////////////////
	protected String appendXmlSuffix(String filepath){
		if(filepath.endsWith(".xml"))return filepath;
		return filepath+".xml";
	}
	protected String appendXsdSuffix(String filepath){
		if(filepath.endsWith(".xsd"))return filepath;
		return filepath+".xsd";
	}
}
