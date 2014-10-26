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
package org.ijis.gra.uml.util;

import static org.eclipse.uml2.uml.NamedElement.SEPARATOR;

public interface NIEMTypes {

    String NIEM_UML_PROFILE = "NIEM_UML_Profile"; //$NON-NLS-1$
    String NIEM_Common_Profile = NIEM_UML_PROFILE + SEPARATOR + "NIEM_Common_Profile"; //$NON-NLS-1$
    String NIEM_PSM_Profile = NIEM_UML_PROFILE + SEPARATOR + "NIEM_PSM_Profile"; //$NON-NLS-1$
    String NIEM_PIM_Profile_Name =  "NIEM_PIM_Profile"; //$NON-NLS-1$
    String NIEM_PIM_Profile = NIEM_UML_PROFILE + SEPARATOR + NIEM_PIM_Profile_Name; //$NON-NLS-1$
    // tjd:  qualified name does not necessarily work for magic draw exported models
    String Model_Package_Description_Profile_Name = "Model_Package_Description_Profile"; //$NON-NLS-1$
    String Model_Package_Description_Profile = NIEM_UML_PROFILE + SEPARATOR + Model_Package_Description_Profile_Name; //$NON-NLS-1$
//    String Model_Package_Description_Profile = NIEM_UML_PROFILE + SEPARATOR + "Model_Package_Description_Profile"; //$NON-NLS-1$

    String Namespace = NIEM_Common_Profile + SEPARATOR + "Namespace"; //$NON-NLS-1$
    String InformationModel_Name = "InformationModel"; //$NON-NLS-1$
    String InformationModel = NIEM_PIM_Profile + SEPARATOR + InformationModel_Name; //$NON-NLS-1$
//    String InformationModel = NIEM_PIM_Profile + SEPARATOR + "InformationModel"; //$NON-NLS-1$
    String ModelPackageDescription_Name = "ModelPackageDescription"; //$NON-NLS-1$
    String ModelPackageDescription = Model_Package_Description_Profile + SEPARATOR + ModelPackageDescription_Name; //$NON-NLS-1$
//    String ModelPackageDescription = Model_Package_Description_Profile + SEPARATOR + "ModelPackageDescription"; //$NON-NLS-1$
    String References_Name = "References"; //$NON-NLS-1$
    String References = NIEM_Common_Profile + SEPARATOR + References_Name; //$NON-NLS-1$
//    String References = NIEM_Common_Profile + SEPARATOR + "References"; //$NON-NLS-1$
    String ObjectType = NIEM_Common_Profile + SEPARATOR + "ObjectType"; //$NON-NLS-1$
    String AssociationType = NIEM_Common_Profile + SEPARATOR + "AssociationType"; //$NON-NLS-1$
    String MetadataType = NIEM_Common_Profile + SEPARATOR + "MetadataType"; //$NON-NLS-1$
    String AugmentationType = NIEM_Common_Profile + SEPARATOR + "AugmentationType"; //$NON-NLS-1$
    String AdapterType = NIEM_Common_Profile + SEPARATOR + "AdapterType"; //$NON-NLS-1$
    String PropertyHolder = NIEM_Common_Profile + SEPARATOR + "PropertyHolder"; //$NON-NLS-1$
    String Union = NIEM_Common_Profile + SEPARATOR + "Union"; //$NON-NLS-1$
    String ValueRestriction = NIEM_Common_Profile + SEPARATOR + "ValueRestriction"; //$NON-NLS-1$
    String Choice = NIEM_Common_Profile + SEPARATOR + "Choice"; //$NON-NLS-1$
    String List = NIEM_Common_Profile + SEPARATOR + "List"; //$NON-NLS-1$
    String RoleOf = NIEM_PIM_Profile + SEPARATOR + "RoleOf"; //$NON-NLS-1$
    String ReferenceName_Name = "ReferenceName"; //$NON-NLS-1$
    String ReferenceName = NIEM_PIM_Profile + SEPARATOR + ReferenceName_Name; //$NON-NLS-1$
//    String ReferenceName = NIEM_PIM_Profile + SEPARATOR + "ReferenceName"; //$NON-NLS-1$

}
