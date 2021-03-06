//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.openapplications.oagis._9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for TimeToleranceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeToleranceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}UnderDuration"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}OverDuration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeToleranceType", propOrder = {
    "underDuration",
    "overDuration"
})
public class TimeToleranceType {

    @XmlElement(name = "UnderDuration", required = true)
    protected Duration underDuration;
    @XmlElement(name = "OverDuration", required = true)
    protected Duration overDuration;

    /**
     * Gets the value of the underDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getUnderDuration() {
        return underDuration;
    }

    /**
     * Sets the value of the underDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setUnderDuration(Duration value) {
        this.underDuration = value;
    }

    /**
     * Gets the value of the overDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOverDuration() {
        return overDuration;
    }

    /**
     * Sets the value of the overDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOverDuration(Duration value) {
        this.overDuration = value;
    }

}
