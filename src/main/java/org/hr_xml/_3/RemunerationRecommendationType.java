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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.NoteType;


/**
 * A recommendation for a pay increase or change in remuneration. This typically would be an output of an appraisal or other performance management process.
 * 
 * <p>Java class for RemunerationRecommendationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemunerationRecommendationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StartDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CurrentBasePay" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}NewBasePay" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Bonus" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Incentive" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RemunerationRecommendationType", propOrder = {
    "id",
    "comment",
    "startDateTime",
    "currentBasePay",
    "newBasePay",
    "bonus",
    "incentive",
    "userArea"
})
@XmlSeeAlso({
    EPMRemunerationType.class
})
public class RemunerationRecommendationType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Comment")
    protected List<NoteType> comment;
    @XmlList
    @XmlElement(name = "StartDateTime")
    protected List<String> startDateTime;
    @XmlElement(name = "CurrentBasePay")
    protected CurrentBasePayType currentBasePay;
    @XmlElement(name = "NewBasePay")
    protected NewBasePayType newBasePay;
    @XmlElement(name = "Bonus")
    protected BonusType bonus;
    @XmlElement(name = "Incentive")
    protected List<IncentiveType> incentive;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setID(IdentifierType value) {
        this.id = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getComment() {
        if (comment == null) {
            comment = new ArrayList<NoteType>();
        }
        return this.comment;
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
     * Gets the value of the currentBasePay property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentBasePayType }
     *     
     */
    public CurrentBasePayType getCurrentBasePay() {
        return currentBasePay;
    }

    /**
     * Sets the value of the currentBasePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentBasePayType }
     *     
     */
    public void setCurrentBasePay(CurrentBasePayType value) {
        this.currentBasePay = value;
    }

    /**
     * Gets the value of the newBasePay property.
     * 
     * @return
     *     possible object is
     *     {@link NewBasePayType }
     *     
     */
    public NewBasePayType getNewBasePay() {
        return newBasePay;
    }

    /**
     * Sets the value of the newBasePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewBasePayType }
     *     
     */
    public void setNewBasePay(NewBasePayType value) {
        this.newBasePay = value;
    }

    /**
     * Gets the value of the bonus property.
     * 
     * @return
     *     possible object is
     *     {@link BonusType }
     *     
     */
    public BonusType getBonus() {
        return bonus;
    }

    /**
     * Sets the value of the bonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BonusType }
     *     
     */
    public void setBonus(BonusType value) {
        this.bonus = value;
    }

    /**
     * Gets the value of the incentive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incentive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncentive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncentiveType }
     * 
     * 
     */
    public List<IncentiveType> getIncentive() {
        if (incentive == null) {
            incentive = new ArrayList<IncentiveType>();
        }
        return this.incentive;
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
