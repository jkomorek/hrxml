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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.AmountType;
import org.openapplications.oagis._9.CodeType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;_ Deferral. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contains information about amounts contributed to the employee's savings plan account that could have been accepted current pay, but that the employee elected to defer.
 * &lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionUsage xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Allows deferrals to be expressed as either a percentage or a flat amount. While expressed as two optional elements in a sequence for simplicity and tool compatibility, conventional usage would be to use one or the other and not both.&lt;/ccts:DefinitionUsage&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for DeferralType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeferralType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}LimitReachedIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}LimitReachedTypeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DeferralTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DeferralPercentage" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DeferralAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PayrollEffectiveDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserArea" minOccurs="0"/>
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
@XmlType(name = "DeferralType", propOrder = {
    "limitReachedIndicator",
    "limitReachedTypeCode",
    "deferralTypeCode",
    "deferralPercentage",
    "deferralAmount",
    "payrollEffectiveDate",
    "userArea"
})
public class DeferralType {

    @XmlElement(name = "LimitReachedIndicator")
    protected EffectiveDatedIndicatorType limitReachedIndicator;
    @XmlElement(name = "LimitReachedTypeCode")
    protected List<CodeType> limitReachedTypeCode;
    @XmlElement(name = "DeferralTypeCode")
    protected CodeType deferralTypeCode;
    @XmlElement(name = "DeferralPercentage")
    protected BigDecimal deferralPercentage;
    @XmlElement(name = "DeferralAmount")
    protected AmountType deferralAmount;
    @XmlList
    @XmlElement(name = "PayrollEffectiveDate")
    protected List<String> payrollEffectiveDate;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

    /**
     * Gets the value of the limitReachedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDatedIndicatorType }
     *     
     */
    public EffectiveDatedIndicatorType getLimitReachedIndicator() {
        return limitReachedIndicator;
    }

    /**
     * Sets the value of the limitReachedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDatedIndicatorType }
     *     
     */
    public void setLimitReachedIndicator(EffectiveDatedIndicatorType value) {
        this.limitReachedIndicator = value;
    }

    /**
     * Gets the value of the limitReachedTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitReachedTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitReachedTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getLimitReachedTypeCode() {
        if (limitReachedTypeCode == null) {
            limitReachedTypeCode = new ArrayList<CodeType>();
        }
        return this.limitReachedTypeCode;
    }

    /**
     * Gets the value of the deferralTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDeferralTypeCode() {
        return deferralTypeCode;
    }

    /**
     * Sets the value of the deferralTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDeferralTypeCode(CodeType value) {
        this.deferralTypeCode = value;
    }

    /**
     * Gets the value of the deferralPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeferralPercentage() {
        return deferralPercentage;
    }

    /**
     * Sets the value of the deferralPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeferralPercentage(BigDecimal value) {
        this.deferralPercentage = value;
    }

    /**
     * Gets the value of the deferralAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeferralAmount() {
        return deferralAmount;
    }

    /**
     * Sets the value of the deferralAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeferralAmount(AmountType value) {
        this.deferralAmount = value;
    }

    /**
     * Gets the value of the payrollEffectiveDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payrollEffectiveDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayrollEffectiveDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPayrollEffectiveDate() {
        if (payrollEffectiveDate == null) {
            payrollEffectiveDate = new ArrayList<String>();
        }
        return this.payrollEffectiveDate;
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
