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
 * <p>Java class for SelectedHealthcareProviderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedHealthcareProviderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}HealthcareProviderID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}HealthcareProviderCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StartDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OrganizationName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PersonName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Communication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}HealthcareProviderRelationshipCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}HealthcareProviderChangeReasonCode" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SelectedHealthcareProviderType", propOrder = {
    "healthcareProviderID",
    "healthcareProviderCode",
    "startDateTime",
    "organizationName",
    "personName",
    "communication",
    "healthcareProviderRelationshipCode",
    "healthcareProviderChangeReasonCode",
    "userArea"
})
public class SelectedHealthcareProviderType {

    @XmlElement(name = "HealthcareProviderID")
    protected IdentifierType healthcareProviderID;
    @XmlElement(name = "HealthcareProviderCode")
    protected List<HealthcareProviderCodeType> healthcareProviderCode;
    @XmlList
    @XmlElement(name = "StartDateTime")
    protected List<String> startDateTime;
    @XmlElement(name = "OrganizationName")
    protected OrganizationNameType organizationName;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "Communication")
    protected List<CommunicationABIEType> communication;
    @XmlElement(name = "HealthcareProviderRelationshipCode")
    protected HealthcareProviderRelationshipCodeType healthcareProviderRelationshipCode;
    @XmlElement(name = "HealthcareProviderChangeReasonCode")
    protected List<HealthcareProviderChangeReasonCodeType> healthcareProviderChangeReasonCode;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the healthcareProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getHealthcareProviderID() {
        return healthcareProviderID;
    }

    /**
     * Sets the value of the healthcareProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setHealthcareProviderID(IdentifierType value) {
        this.healthcareProviderID = value;
    }

    /**
     * Gets the value of the healthcareProviderCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthcareProviderCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthcareProviderCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthcareProviderCodeType }
     * 
     * 
     */
    public List<HealthcareProviderCodeType> getHealthcareProviderCode() {
        if (healthcareProviderCode == null) {
            healthcareProviderCode = new ArrayList<HealthcareProviderCodeType>();
        }
        return this.healthcareProviderCode;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStartDateTime() {
        if (startDateTime == null) {
            startDateTime = new ArrayList<String>();
        }
        return this.startDateTime;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationNameType }
     *     
     */
    public OrganizationNameType getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationNameType }
     *     
     */
    public void setOrganizationName(OrganizationNameType value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationABIEType }
     * 
     * 
     */
    public List<CommunicationABIEType> getCommunication() {
        if (communication == null) {
            communication = new ArrayList<CommunicationABIEType>();
        }
        return this.communication;
    }

    /**
     * Gets the value of the healthcareProviderRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareProviderRelationshipCodeType }
     *     
     */
    public HealthcareProviderRelationshipCodeType getHealthcareProviderRelationshipCode() {
        return healthcareProviderRelationshipCode;
    }

    /**
     * Sets the value of the healthcareProviderRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareProviderRelationshipCodeType }
     *     
     */
    public void setHealthcareProviderRelationshipCode(HealthcareProviderRelationshipCodeType value) {
        this.healthcareProviderRelationshipCode = value;
    }

    /**
     * Gets the value of the healthcareProviderChangeReasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthcareProviderChangeReasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthcareProviderChangeReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthcareProviderChangeReasonCodeType }
     * 
     * 
     */
    public List<HealthcareProviderChangeReasonCodeType> getHealthcareProviderChangeReasonCode() {
        if (healthcareProviderChangeReasonCode == null) {
            healthcareProviderChangeReasonCode = new ArrayList<HealthcareProviderChangeReasonCodeType>();
        }
        return this.healthcareProviderChangeReasonCode;
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
