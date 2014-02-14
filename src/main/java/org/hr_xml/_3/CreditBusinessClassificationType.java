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
import org.openapplications.oagis._9.CodeType;
import org.openapplications.oagis._9.DescriptionType;


/**
 * The credit repository bureaus can identify the type of business of the liability holder or the entity requesting a credit report as listed in a credit inquiry record. 
 * 			This information is needed for an automated scoring application. The data is available for liability and inquiry records from Equifax, Experian and Trans Union. It may sometimes 
 * 			be referred to as a "Kind of Business" (KOB) classification. Following the same pattern elsewhere in the schema, A descriptive enumerated value might have a corresponding terse code 
 * 			"RepositoryCode". For example "A" for "Automotive" or "B" for "Banks and Financial Services".
 * 
 * <p>Java class for CreditBusinessClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditBusinessClassificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}CreditBusinessTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RepositoryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RepositoryDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditBusinessClassificationType", propOrder = {
    "creditBusinessTypeCode",
    "repositoryCode",
    "repositoryDescription"
})
public class CreditBusinessClassificationType {

    @XmlElement(name = "CreditBusinessTypeCode")
    protected CreditBusinessTypeCodeType creditBusinessTypeCode;
    @XmlElement(name = "RepositoryCode")
    protected CodeType repositoryCode;
    @XmlElement(name = "RepositoryDescription")
    protected DescriptionType repositoryDescription;

    /**
     * Gets the value of the creditBusinessTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CreditBusinessTypeCodeType }
     *     
     */
    public CreditBusinessTypeCodeType getCreditBusinessTypeCode() {
        return creditBusinessTypeCode;
    }

    /**
     * Sets the value of the creditBusinessTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditBusinessTypeCodeType }
     *     
     */
    public void setCreditBusinessTypeCode(CreditBusinessTypeCodeType value) {
        this.creditBusinessTypeCode = value;
    }

    /**
     * Gets the value of the repositoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRepositoryCode() {
        return repositoryCode;
    }

    /**
     * Sets the value of the repositoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRepositoryCode(CodeType value) {
        this.repositoryCode = value;
    }

    /**
     * Gets the value of the repositoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getRepositoryDescription() {
        return repositoryDescription;
    }

    /**
     * Sets the value of the repositoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setRepositoryDescription(DescriptionType value) {
        this.repositoryDescription = value;
    }

}