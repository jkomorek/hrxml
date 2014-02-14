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


/**
 * The details surrounding where and how the new hire will be deployed within the employer.
 * 
 * <p>Java class for NewHireDeploymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewHireDeploymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}DeploymentOrganization" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}WorkLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Job" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}NewHirePosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AssignmentEntryReasonCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}WorkLevelCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}EmploymentTermCode" minOccurs="0"/>
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
@XmlType(name = "NewHireDeploymentType", propOrder = {
    "deploymentOrganization",
    "workLocation",
    "job",
    "newHirePosition",
    "assignmentEntryReasonCode",
    "workLevelCode",
    "employmentTermCode",
    "userArea"
})
public class NewHireDeploymentType {

    @XmlElement(name = "DeploymentOrganization")
    protected DeploymentOrganizationType deploymentOrganization;
    @XmlElement(name = "WorkLocation")
    protected WorkLocationType workLocation;
    @XmlElement(name = "Job")
    protected JobType job;
    @XmlElement(name = "NewHirePosition")
    protected PositionBaseType newHirePosition;
    @XmlElement(name = "AssignmentEntryReasonCode")
    protected AssignmentEntryReasonCodeType assignmentEntryReasonCode;
    @XmlElement(name = "WorkLevelCode")
    protected WorkLevelCodeEnumType workLevelCode;
    @XmlElement(name = "EmploymentTermCode")
    protected EmploymentTermCodeType employmentTermCode;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

    /**
     * Gets the value of the deploymentOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link DeploymentOrganizationType }
     *     
     */
    public DeploymentOrganizationType getDeploymentOrganization() {
        return deploymentOrganization;
    }

    /**
     * Sets the value of the deploymentOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeploymentOrganizationType }
     *     
     */
    public void setDeploymentOrganization(DeploymentOrganizationType value) {
        this.deploymentOrganization = value;
    }

    /**
     * Gets the value of the workLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WorkLocationType }
     *     
     */
    public WorkLocationType getWorkLocation() {
        return workLocation;
    }

    /**
     * Sets the value of the workLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkLocationType }
     *     
     */
    public void setWorkLocation(WorkLocationType value) {
        this.workLocation = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link JobType }
     *     
     */
    public JobType getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobType }
     *     
     */
    public void setJob(JobType value) {
        this.job = value;
    }

    /**
     * Gets the value of the newHirePosition property.
     * 
     * @return
     *     possible object is
     *     {@link PositionBaseType }
     *     
     */
    public PositionBaseType getNewHirePosition() {
        return newHirePosition;
    }

    /**
     * Sets the value of the newHirePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionBaseType }
     *     
     */
    public void setNewHirePosition(PositionBaseType value) {
        this.newHirePosition = value;
    }

    /**
     * Gets the value of the assignmentEntryReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentEntryReasonCodeType }
     *     
     */
    public AssignmentEntryReasonCodeType getAssignmentEntryReasonCode() {
        return assignmentEntryReasonCode;
    }

    /**
     * Sets the value of the assignmentEntryReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentEntryReasonCodeType }
     *     
     */
    public void setAssignmentEntryReasonCode(AssignmentEntryReasonCodeType value) {
        this.assignmentEntryReasonCode = value;
    }

    /**
     * Gets the value of the workLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link WorkLevelCodeEnumType }
     *     
     */
    public WorkLevelCodeEnumType getWorkLevelCode() {
        return workLevelCode;
    }

    /**
     * Sets the value of the workLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkLevelCodeEnumType }
     *     
     */
    public void setWorkLevelCode(WorkLevelCodeEnumType value) {
        this.workLevelCode = value;
    }

    /**
     * Gets the value of the employmentTermCode property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentTermCodeType }
     *     
     */
    public EmploymentTermCodeType getEmploymentTermCode() {
        return employmentTermCode;
    }

    /**
     * Sets the value of the employmentTermCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentTermCodeType }
     *     
     */
    public void setEmploymentTermCode(EmploymentTermCodeType value) {
        this.employmentTermCode = value;
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
