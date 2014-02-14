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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.CodeType;
import org.openapplications.oagis._9.MeasureType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;_ Person. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A set of personal data about an employee or former employee that is relevant to the provisioning of outsourced benefits and payroll systems. It is "indicative" data in that the target system has business rules and logic to administer the employee's compensation and/or benefits programs based on the data supplied. OED Indicative n. That points out, states, or declares; That indicates, points out, or directs; that hints or suggests; Furnishing indications of; suggestive of.&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for PersonBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonBaseType">
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
 *         &lt;element ref="{http://www.hr-xml.org/3}BirthPlace" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DeceasedIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DeathDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CertifiedDeathDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}GenderCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CertifiedMaritalStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PrimaryLanguageCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CitizenshipCountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ResidencyCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}MilitaryStatusCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Disability" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}TobaccoUserIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PhysicalWeightMeasure" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}HeightMeasure" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StudentIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StudentTypeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonBaseType", propOrder = {
    "personID",
    "priorIncorrectPersonID",
    "personLegalID",
    "priorIncorrectPersonLegalID",
    "personName",
    "communication",
    "birthDate",
    "birthPlace",
    "deceasedIndicator",
    "deathDateTime",
    "certifiedDeathDateTime",
    "genderCode",
    "certifiedMaritalStatus",
    "primaryLanguageCode",
    "citizenshipCountryCode",
    "residencyCountryCode",
    "militaryStatusCode",
    "disability",
    "tobaccoUserIndicator",
    "physicalWeightMeasure",
    "heightMeasure",
    "studentIndicator",
    "studentTypeCode"
})
@XmlSeeAlso({
    EffectiveDatedPersonBaseType.class,
    MasterPersonType.class
})
public class PersonBaseType {

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
    @XmlElement(name = "BirthPlace")
    protected BirthPlaceType birthPlace;
    @XmlElement(name = "DeceasedIndicator")
    protected Boolean deceasedIndicator;
    @XmlList
    @XmlElement(name = "DeathDateTime")
    protected List<String> deathDateTime;
    @XmlList
    @XmlElement(name = "CertifiedDeathDateTime")
    protected List<String> certifiedDeathDateTime;
    @XmlElement(name = "GenderCode")
    protected GenderCodeType genderCode;
    @XmlElement(name = "CertifiedMaritalStatus")
    protected List<CertifiedMaritalStatusType> certifiedMaritalStatus;
    @XmlElement(name = "PrimaryLanguageCode")
    protected LanguageCodeType primaryLanguageCode;
    @XmlElement(name = "CitizenshipCountryCode")
    protected List<CitizenshipCountryCodeType> citizenshipCountryCode;
    @XmlElement(name = "ResidencyCountryCode")
    protected ResidencyCountryCodeType residencyCountryCode;
    @XmlElement(name = "MilitaryStatusCode")
    protected List<StatusCodeType> militaryStatusCode;
    @XmlElement(name = "Disability")
    protected DisabilityType disability;
    @XmlElement(name = "TobaccoUserIndicator")
    protected Boolean tobaccoUserIndicator;
    @XmlElement(name = "PhysicalWeightMeasure")
    protected MeasureType physicalWeightMeasure;
    @XmlElement(name = "HeightMeasure", namespace = "http://www.openapplications.org/oagis/9")
    protected MeasureType heightMeasure;
    @XmlElement(name = "StudentIndicator")
    protected EffectiveDatedIndicatorType studentIndicator;
    @XmlElement(name = "StudentTypeCode")
    protected CodeType studentTypeCode;

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
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link BirthPlaceType }
     *     
     */
    public BirthPlaceType getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthPlaceType }
     *     
     */
    public void setBirthPlace(BirthPlaceType value) {
        this.birthPlace = value;
    }

    /**
     * Gets the value of the deceasedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeceasedIndicator() {
        return deceasedIndicator;
    }

    /**
     * Sets the value of the deceasedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeceasedIndicator(Boolean value) {
        this.deceasedIndicator = value;
    }

    /**
     * Gets the value of the deathDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deathDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeathDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeathDateTime() {
        if (deathDateTime == null) {
            deathDateTime = new ArrayList<String>();
        }
        return this.deathDateTime;
    }

    /**
     * Gets the value of the certifiedDeathDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certifiedDeathDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertifiedDeathDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCertifiedDeathDateTime() {
        if (certifiedDeathDateTime == null) {
            certifiedDeathDateTime = new ArrayList<String>();
        }
        return this.certifiedDeathDateTime;
    }

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCodeType }
     *     
     */
    public GenderCodeType getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCodeType }
     *     
     */
    public void setGenderCode(GenderCodeType value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the certifiedMaritalStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certifiedMaritalStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertifiedMaritalStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertifiedMaritalStatusType }
     * 
     * 
     */
    public List<CertifiedMaritalStatusType> getCertifiedMaritalStatus() {
        if (certifiedMaritalStatus == null) {
            certifiedMaritalStatus = new ArrayList<CertifiedMaritalStatusType>();
        }
        return this.certifiedMaritalStatus;
    }

    /**
     * Gets the value of the primaryLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getPrimaryLanguageCode() {
        return primaryLanguageCode;
    }

    /**
     * Sets the value of the primaryLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setPrimaryLanguageCode(LanguageCodeType value) {
        this.primaryLanguageCode = value;
    }

    /**
     * Gets the value of the citizenshipCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenshipCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenshipCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenshipCountryCodeType }
     * 
     * 
     */
    public List<CitizenshipCountryCodeType> getCitizenshipCountryCode() {
        if (citizenshipCountryCode == null) {
            citizenshipCountryCode = new ArrayList<CitizenshipCountryCodeType>();
        }
        return this.citizenshipCountryCode;
    }

    /**
     * Gets the value of the residencyCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencyCountryCodeType }
     *     
     */
    public ResidencyCountryCodeType getResidencyCountryCode() {
        return residencyCountryCode;
    }

    /**
     * Sets the value of the residencyCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencyCountryCodeType }
     *     
     */
    public void setResidencyCountryCode(ResidencyCountryCodeType value) {
        this.residencyCountryCode = value;
    }

    /**
     * Gets the value of the militaryStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the militaryStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilitaryStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusCodeType }
     * 
     * 
     */
    public List<StatusCodeType> getMilitaryStatusCode() {
        if (militaryStatusCode == null) {
            militaryStatusCode = new ArrayList<StatusCodeType>();
        }
        return this.militaryStatusCode;
    }

    /**
     * Gets the value of the disability property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityType }
     *     
     */
    public DisabilityType getDisability() {
        return disability;
    }

    /**
     * Sets the value of the disability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityType }
     *     
     */
    public void setDisability(DisabilityType value) {
        this.disability = value;
    }

    /**
     * Gets the value of the tobaccoUserIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTobaccoUserIndicator() {
        return tobaccoUserIndicator;
    }

    /**
     * Sets the value of the tobaccoUserIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTobaccoUserIndicator(Boolean value) {
        this.tobaccoUserIndicator = value;
    }

    /**
     * Gets the value of the physicalWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPhysicalWeightMeasure() {
        return physicalWeightMeasure;
    }

    /**
     * Sets the value of the physicalWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPhysicalWeightMeasure(MeasureType value) {
        this.physicalWeightMeasure = value;
    }

    /**
     * Gets the value of the heightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getHeightMeasure() {
        return heightMeasure;
    }

    /**
     * Sets the value of the heightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setHeightMeasure(MeasureType value) {
        this.heightMeasure = value;
    }

    /**
     * Gets the value of the studentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDatedIndicatorType }
     *     
     */
    public EffectiveDatedIndicatorType getStudentIndicator() {
        return studentIndicator;
    }

    /**
     * Sets the value of the studentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDatedIndicatorType }
     *     
     */
    public void setStudentIndicator(EffectiveDatedIndicatorType value) {
        this.studentIndicator = value;
    }

    /**
     * Gets the value of the studentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStudentTypeCode() {
        return studentTypeCode;
    }

    /**
     * Sets the value of the studentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStudentTypeCode(CodeType value) {
        this.studentTypeCode = value;
    }

}