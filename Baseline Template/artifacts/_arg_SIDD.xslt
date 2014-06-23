<xsl:stylesheet  version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" 
    xmlns:ex="http://default.com/my/exchange" xmlns:ext="http://default.com/my/extension" xmlns:SAN="http://ijis.org/GRA/Annotations" xmlns:SANWSDL="http:/ijis.org/GRA/WSDLAnnotations" xmlns:foo="http://whatever">
    <xsl:variable name="placeholdermode" select="'Template'"/>
	<xsl:function name="foo:ReturnValue">
		<xsl:param name="placeholder"/>
		<xsl:param name="xpath"/>
		<xsl:choose>
			<xsl:when test="string-length($xpath) > 0">
				<xsl:value-of select="$xpath"/>
			</xsl:when>
			<xsl:when test="$placeholdermode !=  'Template'">
				[Not Defined]
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$placeholder"/>
			</xsl:otherwise>
		 </xsl:choose>
	  </xsl:function>
	<xsl:function name="foo:ReturnSIR">
		<xsl:param name="placeholder"/>
		<xsl:param name="xpathValue"/>
		<xsl:choose>
			<xsl:when test="$xpathValue = 'true'">
				<xsl:choose>
					<xsl:when test="$placeholder = '_arg_sir_00'">
					Static IP Address via Firewall
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_01'">
					Application specific roles
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_02'">
					GFIPM
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_03'">
					SSL Certificate Authentication
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_04'">
					W3C XML Signature
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_05'">
					W3C XML Signature
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_06'">
					OASIS Security Profile 1.1
                         with XML Encryption
                    Transport Layer Security
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_07'">
					WS-Addressing
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_08'">
					Implicitly provide by response
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_09'">
					WS-Coordination
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_10'">
					WS-Metadataexchange
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_11'">
					WSDL 1.1
					</xsl:when>
					<xsl:when test="$placeholder = '_arg_sir_12'">
					To be determined by requesting agency and specific partnering corrections organizations.
					</xsl:when>
				</xsl:choose>
			</xsl:when>
			<xsl:otherwise>
				N/A
			</xsl:otherwise>
		</xsl:choose>
	</xsl:function>
  <xsl:template match="/">
    <!--<!DOCTYPE html>-->
    <html xmlns="http://www.w3.org/1999/xhtml">
        <head>
            <style>
                .FontType { font-family:"Calibri","sans-serif";line-height:115%; }
                .TitleMain { font-size:26.0pt; color:#1F497D; }
                .TitleSub { font-size:18.0pt; color:#1F497D; }
                .Heading1 { font-size:18.0pt; break-before:page }
                .Heading2 { font-size:16.0pt; }
                .Heading3 { font-size:14.0pt; }
                .NormalText { font-size:11.0pt; }
                .Bullet { margin-left:0.5in; }
                .TableOfContents { font-size:12.0pt; font-weight:900; margin-left:0.25in;}
                .CoverPageLeft { margin-left:1.8in; text-align:left; }
                .CoverPageRight { margin-right:.05in; margin-left:11.15pt; text-align:left; }
                .tDataTable { border-top:solid #5B9BD5 1.0pt;padding:0in 5.4pt 0in 5.4pt; }
                .tDataTableHeader { border-bottom:solid #5B9BD5 1.0pt; }
                .tDataTableRowAlt { background:#DEEAF6; }
                .tDataTableText{ color:#2E74B5; }
                .tDataTableTextTitle{ color:#2E74B5;font-weight:900; }
                .MsoNormal { width:8.5in;margin-top:6.0pt; margin-left:0.25pt margin-bottom:6.0pt; text-align:center; }
                .MsoNormalTable { margin-left:auto; margin-right:auto; border-collapse:collapse; }
                .MsoNormalTableColLeft { width:220pt;border-right:solid #0051BA 3.0pt; padding:0in 5.4pt 0in 5.4pt }
                .MsoNormalTableColRight { width:220pt;padding:0in 5.4pt 0in 5.4pt }
                .MsoNormalText { width:8.5in; margin-left:0.75in;text-align:justify; }
                .tDataTableCaption { padding:0.25in 0in 0in 0in;font-weight:900; text-align:center; }
            </style>
        </head>
        <body lang="EN-US" style="float:none;">
            <div class="CoverPageSection" style="float:none;overflow:visible;">
                <p class="MsoNormal" >
                    <b><span class="FontType TitleSub"><img src=".\Title.jpg"/></span></b>
                </p> <br/>
                <p class="MsoNormal">
                    <b> <span class="FontType TitleSub"><xsl:value-of select="foo:ReturnValue('$_arg_ServiceName_',//SAN:ServiceDescription/SAN:ServiceFullNameText)"/></span> </b> </p> <br/>
                <p class="MsoNormal">
                    <b><span class="FontType TitleSub"><xsl:value-of select="foo:ReturnValue('$_arg_ServiceAbbreviation_',//SAN:ServiceDescription/SAN:ServiceNameAbbreviationText)"/></span></b>
                </p> <br/>
                <p class="MsoNormal">
                    <b><span class="FontType TitleSub"><xsl:value-of select="foo:ReturnValue('$_arg_ServiceVersion_',//SAN:ServiceDescription/SAN:ServiceInterface[1]/SANWSDL:ServiceInteractionProfile/SAN:SIPVersion)"/></span></b>
                </p> <br/>
                <p class="MsoNormal">
                    <b><span class="FontType TitleMain">&#160;<br/>&#160;</span></b>
                </p> <br/>        
                <p class="MsoNormal">
                    <b><span class="FontType TitleMain">GRA</span></b>
                </p> <br/>      
                <p class="MsoNormal">
                    <b><span class="FontType TitleMain">Service Interface Description</span></b>
                </p> <br/>      
                <p class="MsoNormal">
                    <b><span class="FontType TitleMain">Document Version 1.0</span></b>
                </p> <br/>
                <p class="MsoNormal">
                    <b><span class="FontType TitleMain">&#160;<br/>&#160;<br/>&#160;</span></b>
                </p> <br/>    
                <div class="MsoNormal">
                <table class="MsoNormalTable">
                    <tr>
                        <td class="MsoNormalTableColLeft"> <p class="FontType CoverPageLeft">Delivery On:</p> </td>
                        <td class="MsoNormalTableColRight"> <p class="FontType CoverPageRight"><b><xsl:value-of select="foo:ReturnValue('$_arg_Month_',format-dateTime(xs:dateTime(concat(//SAN:ServiceDescription/SAN:Version/SAN:CreationDate,  'T00:00:00')), '[MN,*-3]'))"/>   <xsl:value-of select="foo:ReturnValue('$_arg_Year_',format-dateTime(xs:dateTime(concat(//SAN:ServiceDescription/SAN:Version/SAN:CreationDate,  'T00:00:00')), '[Y0001]'))"/></b></p> </td>
                    </tr>
                    <tr>
                        <td class="MsoNormalTableColLeft">
                            <p class="FontType CoverPageLeft">Prepared For:</p>
                            <p class="FontType CoverPageLeft">Prepared By:</p>
                            <p class="FontType CoverPageLeft">Sponsored By:</p>
                        </td>
                        <td class="MsoNormalTableColRight">
                            <p class="FontType CoverPageRight"><b><xsl:value-of select="foo:ReturnValue('$_arg_PreparedFor_',//SAN:ServiceDescription/SAN:ServiceInterface[1]/SANWSDL:provider/SANWSDL:OrganizationName)"/></b></p>
                            <p class="FontType CoverPageRight"><b><xsl:value-of select="foo:ReturnValue('$_arg_Prepared-By',//SAN:ServiceDescription/SAN:ServiceInterface[2]/SANWSDL:provider/SANWSDL:OrganizationName)"/></b></p>
                            <p class="FontType CoverPageRight"><b><xsl:value-of select="foo:ReturnValue('$_arg_Sponsored-By',//SAN:ServiceDescription/SAN:RelatedOrganization/SAN:OrganizationName)"/></b></p>
                        </td>
                    </tr>
                </table>
                </div>   
            </div>
    
            <br/><br/><br/>
            <div class="ContentSection" >
                <h1><span class="FontType Heading1">Table of Contents</span></h1> 
                
                <p> <a href="#_Toc387846682"> <span class="FontType TableOfContents">1.  &#160; &#160; Introduction</span> </a> </p>
                <p> <a href="#_Toc387846683"> <span class="FontType TableOfContents">2.  &#160; &#160; Physical Model</span> </a> </p>
                <p> <a href="#_Toc387846692"> <span class="FontType TableOfContents">3.  &#160; &#160; Service Interaction Requirements</span> </a> </p>
                <p> <a href="#_Toc387846693"> <span class="FontType TableOfContents">4.  &#160; &#160; Interface Description Requirements</span> </a> </p>
                <p> <a href="#_Toc387846702"> <span class="FontType TableOfContents">5.  &#160; &#160; Message Exchange Patterns</span> </a> </p>
                <p> <a href="#_Toc387846703"> <span class="FontType TableOfContents">6.  &#160; &#160; Message Definition Mechanisms</span> </a> </p>
                <p> <a href="#_Toc387846704"> <span class="FontType TableOfContents">7.  &#160; &#160; Policy and Contracts</span> </a> </p>
                <p> <a href="#_Toc387846705"> <span class="FontType TableOfContents">7.1 &#160; &#160; Policies</span> </a> </p>
                <p> <a href="#_Toc387846706"> <span class="FontType TableOfContents">7.2 &#160; &#160; Automated Service Contracts</span> </a> </p>
                <p> <a href="#_Toc387846707"> <span class="FontType TableOfContents">7.3 &#160; &#160; Non-automated Service Contracts</span> </a> </p>
                <p> <a href="#_Toc387846708"> <span class="FontType TableOfContents">8.  &#160; &#160; Umbrella Agreements</span> </a> </p>
                <p> <a href="#_Toc387846709"> <span class="FontType TableOfContents">9.  &#160; &#160; Security</span> </a> </p>
                <p> <a href="#_Toc387846710"> <span class="FontType TableOfContents">10. &#160; &#160; Privacy</span> </a> </p>
                <p> <a href="#_Toc387846711"> <span class="FontType TableOfContents">11. &#160; &#160; Service Testing</span> </a> </p>
                <p> <a href="#_Toc387846712"> <span class="FontType TableOfContents">Appendix A &#160; &#160; References</span> </a> </p>
                <p> <a href="#_Toc387846713"> <span class="FontType TableOfContents">Appendix B &#160; &#160; Glossary</span> </a> </p>
                <p> <a href="#_Toc387846714"> <span class="FontType TableOfContents">Appendix C &#160; &#160; Document History</span> </a> </p>
                            
                <br/><br/><br style="page-break-before:always" />                
                <h1><a id="_Toc387846682"><span class="FontType FontType Heading1">1. &#160; &#160; Introduction</span></a></h1>
                <p class="MsoNormalText"><span class="FontType NormalText">
                        A Service Interface Description describes the physical implementation or service 
                        interface used in a specific implementation of a service. This document is a Service 
                        Interface Description for the <xsl:value-of select="foo:ReturnValue('$_arg_ServiceName_',//SAN:ServiceDescription/SAN:ServiceFullNameText)"/> (<xsl:value-of select="foo:ReturnValue('$_arg_ServiceAbbreviation_',//SAN:ServiceDescription/SAN:ServiceNameAbbreviationText)"/>) Interface. </span></p>
                <p class="MsoNormalText"><span class="FontType NormalText">
                        In the context of the GRA and Service-Oriented Architecture $soa in general, a
                        service is the means by which one partner gains access to one or more
                        capabilities offered by another partner.  Capabilities generate real-world
                        effects that can be as simple as sharing information or can involve performing a
                        function as part of a complex process or changing the state of other related
                        processes.  Government organizations have numerous capabilities and a multitude
                        of partner organizations, both inside and outside of their traditional
                        communities.  There are significant benefits for these organizations to share
                        information and have access to each other's capabilities.  Achieving
                        interoperability among these organizations requires alignment of business and
                        technical requirements and capabilities.  In addition, it is critical to have a
                        consistent way of specifying these requirements and capabilities and sharing
                        them across organizational boundaries.  The GRA was developed to facilitate
                        interoperability and to assist in meeting other key requirements common in a
                        complex government information sharing environment.  In order to achieve
                        interoperability, a consistent approach must be defined to identify, describe,
                        and package services and their interactions in many different technical
                        environments, across multiple government lines of business, at all levels of
                        government, and with partner organizations. </span></p>
                <p class="MsoNormalText"><span class="FontType NormalText">
                        The GRA defines a service interface as
                        “the means for interacting with a service.”  It includes specific protocols,
                        commands, and information exchange by which actions are initiated on the
                        service.  A service interface is what a system designer or implementer
                        (programmer) uses to design or build executable software that interacts with the
                        service.  That is, the service interface represents the “how” of the
                        interaction.  Since the service interface is the physical manifestation of the
                        service, best practices call for service interfaces which can be described in an
                        open-standard, machine-referenceable format (that is, a format which could be
                        automatically processed by a computer).</span></p>            
                <p class="MsoNormalText"><span class="FontType NormalText">
                        A Service Specification is a formal document describing the capabilities made
                        available through the service; the service model that defines the semantics of
                        the service by representing its behavioral model, information model, and
                        interactions; the policies that constrain the use of the service; and the
                        service interfaces which provide a means to interacting with the service.  A
                        Service Specification is analogous to the software documentation of an
                        Application Programming Interface $api.  It provides stakeholders with an
                        understanding of the structure of the service and the rules applicable to its
                        implementation.  It gives service consumers the information necessary for
                        consuming a particular service and service providers the information necessary
                        for implementing the service in a consistent and interoperable way. </span></p>            
                <p class="MsoNormalText"><span class="FontType NormalText">
                        The main components of a Service Specification are the Service Description, one or
                        more Service Interface Descriptions, and the schemas and the samples used to
                        implement and test the service. </span></p>            
                <p class="MsoNormalText"><span class="FontType NormalText">
                        A Service Description contains information about all aspects of the service which
                        are not directly tied to the physical implementation of the service; in other
                        words, the service interface.  A Service Interface Description is a description
                        of the physical implementation; specifically, the service interface used in a
                        specific implementation of the service.  Since a service can leverage multiple
                        Service Interfaces, the Service Specification might contain more than one
                        Service Interface Description.</span></p>
                
                <br/><br style="page-break-before:always" />                
                <h1><a id="_Toc387846683"><span class="FontType Heading1">2. &#160; &#160; Physical Model</span></a></h1>
                    <p class="MsoNormalText"><span class="FontType NormalText"><xsl:value-of select="foo:ReturnValue('$_arg_PhysicalModel_',//SAN:ServiceDescription/SAN:PhysicalModel)"/></span></p>            

                <br/><br style="page-break-before:always" />
                    <h1><a id="_Toc387846692"><span class="FontType Heading1">3. &#160; &#160; Service Interaction Requirements</span></a></h1>
                    <p class="MsoNormalText"><span class="FontType NormalText">
                        The table below outlines the service interaction requirements and the associated
                        standards that are being used to support this service interface.</span></p>
                    <br/>
                            
                <table class="MsoNormalTable" style="margin-left:28pt; margin-right:auto; border-collapse:collapse;border:none">
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableHeader" style="width:175.0pt;"> <span class="FontType tDataTableTextTitle">Requirements</span> </td>
                        <td class="tDataTable tDataTableHeader" style="width:67.5pt;"> <span class="FontType tDataTableTextTitle">Mandatory</span> </td>
                        <td class="tDataTable tDataTableHeader" style="width:157.5pt;"> <span class="FontType tDataTableTextTitle">Specification</span> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">Service Consumer Authentication</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_00',//SAN:ServiceDescription/SAN:requirement/SAN:ServiceConsumerAuthentication)"/></span></i> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_00',//SAN:ServiceDescription/SAN:requirement/SAN:ServiceConsumerAuthentication)"/></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable"> <span class="FontType tDataTableTextTitle">Service Consumer Authorization</span> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_01',//SAN:ServiceDescription/SAN:requirement/SAN:ServiceConsumerAuthorization)"/></span></i> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_01',//SAN:ServiceDescription/SAN:requirement/SAN:ServiceConsumerAuthorization)"/></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">Identity and Attribute Assertion Transmission</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_02',//SAN:ServiceDescription/SAN:requirement/SAN:IdentityAndAttributeAssertionTransmission)"/></span></i> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_02',//SAN:ServiceDescription/SAN:requirement/SAN:IdentityAndAttributeAssertionTransmission)"/></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable"> <span class="FontType tDataTableTextTitle">Service Authentication</span> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_03',//SAN:ServiceDescription/SAN:requirement/SAN:ServiceAuthentication)"/></span></i> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_03',//SAN:ServiceDescription/SAN:requirement/SAN:ServiceAuthentication)"/></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">Message Nonrepudiation</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_04',//SAN:ServiceDescription/SAN:requirement/SAN:MessageNonrepudiation)"/></span></i> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_04',//SAN:ServiceDescription/SAN:requirement/SAN:MessageNonrepudiation)"/></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable"> <span class="FontType tDataTableTextTitle">Message Integrity</span> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_05',//SAN:ServiceDescription/SAN:requirement/SAN:MessageIntegrity)"/></span></i> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_05',//SAN:ServiceDescription/SAN:requirement/SAN:MessageIntegrity)"/></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">Message Confidentiality</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_06',//SAN:ServiceDescription/SAN:requirement/SAN:MessageConfidentiality)"/></span></i> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_06',//SAN:ServiceDescription/SAN:requirement/SAN:MessageConfidentiality)"/></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable"> <span class="FontType tDataTableTextTitle">Message Addressing</span> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_07',//SAN:ServiceDescription/SAN:requirement/SAN:MessageAddressing)"/></span></i> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_07',//SAN:ServiceDescription/SAN:requirement/SAN:MessageAddressing)"/></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">Reliability</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_08',//SAN:ServiceDescription/SAN:requirement/SAN:Reliability)"/></span></i> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_08',//SAN:ServiceDescription/SAN:requirement/SAN:Reliability)"/></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable"> <span class="FontType tDataTableTextTitle">Transaction Support</span> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_09',//SAN:ServiceDescription/SAN:requirement/SAN:TransactionSupport)"/></span></i> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_09',//SAN:ServiceDescription/SAN:requirement/SAN:TransactionSupport)"/></span></i> </td>
                    </tr>                    
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">Service Metadata Availability</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_10',//SAN:ServiceDescription/SAN:requirement/SAN:ServiceMetadataAvailability)"/></span></i> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_10',//SAN:ServiceDescription/SAN:requirement/SAN:ServiceMetadataAvailability)"/></span></i> </td>
                    </tr>                
                    <tr style="height:.3in">
                        <td class="tDataTable"> <span class="FontType tDataTableTextTitle">Interface Description Requirements</span> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_11',//SAN:ServiceDescription/SAN:requirement/SAN:InterfaceDescriptionRequirements)"/></span></i> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_11',//SAN:ServiceDescription/SAN:requirement/SAN:InterfaceDescriptionRequirements)"/></span></i> </td>
                    </tr>            
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">Service Responsiveness</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnValue('_arg_sir_12',//SAN:ServiceDescription/SAN:requirement/SAN:ServiceResponsiveness)"/></span></i> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"><xsl:value-of select="foo:ReturnSIR('_arg_sir_12',//SAN:ServiceDescription/SAN:requirement/SAN:ServiceResponsiveness)"/></span></i> </td>
                    </tr>      
                    <tr style="height:.3in">
                        <td class="FontType tDataTableCaption" colspan="3">Table 1: Service Interaction Requirements</td>
                    </tr>
                </table>
                    
                <br style="page-break-before:always" />
                <h1><a id="_Toc387846693"><span class="FontType Heading1">4. &#160; &#160; Service Interoperability Requirements</span></a></h1>  
                <p class="MsoNormalText"><span class="FontType NormalText"><xsl:value-of select="foo:ReturnValue('$_arg_ServiceInteroperabilityRequirements_',//SAN:ServiceDescription/SAN:ServiceInteroperabilityRequirements)"/></span></p>          
       
                <br style="page-break-before:always" />
                <h1><a id="_Toc387846702"><span class="FontType Heading1">5. &#160; &#160; Message Exchange Patterns</span></a></h1>
                <p class="MsoNormalText"><span class="FontType NormalText"><xsl:value-of select="foo:ReturnValue('$_arg_MessageExchangePatterns_',//SAN:ServiceDescription/SAN:ServiceInterface[1]/SANWSDL:provider/SANWSDL:interface_default/SANWSDL:operation/SANWSDL:MessageExchangePattern)"/></span></p>
                
                <br style="page-break-before:always" />
                <h1><a id="_Toc387846703"><span class="FontType Heading1">6. &#160; &#160; Message Definition Mechanisms</span></a></h1>
                <p class="MsoNormalText"><span class="FontType NormalText"><xsl:value-of select="foo:ReturnValue('$_arg_MessageDefinitionMechanisms_',//SAN:ServiceDescription/SAN:MessageDefinitionMechanisms)"/></span></p>
                    
                <br style="page-break-before:always" />
                <h1><a id="_Toc387846704"> <span class="FontType Heading1">7 &#160; &#160; Policy and Contracts</span></a></h1>
                
                <h1><a id="_Toc387846705"> <span class="FontType Heading2">7.1 &#160; &#160; Automated Service Policies</span></a></h1>
                <p class="MsoNormalText"><span class="FontType NormalText"><xsl:value-of select="foo:ReturnValue('$_arg_Policies_',//SAN:ServiceDescription/SAN:AutomatedServicePolicies)"/></span></p>
                
                <h1><a id="_Toc387846706"> <span class="FontType Heading2">7.2 &#160; &#160; Automated Service Contracts</span></a></h1>
                <p class="MsoNormalText"><span class="FontType NormalText"><xsl:value-of select="foo:ReturnValue('$_arg_AutomatedServiceContracts_',//SAN:ServiceDescription/SAN:AutomatedServiceContracts)"/></span></p>
                
                <h1><a id="_Toc387846707"> <span class="FontType Heading2">7.3 &#160; &#160; Non-automated Service Plicies and Contracts</span></a></h1>
                <p class="MsoNormalText"><span class="FontType NormalText"><xsl:value-of select="foo:ReturnValue('$_arg_NonAutomatedServiceContracts_',//SAN:ServiceDescription/SAN:NonAutomatedServicePoliciesAndContracts)"/></span></p>
                
                <h1><a id="_Toc387846708"> <span class="FontType Heading1">8. &#160; &#160; Umbrella Agreements</span></a></h1>
                <p class="MsoNormalText"><span class="FontType NormalText"><xsl:value-of select="foo:ReturnValue('$_arg_UmbrellaAgreements_',//SAN:ServiceDescription/SAN:ServiceLevelAgreement/SAN:UmbrellaAgreement/SAN:AgreementDescriptionText)"/></span></p>
                
                <br style="page-break-before:always" />
                <h1><a id="_Toc387846709"> <span class="FontType Heading1">9. &#160; &#160; Security</span></a></h1>
                <p class="MsoNormalText"><span class="FontType NormalText"><xsl:value-of select="foo:ReturnValue('$_arg_Security_',//SAN:ServiceDescription/SAN:Security)"/></span></p>
                
                <br style="page-break-before:always" />
                <h1><a id="_Toc387846710"> <span class="FontType Heading1">10. &#160; &#160; Privacy</span></a></h1>
                <p class="MsoNormalText"><span class="FontType NormalText"><xsl:value-of select="foo:ReturnValue('$_arg_Privacy_',//SAN:ServiceDescription/SAN:Privacy)"/></span></p>
                
                <br style="page-break-before:always" />
                <h1><a id="_Toc387846711"> <span class="FontType Heading1">11. &#160; &#160; Service Testing</span></a></h1>
                <p class="MsoNormalText"><span class="FontType NormalText"><xsl:value-of select="foo:ReturnValue('$_arg_ServiceTesting_',//SAN:ServiceDescription/SAN:ServiceTesting)"/></span></p>
                
                <br style="page-break-before:always" />
                <h1><a id="_Toc387846712"> <span class="FontType Heading1">Appendix A &#160; &#160; References</span></a></h1>
    
                <table style="margin-left:28pt">
                    <tr style="height:.5in">
                        <td><span class="FontType" style="width:100px"><b>GRA</b></span></td>
                        <td style="width:50px"></td>
                        <td><a href="https://it.ojp.gov/gra"><span class="FontType">Global Reference Architecture (GRA) Specification, Version 1.9.1</span></a></td> 
                    </tr>
                    <tr style="height:.5in">
                        <td><span class="FontType" style="width:100px"><b>GRA SSG</b></span></td>
                        <td style="width:50px"></td>
                        <td><a href="https://it.ojp.gov/gist/43/The-Global-Reference-Architecture--GRA--Service-Specification-Guideline-V-1-0-0">
                            <span class="FontType">GRA Service Specification Guideline, Version 1.0.0</span></a></td> 
                    </tr>
                    <tr style="height:.5in">
                        <td><span class="FontType" style="width:100px"><b>WS-SIP</b></span></td>
                        <td style="width:50px"></td>
                        <td><a href="https://it.ojp.gov/gist/56/Global-Reference-Architecture--GRA--Web-Services-Service-Interaction-Profile-Version-1-3">
                            <span class="FontType">GRA Web Services Service Interaction Profile, Version 1.3</span></a></td> 
                    </tr>
                    <tr style="height:.5in">
                        <td><span class="FontType" style="width:100px"><b>RS WS-SIP</b></span></td>
                        <td style="width:50px"></td>
                        <td><a href="https://it.ojp.gov/gist/85/Global-Reference-Architecture--GRA--Reliable-Secure-Web-Services-Service-Interaction-Profile">
                            <span class="FontType">GRA Reliable Secure Web Services Service Interaction Profile, Version 1.2</span></a></td> 
                    </tr>
                    <tr style="height:.5in">
                        <td><span class="FontType" style="width:100px"><b>WS-I BP</b></span></td>
                        <td style="width:50px"></td>
                        <td><a href="http://ws-i.org/profiles/basicprofile-1.2-2010-11-09.html">
                            <span class="FontType">WS-I Basic Profile, Version 1.2, 2010-11-09</span></a></td> 
                    </tr>
                    <tr style="height:.5in">
                        <td><span class="FontType" style="width:100px"><b>WS-I BSP</b></span></td>
                        <td style="width:50px"></td>
                        <td><a href="http://www.ws-i.org/Profiles/BasicSecurityProfile-1.0.html">
                            <span class="FontType">WS-I Basic Security Profile, Working Group Draft, March 30, 2007</span></a></td> 
                    </tr>
                    <tr style="height:.5in">
                        <td><span class="FontType" style="width:100px"><b>WS-I RSP</b></span></td>
                        <td style="width:50px"></td>
                        <td><a href="http://www.ws-i.org/Profiles/ReliableSecureProfile-1.0-2010-11-09.html">
                            <span class="FontType">Reliable Secure Profile Version 1.0, 2010-11-09</span></a></td> 
                    </tr>
                </table>
                
                <br style="page-break-before:always" />
                <h2><a id="_Toc387846713"> <span class="FontType Heading1">Appendix B &#160; &#160; Glossary</span></a></h2>
    
                <table class="MsoNormalTable"  style="margin-left:28pt;border-collapse:collapse;">
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableHeader" style="width:100pt;"> <span class="FontType tDataTableTextTitle">Acronym</span> </td>
                        <td class="tDataTable tDataTableHeader" style="width:455pt;"> <span class="FontType tDataTableTextTitle">Description</span> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">GRA</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText">Global Reference Architecture</span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTable"> <span class="FontType tDataTableTextTitle">GRA SSG</span> </td>
                        <td class="tDataTable tDataTable"> <i><span class="FontType tDataTableText">GRA Service Specification Guideline</span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">NIEM</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText">National Information Exchange Model</span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable"> <span class="FontType tDataTableTextTitle">OASIS</span> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText">OASIS	Organization for the Advancement of Structured Information Standards</span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">RS WS SIP</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText">GRA Reliable Secure Web Services Service Interaction Profile</span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable"> <span class="FontType tDataTableTextTitle">SOAP</span> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText">Simple Object Access Protocol</span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">W3C</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText">World Wide Web Consortium</span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable"> <span class="FontType tDataTableTextTitle">WS</span> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText">Web Services</span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">WS-SIP</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText">GRA Web Services Service Interaction Profile</span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable"> <span class="FontType tDataTableTextTitle">WSDL</span> </td>
                        <td class="tDataTable"> <i><span class="FontType tDataTableText">Web Services Description Language</span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle">XML</span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText">eXtensible Markup Language</span></i> </td>
                    </tr>  
                    <tr style="height:.3in">
                        <td class="FontType tDataTableCaption" colspan="2">Table 2: Acronym Descriptions</td>
                    </tr>
                </table>
    
                <br style="page-break-before:always" />
                <h2><a id="_Toc387846714"> <span class="FontType Heading1">Appendix C &#160; &#160; Document History</span></a></h2>
                
                <table class="MsoNormalTable"  style="margin-left:28pt;">
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableHeader" style="width:100pt;"> <span class="FontType tDataTableTextTitle">Date</span> </td>
                        <td class="tDataTable tDataTableHeader" style="width:55pt;"> <span class="FontType tDataTableTextTitle">Version</span> </td>
                        <td class="tDataTable tDataTableHeader" style="width:155pt;"> <span class="FontType tDataTableTextTitle">Editor</span> </td>
                        <td class="tDataTable tDataTableHeader" style="width:225pt;"> <span class="FontType tDataTableTextTitle">Change</span> </td>
                    </tr>                    
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle"></span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"></span></i> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"></span></i> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTable"> <span class="FontType tDataTableTextTitle"></span> </td>
                        <td class="tDataTable tDataTable"> <i><span class="FontType tDataTableText"></span></i> </td>
                        <td class="tDataTable tDataTable"> <span class="FontType tDataTableTextTitle"></span> </td>
                        <td class="tDataTable tDataTable"> <i><span class="FontType tDataTableText"></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="tDataTable tDataTableRowAlt"> <span class="FontType tDataTableTextTitle"></span> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"></span></i> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"></span></i> </td>
                        <td class="tDataTable tDataTableRowAlt"> <i><span class="FontType tDataTableText"></span></i> </td>
                    </tr>
                    <tr style="height:.3in">
                        <td class="FontType tDataTableCaption" colspan="4">Table 3: Document Revision History</td>
                    </tr>
                </table>
            </div>
        </body>
    </html>
  </xsl:template>
</xsl:stylesheet>