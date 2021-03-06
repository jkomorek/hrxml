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
import org.openapplications.oagis._9.TextType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Conference Paper_ Publication. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Written notes, memoranda, letters, documents, etc. prepared for delivery at a conference.&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for ConferencePaperType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConferencePaperType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hr-xml.org/3}BibliographyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}EventName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}EventDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}VenueName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}LocationSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConferencePaperType", propOrder = {
    "eventName",
    "eventDate",
    "venueName",
    "locationSummary"
})
public class ConferencePaperType
    extends BibliographyType
{

    @XmlElement(name = "EventName")
    protected TextType eventName;
    @XmlElement(name = "EventDate")
    protected FreeFormDateType eventDate;
    @XmlElement(name = "VenueName")
    protected TextType venueName;
    @XmlElement(name = "LocationSummary")
    protected LocationSummaryType locationSummary;

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setEventName(TextType value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormDateType }
     *     
     */
    public FreeFormDateType getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormDateType }
     *     
     */
    public void setEventDate(FreeFormDateType value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the venueName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getVenueName() {
        return venueName;
    }

    /**
     * Sets the value of the venueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setVenueName(TextType value) {
        this.venueName = value;
    }

    /**
     * Gets the value of the locationSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSummaryType }
     *     
     */
    public LocationSummaryType getLocationSummary() {
        return locationSummary;
    }

    /**
     * Sets the value of the locationSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSummaryType }
     *     
     */
    public void setLocationSummary(LocationSummaryType value) {
        this.locationSummary = value;
    }

}
