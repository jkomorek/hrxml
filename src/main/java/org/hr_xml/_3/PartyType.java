//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Party. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contains a set of information about a Party necessary to execute and administer a given request or business activity. A party is an individual or entity having a role in a business activity and having obligations and/or entitlements deriving from that role that are contractually binding or legally significant. &lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for PartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hr-xml.org/3}BasePartyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserArea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyType", propOrder = {
    "userArea"
})
public class PartyType
    extends BasePartyType
{

    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the userArea property.
     * 
     * @return
     *     possible object is
     *     {@link UserAreaType }
     *     
     */
    public UserAreaType getUserArea() {
        return userArea;
    }

    /**
     * Sets the value of the userArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAreaType }
     *     
     */
    public void setUserArea(UserAreaType value) {
        this.userArea = value;
    }

}