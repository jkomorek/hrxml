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
import org.openapplications.oagis._9.CodeType;
import org.openapplications.oagis._9.CountrySubDivisionCodeType;
import org.openapplications.oagis._9.NameType;


/**
 * A base location from which a distance, communting time, or travel directions, etc. is calculated.
 * 
 * <p>Java class for ReferenceLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}LocationID" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}CityName" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}CountrySubDivisionCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}PostalCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SpatialLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceLocationType", propOrder = {
    "locationID",
    "cityName",
    "countrySubDivisionCode",
    "countryCode",
    "postalCode",
    "spatialLocation"
})
public class ReferenceLocationType {

    @XmlElement(name = "LocationID")
    protected IdentifierType locationID;
    @XmlElement(name = "CityName", namespace = "http://www.openapplications.org/oagis/9")
    protected NameType cityName;
    @XmlElement(name = "CountrySubDivisionCode", namespace = "http://www.openapplications.org/oagis/9")
    protected List<CountrySubDivisionCodeType> countrySubDivisionCode;
    @XmlElement(name = "CountryCode")
    protected CountryCodeType countryCode;
    @XmlElement(name = "PostalCode", namespace = "http://www.openapplications.org/oagis/9")
    protected CodeType postalCode;
    @XmlElement(name = "SpatialLocation")
    protected SpatialLocationType spatialLocation;

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setLocationID(IdentifierType value) {
        this.locationID = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countrySubDivisionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountrySubDivisionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountrySubDivisionCodeType }
     * 
     * 
     */
    public List<CountrySubDivisionCodeType> getCountrySubDivisionCode() {
        if (countrySubDivisionCode == null) {
            countrySubDivisionCode = new ArrayList<CountrySubDivisionCodeType>();
        }
        return this.countrySubDivisionCode;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
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
     * Gets the value of the spatialLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialLocationType }
     *     
     */
    public SpatialLocationType getSpatialLocation() {
        return spatialLocation;
    }

    /**
     * Sets the value of the spatialLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialLocationType }
     *     
     */
    public void setSpatialLocation(SpatialLocationType value) {
        this.spatialLocation = value;
    }

}
