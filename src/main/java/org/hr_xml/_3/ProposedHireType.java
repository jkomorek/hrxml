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


/**
 * Contains information about a proposed hire. Employers sometimes will pre-provision certain systems with information about an individual scheduled to start work, but who has not yet entered on duty.
 * 
 * <p>Java class for ProposedHireType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposedHireType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ExpectedDutyEntryDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CancelHireIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CancelHireDate" minOccurs="0"/>
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
@XmlType(name = "ProposedHireType", propOrder = {
    "expectedDutyEntryDate",
    "cancelHireIndicator",
    "cancelHireDate",
    "userArea"
})
public class ProposedHireType {

    @XmlList
    @XmlElement(name = "ExpectedDutyEntryDate")
    protected List<String> expectedDutyEntryDate;
    @XmlElement(name = "CancelHireIndicator")
    protected TrueValueEnumType cancelHireIndicator;
    @XmlList
    @XmlElement(name = "CancelHireDate")
    protected List<String> cancelHireDate;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the expectedDutyEntryDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expectedDutyEntryDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedDutyEntryDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExpectedDutyEntryDate() {
        if (expectedDutyEntryDate == null) {
            expectedDutyEntryDate = new ArrayList<String>();
        }
        return this.expectedDutyEntryDate;
    }

    /**
     * Gets the value of the cancelHireIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TrueValueEnumType }
     *     
     */
    public TrueValueEnumType getCancelHireIndicator() {
        return cancelHireIndicator;
    }

    /**
     * Sets the value of the cancelHireIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueValueEnumType }
     *     
     */
    public void setCancelHireIndicator(TrueValueEnumType value) {
        this.cancelHireIndicator = value;
    }

    /**
     * Gets the value of the cancelHireDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelHireDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelHireDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCancelHireDate() {
        if (cancelHireDate == null) {
            cancelHireDate = new ArrayList<String>();
        }
        return this.cancelHireDate;
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
