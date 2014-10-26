/**
 *
 */
package org.ijis.gra.uml.ui;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.zip.ZipOutputStream;

import javax.script.Bindings;
import javax.script.CompiledScript;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2e.core.project.ProjectImportConfiguration;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.internal.impl.ElementImpl;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.wst.wsdl.internal.util.WSDLResourceFactoryImpl;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.ijis.gra.uml.util.GraUtility;
import org.ijis.gra.uml.util.ZipUtility;





/**
 * @author Tom
 *
 */
abstract public class GraCommonAction implements IObjectActionDelegate,IRunnableWithProgress
{
    private static final Logger LOG = LoggerFactory.getLogger(GraCommonAction.class);
    protected static String   DEFAULT_GROUP_ID="org.ijis.gra";

  protected Shell shell;
    protected List<IWorkingSet> workingSets = new ArrayList<IWorkingSet>();
    protected ProjectImportConfiguration importConfiguration = new ProjectImportConfiguration();
	
	static protected XSDResourceFactoryImpl xsdResourceFactory=new XSDResourceFactoryImpl();
	static protected EcoreResourceFactoryImpl ecoreResourceFactory=new EcoreResourceFactoryImpl();
	static protected WSDLResourceFactoryImpl wsdlResourceFactory=new WSDLResourceFactoryImpl();

	//static protected org.eclipse.emf.ecore.resource.Resource.Factory qvtoResourceFactory=new ExeXMIResource.Factory();;
	public GraCommonAction(String id, String name)
	{
		//super(id, name, null, null);
		//this.setSmallIcon(getNiemIcon());
		//setEnabled(false);
	}
	  /**
	   * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	   */
	  public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	    shell = targetPart.getSite().getShell();
	  }
	  protected boolean isActionEnabled(ISelection selection){
	    if((selection==null)||selection.isEmpty()){
	      return false;
	    }
	    if(!(selection instanceof IStructuredSelection)){
	      return false;
	    }
	    IStructuredSelection sselection=(IStructuredSelection)selection;
	    if(sselection.size()!=1){
	      return false;
	    }
	    Object select=sselection.getFirstElement();
	    if(!(select instanceof IFile)){
	      return false;
	    }
	    IFile selectedFile=(IFile)select;
	    if(!getSourceFileExtension().equals(selectedFile.getFileExtension())){
	      return false;
	    }
	    return true;
	  }
	  protected String getSourceFileExtension(){return "ecore";}
	
	static protected Icon niemIcon=null;
	/*
	static public Icon getNiemIcon(){
		if(niemIcon==null){
		File file=new File(getPropertiesDir()+"mds.small.gif");
		niemIcon=new ImageIcon(file.getAbsolutePath()) ;
		}
		return niemIcon;
	}
	*/
	//static protected boolean isLoggingDisabled=false;
	//static public boolean isLoggingDisabled(){return isLoggingDisabled;}
	static public void log(String text){
		//if(isLoggingDisabled()){
			System.out.println(text);
		//}else{
		//Application.getInstance().getGUILog().log(text);
		//}
	}
	/*
	protected void disableEventFiring(Project project){
		project.getRepository().getEventSupport().setEnableEventFiring(false);
	}
	protected void initTrees(){
		Browser browser=Application.getInstance().getMainFrame().getBrowser();
		browser.getContainmentTree().initTree();
		List<BrowserTabTree> trees=browser.getTrees();
		for(BrowserTabTree tree:trees){
			if(NiemInstanceBrowserTabTree.class.isInstance(tree)){
				tree.initTree();
				break;
			}
		}
	}
	*/
	/*
	protected void enableEventFiring(Project project){
		try{
		project.getRepository().getEventSupport().setEnableEventFiring(true);
		if(SwingUtilities.isEventDispatchThread()){
			initTrees();
		}else{
            SwingUtilities.invokeLater(new Runnable(){
				@Override
				public void run() {
					initTrees();
				}
            	
            });
		}  
		}catch(Throwable t){
			log("ERROR: during enableEventFiring "+t);
		}
	}
	*/
/*
	protected File getMpdWorkingDirectory(Project project,String requestFrom){
		File result=null;
		com.nomagic.magicdraw.properties.Property property =
			project.getOptions().getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
					MPD_WORKING_DIRECTORY_OPTION);
			if (FileProperty.class.isInstance(property))
			{
				try {
					result = ((FileProperty)property).getFile(requestFrom);
				} catch (RecursivePathVariableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return result;
	}
	*/
/*
	public File getTargetDirectory(){
		Application application=Application.getInstance();
		Project project=application.getProject();
		File parentRootFile=new File(project.getFileName()).getParentFile();
		String requestFrom=parentRootFile.getAbsolutePath();
		File rootParentFile=getMpdWorkingDirectory(project,requestFrom);
		File rootFile=new File(rootParentFile, getMpdName());
	    if(!rootFile.exists())rootFile.mkdirs();
	    return rootFile;
	}
	*/
	/*
	  protected String getMpdFileName(){
		  String mpdName="UNDEFINED";
		  String mpdVersionID="1.0";
		  String mpdClass="iepd";
			Component mpdComponent=getMpdComponent();
			if(mpdComponent!=null){
				String mpdNameTest=mpdComponent.getName();
				if((mpdNameTest!=null)&&(mpdNameTest.length()>0))mpdName=mpdNameTest;
				String mpdVersionIDTest=NIEMHelper.getMpdVersionID(mpdComponent);
				if((mpdVersionIDTest!=null)&&(mpdVersionIDTest.length()>0))mpdVersionID=mpdVersionIDTest;
				EnumerationLiteral mpdClassEnum=NIEMHelper.getMpdClassCode(mpdComponent);
				if(mpdClassEnum!=null)mpdClass=mpdClassEnum.getName();
				if("core_update".equals(mpdClass))mpdClass="cu";
				else if("domain_update".equals(mpdClass))mpdClass="du";
				else if("release".equals(mpdClass))mpdClass="rel";
			}
				  
			String result= mpdName.replace(":","_").replace("/","_").replace(" ","_")+"-"+mpdVersionID+"."+mpdClass;
			return result;
		}
	  protected String getMpdName(){
		 return getMpdFileName();
	}
	*/
	static protected List<ValueSpecification> getValueSpecification(InstanceSpecification instance,String tagName){
		for(Slot slot:instance.getSlots()){
			if(slot.getDefiningFeature().getName().equals(tagName))return slot.getValues();
		}
		return new Vector<ValueSpecification>();
	}
	static protected String getStringValue(ValueSpecification valueSpec){
		if(LiteralString.class.isInstance(valueSpec)){
			return ((LiteralString)valueSpec).getValue();
		}
		return "";
			}
	static protected String getStringValue(InstanceSpecification instance,String tagName){
		for(ValueSpecification valueSpec:getValueSpecification(instance,tagName)){
			return getStringValue(valueSpec);
		}
		return "";
			}
	static public Set<Component> getContainedComponents(Package p){
		Set<Component> result=new HashSet<Component>();
		for(PackageableElement pe:p.getPackagedElements()){
			if(Component.class.isInstance(pe)){
				result.add((Component)pe);
			}else if(Package.class.isInstance(pe)){
				result.addAll(getContainedComponents((Package)pe));
			}
		}
		return result;
	}
	protected Set<Package> getContainedPackages(Package p){
		Set<Package> result=new HashSet<Package>();
		for(PackageableElement pe:p.getPackagedElements()){
			if(Package.class.isInstance(pe)){
				result.add((Package)pe);
			}
			if(Package.class.isInstance(pe)){
				result.addAll(getContainedPackages((Package)pe));
			}
		}
		return result;
	}
	/*
	static public Component getMpdComponent(){
	    Model root = getCurrentModelRoot();//project.getModel();
	    Component fallbackComponent=null;
	    if(root!=null){
	    	for(Component component:getContainedComponents(root)){
	    		if(!NIEMHelper.isModelPackageDescription(component))continue;
	    		if(isInPSM(component.getOwningPackage()))continue;
				// defer NIEM Reference Model
				if(component.getName().matches(".*NIEM Reference Model.*")){
					fallbackComponent=component;
					continue;
				}
				return component;
	    	}
	    }
	    return fallbackComponent;
	}
	protected Model getRfpModel(){
	    Model root = getCurrentModelRoot();//project.getModel();
	    if((root!=null)&& (root.getName().contains("RFP")||root.getName().contains("RFC"))){
	    	return root;
	    }
	    return null;
	}
	protected Model getPSMModel(){
	    Model root = getCurrentModelRoot();
	    if(root!=null){
	    	for(Package psm:getContainedPackages(root)){
	    		if(Model.class.isInstance(psm)&&"PSM".equals(psm.getName())){
	    			return (Model)psm;
	    		}
	    	}
	    }
	    return null;
	}
	static public boolean isInPSM(Package p){return NIEMHelper.isInPSM(p);}
	*/
    protected ScriptEngineManager manager = new ScriptEngineManager(null);
    /* TODO replace
	protected ScriptEngine getQvtEngine(){
	    ScriptEngine qvtEngine = manager.getEngineByName("QVTO");
	    if(qvtEngine==null){
	    	log("getQvtEngine registering engine factory");
	    	manager.registerEngineName("QVTO", new QVTScriptEngineFactory(){
	    		@Override
	    		public ScriptEngine getScriptEngine() {
	    			return new NiemQVTScriptingEngine(this);
	    			}
	    				
	    	});
	    	qvtEngine = manager.getEngineByName("QVTO");
	    	//QVTPlugin x;

	    }
	    if(qvtEngine==null){
	    	//com.nomagic.magicdraw.qvt.jsr223.QVTScriptEngineFactory x;
	    	/ *
	    	for(ScriptEngineFactory factory:manager.getEngineFactories()){
	        	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Engine Factory "+factory.getEngineName());

	    	}
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "ERROR: QVT Engine not found "+manager.getEngineByName("QVT Operational")+", "+manager.getEngineByName("QVTOperational"));
	    	* /
	    }
		//log("QVT ScriptEngine "+qvtEngine+", "+qvtEngine.getClass().getName());
	    return qvtEngine;
	}
	*/
//	public void actionPerformed(ActionEvent actionEvent)
	public void run(IAction actionEvent)
	{
		try{
        IRunnableWithProgress op = this;
        new ProgressMonitorDialog(shell).run(true, false, op);
	       } catch (InvocationTargetException e) {
	           // handle exception
	          LOG.error("Failed to complete action", e);
	        } catch (InterruptedException e) {
	           // handle cancelation
	          LOG.error("Cancelation not supported", e);
	        }
/*		
	    // create runnable
	    RunnableWithProgress runnable = new RunnableWithProgress()
		    {
		            public void run(ProgressStatus progressStatus)
		            {
		            	this.
		                    int max = Integer.MAX_VALUE;
		                    progressStatus.init("Start...", 0, max);
		                    try {
								performTransform(progressStatus);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}catch(CancelError e){
								
							}
		            }
		    };
	    // run with progress
	    ProgressStatusRunner.runWithProgressStatus(runnable,getName()+ " progress", true, 0);
	    */
	}
	  @Override
	  public void run(IProgressMonitor monitor) throws InvocationTargetException,
	      InterruptedException {
	    try{
	         long startTime=System.currentTimeMillis();
	         int totalWork=100;
	         monitor.beginTask("gra action", totalWork);
	       IStructuredSelection sselection=(IStructuredSelection)lastSelection;
	       Object select=sselection.getFirstElement();
	       IFile selectedFile=(IFile)select;
			LOG.info("perform transform on "+selectedFile);
			performTransform(monitor, startTime, selectedFile);
	    	
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
	    	monitor.done();
	    }
	  }
	  protected ISelection lastSelection;
	  /**
	   * @see IActionDelegate#selectionChanged(IAction, ISelection)
	   */
	  public void selectionChanged(IAction action, ISelection selection) {
	    lastSelection=selection;
	    // can not change enabled state?
	    //boolean enabled=isActionEnabled(selection);
	    //action.setEnabled(enabled);
	    
	  }
	  
	/*
	static public Project getProject(){
	    Application application=Application.getInstance();
	    return application.getProject();
	}
	*/
		static public Model getCurrentModelRoot(IFile modelFile){
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
	/**
	* Entered when button pushed.
	 * @throws IOException
	*/
	abstract public void performTransform(IProgressMonitor progressStatus,long startTime, IFile selectedFile) throws IOException;
	static public String getInstallRootDirectory(){
		return System.getProperty("install.root", ".");
	}
/*
	static public String getPluginDirectory(){
		return getInstallRootDirectory()+"plugins/"+NIEMQVTPlugin.getPluginID()+"/";
	}
	*/
	static public void registerFactories(/*MDLog log*/){
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xsd", xsdResourceFactory);
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", ecoreResourceFactory);
//    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sch", schematronResourceFactory);
	}
	/*
	protected void registerPackages(/ *MDLog log,* /ScriptEngine qvtEngine){
	    EPackage.Registry ePackageRegistry=EPackage.Registry.INSTANCE;

	    // xsd
	    EPackage xsdEPackage=XSDPackage.eINSTANCE;
		//log.log("register xsd "+xsdEPackage);
	    String xsdnsURI=xsdEPackage.getNsURI();
	    //log.log("register xsd namespace "+xsdnsURI);
	    ePackageRegistry.put(xsdnsURI, xsdEPackage);


	    // schematron
	    / *
	    EPackage schematronEPackage=SchematronPackage.eINSTANCE;
	    String schematronURI=schematronEPackage.getNsURI();
	    //log.log("register schematron namespace "+schematronURI);
	    ePackageRegistry.put(schematronURI, schematronEPackage);
	    * /
	    EPackage expressionsEPackage=org.eclipse.ocl.expressions.ExpressionsPackage.eINSTANCE;
	    String expressionsURI=expressionsEPackage.getNsURI();
	    //log.log("register expressions namespace "+expressionsURI);
	    ePackageRegistry.put(expressionsURI, expressionsEPackage);
	    
	    qvtEngine.put(QVTEngineConstants.QVTO_E_PACKAGE_REGISTRY, ePackageRegistry);
	    // wsdl
	    EPackage wsdlEPackage=WSDLPackage.eINSTANCE;
	    String wsdlnsURI=wsdlEPackage.getNsURI();
	    //log.log("register wsdl namespace "+wsdlnsURI);
	    ePackageRegistry.put(wsdlnsURI, wsdlEPackage);
	    // and the factory
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("wsdl", wsdlResourceFactory);

	    // soap
	    EPackage soapEPackage=SOAPPackage.eINSTANCE;
	    String soapnsURI=soapEPackage.getNsURI();
	    //log.log("register soap namespace "+soapnsURI);
	    ePackageRegistry.put(soapnsURI, soapEPackage);
    	
	    // blackbox
	    addBlackbox(log,qvtEngine);
	    registerFactories(log);
	}
	*/
	/*
	protected void addBlackbox(MDLog log,ScriptEngine qvtEngine){
	    Set blackboxModelList = new HashSet();
	    EPackage blackboxPackage=EcorePackage.eINSTANCE.getEcoreFactory().createEPackage();
	    blackboxModelList.add(blackboxPackage);
	    Adapter blackboxAdapter=new BlackboxAdapter(log);
	    blackboxPackage.eAdapters().add(blackboxAdapter);
	    qvtEngine.put("blackboxAdapter", blackboxModelList);

	}
	protected File getTransformFile(String transform){
	    String dir = getTransformDir();
        File file = new File(dir + transform);
        return file;

	}
	protected void setTransform(String transform,ScriptEngine qvtEngine){
        File file = getTransformFile(transform);
        qvtEngine.put(ScriptEngine.FILENAME, file.getAbsolutePath());

	}
	*/
	/*
	protected ProjectsManager getProjectsManager(){
	    Application application=Application.getInstance();
		return application.getProjectsManager();
	}
	static public String getTransformDir(){
		return getPluginDirectory()+"transform/";
	}
	static public String getMetamodelDir(){
		return getPluginDirectory()+"metamodel/";
	}
	*/
	/*
	static protected String getAbsoluteSystemPrefix(){
		return "c:/";
	}
	static protected String getPredefinedInstallRoot(){
		//return getInstallRootDirectory();
		return getAbsoluteSystemPrefix()+"<install.root>/";
	}
	public static String getProfilesDir(){
		return getPredefinedInstallRoot()+ "profiles/";
	}
	protected String getLibraryDir(){
		return getPredefinedInstallRoot()+ "modelLibraries/";
	}
	protected String getAbsoluteLibraryDir(){
		return getInstallRootDirectory()+ "modelLibraries/";
	}
	*/
/*
	protected void useXmlLibrary(MDLog log,Project psmProject){
        String profilesdir = getLibraryDir();
      String psmmoduleFilePath = profilesdir+ "XmlPrimitiveTypes.mdzip";
      useModule(psmmoduleFilePath,log,psmProject);
	}
	protected void useBasePSM(MDLog log,Project psmProject){
        String profilesdir = getLibraryDir();
      String psmmoduleFilePath = profilesdir+ "niem.base.psm.mdzip";
      useModule(psmmoduleFilePath,log,psmProject);
	}
	protected Frame getFrame(){
    	Frame frame= Application.getInstance().getMainFrame();
    	//log("Frame "+frame);
    	return frame;
	}
	protected Project createBasePSM(MDLog log,ScriptEngine qvtEngine){
	    ProjectsManager projectsManager=getProjectsManager();

	    //
        // create a new project and add objects to it
	    log.log("creating target PSM project");
        Project psmProject=projectsManager.createProject();

        Model psmModel=psmProject.getModel();
	    Set psmUmlModelList = new HashSet();
	    psmUmlModelList.add(psmModel);
	    qvtEngine.put("psmUml", psmUmlModelList);
        String profilesdir = getProfilesDir();
        String psmmoduleFilePath = profilesdir+ "niem.psm.profile.mdzip";
        useModule(psmmoduleFilePath,log,psmProject);
        return psmProject;
	}
	protected Project createPSM(MDLog log,ScriptEngine qvtEngine){
		Project psmProject=createBasePSM(log,qvtEngine);
        useXmlLibrary(log,psmProject);
        return psmProject;
	}
	protected void indexModules(Project psmProject,Log log) throws PersistenceException{
	    IPrimaryProject primaryProject=psmProject.getPrimaryProject();
	    for(IAttachedProject attachedProject:primaryProject.getProjects()){
	    	String name=attachedProject.getName();
	    	if(!name.startsWith("NIEM-Reference-"))continue;
	    	log.log("indexModules "+name);
	    	try{
	    	ModulesService.setAutoLoadKindOnTask(primaryProject,attachedProject, AutoLoadKind.MANUAL_LOAD) ;
	    	
	    	log.log("indexModules update "+attachedProject.getName());
	    	attachedProject.update(null);
	    	}catch(Throwable t){
	    		log.log("ERROR: while adjusting module index for "+attachedProject+" : "+t);
	    	}
	    }
		//ModulesService.
	}
	static public void useModule(String psmmoduleFilePath,Log log,Project psmProject){
		if(log!=null){
	    log.log("new project loading Module "+psmmoduleFilePath+", "+SessionManager.getInstance().isSessionCreated());
		}
	    ModulesService.findOrLoadLocalModule(psmProject, psmmoduleFilePath,false) ;
	}
	static public String getPropertiesDir(){
		return getPluginDirectory()+"properties/";
	}
	protected void useCommonIndexing(Project psmProject){
		ProjectOptions projectOptions=psmProject.getOptions();
		projectOptions.setIndexMode(ProjectOptions.INDEX_COMMON);
	}
	// add option to specify the package to be shared
	protected void shareModule(String description,Log log,Project psmProject,String sharedPackageParent) throws InvalidProjectObjectException{
	    ProjectsManager projectsManager=getProjectsManager();
	    List<Package> packages=new Vector<Package>();
	    Package sharedParent=findPackageNamed(psmProject.getModel(),sharedPackageParent);
	    IPrimaryProject primaryProject=psmProject.getPrimaryProject();
	    if(sharedParent==null){
	    	log.log("ERROR: shareModule failed to locate common package "+sharedPackageParent);
	    	return;
	    }
	    for(Package p:sharedParent.getNestedPackage()){
	    	if(p.isEditable()){
	    		//packages.add(p);
	    	    log.log("shareModule package "+p.getQualifiedName());
	    	    ModulesService.share( primaryProject, p, sharedPackageParent, null);
	    	    
	    	}
	    }
	}
	*/
	protected Package findPackageNamed(Package parent,String qualifiedName){
		String[] parts=qualifiedName.split("::", 2);
		for (Package nested:parent.getNestedPackages()){
			if(parts[0].equals(nested.getName())){
				if(parts.length==1)return nested;
				return findPackageNamed(nested,parts[1]);
			}
		}
		return null;
	}
	/*
	protected void saveProject(Log log,Project psmProject,String psmmoduleFilePath) throws PersistenceException{
		
	    ProjectsManager projectsManager=getProjectsManager();
	    File psmmodulefile = new File(psmmoduleFilePath);
	    ProjectDescriptor psmprojectDescriptor =   ProjectDescriptorsFactory.createLocalProjectDescriptor(psmProject,psmmodulefile);
	    projectsManager.saveProject(psmprojectDescriptor, true);
	}
	*/
	/*
	protected void staticMpdCopy(/ *MDLog log,* /File mpdStaticDirectory,File mpdStagingDirectory) {
		//log.log("copy static mpd resources to mpd staging area");
		Utilities.copyDirectory(mpdStaticDirectory, mpdStagingDirectory);
	}
	*/

	protected void unzipDoc(InputStream inputStream,File extractTo) throws IOException {
		// create a temporary file, put stream in it, then do unzip 
		File extractToParent=extractTo.getParentFile();
//		File zip=new File(extractTo,"temp.zip");
		File zip=new File(extractToParent,"temp.zip");
        BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream(zip));

            byte[] buffer = new byte[8192];
            int read;

            while (-1 != (read = inputStream.read(buffer))) {
              out.write(buffer, 0, read);
            }

            inputStream.close();
            out.close();
		
		ZipUtility.unzip( zip,  extractTo);
	}
	protected void zipMasterDocumentOdt(File masterDocumentTempDirectory,File masterDocumentOdtFile) throws IOException {
		//log.log("copy static master-document resources to document build area, master document at "+masterDocumentOdtFile);
		//removeSvnDirectories(masterDocumentStaticDirectory);
		//Utilities.copyDirectory(masterDocumentStaticDirectory, masterDocumentTempDirectory);
		ZipUtility.zipDirectory(masterDocumentTempDirectory, masterDocumentOdtFile);
	}

	/*
	protected void removeSvnDirectories(File directory){
		if(directory.isDirectory()){
			if(directory.getName().equals(".svn")){
				Utilities.deleteTree(directory);
			}else{
				for(File file:directory.listFiles()) removeSvnDirectories(file);
			}
		}
	}
	*/
	//////////////////////////////////////////////////////////////////////
	  protected void toCanonicalIDs(Package namespace){
		  String id="_"+getXmlName(namespace.getName());
		// problem at top level?		  namespace.setID(id);
		  setMofID(namespace,id);
		  toCanonicalIDs(namespace,id+"-");
		  }
	protected void setMofID(Element element,String id){
		/*
		  ElementImpl e=(ElementImpl)element;
		  e.setMofID(id);
		  */
		if(element==null)return;
		if(id==null)return;
		Resource resource=element.eResource();
		if(resource==null)return;
		if(!(resource instanceof XMLResourceImpl))return;
		((XMLResourceImpl)resource).setID(element,id);
	}
  protected void toCanonicalIDs(Element namespace,String prefix){
	  try{
	    //if(!namespace.isEditable()) return;
	    if(!GraUtility.isEditable(namespace)) return;
	    //if(Diagram.class.isInstance(namespace))return;
	    EClass eClass=namespace.eClass();
    	if(eClass==null){
    		log("ERROR:toCanonicalIDs null eClass "+namespace);
    		return;
    	}
	    
	    for(EReference reference:eClass.getEAllContainments()){
	    	if(reference==null){
	    		log("ERROR:toCanonicalIDs null reference "+eClass.getName());
	    		continue;
	    	}
	      if(reference.isMany()){
	    	  List<EObject> eObjects=new Vector<EObject>((Collection<EObject>)namespace.eGet(reference));
	    	  if(eObjects==null){
		    		log("ERROR:toCanonicalIDs null eGet "+reference+", "+namespace);
		    		continue;
	    	  }
	    	  for(int i=0;i<eObjects.size();i++){
	    		  EObject containeeObject=eObjects.get(i);
		    	  if(!Element.class.isInstance(containeeObject))continue;
		    	  Element containee=(Element)containeeObject;
		    	  if(!GraUtility.isEditable(containee))continue;
	    		  String id=prefix;
		    	  if(isUniqueName(containee)){
		    		  id+=getXmlName(((NamedElement)containee).getName());
		    	  }else{
		    		  // is there a nameclash here?
		    		  id+=getXmlName(reference.getName());
		    		  if(eObjects.size()>1)id+="-"+(i+1);
		    	  }
				  setMofID(containee,id);
	    		  toCanonicalIDs(containee,id+"-");
	    		  
	    	  }
	      }else{
	    	  EObject containeeObject=(EObject)namespace.eGet(reference);
	    	  if(!Element.class.isInstance(containeeObject))continue;
	    	  Element containee=(Element)containeeObject;
	    	  if(!GraUtility.isEditable(containee))continue;
    		  String id=prefix;
	    	  if(isUniqueName(containee)){
	    		  id+=getXmlName(((NamedElement)containee).getName());
	    	  }else{
	    		  // is there a nameclash here?
	    		  id+=getXmlName(reference.getName());
	    		  
	    	  }
			  setMofID(containee,id);
    		  toCanonicalIDs(containee,id+"-");
	      }
	    }
  }catch(Throwable t){
	  log("ERROR: toCanonicalIDs "+namespace+", "+prefix+" : "+t);
  }
	  }
  protected boolean isUniqueName(Element element){
	  try{
	  if(!NamedElement.class.isInstance(element)) return false;
	  if(EnumerationLiteral.class.isInstance(element)) return true;// assume ok
	  String name=((NamedElement)element).getName();
	  if((name==null)||name.equals(""))return false;
	  Namespace namespace=((NamedElement)element).getNamespace();
	  if(namespace==null){
		  return false;
	  }
	  Collection<NamedElement> namedElements=namespace.getOwnedMembers();
	  if(namedElements==null){
		  log("ERROR:isUniqueName null namedElements "+element);
		  return false;
	  }
	  for(NamedElement sibling:namedElements){
		  if(sibling==null){
			  log("ERROR:isUniqueName null sibling "+element);
			  return false;
		  }
		  if(name.equals(sibling.getName()) && !(element.equals(sibling)))return false;
	  }
	  return true;
	  }catch(Throwable t){
		  log("ERROR: isUniqueName "+element+" : "+t);
		  return false;
	  }
}
  protected String getXmlName(String name){
	  try{
      return name.replaceAll(" ","_").replaceAll("/","_").replaceAll(":","_").replaceAll("\'","_");
	  }catch(Throwable t){
		  log("ERROR: getXmlName "+name+" : "+t);
		  return "";
	  }
  }
  /*
  protected void setMpdComponentStateEnabled(){
			// enabled if current project contains component stereotyped with mpd
			Boolean enabled=getMpdComponent()!=null;
			if(enabled){
				Application application=Application.getInstance();
				Project project=application.getProject();
				if(project==null){
					enabled=false;
				}else{
					if(project.getFileName()==null){
						enabled=false;
					}else{
						File parentRootFile=new File(project.getFileName()).getParentFile();
						if(parentRootFile==null){
							enabled=false;
						}
					}
				}
				
			}
		    setEnabled(enabled);
		}	  
	*/
}
