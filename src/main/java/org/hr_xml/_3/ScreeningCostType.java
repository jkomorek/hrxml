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
import org.openapplications.oagis._9.AmountType;


/**
 * <p>Java class for ScreeningCostType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScreeningCostType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}BaseAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AdditionalAmount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}TotalCostAmount" minOccurs="0"/>
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
@XmlType(name = "ScreeningCostType", propOrder = {
    "baseAmount",
    "additionalAmount",
    "totalCostAmount",
    "additionalItem"
})
public class ScreeningCostType {

    @XmlElement(name = "BaseAmount", namespace = "http://www.openapplications.org/oagis/9")
    protected AmountType baseAmount;
    @XmlElement(name = "AdditionalAmount")
    protected List<AdditionalAmountType> additionalAmount;
    @XmlElement(name = "TotalCostAmount")
    protected AmountType totalCostAmount;
    @XmlElement(name = "AdditionalItem")
    protected List<AdditionalItemType> additionalItem;

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBaseAmount(AmountType value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the additionalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAmountType }
     * 
     * 
     */
    public List<AdditionalAmountType> getAdditionalAmount() {
        if (additionalAmount == null) {
            additionalAmount = new ArrayList<AdditionalAmountType>();
        }
        return this.additionalAmount;
    }

    /**
     * Gets the value of the totalCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCostAmount() {
        return totalCostAmount;
    }

    /**
     * Sets the value of the totalCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCostAmount(AmountType value) {
        this.totalCostAmount = value;
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
