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
 * Collection of information relating to the new hire. This includes personal data as well as information relating to the new hire's employment and his or her new assignment (job, position, etc.) within the employer.
 * 
 * <p>Java class for NewHireDossierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewHireDossierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}NewHirePerson" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}NewHireProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}NewHireEmployee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}NewHireEmployment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}NewHireDeployment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Affiliation" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "NewHireDossierType", propOrder = {
    "newHirePerson",
    "newHireProfile",
    "newHireEmployee",
    "newHireEmployment",
    "newHireDeployment",
    "affiliation",
    "userArea"
})
public class NewHireDossierType {

    @XmlElement(name = "NewHirePerson")
    protected CandidatePersonType newHirePerson;
    @XmlElement(name = "NewHireProfile")
    protected List<CandidateProfileType> newHireProfile;
    @XmlElement(name = "NewHireEmployee")
    protected List<NewHireEmployeeType> newHireEmployee;
    @XmlElement(name = "NewHireEmployment")
    protected List<EmploymentBaseType> newHireEmployment;
    @XmlElement(name = "NewHireDeployment")
    protected List<NewHireDeploymentType> newHireDeployment;
    @XmlElement(name = "Affiliation")
    protected List<AffiliationType> affiliation;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

    /**
     * Note that NewHirePerson is unbounded not to represent details about muliple people, but because under certain data management approaches it may be necessary to represent the same person across different states.
     * 
     * @return
     *     possible object is
     *     {@link CandidatePersonType }
     *     
     */
    public CandidatePersonType getNewHirePerson() {
        return newHirePerson;
    }

    /**
     * Sets the value of the newHirePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidatePersonType }
     *     
     */
    public void setNewHirePerson(CandidatePersonType value) {
        this.newHirePerson = value;
    }

    /**
     * Gets the value of the newHireProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newHireProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewHireProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CandidateProfileType }
     * 
     * 
     */
    public List<CandidateProfileType> getNewHireProfile() {
        if (newHireProfile == null) {
            newHireProfile = new ArrayList<CandidateProfileType>();
        }
        return this.newHireProfile;
    }

    /**
     * Gets the value of the newHireEmployee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newHireEmployee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewHireEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewHireEmployeeType }
     * 
     * 
     */
    public List<NewHireEmployeeType> getNewHireEmployee() {
        if (newHireEmployee == null) {
            newHireEmployee = new ArrayList<NewHireEmployeeType>();
        }
        return this.newHireEmployee;
    }

    /**
     * Gets the value of the newHireEmployment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newHireEmployment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewHireEmployment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmploymentBaseType }
     * 
     * 
     */
    public List<EmploymentBaseType> getNewHireEmployment() {
        if (newHireEmployment == null) {
            newHireEmployment = new ArrayList<EmploymentBaseType>();
        }
        return this.newHireEmployment;
    }

    /**
     * Gets the value of the newHireDeployment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newHireDeployment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewHireDeployment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewHireDeploymentType }
     * 
     * 
     */
    public List<NewHireDeploymentType> getNewHireDeployment() {
        if (newHireDeployment == null) {
            newHireDeployment = new ArrayList<NewHireDeploymentType>();
        }
        return this.newHireDeployment;
    }

    /**
     * Gets the value of the affiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffiliationType }
     * 
     * 
     */
    public List<AffiliationType> getAffiliation() {
        if (affiliation == null) {
            affiliation = new ArrayList<AffiliationType>();
        }
        return this.affiliation;
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