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


/**
 * In the case of certain types of savings plans (e.g., certain non-qualified plans within U.S. markets), saving plan participants may be required to make elections regarding plan distributions at the time they make investment elections. The distribution elections component is intended to fullfill these requirements.
 * 
 * <p>Java class for DistributionElectionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionElectionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}SourceGroupID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ContributionSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DistributionEventCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DistributionMethod" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserArea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionElectionsType", propOrder = {
    "sourceGroupID",
    "contributionSource",
    "distributionEventCode",
    "distributionMethod",
    "userArea"
})
public class DistributionElectionsType {

    @XmlElement(name = "SourceGroupID")
    protected IdentifierType sourceGroupID;
    @XmlElement(name = "ContributionSource")
    protected List<EarningsClassificationType> contributionSource;
    @XmlElement(name = "DistributionEventCode")
    protected DistributionEventCodeType distributionEventCode;
    @XmlElement(name = "DistributionMethod")
    protected DistributionMethodType distributionMethod;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the sourceGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSourceGroupID() {
        return sourceGroupID;
    }

    /**
     * Sets the value of the sourceGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSourceGroupID(IdentifierType value) {
        this.sourceGroupID = value;
    }

    /**
     * Gets the value of the contributionSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributionSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributionSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarningsClassificationType }
     * 
     * 
     */
    public List<EarningsClassificationType> getContributionSource() {
        if (contributionSource == null) {
            contributionSource = new ArrayList<EarningsClassificationType>();
        }
        return this.contributionSource;
    }

    /**
     * Gets the value of the distributionEventCode property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionEventCodeType }
     *     
     */
    public DistributionEventCodeType getDistributionEventCode() {
        return distributionEventCode;
    }

    /**
     * Sets the value of the distributionEventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionEventCodeType }
     *     
     */
    public void setDistributionEventCode(DistributionEventCodeType value) {
        this.distributionEventCode = value;
    }

    /**
     * Gets the value of the distributionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionMethodType }
     *     
     */
    public DistributionMethodType getDistributionMethod() {
        return distributionMethod;
    }

    /**
     * Sets the value of the distributionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionMethodType }
     *     
     */
    public void setDistributionMethod(DistributionMethodType value) {
        this.distributionMethod = value;
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

}
