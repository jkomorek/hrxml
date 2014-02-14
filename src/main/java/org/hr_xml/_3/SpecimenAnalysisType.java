//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.MeasureType;


/**
 * <p>Java class for SpecimenAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecimenAnalysisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}CreatinineLevel" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SpecificGravity" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}pHLevel" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Interferent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}InsufficientQuantityIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DrugTestComment" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SpecimenAnalysisType", propOrder = {
    "creatinineLevel",
    "specificGravity",
    "phLevel",
    "interferent",
    "insufficientQuantityIndicator",
    "drugTestComment",
    "userArea"
})
public class SpecimenAnalysisType {

    @XmlElement(name = "CreatinineLevel")
    protected MeasureType creatinineLevel;
    @XmlElement(name = "SpecificGravity")
    protected BigDecimal specificGravity;
    @XmlElement(name = "pHLevel")
    protected BigDecimal phLevel;
    @XmlElement(name = "Interferent")
    protected List<InterferentType> interferent;
    @XmlElement(name = "InsufficientQuantityIndicator")
    protected Boolean insufficientQuantityIndicator;
    @XmlElement(name = "DrugTestComment")
    protected List<ScreeningCommentType> drugTestComment;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Creatinine is a protein produced by muscle and released into the blood. A below normal level of Creatinine in urine may indicate that it has been adulterated.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCreatinineLevel() {
        return creatinineLevel;
    }

    /**
     * Sets the value of the creatinineLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCreatinineLevel(MeasureType value) {
        this.creatinineLevel = value;
    }

    /**
     * Specific gravity is a measure of density.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecificGravity() {
        return specificGravity;
    }

    /**
     * Sets the value of the specificGravity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpecificGravity(BigDecimal value) {
        this.specificGravity = value;
    }

    /**
     * A measure of how acidic or alkaline a solution is. The ph scale goes from 0 to 14, where 7.0 is neutral. A pH of 0 to 7 is acidic, and 7 to 14 is alkaline. 
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPHLevel() {
        return phLevel;
    }

    /**
     * Sets the value of the phLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPHLevel(BigDecimal value) {
        this.phLevel = value;
    }

    /**
     * Gets the value of the interferent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interferent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterferent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterferentType }
     * 
     * 
     */
    public List<InterferentType> getInterferent() {
        if (interferent == null) {
            interferent = new ArrayList<InterferentType>();
        }
        return this.interferent;
    }

    /**
     * An indicator that there is not a sufficient quantity of the specimen to perform one or more of the required tests.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsufficientQuantityIndicator() {
        return insufficientQuantityIndicator;
    }

    /**
     * Sets the value of the insufficientQuantityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsufficientQuantityIndicator(Boolean value) {
        this.insufficientQuantityIndicator = value;
    }

    /**
     * Gets the value of the drugTestComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugTestComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugTestComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningCommentType }
     * 
     * 
     */
    public List<ScreeningCommentType> getDrugTestComment() {
        if (drugTestComment == null) {
            drugTestComment = new ArrayList<ScreeningCommentType>();
        }
        return this.drugTestComment;
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
