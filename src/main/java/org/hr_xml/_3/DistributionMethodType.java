//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.openapplications.oagis._9.MeasureType;


/**
 * <p>Java class for DistributionMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}LumpSumIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}InstallmentNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DistributionPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DistributionYear" minOccurs="0"/>
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
@XmlType(name = "DistributionMethodType", propOrder = {
    "lumpSumIndicator",
    "installmentNumber",
    "distributionPeriod",
    "distributionYear",
    "userArea"
})
public class DistributionMethodType {

    @XmlElement(name = "LumpSumIndicator")
    protected Boolean lumpSumIndicator;
    @XmlElement(name = "InstallmentNumber")
    protected MeasureType installmentNumber;
    @XmlElement(name = "DistributionPeriod")
    protected FreeFormEffectivePeriodType distributionPeriod;
    @XmlElement(name = "DistributionYear")
    protected XMLGregorianCalendar distributionYear;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the lumpSumIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLumpSumIndicator() {
        return lumpSumIndicator;
    }

    /**
     * Sets the value of the lumpSumIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLumpSumIndicator(Boolean value) {
        this.lumpSumIndicator = value;
    }

    /**
     * Gets the value of the installmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInstallmentNumber() {
        return installmentNumber;
    }

    /**
     * Sets the value of the installmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInstallmentNumber(MeasureType value) {
        this.installmentNumber = value;
    }

    /**
     * Gets the value of the distributionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormEffectivePeriodType }
     *     
     */
    public FreeFormEffectivePeriodType getDistributionPeriod() {
        return distributionPeriod;
    }

    /**
     * Sets the value of the distributionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormEffectivePeriodType }
     *     
     */
    public void setDistributionPeriod(FreeFormEffectivePeriodType value) {
        this.distributionPeriod = value;
    }

    /**
     * Gets the value of the distributionYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDistributionYear() {
        return distributionYear;
    }

    /**
     * Sets the value of the distributionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDistributionYear(XMLGregorianCalendar value) {
        this.distributionYear = value;
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
