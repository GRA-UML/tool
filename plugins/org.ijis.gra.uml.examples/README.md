org.ijis.gra.uml.examples
========================================================================

In order to use the PetAdoption example in Eclipse, the following changes had to be made:
* Change the filename from com.nomagic.magicdraw.uml_model.model to PetAdoption.uml
* Removed all MagicDraw references including extensions and Profile references
* Changed NIEM-UML-Profile.mdzip references to http://www.omg.org/spec/NIEM-UML/20120501/NIEM_UML_Profile.xmi
* Changed XMLPrimitiveTypes.mdzip references to href='http://www.omg.org/spec/NIEM-UML/20120501/XMLPrimitiveTypes.xmi
* Changed NIEM-Reference-core.mdzip references to pathmap://NIEM_REFERENCE/NIEM-Reference-core.uml
* s/<type/<type xsi:type="uml:Type"/
* s/<supplier/<supplier xsi:type="uml:NamedElement"/
* s/<general/<general xsi:type="uml:Classifier"/
* s/<xmi:XMI xmlns:uml='http://www.omg.org/spec/UML/20110701' xmlns:xmi='http://www.omg.org/spec/XMI/20110701' xmlns:NIEM_UML_Profile='http://www.omg.org/spec/NIEM-UML/20120501' xmlns:DSL_Customization='http://www.magicdraw.com/schemas/DSL_Customization.xmi' xmlns:NIEM_PSM_Profile='http://www.omg.org/spec/NIEM-UML/20120501/NIEM_PSM_Profile' xmlns:Validation_Profile='http://www.magicdraw.com/schemas/Validation_Profile.xmi' xmlns:StandardProfileL2='http://www.omg.org/spec/UML/20110701/StandardProfileL2' xmlns:Traceability_customization='http://www.magicdraw.com/schemas/Traceability_customization.xmi' xmlns:NIEM_PIM_Profile='http://www.omg.org/spec/NIEM-UML/20120501/NIEM_PIM_Profile' xmlns:MagicDraw_Profile='http://www.omg.org/spec/UML/20110701/MagicDrawProfile' xmlns:StandardProfileL3='http://www.omg.org/spec/UML/20110701/StandardProfileL3' xmlns:NIEM_Common_Profile='http://www.omg.org/spec/NIEM-UML/20120501/NIEM_Common_Profile' xmlns:Model_Package_Description_Profile='http://www.omg.org/spec/NIEM-UML/20120501/Model_Package_Description_Profile'>/<xmi:XMI xmlns:xmi="http://www.omg.org/spec/XMI/20110701" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:uml="http://www.eclipse.org/uml2/4.0.0/UML" xmlns:NIEM_Common_Profile="http://www.omg.org/spec/NIEM-UML/20120501/NIEM_Common_Profile" xmlns:Model_Package_Description_Profile="http://www.omg.org/spec/NIEM-UML/20120501/Model_Package_Description_Profile" xmlns:NIEM_PIM_Profile="http://www.omg.org/spec/NIEM-UML/20120501/NIEM_PIM_Profile" xmlns:NIEM_PSM_Profile="http://www.omg.org/spec/NIEM-UML/20120501/NIEM_PSM_Profile" xsi:schemaLocation="http://www.omg.org/spec/NIEM-UML/20120501/NIEM_Common_Profile pathmap://NIEM_UML/NIEM-UML-Profile.xmi#NIEM_UML_Profile-NIEM_Common_Profile-ePackage http://www.omg.org/spec/NIEM-UML/20120501/Model_Package_Description_Profile pathmap://NIEM_UML/NIEM-UML-Profile.xmi#NIEM_UML_Profile-Model_Package_Description_Profile-ePackage http://www.omg.org/spec/NIEM-UML/20120501/NIEM_PIM_Profile pathmap://NIEM_UML/NIEM-UML-Profile.xmi#NIEM_UML_Profile-NIEM_PIM_Profile-ePackage http://www.omg.org/spec/NIEM-UML/20120501/NIEM_PSM_Profile pathmap://NIEM_UML/NIEM-UML-Profile.xmi#NIEM_UML_Profile-NIEM_PSM_Profile-ePackage http://www.omg.org/spec/UML/20110701 http://www.eclipse.org/uml2/4.0.0/UML">/
* Needed to change type references for XmlPrimitiveTypes.xmi to xsi:type='PrimitiveType'
* Needed to change external reference to TextType to internal reference to Text in the NIEMCoreSubset
* Needed to correct the subsetted properties of IdentificationJurisdictionFIPS10-4Code, IdentificationJurisdictionISO3166Alpha3Code and ActivityDateRange so that they subset the correct properties.


