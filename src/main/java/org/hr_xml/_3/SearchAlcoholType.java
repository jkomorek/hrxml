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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchAlcoholType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAlcoholType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ScreeningSubjectID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AlcoholTestReasonCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SpecimenID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SpecimenCollectionDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SpecimenCollectionSiteID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ScreeningCustomer" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AdditionalItem" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SearchAlcoholType", propOrder = {
    "screeningSubjectID",
    "alcoholTestReasonCode",
    "specimenID",
    "specimenCollectionDate",
    "specimenCollectionSiteID",
    "screeningCustomer",
    "additionalItem",
    "userArea"
})
public class SearchAlcoholType {

    @XmlElement(name = "ScreeningSubjectID")
    protected List<ScreeningIdentifierType> screeningSubjectID;
    @XmlElement(name = "AlcoholTestReasonCode")
    protected ScreeningTestReasonCodeType alcoholTestReasonCode;
    @XmlElement(name = "SpecimenID")
    protected IdentifierType specimenID;
    @XmlList
    @XmlElement(name = "SpecimenCollectionDate")
    protected List<String> specimenCollectionDate;
    @XmlElement(name = "SpecimenCollectionSiteID")
    protected IdentifierType specimenCollectionSiteID;
    @XmlElement(name = "ScreeningCustomer")
    protected ScreeningCustomerType screeningCustomer;
    @XmlElement(name = "AdditionalItem")
    protected List<AdditionalItemType> additionalItem;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the screeningSubjectID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningSubjectID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningSubjectID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningIdentifierType }
     * 
     * 
     */
    public List<ScreeningIdentifierType> getScreeningSubjectID() {
        if (screeningSubjectID == null) {
            screeningSubjectID = new ArrayList<ScreeningIdentifierType>();
        }
        return this.screeningSubjectID;
    }

    /**
     * Gets the value of the alcoholTestReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningTestReasonCodeType }
     *     
     */
    public ScreeningTestReasonCodeType getAlcoholTestReasonCode() {
        return alcoholTestReasonCode;
    }

    /**
     * Sets the value of the alcoholTestReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningTestReasonCodeType }
     *     
     */
    public void setAlcoholTestReasonCode(ScreeningTestReasonCodeType value) {
        this.alcoholTestReasonCode = value;
    }

    /**
     * Gets the value of the specimenID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSpecimenID() {
        return specimenID;
    }

    /**
     * Sets the value of the specimenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSpecimenID(IdentifierType value) {
        this.specimenID = value;
    }

    /**
     * Gets the value of the specimenCollectionDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specimenCollectionDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecimenCollectionDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecimenCollectionDate() {
        if (specimenCollectionDate == null) {
            specimenCollectionDate = new ArrayList<String>();
        }
        return this.specimenCollectionDate;
    }

    /**
     * Gets the value of the specimenCollectionSiteID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSpecimenCollectionSiteID() {
        return specimenCollectionSiteID;
    }

    /**
     * Sets the value of the specimenCollectionSiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSpecimenCollectionSiteID(IdentifierType value) {
        this.specimenCollectionSiteID = value;
    }

    /**
     * Gets the value of the screeningCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningCustomerType }
     *     
     */
    public ScreeningCustomerType getScreeningCustomer() {
        return screeningCustomer;
    }

    /**
     * Sets the value of the screeningCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningCustomerType }
     *     
     */
    public void setScreeningCustomer(ScreeningCustomerType value) {
        this.screeningCustomer = value;
    }

    /**
     * Gets the value of the additionalItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalItemType }
     * 
     * 
     */
    public List<AdditionalItemType> getAdditionalItem() {
        if (additionalItem == null) {
            additionalItem = new ArrayList<AdditionalItemType>();
        }
        return this.additionalItem;
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
