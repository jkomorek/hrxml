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
 * <p>Java class for USRateBasedCoverageTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USRateBasedCoverageTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}USRateBasedProductCode"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ProductTypeCode"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CoverageEntityCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USRateBasedCoverageTypeType", propOrder = {
    "usRateBasedProductCode",
    "productTypeCode",
    "coverageEntityCode"
})
public class USRateBasedCoverageTypeType {

    @XmlElement(name = "USRateBasedProductCode", required = true)
    protected String usRateBasedProductCode;
    @XmlElement(name = "ProductTypeCode", required = true)
    protected String productTypeCode;
    @XmlElement(name = "CoverageEntityCode", required = true)
    protected CoverageEntityCodeEnumType coverageEntityCode;

    /**
     * Gets the value of the usRateBasedProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRateBasedProductCode() {
        return usRateBasedProductCode;
    }

    /**
     * Sets the value of the usRateBasedProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRateBasedProductCode(String value) {
        this.usRateBasedProductCode = value;
    }

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
    }

    /**
     * Gets the value of the coverageEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageEntityCodeEnumType }
     *     
     */
    public CoverageEntityCodeEnumType getCoverageEntityCode() {
        return coverageEntityCode;
    }

    /**
     * Sets the value of the coverageEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageEntityCodeEnumType }
     *     
     */
    public void setCoverageEntityCode(CoverageEntityCodeEnumType value) {
        this.coverageEntityCode = value;
    }

}