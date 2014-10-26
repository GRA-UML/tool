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
package org.ijis.gra.uml.examples;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

public class Activator extends EMFPlugin {

    public static final String PLUGIN_ID = "org.ijis.gra.uml.examples"; //$NON-NLS-1$

    public static final String EXAMPLE_PROJECT_NAME = PLUGIN_ID;

    public static final String EXAMPLE_WIZARD_ID = PLUGIN_ID + ".NIEM_UMLWizard"; //$NON-NLS-1$

    public static final Activator INSTANCE = new Activator();

    private static Implementation plugin;

    public Activator() {
        super(new ResourceLocator[] {});
    }

    @Override
    public ResourceLocator getPluginResourceLocator() {
        return plugin;
    }

    public static Implementation getPlugin() {
        return plugin;
    }

    public static class Implementation extends EclipsePlugin {

        public Implementation() {
            super();

            plugin = this;
        }
    }
}
