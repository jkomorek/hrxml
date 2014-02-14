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


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Job Level. Detail&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;This is a reference to a grouping of jobs within a formal pay structure, such as might be established using job evaluation methodologies. "Job evaluation" is a phrase  broadly used to refer to methods and practices of ordering jobs or positions with respect to their value or worth to an employer. "Ranking," "classification,"
 * "factor comparison," and "point method" are traditional methodologies for job evaluation. Job evaluation and the resulting pay structures are less common today than in the past. Market-based methodologies for setting pay tend to be more common today than formal methodologies relying on job evaluation. Nevertheless, formal job and pay structures remain common in certain sectors, such as in public-sector employment and in employment covered by collective bargaining agreements.  
 * &lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for JobLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}JobPlanCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}JobGradeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}JobStepCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobLevelType", propOrder = {
    "jobPlanCode",
    "jobGradeCode",
    "jobStepCode",
    "comment"
})
public class JobLevelType {

    @XmlElement(name = "JobPlanCode")
    protected CodeType jobPlanCode;
    @XmlElement(name = "JobGradeCode")
    protected CodeType jobGradeCode;
    @XmlElement(name = "JobStepCode")
    protected CodeType jobStepCode;
    @XmlElement(name = "Comment")
    protected List<NoteType> comment;

    /**
     * Gets the value of the jobPlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getJobPlanCode() {
        return jobPlanCode;
    }

    /**
     * Sets the value of the jobPlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setJobPlanCode(CodeType value) {
        this.jobPlanCode = value;
    }

    /**
     * Gets the value of the jobGradeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getJobGradeCode() {
        return jobGradeCode;
    }

    /**
     * Sets the value of the jobGradeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setJobGradeCode(CodeType value) {
        this.jobGradeCode = value;
    }

    /**
     * Gets the value of the jobStepCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getJobStepCode() {
        return jobStepCode;
    }

    /**
     * Sets the value of the jobStepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setJobStepCode(CodeType value) {
        this.jobStepCode = value;
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

}