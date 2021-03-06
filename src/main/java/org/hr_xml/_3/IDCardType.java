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
import org.openapplications.oagis._9.DescriptionType;
import org.openapplications.oagis._9.QuantityType;


/**
 * <p>Java class for IDCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}IDCardTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PlanCoverageDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Quantity" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}IDCardActionCode" minOccurs="0"/>
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
@XmlType(name = "IDCardType", propOrder = {
    "idCardTypeCode",
    "planCoverageDescription",
    "quantity",
    "idCardActionCode",
    "userArea"
})
public class IDCardType {

    @XmlElement(name = "IDCardTypeCode")
    protected IDCardTypeCodeType idCardTypeCode;
    @XmlElement(name = "PlanCoverageDescription")
    protected List<DescriptionType> planCoverageDescription;
    @XmlElement(name = "Quantity", namespace = "http://www.openapplications.org/oagis/9")
    protected QuantityType quantity;
    @XmlElement(name = "IDCardActionCode")
    protected IDCardActionCodeType idCardActionCode;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the idCardTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link IDCardTypeCodeType }
     *     
     */
    public IDCardTypeCodeType getIDCardTypeCode() {
        return idCardTypeCode;
    }

    /**
     * Sets the value of the idCardTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDCardTypeCodeType }
     *     
     */
    public void setIDCardTypeCode(IDCardTypeCodeType value) {
        this.idCardTypeCode = value;
    }

    /**
     * Gets the value of the planCoverageDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planCoverageDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanCoverageDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getPlanCoverageDescription() {
        if (planCoverageDescription == null) {
            planCoverageDescription = new ArrayList<DescriptionType>();
        }
        return this.planCoverageDescription;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the idCardActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link IDCardActionCodeType }
     *     
     */
    public IDCardActionCodeType getIDCardActionCode() {
        return idCardActionCode;
    }

    /**
     * Sets the value of the idCardActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDCardActionCodeType }
     *     
     */
    public void setIDCardActionCode(IDCardActionCodeType value) {
        this.idCardActionCode = value;
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
