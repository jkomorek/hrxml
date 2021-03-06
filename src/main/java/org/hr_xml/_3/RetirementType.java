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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RetirementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}OrganizationIdentifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}IntendedRetirementDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}FirstDayRetirementDate" minOccurs="0"/>
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
@XmlType(name = "RetirementType", propOrder = {
    "organizationIdentifiers",
    "intendedRetirementDate",
    "firstDayRetirementDate",
    "userArea"
})
public class RetirementType {

    @XmlElement(name = "OrganizationIdentifiers")
    protected OrganizationIdentifiersType organizationIdentifiers;
    @XmlElement(name = "IntendedRetirementDate")
    protected XMLGregorianCalendar intendedRetirementDate;
    @XmlElement(name = "FirstDayRetirementDate")
    protected XMLGregorianCalendar firstDayRetirementDate;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the organizationIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationIdentifiersType }
     *     
     */
    public OrganizationIdentifiersType getOrganizationIdentifiers() {
        return organizationIdentifiers;
    }

    /**
     * Sets the value of the organizationIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationIdentifiersType }
     *     
     */
    public void setOrganizationIdentifiers(OrganizationIdentifiersType value) {
        this.organizationIdentifiers = value;
    }

    /**
     * Gets the value of the intendedRetirementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntendedRetirementDate() {
        return intendedRetirementDate;
    }

    /**
     * Sets the value of the intendedRetirementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntendedRetirementDate(XMLGregorianCalendar value) {
        this.intendedRetirementDate = value;
    }

    /**
     * Gets the value of the firstDayRetirementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDayRetirementDate() {
        return firstDayRetirementDate;
    }

    /**
     * Sets the value of the firstDayRetirementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDayRetirementDate(XMLGregorianCalendar value) {
        this.firstDayRetirementDate = value;
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
