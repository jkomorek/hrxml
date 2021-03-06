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
import org.openapplications.oagis._9.DescriptionType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Staffing Requisition. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Captures information about a requirement to be filled by a staffing supplier. A staffing requisition is a statement of
 * 		staffing resource requirements.  OED:  Requisition n.  A requirement, necessary condition.;  The (or an) action of formally requiring or calling upon one to perform some action, discharge some duty, etc.;  the fact of being so called upon. Also, a written demand of this nature.; requisition form, note, notice, paper, slip.&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for StaffingRequisitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffingRequisitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hr-xml.org/3}BasePositionProfileType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}StaffingAvailability" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Shift" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Schedule" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RequisitionReasonCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ReportsToPerson" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StaffingRate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StaffingOvertime" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}LaborBargainingUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionScreeningRequirements" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StaffingTransitionRequirement" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RequestedPerson" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}InterviewRequiredIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ResumeRequiredIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}JPStaffingRequisition" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}StaffingInvoiceRequirements" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Instructions" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserArea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffingRequisitionType", propOrder = {
    "staffingAvailability",
    "shift",
    "schedule",
    "requisitionReasonCode",
    "reportsToPerson",
    "staffingRate",
    "staffingOvertime",
    "laborBargainingUnit",
    "positionScreeningRequirements",
    "staffingTransitionRequirement",
    "requestedPerson",
    "interviewRequiredIndicator",
    "resumeRequiredIndicator",
    "jpStaffingRequisition",
    "staffingInvoiceRequirements",
    "instructions",
    "attachment",
    "userArea"
})
public class StaffingRequisitionType
    extends BasePositionProfileType
{

    @XmlElement(name = "StaffingAvailability")
    protected StaffingAvailabilityType staffingAvailability;
    @XmlElement(name = "Shift")
    protected ShiftType shift;
    @XmlElement(name = "Schedule")
    protected ScheduleType schedule;
    @XmlElement(name = "RequisitionReasonCode")
    protected CodeType requisitionReasonCode;
    @XmlElement(name = "ReportsToPerson")
    protected ReportsToPersonType reportsToPerson;
    @XmlElement(name = "StaffingRate")
    protected List<StaffingRateType> staffingRate;
    @XmlElement(name = "StaffingOvertime")
    protected StaffingOvertimeType staffingOvertime;
    @XmlElement(name = "LaborBargainingUnit")
    protected List<LaborBargainingUnitType> laborBargainingUnit;
    @XmlElement(name = "PositionScreeningRequirements")
    protected PositionScreeningRequirementsType positionScreeningRequirements;
    @XmlElement(name = "StaffingTransitionRequirement")
    protected StaffingTransitionRequirementType staffingTransitionRequirement;
    @XmlElement(name = "RequestedPerson")
    protected RequestedPersonType requestedPerson;
    @XmlElement(name = "InterviewRequiredIndicator")
    protected Boolean interviewRequiredIndicator;
    @XmlElement(name = "ResumeRequiredIndicator")
    protected Boolean resumeRequiredIndicator;
    @XmlElement(name = "JPStaffingRequisition")
    protected JPStaffingRequisitionType jpStaffingRequisition;
    @XmlElement(name = "StaffingInvoiceRequirements")
    protected StaffingInvoiceRequirementsType staffingInvoiceRequirements;
    @XmlElement(name = "Instructions")
    protected DescriptionType instructions;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

    /**
     * Gets the value of the staffingAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link StaffingAvailabilityType }
     *     
     */
    public StaffingAvailabilityType getStaffingAvailability() {
        return staffingAvailability;
    }

    /**
     * Sets the value of the staffingAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffingAvailabilityType }
     *     
     */
    public void setStaffingAvailability(StaffingAvailabilityType value) {
        this.staffingAvailability = value;
    }

    /**
     * Gets the value of the shift property.
     * 
     * @return
     *     possible object is
     *     {@link ShiftType }
     *     
     */
    public ShiftType getShift() {
        return shift;
    }

    /**
     * Sets the value of the shift property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShiftType }
     *     
     */
    public void setShift(ShiftType value) {
        this.shift = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setSchedule(ScheduleType value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the requisitionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRequisitionReasonCode() {
        return requisitionReasonCode;
    }

    /**
     * Sets the value of the requisitionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRequisitionReasonCode(CodeType value) {
        this.requisitionReasonCode = value;
    }

    /**
     * Gets the value of the reportsToPerson property.
     * 
     * @return
     *     possible object is
     *     {@link ReportsToPersonType }
     *     
     */
    public ReportsToPersonType getReportsToPerson() {
        return reportsToPerson;
    }

    /**
     * Sets the value of the reportsToPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportsToPersonType }
     *     
     */
    public void setReportsToPerson(ReportsToPersonType value) {
        this.reportsToPerson = value;
    }

    /**
     * Gets the value of the staffingRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffingRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffingRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffingRateType }
     * 
     * 
     */
    public List<StaffingRateType> getStaffingRate() {
        if (staffingRate == null) {
            staffingRate = new ArrayList<StaffingRateType>();
        }
        return this.staffingRate;
    }

    /**
     * Gets the value of the staffingOvertime property.
     * 
     * @return
     *     possible object is
     *     {@link StaffingOvertimeType }
     *     
     */
    public StaffingOvertimeType getStaffingOvertime() {
        return staffingOvertime;
    }

    /**
     * Sets the value of the staffingOvertime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffingOvertimeType }
     *     
     */
    public void setStaffingOvertime(StaffingOvertimeType value) {
        this.staffingOvertime = value;
    }

    /**
     * Gets the value of the laborBargainingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laborBargainingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaborBargainingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaborBargainingUnitType }
     * 
     * 
     */
    public List<LaborBargainingUnitType> getLaborBargainingUnit() {
        if (laborBargainingUnit == null) {
            laborBargainingUnit = new ArrayList<LaborBargainingUnitType>();
        }
        return this.laborBargainingUnit;
    }

    /**
     * Gets the value of the positionScreeningRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link PositionScreeningRequirementsType }
     *     
     */
    public PositionScreeningRequirementsType getPositionScreeningRequirements() {
        return positionScreeningRequirements;
    }

    /**
     * Sets the value of the positionScreeningRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionScreeningRequirementsType }
     *     
     */
    public void setPositionScreeningRequirements(PositionScreeningRequirementsType value) {
        this.positionScreeningRequirements = value;
    }

    /**
     * Gets the value of the staffingTransitionRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link StaffingTransitionRequirementType }
     *     
     */
    public StaffingTransitionRequirementType getStaffingTransitionRequirement() {
        return staffingTransitionRequirement;
    }

    /**
     * Sets the value of the staffingTransitionRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffingTransitionRequirementType }
     *     
     */
    public void setStaffingTransitionRequirement(StaffingTransitionRequirementType value) {
        this.staffingTransitionRequirement = value;
    }

    /**
     * Gets the value of the requestedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedPersonType }
     *     
     */
    public RequestedPersonType getRequestedPerson() {
        return requestedPerson;
    }

    /**
     * Sets the value of the requestedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedPersonType }
     *     
     */
    public void setRequestedPerson(RequestedPersonType value) {
        this.requestedPerson = value;
    }

    /**
     * Gets the value of the interviewRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterviewRequiredIndicator() {
        return interviewRequiredIndicator;
    }

    /**
     * Sets the value of the interviewRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterviewRequiredIndicator(Boolean value) {
        this.interviewRequiredIndicator = value;
    }

    /**
     * Gets the value of the resumeRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResumeRequiredIndicator() {
        return resumeRequiredIndicator;
    }

    /**
     * Sets the value of the resumeRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResumeRequiredIndicator(Boolean value) {
        this.resumeRequiredIndicator = value;
    }

    /**
     * Gets the value of the jpStaffingRequisition property.
     * 
     * @return
     *     possible object is
     *     {@link JPStaffingRequisitionType }
     *     
     */
    public JPStaffingRequisitionType getJPStaffingRequisition() {
        return jpStaffingRequisition;
    }

    /**
     * Sets the value of the jpStaffingRequisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPStaffingRequisitionType }
     *     
     */
    public void setJPStaffingRequisition(JPStaffingRequisitionType value) {
        this.jpStaffingRequisition = value;
    }

    /**
     * Gets the value of the staffingInvoiceRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link StaffingInvoiceRequirementsType }
     *     
     */
    public StaffingInvoiceRequirementsType getStaffingInvoiceRequirements() {
        return staffingInvoiceRequirements;
    }

    /**
     * Sets the value of the staffingInvoiceRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffingInvoiceRequirementsType }
     *     
     */
    public void setStaffingInvoiceRequirements(StaffingInvoiceRequirementsType value) {
        this.staffingInvoiceRequirements = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setInstructions(DescriptionType value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentType>();
        }
        return this.attachment;
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
