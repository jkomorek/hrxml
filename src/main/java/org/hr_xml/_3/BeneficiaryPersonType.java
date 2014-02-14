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
 * <p>Java class for BeneficiaryPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryPersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}PersonID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PriorIncorrectPersonID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PersonLegalID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PriorIncorrectPersonLegalID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PersonName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Communication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}BirthDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DependentRelationshipCode" minOccurs="0"/>
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
@XmlType(name = "BeneficiaryPersonType", propOrder = {
    "personID",
    "priorIncorrectPersonID",
    "personLegalID",
    "priorIncorrectPersonLegalID",
    "personName",
    "communication",
    "birthDate",
    "dependentRelationshipCode",
    "userArea"
})
public class BeneficiaryPersonType {

    @XmlElement(name = "PersonID")
    protected List<IdentifierType> personID;
    @XmlElement(name = "PriorIncorrectPersonID")
    protected List<IdentifierType> priorIncorrectPersonID;
    @XmlElement(name = "PersonLegalID")
    protected List<IdentifierType> personLegalID;
    @XmlElement(name = "PriorIncorrectPersonLegalID")
    protected List<IdentifierType> priorIncorrectPersonLegalID;
    @XmlElement(name = "PersonName")
    protected List<PersonNameType> personName;
    @XmlElement(name = "Communication")
    protected List<CommunicationABIEType> communication;
    @XmlList
    @XmlElement(name = "BirthDate")
    protected List<String> birthDate;
    @XmlElement(name = "DependentRelationshipCode")
    protected DependentRelationshipCodeType dependentRelationshipCode;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the personID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getPersonID() {
        if (personID == null) {
            personID = new ArrayList<IdentifierType>();
        }
        return this.personID;
    }

    /**
     * Gets the value of the priorIncorrectPersonID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorIncorrectPersonID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorIncorrectPersonID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getPriorIncorrectPersonID() {
        if (priorIncorrectPersonID == null) {
            priorIncorrectPersonID = new ArrayList<IdentifierType>();
        }
        return this.priorIncorrectPersonID;
    }

    /**
     * Gets the value of the personLegalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personLegalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonLegalID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getPersonLegalID() {
        if (personLegalID == null) {
            personLegalID = new ArrayList<IdentifierType>();
        }
        return this.personLegalID;
    }

    /**
     * Gets the value of the priorIncorrectPersonLegalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorIncorrectPersonLegalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorIncorrectPersonLegalID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getPriorIncorrectPersonLegalID() {
        if (priorIncorrectPersonLegalID == null) {
            priorIncorrectPersonLegalID = new ArrayList<IdentifierType>();
        }
        return this.priorIncorrectPersonLegalID;
    }

    /**
     * Gets the value of the personName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameType }
     * 
     * 
     */
    public List<PersonNameType> getPersonName() {
        if (personName == null) {
            personName = new ArrayList<PersonNameType>();
        }
        return this.personName;
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
     * Gets the value of the birthDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the birthDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBirthDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBirthDate() {
        if (birthDate == null) {
            birthDate = new ArrayList<String>();
        }
        return this.birthDate;
    }

    /**
     * Gets the value of the dependentRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link DependentRelationshipCodeType }
     *     
     */
    public DependentRelationshipCodeType getDependentRelationshipCode() {
        return dependentRelationshipCode;
    }

    /**
     * Sets the value of the dependentRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentRelationshipCodeType }
     *     
     */
    public void setDependentRelationshipCode(DependentRelationshipCodeType value) {
        this.dependentRelationshipCode = value;
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
