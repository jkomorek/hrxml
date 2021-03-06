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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/9}PersonABIEType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.openapplications.org/oagis/9}EmployeeGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Status" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Classification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeBaseType", propOrder = {
    "jobTitle",
    "jobCode",
    "responsibility",
    "departmentID",
    "categoryCodes",
    "categoryClassification",
    "qualification",
    "skill",
    "status",
    "classification"
})
@XmlSeeAlso({
    EmployeeType.class
})
public abstract class EmployeeBaseType
    extends PersonABIEType
{

    @XmlElement(name = "JobTitle")
    protected List<TextType> jobTitle;
    @XmlElement(name = "JobCode")
    protected CodeType jobCode;
    @XmlElement(name = "Responsibility")
    protected List<TextType> responsibility;
    @XmlElement(name = "DepartmentID")
    protected IdentifierType departmentID;
    @XmlElement(name = "CategoryCodes")
    protected CodesType categoryCodes;
    @XmlElement(name = "CategoryClassification")
    protected List<ClassificationType> categoryClassification;
    @XmlElement(name = "Qualification")
    protected List<ProfessionalQualificationType> qualification;
    @XmlElement(name = "Skill")
    protected List<ProfessionalSkillType> skill;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classification;

    /**
     * Gets the value of the jobTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getJobTitle() {
        if (jobTitle == null) {
            jobTitle = new ArrayList<TextType>();
        }
        return this.jobTitle;
    }

    /**
     * Gets the value of the jobCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getJobCode() {
        return jobCode;
    }

    /**
     * Sets the value of the jobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setJobCode(CodeType value) {
        this.jobCode = value;
    }

    /**
     * Gets the value of the responsibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getResponsibility() {
        if (responsibility == null) {
            responsibility = new ArrayList<TextType>();
        }
        return this.responsibility;
    }

    /**
     * Gets the value of the departmentID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getDepartmentID() {
        return departmentID;
    }

    /**
     * Sets the value of the departmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setDepartmentID(IdentifierType value) {
        this.departmentID = value;
    }

    /**
     * Gets the value of the categoryCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CodesType }
     *     
     */
    public CodesType getCategoryCodes() {
        return categoryCodes;
    }

    /**
     * Sets the value of the categoryCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesType }
     *     
     */
    public void setCategoryCodes(CodesType value) {
        this.categoryCodes = value;
    }

    /**
     * Gets the value of the categoryClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getCategoryClassification() {
        if (categoryClassification == null) {
            categoryClassification = new ArrayList<ClassificationType>();
        }
        return this.categoryClassification;
    }

    /**
     * Gets the value of the qualification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionalQualificationType }
     * 
     * 
     */
    public List<ProfessionalQualificationType> getQualification() {
        if (qualification == null) {
            qualification = new ArrayList<ProfessionalQualificationType>();
        }
        return this.qualification;
    }

    /**
     * Gets the value of the skill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionalSkillType }
     * 
     * 
     */
    public List<ProfessionalSkillType> getSkill() {
        if (skill == null) {
            skill = new ArrayList<ProfessionalSkillType>();
        }
        return this.skill;
    }

    /**
     * This is a code or identifier that describes the current work status of an employee.  It indicates the condition of the employment of the employee.  Also known as the employee category. Examples are: Active, Inactive, No longer employed, Part time, Full time, Temporary, Casual
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationType>();
        }
        return this.classification;
    }

}
