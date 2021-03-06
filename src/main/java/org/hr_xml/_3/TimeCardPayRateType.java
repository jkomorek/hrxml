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
import org.openapplications.oagis._9.TextType;


/**
 * Associates billing and/or pay rate information with time worked information reported on a time card.
 * 
 * <p>Java class for TimeCardPayRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeCardPayRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Amount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PayRateIntervalCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RateTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CustomerRateClass" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CustomerRateBaseClass" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Multiplier" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Markup" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}BillableIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PayableIndicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCardPayRateType", propOrder = {
    "amount",
    "payRateIntervalCode",
    "rateTypeCode",
    "customerRateClass",
    "customerRateBaseClass",
    "multiplier",
    "markup",
    "billableIndicator",
    "payableIndicator"
})
public class TimeCardPayRateType {

    @XmlElement(name = "Amount", namespace = "http://www.openapplications.org/oagis/9")
    protected AmountType amount;
    @XmlElement(name = "PayRateIntervalCode")
    protected PayRateIntervalCodeType payRateIntervalCode;
    @XmlElement(name = "RateTypeCode")
    protected RateTypeCodeType rateTypeCode;
    @XmlElement(name = "CustomerRateClass")
    protected TextType customerRateClass;
    @XmlElement(name = "CustomerRateBaseClass")
    protected TextType customerRateBaseClass;
    @XmlElement(name = "Multiplier")
    protected MultiplierType multiplier;
    @XmlElement(name = "Markup")
    protected MarkupType markup;
    @XmlElement(name = "BillableIndicator")
    protected Boolean billableIndicator;
    @XmlElement(name = "PayableIndicator")
    protected Boolean payableIndicator;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the payRateIntervalCode property.
     * 
     * @return
     *     possible object is
     *     {@link PayRateIntervalCodeType }
     *     
     */
    public PayRateIntervalCodeType getPayRateIntervalCode() {
        return payRateIntervalCode;
    }

    /**
     * Sets the value of the payRateIntervalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRateIntervalCodeType }
     *     
     */
    public void setPayRateIntervalCode(PayRateIntervalCodeType value) {
        this.payRateIntervalCode = value;
    }

    /**
     * Gets the value of the rateTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeCodeType }
     *     
     */
    public RateTypeCodeType getRateTypeCode() {
        return rateTypeCode;
    }

    /**
     * Sets the value of the rateTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeCodeType }
     *     
     */
    public void setRateTypeCode(RateTypeCodeType value) {
        this.rateTypeCode = value;
    }

    /**
     * Gets the value of the customerRateClass property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCustomerRateClass() {
        return customerRateClass;
    }

    /**
     * Sets the value of the customerRateClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCustomerRateClass(TextType value) {
        this.customerRateClass = value;
    }

    /**
     * Gets the value of the customerRateBaseClass property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCustomerRateBaseClass() {
        return customerRateBaseClass;
    }

    /**
     * Sets the value of the customerRateBaseClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCustomerRateBaseClass(TextType value) {
        this.customerRateBaseClass = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link MultiplierType }
     *     
     */
    public MultiplierType getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiplierType }
     *     
     */
    public void setMultiplier(MultiplierType value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link MarkupType }
     *     
     */
    public MarkupType getMarkup() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkupType }
     *     
     */
    public void setMarkup(MarkupType value) {
        this.markup = value;
    }

    /**
     * Gets the value of the billableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillableIndicator() {
        return billableIndicator;
    }

    /**
     * Sets the value of the billableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillableIndicator(Boolean value) {
        this.billableIndicator = value;
    }

    /**
     * Gets the value of the payableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayableIndicator() {
        return payableIndicator;
    }

    /**
     * Sets the value of the payableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayableIndicator(Boolean value) {
        this.payableIndicator = value;
    }

}
