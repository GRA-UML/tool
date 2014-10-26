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

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static org.apache.commons.io.FileUtils.writeStringToFile;
import static org.apache.commons.lang.StringUtils.isBlank;
import static org.eclipse.core.resources.IResource.DEPTH_INFINITE;
import static org.eclipse.emf.common.util.URI.createURI;
import static org.eclipse.emf.ecore.util.EcoreUtil.getObjectsByType;
import static org.search.niem.mpd.Constants.CHANGELOG_PURPOSE;
import static org.search.niem.mpd.Constants.EXCHANGE_SCHEMA_NATURE;
import static org.search.niem.mpd.Constants.EXCHANGE_SCHEMA_SET_PURPOSE;
import static org.search.niem.mpd.Constants.SAMPLE_PURPOSE;
import static org.search.niem.mpd.Constants.TEXT_NATURE;
import static org.search.niem.mpd.Constants.XML_NATURE;
import static org.search.niem.mpd.cat.util.CatExt.addCatalogFile;
import static org.search.niem.uml.qvt.ui.preferences.PreferenceConstants.P_CHANGELOG_FILE_NAME;
import static org.search.niem.uml.qvt.ui.preferences.PreferenceConstants.P_MPD_CATALOG_FILE_NAME;
import static org.search.niem.uml.qvt.ui.preferences.PreferenceConstants.P_SAMPLE_XML_SUFFIX;
import static org.search.niem.uml.qvt.ui.preferences.PreferenceConstants.P_XML_SAMPLES_FOLDER;
import static org.ijis.gra.uml.util.NIEMUmlExt.findPsmMpd;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDAuthoritativeSourceName;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDBaseURI;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDClassCode;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDCreationDate;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDDomains;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDKeywords;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDLastRevisionDate;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDPointOfContactEmailAddresses;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDPointOfContactName;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDPointOfContactPhoneNumbers;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDPointsOfContact;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDSecurityMarking;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDVersionID;
import static org.ijis.gra.uml.util.URIExt.appendPath;
import static org.ijis.gra.uml.util.URIExt.relativize;
import static org.ijis.gra.uml.util.URIExt.toFile;
import static org.ijis.gra.uml.util.URIExt.toIFolder;
import gov.ojp.it.gsp.services._1._0.util.graResourceFactoryImpl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.EvaluationMonitor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Element;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDSchema;
import org.ijis.gra.catalog.Catalog.CatalogType1;
import org.ijis.gra.catalog.Catalog.DocumentRoot;
import org.ijis.gra.catalog.Catalog.IepdCatalogType;
import org.ijis.gra.catalog.Catalog.util.CatalogResourceFactoryImpl;
import org.ijis.gra.uml.m2t.ui.SDDAction;
import org.ijis.gra.uml.m2t.ui.SIDDAction;
/*
import org.search.niem.mpd.cat.CatFactory;
import org.search.niem.mpd.cat.CatPackage;
import org.search.niem.mpd.cat.CatalogType;
import org.search.niem.mpd.cat.FileSetType;
import org.search.niem.mpd.cat.FileType;
import org.search.niem.mpd.cat.util.CatExt;
import org.search.niem.mpd.cat.util.CatResourceFactoryImpl;
*/
import org.ijis.gra.uml.qvt.ui.Activator;
//import org.ijis.gra.uml.qvt.ui.handlers.TransformDelegate.ContextLog;// not visible
import org.search.niem.mpd.cat.CatFactory;
import org.search.niem.mpd.cat.CatPackage;
import org.search.niem.mpd.cat.CatalogType;
import org.search.niem.mpd.cat.FileSetType;
import org.search.niem.mpd.cat.FileType;
import org.search.niem.mpd.cat.util.CatExt;
import org.search.niem.mpd.cat.util.CatResourceFactoryImpl;

final class GraSppModel2siddDelegate 
	//extends TransformDelegate // can not override transform
	extends TransformM2tDelegate
	{


    protected GraSppModel2siddDelegate(final URI selection) {
        super(selection, 
        		new SIDDAction( Activator.INSTANCE.getString("_UI_GRAmpdmodel2sidd_Command_name"),  Activator.INSTANCE.getString("_UI_GRAmpdmodel2sidd_Command_name")), 
        		Activator.INSTANCE.getString("_UI_GRAmpdmodel2sidd_Command_name"));
    }
    
   
}