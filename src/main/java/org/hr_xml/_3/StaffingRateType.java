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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.AmountType;
import org.openapplications.oagis._9.DescriptionType;
import org.openapplications.oagis._9.TextType;


/**
 * A collection of information describing a 
 * 			rate associated with a staffing assignment or that is demanded by or
 * 			paid to a staffing resource. 
 * 
 * 			A rate may be expressed as one or more component rates or a consolidated
 * 			rate. A consolidated rate combines more than one component
 * 			rate into a single, flat rate. 
 * 			
 * 
 * <p>Java class for StaffingRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffingRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}RateID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OrderLineID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RateDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ComponentRateIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RateTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RateClassCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RateStatusCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Amount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PayRateIntervalCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Multiplier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CustomerRateClass" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CustomerRateBaseClass" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Markup" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PieceWork" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}TimeWorkedRounding" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "StaffingRateType", propOrder = {
    "rateID",
    "orderLineID",
    "rateDescription",
    "componentRateIndicator",
    "rateTypeCode",
    "rateClassCode",
    "rateStatusCode",
    "amount",
    "payRateIntervalCode",
    "multiplier",
    "customerRateClass",
    "customerRateBaseClass",
    "markup",
    "pieceWork",
    "timeWorkedRounding",
    "userArea"
})
public class StaffingRateType {

    @XmlElement(name = "RateID")
    protected List<RateIDType> rateID;
    @XmlElement(name = "OrderLineID")
    protected IdentifierType orderLineID;
    @XmlElement(name = "RateDescription")
    protected List<DescriptionType> rateDescription;
    @XmlElement(name = "ComponentRateIndicator")
    protected Boolean componentRateIndicator;
    @XmlElement(name = "RateTypeCode")
    protected RateTypeCodeType rateTypeCode;
    @XmlElement(name = "RateClassCode")
    protected RateClassCodeType rateClassCode;
    @XmlElement(name = "RateStatusCode")
    protected StatusCodeType rateStatusCode;
    @XmlElement(name = "Amount", namespace = "http://www.openapplications.org/oagis/9")
    protected AmountType amount;
    @XmlElement(name = "PayRateIntervalCode")
    protected PayRateIntervalCodeType payRateIntervalCode;
    @XmlElement(name = "Multiplier")
    protected List<MultiplierType> multiplier;
    @XmlElement(name = "CustomerRateClass")
    protected TextType customerRateClass;
    @XmlElement(name = "CustomerRateBaseClass")
    protected TextType customerRateBaseClass;
    @XmlElement(name = "Markup")
    protected MarkupType markup;
    @XmlElement(name = "PieceWork")
    protected List<PieceWorkType> pieceWork;
    @XmlElement(name = "TimeWorkedRounding")
    protected List<TimeWorkedRoundingType> timeWorkedRounding;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

    /**
     * Gets the value of the rateID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateIDType }
     * 
     * 
     */
    public List<RateIDType> getRateID() {
        if (rateID == null) {
            rateID = new ArrayList<RateIDType>();
        }
        return this.rateID;
    }

    /**
     * Gets the value of the orderLineID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getOrderLineID() {
        return orderLineID;
    }

    /**
     * Sets the value of the orderLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setOrderLineID(IdentifierType value) {
        this.orderLineID = value;
    }

    /**
     * Gets the value of the rateDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getRateDescription() {
        if (rateDescription == null) {
            rateDescription = new ArrayList<DescriptionType>();
        }
        return this.rateDescription;
    }

    /**
     * Gets the value of the componentRateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComponentRateIndicator() {
        return componentRateIndicator;
    }

    /**
     * Sets the value of the componentRateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComponentRateIndicator(Boolean value) {
        this.componentRateIndicator = value;
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
     * Gets the value of the rateClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateClassCodeType }
     *     
     */
    public RateClassCodeType getRateClassCode() {
        return rateClassCode;
    }

    /**
     * Sets the value of the rateClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateClassCodeType }
     *     
     */
    public void setRateClassCode(RateClassCodeType value) {
        this.rateClassCode = value;
    }

    /**
     * Gets the value of the rateStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeType }
     *     
     */
    public StatusCodeType getRateStatusCode() {
        return rateStatusCode;
    }

    /**
     * Sets the value of the rateStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeType }
     *     
     */
    public void setRateStatusCode(StatusCodeType value) {
        this.rateStatusCode = value;
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
     * Gets the value of the multiplier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiplier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiplier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiplierType }
     * 
     * 
     */
    public List<MultiplierType> getMultiplier() {
        if (multiplier == null) {
            multiplier = new ArrayList<MultiplierType>();
        }
        return this.multiplier;
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
     * Gets the value of the pieceWork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceWork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PieceWorkType }
     * 
     * 
     */
    public List<PieceWorkType> getPieceWork() {
        if (pieceWork == null) {
            pieceWork = new ArrayList<PieceWorkType>();
        }
        return this.pieceWork;
    }

    /**
     * Gets the value of the timeWorkedRounding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeWorkedRounding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeWorkedRounding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeWorkedRoundingType }
     * 
     * 
     */
    public List<TimeWorkedRoundingType> getTimeWorkedRounding() {
        if (timeWorkedRounding == null) {
            timeWorkedRounding = new ArrayList<TimeWorkedRoundingType>();
        }
        return this.timeWorkedRounding;
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
