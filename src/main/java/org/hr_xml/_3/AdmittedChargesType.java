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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Admitted Charges. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Criminal charges or violations admitted by a screening search subject. Generally, admitted charges are communicated as part of a screening order. Generally, these would be the types of charges that would not be disqualifying by themself if admitted or disclosed by the search subject. Admitted charges are compared or "scored" against screening results. &lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for AdmittedChargesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdmittedChargesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}AdmittedChargesID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AdmittedChargesSummary" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CriminalCase" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.hr-xml.org/3}EffectiveDateAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdmittedChargesType", propOrder = {
    "admittedChargesID",
    "admittedChargesSummary",
    "criminalCase"
})
public class AdmittedChargesType {

    @XmlElement(name = "AdmittedChargesID")
    protected IdentifierType admittedChargesID;
    @XmlElement(name = "AdmittedChargesSummary")
    protected String admittedChargesSummary;
    @XmlElement(name = "CriminalCase")
    protected List<CriminalCaseType> criminalCase;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

    /**
     * Gets the value of the admittedChargesID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getAdmittedChargesID() {
        return admittedChargesID;
    }

    /**
     * Sets the value of the admittedChargesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setAdmittedChargesID(IdentifierType value) {
        this.admittedChargesID = value;
    }

    /**
     * Gets the value of the admittedChargesSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmittedChargesSummary() {
        return admittedChargesSummary;
    }

    /**
     * Sets the value of the admittedChargesSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmittedChargesSummary(String value) {
        this.admittedChargesSummary = value;
    }

    /**
     * Gets the value of the criminalCase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criminalCase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriminalCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriminalCaseType }
     * 
     * 
     */
    public List<CriminalCaseType> getCriminalCase() {
        if (criminalCase == null) {
            criminalCase = new ArrayList<CriminalCaseType>();
        }
        return this.criminalCase;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValidFrom() {
        if (validFrom == null) {
            validFrom = new ArrayList<String>();
        }
        return this.validFrom;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValidTo() {
        if (validTo == null) {
            validTo = new ArrayList<String>();
        }
        return this.validTo;
    }

}
