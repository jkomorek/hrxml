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
import org.openapplications.oagis._9.AmountType;


/**
 * <p>Java class for SpendingAccountContributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpendingAccountContributionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}SpendingAccountContributorCode"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}GoalAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PerPayPeriodAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}YTDContributionAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ContributionFrequencyCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}FirstPayrollDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StartDateTime" minOccurs="0"/>
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
@XmlType(name = "SpendingAccountContributionType", propOrder = {
    "spendingAccountContributorCode",
    "goalAmount",
    "perPayPeriodAmount",
    "ytdContributionAmount",
    "contributionFrequencyCode",
    "firstPayrollDate",
    "startDateTime",
    "userArea"
})
public class SpendingAccountContributionType {

    @XmlElement(name = "SpendingAccountContributorCode", required = true)
    protected SpendingAccountContributorCodeType spendingAccountContributorCode;
    @XmlElement(name = "GoalAmount")
    protected AmountType goalAmount;
    @XmlElement(name = "PerPayPeriodAmount")
    protected AmountType perPayPeriodAmount;
    @XmlElement(name = "YTDContributionAmount")
    protected AmountType ytdContributionAmount;
    @XmlElement(name = "ContributionFrequencyCode")
    protected ContributionFrequencyCodeType contributionFrequencyCode;
    @XmlList
    @XmlElement(name = "FirstPayrollDate")
    protected List<String> firstPayrollDate;
    @XmlList
    @XmlElement(name = "StartDateTime")
    protected List<String> startDateTime;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the spendingAccountContributorCode property.
     * 
     * @return
     *     possible object is
     *     {@link SpendingAccountContributorCodeType }
     *     
     */
    public SpendingAccountContributorCodeType getSpendingAccountContributorCode() {
        return spendingAccountContributorCode;
    }

    /**
     * Sets the value of the spendingAccountContributorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpendingAccountContributorCodeType }
     *     
     */
    public void setSpendingAccountContributorCode(SpendingAccountContributorCodeType value) {
        this.spendingAccountContributorCode = value;
    }

    /**
     * Gets the value of the goalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGoalAmount() {
        return goalAmount;
    }

    /**
     * Sets the value of the goalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGoalAmount(AmountType value) {
        this.goalAmount = value;
    }

    /**
     * Gets the value of the perPayPeriodAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPerPayPeriodAmount() {
        return perPayPeriodAmount;
    }

    /**
     * Sets the value of the perPayPeriodAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPerPayPeriodAmount(AmountType value) {
        this.perPayPeriodAmount = value;
    }

    /**
     * Gets the value of the ytdContributionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getYTDContributionAmount() {
        return ytdContributionAmount;
    }

    /**
     * Sets the value of the ytdContributionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setYTDContributionAmount(AmountType value) {
        this.ytdContributionAmount = value;
    }

    /**
     * Gets the value of the contributionFrequencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link ContributionFrequencyCodeType }
     *     
     */
    public ContributionFrequencyCodeType getContributionFrequencyCode() {
        return contributionFrequencyCode;
    }

    /**
     * Sets the value of the contributionFrequencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionFrequencyCodeType }
     *     
     */
    public void setContributionFrequencyCode(ContributionFrequencyCodeType value) {
        this.contributionFrequencyCode = value;
    }

    /**
     * Gets the value of the firstPayrollDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstPayrollDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstPayrollDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFirstPayrollDate() {
        if (firstPayrollDate == null) {
            firstPayrollDate = new ArrayList<String>();
        }
        return this.firstPayrollDate;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStartDateTime() {
        if (startDateTime == null) {
            startDateTime = new ArrayList<String>();
        }
        return this.startDateTime;
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
