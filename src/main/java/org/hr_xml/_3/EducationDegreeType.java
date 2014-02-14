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
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Education Degree. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contains details about the student's degree.&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for EducationDegreeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EducationDegreeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}DegreeID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DegreeName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DegreeTypeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DegreeDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DegreeMajor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DegreeMinor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ClassRank" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AcademicHonors" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}JointDegreeIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ExamPassedIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}GraduatingDegreeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ReferenceLocation" minOccurs="0"/>
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
@XmlType(name = "EducationDegreeType", propOrder = {
    "degreeID",
    "degreeName",
    "degreeTypeCode",
    "degreeDate",
    "degreeMajor",
    "degreeMinor",
    "classRank",
    "academicHonors",
    "jointDegreeIndicator",
    "examPassedIndicator",
    "graduatingDegreeCode",
    "referenceLocation",
    "comment",
    "userArea"
})
public class EducationDegreeType {

    @XmlElement(name = "DegreeID")
    protected IdentifierType degreeID;
    @XmlElement(name = "DegreeName")
    protected List<TextType> degreeName;
    @XmlElement(name = "DegreeTypeCode")
    protected List<CodeType> degreeTypeCode;
    @XmlElement(name = "DegreeDate")
    protected FreeFormDateType degreeDate;
    @XmlElement(name = "DegreeMajor")
    protected List<DegreeSpecializationType> degreeMajor;
    @XmlElement(name = "DegreeMinor")
    protected List<DegreeSpecializationType> degreeMinor;
    @XmlElement(name = "ClassRank")
    protected ClassRankType classRank;
    @XmlElement(name = "AcademicHonors")
    protected List<TextType> academicHonors;
    @XmlElement(name = "JointDegreeIndicator")
    protected Boolean jointDegreeIndicator;
    @XmlElement(name = "ExamPassedIndicator")
    protected Boolean examPassedIndicator;
    @XmlElement(name = "GraduatingDegreeCode")
    protected GraduatingDegreeCodeType graduatingDegreeCode;
    @XmlElement(name = "ReferenceLocation")
    protected ReferenceLocationType referenceLocation;
    @XmlElement(name = "Comment")
    protected List<NoteType> comment;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the degreeID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getDegreeID() {
        return degreeID;
    }

    /**
     * Sets the value of the degreeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setDegreeID(IdentifierType value) {
        this.degreeID = value;
    }

    /**
     * Gets the value of the degreeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the degreeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDegreeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDegreeName() {
        if (degreeName == null) {
            degreeName = new ArrayList<TextType>();
        }
        return this.degreeName;
    }

    /**
     * Gets the value of the degreeTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the degreeTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDegreeTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getDegreeTypeCode() {
        if (degreeTypeCode == null) {
            degreeTypeCode = new ArrayList<CodeType>();
        }
        return this.degreeTypeCode;
    }

    /**
     * Gets the value of the degreeDate property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormDateType }
     *     
     */
    public FreeFormDateType getDegreeDate() {
        return degreeDate;
    }

    /**
     * Sets the value of the degreeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormDateType }
     *     
     */
    public void setDegreeDate(FreeFormDateType value) {
        this.degreeDate = value;
    }

    /**
     * Gets the value of the degreeMajor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the degreeMajor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDegreeMajor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DegreeSpecializationType }
     * 
     * 
     */
    public List<DegreeSpecializationType> getDegreeMajor() {
        if (degreeMajor == null) {
            degreeMajor = new ArrayList<DegreeSpecializationType>();
        }
        return this.degreeMajor;
    }

    /**
     * Gets the value of the degreeMinor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the degreeMinor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDegreeMinor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DegreeSpecializationType }
     * 
     * 
     */
    public List<DegreeSpecializationType> getDegreeMinor() {
        if (degreeMinor == null) {
            degreeMinor = new ArrayList<DegreeSpecializationType>();
        }
        return this.degreeMinor;
    }

    /**
     * Gets the value of the classRank property.
     * 
     * @return
     *     possible object is
     *     {@link ClassRankType }
     *     
     */
    public ClassRankType getClassRank() {
        return classRank;
    }

    /**
     * Sets the value of the classRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRankType }
     *     
     */
    public void setClassRank(ClassRankType value) {
        this.classRank = value;
    }

    /**
     * Gets the value of the academicHonors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicHonors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicHonors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getAcademicHonors() {
        if (academicHonors == null) {
            academicHonors = new ArrayList<TextType>();
        }
        return this.academicHonors;
    }

    /**
     * Gets the value of the jointDegreeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJointDegreeIndicator() {
        return jointDegreeIndicator;
    }

    /**
     * Sets the value of the jointDegreeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJointDegreeIndicator(Boolean value) {
        this.jointDegreeIndicator = value;
    }

    /**
     * Gets the value of the examPassedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExamPassedIndicator() {
        return examPassedIndicator;
    }

    /**
     * Sets the value of the examPassedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExamPassedIndicator(Boolean value) {
        this.examPassedIndicator = value;
    }

    /**
     * Gets the value of the graduatingDegreeCode property.
     * 
     * @return
     *     possible object is
     *     {@link GraduatingDegreeCodeType }
     *     
     */
    public GraduatingDegreeCodeType getGraduatingDegreeCode() {
        return graduatingDegreeCode;
    }

    /**
     * Sets the value of the graduatingDegreeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraduatingDegreeCodeType }
     *     
     */
    public void setGraduatingDegreeCode(GraduatingDegreeCodeType value) {
        this.graduatingDegreeCode = value;
    }

    /**
     * Gets the value of the referenceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLocationType }
     *     
     */
    public ReferenceLocationType getReferenceLocation() {
        return referenceLocation;
    }

    /**
     * Sets the value of the referenceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLocationType }
     *     
     */
    public void setReferenceLocation(ReferenceLocationType value) {
        this.referenceLocation = value;
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
