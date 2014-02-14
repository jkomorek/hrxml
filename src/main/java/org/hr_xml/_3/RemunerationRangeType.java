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
import org.openapplications.oagis._9.AmountType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;RemunerationRange. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The minimum and maximum range of work compensation. OED: Range n, A series or scale extending between certain limits.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for RemunerationRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemunerationRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}RemunerationTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RemunerationReferenceAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RemunerationMinimumAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RemunerationMaximumAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RemunerationRateIntervalCode" minOccurs="0"/>
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
@XmlType(name = "RemunerationRangeType", propOrder = {
    "remunerationTypeCode",
    "remunerationReferenceAmount",
    "remunerationMinimumAmount",
    "remunerationMaximumAmount",
    "remunerationRateIntervalCode",
    "userArea"
})
public class RemunerationRangeType {

    @XmlElement(name = "RemunerationTypeCode")
    protected RemunerationTypeCodeType remunerationTypeCode;
    @XmlElement(name = "RemunerationReferenceAmount")
    protected AmountType remunerationReferenceAmount;
    @XmlElement(name = "RemunerationMinimumAmount")
    protected AmountType remunerationMinimumAmount;
    @XmlElement(name = "RemunerationMaximumAmount")
    protected AmountType remunerationMaximumAmount;
    @XmlElement(name = "RemunerationRateIntervalCode")
    protected PayRateIntervalCodeType remunerationRateIntervalCode;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the remunerationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RemunerationTypeCodeType }
     *     
     */
    public RemunerationTypeCodeType getRemunerationTypeCode() {
        return remunerationTypeCode;
    }

    /**
     * Sets the value of the remunerationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemunerationTypeCodeType }
     *     
     */
    public void setRemunerationTypeCode(RemunerationTypeCodeType value) {
        this.remunerationTypeCode = value;
    }

    /**
     * Gets the value of the remunerationReferenceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRemunerationReferenceAmount() {
        return remunerationReferenceAmount;
    }

    /**
     * Sets the value of the remunerationReferenceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRemunerationReferenceAmount(AmountType value) {
        this.remunerationReferenceAmount = value;
    }

    /**
     * Gets the value of the remunerationMinimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRemunerationMinimumAmount() {
        return remunerationMinimumAmount;
    }

    /**
     * Sets the value of the remunerationMinimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRemunerationMinimumAmount(AmountType value) {
        this.remunerationMinimumAmount = value;
    }

    /**
     * Gets the value of the remunerationMaximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRemunerationMaximumAmount() {
        return remunerationMaximumAmount;
    }

    /**
     * Sets the value of the remunerationMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRemunerationMaximumAmount(AmountType value) {
        this.remunerationMaximumAmount = value;
    }

    /**
     * Gets the value of the remunerationRateIntervalCode property.
     * 
     * @return
     *     possible object is
     *     {@link PayRateIntervalCodeType }
     *     
     */
    public PayRateIntervalCodeType getRemunerationRateIntervalCode() {
        return remunerationRateIntervalCode;
    }

    /**
     * Sets the value of the remunerationRateIntervalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRateIntervalCodeType }
     *     
     */
    public void setRemunerationRateIntervalCode(PayRateIntervalCodeType value) {
        this.remunerationRateIntervalCode = value;
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
