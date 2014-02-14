//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.openapplications.oagis._9;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialPartyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/9}PartyBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}ClearingSystemMemberID" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}BranchParty" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}FinancialAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}CountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}UserArea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialPartyType", propOrder = {
    "clearingSystemMemberID",
    "branchParty",
    "financialAccount",
    "countryCode",
    "userArea"
})
public class FinancialPartyType
    extends PartyBaseType
{

    @XmlElement(name = "ClearingSystemMemberID")
    protected IdentifierType clearingSystemMemberID;
    @XmlElement(name = "BranchParty")
    protected SemanticPartyType branchParty;
    @XmlElement(name = "FinancialAccount")
    protected List<FinancialAccountType> financialAccount;
    @XmlElement(name = "CountryCode")
    protected CountryCodeType countryCode;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the clearingSystemMemberID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getClearingSystemMemberID() {
        return clearingSystemMemberID;
    }

    /**
     * Sets the value of the clearingSystemMemberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setClearingSystemMemberID(IdentifierType value) {
        this.clearingSystemMemberID = value;
    }

    /**
     * Gets the value of the branchParty property.
     * 
     * @return
     *     possible object is
     *     {@link SemanticPartyType }
     *     
     */
    public SemanticPartyType getBranchParty() {
        return branchParty;
    }

    /**
     * Sets the value of the branchParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticPartyType }
     *     
     */
    public void setBranchParty(SemanticPartyType value) {
        this.branchParty = value;
    }

    /**
     * Gets the value of the financialAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialAccountType }
     * 
     * 
     */
    public List<FinancialAccountType> getFinancialAccount() {
        if (financialAccount == null) {
            financialAccount = new ArrayList<FinancialAccountType>();
        }
        return this.financialAccount;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
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
