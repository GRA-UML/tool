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
package org.ijis.gra.uml.qvt;

import static java.util.Arrays.asList;
import static org.apache.commons.lang.StringUtils.defaultIfBlank;
import static org.eclipse.uml2.uml.util.UMLUtil.getBaseElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;









import gov.ojp.it.gsp.services._1._0.DocumentRoot;






//import static org.ijis.gra.mpd.Constants.BASE_MPD_NAMESPACE;
//import static org.ijis.gra.mpd.Constants.NATURE_TYPE;
//import static org.ijis.gra.mpd.Constants.PURPOSE_TYPE;
//import static org.ijis.gra.mpd.cat.util.CatExt.getCatalogFileExtensions;
//import static org.ijis.gra.mpd.cat.util.CatExt.isACatalog;
/*
import static org.ijis.gra.uml.library.Activator.APPINFO2_NAMESPACE;
import static org.ijis.gra.uml.library.Activator.APPINFO_NAMESPACE;
import static org.ijis.gra.uml.qvt.util.NIEMXsdUtil.createAppinfoElement;
import static org.ijis.gra.uml.qvt.util.NIEMXsdUtil.getOrCreateAppinfoElement;
import static org.ijis.gra.uml.qvt.util.NIEMXsdUtil.setAttribute;
import static org.ijis.gra.uml.qvt.util.NIEMXsdUtil.setContent;
import static org.ijis.gra.uml.resources.Activator.getNiemUmlProfile;
import static org.ijis.gra.uml.resources.Activator.getXmlPrimitiveTypes;
import static org.ijis.gra.uml.util.NIEMTypes.NIEM_PIM_Profile;
import static org.ijis.gra.uml.util.NIEMUmlExt.createPOC;
import static org.ijis.gra.uml.util.NIEMUmlExt.getAppliedReferencesStereotype;
import static org.ijis.gra.uml.util.NIEMUmlExt.getMPDPointsOfContact;
import static org.ijis.gra.uml.util.NIEMUmlExt.getReferenceNameStereotypeApplication;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDAuthoritativeSourceAddress;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDAuthoritativeSourceName;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDAuthoritativeSourceWebsiteURL;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDBaseURI;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDCreationDate;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDDescription;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDDomains;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDExchangePartnerName;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDExchangePatternText;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDKeywords;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDPackageCode;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDPointOfContactEmailAddresses;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDPointOfContactName;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDPointOfContactPhoneNumbers;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDPurpose;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDSecurityMarking;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDStatusText;
import static org.ijis.gra.uml.util.NIEMUmlExt.setMPDVersionID;
import static org.ijis.gra.uml.util.UMLExt.copyAttributes;
import static org.ijis.gra.uml.util.UMLExt.getStereotypeValue;
import static org.ijis.gra.uml.util.UMLExt.remove;
import static org.ijis.gra.uml.util.UMLExt.setStereotypeValue;
import static org.ijis.gra.uml.util.URIExt.appendPath;
*/
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.wst.wsdl.Binding;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.ExtensibilityElement;
import org.eclipse.wst.wsdl.ExtensibleElement;
import org.eclipse.wst.wsdl.Import;
import org.eclipse.wst.wsdl.Message;
import org.eclipse.wst.wsdl.Namespace;
import org.eclipse.wst.wsdl.Part;
import org.eclipse.wst.wsdl.Port;
import org.eclipse.wst.wsdl.PortType;
import org.eclipse.wst.wsdl.Service;
import org.eclipse.wst.wsdl.Types;
import org.eclipse.wst.wsdl.UnknownExtensibilityElement;
import org.eclipse.wst.wsdl.WSDLElement;
import org.eclipse.wst.wsdl.binding.soap.SOAPHeader;
import org.eclipse.wst.wsdl.internal.impl.DefinitionImpl;
import org.eclipse.xsd.XSDAnnotation;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDImport;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDTypeDefinition;
//import org.ijis.gra.catalog.Catalog.DocumentRoot;
//import org.ijis.gra.catalog.Catalog.CatalogPackage;
//import org.ijis.gra.catalog.Catalog.CatalogType;
//import org.ijis.gra.catalog.Catalog.FileSetType;
//import org.ijis.gra.catalog.Catalog.FileType;
//import org.ijis.gra.catalog.Catalog.FolderType;
//import org.ijis.gra.catalog.Catalog.util.CatExt;
//import org.ijis.gra.uml.util.UMLExt;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GraQvtLibrary {
	private static final Logger LOG = LoggerFactory.getLogger(GraQvtLibrary.class);
	// return segment of parent extent URI
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String extentParentSegment(final EObject self) {
        return self.eResource().getURI().trimSegments(1).lastSegment();
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
//    public static String getURI(final EObject self) {
    public static String getURI(final Object selfObject) {
    	EObject self=(EObject)selfObject;
        return self.eResource().getURI().toString();
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
//  public static String getURI(final EObject self) {
  public static String getRelativeURI(final Object selfObject) {
  	EObject self=(EObject)selfObject;
  	return self.eResource().getURI().lastSegment().replace(".uml",".xmi");
      //return self.eResource().getURI().toString();
  }
    
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getDocumentationElementText(final Object self) {
    	return ((org.w3c.dom.Element)self).getTextContent();
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getAttrValue(final Object self) {
    	return ((org.w3c.dom.Attr)self).getValue();
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static XMLGregorianCalendar toDate(final String self) throws DatatypeConfigurationException {
    	return DatatypeFactory.newInstance().newXMLGregorianCalendar(self);
    }
    @Operation(contextual=true)
    public XMLGregorianCalendar date(String any){
      GregorianCalendar cal=new GregorianCalendar();
      try {
//        return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
    	  XMLGregorianCalendar xmlGregorianCalendar= DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
    	  xmlGregorianCalendar.setHour(DatatypeConstants.FIELD_UNDEFINED);
    	  xmlGregorianCalendar.setMinute(DatatypeConstants.FIELD_UNDEFINED);
    	  xmlGregorianCalendar.setSecond(DatatypeConstants.FIELD_UNDEFINED);
    	  return xmlGregorianCalendar;
      } catch (DatatypeConfigurationException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        return null;
      }
    } 
    
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Duration toDuration(final String self) throws DatatypeConfigurationException {
    	try{
    	return DatatypeFactory.newInstance().newDuration(self);
    	}catch(IllegalArgumentException exception){
    		System.out.println("ERROR: failed to convert duration "+self+" : "+exception);
    		return null;
    	}
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
//    public static String getURIFragment(final EObject self)  {
    public static String getURIFragment(final Object selfObject)  {
    	EObject self=(EObject)selfObject;
    	return self.eResource().getURIFragment(self);
    }
/*
    // TODO: true if the context Element can be modified (i.e., not a library or shared resource)
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static boolean isEditable(final Element self) {
        return true;
    }

    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static boolean IsStereotypeApplied(final Element self, final Stereotype stereotype) {
        return self.isStereotypeApplied(stereotype);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void removeElement(final Element self) {
        remove(self);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static EObject ApplyStereotype(final Element self, final Stereotype stereotype) {
        if (!self.isStereotypeApplicable(stereotype)) {
            Activator.INSTANCE.log("The stereotype " + stereotype.getName() + " is not applicable to "
                    + self.eClass().getName() + "!");
            return null;
        }
        if (self.isStereotypeApplied(stereotype)) {
            Activator.INSTANCE.log("Re-applying stereotype " + stereotype.getName() + " that is already applied to "
                    + self.eClass().getName() + " " + UMLExt.getName(self) + "!");
            return self.getStereotypeApplication(stereotype);
        }
        return self.applyStereotype(stereotype);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setLower(final MultiplicityElement self, final Integer lower) {
        self.setLower(lower);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setUpper(final MultiplicityElement self, final Integer upper) {
        self.setUpper(upper);
    }

    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static EObject GetStereotypeApplication(final Element self, final Stereotype stereotype) {
        final EObject theStereotypeApplication = self.getStereotypeApplication(stereotype);
        if (theStereotypeApplication != null) {
            return theStereotypeApplication;
        }
        final List<Stereotype> theAppliedSubstereotypes = self.getAppliedSubstereotypes(stereotype);
        if (!theAppliedSubstereotypes.isEmpty()) {
            return self.getStereotypeApplication(theAppliedSubstereotypes.get(0));
        }
        return null;
    }
*/
    /*
     * Stereotype instance tag value setters. Context is an applied stereotype instance. Argument is value of tag to be set.
     * In the case of Enumerations, argument is the String value of the EnumerationLiteral name
     * 
     * These are abstract to reflect variations of Stereotype instance implementations, which typically are either A UML
     * InstanceSpecification A dynamic CMOF meta-model implementation
     */
	/*
    // set <<InformationModel>> defaultPurpose
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setInformationModelDefaultPurpose(final EObject self, final String defaultPurpose) {
        final Package informationModel = (Package) getBaseElement(self);
        final Profile theAppliedProfile = informationModel.getAppliedProfile(NIEM_PIM_Profile, true);
        final Enumeration defaultPurposeCode = (Enumeration) theAppliedProfile.getOwnedType("DefaultPurposeCode");
        setStereotypeValue(self, "defaultPurpose", defaultPurposeCode.getOwnedLiteral(defaultPurpose));
    }

    // set <<Namespace>> isConformant
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setSchemaAppinfoConformantIndicator(final EObject self, final Boolean isConformant) {
        setStereotypeValue(self, "isConformant", isConformant);
    }

    // set <<Namespace>> version
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setSchemaVersion(final EObject self, final String version) {
        setStereotypeValue(self, "version", version);
    }

    // set <<Namespace>> targetNamespace
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setSchemaNamespace(final EObject self, final String targetNamespace) {
        setStereotypeValue(self, "targetNamespace", targetNamespace);
    }

    // set <<ModelPackageDescriptionFile>> externalURI
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setFileTypeExternalURI(final EObject self, final String externalURI) {
        setStereotypeValue(self, "externalURI", externalURI);
    }

    // set <<ModelPackageDescriptionFile>> natureCode (argument is full URI, not the abbreviated code in the Enumeration)
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setFileTypeNatureCode(final EObject self, final String natureCode) {
        setStereotypeValue(self, "natureCode", fromURI(self, "natureCode", natureCode));
    }

    // set <<ModelPackageDescriptionFile>> purposeCode (argument is full URI, not the abbreviated code in the Enumeration)
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setFileTypePurposeCode(final EObject self, final String purposeCode) {
        setStereotypeValue(self, "purposeCode", fromURI(self, "purposeCode", purposeCode));
    }

    // set <<ModelPackageDescriptionFile>> relativePathName
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setFileTypeRelativePathName(final EObject self, final String relativePathName) {
        setStereotypeValue(self, "relativePathName", relativePathName);
    }

    // set <<ModelPackageDescriptionFile>> descriptionText
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setFileTypeDescriptionText(final EObject self, final String descriptionText) {
        setStereotypeValue(self, "descriptionText", descriptionText);
    }

    // set <<ModelPackageDescriptionFileSet>> natureCode (argument is full URI, not the abbreviated code in the Enumeration)
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setFileSetTypeNatureURI(final EObject self, final String natureCode) {
        setStereotypeValue(self, "natureCode", fromURI(self, "natureCode", natureCode));
    }

    // set <<ModelPackageDescriptionFileSet>> purposeCode (argument is full URI, not the abbreviated code in the Enumeration)
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setFileSetTypePurposeURI(final EObject self, final String purposeCode) {
        setStereotypeValue(self, "purposeCode", fromURI(self, "purposeCode", purposeCode));
    }

    // set <<XSDProperty>> kind
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMPropertyKind(final EObject self, final String kind) {
        setStereotypeValue(self, "kind", kind);
    }

    // set <<XSDProperty>> nillable
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMPropertyNillable(final EObject self, final Boolean nillable) {
        setStereotypeValue(self, "nillable", nillable);
    }

    // set <<ValueRestriction>> fractionDigits
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMSimpleTypeFractionDigits(final EObject self, final Integer fractionDigits) {
        setStereotypeValue(self, "fractionDigits", fractionDigits);
    }

    // set <<ValueRestriction>> length
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMSimpleTypeLength(final EObject self, final Integer length) {
        setStereotypeValue(self, "length", length);
    }

    // set <<ValueRestriction>> maxLength
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMSimpleTypeMaxLength(final EObject self, final Integer maxLength) {
        setStereotypeValue(self, "maxLength", maxLength);
    }

    // set <<ValueRestriction>> minLength
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMSimpleTypeMinLength(final EObject self, final Integer minLength) {
        setStereotypeValue(self, "minLength", minLength);
    }

    // set <<ValueRestriction>> maxExclusive
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMSimpleTypeMaxExclusive(final EObject self, final String maxExclusive) {
        setStereotypeValue(self, "maxExclusive", maxExclusive);
    }

    // set <<ValueRestriction>> maxInclusive
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMSimpleTypeMaxInclusive(final EObject self, final String maxInclusive) {
        setStereotypeValue(self, "maxInclusive", maxInclusive);
    }

    // set <<ValueRestriction>> minExclusive
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMSimpleTypeMinExclusive(final EObject self, final String minExclusive) {
        setStereotypeValue(self, "minExclusive", minExclusive);
    }

    // set <<ValueRestriction>> minInclusive
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMSimpleTypeMinInclusive(final EObject self, final String minInclusive) {
        setStereotypeValue(self, "minInclusive", minInclusive);
    }

    // set <<ValueRestriction>> totalDigits
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMSimpleTypeTotalDigits(final EObject self, final Integer totalDigits) {
        setStereotypeValue(self, "totalDigits", totalDigits);
    }

    // set <<XSDRepresentationRestriction>> whiteSpace
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMSimpleTypeWhiteSpace(final EObject self, final String whiteSpace) {
        setStereotypeValue(self, "whiteSpace", whiteSpace);
    }

    // set <<ValueRestriction>> pattern
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMSimpleTypePattern(final EObject self, final List<String> pattern) {
        setStereotypeValue(self, "pattern", pattern == null ? Collections.emptyList() : pattern);
    }

    // set <<XSDAnyProperty>> processContents
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMAnyPropertyProcessContents(final EObject self, final String processContents) {
        setStereotypeValue(self, "processContents", fromName(self, "processContents", processContents)); // TODO: What is
                                                                                                         // going on here?
    }

    // set <<XSDAnyProperty>> valueNamespace
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setNIEMAnyPropertyValueNamespace(final EObject self, final String valueNamespace) {
        setStereotypeValue(self, "valueNamespace", valueNamespace);
    }

    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Boolean isCatalogFolderType(final Object self) {
        return CatPackage.Literals.FOLDER_TYPE.isInstance(self);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void addCatalogFileSet(final CatalogType self, final FileSetType folder) {
        CatExt.addCatalogFileSet(self, folder);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void addCatalogFolder(final CatalogType self, final FolderType folderIn) {
        CatExt.addCatalogFolder(self, folderIn);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void addCatalogFile(final CatalogType self, final FileType fileIn) {
        CatExt.addCatalogFile(self, fileIn);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void addFileSetFiles(final FileSetType self, final String value) {
        if (self.getFiles() == null) {
            self.setFiles(new ArrayList<>(asList(value)));
        } else {
            self.getFiles().add(value);
        }
    }

    // retrieve the string value of the natureCode tag from a <<ModelPackageDescriptionFile>>
    // additional query to support issues including Issue 18179: NIEM-UML Issue � Changelog
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getFileTypeNatureCode(final EObject self) {
        return uriFromEnumerationLiteral(UMLExt.<EnumerationLiteral> getStereotypeValue(self, "natureCode"), PURPOSE_TYPE);
    }

    // retrieve the string value of the natureCode tag from a <<ModelPackageDescriptionFileSet>>
    // additional query to support issues including Issue 18179: NIEM-UML Issue � Changelog
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getFileSetTypeNatureCode(final EObject self) {
        return uriFromEnumerationLiteral(UMLExt.<EnumerationLiteral> getStereotypeValue(self, "natureCode"), PURPOSE_TYPE);
    }

    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getFileTypePurposeURI(final EObject self) {
        return uriFromEnumerationLiteral(UMLExt.<EnumerationLiteral> getStereotypeValue(self, "purposeCode"), PURPOSE_TYPE);
    }

    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getFileTypeNatureURI(final EObject self) {
        return uriFromEnumerationLiteral(UMLExt.<EnumerationLiteral> getStereotypeValue(self, "natureCode"), NATURE_TYPE);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void splitSchemas(final EObject self, final EObject referenceTarget) {
        // TODO: WTF is this doing?
        // throw new UnsupportedOperationException("Not yet implemented");
    }
*/
    /*
     * Stereotype instance tag value getters. Context is an applied stereotype instance. The value of tag on the Stereotype
     * instance is returned. In the case of Enumerations, return value is the String value of the EnumerationLiteral name
     * 
     * These are abstract to reflect variations of Stereotype instance implementations, which typically are either A UML
     * InstanceSpecification A dynamic CMOF meta-model implementation
     */
/*
    // get <<InformationModel>> defaultPurpose
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getInformationModelDefaultPurpose(final EObject self) {
        return UMLExt.getName(UMLExt.<EnumerationLiteral> getStereotypeValue(self, "defaultPurpose"));
    }

    // get <<Namespace>> targetNamespace
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getSchemaTargetNamespace(final EObject self) {
        return getStereotypeValue(self, "targetNamespace");
    }

    // Issue 17572: NIEM-UML FTF Issue: Namespace prefix (niem-uml-ftf):
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getSchemaDefaultPrefix(final EObject self) {
        return getStereotypeValue(self, "defaultPrefix");
    }

    // get <<Namespace>> isConformant
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Boolean getPimSchemaConformantIndicator(final EObject self) {
        return getStereotypeValue(self, "isConformant");
    }

    // get <<Namespace>> version
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getPimSchemaVersion(final EObject self) {
        return getStereotypeValue(self, "version");
    }

    // get <<ValueRestriction>> fractionDigits
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Integer getNIEMSimpleTypeFractionDigits(final EObject self) {
        return getStereotypeValue(self, "fractionDigits", true);
    }

    // get <<ValueRestriction>> length
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Integer getNIEMSimpleTypeLength(final EObject self) {
        return getStereotypeValue(self, "length", true);
    }

    // get <<ValueRestriction>> maxLength
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Integer getNIEMSimpleTypeMaxLength(final EObject self) {
        return getStereotypeValue(self, "maxLength", true);
    }

    // get <<ValueRestriction>> minLength
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Integer getNIEMSimpleTypeMinLength(final EObject self) {
        return getStereotypeValue(self, "minLength", true);
    }

    // get <<ValueRestriction>> totalDigits
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Integer getNIEMSimpleTypeTotalDigits(final EObject self) {
        return getStereotypeValue(self, "totalDigits", true);
    }

    // get <<ValueRestriction>> pattern
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<String> getNIEMSimpleTypePattern(final EObject self) {
        return getStereotypeValue(self, "pattern", true);
    }

    // get <<ValueRestriction>> maxExclusive
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getNIEMSimpleTypeMaxExclusive(final EObject self) {
        return getStereotypeValue(self, "maxExclusive", true);
    }

    // get <<ValueRestriction>> maxInclusive
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getNIEMSimpleTypeMaxInclusive(final EObject self) {
        return getStereotypeValue(self, "maxInclusive", true);
    }

    // get <<ValueRestriction>> minExclusive
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getNIEMSimpleTypeMinExclusive(final EObject self) {
        return getStereotypeValue(self, "minExclusive", true);
    }

    // get <<ValueRestriction>> minInclusive
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getNIEMSimpleTypeMinInclusive(final EObject self) {
        return getStereotypeValue(self, "minInclusive", true);
    }

    // get <<XSDRepresentationRestriction>> whiteSpace
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getXSDRepresentationRestrictionWhiteSpace(final EObject self) {
        return getStereotypeValue(self, "whiteSpace");
    }

    // get <<XSDProperty>> kind
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getNIEMPropertyKind(final EObject self) {
        return UMLExt.getName(UMLExt.<EnumerationLiteral> getStereotypeValue(self, "kind"));
    }

    // get <<XSDAnyProperty>> valueNamespace
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getAnyPropertyNamespace(final EObject self) {
        return getStereotypeValue(self, "valueNamespace", true);
    }

    // get <<XSDAnyProperty>> processContents
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getAnyPropertyProcessContents(final EObject self) {
        return UMLExt.getName(UMLExt.<EnumerationLiteral> getStereotypeValue(self, "processContents"));
    }

    // get <<XSDProperty>> nillable
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Boolean getNIEMElementNillable(final EObject self) {
        return getStereotypeValue(self, "nillable");
    }

    // get <<XSDProperty>> fixed
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getXSDPropertyFixed(final EObject self) {
        return getStereotypeValue(self, "fixed");
    }

    // get <<ModelPackageDescription>> descriptionText
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getMpdDescriptionText(final EObject self) {
        return getStereotypeValue(self, "descriptionText");
    }

    // get <<ModelPackageDescription>> mpdBaseURI
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getMpdBaseURI(final EObject self) {
        return getStereotypeValue(self, "mpdBaseURI");
    }

    // get <<ModelPackageDescription>> mpdVersionID
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getMpdVersionID(final EObject self) {
        return getStereotypeValue(self, "mpdVersionID");
    }

    // get <<ModelPackageDescription>> SecurityMarkingText
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getMpdSecurityMarkingText(final EObject self) {
        return getStereotypeValue(self, "SecurityMarkingText");
    }

    // get <<ModelPackageDescription>> StatusText
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getMpdStatusText(final EObject self) {
        return getStereotypeValue(self, "StatusText");
    }

    // get <<ModelPackageDescription>> KeywordText
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<String> getMpdKeywordText(final EObject self) {
        return getStereotypeValue(self, "KeywordText");
    }

    // get <<ModelPackageDescription>> POC
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<EObject> getMpdPOCAsStdlib(final EObject self) {
        return getStereotypeValue(self, "POC");
    }

    // get <<ModelPackageDescription>> DomainText
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<String> getMpdDomainText(final EObject self) {
        return getStereotypeValue(self, "DomainText");
    }

    // get <<ModelPackageDescription>> PurposeText
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<String> getMpdPurposeText(final EObject self) {
        return getStereotypeValue(self, "PurposeText");
    }

    // get <<ModelPackageDescription>> ExchangePatternText
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<String> getMpdExchangePatternText(final EObject self) {
        return getStereotypeValue(self, "ExchangePatternText");
    }

    // get <<ModelPackageDescription>> ExchangePartnerName
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<String> getMpdExchangePartnerName(final EObject self) {
        return getStereotypeValue(self, "ExchangePartnerName");
    }

    // get <<ModelPackageDescription>> ASName
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getMpdASName(final EObject self) {
        return getStereotypeValue(self, "ASName");
    }

    // get <<ModelPackageDescription>> ASAddressText
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getMpdASAddressText(final EObject self) {
        return getStereotypeValue(self, "ASAddressText");
    }

    // get <<ModelPackageDescription>> ASWebSiteURL
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getMpdASWebSiteURL(final EObject self) {
        return getStereotypeValue(self, "ASWebSiteURL");
    }

    // get <<ModelPackageDescription>> CreationDate
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getMpdCreationDate(final EObject self) {
        return getStereotypeValue(self, "CreationDate");
    }

    // get <<ModelPackageDescription>> mpdClassCode
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getMpdPackageCode(final EObject self) {
        return UMLExt.<EnumerationLiteral> getStereotypeValue(self, "mpdClassCode").getName();
    }

    // get POCType POCName
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getPOCName(final EObject self) {
        return getStereotypeValue(self, "POCName");
    }

    // get POCType POCEmail
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<String> getPOCEmail(final EObject self) {
        return getStereotypeValue(self, "POCEmail");
    }

    // get POCType POCTelephone
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<String> getPOCTelephone(final EObject self) {
        return getStereotypeValue(self, "POCTelephone");
    }

    // get <<ModelPackageDescriptionFileSet>> purposeCode (as full URI, not the abbreviated code in the Enumeration)
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getFileSetTypePurposeCode(final EObject self) {
        return uriFromEnumerationLiteral(UMLExt.<EnumerationLiteral> getStereotypeValue(self, "purposeCode"), PURPOSE_TYPE);
    }

    // get <<ModelPackageDescriptionFileSet>> externalURI
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getFileSetExternalURI(final EObject self) {
        return getStereotypeValue(self, "externalURI");
    }

    // get <<ModelPackageDescriptionFileSet>> descriptionText
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getFileSetDescriptionText(final EObject self) {
        return getStereotypeValue(self, "descriptionText");
    }

    // get <<ModelPackageDescriptionFile>> purposeCode (as full URI, not the abbreviated code in the Enumeration)
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getFileTypePurposeCode(final EObject self) {
        return uriFromEnumerationLiteral(UMLExt.<EnumerationLiteral> getStereotypeValue(self, "purposeCode"), PURPOSE_TYPE);
    }

    // get <<ModelPackageDescriptionFile>> externalURI
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getFileTypeExternalURI(final EObject self) {
        return getStereotypeValue(self, "externalURI");
    }

    // get <<ModelPackageDescriptionFile>> descriptionText
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getFileDescriptionText(final EObject self) {
        return getStereotypeValue(self, "descriptionText");
    }

    // return value of tag relativePathName within <<ModelPackageDescriptionFile>>; as part of Issue 18361: PSM
    // Representation for XSD Complex Type
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getFileTypeRelativePathName(final EObject self) {
        return getStereotypeValue(self, "relativePathName");
    }

    // get <<ModelPackageDescriptionRelationship>> descriptionText
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getRelationshipDescriptionText(final EObject self) {
        return getStereotypeValue(self, "descriptionText");
    }

    // get <<ModelPackageDescriptionRelationship>> relationshipCode
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getRelationshipCode(final EObject self) {
        return getStereotypeValue(self, "relationshipCode");
    }
*/
    /*
     * apply the stereotype to the target, copy the values of the stereotype instance context to the new stereotype instance,
     * return the new stereotype instance
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static EObject deepCloneStereotypeApplication(final EObject self, final Stereotype stereotype,
            final Element target) {
        final EObject theCopy = EcoreUtil.copy(self);
        for (final EStructuralFeature feature : theCopy.eClass().getEAllStructuralFeatures()) {
            if (feature.getName().startsWith(Extension.METACLASS_ROLE_PREFIX)) {
                theCopy.eSet(feature, target);
                target.eResource().getContents().add(theCopy);
                return theCopy;
            }
        }
        Activator.INSTANCE.log("Unable to find the base_ property for the copied stereotype application.");
        return null;
    }
*/
    /*
     * apply the <<Namespace>> stereotype to the target, copy the values of the <<InformationModel>> stereotype instance
     * context to the new <<Namespace>> stereotype instance
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void cloneInformationModelToNamespace(final EObject self, final EObject target) {
        copyAttributes(self, target);
    }
*/
    /*
     * For the context CMOF extent, For the URI of the extent, return the last segment of the URI after truncating the file
     * extension.
     */
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static String emofContextURI(final Object selfObject) {
    	EObject self=(EObject)selfObject;
        return self.eResource().getURI().trimFileExtension().lastSegment();
    }
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void addXsiSchemaLocation(DocumentRoot result,String key,String value) {
    	EStringToStringMapEntryImpl metadataLocation=(EStringToStringMapEntryImpl) ((EcoreFactoryImpl)EcoreFactory.eINSTANCE).createEStringToStringMapEntry();
    	metadataLocation.setKey(key);
    	metadataLocation.setValue(value);
    	result.getXSISchemaLocation().add(metadataLocation);
    }

    
/* in NiemQvtLib
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static String contextURI(final EObject self) {
        return self.eResource().getURI().trimFileExtension().lastSegment();
    }
*/
    /*
     * Return a representation for the CMOF extent of the XSDSchema context
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static EObject eXtent(final XSDSchema self) {
        return self;
    }
*/
    /*
     * Sets the QName prefix used to reference the schema for schema namespace.
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setSchemaForSchema(final XSDSchema self, final String prefix, final String namespace) {
        self.setSchemaForSchemaQNamePrefix(prefix);
        setQNamePrefixToNamespace(self, prefix, namespace);
    }
*/
    /*
     * Sets the QName prefix used to reference the given namespace.
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setQNamePrefixToNamespace(final XSDSchema self, final String prefix, final String namespace) {
        final Map<String, String> namespaces = self.getQNamePrefixToNamespaceMap();
        namespaces.put(prefix, namespace);
    }
*/
    /*
     * Return the location of the XSDSchema, relative to the root directory of the target ModelPackageDescription
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String relativeMdpLocation(final XSDSchema self) {
        final URI theSchemaURI = self.eResource().getURI();
        final File theSchemaFile;
        if (theSchemaURI.isPlatformResource()) {
            final String platformRelativePath = theSchemaURI.toPlatformString(true);
            theSchemaFile = ResourcesPlugin.getWorkspace().getRoot()
                    .findMember(Path.fromPortableString(platformRelativePath)).getLocation().toFile();
        } else {
            theSchemaFile = new File(theSchemaURI.toFileString());
        }
        File theParentDirectory = theSchemaFile.getParentFile();
        while (theParentDirectory != null) {
            if (containsACatalog(theParentDirectory)) {
                break;
            }
            theParentDirectory = theParentDirectory.getParentFile();
        }
        final String theRelativePath = theParentDirectory.toPath().relativize(theSchemaFile.toPath()).toString();
        return theRelativePath;
    }

    private static boolean containsACatalog(final File theParentDirectory) {
        final String[] catalogFileExtensions = getCatalogFileExtensions();
        for (int i = 0; i < catalogFileExtensions.length; i++) {
            catalogFileExtensions[i] = "." + catalogFileExtensions[i].toLowerCase();
        }
        final File[] files = theParentDirectory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(final File dir, final String name) {
                final String lowerCaseName = name.toLowerCase();
                for (final String extension : catalogFileExtensions) {
                    if (lowerCaseName.endsWith(extension)) {
                        return true;
                    }
                }
                return false;
            }
        });
        for (final File f : files) {
            if (isACatalog(f)) {
                return true;
            }
        }
        return false;
    }
*/
    /*
     * <p>perform platform-specific provisioning of changelog, where self context is a package representing a changelog.</p>
     * <p>hook to platform-specific implementation per Issue 18179: NIEM-UML Issue � Changelog</p>
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static Package changelog(final Package self, final Package psmPackage) {
        // TODO: WTF is this doing?
        return psmPackage;
    }
*/
    /*
     * <p>part of Issue 18251: NIEM-UML Issue: Constraint schema</p> <p>find any explicitly specified constraint models for
     * given <<InformationModel>> (the client of a <<References>> for which given model is supplier)</p>
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static LinkedHashSet<Package> getPimConstraintModels(final Package self) {
        final LinkedHashSet<Package> pimConstraintModels = new LinkedHashSet<>();
        for (final Dependency d : self.getClientDependencies()) {
            if (UMLPackage.Literals.REALIZATION.isInstance(d) && getAppliedReferencesStereotype(d) != null) {
                pimConstraintModels
                        .addAll(EcoreUtil.<Package> getObjectsByType(d.getClients(), UMLPackage.Literals.PACKAGE));
            }
        }
        return pimConstraintModels;
    }
*/
    /*
     * <p>returns Dependencies for which the context NamedElement is the supplier, as part of Issue 18361: PSM Representation
     * for XSD Complex Type</p>
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static LinkedHashSet<Dependency> getSupplierDependency(final NamedElement self) {
        return new LinkedHashSet<>(self.getClientDependencies());
    }
*/
    /*
     * <p>if <<NIEMName>> applied, return the <<NIEMName>> name, otherwise umlName, added as part of Issue 18361: PSM
     * Representation for XSD Complex Type with Simple Content</p> <p>This should read
     * "if <<ReferenceName>> applied, return the <<ReferenceName>>#NIEMName name, otherwise umlName, added as part of Issue 18361: PSM Representation for XSD Complex Type with Simple Content"
     * </p>
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getBaseNiemName(final Element self, final String umlName) {
        final EObject referenceNameStereotypeApplication = getReferenceNameStereotypeApplication(self);
        if (referenceNameStereotypeApplication == null) {
            return umlName;
        }
        final String baseName = getStereotypeValue(referenceNameStereotypeApplication, "NIEMName", true);
        return baseName == null ? umlName : baseName;
    }
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void importSchema(final XSDImport self) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

*/
    /*
     * Returns the value of the 'Application Information' attribute list for the XSDAnnotation context. The list contents are
     * of type org.w3c.dom.Element. This represents the application information infoset property, i.e., a list of appinfo
     * elements.
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static LinkedHashSet<Object> getXSDAnnotationApplicationInformation(final XSDAnnotation self) {
        return new LinkedHashSet<Object>(self.getApplicationInformation());
    }
*/
    /*
     * In the context of an XSDAnnotation, creates and returns a new documentation org.w3c.dom.element using the containing
     * schema's document as the factory.
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static Object createUserInformation(final XSDAnnotation self, final String sourceURI) {
        final org.w3c.dom.Element userInfo = self.createUserInformation(defaultIfBlank(sourceURI, null));
        self.getElement().appendChild(userInfo);
        return userInfo;
    }
*/
    /*
     * In the context of an org.w3c.dom.Element, return all child org.w3c.dom.Elements
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static LinkedHashSet<Object> getElementElements(final Object self) {
        final org.w3c.dom.Element element = (org.w3c.dom.Element) self;
        final NodeList childNodes = element.getChildNodes();
        final LinkedHashSet<Object> childElements = new LinkedHashSet<>();
        for (int i = 0; i < childNodes.getLength(); i++) {
            final Node childNode = childNodes.item(i);
            if (childNode instanceof org.w3c.dom.Element) {
                childElements.add(childNode);
            }
        }
        return childElements;
    }
*/
    /*
     * In the context of an org.w3c.dom.Element, return the text content.
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getXSDElementValue(final Object self) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
*/
    /*
     * In the context of an org.w3c.dom.Element, return the name.
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getElementName(final Object self) {
        final org.w3c.dom.Element element = (org.w3c.dom.Element) self;
        final String theNodeName = element.getNodeName();
        return theNodeName;
    }
*/
    /*
     * In the context of an org.w3c.dom.Element, return the namespace.
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getElementNamespace(final Object self) {
        final org.w3c.dom.Element element = (org.w3c.dom.Element) self;
        final String namespaceURI = element.getNamespaceURI();
        return namespaceURI;
    }
*/
    /*
     * In the context of an org.w3c.dom.Element, set the textContent to provided value.
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setTextContent(final Object self, final String value) {
        final org.w3c.dom.Element userInfo = (org.w3c.dom.Element) self;
        userInfo.appendChild(userInfo.getOwnerDocument().createTextNode(value));
    }
*/
    /*
     * in the context of an org.w3c.dom.Element, commit any changes to Element or its components (if necessary)
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void commitInformation(final Object self) {
        // no-op
    }
*/
    /*
     * in the context of an XSDAnnotation, create or update an applicationInformation element, for the given name within the
     * NIEM appinfo2 namespace, setting its textual content to the provided value
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setAppinfo2Element(final XSDAnnotation self, final String value, final XSDSchema owningSchema,
            final String name) {
        final String qualifiedName = prefix(name, APPINFO2_NAMESPACE);
        setContent(getOrCreateAppinfoElement(self, qualifiedName), value);
    }
*/
    /*
     * in the context of an XSDAnnotation, create or update an applicationInformation element, for the given name within the
     * NIEM appinfo namespace, setting its textual content to the provided value
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setAppinfoElementValue(final XSDAnnotation self, final String value, final String name) {
        final String qualifiedName = prefix(name, APPINFO_NAMESPACE);
        setContent(getOrCreateAppinfoElement(self, qualifiedName), value);
    }
*/
    /*
     * in the context of an XSDAnnotation, create or update an applicationInformation element, for the given elementName
     * within the NIEM appinfo namespace, set the appinfo:name attribute to the provided name and set the appinfo:namespace
     * to the provided namespace in the case of elementName='AppliesTo', always add an element; in all other cases, replace
     * content of any existing element matching elementName (or add new element if no match)
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setAppinfoElement(final XSDAnnotation self, final String elementName, final String name,
            final String namespace) {
        final String qualifiedName = prefix(elementName, APPINFO_NAMESPACE);
        final String nameTag = prefix("name", APPINFO_NAMESPACE);
        final String namespaceTag = prefix("namespace", APPINFO_NAMESPACE);
        final org.w3c.dom.Element element = "AppliesTo".equals(elementName) ? createAppinfoElement(self, qualifiedName)
                : getOrCreateAppinfoElement(self, qualifiedName);
        setAttribute(setAttribute(element, nameTag, name), namespaceTag, namespace);
    }

    private static String prefix(final String tag, final String namespace) {
        return org.ijis.gra.uml.library.Activator.INSTANCE.toPrefix(namespace) + ":" + tag;
    }
*/
    /*
     * in the context of an org.w3c.dom.Element return the value of the appinfo:name attribute
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getAppInfoName(final Object self) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
*/
    /*
     * in the context of an org.w3c.dom.Element return the value of the appinfo:namespace attribute
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getAppInfoNamespace(final Object self) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
*/
    /*
     * in the context of an org.w3c.dom.Element, return whether or not there is an appinfo:namespace attribute
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Boolean hasAppinfoNamespaceAttribute(final Object self, final String name) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
*/
    /*
     * in the context of an org.w3c.dom.Element, return whether or not there is an appinfo:name attribute
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Boolean hasAppinfoNameAttribute(final Object self, final String name) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
*/
    /*
     * in the context of an XSDAnnotation, map the textual content of UserInformation to the body of a new Comment and append
     * the new Comment to the ownedComments of the owner
     */
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static Boolean mapXSDAnnotation(final XSDAnnotation self, final Element owner) {
        final Iterator<org.w3c.dom.Element> elements = self.getUserInformation().iterator();
        if (elements.hasNext()) {
            final Comment theComment = UMLFactory.eINSTANCE.createComment();
            final StringBuilder b = new StringBuilder();
            b.append(elements.next().getTextContent());
            while (elements.hasNext()) {
                b.append('\n');
                b.append(elements.next().getTextContent());
            }
            theComment.setBody(b.toString());
            owner.getOwnedComments().add(theComment);
            return true;
        }
        return false;
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static EObject getSchemaAtRelativeUri(final EObject self, final String relativeURI) {
        final Resource theMPDResource = self.eResource();
        return theMPDResource.getResourceSet()
                .getResource(appendPath(theMPDResource.getURI().trimSegments(1), relativeURI), true).getContents().get(0);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setFileSetTypeDescriptionText(final EObject self, final String descriptionText) {
        setStereotypeValue(self, "descriptionText", descriptionText);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setFileSetTypeExternalURI(final EObject self, final String externalURI) {
        setStereotypeValue(self, "externalURI", externalURI);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdVersionID(final EObject self, final String mpdVersionID) {
        setMPDVersionID(getBaseElement(self), mpdVersionID);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdBaseURI(final EObject self, final String mpdBaseURI) {
        setMPDBaseURI(getBaseElement(self), mpdBaseURI);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdDescriptionText(final EObject self, final String descriptionText) {
        setMPDDescription(getBaseElement(self), descriptionText);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdSecurityMarkingText(final EObject self, final String securityMarkingText) {
        setMPDSecurityMarking(getBaseElement(self), securityMarkingText);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdCreationDate(final EObject self, final String creationDate) {
        setMPDCreationDate(getBaseElement(self), creationDate);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdStatusText(final EObject self, final String statusText) {
        setMPDStatusText(getBaseElement(self), statusText);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdKeywordText(final EObject self, final List<String> keywordText) {
        setMPDKeywords(getBaseElement(self), keywordText);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdDomainText(final EObject self, final List<String> domainText) {
        setMPDDomains(getBaseElement(self), domainText);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdPurposeText(final EObject self, final List<String> PurposeText) {
        setMPDPurpose(getBaseElement(self), PurposeText);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdExchangePatternText(final EObject self, final List<String> ExchangePatternText) {
        setMPDExchangePatternText(getBaseElement(self), ExchangePatternText);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdExchangePartnerName(final EObject self, final List<String> exchangePartnerName) {
        setMPDExchangePartnerName(getBaseElement(self), exchangePartnerName);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdASName(final EObject self, final String asName) {
        setMPDAuthoritativeSourceName(getBaseElement(self), asName);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdASAddressText(final EObject self, final String asAddressText) {
        setMPDAuthoritativeSourceAddress(getBaseElement(self), asAddressText);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdASWebSiteURL(final EObject self, final String asWebSiteURL) {
        setMPDAuthoritativeSourceWebsiteURL(getBaseElement(self), asWebSiteURL);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setPOCPOCName(final EObject self, final String pocName) {
        setMPDPointOfContactName(self, pocName);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setPOCPOCEmail(final EObject self, final List<String> pocEmail) {
        setMPDPointOfContactEmailAddresses(self, pocEmail);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setPOCPOCTelephone(final EObject self, final List<String> pocTelephone) {
        setMPDPointOfContactPhoneNumbers(self, pocTelephone);
    }

    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void setMpdPackageCode(final EObject self, final String packageCode) {
        setMPDPackageCode(getBaseElement(self), packageCode);
    }

    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static EObject getMpdPocList(final EObject self) { // misnomer - this really returns the mpd stereotype
                                                              // application itself
        return self;
    }

    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static EObject createPocInstance(final EObject self) {
        final List<EObject> pointsOfContact = getMPDPointsOfContact(getBaseElement(self));
        final EObject thePOC = createPOC(getBaseElement(self));
        pointsOfContact.add(thePOC);
        return thePOC;
    }

    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<Profile> getNIEMProfiles(final Model self) {
        return new ArrayList<>(EcoreUtil.<Profile> getObjectsByType(
                ((Package) getNiemUmlProfile(self.eResource().getResourceSet()).getContents().get(0)).getNestedPackages(),
                UMLPackage.Literals.PROFILE));
    }

    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Model getNIEMXmlLibrary(final Model self) {
        return (Model) getXmlPrimitiveTypes(self.eResource().getResourceSet()).getContents().get(0);
    }
*/
    /*
     * 
     * 
     * self.getArtifactGroup().add(CatPackage.Literals.DOCUMENT_ROOT__FILE_SET, folder); }
     * 
     * @Operation(contextual = true, kind = Operation.Kind.HELPER) public static void addCatalogFolder(final CatalogType
     * self, final FolderType folderIn) { self.getArtifactGroup().add(CatPackage.Literals.DOCUMENT_ROOT__FOLDER, folderIn); }
     * 
     * @Operation(contextual = true, kind = Operation.Kind.HELPER) public static void addCatalogFile(final CatalogType self,
     * final FileType fileIn) { self.getArtifactGroup().add(CatPackage.Literals.DOCUMENT_ROOT__FILE, fileIn);
     */
/*
    private static String uriFromEnumerationLiteral(final EnumerationLiteral stereotypeValue, final String type) {
        return stereotypeValue == null ? null : BASE_MPD_NAMESPACE + type + "#"
                + stereotypeValue.getName().replaceAll("_", "-");
    }

    private static EEnumLiteral fromURI(final EObject stereotypeApplication, final String structuralFeatureName,
            final String uri) {
        if (uri == null) {
            return null;
        }
        final int index = uri.indexOf('#');
        return index < 0 || index == uri.length() - 1 ? null : fromName(stereotypeApplication, structuralFeatureName,
                uri.substring(index + 1));
    }

    private static EEnumLiteral fromName(final EObject stereotypeApplication, final String structuralFeatureName,
            final String name) {
        return ((EEnum) stereotypeApplication.eClass().getEStructuralFeature(structuralFeatureName).getEType())
                .getEEnumLiteral(name.replaceAll("-", "_"));
    }
    */
    protected static EObject getAtRelativeURI(final EObject eObject, final String relativeURI,String contentType) throws IOException {
        Resource myResource=eObject.eResource();
        ResourceSet resourceSet=myResource.getResourceSet();
        URI myURI=myResource.getURI();
        URI schemaURI=URI.createURI(relativeURI.replace("\\", "/")).resolve(myURI);
        // check if resource already loaded
        Resource catResource=resourceSet.getResource(schemaURI, false);
        // if not, create the Resource with the given contentType
        if(catResource==null){
        	catResource=resourceSet.createResource(schemaURI, contentType);
        }
        System.out.println("getAtRelativeURI "+catResource.getURI()+", "+schemaURI+", "+relativeURI+", "+myURI);
        Map options=new HashMap();
        catResource.load(options);
        return catResource.getContents().get(0);
    }
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static EObject getWsdlSchemaAtRelativeURI(final EObject eObject, final String relativeURI) throws IOException {
    	return getAtRelativeURI(eObject,relativeURI,"xsd");
    }
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static EObject getCatalogAtRelativeURI(final EObject eObject, final String relativeURI) throws IOException {
    	return getAtRelativeURI(eObject,relativeURI,"mpdcat");
    }
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static EObject getWsdlAtRelativeURI(final EObject eObject, final String relativeURI) throws IOException {
    	EObject result= getAtRelativeURI(eObject,relativeURI,"wsdl");
    	// resolve any wsdl imports
    	if(result instanceof Definition){
    		Definition definition=(Definition)result;
    		for(Object test:definition.getEImports()){
    			if(test instanceof Import){
    				Import wsdlImport=(Import)test;
    				if(wsdlImport.getEDefinition()==null){
    					EObject testDefinition=getWsdlAtRelativeURI(result,wsdlImport.getLocationURI());
    					if((testDefinition!=null)&&(testDefinition instanceof Definition)){
    						wsdlImport.setEDefinition((Definition)testDefinition);
    					}
    				}
    			}
    		}
    	}
    	return result;
    }
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static EObject getMetadataAtRelativeURI(final EObject eObject, final String relativeURI) throws IOException {
    	return getAtRelativeURI(eObject,relativeURI,"metadata");
    }
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void addTagValue(Object any,EObject appliedStereotype,String tagName) throws IOException {
    	EStructuralFeature feature=structuralFeature(appliedStereotype,tagName);
    	if(feature==null)return;
    	Collection values=(Collection)appliedStereotype.eGet(feature);
    	if(values==null){
    		LOG.error("Failed to get collection for tag "+tagName+", in "+appliedStereotype);
    		return;
    	}
    	values.add(any);
    	//appliedStereotype.eSet(feature,values);
    } 
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static EList getTagValues(EObject appliedStereotype,String tagName) throws IOException {
    	EStructuralFeature feature=structuralFeature(appliedStereotype,tagName);
    	return (EList)appliedStereotype.eGet(feature);
    } 
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static Object toUmlType(Object type) {
    	if(type instanceof BigInteger){
    		type=((BigInteger)type).intValue();
    	}
    	return type;
    } 
    /*
    @Operation(contextual = true, kind = Operation.Kind.HELPER)
    public static void getTagValue(Object any,EObject appliedStereotype,String tagName) throws IOException {
    	EStructuralFeature feature=structuralFeature(appliedStereotype,tagName);
    	Collection values=(Collection)appliedStereotype.eGet(feature);
    	values.add(any);
    	appliedStereotype.eSet(feature,values);
    } 
    */
    static protected EStructuralFeature structuralFeature(EObject appliedStereotype,String tagName){
    	for(EStructuralFeature feature:appliedStereotype.eClass().getEAllStructuralFeatures()){
    		if(tagName.equals(feature.getName()))return feature;
    	}
    	LOG.error("Failed to resolve feature "+tagName+" in "+appliedStereotype);
    	return null;
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<Profile> getNIEMGraProfiles(final Model self) {
    	List<Profile> existingProfiles=new Vector<Profile>();
    	TreeIterator<EObject> tree=self.eAllContents();//eResource().getAllContents();
    	boolean foundNiem=false;
    	while(tree.hasNext()){
    		EObject test=tree.next();
    		if(test instanceof ProfileApplication){
    			ProfileApplication profileApplication=(ProfileApplication)test;
    			Profile profile=profileApplication.getAppliedProfile();
    			existingProfiles.add(profile);
    			if("NIEM_PIM_Profile".equals(profile.getName()))foundNiem=true;
    		}
    	}
    	if(foundNiem)return existingProfiles;
        return new ArrayList<>(EcoreUtil.<Profile> getObjectsByType(
                ((Package) getNiemUmlProfile(self.eResource().getResourceSet()).getContents().get(0)).getNestedPackages(),
                UMLPackage.Literals.PROFILE));
    }
    protected static Resource getNiemUmlProfile(final ResourceSet resourceSet) {
        return resourceSet.getResource(URI.createURI("http://www.omg.org/spec/NIEM-UML/20120501/NIEM_UML_Profile"), true);
    }
    
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Package getGRAAnnotationPackage(final Model self) {
    	// get the resource from model or via resource
    	TreeIterator<EObject> tree=self.eAllContents();//eResource().getAllContents();
    	while(tree.hasNext()){
    		EObject test=tree.next();
    		if(test instanceof PackageImport){
    			PackageImport packageImport=(PackageImport)test;
    			Package p=packageImport.getImportedPackage();
    			if(p!=null)return p;
    		}
    	}
    	ResourceSet resourceSet=self.eResource().getResourceSet();
    	Resource graResource=getGraAnnotationModel(resourceSet);
    	if(graResource!=null){
    		for(EObject test:graResource.getContents()){
    			if(test instanceof Package){
		    		for(Package nestedTest:((Package)test).getNestedPackages())   {
		    			if("GRAUML".equals(nestedTest.getName())){
		    				return nestedTest;
		    			}
		    		}
		    	}
    		}
    	}else{
    		LOG.error("Failed to retrieve GRA Annotation Model resource");
    		
    	};
    		LOG.error("Failed to resolve GRA Annotation Model");
        return null;
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<Profile> getGRAProfiles(final Model self) {
    	Collection<Profile> profiles=new Vector<Profile>();
    	// better check if profiles coming in from Magic Draw, which will be different than plug-in versions
    	
    	Set<Profile> existingProfiles=new HashSet<Profile>();
    	TreeIterator<EObject> tree=self.eAllContents();//eResource().getAllContents();
    	boolean foundGra=false;
    	boolean foundWsdl=false;
    	boolean foundSoa=false;
    	while(tree.hasNext()){
    		EObject test=tree.next();
    		if(test instanceof ProfileApplication){
    			ProfileApplication profileApplication=(ProfileApplication)test;
    			Profile profile=profileApplication.getAppliedProfile();
    			existingProfiles.add(profile);
    			if("GRA".equals(profile.getName()))foundGra=true;
    			if("GRAProfile".equals(profile.getName()))foundGra=true;
    			if("SoaML Profile".equals(profile.getName()))foundSoa=true;
    			if("NIEM_SoaML_WSDL_Profile".equals(profile.getName()))foundWsdl=true;
    		}
    	}
    	profiles.addAll(existingProfiles);	
    	System.out.println("getGRAProfiles "+foundGra+", "+foundSoa+", "+foundWsdl);
    	ResourceSet resourceSet=self.eResource().getResourceSet();
    	if(!foundGra){
    	Resource graResource=getGraUmlProfile(resourceSet);
    	if(graResource!=null){
    		for(EObject test:graResource.getContents()){
    			if(test instanceof Package){
		    		profiles.addAll(EcoreUtil.<Profile> getObjectsByType(((Package)test).getNestedPackages(),
		                UMLPackage.Literals.PROFILE));
		    		for(Package nestedTest:((Package)test).getNestedPackages())   {
			    		profiles.addAll(EcoreUtil.<Profile> getObjectsByType(nestedTest.getNestedPackages(),
				                UMLPackage.Literals.PROFILE));
		    		}
		    	}
    		}
    	}else{
    		LOG.error("Failed to retrieve GRA UML Profile");
    	}
    	}
    	if(!foundWsdl){
    	Resource wsdlResource=getGraWsdlUmlProfile(resourceSet);
    	if(wsdlResource!=null){
    		for(EObject test:wsdlResource.getContents()){
    			if(test instanceof Package){
    				profiles.addAll(EcoreUtil.<Profile> getObjectsByType(((Package)test).getNestedPackages(),
    		                UMLPackage.Literals.PROFILE));
    			}
    		}
    	}
    	}
    	if(!foundSoa){
    	Resource soamlResource=getSoamlUmlProfile(resourceSet);
    	if(soamlResource!=null){
    		profiles.add((Profile)soamlResource.getContents().get(0));
    	}
    	}
        return new ArrayList<>(profiles);
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static Model getGRAPolicyExtension(final Model self) {
    	Model result=null;
    	ResourceSet resourceSet=self.eResource().getResourceSet();
    	Resource graResource=getGRAPolicyExtension(resourceSet);
    	if(graResource!=null){
    		for(EObject test:graResource.getContents()){
    			if(test instanceof Model){
    				for(Model model:EcoreUtil.<Model> getObjectsByType(((Model)test).getNestedPackages(),
    		                UMLPackage.Literals.MODEL)){
    					if("PolicyExtension".equals(model.getName())){
    						result=model;
    						break;
    					}
    				}
    			}
    			if(result!=null)break;
    		}
    	}
        return result;
    }
    protected static Resource getGRAPolicyExtension(final ResourceSet resourceSet) {
	try{
    return resourceSet.getResource(URI.createURI("http://www.omg.org/spec/GRA-UML/20120501/GRA-ProfileExtension"), true);
	}catch(Exception ignore){
		
	}
	return null;
}
    
        protected static Resource getGraWsdlUmlProfile(final ResourceSet resourceSet) {
    	try{
        return resourceSet.getResource(URI.createURI("http://www.omg.org/spec/GRA-UML/20120501/GRA-WSDL"), true);
    	}catch(Exception ignore){
    		
    	}
    	return null;
    }
        
        protected static Resource getGraAnnotationModel(final ResourceSet resourceSet) {
        	try{
            return resourceSet.getResource(URI.createURI("http://www.omg.org/spec/GRA-UML/20120501/GRA"), true);
        	}catch(Exception ignore){
        		LOG.error("Failed to get GRA Annotation Model "+ignore);
        	}
        	return null;
        }
    protected static Resource getGraUmlProfile(final ResourceSet resourceSet) {
    	try{
        return resourceSet.getResource(URI.createURI("http://www.omg.org/spec/GRA-UML/20120501/GRA"), true);
    	}catch(Exception ignore){
    		LOG.error("Failed to get GRA Resource "+ignore);
    	}
    	return null;
    }
    protected static Resource getSoamlUmlProfile(final ResourceSet resourceSet) {
    	try{
        return resourceSet.getResource(URI.createURI("http://www.omg.org/spec/SoaML/20091101/SoaMLProfile.xmi"), true);
    	}catch(Exception ignore){
    		LOG.error("Failed to get Soaml Profile Resource "+ignore);
    	}
    	return null;
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getMessageQNameLocalPart(final Message self) {
    	return self.getQName().getLocalPart();
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getPortTypeQNameLocalPart(final PortType self) {
    	return self.getQName().getLocalPart();
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<XSDSchema> getWsdlSchemas(final Types self) {
    	return self.getSchemas();
    }
    /*
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getPortQNameLocalPart(final Port self) {
    	return self.getQName().getLocalPart();
    }
    */
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getBindingQNameLocalPart(final Binding self) {
    	return self.getQName().getLocalPart();
    }
    /*
     * In the context of an org.w3c.dom.Element, return the local name.
     */
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getElementLocalName(final Object self) {
        final org.w3c.dom.Element element = (org.w3c.dom.Element) self;
        final String theNodeName = element.getLocalName();
        return theNodeName;
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getAttrLocalName(final Object self) {
        final org.w3c.dom.Attr element = (org.w3c.dom.Attr) self;
        final String theNodeName = element.getLocalName();
        return theNodeName;
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getAttrNamespaceURI(final Object self) {
        final org.w3c.dom.Attr element = (org.w3c.dom.Attr) self;
        final String theNodeName = element.getNamespaceURI();
        return theNodeName;
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getElementNamespaceURI(final Object self) {
        final org.w3c.dom.Element element = (org.w3c.dom.Element) self;
        final String theNodeName = element.getNamespaceURI();
        return theNodeName;
    }
    
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getExtensibilityElementQNameLocalPart(final ExtensibilityElement self) {
    	return self.getElement().getLocalName();
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getExtensibilityElementQNameNamespaceURI(final ExtensibilityElement self) {
    	return self.getElement().getNamespaceURI();
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getServiceQNameLocalPart(final Service self) {
    	return self.getQName().getLocalPart();
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getAttributeValue(final Object self,String name) {
    	return ((org.w3c.dom.Element)self).getAttribute(name);
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getAttributeValue(final Object self) {
    	return ((org.w3c.dom.Attr)self).getValue();
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static List<Object> getAttributes(final Object self) {
    	NamedNodeMap map=((org.w3c.dom.Element)self).getAttributes();
    	List<Object> result=new Vector<Object>();
    	for(int i=0;i<map.getLength();i++){
    		Node node=map.item(i);
    		if(node instanceof Attr){
    			result.add((Attr)node);
    		}
    	}
    	return result;
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String getAttributeNSValue(final Object self,String namespaceURI,String localName) {
    	if((namespaceURI!=null)&&(namespaceURI.length()==0))namespaceURI=null;
    	return ((org.w3c.dom.Element)self).getAttributeNS(namespaceURI, localName);
    }
    
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static ExtensibilityElement getReferencedExtensibilityElement(ExtensibilityElement self,String namespaceURI,String localName) {
    	return getReferencedExtensibilityElementFromElement(self,self.getElement(),namespaceURI,localName);
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static ExtensibilityElement getReferencedExtensibilityElementFromElement(EObject context,Object element,String namespaceURI,String localName) {
    	org.w3c.dom.Element self=(org.w3c.dom.Element)element;
    	String id=getAttributeNSValue(self,namespaceURI,localName);
    	if(id==null)return null;
    	if(id.startsWith("#"))id=id.substring(1);
    	
    	// the other way to do it is to search for the element with the id in the extensibility elements
    	
    	//TreeIterator<EObject> contents=self.eResource().getAllContents();
    	
    	ExtensibilityElement result=null;
		for(EObject test:context.eResource().getContents()){
			if(test instanceof WSDLElement){
				ExtensibilityElement ee=getReferencedExtensibilityElement((WSDLElement)test,id);
				if(ee!=null){
					result=ee;
					break;
				}
			}
		}
    	System.out.println("getReferencedExtensibleElement "+result+", "+id+", "+namespaceURI+", "+localName+", "+self);
    	return result;
    }
    
    protected static ExtensibilityElement getReferencedExtensibilityElement(WSDLElement context,String id) {
    	if(context instanceof Import){
    		Import importContext=(Import)context;
    		if(importContext.getEDefinition()==null){
    			//importContext.updateElement();// does nothing
    		}
    		//System.out.println("getReferencedExtensibilityElement "+importContext.getEDefinition());
    		return getReferencedExtensibilityElement(importContext.getEDefinition(),id);
    	}else if(context instanceof ExtensibleElement){
    		for(EObject test:((ExtensibleElement)context).eContents()){
    			if(test instanceof WSDLElement){
    				ExtensibilityElement ee=getReferencedExtensibilityElement((WSDLElement)test,id);
    				if(ee!=null)return ee;
    			}
    		}
    	}else if(context instanceof ExtensibilityElement){
			ExtensibilityElement ee=(ExtensibilityElement)context;
			org.w3c.dom.Element elementTest=ee.getElement();
			if(elementTest!=null){
				//wsu:Id="rss-rm-policy"
				String wsuid=getAttributeNSValue(elementTest,"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd","Id");
				if(id.equals(wsuid)){
					return ee;
				}
			}
    		for(EObject test:ee.eContents()){
    			if(test instanceof WSDLElement){
    				ExtensibilityElement test2=getReferencedExtensibilityElement((WSDLElement)test,id);
    				if(test2!=null)return test2;
    			}
    		}
    		
    	}
    	return null;
    }
    /*
    protected static org.w3c.dom.Element getReferencedElement(org.w3c.dom.Element self,String namespaceURI,String localName) {
    	String id=getAttributeNSValue(self,namespaceURI,localName);
    	if(id==null)return null;
    	if(id.startsWith("#"))id=id.substring(1);
    	Document document=((org.w3c.dom.Element)self).getOwnerDocument();
    	return document.getElementById(id);
    }
    */
    /*
     * Return the location of the XSDSchema, relative to the root directory of the target Spp
     */

    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String relativeSppLocation(final XSDSchema self) {
    	return relativeSppFilePath(self);
    }
    @Operation(contextual = true, kind = Operation.Kind.QUERY)
    public static String relativeSppFilePath(final EObject self) {
        final URI theSchemaURI = self.eResource().getURI();
        final File theSchemaFile;
        if (theSchemaURI.isPlatformResource()) {
            final String platformRelativePath = theSchemaURI.toPlatformString(true);
            theSchemaFile = ResourcesPlugin.getWorkspace().getRoot()
                    .findMember(Path.fromPortableString(platformRelativePath)).getLocation().toFile();
        } else {
            theSchemaFile = new File(theSchemaURI.toFileString());
        }
        File theParentDirectory = theSchemaFile.getParentFile();
        while (theParentDirectory != null) {
            if (containsASppCatalog(theParentDirectory)) {
                break;
            }
            theParentDirectory = theParentDirectory.getParentFile();
        }
        final String theRelativePath = theParentDirectory.toPath().relativize(theSchemaFile.toPath()).toString();
        return theRelativePath;
    }
    private static boolean containsASppCatalog(final File theParentDirectory) {
    	/*
        final String[] catalogFileExtensions = getCatalogFileExtensions();
        for (int i = 0; i < catalogFileExtensions.length; i++) {
            catalogFileExtensions[i] = "." + catalogFileExtensions[i].toLowerCase();
        }
        */
        final File[] files = theParentDirectory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(final File dir, final String name) {
                final String lowerCaseName = name.toLowerCase();
                return "catalog.xml".equals(lowerCaseName);
            }
        });
        for (final File f : files) {
            if (isASppCatalog(f)) {
                return true;
            }
        }
        return false;
    }
    static protected boolean isASppCatalog(File f){
    	//TODO
    	return true;
    }
    @Operation(contextual=true)
    static public void setQName(Message definition,Definition def,String name) {
//    	String namespaceURI=getTargetNamespace(definition.getEnclosingDefinition());
    	String namespaceURI=getTargetNamespace(def);
      QName qName=new QName(namespaceURI,name,"wsdltns");
      definition.setQName(qName);
    }
    @Operation(contextual=true)
    static public void setQName(PortType definition,Definition def,String name) {
    	String namespaceURI=getTargetNamespace(def);
        QName qName=new QName(namespaceURI,name,"wsdltns");
      definition.setQName(qName);
    }
    @Operation(contextual=true)
    static public void setQName(Service definition,Definition def,String name) {
    	String namespaceURI=getTargetNamespace(def);
        QName qName=new QName(namespaceURI,name,"wsdltns");
      definition.setQName(qName);
    }
    @Operation(contextual=true)
    static public void setQName(Binding definition,Definition def,String name) {
    	String namespaceURI=getTargetNamespace(def);
        QName qName=new QName(namespaceURI,name,"wsdltns");
      definition.setQName(qName);
    }
    @Operation(contextual=true)
    static public void setQName(Definition definition,String name) {
    	String namespaceURI=getTargetNamespace(definition);
        QName qName=new QName(namespaceURI,name,"wsdltns");
      definition.setQName(qName);
    }
    static protected String getTargetNamespace(Definition definition){
    	if(definition==null)return null;
    	String result=definition.getTargetNamespace();
    	//System.out.println("targetNamesapce "+result);
    	return result;
    }
    @Operation(contextual=true)
    static public void updateDocument(Definition definition) {
      // this is not sufficient, namespace still mishandled
    	//definition.addNamespace(arg0, arg1);
    	/*
        if(definition instanceof DefinitionImpl){
        	
        	for(Object test:((DefinitionImpl)definition).getENamespaces()){
        		if(test instanceof Namespace){
        			Namespace namespace=(Namespace)test;
        			((DefinitionImpl)definition).addNamespace(namespace.getPrefix(), namespace.getURI());
        		}
        		
        	}
        	
          ((DefinitionImpl)definition).updateDocument();
          //System.out.println("updateDocument "+definition.getDocument());
          definition.updateElement(true);
          //System.out.println("updateElement "+definition.getElement());
        }
*/
    }
    @Operation(contextual=true)
    static public void setElementAttribute(WSDLElement definition,String attributeName,String value) {
    	
      org.w3c.dom.Element element=getDomElement(definition);
      if(element==null){
        System.out.println("setElementAttribute FAILED to get Dom Element for WSDLElement "+definition+", attributeName="+attributeName+"="+value);
        return;
      }
      element.setAttribute(attributeName, value);
    }
    @Operation(contextual=true)
    static public void setElementAttribute(WSDLElement definition,String namespaceURI,String attributeName,String value) {
      org.w3c.dom.Element element=getDomElement(definition);
      if(element==null){
        System.out.println("setElementAttribute FAILED to get Dom Element for WSDLElement "+definition+","+namespaceURI+", attributeName="+attributeName+"="+value);
        return;
      }
      element.setAttributeNS(namespaceURI,attributeName, value);
    }
    @Operation(contextual=true)
    static public void setElementValue(WSDLElement definition,String value) {
      org.w3c.dom.Element element=getDomElement(definition);
      if(element==null){
        System.out.println("setElementValue FAILED to get Dom Element for WSDLElement "+definition+"="+value);
        return;
      }
      element.setTextContent(value);
    }
    static protected org.w3c.dom.Element getDomElement(WSDLElement wsdlelement) {
        org.w3c.dom.Element element=wsdlelement.getElement();
        if(element==null){
          try{
          wsdlelement.updateElement();
          }catch(Throwable ignore){
            ignore.printStackTrace();
          }
          element=wsdlelement.getElement();
        }
        return element;
      }
    @Operation(contextual=true)
    static public void setElementType(UnknownExtensibilityElement definition,String namespace,String name) {
      QName qName=new QName(namespace,name);
      definition.setElementType(qName);
    }
    @Operation(contextual=true)
    static public void updateElement(WSDLElement definition) {
      definition.updateElement();
      LOG.info("updateElement "+definition.getElement()+", "+definition.getEnclosingDefinition()+", "+definition);
    }
    @Operation(contextual=true)
    static public String getSchemaPrefix(XSDSchema xsdSchema) {
        String result="unknown";
        if(xsdSchema!=null)
        for(Entry<String, String> entry:xsdSchema.getQNamePrefixToNamespaceMap().entrySet()){
          if(entry.getValue().equals(xsdSchema.getTargetNamespace())){
            result=entry.getKey();
            break;
          }
        }
        return result;
    }
    
    @Operation(contextual=true)
    static public void setElementName(Part wsdlElement,XSDElementDeclaration xsdElement,Definition definition) {
//        QName qname=new QName(xsdElement.getTargetNamespace(), xsdElement.getName(),"tns");
    	String namespace=xsdElement.getTargetNamespace();
    	String localName=xsdElement.getName();
        //String elementQname=xsdElement.getQName();
        // is prefix there?
        XSDSchema schema=xsdElement.getSchema();
        String prefix=getSchemaPrefix(schema);
        
        QName qname=new QName(namespace, localName,prefix);
        definition.addNamespace(prefix, namespace);
        wsdlElement.setElementName(qname);
    }

    @Operation(contextual=true)
    static public void setTypeName(Part wsdlElement,XSDTypeDefinition xsdType,Definition definition) {
    	if(xsdType==null){
        	LOG.error("Invalid xsd type for part "+wsdlElement+", definition="+definition);
        	return;
    	}
    	String namespace=xsdType.getTargetNamespace();
    	String localName=xsdType.getName();
        // is prefix there?
        XSDSchema schema=xsdType.getSchema();
        if((namespace==null)&&(schema!=null)){
        	namespace=schema.getTargetNamespace();
        }
        String prefix=getSchemaPrefix(schema);
        
        QName qname=new QName(namespace, localName,prefix);
        definition.addNamespace(prefix, namespace);
        wsdlElement.setTypeName(qname);
        if((namespace==null)||(prefix==null)){
        	LOG.error("Invalid namespace "+namespace+", prefix="+prefix+", schema="+schema+", type="+xsdType);
        }
    }
    @Operation(contextual=true)
    static public String getLastSegmentGRA(String uriString) {
    	URI uri=URI.createURI(uriString);
    	String result=uri.lastSegment();
    	if((result==null)||(result.length()==0)){
    		result=uri.trimSegments(1).lastSegment();
    	}
    	return result;
    }    
}
