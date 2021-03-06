//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * Allows assignment of work performed on a "physical" time interval or day to another "logical" day. Current (Start Date), Next (Start Date plus 1), Previous (Start Date minus 1)  It is important to know for purposes of calculating pay which day should be considered the working day. For instance 10pm Sat to 6am Sun. Do we pay at time plus one half for Sat, or double time for Sun. The indicator will allow the pay system to make this determination.
 * 
 * <p>Java class for EffectiveTimeEventDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EffectiveTimeEventDateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.hr-xml.org/3}EffectiveDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DayNumberWithinYear" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DayRelativeToActualDateTime" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectiveTimeEventDateType", propOrder = {
    "effectiveDateTime",
    "dayNumberWithinYear",
    "dayRelativeToActualDateTime"
})
public class EffectiveTimeEventDateType {

    @XmlList
    @XmlElement(name = "EffectiveDateTime")
    protected List<String> effectiveDateTime;
    @XmlElement(name = "DayNumberWithinYear")
    protected BigInteger dayNumberWithinYear;
    @XmlElement(name = "DayRelativeToActualDateTime")
    protected DayAssignmentEnumType dayRelativeToActualDateTime;

    /**
     * Gets the value of the effectiveDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEffectiveDateTime() {
        if (effectiveDateTime == null) {
            effectiveDateTime = new ArrayList<String>();
        }
        return this.effectiveDateTime;
    }

    /**
     * Gets the value of the dayNumberWithinYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayNumberWithinYear() {
        return dayNumberWithinYear;
    }

    /**
     * Sets the value of the dayNumberWithinYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayNumberWithinYear(BigInteger value) {
        this.dayNumberWithinYear = value;
    }

    /**
     * Gets the value of the dayRelativeToActualDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DayAssignmentEnumType }
     *     
     */
    public DayAssignmentEnumType getDayRelativeToActualDateTime() {
        return dayRelativeToActualDateTime;
    }

    /**
     * Sets the value of the dayRelativeToActualDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayAssignmentEnumType }
     *     
     */
    public void setDayRelativeToActualDateTime(DayAssignmentEnumType value) {
        this.dayRelativeToActualDateTime = value;
    }

}
