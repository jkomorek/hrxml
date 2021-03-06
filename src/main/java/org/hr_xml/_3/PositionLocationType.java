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
 * Contains description of the physical location of the position.
 * 
 * <p>Java class for PositionLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}LocationID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}LocationName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ReferenceLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Address" minOccurs="0"/>
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
@XmlType(name = "PositionLocationType", propOrder = {
    "locationID",
    "locationName",
    "referenceLocation",
    "address",
    "userArea"
})
public class PositionLocationType {

    @XmlElement(name = "LocationID")
    protected IdentifierType locationID;
    @XmlElement(name = "LocationName")
    protected TextType locationName;
    @XmlElement(name = "ReferenceLocation")
    protected ReferenceLocationType referenceLocation;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setLocationID(IdentifierType value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLocationName(TextType value) {
        this.locationName = value;
    }

    /**
     * This is a summary description of the physical location of 
     *                         the position. This is intended to be matched against a candidate's preference for work 
     *                         location. 
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLocationType }
     *     
     */
    public ReferenceLocationType getReferenceLocation() {
        return referenceLocation;
    }

    /**
     * Sets the value of the referenceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLocationType }
     *     
     */
    public void setReferenceLocation(ReferenceLocationType value) {
        this.referenceLocation = value;
    }

    /**
     * Optionally, a complete postal or street address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
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
