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
import org.openapplications.oagis._9.NoteType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Hire. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contains a collection of information describing the start
 * 				of an employment relationship between a person and an employer.&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for HireType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HireType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}HireTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}HireDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OriginalHireDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AdjustedHireDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DutyEntryDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Comment" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "HireType", propOrder = {
    "hireTypeCode",
    "hireDate",
    "originalHireDate",
    "adjustedHireDate",
    "dutyEntryDate",
    "comment",
    "userArea"
})
public class HireType {

    @XmlElement(name = "HireTypeCode")
    protected HireTypeCodeType hireTypeCode;
    @XmlList
    @XmlElement(name = "HireDate")
    protected List<String> hireDate;
    @XmlList
    @XmlElement(name = "OriginalHireDate")
    protected List<String> originalHireDate;
    @XmlElement(name = "AdjustedHireDate")
    protected FreeFormTypeDateType adjustedHireDate;
    @XmlList
    @XmlElement(name = "DutyEntryDate")
    protected List<String> dutyEntryDate;
    @XmlElement(name = "Comment")
    protected List<NoteType> comment;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the hireTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link HireTypeCodeType }
     *     
     */
    public HireTypeCodeType getHireTypeCode() {
        return hireTypeCode;
    }

    /**
     * Sets the value of the hireTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HireTypeCodeType }
     *     
     */
    public void setHireTypeCode(HireTypeCodeType value) {
        this.hireTypeCode = value;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hireDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHireDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHireDate() {
        if (hireDate == null) {
            hireDate = new ArrayList<String>();
        }
        return this.hireDate;
    }

    /**
     * Gets the value of the originalHireDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originalHireDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalHireDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOriginalHireDate() {
        if (originalHireDate == null) {
            originalHireDate = new ArrayList<String>();
        }
        return this.originalHireDate;
    }

    /**
     * Gets the value of the adjustedHireDate property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormTypeDateType }
     *     
     */
    public FreeFormTypeDateType getAdjustedHireDate() {
        return adjustedHireDate;
    }

    /**
     * Sets the value of the adjustedHireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormTypeDateType }
     *     
     */
    public void setAdjustedHireDate(FreeFormTypeDateType value) {
        this.adjustedHireDate = value;
    }

    /**
     * Gets the value of the dutyEntryDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutyEntryDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutyEntryDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDutyEntryDate() {
        if (dutyEntryDate == null) {
            dutyEntryDate = new ArrayList<String>();
        }
        return this.dutyEntryDate;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getComment() {
        if (comment == null) {
            comment = new ArrayList<NoteType>();
        }
        return this.comment;
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