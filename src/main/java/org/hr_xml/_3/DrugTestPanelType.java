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
import org.openapplications.oagis._9.CodeType;
import org.openapplications.oagis._9.TextType;


/**
 * <p>Java class for DrugTestPanelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrugTestPanelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}DrugTestPanelID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DrugTestPanelName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DrugTestPanelTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DrugTestRetestIndicator" minOccurs="0"/>
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
@XmlType(name = "DrugTestPanelType", propOrder = {
    "drugTestPanelID",
    "drugTestPanelName",
    "drugTestPanelTypeCode",
    "drugTestRetestIndicator",
    "userArea"
})
public class DrugTestPanelType {

    @XmlElement(name = "DrugTestPanelID")
    protected IdentifierType drugTestPanelID;
    @XmlElement(name = "DrugTestPanelName")
    protected TextType drugTestPanelName;
    @XmlElement(name = "DrugTestPanelTypeCode")
    protected CodeType drugTestPanelTypeCode;
    @XmlElement(name = "DrugTestRetestIndicator")
    protected Boolean drugTestRetestIndicator;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the drugTestPanelID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getDrugTestPanelID() {
        return drugTestPanelID;
    }

    /**
     * Sets the value of the drugTestPanelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setDrugTestPanelID(IdentifierType value) {
        this.drugTestPanelID = value;
    }

    /**
     * Gets the value of the drugTestPanelName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDrugTestPanelName() {
        return drugTestPanelName;
    }

    /**
     * Sets the value of the drugTestPanelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDrugTestPanelName(TextType value) {
        this.drugTestPanelName = value;
    }

    /**
     * Gets the value of the drugTestPanelTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDrugTestPanelTypeCode() {
        return drugTestPanelTypeCode;
    }

    /**
     * Sets the value of the drugTestPanelTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDrugTestPanelTypeCode(CodeType value) {
        this.drugTestPanelTypeCode = value;
    }

    /**
     * Gets the value of the drugTestRetestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrugTestRetestIndicator() {
        return drugTestRetestIndicator;
    }

    /**
     * Sets the value of the drugTestRetestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrugTestRetestIndicator(Boolean value) {
        this.drugTestRetestIndicator = value;
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
