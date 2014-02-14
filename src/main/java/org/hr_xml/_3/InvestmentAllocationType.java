//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Savings Plan Allocation_ Investment. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifies the investment towards which funds should be applied and the percentage of funds to apply. &lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Note that InvestmentReferenceID generally would be a "fund code" or other key maintained by the mutual fund or investment company receiving the savings plan elections. Such key would generally point to a table on that company's system where details of the investment are defined. For example, the key identify an investment defined by such attributes as: InvestmentName; InvestmentTypeCode; InvestmentSymbol; ExchangeCode; ShareClassCode. The use of such key provides for better normalization of data and less duplication of data in the message. These other components describing investments are available in the HR-XML library and could be used in the InvestmentDetails/UserArea if  required.&lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for InvestmentAllocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentAllocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}InvestmentReferenceID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AllocationPercentage" minOccurs="0"/>
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
@XmlType(name = "InvestmentAllocationType", propOrder = {
    "investmentReferenceID",
    "allocationPercentage",
    "userArea"
})
public class InvestmentAllocationType {

    @XmlElement(name = "InvestmentReferenceID")
    protected IdentifierType investmentReferenceID;
    @XmlElement(name = "AllocationPercentage")
    protected BigDecimal allocationPercentage;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the investmentReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getInvestmentReferenceID() {
        return investmentReferenceID;
    }

    /**
     * Sets the value of the investmentReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setInvestmentReferenceID(IdentifierType value) {
        this.investmentReferenceID = value;
    }

    /**
     * Gets the value of the allocationPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllocationPercentage() {
        return allocationPercentage;
    }

    /**
     * Sets the value of the allocationPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllocationPercentage(BigDecimal value) {
        this.allocationPercentage = value;
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
