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


/**
 * <p>Java class for PositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}DegreeMeasure" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}MinuteMeasure" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}SecondMeasure" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}DirectionCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionType", propOrder = {
    "degreeMeasure",
    "minuteMeasure",
    "secondMeasure",
    "directionCode"
})
public class PositionType {

    @XmlElement(name = "DegreeMeasure")
    protected MeasureType degreeMeasure;
    @XmlElement(name = "MinuteMeasure")
    protected MeasureType minuteMeasure;
    @XmlElement(name = "SecondMeasure")
    protected MeasureType secondMeasure;
    @XmlElement(name = "DirectionCode")
    protected CodeType directionCode;

    /**
     * Gets the value of the degreeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDegreeMeasure() {
        return degreeMeasure;
    }

    /**
     * Sets the value of the degreeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDegreeMeasure(MeasureType value) {
        this.degreeMeasure = value;
    }

    /**
     * Gets the value of the minuteMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinuteMeasure() {
        return minuteMeasure;
    }

    /**
     * Sets the value of the minuteMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMinuteMeasure(MeasureType value) {
        this.minuteMeasure = value;
    }

    /**
     * Gets the value of the secondMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSecondMeasure() {
        return secondMeasure;
    }

    /**
     * Sets the value of the secondMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSecondMeasure(MeasureType value) {
        this.secondMeasure = value;
    }

    /**
     * Gets the value of the directionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDirectionCode() {
        return directionCode;
    }

    /**
     * Sets the value of the directionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDirectionCode(CodeType value) {
        this.directionCode = value;
    }

}
