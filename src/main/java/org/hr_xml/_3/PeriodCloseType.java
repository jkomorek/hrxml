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
import org.openapplications.oagis._9.DescriptionType;


/**
 * <p>Java class for PeriodCloseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodCloseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}FormattedDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PeriodCloseCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodCloseType", propOrder = {
    "formattedDateTime",
    "periodCloseCode",
    "description"
})
public class PeriodCloseType {

    @XmlList
    @XmlElement(name = "FormattedDateTime")
    protected List<String> formattedDateTime;
    @XmlElement(name = "PeriodCloseCode")
    protected PayCycleIntervalCodeType periodCloseCode;
    @XmlElement(name = "Description", namespace = "http://www.openapplications.org/oagis/9")
    protected List<DescriptionType> description;

    /**
     * Gets the value of the formattedDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formattedDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormattedDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFormattedDateTime() {
        if (formattedDateTime == null) {
            formattedDateTime = new ArrayList<String>();
        }
        return this.formattedDateTime;
    }

    /**
     * Gets the value of the periodCloseCode property.
     * 
     * @return
     *     possible object is
     *     {@link PayCycleIntervalCodeType }
     *     
     */
    public PayCycleIntervalCodeType getPeriodCloseCode() {
        return periodCloseCode;
    }

    /**
     * Sets the value of the periodCloseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayCycleIntervalCodeType }
     *     
     */
    public void setPeriodCloseCode(PayCycleIntervalCodeType value) {
        this.periodCloseCode = value;
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

}
