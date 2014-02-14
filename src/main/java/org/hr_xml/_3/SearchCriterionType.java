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
import org.openapplications.oagis._9.TextType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Search Criterion. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A single, repeatable criterion structured as name/value pairs with optional weighting.&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;This is an alternative to SearchString or may be used as an alternate syntax to express criteria also expressed as a SearchString.&lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessTerm xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SearchCriterion&lt;/ccts:BusinessTerm&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Example xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for SearchCriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriterionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}CriterionName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CriterionValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Weight" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ComparativeOperator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SearchString" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SearchContext" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriterionType", propOrder = {
    "criterionName",
    "criterionValue",
    "weight",
    "comparativeOperator",
    "searchString",
    "searchContext"
})
public class SearchCriterionType {

    @XmlElement(name = "CriterionName")
    protected String criterionName;
    @XmlElement(name = "CriterionValue")
    protected String criterionValue;
    @XmlElement(name = "Weight")
    protected WeightType weight;
    @XmlElement(name = "ComparativeOperator")
    protected String comparativeOperator;
    @XmlElement(name = "SearchString")
    protected String searchString;
    @XmlElement(name = "SearchContext")
    protected TextType searchContext;

    /**
     * Gets the value of the criterionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterionName() {
        return criterionName;
    }

    /**
     * Sets the value of the criterionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterionName(String value) {
        this.criterionName = value;
    }

    /**
     * Gets the value of the criterionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterionValue() {
        return criterionValue;
    }

    /**
     * Sets the value of the criterionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterionValue(String value) {
        this.criterionValue = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setWeight(WeightType value) {
        this.weight = value;
    }

    /**
     * Gets the value of the comparativeOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparativeOperator() {
        return comparativeOperator;
    }

    /**
     * Sets the value of the comparativeOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparativeOperator(String value) {
        this.comparativeOperator = value;
    }

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchString(String value) {
        this.searchString = value;
    }

    /**
     * Specifies a particular subset of the profile being searched. For example, �last one year, last two year�, or �last 3 positions�.  
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSearchContext() {
        return searchContext;
    }

    /**
     * Sets the value of the searchContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSearchContext(TextType value) {
        this.searchContext = value;
    }

}
