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
import org.openapplications.oagis._9.CodeType;
import org.openapplications.oagis._9.NoteType;
import org.openapplications.oagis._9.TextType;


/**
 * <p>Java class for CriminalChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriminalChargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ChargeOrComplaint" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CriminalChargeLevelCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ArrestDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}OffenseDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Sentence" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SentenceDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Plea" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PleaDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ChargeDispositionCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DispositionDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}StatusCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}IncarcerationPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CriminalProbationPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ProbationStatusCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Plaintiff" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Defendant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CriminalDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AdditionalItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriminalChargeType", propOrder = {
    "id",
    "chargeOrComplaint",
    "criminalChargeLevelCode",
    "arrestDate",
    "offenseDate",
    "sentence",
    "sentenceDate",
    "plea",
    "pleaDate",
    "chargeDispositionCode",
    "dispositionDate",
    "statusCode",
    "incarcerationPeriod",
    "criminalProbationPeriod",
    "probationStatusCode",
    "plaintiff",
    "defendant",
    "comment",
    "criminalDate",
    "additionalItem"
})
public class CriminalChargeType {

    @XmlElement(name = "ID")
    protected List<IdentifierType> id;
    @XmlElement(name = "ChargeOrComplaint")
    protected TextType chargeOrComplaint;
    @XmlElement(name = "CriminalChargeLevelCode")
    protected CriminalChargeLevelCodeType criminalChargeLevelCode;
    @XmlElement(name = "ArrestDate")
    protected FreeFormDateType arrestDate;
    @XmlElement(name = "OffenseDate")
    protected FreeFormDateType offenseDate;
    @XmlElement(name = "Sentence")
    protected TextType sentence;
    @XmlElement(name = "SentenceDate")
    protected FreeFormDateType sentenceDate;
    @XmlElement(name = "Plea")
    protected TextType plea;
    @XmlElement(name = "PleaDate")
    protected FreeFormDateType pleaDate;
    @XmlElement(name = "ChargeDispositionCode")
    protected ChargeDispositionCodeType chargeDispositionCode;
    @XmlElement(name = "DispositionDate")
    protected FreeFormDateType dispositionDate;
    @XmlElement(name = "StatusCode", namespace = "http://www.openapplications.org/oagis/9")
    protected CodeType statusCode;
    @XmlElement(name = "IncarcerationPeriod")
    protected FreeFormPeriodType incarcerationPeriod;
    @XmlElement(name = "CriminalProbationPeriod")
    protected FreeFormPeriodType criminalProbationPeriod;
    @XmlElement(name = "ProbationStatusCode")
    protected StatusCodeType probationStatusCode;
    @XmlElement(name = "Plaintiff")
    protected List<PlaintiffType> plaintiff;
    @XmlElement(name = "Defendant")
    protected List<DefendantType> defendant;
    @XmlElement(name = "Comment")
    protected List<NoteType> comment;
    @XmlElement(name = "CriminalDate")
    protected List<ScreeningDateType> criminalDate;
    @XmlElement(name = "AdditionalItem")
    protected List<AdditionalItemType> additionalItem;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getID() {
        if (id == null) {
            id = new ArrayList<IdentifierType>();
        }
        return this.id;
    }

    /**
     * Gets the value of the chargeOrComplaint property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getChargeOrComplaint() {
        return chargeOrComplaint;
    }

    /**
     * Sets the value of the chargeOrComplaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setChargeOrComplaint(TextType value) {
        this.chargeOrComplaint = value;
    }

    /**
     * Gets the value of the criminalChargeLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CriminalChargeLevelCodeType }
     *     
     */
    public CriminalChargeLevelCodeType getCriminalChargeLevelCode() {
        return criminalChargeLevelCode;
    }

    /**
     * Sets the value of the criminalChargeLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriminalChargeLevelCodeType }
     *     
     */
    public void setCriminalChargeLevelCode(CriminalChargeLevelCodeType value) {
        this.criminalChargeLevelCode = value;
    }

    /**
     * Gets the value of the arrestDate property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormDateType }
     *     
     */
    public FreeFormDateType getArrestDate() {
        return arrestDate;
    }

    /**
     * Sets the value of the arrestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormDateType }
     *     
     */
    public void setArrestDate(FreeFormDateType value) {
        this.arrestDate = value;
    }

    /**
     * Gets the value of the offenseDate property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormDateType }
     *     
     */
    public FreeFormDateType getOffenseDate() {
        return offenseDate;
    }

    /**
     * Sets the value of the offenseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormDateType }
     *     
     */
    public void setOffenseDate(FreeFormDateType value) {
        this.offenseDate = value;
    }

    /**
     * Gets the value of the sentence property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSentence() {
        return sentence;
    }

    /**
     * Sets the value of the sentence property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSentence(TextType value) {
        this.sentence = value;
    }

    /**
     * Gets the value of the sentenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormDateType }
     *     
     */
    public FreeFormDateType getSentenceDate() {
        return sentenceDate;
    }

    /**
     * Sets the value of the sentenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormDateType }
     *     
     */
    public void setSentenceDate(FreeFormDateType value) {
        this.sentenceDate = value;
    }

    /**
     * Gets the value of the plea property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPlea() {
        return plea;
    }

    /**
     * Sets the value of the plea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPlea(TextType value) {
        this.plea = value;
    }

    /**
     * Gets the value of the pleaDate property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormDateType }
     *     
     */
    public FreeFormDateType getPleaDate() {
        return pleaDate;
    }

    /**
     * Sets the value of the pleaDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormDateType }
     *     
     */
    public void setPleaDate(FreeFormDateType value) {
        this.pleaDate = value;
    }

    /**
     * Gets the value of the chargeDispositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeDispositionCodeType }
     *     
     */
    public ChargeDispositionCodeType getChargeDispositionCode() {
        return chargeDispositionCode;
    }

    /**
     * Sets the value of the chargeDispositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeDispositionCodeType }
     *     
     */
    public void setChargeDispositionCode(ChargeDispositionCodeType value) {
        this.chargeDispositionCode = value;
    }

    /**
     * Gets the value of the dispositionDate property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormDateType }
     *     
     */
    public FreeFormDateType getDispositionDate() {
        return dispositionDate;
    }

    /**
     * Sets the value of the dispositionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormDateType }
     *     
     */
    public void setDispositionDate(FreeFormDateType value) {
        this.dispositionDate = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatusCode(CodeType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the incarcerationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormPeriodType }
     *     
     */
    public FreeFormPeriodType getIncarcerationPeriod() {
        return incarcerationPeriod;
    }

    /**
     * Sets the value of the incarcerationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormPeriodType }
     *     
     */
    public void setIncarcerationPeriod(FreeFormPeriodType value) {
        this.incarcerationPeriod = value;
    }

    /**
     * Gets the value of the criminalProbationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormPeriodType }
     *     
     */
    public FreeFormPeriodType getCriminalProbationPeriod() {
        return criminalProbationPeriod;
    }

    /**
     * Sets the value of the criminalProbationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormPeriodType }
     *     
     */
    public void setCriminalProbationPeriod(FreeFormPeriodType value) {
        this.criminalProbationPeriod = value;
    }

    /**
     * Gets the value of the probationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeType }
     *     
     */
    public StatusCodeType getProbationStatusCode() {
        return probationStatusCode;
    }

    /**
     * Sets the value of the probationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeType }
     *     
     */
    public void setProbationStatusCode(StatusCodeType value) {
        this.probationStatusCode = value;
    }

    /**
     * Gets the value of the plaintiff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plaintiff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaintiff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaintiffType }
     * 
     * 
     */
    public List<PlaintiffType> getPlaintiff() {
        if (plaintiff == null) {
            plaintiff = new ArrayList<PlaintiffType>();
        }
        return this.plaintiff;
    }

    /**
     * Gets the value of the defendant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defendant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefendant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefendantType }
     * 
     * 
     */
    public List<DefendantType> getDefendant() {
        if (defendant == null) {
            defendant = new ArrayList<DefendantType>();
        }
        return this.defendant;
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
     * Gets the value of the criminalDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criminalDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriminalDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreeningDateType }
     * 
     * 
     */
    public List<ScreeningDateType> getCriminalDate() {
        if (criminalDate == null) {
            criminalDate = new ArrayList<ScreeningDateType>();
        }
        return this.criminalDate;
    }

    /**
     * Gets the value of the additionalItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalItemType }
     * 
     * 
     */
    public List<AdditionalItemType> getAdditionalItem() {
        if (additionalItem == null) {
            additionalItem = new ArrayList<AdditionalItemType>();
        }
        return this.additionalItem;
    }

}
