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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.ijis.gra.uml.qvt.ui.Activator;
import org.ijis.gra.uml.qvt.ui.handlers.GRAsppartifact2modelDelegate;
import org.ijis.gra.uml.qvt.ui.handlers.Transform;
import org.ijis.gra.uml.qvt.ui.handlers.Transformer;

public class ImportSPP extends Wizard implements IImportWizard {

    private ImportSPPWizardPage mainPage;

    public ImportSPP() {
        super();
        setNeedsProgressMonitor(true);
    }

    /**
     * TODO: generalize this with {@link Transform#execute(org.eclipse.core.commands.ExecutionEvent)} so that any runnable
     * context can run a transform given a transform provider
     */
    @Override
    public boolean performFinish() {
        mainPage.createNewFile();
        final URI theCatalog = mainPage.getTheCatalog();
        final URI thePIM = mainPage.getThePIM();
        try {
            getContainer().run(true, true, new IRunnableWithProgress() {
                @Override
                public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                	System.out.println("Start SPP");
                    try (final Transformer delegate = new ImportSPPDelegate(theCatalog, thePIM)) {
                        monitor.beginTask(
                                Activator.INSTANCE.getString("_UI_Transform_progress", new Object[] { delegate.name() }),
                                IProgressMonitor.UNKNOWN);
                        delegate.runTransform(getContainer().getShell(), monitor);
                    } catch (final Exception e) {
                    	e.printStackTrace();
                        Activator.INSTANCE.log(e);
                    } finally {
                        monitor.done();
                    }
                	System.out.println("End SPP");
                }
            });
        } catch (final InvocationTargetException e) {
        	e.printStackTrace();
            return false;
        } catch (final InterruptedException e) {
            // no-op
        }
        return true;
    }

    @Override
    public void init(final IWorkbench workbench, final IStructuredSelection selection) {
        setWindowTitle(Activator.INSTANCE.getString("_UI_ImportSPP_window_title")); // NON-NLS-1
        setNeedsProgressMonitor(true);
        mainPage = new ImportSPPWizardPage(selection); // NON-NLS-1
    }

    @Override
    public void addPages() {
        super.addPages();
        addPage(mainPage);
    }

    private static final class ImportSPPDelegate extends GRAsppartifact2modelDelegate {

        private final URI thePimUri;

        protected ImportSPPDelegate(final URI selection, final URI thePimUri) {
            super(selection);
            this.thePimUri = thePimUri;
        }

        @Override
        protected final URI getThePimUri() {
            return thePimUri;
        }
    }
}
