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
import org.openapplications.oagis._9.CountrySubDivisionCodeType;


/**
 * <p>Java class for SearchAbuseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchAbuseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ScreeningSubjectID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SearchAbuseTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}CountrySubDivisionCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CountryCode" minOccurs="0"/>
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
@XmlType(name = "SearchAbuseType", propOrder = {
    "screeningSubjectID",
    "searchAbuseTypeCode",
    "countrySubDivisionCode",
    "countryCode",
    "additionalItem",
    "userArea"
})
public class SearchAbuseType {

    @XmlElement(name = "ScreeningSubjectID")
    protected List<ScreeningIdentifierType> screeningSubjectID;
    @XmlElement(name = "SearchAbuseTypeCode")
    protected SearchAbuseTypeCodeType searchAbuseTypeCode;
    @XmlElement(name = "CountrySubDivisionCode", namespace = "http://www.openapplications.org/oagis/9")
    protected List<CountrySubDivisionCodeType> countrySubDivisionCode;
    @XmlElement(name = "CountryCode")
    protected CountryCodeType countryCode;
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
     * Gets the value of the searchAbuseTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAbuseTypeCodeType }
     *     
     */
    public SearchAbuseTypeCodeType getSearchAbuseTypeCode() {
        return searchAbuseTypeCode;
    }

    /**
     * Sets the value of the searchAbuseTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAbuseTypeCodeType }
     *     
     */
    public void setSearchAbuseTypeCode(SearchAbuseTypeCodeType value) {
        this.searchAbuseTypeCode = value;
    }

    /**
     * Gets the value of the countrySubDivisionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countrySubDivisionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountrySubDivisionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountrySubDivisionCodeType }
     * 
     * 
     */
    public List<CountrySubDivisionCodeType> getCountrySubDivisionCode() {
        if (countrySubDivisionCode == null) {
            countrySubDivisionCode = new ArrayList<CountrySubDivisionCodeType>();
        }
        return this.countrySubDivisionCode;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
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