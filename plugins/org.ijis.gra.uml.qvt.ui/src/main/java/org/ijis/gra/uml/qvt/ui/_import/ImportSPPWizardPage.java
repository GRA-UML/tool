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
package org.ijis.gra.uml.qvt.ui._import;

import static org.apache.commons.lang.StringUtils.isNotBlank;
//import static org.ijis.gra.mpd.cat.util.CatExt.getCatalogFileExtensions;
//import static org.ijis.gra.mpd.cat.util.CatExt.getTheSPPName;
//import static org.ijis.gra.mpd.cat.util.CatExt.isACatalog;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.ijis.gra.catalog.Catalog.util.CatalogResourceFactoryImpl;
import org.ijis.gra.uml.qvt.ui.Activator;

public class ImportSPPWizardPage extends WizardNewFileCreationPage {

    private FileFieldEditor editor;
    private IFile theFileHandle;

    public ImportSPPWizardPage(final IStructuredSelection selection) {
        super(Activator.INSTANCE.getString("_UI_ImportSPPWizardPage_name"), selection);
        setTitle(Activator.INSTANCE.getString("_UI_ImportSPPWizardPage_title")); // NON-NLS-1
        setDescription(Activator.INSTANCE.getString("_UI_ImportSPPWizardPage_description")); // NON-NLS-1
    }

    @Override
    protected void createAdvancedControls(final Composite parent) {
        final Composite fileSelectionArea = new Composite(parent, SWT.NONE);
        final GridData fileSelectionData = new GridData(GridData.GRAB_HORIZONTAL | GridData.FILL_HORIZONTAL);
        fileSelectionArea.setLayoutData(fileSelectionData);

        final GridLayout fileSelectionLayout = new GridLayout();
        fileSelectionLayout.numColumns = 3;
        fileSelectionLayout.makeColumnsEqualWidth = false;
        fileSelectionLayout.marginWidth = 0;
        fileSelectionLayout.marginHeight = 0;
        fileSelectionArea.setLayout(fileSelectionLayout);

        editor = new FileFieldEditor("fileSelect", Activator.INSTANCE.getString("_UI_ImportSPPWizardPage_select_mpd_label"),
                fileSelectionArea); // NON-NLS-1 //NON-NLS-2
        editor.getTextControl(fileSelectionArea).addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent event) {
                final String value = editor.getStringValue();
                final IPath path = new Path(value);
                String fileName = path.removeFileExtension().lastSegment();
                if (isACatalog(new File(value))) {
                    final ResourceSetImpl aResourceSet = new ResourceSetImpl();
                    aResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                            .put("xml", new CatalogResourceFactoryImpl());
                    final Resource theSPP = aResourceSet.getResource(getTheCatalog(), true);
                    final String theSPPName = getTheSPPName(theSPP);
                    if (isNotBlank(theSPPName)) {
                        fileName = theSPPName;
                    }
                }
//                setFileName(fileName + ".di");
                setFileName(fileName + ".uml");
            }
        });
        final String[] extensions = getCatalogFileExtensions();
        for (int i = 0; i < extensions.length; i++) {
            extensions[i] = "*." + extensions[i]; // NON-NLS-1
        }
        editor.setFileExtensions(extensions);
        fileSelectionArea.moveAbove(null);
    }

    @Override
    protected boolean validatePage() {
        final boolean superValidation = super.validatePage();
        if (superValidation && !isACatalog(new File(editor.getStringValue()))) {
            setErrorMessage(Activator.INSTANCE.getString("_UI_ImportSPPWizardPage_error_mpd_is_invalid"));
            return false;
        }
        return superValidation;
    }
    protected String getTheSPPName(Resource resource){
    	return getTheSPPName(new File(resource.getURI().toFileString()));
    }
    protected String getTheSPPName(File file){
    	return file.getParentFile().getName();
    }
    protected String[] getCatalogFileExtensions(){
    	String[] extensions={"xml"};
    	return extensions;
    }
    protected boolean isACatalog(File file){
    	return "catalog.xml".equals(file.getName()) 
    			&& (new File(file.getParentFile(),"Metadata.xml").exists()
    					|| new File(file.getParentFile(),"metadata.xml").exists());
    }
    @Override
    protected void createLinkTarget() {
    }

    @Override
    protected String getNewFileLabel() {
        return Activator.INSTANCE.getString("_UI_ImportSPPWizardPage_new_diagram_label"); // NON-NLS-1
    }

    @Override
    protected IStatus validateLinkedResource() {
        return new Status(IStatus.OK, Activator.PLUGIN_ID, IStatus.OK, "", null); // NON-NLS-1 //NON-NLS-2
    }

    URI getTheCatalog() {
        return URI.createFileURI(editor.getStringValue());
    }

    URI getThePIM() {
        return URI.createPlatformResourceURI(createNewFile().getFullPath().toString(), true);
    }

    @Override
    public IFile createNewFile() {
        try {
            super.createNewFile();
        } catch (final BreakPoint b) {
        }
        return theFileHandle;
    }

    @Override
    protected IFile createFileHandle(final IPath filePath) {
        theFileHandle = super.createFileHandle(filePath);
        throw new BreakPoint();
    }

    private static final class BreakPoint extends RuntimeException {
        private static final long serialVersionUID = 1L;
    }
}
