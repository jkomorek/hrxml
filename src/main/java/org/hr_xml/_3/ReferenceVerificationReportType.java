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
 * <p>Java class for ReferenceVerificationReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceVerificationReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ScreeningSubjectID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}InputReferenceVerification" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ReferenceVerificationResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceVerificationReportType", propOrder = {
    "screeningSubjectID",
    "inputReferenceVerification",
    "referenceVerificationResult"
})
public class ReferenceVerificationReportType {

    @XmlElement(name = "ScreeningSubjectID")
    protected List<ScreeningIdentifierType> screeningSubjectID;
    @XmlElement(name = "InputReferenceVerification")
    protected InputReferenceVerificationType inputReferenceVerification;
    @XmlElement(name = "ReferenceVerificationResult")
    protected ReferenceVerificationResultType referenceVerificationResult;

    /**
     * Gets the value of the screeningSubjectID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningSubjectID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningSubjectID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningIdentifierType }
     * 
     * 
     */
    public List<ScreeningIdentifierType> getScreeningSubjectID() {
        if (screeningSubjectID == null) {
            screeningSubjectID = new ArrayList<ScreeningIdentifierType>();
        }
        return this.screeningSubjectID;
    }

    /**
     * Gets the value of the inputReferenceVerification property.
     * 
     * @return
     *     possible object is
     *     {@link InputReferenceVerificationType }
     *     
     */
    public InputReferenceVerificationType getInputReferenceVerification() {
        return inputReferenceVerification;
    }

    /**
     * Sets the value of the inputReferenceVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputReferenceVerificationType }
     *     
     */
    public void setInputReferenceVerification(InputReferenceVerificationType value) {
        this.inputReferenceVerification = value;
    }

    /**
     * Gets the value of the referenceVerificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceVerificationResultType }
     *     
     */
    public ReferenceVerificationResultType getReferenceVerificationResult() {
        return referenceVerificationResult;
    }

    /**
     * Sets the value of the referenceVerificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceVerificationResultType }
     *     
     */
    public void setReferenceVerificationResult(ReferenceVerificationResultType value) {
        this.referenceVerificationResult = value;
    }

}
