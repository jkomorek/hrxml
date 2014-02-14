//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openapplications.oagis._9.CodeType;
import org.openapplications.oagis._9.CountrySubDivisionCodeType;
import org.openapplications.oagis._9.NameType;
import org.openapplications.oagis._9.SequencedTextType;
import org.openapplications.oagis._9.TextType;


/**
 * Address BaseType provides the information about the address or semantic address of an associated entity.
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Based on OAGIS AddressBaseType.  Exception:CountryCode uses the HR country code list.&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * Example values are:
 * 		
 * "Residence Address"   Residence Address is a primary, legal address that is related to a party.  For a person, the Home Residence Address is used by an employer for payroll, taxation, and benefit program eligibility.
 * 
 * "Postal Address"   Set of precise and complete information on the basis of which an item can be forwarded and delivered to an addressee.  An address will be considered a postal address only if it is explicitly collected as such.
 * 
 * "Delivery Address"   Delivery Address is an address which is to be used to physically deliver the related object.
 * 
 * "Bill To"  An address to which invoices are sent.
 * 
 * "Accounts Recievable"   An address to which payments are set. 
 * &lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for SubmitterAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitterAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}AddressLine" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Unit" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}CityName" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}CountrySubDivisionCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}PostalCode" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="languageCode" type="{http://www.hr-xml.org/3}LanguageCodeContentType" />
 *       &lt;attribute name="type" type="{http://www.openapplications.org/oagis/9}NormalizedStringType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitterAddressType", propOrder = {
    "addressLine",
    "unit",
    "cityName",
    "countrySubDivisionCode",
    "postalCode"
})
public class SubmitterAddressType {

    @XmlElement(name = "AddressLine", namespace = "http://www.openapplications.org/oagis/9")
    protected SequencedTextType addressLine;
    @XmlElement(name = "Unit", namespace = "http://www.openapplications.org/oagis/9")
    protected TextType unit;
    @XmlElement(name = "CityName", namespace = "http://www.openapplications.org/oagis/9")
    protected NameType cityName;
    @XmlElement(name = "CountrySubDivisionCode", namespace = "http://www.openapplications.org/oagis/9")
    protected CountrySubDivisionCodeType countrySubDivisionCode;
    @XmlElement(name = "PostalCode", namespace = "http://www.openapplications.org/oagis/9")
    protected CodeType postalCode;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String type;

    /**
     * Gets the value of the addressLine property.
     * 
     * @return
     *     possible object is
     *     {@link SequencedTextType }
     *     
     */
    public SequencedTextType getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the value of the addressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequencedTextType }
     *     
     */
    public void setAddressLine(SequencedTextType value) {
        this.addressLine = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setUnit(TextType value) {
        this.unit = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setCityName(NameType value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the countrySubDivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubDivisionCodeType }
     *     
     */
    public CountrySubDivisionCodeType getCountrySubDivisionCode() {
        return countrySubDivisionCode;
    }

    /**
     * Sets the value of the countrySubDivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubDivisionCodeType }
     *     
     */
    public void setCountrySubDivisionCode(CountrySubDivisionCodeType value) {
        this.countrySubDivisionCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPostalCode(CodeType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
