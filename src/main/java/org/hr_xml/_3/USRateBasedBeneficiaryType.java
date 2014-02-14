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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for USRateBasedBeneficiaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USRateBasedBeneficiaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}BeneficiaryName"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}BeneficiaryID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Communication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.openapplications.org/oagis/9}DateType" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}FamilyRelationshipCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}InheritanceAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USRateBasedBeneficiaryType", propOrder = {
    "beneficiaryName",
    "beneficiaryID",
    "communication",
    "birthDate",
    "familyRelationshipCode",
    "inheritanceAmount"
})
public class USRateBasedBeneficiaryType {

    @XmlElement(name = "BeneficiaryName", required = true)
    protected BeneficiaryName beneficiaryName;
    @XmlElement(name = "BeneficiaryID")
    protected IdentifierType beneficiaryID;
    @XmlElement(name = "Communication")
    protected List<CommunicationABIEType> communication;
    @XmlElement(name = "BirthDate")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "FamilyRelationshipCode")
    protected FamilyRelationshipCodeEnumType familyRelationshipCode;
    @XmlElement(name = "InheritanceAmount")
    protected InheritanceAmount inheritanceAmount;

    /**
     * Gets the value of the beneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryName }
     *     
     */
    public BeneficiaryName getBeneficiaryName() {
        return beneficiaryName;
    }

    /**
     * Sets the value of the beneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryName }
     *     
     */
    public void setBeneficiaryName(BeneficiaryName value) {
        this.beneficiaryName = value;
    }

    /**
     * Gets the value of the beneficiaryID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getBeneficiaryID() {
        return beneficiaryID;
    }

    /**
     * Sets the value of the beneficiaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setBeneficiaryID(IdentifierType value) {
        this.beneficiaryID = value;
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
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the familyRelationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link FamilyRelationshipCodeEnumType }
     *     
     */
    public FamilyRelationshipCodeEnumType getFamilyRelationshipCode() {
        return familyRelationshipCode;
    }

    /**
     * Sets the value of the familyRelationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyRelationshipCodeEnumType }
     *     
     */
    public void setFamilyRelationshipCode(FamilyRelationshipCodeEnumType value) {
        this.familyRelationshipCode = value;
    }

    /**
     * Gets the value of the inheritanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link InheritanceAmount }
     *     
     */
    public InheritanceAmount getInheritanceAmount() {
        return inheritanceAmount;
    }

    /**
     * Sets the value of the inheritanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InheritanceAmount }
     *     
     */
    public void setInheritanceAmount(InheritanceAmount value) {
        this.inheritanceAmount = value;
    }

}