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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentAuthorizationABIEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentAuthorizationABIEType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/9}AuthorizationABIEType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}ReferenceOrderNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}RevenueSourceID" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}RemittanceBankID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentAuthorizationABIEType", propOrder = {
    "referenceOrderNumber",
    "revenueSourceID",
    "remittanceBankID"
})
@XmlSeeAlso({
    PaymentAuthorizationType.class
})
public class PaymentAuthorizationABIEType
    extends AuthorizationABIEType
{

    @XmlElement(name = "ReferenceOrderNumber")
    protected IdentifierType referenceOrderNumber;
    @XmlElement(name = "RevenueSourceID")
    protected IdentifierType revenueSourceID;
    @XmlElement(name = "RemittanceBankID")
    protected IdentifierType remittanceBankID;

    /**
     * Gets the value of the referenceOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getReferenceOrderNumber() {
        return referenceOrderNumber;
    }

    /**
     * Sets the value of the referenceOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setReferenceOrderNumber(IdentifierType value) {
        this.referenceOrderNumber = value;
    }

    /**
     * Gets the value of the revenueSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getRevenueSourceID() {
        return revenueSourceID;
    }

    /**
     * Sets the value of the revenueSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setRevenueSourceID(IdentifierType value) {
        this.revenueSourceID = value;
    }

    /**
     * Gets the value of the remittanceBankID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getRemittanceBankID() {
        return remittanceBankID;
    }

    /**
     * Sets the value of the remittanceBankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setRemittanceBankID(IdentifierType value) {
        this.remittanceBankID = value;
    }

}
