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

import org.eclipse.emf.common.util.URI;
import org.ijis.gra.uml.qvt.ui.Activator;

public class GRApim2spp extends DiagramTransform {

    @Override
    protected Transformer createDelegate(final URI selection) {
        return new GRApim2sppDelegate(selection);
    }

    @Override
    protected int totalWork() {
        return 2;
    }

    private static final class GRApim2sppDelegate extends ComposedTransformer {
        GRApim2sppDelegate(final URI selection) {
            super(Activator.INSTANCE.getString("_UI_GRApim2mpd_Command_name"), 
    	            new GraSppModel2artifactDelegate(selection) // SPP catalog, metadata, wsdl
//    	    		new GraSppModel2sddDelegate(selection),// SDD document + catalog.html
//            new GraSppModel2siddDelegate(selection)// SIDD document
//    	            new GraSppModel2siddDelegate(selection),// SIDD document
//    	            new GraSppModel2artifactDelegate(selection) // SPP catalog, metadata, wsdl
            ,new NIEMpim2psmDelegate(selection),// NIEM PIM to PSM
            new NIEMmpdmodel2artifactDelegate(selection)// NIEM PSM to MPD
            		/* TODO: temporary suppress to debug NIEM part
	    		new GraSppModel2sddDelegate(selection),// SDD document
	            new GraSppModel2siddDelegate(selection),// SIDD document
	            new GraSppModel2artifactDelegate(selection), // SPP catalog, metadata, wsdl
	            // may need to adjust NIEM for multiple MPDs
	            new NIEMpim2psmDelegate(selection),// NIEM PIM to PSM
	            new NIEMmpdmodel2artifactDelegate(selection)// NIEM PSM to MPD
	            */
            );
        }
    }
}
