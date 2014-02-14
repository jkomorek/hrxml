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
import org.openapplications.oagis._9.TimePeriodType;


/**
 * <p>Java class for ObjectivesSectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectivesSectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SectionTitle" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SectionSummaryResult" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}TimePeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ObjectiveResultGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ObjectiveResult" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ObjectivesSectionType", propOrder = {
    "id",
    "sectionTitle",
    "sectionSummaryResult",
    "timePeriod",
    "objectiveResultGroup",
    "objectiveResult",
    "userArea"
})
public class ObjectivesSectionType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "SectionTitle")
    protected String sectionTitle;
    @XmlElement(name = "SectionSummaryResult")
    protected SectionSummaryResultType sectionSummaryResult;
    @XmlElement(name = "TimePeriod", namespace = "http://www.openapplications.org/oagis/9")
    protected TimePeriodType timePeriod;
    @XmlElement(name = "ObjectiveResultGroup")
    protected List<ObjectiveResultGroupType> objectiveResultGroup;
    @XmlElement(name = "ObjectiveResult")
    protected List<ObjectiveResultType> objectiveResult;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

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
     * Gets the value of the sectionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionTitle() {
        return sectionTitle;
    }

    /**
     * Sets the value of the sectionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionTitle(String value) {
        this.sectionTitle = value;
    }

    /**
     * Gets the value of the sectionSummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link SectionSummaryResultType }
     *     
     */
    public SectionSummaryResultType getSectionSummaryResult() {
        return sectionSummaryResult;
    }

    /**
     * Sets the value of the sectionSummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionSummaryResultType }
     *     
     */
    public void setSectionSummaryResult(SectionSummaryResultType value) {
        this.sectionSummaryResult = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the objectiveResultGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectiveResultGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectiveResultGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectiveResultGroupType }
     * 
     * 
     */
    public List<ObjectiveResultGroupType> getObjectiveResultGroup() {
        if (objectiveResultGroup == null) {
            objectiveResultGroup = new ArrayList<ObjectiveResultGroupType>();
        }
        return this.objectiveResultGroup;
    }

    /**
     * Gets the value of the objectiveResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectiveResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectiveResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectiveResultType }
     * 
     * 
     */
    public List<ObjectiveResultType> getObjectiveResult() {
        if (objectiveResult == null) {
            objectiveResult = new ArrayList<ObjectiveResultType>();
        }
        return this.objectiveResult;
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