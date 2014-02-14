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
import org.openapplications.oagis._9.CodeType;
import org.openapplications.oagis._9.CountrySubDivisionCodeType;
import org.openapplications.oagis._9.DescriptionType;
import org.openapplications.oagis._9.NoteType;
import org.openapplications.oagis._9.TextType;


/**
 * <p>Java class for SanctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}FreeFormEffectivePeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SanctionAgencyName" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}CountrySubDivisionCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SanctionSourceID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SanctionAgencyID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SanctionIssue" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SanctionCharge" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DispositionCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SanctionActionCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SanctionDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OrganizationalIdentifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}NotificationDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}LetterRequestIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}LetterForwardedIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}LetterAvailableDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SanctionSubject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SubjectConfirmationMethodCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AdditionalItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionType", propOrder = {
    "freeFormEffectivePeriod",
    "sanctionAgencyName",
    "countrySubDivisionCode",
    "countryCode",
    "sanctionSourceID",
    "sanctionAgencyID",
    "sanctionIssue",
    "sanctionCharge",
    "dispositionCode",
    "sanctionActionCode",
    "sanctionDate",
    "organizationalIdentifiers",
    "notificationDate",
    "description",
    "letterRequestIndicator",
    "letterForwardedIndicator",
    "letterAvailableDate",
    "sanctionSubject",
    "subjectConfirmationMethodCode",
    "comment",
    "additionalItem"
})
public class SanctionType {

    @XmlElement(name = "FreeFormEffectivePeriod")
    protected FreeFormEffectivePeriodType freeFormEffectivePeriod;
    @XmlElement(name = "SanctionAgencyName")
    protected TextType sanctionAgencyName;
    @XmlElement(name = "CountrySubDivisionCode", namespace = "http://www.openapplications.org/oagis/9")
    protected CountrySubDivisionCodeType countrySubDivisionCode;
    @XmlElement(name = "CountryCode")
    protected CountryCodeType countryCode;
    @XmlElement(name = "SanctionSourceID")
    protected List<IdentifierType> sanctionSourceID;
    @XmlElement(name = "SanctionAgencyID")
    protected List<IdentifierType> sanctionAgencyID;
    @XmlElement(name = "SanctionIssue")
    protected String sanctionIssue;
    @XmlElement(name = "SanctionCharge")
    protected String sanctionCharge;
    @XmlElement(name = "DispositionCode")
    protected CodeType dispositionCode;
    @XmlElement(name = "SanctionActionCode")
    protected CodeType sanctionActionCode;
    @XmlElement(name = "SanctionDate")
    protected List<ScreeningDateType> sanctionDate;
    @XmlElement(name = "OrganizationalIdentifiers")
    protected List<OrganizationalIdentifiersType> organizationalIdentifiers;
    @XmlList
    @XmlElement(name = "NotificationDate")
    protected List<String> notificationDate;
    @XmlElement(name = "Description", namespace = "http://www.openapplications.org/oagis/9")
    protected List<DescriptionType> description;
    @XmlElement(name = "LetterRequestIndicator")
    protected Boolean letterRequestIndicator;
    @XmlElement(name = "LetterForwardedIndicator")
    protected Boolean letterForwardedIndicator;
    @XmlList
    @XmlElement(name = "LetterAvailableDate")
    protected List<String> letterAvailableDate;
    @XmlElement(name = "SanctionSubject")
    protected List<SanctionSubjectType> sanctionSubject;
    @XmlElement(name = "SubjectConfirmationMethodCode")
    protected List<SubjectConfirmationMethodCodeType> subjectConfirmationMethodCode;
    @XmlElement(name = "Comment")
    protected List<NoteType> comment;
    @XmlElement(name = "AdditionalItem")
    protected List<AdditionalItemType> additionalItem;

    /**
     * Gets the value of the freeFormEffectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormEffectivePeriodType }
     *     
     */
    public FreeFormEffectivePeriodType getFreeFormEffectivePeriod() {
        return freeFormEffectivePeriod;
    }

    /**
     * Sets the value of the freeFormEffectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormEffectivePeriodType }
     *     
     */
    public void setFreeFormEffectivePeriod(FreeFormEffectivePeriodType value) {
        this.freeFormEffectivePeriod = value;
    }

    /**
     * The name of the agency that is the source of the sanction. For example, the U.S. Department of Health in Human Services Office of Inspector General.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSanctionAgencyName() {
        return sanctionAgencyName;
    }

    /**
     * Sets the value of the sanctionAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSanctionAgencyName(TextType value) {
        this.sanctionAgencyName = value;
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
     * A name or identifier for the list or source associated with the sanction. For example, the U.S. Department of Health in Human Services Office of Inspector General maintains a List of Excluded Individuals/Entities (LEIE).Gets the value of the sanctionSourceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanctionSourceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanctionSourceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getSanctionSourceID() {
        if (sanctionSourceID == null) {
            sanctionSourceID = new ArrayList<IdentifierType>();
        }
        return this.sanctionSourceID;
    }

    /**
     * Gets the value of the sanctionAgencyID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanctionAgencyID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanctionAgencyID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getSanctionAgencyID() {
        if (sanctionAgencyID == null) {
            sanctionAgencyID = new ArrayList<IdentifierType>();
        }
        return this.sanctionAgencyID;
    }

    /**
     * Gets the value of the sanctionIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionIssue() {
        return sanctionIssue;
    }

    /**
     * Sets the value of the sanctionIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionIssue(String value) {
        this.sanctionIssue = value;
    }

    /**
     * Gets the value of the sanctionCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionCharge() {
        return sanctionCharge;
    }

    /**
     * Sets the value of the sanctionCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionCharge(String value) {
        this.sanctionCharge = value;
    }

    /**
     * Gets the value of the dispositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDispositionCode() {
        return dispositionCode;
    }

    /**
     * Sets the value of the dispositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDispositionCode(CodeType value) {
        this.dispositionCode = value;
    }

    /**
     * Gets the value of the sanctionActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSanctionActionCode() {
        return sanctionActionCode;
    }

    /**
     * Sets the value of the sanctionActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSanctionActionCode(CodeType value) {
        this.sanctionActionCode = value;
    }

    /**
     * Gets the value of the sanctionDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanctionDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanctionDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningDateType }
     * 
     * 
     */
    public List<ScreeningDateType> getSanctionDate() {
        if (sanctionDate == null) {
            sanctionDate = new ArrayList<ScreeningDateType>();
        }
        return this.sanctionDate;
    }

    /**
     * Gets the value of the organizationalIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationalIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationalIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationalIdentifiersType }
     * 
     * 
     */
    public List<OrganizationalIdentifiersType> getOrganizationalIdentifiers() {
        if (organizationalIdentifiers == null) {
            organizationalIdentifiers = new ArrayList<OrganizationalIdentifiersType>();
        }
        return this.organizationalIdentifiers;
    }

    /**
     * Gets the value of the notificationDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotificationDate() {
        if (notificationDate == null) {
            notificationDate = new ArrayList<String>();
        }
        return this.notificationDate;
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
     * Gets the value of the letterRequestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLetterRequestIndicator() {
        return letterRequestIndicator;
    }

    /**
     * Sets the value of the letterRequestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLetterRequestIndicator(Boolean value) {
        this.letterRequestIndicator = value;
    }

    /**
     * Gets the value of the letterForwardedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLetterForwardedIndicator() {
        return letterForwardedIndicator;
    }

    /**
     * Sets the value of the letterForwardedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLetterForwardedIndicator(Boolean value) {
        this.letterForwardedIndicator = value;
    }

    /**
     * Gets the value of the letterAvailableDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the letterAvailableDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLetterAvailableDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLetterAvailableDate() {
        if (letterAvailableDate == null) {
            letterAvailableDate = new ArrayList<String>();
        }
        return this.letterAvailableDate;
    }

    /**
     * Gets the value of the sanctionSubject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanctionSubject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanctionSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanctionSubjectType }
     * 
     * 
     */
    public List<SanctionSubjectType> getSanctionSubject() {
        if (sanctionSubject == null) {
            sanctionSubject = new ArrayList<SanctionSubjectType>();
        }
        return this.sanctionSubject;
    }

    /**
     * Gets the value of the subjectConfirmationMethodCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectConfirmationMethodCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectConfirmationMethodCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectConfirmationMethodCodeType }
     * 
     * 
     */
    public List<SubjectConfirmationMethodCodeType> getSubjectConfirmationMethodCode() {
        if (subjectConfirmationMethodCode == null) {
            subjectConfirmationMethodCode = new ArrayList<SubjectConfirmationMethodCodeType>();
        }
        return this.subjectConfirmationMethodCode;
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
     * Gets the value of the additionalItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalItemType }
     * 
     * 
     */
    public List<AdditionalItemType> getAdditionalItem() {
        if (additionalItem == null) {
            additionalItem = new ArrayList<AdditionalItemType>();
        }
        return this.additionalItem;
    }

}