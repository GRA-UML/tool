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
package org.ijis.gra.uml.evl.validation;

import org.ijis.gra.uml.evl.Activator;
import org.ijis.gra.uml.util.NiemValidator;

public class NiemValidationTool extends NiemValidator {
    public String getMessage(final String key, final Object substitution) {
        return Activator.INSTANCE.getString(key, new Object[] { substitution });
    }
}
