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
import org.openapplications.oagis._9.TextType;


/**
 * A set of information describing options and characteristics relating to the way an assessment result is provided. For example, the language or available languages of the assessment report; the period for which the result is recognized as valid or reliable, the name or identity of the scoring profile used in calculating the result; etc.
 * 
 * <p>Java class for AssessmentFulfillmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentFulfillmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}EffectivePeriodDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ScoreProfileName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ReportLanguageCode" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AssessmentFulfillmentType", propOrder = {
    "description",
    "effectivePeriodDescription",
    "scoreProfileName",
    "reportLanguageCode",
    "userArea"
})
public class AssessmentFulfillmentType {

    @XmlElement(name = "Description", namespace = "http://www.openapplications.org/oagis/9")
    protected List<DescriptionType> description;
    @XmlElement(name = "EffectivePeriodDescription")
    protected List<MeasureTextType> effectivePeriodDescription;
    @XmlElement(name = "ScoreProfileName")
    protected List<TextType> scoreProfileName;
    @XmlElement(name = "ReportLanguageCode")
    protected List<LanguageCodeType> reportLanguageCode;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

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
     * Gets the value of the effectivePeriodDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectivePeriodDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectivePeriodDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureTextType }
     * 
     * 
     */
    public List<MeasureTextType> getEffectivePeriodDescription() {
        if (effectivePeriodDescription == null) {
            effectivePeriodDescription = new ArrayList<MeasureTextType>();
        }
        return this.effectivePeriodDescription;
    }

    /**
     * Gets the value of the scoreProfileName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreProfileName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreProfileName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getScoreProfileName() {
        if (scoreProfileName == null) {
            scoreProfileName = new ArrayList<TextType>();
        }
        return this.scoreProfileName;
    }

    /**
     * Gets the value of the reportLanguageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportLanguageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportLanguageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCodeType }
     * 
     * 
     */
    public List<LanguageCodeType> getReportLanguageCode() {
        if (reportLanguageCode == null) {
            reportLanguageCode = new ArrayList<LanguageCodeType>();
        }
        return this.reportLanguageCode;
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
