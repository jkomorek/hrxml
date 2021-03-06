//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoreThresholdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreThresholdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinimumThreshold" type="{http://www.openapplications.org/oagis/9}NumericType"/>
 *         &lt;element name="MaximumThreshold" type="{http://www.openapplications.org/oagis/9}NumericType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreThresholdType", propOrder = {
    "minimumThreshold",
    "maximumThreshold"
})
public class ScoreThresholdType {

    @XmlElement(name = "MinimumThreshold", required = true)
    protected BigDecimal minimumThreshold;
    @XmlElement(name = "MaximumThreshold", required = true)
    protected BigDecimal maximumThreshold;

    /**
     * Gets the value of the minimumThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumThreshold() {
        return minimumThreshold;
    }

    /**
     * Sets the value of the minimumThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumThreshold(BigDecimal value) {
        this.minimumThreshold = value;
    }

    /**
     * Gets the value of the maximumThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumThreshold() {
        return maximumThreshold;
    }

    /**
     * Sets the value of the maximumThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumThreshold(BigDecimal value) {
        this.maximumThreshold = value;
    }

}
