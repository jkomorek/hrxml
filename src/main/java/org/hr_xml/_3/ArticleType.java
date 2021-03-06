//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Article_ Publication. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A literary composition forming materially part of a journal, magazine, encyclop�dia, or other collection, but treating a specific topic distinctly and independently.&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for ArticleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArticleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hr-xml.org/3}BibliographyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}JournalName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ISSN" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Volume" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Issue" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PageNumberFormat" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PublicationLanguage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArticleType", propOrder = {
    "journalName",
    "issn",
    "volume",
    "issue",
    "pageNumberFormat",
    "publicationLanguage"
})
public class ArticleType
    extends BibliographyType
{

    @XmlElement(name = "JournalName")
    protected String journalName;
    @XmlElement(name = "ISSN")
    protected String issn;
    @XmlElement(name = "Volume")
    protected String volume;
    @XmlElement(name = "Issue")
    protected String issue;
    @XmlElement(name = "PageNumberFormat")
    protected String pageNumberFormat;
    @XmlElement(name = "PublicationLanguage")
    protected LanguageCodeType publicationLanguage;

    /**
     * Gets the value of the journalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalName() {
        return journalName;
    }

    /**
     * Sets the value of the journalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalName(String value) {
        this.journalName = value;
    }

    /**
     * Gets the value of the issn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSN() {
        return issn;
    }

    /**
     * Sets the value of the issn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSN(String value) {
        this.issn = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

    /**
     * Gets the value of the pageNumberFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNumberFormat() {
        return pageNumberFormat;
    }

    /**
     * Sets the value of the pageNumberFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumberFormat(String value) {
        this.pageNumberFormat = value;
    }

    /**
     * Gets the value of the publicationLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getPublicationLanguage() {
        return publicationLanguage;
    }

    /**
     * Sets the value of the publicationLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setPublicationLanguage(LanguageCodeType value) {
        this.publicationLanguage = value;
    }

}
