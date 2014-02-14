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
import org.openapplications.oagis._9.DescriptionType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Position Preference Matching. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contains a collection of information about a candidate's preferences in an position.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for PreferenceMatchingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferenceMatchingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}PreferredLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}JobCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionOfferingTypeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionScheduleTypeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ShiftDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CareerLevelCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}JobGradeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OfferedRemunerationPackage" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}TravelPreference" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RelocationConsidered" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}WorkingLanguageCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PreferenceMatchingType", propOrder = {
    "preferredLocation",
    "jobCategory",
    "positionTitle",
    "positionOfferingTypeCode",
    "positionScheduleTypeCode",
    "shiftDescription",
    "careerLevelCode",
    "jobGradeCode",
    "offeredRemunerationPackage",
    "travelPreference",
    "relocationConsidered",
    "workingLanguageCode",
    "description",
    "userArea"
})
public class PreferenceMatchingType {

    @XmlElement(name = "PreferredLocation")
    protected List<PreferredLocationType> preferredLocation;
    @XmlElement(name = "JobCategory")
    protected List<JobCatgegoryType> jobCategory;
    @XmlElement(name = "PositionTitle")
    protected List<PositionTitleType> positionTitle;
    @XmlElement(name = "PositionOfferingTypeCode")
    protected List<PositionOfferingTypeCodeType> positionOfferingTypeCode;
    @XmlElement(name = "PositionScheduleTypeCode")
    protected List<PositionScheduleCodeType> positionScheduleTypeCode;
    @XmlElement(name = "ShiftDescription")
    protected List<DescriptionType> shiftDescription;
    @XmlElement(name = "CareerLevelCode")
    protected List<CodeType> careerLevelCode;
    @XmlElement(name = "JobGradeCode")
    protected CodeType jobGradeCode;
    @XmlElement(name = "OfferedRemunerationPackage")
    protected OfferedRemunerationPackageType offeredRemunerationPackage;
    @XmlElement(name = "TravelPreference")
    protected TravelPreferenceType travelPreference;
    @XmlElement(name = "RelocationConsidered")
    protected RelocationConsideredType relocationConsidered;
    @XmlElement(name = "WorkingLanguageCode")
    protected List<LanguageCodeType> workingLanguageCode;
    @XmlElement(name = "Description", namespace = "http://www.openapplications.org/oagis/9")
    protected List<DescriptionType> description;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the preferredLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferredLocationType }
     * 
     * 
     */
    public List<PreferredLocationType> getPreferredLocation() {
        if (preferredLocation == null) {
            preferredLocation = new ArrayList<PreferredLocationType>();
        }
        return this.preferredLocation;
    }

    /**
     * Gets the value of the jobCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobCatgegoryType }
     * 
     * 
     */
    public List<JobCatgegoryType> getJobCategory() {
        if (jobCategory == null) {
            jobCategory = new ArrayList<JobCatgegoryType>();
        }
        return this.jobCategory;
    }

    /**
     * Gets the value of the positionTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionTitleType }
     * 
     * 
     */
    public List<PositionTitleType> getPositionTitle() {
        if (positionTitle == null) {
            positionTitle = new ArrayList<PositionTitleType>();
        }
        return this.positionTitle;
    }

    /**
     * Gets the value of the positionOfferingTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionOfferingTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionOfferingTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionOfferingTypeCodeType }
     * 
     * 
     */
    public List<PositionOfferingTypeCodeType> getPositionOfferingTypeCode() {
        if (positionOfferingTypeCode == null) {
            positionOfferingTypeCode = new ArrayList<PositionOfferingTypeCodeType>();
        }
        return this.positionOfferingTypeCode;
    }

    /**
     * Gets the value of the positionScheduleTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionScheduleTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionScheduleTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionScheduleCodeType }
     * 
     * 
     */
    public List<PositionScheduleCodeType> getPositionScheduleTypeCode() {
        if (positionScheduleTypeCode == null) {
            positionScheduleTypeCode = new ArrayList<PositionScheduleCodeType>();
        }
        return this.positionScheduleTypeCode;
    }

    /**
     * Gets the value of the shiftDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shiftDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShiftDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getShiftDescription() {
        if (shiftDescription == null) {
            shiftDescription = new ArrayList<DescriptionType>();
        }
        return this.shiftDescription;
    }

    /**
     * Gets the value of the careerLevelCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careerLevelCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareerLevelCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getCareerLevelCode() {
        if (careerLevelCode == null) {
            careerLevelCode = new ArrayList<CodeType>();
        }
        return this.careerLevelCode;
    }

    /**
     * Gets the value of the jobGradeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getJobGradeCode() {
        return jobGradeCode;
    }

    /**
     * Sets the value of the jobGradeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setJobGradeCode(CodeType value) {
        this.jobGradeCode = value;
    }

    /**
     * Gets the value of the offeredRemunerationPackage property.
     * 
     * @return
     *     possible object is
     *     {@link OfferedRemunerationPackageType }
     *     
     */
    public OfferedRemunerationPackageType getOfferedRemunerationPackage() {
        return offeredRemunerationPackage;
    }

    /**
     * Sets the value of the offeredRemunerationPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferedRemunerationPackageType }
     *     
     */
    public void setOfferedRemunerationPackage(OfferedRemunerationPackageType value) {
        this.offeredRemunerationPackage = value;
    }

    /**
     * Gets the value of the travelPreference property.
     * 
     * @return
     *     possible object is
     *     {@link TravelPreferenceType }
     *     
     */
    public TravelPreferenceType getTravelPreference() {
        return travelPreference;
    }

    /**
     * Sets the value of the travelPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPreferenceType }
     *     
     */
    public void setTravelPreference(TravelPreferenceType value) {
        this.travelPreference = value;
    }

    /**
     * Gets the value of the relocationConsidered property.
     * 
     * @return
     *     possible object is
     *     {@link RelocationConsideredType }
     *     
     */
    public RelocationConsideredType getRelocationConsidered() {
        return relocationConsidered;
    }

    /**
     * Sets the value of the relocationConsidered property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelocationConsideredType }
     *     
     */
    public void setRelocationConsidered(RelocationConsideredType value) {
        this.relocationConsidered = value;
    }

    /**
     * Gets the value of the workingLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workingLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkingLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getWorkingLanguageCode() {
        if (workingLanguageCode == null) {
            workingLanguageCode = new ArrayList<LanguageCodeType>();
        }
        return this.workingLanguageCode;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
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