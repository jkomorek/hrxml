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
 * <p>Java class for RequestedPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedPersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}PersonID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PersonName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StaffingSupplierIdentifiers" minOccurs="0"/>
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
@XmlType(name = "RequestedPersonType", propOrder = {
    "personID",
    "personName",
    "staffingSupplierIdentifiers",
    "userArea"
})
public class RequestedPersonType {

    @XmlElement(name = "PersonID")
    protected IdentifierType personID;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "StaffingSupplierIdentifiers")
    protected StaffingSupplierIdentifiersType staffingSupplierIdentifiers;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPersonID(IdentifierType value) {
        this.personID = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the staffingSupplierIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link StaffingSupplierIdentifiersType }
     *     
     */
    public StaffingSupplierIdentifiersType getStaffingSupplierIdentifiers() {
        return staffingSupplierIdentifiers;
    }

    /**
     * Sets the value of the staffingSupplierIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffingSupplierIdentifiersType }
     *     
     */
    public void setStaffingSupplierIdentifiers(StaffingSupplierIdentifiersType value) {
        this.staffingSupplierIdentifiers = value;
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