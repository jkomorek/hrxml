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
import org.openapplications.oagis._9.AmountType;
import org.openapplications.oagis._9.CodeType;


/**
 * <p>Java class for LiabilityRatingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiabilityRatingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}CreditLiabilityRatingCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RepositoryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Amount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StatusDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AdditionalItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiabilityRatingType", propOrder = {
    "creditLiabilityRatingCode",
    "repositoryCode",
    "amount",
    "statusDateTime",
    "additionalItem"
})
public class LiabilityRatingType {

    @XmlElement(name = "CreditLiabilityRatingCode")
    protected CreditLiabilityRatingCodeType creditLiabilityRatingCode;
    @XmlElement(name = "RepositoryCode")
    protected CodeType repositoryCode;
    @XmlElement(name = "Amount", namespace = "http://www.openapplications.org/oagis/9")
    protected AmountType amount;
    @XmlList
    @XmlElement(name = "StatusDateTime")
    protected List<String> statusDateTime;
    @XmlElement(name = "AdditionalItem")
    protected AdditionalItemType additionalItem;

    /**
     * Gets the value of the creditLiabilityRatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLiabilityRatingCodeType }
     *     
     */
    public CreditLiabilityRatingCodeType getCreditLiabilityRatingCode() {
        return creditLiabilityRatingCode;
    }

    /**
     * Sets the value of the creditLiabilityRatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLiabilityRatingCodeType }
     *     
     */
    public void setCreditLiabilityRatingCode(CreditLiabilityRatingCodeType value) {
        this.creditLiabilityRatingCode = value;
    }

    /**
     * Gets the value of the repositoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRepositoryCode() {
        return repositoryCode;
    }

    /**
     * Sets the value of the repositoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRepositoryCode(CodeType value) {
        this.repositoryCode = value;
    }

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
     * Gets the value of the statusDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatusDateTime() {
        if (statusDateTime == null) {
            statusDateTime = new ArrayList<String>();
        }
        return this.statusDateTime;
    }

    /**
     * Gets the value of the additionalItem property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalItemType }
     *     
     */
    public AdditionalItemType getAdditionalItem() {
        return additionalItem;
    }

    /**
     * Sets the value of the additionalItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalItemType }
     *     
     */
    public void setAdditionalItem(AdditionalItemType value) {
        this.additionalItem = value;
    }

}
