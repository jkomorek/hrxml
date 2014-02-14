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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.CodeType;


/**
 * Contains a collection of information about 
 * 		a plan participant's enrollment or investment choices under a saving plan.
 * 
 * <p>Java class for SavingsPlanElectionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SavingsPlanElectionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ElectionDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ElectionEffectiveDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PlanID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ElectedPlanTypeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PayrollDeferral" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SourceGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}InvestmentElections" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DistributionElections" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SavingsPlanElectionsType", propOrder = {
    "electionDate",
    "electionEffectiveDate",
    "planID",
    "electedPlanTypeCode",
    "payrollDeferral",
    "sourceGroup",
    "investmentElections",
    "distributionElections",
    "userArea"
})
public class SavingsPlanElectionsType {

    @XmlList
    @XmlElement(name = "ElectionDate")
    protected List<String> electionDate;
    @XmlList
    @XmlElement(name = "ElectionEffectiveDate")
    protected List<String> electionEffectiveDate;
    @XmlElement(name = "PlanID")
    protected IdentifierType planID;
    @XmlElement(name = "ElectedPlanTypeCode")
    protected List<CodeType> electedPlanTypeCode;
    @XmlElement(name = "PayrollDeferral")
    protected PayrollDeferralType payrollDeferral;
    @XmlElement(name = "SourceGroup")
    protected List<SourceGroupType> sourceGroup;
    @XmlElement(name = "InvestmentElections")
    protected List<InvestmentElectionsType> investmentElections;
    @XmlElement(name = "DistributionElections")
    protected List<DistributionElectionsType> distributionElections;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

    /**
     * Gets the value of the electionDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electionDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectionDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElectionDate() {
        if (electionDate == null) {
            electionDate = new ArrayList<String>();
        }
        return this.electionDate;
    }

    /**
     * Gets the value of the electionEffectiveDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electionEffectiveDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectionEffectiveDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElectionEffectiveDate() {
        if (electionEffectiveDate == null) {
            electionEffectiveDate = new ArrayList<String>();
        }
        return this.electionEffectiveDate;
    }

    /**
     * Gets the value of the planID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPlanID() {
        return planID;
    }

    /**
     * Sets the value of the planID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPlanID(IdentifierType value) {
        this.planID = value;
    }

    /**
     * Gets the value of the electedPlanTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electedPlanTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectedPlanTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getElectedPlanTypeCode() {
        if (electedPlanTypeCode == null) {
            electedPlanTypeCode = new ArrayList<CodeType>();
        }
        return this.electedPlanTypeCode;
    }

    /**
     * Gets the value of the payrollDeferral property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollDeferralType }
     *     
     */
    public PayrollDeferralType getPayrollDeferral() {
        return payrollDeferral;
    }

    /**
     * Sets the value of the payrollDeferral property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollDeferralType }
     *     
     */
    public void setPayrollDeferral(PayrollDeferralType value) {
        this.payrollDeferral = value;
    }

    /**
     * Gets the value of the sourceGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceGroupType }
     * 
     * 
     */
    public List<SourceGroupType> getSourceGroup() {
        if (sourceGroup == null) {
            sourceGroup = new ArrayList<SourceGroupType>();
        }
        return this.sourceGroup;
    }

    /**
     * Gets the value of the investmentElections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investmentElections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestmentElections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentElectionsType }
     * 
     * 
     */
    public List<InvestmentElectionsType> getInvestmentElections() {
        if (investmentElections == null) {
            investmentElections = new ArrayList<InvestmentElectionsType>();
        }
        return this.investmentElections;
    }

    /**
     * Gets the value of the distributionElections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionElections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionElections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionElectionsType }
     * 
     * 
     */
    public List<DistributionElectionsType> getDistributionElections() {
        if (distributionElections == null) {
            distributionElections = new ArrayList<DistributionElectionsType>();
        }
        return this.distributionElections;
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
