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
import org.openapplications.oagis._9.CodeType;
import org.openapplications.oagis._9.NameType;
import org.openapplications.oagis._9.TextType;


/**
 * <p>Java class for WorkSiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkSiteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Address" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}TravelDirections" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ParkingInstructions" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}WorkEnvironmentTypeCode" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "WorkSiteType", propOrder = {
    "id",
    "name",
    "address",
    "travelDirections",
    "parkingInstructions",
    "workEnvironmentTypeCode",
    "additionalItem"
})
public class WorkSiteType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Name", namespace = "http://www.openapplications.org/oagis/9")
    protected NameType name;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "TravelDirections")
    protected TextType travelDirections;
    @XmlElement(name = "ParkingInstructions")
    protected TextType parkingInstructions;
    @XmlElement(name = "WorkEnvironmentTypeCode")
    protected List<CodeType> workEnvironmentTypeCode;
    @XmlElement(name = "AdditionalItem")
    protected List<AdditionalItemType> additionalItem;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setID(IdentifierType value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the travelDirections property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getTravelDirections() {
        return travelDirections;
    }

    /**
     * Sets the value of the travelDirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setTravelDirections(TextType value) {
        this.travelDirections = value;
    }

    /**
     * Gets the value of the parkingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getParkingInstructions() {
        return parkingInstructions;
    }

    /**
     * Sets the value of the parkingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setParkingInstructions(TextType value) {
        this.parkingInstructions = value;
    }

    /**
     * Gets the value of the workEnvironmentTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workEnvironmentTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkEnvironmentTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getWorkEnvironmentTypeCode() {
        if (workEnvironmentTypeCode == null) {
            workEnvironmentTypeCode = new ArrayList<CodeType>();
        }
        return this.workEnvironmentTypeCode;
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
