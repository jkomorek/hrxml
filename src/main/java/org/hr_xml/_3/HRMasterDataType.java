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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;HR Master Data. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A complete set of "HR master data."&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for HRMasterDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HRMasterDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.hr-xml.org/3}DocumentIDGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DocumentSequence" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}EmployerIdentifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}MasterPersonDossier" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserArea" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.hr-xml.org/3}EffectiveDateAttributeGroup"/>
 *       &lt;attribute name="languageCode" type="{http://www.hr-xml.org/3}LanguageCodeContentType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HRMasterDataType", propOrder = {
    "documentID",
    "alternateDocumentID",
    "documentSequence",
    "employerIdentifiers",
    "masterPersonDossier",
    "userArea"
})
public class HRMasterDataType {

    @XmlElement(name = "DocumentID")
    protected IdentifierType documentID;
    @XmlElement(name = "AlternateDocumentID")
    protected List<IdentifierType> alternateDocumentID;
    @XmlElement(name = "DocumentSequence")
    protected BigInteger documentSequence;
    @XmlElement(name = "EmployerIdentifiers")
    protected OrganizationIdentifiersType employerIdentifiers;
    @XmlElement(name = "MasterPersonDossier")
    protected MasterPersonDossierType masterPersonDossier;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "languageCode")
    protected String languageCode;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setDocumentID(IdentifierType value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the alternateDocumentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateDocumentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateDocumentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getAlternateDocumentID() {
        if (alternateDocumentID == null) {
            alternateDocumentID = new ArrayList<IdentifierType>();
        }
        return this.alternateDocumentID;
    }

    /**
     * Gets the value of the documentSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentSequence() {
        return documentSequence;
    }

    /**
     * Sets the value of the documentSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentSequence(BigInteger value) {
        this.documentSequence = value;
    }

    /**
     * Gets the value of the employerIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationIdentifiersType }
     *     
     */
    public OrganizationIdentifiersType getEmployerIdentifiers() {
        return employerIdentifiers;
    }

    /**
     * Sets the value of the employerIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationIdentifiersType }
     *     
     */
    public void setEmployerIdentifiers(OrganizationIdentifiersType value) {
        this.employerIdentifiers = value;
    }

    /**
     * Gets the value of the masterPersonDossier property.
     * 
     * @return
     *     possible object is
     *     {@link MasterPersonDossierType }
     *     
     */
    public MasterPersonDossierType getMasterPersonDossier() {
        return masterPersonDossier;
    }

    /**
     * Sets the value of the masterPersonDossier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterPersonDossierType }
     *     
     */
    public void setMasterPersonDossier(MasterPersonDossierType value) {
        this.masterPersonDossier = value;
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
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
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
