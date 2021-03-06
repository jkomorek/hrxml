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


/**
 * <p>Java class for StaffingPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffingPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionTitle" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionTypeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ReportsToPosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionStatusCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionStatusDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StaffingAvailability" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionCompetency" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionFormattedDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionScreeningRequirements" minOccurs="0"/>
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
@XmlType(name = "StaffingPositionType", propOrder = {
    "positionID",
    "positionTitle",
    "positionTypeCode",
    "reportsToPosition",
    "positionStatusCode",
    "positionStatusDescription",
    "staffingAvailability",
    "positionCompetency",
    "positionFormattedDescription",
    "positionScreeningRequirements",
    "userArea"
})
public class StaffingPositionType {

    @XmlElement(name = "PositionID")
    protected IdentifierType positionID;
    @XmlElement(name = "PositionTitle")
    protected PositionTitleType positionTitle;
    @XmlElement(name = "PositionTypeCode")
    protected List<CodeType> positionTypeCode;
    @XmlElement(name = "ReportsToPosition")
    protected ReportsToPositionType reportsToPosition;
    @XmlElement(name = "PositionStatusCode")
    protected StatusCodeType positionStatusCode;
    @XmlElement(name = "PositionStatusDescription")
    protected List<String> positionStatusDescription;
    @XmlElement(name = "StaffingAvailability")
    protected StaffingAvailabilityType staffingAvailability;
    @XmlElement(name = "PositionCompetency")
    protected List<PositionCompetencyType> positionCompetency;
    @XmlElement(name = "PositionFormattedDescription")
    protected List<PositionFormattedDescriptionType> positionFormattedDescription;
    @XmlElement(name = "PositionScreeningRequirements")
    protected PositionScreeningRequirementsType positionScreeningRequirements;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the positionID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPositionID() {
        return positionID;
    }

    /**
     * Sets the value of the positionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPositionID(IdentifierType value) {
        this.positionID = value;
    }

    /**
     * Gets the value of the positionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link PositionTitleType }
     *     
     */
    public PositionTitleType getPositionTitle() {
        return positionTitle;
    }

    /**
     * Sets the value of the positionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionTitleType }
     *     
     */
    public void setPositionTitle(PositionTitleType value) {
        this.positionTitle = value;
    }

    /**
     * Gets the value of the positionTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getPositionTypeCode() {
        if (positionTypeCode == null) {
            positionTypeCode = new ArrayList<CodeType>();
        }
        return this.positionTypeCode;
    }

    /**
     * Gets the value of the reportsToPosition property.
     * 
     * @return
     *     possible object is
     *     {@link ReportsToPositionType }
     *     
     */
    public ReportsToPositionType getReportsToPosition() {
        return reportsToPosition;
    }

    /**
     * Sets the value of the reportsToPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportsToPositionType }
     *     
     */
    public void setReportsToPosition(ReportsToPositionType value) {
        this.reportsToPosition = value;
    }

    /**
     * Gets the value of the positionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeType }
     *     
     */
    public StatusCodeType getPositionStatusCode() {
        return positionStatusCode;
    }

    /**
     * Sets the value of the positionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeType }
     *     
     */
    public void setPositionStatusCode(StatusCodeType value) {
        this.positionStatusCode = value;
    }

    /**
     * Gets the value of the positionStatusDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionStatusDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionStatusDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPositionStatusDescription() {
        if (positionStatusDescription == null) {
            positionStatusDescription = new ArrayList<String>();
        }
        return this.positionStatusDescription;
    }

    /**
     * Gets the value of the staffingAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link StaffingAvailabilityType }
     *     
     */
    public StaffingAvailabilityType getStaffingAvailability() {
        return staffingAvailability;
    }

    /**
     * Sets the value of the staffingAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffingAvailabilityType }
     *     
     */
    public void setStaffingAvailability(StaffingAvailabilityType value) {
        this.staffingAvailability = value;
    }

    /**
     * Gets the value of the positionCompetency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionCompetency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionCompetency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionCompetencyType }
     * 
     * 
     */
    public List<PositionCompetencyType> getPositionCompetency() {
        if (positionCompetency == null) {
            positionCompetency = new ArrayList<PositionCompetencyType>();
        }
        return this.positionCompetency;
    }

    /**
     * Gets the value of the positionFormattedDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionFormattedDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionFormattedDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionFormattedDescriptionType }
     * 
     * 
     */
    public List<PositionFormattedDescriptionType> getPositionFormattedDescription() {
        if (positionFormattedDescription == null) {
            positionFormattedDescription = new ArrayList<PositionFormattedDescriptionType>();
        }
        return this.positionFormattedDescription;
    }

    /**
     * Gets the value of the positionScreeningRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link PositionScreeningRequirementsType }
     *     
     */
    public PositionScreeningRequirementsType getPositionScreeningRequirements() {
        return positionScreeningRequirements;
    }

    /**
     * Sets the value of the positionScreeningRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionScreeningRequirementsType }
     *     
     */
    public void setPositionScreeningRequirements(PositionScreeningRequirementsType value) {
        this.positionScreeningRequirements = value;
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
