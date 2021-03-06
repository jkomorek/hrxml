//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.DescriptionType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ApplicationMethod .Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Instructions on how to apply for the posting.&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for ApplicationMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}Instructions" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PersonContact" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Communication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}InPersonApplication" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserArea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationMethodType", propOrder = {
    "instructions",
    "personContact",
    "communication",
    "inPersonApplication",
    "userArea"
})
public class ApplicationMethodType {

    @XmlElement(name = "Instructions")
    protected DescriptionType instructions;
    @XmlElement(name = "PersonContact")
    protected PersonContactType personContact;
    @XmlElement(name = "Communication")
    protected List<CommunicationABIEType> communication;
    @XmlElement(name = "InPersonApplication")
    protected InPersonApplicationType inPersonApplication;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the instructions property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setInstructions(DescriptionType value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the personContact property.
     * 
     * @return
     *     possible object is
     *     {@link PersonContactType }
     *     
     */
    public PersonContactType getPersonContact() {
        return personContact;
    }

    /**
     * Sets the value of the personContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonContactType }
     *     
     */
    public void setPersonContact(PersonContactType value) {
        this.personContact = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationABIEType }
     * 
     * 
     */
    public List<CommunicationABIEType> getCommunication() {
        if (communication == null) {
            communication = new ArrayList<CommunicationABIEType>();
        }
        return this.communication;
    }

    /**
     * Gets the value of the inPersonApplication property.
     * 
     * @return
     *     possible object is
     *     {@link InPersonApplicationType }
     *     
     */
    public InPersonApplicationType getInPersonApplication() {
        return inPersonApplication;
    }

    /**
     * Sets the value of the inPersonApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link InPersonApplicationType }
     *     
     */
    public void setInPersonApplication(InPersonApplicationType value) {
        this.inPersonApplication = value;
    }

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
