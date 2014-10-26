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
package org.ijis.gra.uml.merge;

import static org.apache.commons.lang.StringUtils.capitalize;
import static org.apache.commons.lang.StringUtils.isBlank;
import static org.apache.commons.lang.StringUtils.join;
import static org.eclipse.uml2.uml.util.UMLUtil.findNamedElements;
import static org.eclipse.uml2.uml.util.UMLUtil.getBaseElement;
import static org.ijis.gra.uml.util.CollectionExt.allAreNull;
import static org.ijis.gra.uml.util.CollectionExt.anyIsNull;
import static org.ijis.gra.uml.util.EcoreExt.get;
import static org.ijis.gra.uml.util.EcoreExt.getEClass;
import static org.ijis.gra.uml.util.EcoreExt.getNsURI;
import static org.ijis.gra.uml.util.EcoreExt.getPackage;
import static org.ijis.gra.uml.util.NIEMUmlExt.isNiemNamespace;
import static org.ijis.gra.uml.util.NIEMUmlExt.isXmlPrimitiveType;
import static org.ijis.gra.uml.util.UMLExt.getBody;
import static org.ijis.gra.uml.util.UMLExt.getClients;
import static org.ijis.gra.uml.util.UMLExt.getGeneral;
import static org.ijis.gra.uml.util.UMLExt.getMemberEnds;
import static org.ijis.gra.uml.util.UMLExt.getName;
import static org.ijis.gra.uml.util.UMLExt.getOwner;
import static org.ijis.gra.uml.util.UMLExt.getSuppliers;
import static org.ijis.gra.uml.util.UMLExt.getType;
import static org.ijis.gra.uml.util.UMLExt.isStereotypeApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.ijis.gra.uml.util.EcoreExt;
import org.ijis.gra.uml.util.UMLExt;

public class NamespaceMergeUtil {

    static final String normalize(final String referenceLibraryName, final EObject aPIMElement) {
        final StringBuilder theNormalizedName = new StringBuilder(getThePIMModelName(aPIMElement));
        final String[] segments = referenceLibraryName.split("-");
        for (final String segment : segments) {
            theNormalizedName.append(isTitleCase(segment) ? segment.toUpperCase() : capitalize(segment));
        }
        theNormalizedName.append("Subset");
        return theNormalizedName.toString();
    }

    private static String getThePIMModelName(final EObject aPIMElement) {
        return aPIMElement.eResource().getURI().trimFileExtension().lastSegment();
    }

    private static boolean isTitleCase(final String word) {
        return "niem".equalsIgnoreCase(word);
    }

    public static Collection<Element> mapEquivalents(final Collection<EObject> referenceLibraryElements,
            final Package inThePIM) {
        final Collection<Element> pimEquivalents = new ArrayList<>();

        Namespace theCurrentOwner = null;
        Namespace theEquivalentOwnerInThePIM = null;
        for (final EObject visibleElement : referenceLibraryElements) {
            final Namespace theOwner = getOwner(visibleElement);
            if (theOwner != theCurrentOwner) {
                theCurrentOwner = theOwner;
                theEquivalentOwnerInThePIM = findEquivalent(theOwner, inThePIM);
            }
            if (theEquivalentOwnerInThePIM == null) {
                continue;
            }
            final NamedElement theElement = theEquivalentOwnerInThePIM.getMember(getName(visibleElement), false,
                    getEClass(visibleElement));
            if (theElement != null) {
                pimEquivalents.add(theElement);
            }
        }

        return pimEquivalents;
    }

    public static <T extends EObject> T findEquivalent(final T referenceLibraryElement, final Package inThePIM) {
        if (referenceLibraryElement == null) {
            return null;
        }
        if (isStereotypeApplication(referenceLibraryElement)) {
            @SuppressWarnings("unchecked")
            final T equivalentStereotypeApplication = (T) findEquivalentStereotypeApplication(referenceLibraryElement,
                    inThePIM);
            return equivalentStereotypeApplication;
        }
        if (!isBlank(UMLExt.getName(referenceLibraryElement)) && theNameIsUnique((NamedElement) referenceLibraryElement)) {
            return findEquivalentNamedElement(namespaceRelativePath(new LinkedList<EObject>(), referenceLibraryElement),
                    inThePIM);
        }
        final EObject inTheEquivalentParent = findEquivalent(getOwner(referenceLibraryElement), inThePIM);
        if (inTheEquivalentParent == null) {
            return null;
        }
        return findImmediatelyContainedEquivalent(referenceLibraryElement, inTheEquivalentParent, inThePIM);
    }

    private static <T extends NamedElement> T findEquivalentNamedElement(final List<EObject> ontheNamespaceRelativePath,
            final Package inThePIM) {
        final List<String> nameSegments = new ArrayList<>(ontheNamespaceRelativePath.size() + 1);
        nameSegments.add(inThePIM.getQualifiedName());
        final Iterator<EObject> segments = ontheNamespaceRelativePath.iterator();
        nameSegments.add(normalize(UMLExt.getName(segments.next()), inThePIM));
        while (segments.hasNext()) {
            nameSegments.add(UMLExt.getName(segments.next()));
        }
        final String qualifiedName = join(nameSegments, NamedElement.SEPARATOR);
        final Collection<T> matches = findNamedElements(inThePIM.eResource(), qualifiedName, false,
                ontheNamespaceRelativePath.get(ontheNamespaceRelativePath.size() - 1).eClass());
        if (matches.isEmpty()) {
            return null;
        }
        if (matches.size() > 1) {
            Activator.INSTANCE.log("Ambiguous matches found for element " + qualifiedName);
        }
        return matches.iterator().next();
    }

    private static EObject findEquivalentStereotypeApplication(final EObject referenceLibraryElement, final Package inThePIM) {
        final Element pimEquivalentBaseElement = findEquivalent(getBaseElement(referenceLibraryElement), inThePIM);
        if (pimEquivalentBaseElement == null) {
            return null;
        }
        final Collection<EObject> equivalencies = new ArrayList<>();
        for (final EObject pimStereotypeApplication : pimEquivalentBaseElement.getStereotypeApplications()) {
            if (classesAreTheSame(referenceLibraryElement, pimStereotypeApplication)) {
                equivalencies.add(pimStereotypeApplication);
            }
        }
        if (equivalencies.isEmpty()) {
            return null;
        }
        if (equivalencies.size() > 1) {
            Activator.INSTANCE.log("Ambiguous matches found for stereotype application " + referenceLibraryElement);
        }
        return equivalencies.iterator().next();
    }

    private static <T extends EObject> T findEquivalent(final T referenceLibraryElement,
            final Collection<T> inThePIMContents, final Package inThePIM) {
        final Collection<T> equivalencies = new ArrayList<>();
        for (final T aPIMElement : EcoreUtil.<T> getObjectsByType(inThePIMContents, referenceLibraryElement.eClass())) {
            if (areEquivalent(referenceLibraryElement, aPIMElement, inThePIM)) {
                equivalencies.add(aPIMElement);
            }
        }
        if (equivalencies.isEmpty()) {
            return null;
        }
        if (equivalencies.size() > 1) {
            Activator.INSTANCE.log("Ambiguous matches found for element " + referenceLibraryElement);
        }
        return equivalencies.iterator().next();
    }

    private static <T extends EObject> T findImmediatelyContainedEquivalent(final T referenceLibraryElement,
            final EObject inThePIMElement, final Package inThePIM) {
        final EStructuralFeature feature = referenceLibraryElement.eContainingFeature();
        if (!inThePIMElement.eIsSet(feature)) {
            return null;
        }
        if (feature.isMany()) {
            return findEquivalent(referenceLibraryElement, EcoreExt.<T> getMany(feature, inThePIMElement), inThePIM);
        }
        final T child = get(feature, inThePIMElement);
        if (areEquivalent(referenceLibraryElement, child, inThePIM)) {
            return child;
        }
        return null;
    }

    private static boolean areEquivalent(final EObject aReferenceLibraryElement, final EObject aPIMElement,
            final Package inThePIM) {
        /* @formatter:off */ 
        return allAreNull(aReferenceLibraryElement, aPIMElement) || 
                !anyIsNull(aReferenceLibraryElement, aPIMElement)
                && classesAreTheSame(aReferenceLibraryElement, aPIMElement)
                && namesAreTheSame(aReferenceLibraryElement, aPIMElement)
                && bodiesAreTheSame(aReferenceLibraryElement, aPIMElement)
                && typesAreEquivalent(aReferenceLibraryElement, aPIMElement, inThePIM)
                && memberEndsAreEquivalent(aReferenceLibraryElement, aPIMElement, inThePIM)
                && clientsAreEquivalent(aReferenceLibraryElement, aPIMElement, inThePIM)
                && suppliersAreEquivalent(aReferenceLibraryElement, aPIMElement, inThePIM)
                && generalsAreEquivalent(aReferenceLibraryElement, aPIMElement, inThePIM);
        /* @formatter:on */
    }

    private static boolean generalsAreEquivalent(final EObject aReferenceLibraryElement, final EObject aPIMElement,
            final Package inThePIM) {
        final Classifier referenceLibraryGeneral = getGeneral(aReferenceLibraryElement);
        final Classifier pimElementGeneral = getGeneral(aPIMElement);
        return isXmlPrimitiveType(referenceLibraryGeneral) ? areEqual(UMLExt.getName(referenceLibraryGeneral),
                UMLExt.getName(pimElementGeneral)) : findEquivalent(referenceLibraryGeneral, inThePIM) == pimElementGeneral;
    }

    private static boolean clientsAreEquivalent(final EObject aReferenceLibraryElement, final EObject aPIMElement,
            final Package inThePIM) {
        final List<NamedElement> referenceLibraryClients = getClients(aReferenceLibraryElement);
        final List<NamedElement> pimClients = getClients(aPIMElement);
        if (referenceLibraryClients.size() != pimClients.size()) {
            return false;
        }
        for (int i = 0; i < referenceLibraryClients.size(); i++) {
            if (findEquivalent(referenceLibraryClients.get(i), inThePIM) != pimClients.get(i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean suppliersAreEquivalent(final EObject aReferenceLibraryElement, final EObject aPIMElement,
            final Package inThePIM) {
        final List<NamedElement> referenceLibrarySuppliers = getSuppliers(aReferenceLibraryElement);
        final List<NamedElement> pimSuppliers = getSuppliers(aPIMElement);
        if (referenceLibrarySuppliers.size() != pimSuppliers.size()) {
            return false;
        }
        for (int i = 0; i < referenceLibrarySuppliers.size(); i++) {
            if (findEquivalent(referenceLibrarySuppliers.get(i), inThePIM) != pimSuppliers.get(i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean memberEndsAreEquivalent(final EObject aReferenceLibraryElement, final EObject aPIMElement,
            final Package inThePIM) {
        final List<Property> referenceLibraryMemberEnds = getMemberEnds(aReferenceLibraryElement);
        final List<Property> pimMemberEnds = getMemberEnds(aPIMElement);
        if (referenceLibraryMemberEnds.size() != pimMemberEnds.size()) {
            return false;
        }
        for (int i = 0; i < referenceLibraryMemberEnds.size(); i++) {
            if (!areEquivalent(referenceLibraryMemberEnds.get(i), pimMemberEnds.get(i), inThePIM)) {
                return false;
            }
        }
        return true;
    }

    private static boolean typesAreEquivalent(final EObject aReferenceLibraryElement, final EObject aPIMElement,
            final Package inThePIM) {
        final Type referenceLibraryType = getType(aReferenceLibraryElement);
        final Type pimType = getType(aPIMElement);
        return isXmlPrimitiveType(referenceLibraryType) ? areEqual(UMLExt.getName(referenceLibraryType),
                UMLExt.getName(pimType)) : findEquivalent(referenceLibraryType, inThePIM) == pimType;
    }

    private static boolean bodiesAreTheSame(final EObject left, final EObject right) {
        return ObjectUtils.equals(getBody(left), getBody(right));
    }

    private static boolean classesAreTheSame(final EObject left, final EObject right) {
        final EClass leftClass = getEClass(left);
        final EClass rightClass = getEClass(right);
        return areEqual(EcoreExt.getName(leftClass), EcoreExt.getName(rightClass))
                && packagesAreTheSame(getPackage(leftClass), getPackage(rightClass));
    }

    private static boolean packagesAreTheSame(final EPackage left, final EPackage right) {
        return areEqual(EcoreExt.getName(left), EcoreExt.getName(right)) && areEqual(getNsURI(left), getNsURI(right));
    }

    private static boolean namesAreTheSame(final EObject aReferenceLibraryElement, final EObject aPIMElement) {
        return areEqual(isNiemNamespace(aPIMElement) ? normalize(UMLExt.getName(aReferenceLibraryElement), aPIMElement)
                : UMLExt.getName(aReferenceLibraryElement), UMLExt.getName(aPIMElement));
    }

    private static boolean areEqual(final Object left, final Object right) {
        return ObjectUtils.equals(left, right);
    }

    private static boolean theNameIsUnique(final NamedElement e) {
        return findNamedElements(e.eResource(), e.getQualifiedName()).size() == 1;
    }

    private static List<EObject> namespaceRelativePath(final List<EObject> acc, final EObject e) {
        if (e == null) {
            return acc;
        }
        acc.add(0, e);
        return isNiemNamespace(e) ? acc : namespaceRelativePath(acc, getOwner(e));
    }
}
