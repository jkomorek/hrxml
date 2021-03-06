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
import org.openapplications.oagis._9.DescriptionType;


/**
 * <p>Java class for ScreeningStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScreeningStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}OrderID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ScreeningStatusCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ScreeningResultCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Score" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StatusDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OrderReceivedDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OrderCompletedDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ScreeningError" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Attachment" minOccurs="0"/>
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
@XmlType(name = "ScreeningStatusType", propOrder = {
    "orderID",
    "screeningStatusCode",
    "screeningResultCode",
    "score",
    "statusDateTime",
    "orderReceivedDate",
    "orderCompletedDate",
    "description",
    "screeningError",
    "attachment",
    "userArea"
})
public class ScreeningStatusType {

    @XmlElement(name = "OrderID")
    protected IdentifierType orderID;
    @XmlElement(name = "ScreeningStatusCode")
    protected ScreeningStatusCodeType screeningStatusCode;
    @XmlElement(name = "ScreeningResultCode")
    protected ScreeningResultCodeType screeningResultCode;
    @XmlElement(name = "Score")
    protected ScoreType score;
    @XmlList
    @XmlElement(name = "StatusDateTime")
    protected List<String> statusDateTime;
    @XmlList
    @XmlElement(name = "OrderReceivedDate")
    protected List<String> orderReceivedDate;
    @XmlList
    @XmlElement(name = "OrderCompletedDate")
    protected List<String> orderCompletedDate;
    @XmlElement(name = "Description", namespace = "http://www.openapplications.org/oagis/9")
    protected List<DescriptionType> description;
    @XmlElement(name = "ScreeningError")
    protected List<ScreeningErrorType> screeningError;
    @XmlElement(name = "Attachment")
    protected AttachmentType attachment;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setOrderID(IdentifierType value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the screeningStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningStatusCodeType }
     *     
     */
    public ScreeningStatusCodeType getScreeningStatusCode() {
        return screeningStatusCode;
    }

    /**
     * Sets the value of the screeningStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningStatusCodeType }
     *     
     */
    public void setScreeningStatusCode(ScreeningStatusCodeType value) {
        this.screeningStatusCode = value;
    }

    /**
     * Gets the value of the screeningResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningResultCodeType }
     *     
     */
    public ScreeningResultCodeType getScreeningResultCode() {
        return screeningResultCode;
    }

    /**
     * Sets the value of the screeningResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningResultCodeType }
     *     
     */
    public void setScreeningResultCode(ScreeningResultCodeType value) {
        this.screeningResultCode = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreType }
     *     
     */
    public ScoreType getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreType }
     *     
     */
    public void setScore(ScoreType value) {
        this.score = value;
    }

    /**
     * Gets the value of the statusDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatusDateTime() {
        if (statusDateTime == null) {
            statusDateTime = new ArrayList<String>();
        }
        return this.statusDateTime;
    }

    /**
     * Gets the value of the orderReceivedDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderReceivedDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderReceivedDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrderReceivedDate() {
        if (orderReceivedDate == null) {
            orderReceivedDate = new ArrayList<String>();
        }
        return this.orderReceivedDate;
    }

    /**
     * Gets the value of the orderCompletedDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderCompletedDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderCompletedDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrderCompletedDate() {
        if (orderCompletedDate == null) {
            orderCompletedDate = new ArrayList<String>();
        }
        return this.orderCompletedDate;
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
     * Gets the value of the screeningError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screeningError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreeningError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningErrorType }
     * 
     * 
     */
    public List<ScreeningErrorType> getScreeningError() {
        if (screeningError == null) {
            screeningError = new ArrayList<ScreeningErrorType>();
        }
        return this.screeningError;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setAttachment(AttachmentType value) {
        this.attachment = value;
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
