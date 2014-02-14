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


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Position Posting. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contains details answering the questions: 1. What, if any, are the positions openings with which is the Candidate associated? 2. How did the Candidate become associated with those positions? The PositionID, PositionTitle, and URI components address the first question. The SearchCriteria, SearchResult, and CandidateAssociationTypeCode address the second question. All elements are optional.  In general, a candidate becomes associated with a position by applying to be considered for the position or by having been sourced and matched to the opening through some manner of automated and/or human-initiated recruiting or research process.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for AssociatedPositionOpeningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedPositionOpeningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionOpeningID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StaffingOrderID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionTitle" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}URI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SearchCriteria" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SearchResult" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CandidateAssociationTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserArea" minOccurs="0"/>
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
@XmlType(name = "AssociatedPositionOpeningType", propOrder = {
    "positionOpeningID",
    "staffingOrderID",
    "positionTitle",
    "uri",
    "searchCriteria",
    "searchResult",
    "candidateAssociationTypeCode",
    "userArea"
})
public class AssociatedPositionOpeningType {

    @XmlElement(name = "PositionOpeningID")
    protected IdentifierType positionOpeningID;
    @XmlElement(name = "StaffingOrderID")
    protected IdentifierType staffingOrderID;
    @XmlElement(name = "PositionTitle")
    protected PositionTitleType positionTitle;
    @XmlElement(name = "URI", namespace = "http://www.openapplications.org/oagis/9")
    protected List<String> uri;
    @XmlElement(name = "SearchCriteria")
    protected SearchCriteriaType searchCriteria;
    @XmlElement(name = "SearchResult")
    protected SearchResultType searchResult;
    @XmlElement(name = "CandidateAssociationTypeCode")
    protected CandidateAssociationTypeCodeType candidateAssociationTypeCode;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

    /**
     * Gets the value of the positionOpeningID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPositionOpeningID() {
        return positionOpeningID;
    }

    /**
     * Sets the value of the positionOpeningID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPositionOpeningID(IdentifierType value) {
        this.positionOpeningID = value;
    }

    /**
     * Gets the value of the staffingOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getStaffingOrderID() {
        return staffingOrderID;
    }

    /**
     * Sets the value of the staffingOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setStaffingOrderID(IdentifierType value) {
        this.staffingOrderID = value;
    }

    /**
     * Gets the value of the positionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link PositionTitleType }
     *     
     */
    public PositionTitleType getPositionTitle() {
        return positionTitle;
    }

    /**
     * Sets the value of the positionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionTitleType }
     *     
     */
    public void setPositionTitle(PositionTitleType value) {
        this.positionTitle = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getURI() {
        if (uri == null) {
            uri = new ArrayList<String>();
        }
        return this.uri;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaType }
     *     
     */
    public SearchCriteriaType getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaType }
     *     
     */
    public void setSearchCriteria(SearchCriteriaType value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the searchResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultType }
     *     
     */
    public SearchResultType getSearchResult() {
        return searchResult;
    }

    /**
     * Sets the value of the searchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultType }
     *     
     */
    public void setSearchResult(SearchResultType value) {
        this.searchResult = value;
    }

    /**
     * A code classifying how the candidate became associated with the position opening.
     * 
     * @return
     *     possible object is
     *     {@link CandidateAssociationTypeCodeType }
     *     
     */
    public CandidateAssociationTypeCodeType getCandidateAssociationTypeCode() {
        return candidateAssociationTypeCode;
    }

    /**
     * Sets the value of the candidateAssociationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateAssociationTypeCodeType }
     *     
     */
    public void setCandidateAssociationTypeCode(CandidateAssociationTypeCodeType value) {
        this.candidateAssociationTypeCode = value;
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