//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.AmountType;
import org.openapplications.oagis._9.DescriptionType;
import org.openapplications.oagis._9.TimePeriodType;


/**
 * <p>Java class for ScreeningCatalogCustomerScopeScreeningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScreeningCatalogCustomerScopeScreeningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ScreeningSearchTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ScreeningSearchTypeQualifierCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ApplicableRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SearchPeriod" minOccurs="0"/>
 *         &lt;element name="MaximumCount" type="{http://www.openapplications.org/oagis/9}NumericType" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}BaseCostAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AdditionalItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScreeningCatalogCustomerScopeScreeningType", propOrder = {
    "screeningSearchTypeCode",
    "screeningSearchTypeQualifierCode",
    "applicableRegion",
    "searchPeriod",
    "maximumCount",
    "description",
    "baseCostAmount",
    "additionalItem"
})
public class ScreeningCatalogCustomerScopeScreeningType {

    @XmlElement(name = "ScreeningSearchTypeCode")
    protected ScreeningSearchTypeCode screeningSearchTypeCode;
    @XmlElement(name = "ScreeningSearchTypeQualifierCode")
    protected ScreeningSearchTypeQualifierCodeType screeningSearchTypeQualifierCode;
    @XmlElement(name = "ApplicableRegion")
    protected List<JurisdictionType> applicableRegion;
    @XmlElement(name = "SearchPeriod")
    protected TimePeriodType searchPeriod;
    @XmlElement(name = "MaximumCount")
    protected BigDecimal maximumCount;
    @XmlElement(name = "Description", namespace = "http://www.openapplications.org/oagis/9")
    protected DescriptionType description;
    @XmlElement(name = "BaseCostAmount")
    protected AmountType baseCostAmount;
    @XmlElement(name = "AdditionalItem")
    protected List<AdditionalItemType> additionalItem;

    /**
     * Gets the value of the screeningSearchTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningSearchTypeCode }
     *     
     */
    public ScreeningSearchTypeCode getScreeningSearchTypeCode() {
        return screeningSearchTypeCode;
    }

    /**
     * Sets the value of the screeningSearchTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningSearchTypeCode }
     *     
     */
    public void setScreeningSearchTypeCode(ScreeningSearchTypeCode value) {
        this.screeningSearchTypeCode = value;
    }

    /**
     * Gets the value of the screeningSearchTypeQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningSearchTypeQualifierCodeType }
     *     
     */
    public ScreeningSearchTypeQualifierCodeType getScreeningSearchTypeQualifierCode() {
        return screeningSearchTypeQualifierCode;
    }

    /**
     * Sets the value of the screeningSearchTypeQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningSearchTypeQualifierCodeType }
     *     
     */
    public void setScreeningSearchTypeQualifierCode(ScreeningSearchTypeQualifierCodeType value) {
        this.screeningSearchTypeQualifierCode = value;
    }

    /**
     * Gets the value of the applicableRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JurisdictionType }
     * 
     * 
     */
    public List<JurisdictionType> getApplicableRegion() {
        if (applicableRegion == null) {
            applicableRegion = new ArrayList<JurisdictionType>();
        }
        return this.applicableRegion;
    }

    /**
     * Gets the value of the searchPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getSearchPeriod() {
        return searchPeriod;
    }

    /**
     * Sets the value of the searchPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setSearchPeriod(TimePeriodType value) {
        this.searchPeriod = value;
    }

    /**
     * Gets the value of the maximumCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumCount() {
        return maximumCount;
    }

    /**
     * Sets the value of the maximumCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumCount(BigDecimal value) {
        this.maximumCount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    /**
     * Gets the value of the baseCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBaseCostAmount() {
        return baseCostAmount;
    }

    /**
     * Sets the value of the baseCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBaseCostAmount(AmountType value) {
        this.baseCostAmount = value;
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

}