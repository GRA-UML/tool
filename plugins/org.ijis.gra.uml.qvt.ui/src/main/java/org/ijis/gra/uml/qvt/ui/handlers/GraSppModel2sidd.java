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

public class GraSppModel2sidd extends DiagramTransform {

    @Override
    protected Transformer createDelegate(final URI selection) {
        return new GraSppModel2siddDelegate(selection);
    }
}
