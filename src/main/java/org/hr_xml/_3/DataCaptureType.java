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


/**
 * Contains information about data capture. Essentially this identifies whether the document was produced through an automatic extraction process and if so, the date of the generated document and the identification of the supplier.
 * 
 * <p>Java class for DataCaptureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataCaptureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}SupplierPartyID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DataCaptureMethodCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}FormattedDateTime" minOccurs="0"/>
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
@XmlType(name = "DataCaptureType", propOrder = {
    "supplierPartyID",
    "dataCaptureMethodCode",
    "formattedDateTime",
    "userArea"
})
public class DataCaptureType {

    @XmlElement(name = "SupplierPartyID")
    protected IdentifierType supplierPartyID;
    @XmlElement(name = "DataCaptureMethodCode")
    protected DataCaptureMethodCodeType dataCaptureMethodCode;
    @XmlList
    @XmlElement(name = "FormattedDateTime")
    protected List<String> formattedDateTime;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * In this context, the supplier party is the supplier of the data capture or information
     * 			extraction services. For example, the name of a resume parsing service.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSupplierPartyID() {
        return supplierPartyID;
    }

    /**
     * Sets the value of the supplierPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSupplierPartyID(IdentifierType value) {
        this.supplierPartyID = value;
    }

    /**
     * Gets the value of the dataCaptureMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link DataCaptureMethodCodeType }
     *     
     */
    public DataCaptureMethodCodeType getDataCaptureMethodCode() {
        return dataCaptureMethodCode;
    }

    /**
     * Sets the value of the dataCaptureMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataCaptureMethodCodeType }
     *     
     */
    public void setDataCaptureMethodCode(DataCaptureMethodCodeType value) {
        this.dataCaptureMethodCode = value;
    }

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