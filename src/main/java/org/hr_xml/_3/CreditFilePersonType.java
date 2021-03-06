//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditFilePersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditFilePersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CreditFilePersonCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Sequence" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SourceID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}EnteredOnInquiryIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ReportedCount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ReportedPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}LastActivityDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}LastReportedByID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SubjectIdentification" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AdditionalItem" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CreditFilePersonType", propOrder = {
    "id",
    "creditFilePersonCode",
    "sequence",
    "sourceID",
    "enteredOnInquiryIndicator",
    "reportedCount",
    "reportedPeriod",
    "lastActivityDate",
    "lastReportedByID",
    "subjectIdentification",
    "additionalItem"
})
public class CreditFilePersonType {

    @XmlElement(name = "ID")
    protected List<IdentifierType> id;
    @XmlElement(name = "CreditFilePersonCode")
    protected List<CreditFilePersonCodeType> creditFilePersonCode;
    @XmlElement(name = "Sequence", namespace = "http://www.openapplications.org/oagis/9")
    protected BigInteger sequence;
    @XmlElement(name = "SourceID")
    protected IdentifierType sourceID;
    @XmlElement(name = "EnteredOnInquiryIndicator")
    protected Boolean enteredOnInquiryIndicator;
    @XmlElement(name = "ReportedCount")
    protected BigInteger reportedCount;
    @XmlElement(name = "ReportedPeriod")
    protected FreeFormEffectivePeriodType reportedPeriod;
    @XmlList
    @XmlElement(name = "LastActivityDate")
    protected List<String> lastActivityDate;
    @XmlElement(name = "LastReportedByID")
    protected IdentifierType lastReportedByID;
    @XmlElement(name = "SubjectIdentification")
    protected SubjectIdentificationType subjectIdentification;
    @XmlElement(name = "AdditionalItem")
    protected List<AdditionalItemType> additionalItem;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getID() {
        if (id == null) {
            id = new ArrayList<IdentifierType>();
        }
        return this.id;
    }

    /**
     * Gets the value of the creditFilePersonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditFilePersonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditFilePersonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditFilePersonCodeType }
     * 
     * 
     */
    public List<CreditFilePersonCodeType> getCreditFilePersonCode() {
        if (creditFilePersonCode == null) {
            creditFilePersonCode = new ArrayList<CreditFilePersonCodeType>();
        }
        return this.creditFilePersonCode;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSourceID(IdentifierType value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the enteredOnInquiryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnteredOnInquiryIndicator() {
        return enteredOnInquiryIndicator;
    }

    /**
     * Sets the value of the enteredOnInquiryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnteredOnInquiryIndicator(Boolean value) {
        this.enteredOnInquiryIndicator = value;
    }

    /**
     * Gets the value of the reportedCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReportedCount() {
        return reportedCount;
    }

    /**
     * Sets the value of the reportedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReportedCount(BigInteger value) {
        this.reportedCount = value;
    }

    /**
     * Gets the value of the reportedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormEffectivePeriodType }
     *     
     */
    public FreeFormEffectivePeriodType getReportedPeriod() {
        return reportedPeriod;
    }

    /**
     * Sets the value of the reportedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormEffectivePeriodType }
     *     
     */
    public void setReportedPeriod(FreeFormEffectivePeriodType value) {
        this.reportedPeriod = value;
    }

    /**
     * Gets the value of the lastActivityDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastActivityDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastActivityDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLastActivityDate() {
        if (lastActivityDate == null) {
            lastActivityDate = new ArrayList<String>();
        }
        return this.lastActivityDate;
    }

    /**
     * Gets the value of the lastReportedByID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getLastReportedByID() {
        return lastReportedByID;
    }

    /**
     * Sets the value of the lastReportedByID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setLastReportedByID(IdentifierType value) {
        this.lastReportedByID = value;
    }

    /**
     * Gets the value of the subjectIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectIdentificationType }
     *     
     */
    public SubjectIdentificationType getSubjectIdentification() {
        return subjectIdentification;
    }

    /**
     * Sets the value of the subjectIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectIdentificationType }
     *     
     */
    public void setSubjectIdentification(SubjectIdentificationType value) {
        this.subjectIdentification = value;
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
