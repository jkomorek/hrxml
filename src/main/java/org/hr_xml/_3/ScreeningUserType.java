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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openapplications.oagis._9.CreditCardType;


/**
 * <p>Java class for ScreeningUserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScreeningUserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AccessCredential" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}CreditCard" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AuthorizedWorkScope" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ProhibitedWorkScope" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Notification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserArea" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="agencyOwnerID" type="{http://www.openapplications.org/oagis/9}NormalizedStringType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScreeningUserType", propOrder = {
    "userID",
    "accessCredential",
    "creditCard",
    "authorizedWorkScope",
    "prohibitedWorkScope",
    "notification",
    "userArea"
})
public class ScreeningUserType {

    @XmlElement(name = "UserID")
    protected IdentifierType userID;
    @XmlElement(name = "AccessCredential")
    protected List<AccessCredentialType> accessCredential;
    @XmlElement(name = "CreditCard", namespace = "http://www.openapplications.org/oagis/9")
    protected CreditCardType creditCard;
    @XmlElement(name = "AuthorizedWorkScope")
    protected List<WorkScopeType> authorizedWorkScope;
    @XmlElement(name = "ProhibitedWorkScope")
    protected List<WorkScopeType> prohibitedWorkScope;
    @XmlElement(name = "Notification")
    protected List<NotificationType> notification;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "agencyOwnerID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String agencyOwnerID;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setUserID(IdentifierType value) {
        this.userID = value;
    }

    /**
     * Gets the value of the accessCredential property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessCredential property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessCredential().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessCredentialType }
     * 
     * 
     */
    public List<AccessCredentialType> getAccessCredential() {
        if (accessCredential == null) {
            accessCredential = new ArrayList<AccessCredentialType>();
        }
        return this.accessCredential;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardType }
     *     
     */
    public CreditCardType getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardType }
     *     
     */
    public void setCreditCard(CreditCardType value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the authorizedWorkScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizedWorkScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizedWorkScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkScopeType }
     * 
     * 
     */
    public List<WorkScopeType> getAuthorizedWorkScope() {
        if (authorizedWorkScope == null) {
            authorizedWorkScope = new ArrayList<WorkScopeType>();
        }
        return this.authorizedWorkScope;
    }

    /**
     * Gets the value of the prohibitedWorkScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prohibitedWorkScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProhibitedWorkScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkScopeType }
     * 
     * 
     */
    public List<WorkScopeType> getProhibitedWorkScope() {
        if (prohibitedWorkScope == null) {
            prohibitedWorkScope = new ArrayList<WorkScopeType>();
        }
        return this.prohibitedWorkScope;
    }

    /**
     * Gets the value of the notification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationType }
     * 
     * 
     */
    public List<NotificationType> getNotification() {
        if (notification == null) {
            notification = new ArrayList<NotificationType>();
        }
        return this.notification;
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
     * Gets the value of the agencyOwnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyOwnerID() {
        return agencyOwnerID;
    }

    /**
     * Sets the value of the agencyOwnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyOwnerID(String value) {
        this.agencyOwnerID = value;
    }

}