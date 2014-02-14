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
 * <p>Java class for CardBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/9}AccountInformationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Expiration" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}CompanyName" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}PaymentAuthorization" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardBaseType", propOrder = {
    "expiration",
    "companyName",
    "paymentAuthorization"
})
@XmlSeeAlso({
    DebitCardType.class,
    CreditCardType.class
})
public abstract class CardBaseType
    extends AccountInformationType
{

    @XmlElement(name = "Expiration")
    protected ExpirationType expiration;
    @XmlElement(name = "CompanyName")
    protected NameType companyName;
    @XmlElement(name = "PaymentAuthorization")
    protected PaymentAuthorizationType paymentAuthorization;

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationType }
     *     
     */
    public ExpirationType getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationType }
     *     
     */
    public void setExpiration(ExpirationType value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setCompanyName(NameType value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the paymentAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAuthorizationType }
     *     
     */
    public PaymentAuthorizationType getPaymentAuthorization() {
        return paymentAuthorization;
    }

    /**
     * Sets the value of the paymentAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAuthorizationType }
     *     
     */
    public void setPaymentAuthorization(PaymentAuthorizationType value) {
        this.paymentAuthorization = value;
    }

}