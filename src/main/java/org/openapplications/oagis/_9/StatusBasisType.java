//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.openapplications.oagis._9;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusBasisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusBasisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Code" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}EffectiveDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}ReasonCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Reason" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusBasisType", propOrder = {
    "code",
    "description",
    "effectiveDateTime",
    "reasonCode",
    "reason"
})
@XmlSeeAlso({
    ChangeStatusType.class,
    StatusABIEType.class
})
public class StatusBasisType {

    @XmlElement(name = "Code")
    protected CodeType code;
    @XmlElement(name = "Description")
    protected DescriptionType description;
    @XmlElement(name = "EffectiveDateTime")
    protected String effectiveDateTime;
    @XmlElement(name = "ReasonCode")
    protected CodeType reasonCode;
    @XmlElement(name = "Reason")
    protected List<TextType> reason;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCode(CodeType value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    /**
     * Gets the value of the effectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Sets the value of the effectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDateTime(String value) {
        this.effectiveDateTime = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setReasonCode(CodeType value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getReason() {
        if (reason == null) {
            reason = new ArrayList<TextType>();
        }
        return this.reason;
    }

}
