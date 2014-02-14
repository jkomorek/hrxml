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


/**
 * <p>Java class for DisabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}DisabilityIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DisabilitySummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisabilityType", propOrder = {
    "disabilityIndicator",
    "disabilitySummary"
})
public class DisabilityType {

    @XmlElement(name = "DisabilityIndicator")
    protected EffectiveDatedIndicatorType disabilityIndicator;
    @XmlElement(name = "DisabilitySummary")
    protected List<DisabilitySummaryType> disabilitySummary;

    /**
     * Gets the value of the disabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDatedIndicatorType }
     *     
     */
    public EffectiveDatedIndicatorType getDisabilityIndicator() {
        return disabilityIndicator;
    }

    /**
     * Sets the value of the disabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDatedIndicatorType }
     *     
     */
    public void setDisabilityIndicator(EffectiveDatedIndicatorType value) {
        this.disabilityIndicator = value;
    }

    /**
     * Gets the value of the disabilitySummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilitySummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilitySummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisabilitySummaryType }
     * 
     * 
     */
    public List<DisabilitySummaryType> getDisabilitySummary() {
        if (disabilitySummary == null) {
            disabilitySummary = new ArrayList<DisabilitySummaryType>();
        }
        return this.disabilitySummary;
    }

}
