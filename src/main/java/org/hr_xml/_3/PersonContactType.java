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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.TextType;


/**
 * <p>Java class for PersonContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}PersonID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PersonName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RoleName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Communication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserArea" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="contactTypeCode" type="{http://www.openapplications.org/oagis/9}StringType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonContactType", propOrder = {
    "personID",
    "personName",
    "roleName",
    "communication",
    "userArea"
})
public class PersonContactType {

    @XmlElement(name = "PersonID")
    protected IdentifierType personID;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "RoleName")
    protected List<TextType> roleName;
    @XmlElement(name = "Communication")
    protected List<CommunicationABIEType> communication;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "contactTypeCode")
    protected String contactTypeCode;

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPersonID(IdentifierType value) {
        this.personID = value;
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
     * Gets the value of the roleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getRoleName() {
        if (roleName == null) {
            roleName = new ArrayList<TextType>();
        }
        return this.roleName;
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

    /**
     * Gets the value of the contactTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTypeCode() {
        return contactTypeCode;
    }

    /**
     * Sets the value of the contactTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTypeCode(String value) {
        this.contactTypeCode = value;
    }

}
