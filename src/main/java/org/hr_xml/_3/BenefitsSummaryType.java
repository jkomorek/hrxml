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
import org.openapplications.oagis._9.DescriptionType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Benefits Summary. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A summary of employee benefits ("fringe benefits," health, pension, etc.) associated with an employee, employment, or position. OED: That which a person is entitled to in the way of pecuniary assistance, medical or other attendance, pension, and the like ... or as a member of a benefit (or friendly) society; more explicitly maternity, medical, sickness benefit. &lt;/ccts:Definition&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for BenefitsSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenefitsSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}InsuranceConsiderations" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RetirementPlanSummary" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}VehicleConsiderations" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RelocationAssistance" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}TimeOffAllowance" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ExpatriateBenefits" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}VisaSponsorshipIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OtherBenefits" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "BenefitsSummaryType", propOrder = {
    "insuranceConsiderations",
    "retirementPlanSummary",
    "vehicleConsiderations",
    "relocationAssistance",
    "timeOffAllowance",
    "expatriateBenefits",
    "visaSponsorshipIndicator",
    "otherBenefits",
    "description",
    "userArea"
})
public class BenefitsSummaryType {

    @XmlElement(name = "InsuranceConsiderations")
    protected InsuranceConsiderationsType insuranceConsiderations;
    @XmlElement(name = "RetirementPlanSummary")
    protected RetirementPlanSummaryType retirementPlanSummary;
    @XmlElement(name = "VehicleConsiderations")
    protected VehicleConsiderationsType vehicleConsiderations;
    @XmlElement(name = "RelocationAssistance")
    protected RelocationAssistanceType relocationAssistance;
    @XmlElement(name = "TimeOffAllowance")
    protected TimeOffAllowanceType timeOffAllowance;
    @XmlElement(name = "ExpatriateBenefits")
    protected ExpatriateBenefitsType expatriateBenefits;
    @XmlElement(name = "VisaSponsorshipIndicator")
    protected Boolean visaSponsorshipIndicator;
    @XmlElement(name = "OtherBenefits")
    protected OtherBenefitsType otherBenefits;
    @XmlElement(name = "Description", namespace = "http://www.openapplications.org/oagis/9")
    protected List<DescriptionType> description;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the insuranceConsiderations property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceConsiderationsType }
     *     
     */
    public InsuranceConsiderationsType getInsuranceConsiderations() {
        return insuranceConsiderations;
    }

    /**
     * Sets the value of the insuranceConsiderations property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceConsiderationsType }
     *     
     */
    public void setInsuranceConsiderations(InsuranceConsiderationsType value) {
        this.insuranceConsiderations = value;
    }

    /**
     * Gets the value of the retirementPlanSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RetirementPlanSummaryType }
     *     
     */
    public RetirementPlanSummaryType getRetirementPlanSummary() {
        return retirementPlanSummary;
    }

    /**
     * Sets the value of the retirementPlanSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetirementPlanSummaryType }
     *     
     */
    public void setRetirementPlanSummary(RetirementPlanSummaryType value) {
        this.retirementPlanSummary = value;
    }

    /**
     * Gets the value of the vehicleConsiderations property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleConsiderationsType }
     *     
     */
    public VehicleConsiderationsType getVehicleConsiderations() {
        return vehicleConsiderations;
    }

    /**
     * Sets the value of the vehicleConsiderations property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleConsiderationsType }
     *     
     */
    public void setVehicleConsiderations(VehicleConsiderationsType value) {
        this.vehicleConsiderations = value;
    }

    /**
     * Gets the value of the relocationAssistance property.
     * 
     * @return
     *     possible object is
     *     {@link RelocationAssistanceType }
     *     
     */
    public RelocationAssistanceType getRelocationAssistance() {
        return relocationAssistance;
    }

    /**
     * Sets the value of the relocationAssistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelocationAssistanceType }
     *     
     */
    public void setRelocationAssistance(RelocationAssistanceType value) {
        this.relocationAssistance = value;
    }

    /**
     * Gets the value of the timeOffAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link TimeOffAllowanceType }
     *     
     */
    public TimeOffAllowanceType getTimeOffAllowance() {
        return timeOffAllowance;
    }

    /**
     * Sets the value of the timeOffAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeOffAllowanceType }
     *     
     */
    public void setTimeOffAllowance(TimeOffAllowanceType value) {
        this.timeOffAllowance = value;
    }

    /**
     * Gets the value of the expatriateBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link ExpatriateBenefitsType }
     *     
     */
    public ExpatriateBenefitsType getExpatriateBenefits() {
        return expatriateBenefits;
    }

    /**
     * Sets the value of the expatriateBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpatriateBenefitsType }
     *     
     */
    public void setExpatriateBenefits(ExpatriateBenefitsType value) {
        this.expatriateBenefits = value;
    }

    /**
     * Gets the value of the visaSponsorshipIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisaSponsorshipIndicator() {
        return visaSponsorshipIndicator;
    }

    /**
     * Sets the value of the visaSponsorshipIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisaSponsorshipIndicator(Boolean value) {
        this.visaSponsorshipIndicator = value;
    }

    /**
     * Gets the value of the otherBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link OtherBenefitsType }
     *     
     */
    public OtherBenefitsType getOtherBenefits() {
        return otherBenefits;
    }

    /**
     * Sets the value of the otherBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherBenefitsType }
     *     
     */
    public void setOtherBenefits(OtherBenefitsType value) {
        this.otherBenefits = value;
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
