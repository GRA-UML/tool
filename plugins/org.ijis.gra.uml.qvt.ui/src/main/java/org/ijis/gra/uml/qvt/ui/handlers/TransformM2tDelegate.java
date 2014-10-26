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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.EvaluationMonitor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.ijis.gra.uml.qvt.ui.Activator;
import org.ijis.gra.uml.ui.GraCommonAction;
import org.ijis.gra.uml.util.URIExt;

abstract class TransformM2tDelegate implements Transformer {

    protected final URI selection;
    protected GraCommonAction m2tAction;
    protected String name;

    protected TransformM2tDelegate(final URI selection, GraCommonAction m2tAction, final String name) {
        this.selection = selection;
        this.m2tAction=m2tAction;
        this.name=name;
    }


    @Override
    public final void runTransform(final Shell shell, final IProgressMonitor monitor) throws InvocationTargetException {
        long startTime=System.currentTimeMillis();
       IFile selectedFile=URIExt.toIFile(selection);
    	try {
			m2tAction.performTransform(monitor, startTime, selectedFile);
		} catch (IOException e) {
			throw new InvocationTargetException(e);
		}
    }
    @Override
    public void close() throws Exception {
        // no-op by default
    }
    @Override
    public String name() {
        return name;
    }

}