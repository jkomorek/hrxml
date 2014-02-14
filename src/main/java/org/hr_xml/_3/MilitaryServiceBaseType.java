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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.NoteType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Military Service. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Service or employment in a military branch.&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for MilitaryServiceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MilitaryServiceBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}MilitaryServiceID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}MilitaryServiceNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}MilitaryBranch" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}MilitaryDivision" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ServicePeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StartingRank" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CurrentOrEndingRank" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}MilitaryCampaign" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}MilitaryExpertise" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}MilitaryHonors" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisciplinaryAction" type="{http://www.openapplications.org/oagis/9}StringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DischargeStatus" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AttachmentReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.hr-xml.org/3}EffectiveDateAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MilitaryServiceBaseType", propOrder = {
    "militaryServiceID",
    "countryCode",
    "militaryServiceNumber",
    "militaryBranch",
    "militaryDivision",
    "servicePeriod",
    "startingRank",
    "currentOrEndingRank",
    "militaryCampaign",
    "militaryExpertise",
    "militaryHonors",
    "disciplinaryAction",
    "dischargeStatus",
    "attachmentReference",
    "comment"
})
@XmlSeeAlso({
    MilitaryServiceType.class,
    MilitaryServiceVerificationType.class
})
public class MilitaryServiceBaseType {

    @XmlElement(name = "MilitaryServiceID")
    protected IdentifierType militaryServiceID;
    @XmlElement(name = "CountryCode")
    protected CountryCodeType countryCode;
    @XmlElement(name = "MilitaryServiceNumber")
    protected String militaryServiceNumber;
    @XmlElement(name = "MilitaryBranch")
    protected String militaryBranch;
    @XmlElement(name = "MilitaryDivision")
    protected String militaryDivision;
    @XmlElement(name = "ServicePeriod")
    protected FreeFormPeriodType servicePeriod;
    @XmlElement(name = "StartingRank")
    protected String startingRank;
    @XmlElement(name = "CurrentOrEndingRank")
    protected String currentOrEndingRank;
    @XmlElement(name = "MilitaryCampaign")
    protected List<String> militaryCampaign;
    @XmlElement(name = "MilitaryExpertise")
    protected List<String> militaryExpertise;
    @XmlElement(name = "MilitaryHonors")
    protected List<String> militaryHonors;
    @XmlElement(name = "DisciplinaryAction")
    protected List<String> disciplinaryAction;
    @XmlElement(name = "DischargeStatus")
    protected String dischargeStatus;
    @XmlElement(name = "AttachmentReference")
    protected List<AttachmentReferenceType> attachmentReference;
    @XmlElement(name = "Comment")
    protected List<NoteType> comment;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

    /**
     * Gets the value of the militaryServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getMilitaryServiceID() {
        return militaryServiceID;
    }

    /**
     * Sets the value of the militaryServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setMilitaryServiceID(IdentifierType value) {
        this.militaryServiceID = value;
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
     * Gets the value of the militaryServiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryServiceNumber() {
        return militaryServiceNumber;
    }

    /**
     * Sets the value of the militaryServiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryServiceNumber(String value) {
        this.militaryServiceNumber = value;
    }

    /**
     * The military office or department in which the person served; e.g. army, navy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryBranch() {
        return militaryBranch;
    }

    /**
     * Sets the value of the militaryBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryBranch(String value) {
        this.militaryBranch = value;
    }

    /**
     * Gets the value of the militaryDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryDivision() {
        return militaryDivision;
    }

    /**
     * Sets the value of the militaryDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryDivision(String value) {
        this.militaryDivision = value;
    }

    /**
     * Gets the value of the servicePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormPeriodType }
     *     
     */
    public FreeFormPeriodType getServicePeriod() {
        return servicePeriod;
    }

    /**
     * Sets the value of the servicePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormPeriodType }
     *     
     */
    public void setServicePeriod(FreeFormPeriodType value) {
        this.servicePeriod = value;
    }

    /**
     * Gets the value of the startingRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingRank() {
        return startingRank;
    }

    /**
     * Sets the value of the startingRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingRank(String value) {
        this.startingRank = value;
    }

    /**
     * Gets the value of the currentOrEndingRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOrEndingRank() {
        return currentOrEndingRank;
    }

    /**
     * Sets the value of the currentOrEndingRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOrEndingRank(String value) {
        this.currentOrEndingRank = value;
    }

    /**
     * Gets the value of the militaryCampaign property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the militaryCampaign property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilitaryCampaign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMilitaryCampaign() {
        if (militaryCampaign == null) {
            militaryCampaign = new ArrayList<String>();
        }
        return this.militaryCampaign;
    }

    /**
     * Gets the value of the militaryExpertise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the militaryExpertise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilitaryExpertise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMilitaryExpertise() {
        if (militaryExpertise == null) {
            militaryExpertise = new ArrayList<String>();
        }
        return this.militaryExpertise;
    }

    /**
     * Gets the value of the militaryHonors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the militaryHonors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilitaryHonors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMilitaryHonors() {
        if (militaryHonors == null) {
            militaryHonors = new ArrayList<String>();
        }
        return this.militaryHonors;
    }

    /**
     * Gets the value of the disciplinaryAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disciplinaryAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisciplinaryAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisciplinaryAction() {
        if (disciplinaryAction == null) {
            disciplinaryAction = new ArrayList<String>();
        }
        return this.disciplinaryAction;
    }

    /**
     * Gets the value of the dischargeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeStatus() {
        return dischargeStatus;
    }

    /**
     * Sets the value of the dischargeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeStatus(String value) {
        this.dischargeStatus = value;
    }

    /**
     * Gets the value of the attachmentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentReferenceType }
     * 
     * 
     */
    public List<AttachmentReferenceType> getAttachmentReference() {
        if (attachmentReference == null) {
            attachmentReference = new ArrayList<AttachmentReferenceType>();
        }
        return this.attachmentReference;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getComment() {
        if (comment == null) {
            comment = new ArrayList<NoteType>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValidFrom() {
        if (validFrom == null) {
            validFrom = new ArrayList<String>();
        }
        return this.validFrom;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValidTo() {
        if (validTo == null) {
            validTo = new ArrayList<String>();
        }
        return this.validTo;
    }

}
