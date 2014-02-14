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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationIdentifiersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationIdentifiersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}OrganizationID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OrganizationName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OrganizationTaxID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OrganizationLegalID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationIdentifiersType", propOrder = {
    "organizationID",
    "organizationName",
    "organizationTaxID",
    "organizationLegalID"
})
@XmlSeeAlso({
    BeneficiaryOrganizationType.class
})
public class OrganizationIdentifiersType {

    @XmlElement(name = "OrganizationID")
    protected List<IdentifierType> organizationID;
    @XmlElement(name = "OrganizationName")
    protected OrganizationNameType organizationName;
    @XmlElement(name = "OrganizationTaxID")
    protected List<IdentifierType> organizationTaxID;
    @XmlElement(name = "OrganizationLegalID")
    protected List<IdentifierType> organizationLegalID;

    /**
     * Gets the value of the organizationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getOrganizationID() {
        if (organizationID == null) {
            organizationID = new ArrayList<IdentifierType>();
        }
        return this.organizationID;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationNameType }
     *     
     */
    public OrganizationNameType getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationNameType }
     *     
     */
    public void setOrganizationName(OrganizationNameType value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the organizationTaxID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationTaxID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationTaxID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getOrganizationTaxID() {
        if (organizationTaxID == null) {
            organizationTaxID = new ArrayList<IdentifierType>();
        }
        return this.organizationTaxID;
    }

    /**
     * Gets the value of the organizationLegalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationLegalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationLegalID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getOrganizationLegalID() {
        if (organizationLegalID == null) {
            organizationLegalID = new ArrayList<IdentifierType>();
        }
        return this.organizationLegalID;
    }

}
