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
import org.openapplications.oagis._9.NoteType;


/**
 * <p>Java class for EducationOrganizationVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EducationOrganizationVerificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hr-xml.org/3}EducationOrganizationAttendanceBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}SubjectDataReleaseBlockIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}SchoolDataReleaseBlockIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}QuestionAnswerPair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AdditionalItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationOrganizationVerificationType", propOrder = {
    "subjectDataReleaseBlockIndicator",
    "schoolDataReleaseBlockIndicator",
    "questionAnswerPair",
    "comment",
    "additionalItem"
})
public class EducationOrganizationVerificationType
    extends EducationOrganizationAttendanceBaseType
{

    @XmlElement(name = "SubjectDataReleaseBlockIndicator")
    protected Boolean subjectDataReleaseBlockIndicator;
    @XmlElement(name = "SchoolDataReleaseBlockIndicator")
    protected Boolean schoolDataReleaseBlockIndicator;
    @XmlElement(name = "QuestionAnswerPair")
    protected List<QuestionAnswerPairType> questionAnswerPair;
    @XmlElement(name = "Comment")
    protected List<NoteType> comment;
    @XmlElement(name = "AdditionalItem")
    protected List<AdditionalItemType> additionalItem;

    /**
     * Gets the value of the subjectDataReleaseBlockIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubjectDataReleaseBlockIndicator() {
        return subjectDataReleaseBlockIndicator;
    }

    /**
     * Sets the value of the subjectDataReleaseBlockIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubjectDataReleaseBlockIndicator(Boolean value) {
        this.subjectDataReleaseBlockIndicator = value;
    }

    /**
     * Gets the value of the schoolDataReleaseBlockIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchoolDataReleaseBlockIndicator() {
        return schoolDataReleaseBlockIndicator;
    }

    /**
     * Sets the value of the schoolDataReleaseBlockIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchoolDataReleaseBlockIndicator(Boolean value) {
        this.schoolDataReleaseBlockIndicator = value;
    }

    /**
     * Gets the value of the questionAnswerPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionAnswerPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionAnswerPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionAnswerPairType }
     * 
     * 
     */
    public List<QuestionAnswerPairType> getQuestionAnswerPair() {
        if (questionAnswerPair == null) {
            questionAnswerPair = new ArrayList<QuestionAnswerPairType>();
        }
        return this.questionAnswerPair;
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
