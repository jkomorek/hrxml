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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.DescriptionType;
import org.openapplications.oagis._9.NoteType;


/**
 * <p>Java class for RaterBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RaterBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PassedIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Weight" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Score" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}BandID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}IndividualRaterScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}MultiRaterScoreSummary" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}MultiRaterGroupScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Comment" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RaterBaseType", propOrder = {
    "id",
    "passedIndicator",
    "description",
    "weight",
    "score",
    "bandID",
    "individualRaterScore",
    "multiRaterScoreSummary",
    "multiRaterGroupScore",
    "comment",
    "userArea"
})
@XmlSeeAlso({
    BehavioralIndicatorScoreType.class,
    CompetencyResultType.class,
    OtherRatingGroupType.class,
    CompetencyResultGroupType.class
})
public class RaterBaseType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "PassedIndicator")
    protected Boolean passedIndicator;
    @XmlElement(name = "Description", namespace = "http://www.openapplications.org/oagis/9")
    protected List<DescriptionType> description;
    @XmlElement(name = "Weight")
    protected WeightType weight;
    @XmlElement(name = "Score")
    protected ScoreType score;
    @XmlElement(name = "BandID")
    protected IdentifierType bandID;
    @XmlElement(name = "IndividualRaterScore")
    protected List<IndividualRaterScoreType> individualRaterScore;
    @XmlElement(name = "MultiRaterScoreSummary")
    protected MultiRaterScoreSummaryType multiRaterScoreSummary;
    @XmlElement(name = "MultiRaterGroupScore")
    protected List<MultiRaterGroupScoreType> multiRaterGroupScore;
    @XmlElement(name = "Comment")
    protected List<NoteType> comment;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

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
     * Gets the value of the passedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassedIndicator() {
        return passedIndicator;
    }

    /**
     * Sets the value of the passedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassedIndicator(Boolean value) {
        this.passedIndicator = value;
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
     * Gets the value of the bandID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getBandID() {
        return bandID;
    }

    /**
     * Sets the value of the bandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setBandID(IdentifierType value) {
        this.bandID = value;
    }

    /**
     * Gets the value of the individualRaterScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualRaterScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualRaterScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualRaterScoreType }
     * 
     * 
     */
    public List<IndividualRaterScoreType> getIndividualRaterScore() {
        if (individualRaterScore == null) {
            individualRaterScore = new ArrayList<IndividualRaterScoreType>();
        }
        return this.individualRaterScore;
    }

    /**
     * Gets the value of the multiRaterScoreSummary property.
     * 
     * @return
     *     possible object is
     *     {@link MultiRaterScoreSummaryType }
     *     
     */
    public MultiRaterScoreSummaryType getMultiRaterScoreSummary() {
        return multiRaterScoreSummary;
    }

    /**
     * Sets the value of the multiRaterScoreSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiRaterScoreSummaryType }
     *     
     */
    public void setMultiRaterScoreSummary(MultiRaterScoreSummaryType value) {
        this.multiRaterScoreSummary = value;
    }

    /**
     * Gets the value of the multiRaterGroupScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiRaterGroupScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiRaterGroupScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiRaterGroupScoreType }
     * 
     * 
     */
    public List<MultiRaterGroupScoreType> getMultiRaterGroupScore() {
        if (multiRaterGroupScore == null) {
            multiRaterGroupScore = new ArrayList<MultiRaterGroupScoreType>();
        }
        return this.multiRaterGroupScore;
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