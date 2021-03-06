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
 * HazardousMaterialABIEType is logically derived from UN/CEFACT TBG17 ABIE 
 * HazardousMaterialType as defined in the Reusable Aggregate Business Information Entity (RUABIE) XML Schema file.
 * 
 * <p>Java class for HazardousMaterialABIEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousMaterialABIEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}MFAGID" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}TechnicalName" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}PlacardEndorsement" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}PlacardNotation" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}MarinePollutionLevelCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}ToxicityZoneCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Temperature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}FlashpointTemperature" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}PrimaryEntryRoute" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}EmergencyContact" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousMaterialABIEType", propOrder = {
    "id",
    "mfagid",
    "technicalName",
    "placardEndorsement",
    "placardNotation",
    "marinePollutionLevelCode",
    "toxicityZoneCode",
    "temperature",
    "flashpointTemperature",
    "primaryEntryRoute",
    "description",
    "emergencyContact"
})
@XmlSeeAlso({
    HazardousMaterialType.class
})
public class HazardousMaterialABIEType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "MFAGID")
    protected IdentifierType mfagid;
    @XmlElement(name = "TechnicalName")
    protected NameType technicalName;
    @XmlElement(name = "PlacardEndorsement")
    protected TextType placardEndorsement;
    @XmlElement(name = "PlacardNotation")
    protected TextType placardNotation;
    @XmlElement(name = "MarinePollutionLevelCode")
    protected CodeType marinePollutionLevelCode;
    @XmlElement(name = "ToxicityZoneCode")
    protected CodeType toxicityZoneCode;
    @XmlElement(name = "Temperature")
    protected List<TemperatureMeasureType> temperature;
    @XmlElement(name = "FlashpointTemperature")
    protected TemperatureMeasureType flashpointTemperature;
    @XmlElement(name = "PrimaryEntryRoute")
    protected TextType primaryEntryRoute;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "EmergencyContact")
    protected ContactType emergencyContact;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setID(IdentifierType value) {
        this.id = value;
    }

    /**
     * Gets the value of the mfagid property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getMFAGID() {
        return mfagid;
    }

    /**
     * Sets the value of the mfagid property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setMFAGID(IdentifierType value) {
        this.mfagid = value;
    }

    /**
     * Gets the value of the technicalName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getTechnicalName() {
        return technicalName;
    }

    /**
     * Sets the value of the technicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setTechnicalName(NameType value) {
        this.technicalName = value;
    }

    /**
     * Gets the value of the placardEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPlacardEndorsement() {
        return placardEndorsement;
    }

    /**
     * Sets the value of the placardEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPlacardEndorsement(TextType value) {
        this.placardEndorsement = value;
    }

    /**
     * Gets the value of the placardNotation property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPlacardNotation() {
        return placardNotation;
    }

    /**
     * Sets the value of the placardNotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPlacardNotation(TextType value) {
        this.placardNotation = value;
    }

    /**
     * Gets the value of the marinePollutionLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMarinePollutionLevelCode() {
        return marinePollutionLevelCode;
    }

    /**
     * Sets the value of the marinePollutionLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMarinePollutionLevelCode(CodeType value) {
        this.marinePollutionLevelCode = value;
    }

    /**
     * Gets the value of the toxicityZoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getToxicityZoneCode() {
        return toxicityZoneCode;
    }

    /**
     * Sets the value of the toxicityZoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setToxicityZoneCode(CodeType value) {
        this.toxicityZoneCode = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureMeasureType }
     * 
     * 
     */
    public List<TemperatureMeasureType> getTemperature() {
        if (temperature == null) {
            temperature = new ArrayList<TemperatureMeasureType>();
        }
        return this.temperature;
    }

    /**
     * Gets the value of the flashpointTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public TemperatureMeasureType getFlashpointTemperature() {
        return flashpointTemperature;
    }

    /**
     * Sets the value of the flashpointTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureMeasureType }
     *     
     */
    public void setFlashpointTemperature(TemperatureMeasureType value) {
        this.flashpointTemperature = value;
    }

    /**
     * Gets the value of the primaryEntryRoute property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPrimaryEntryRoute() {
        return primaryEntryRoute;
    }

    /**
     * Sets the value of the primaryEntryRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPrimaryEntryRoute(TextType value) {
        this.primaryEntryRoute = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the emergencyContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * Sets the value of the emergencyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setEmergencyContact(ContactType value) {
        this.emergencyContact = value;
    }

}
