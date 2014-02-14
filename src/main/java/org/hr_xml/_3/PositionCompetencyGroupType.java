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
import org.openapplications.oagis._9.TextType;


/**
 * <p>Java class for PositionCompetencyGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionCompetencyGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ParentGroupID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CompetencyID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CompetencyName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Weight" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RequiredProficiencyLevel" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DesiredProficiencyLevel" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ProficiencyAcquisitionDifficulty" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CompetencyClassificationCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CompetencyDimension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CompetencyEvidenceRequirements" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}RelatedCompetency" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PositionCompetency" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PositionCompetencyGroupType", propOrder = {
    "id",
    "parentGroupID",
    "competencyID",
    "competencyName",
    "weight",
    "requiredProficiencyLevel",
    "desiredProficiencyLevel",
    "proficiencyAcquisitionDifficulty",
    "competencyClassificationCode",
    "competencyDimension",
    "competencyEvidenceRequirements",
    "relatedCompetency",
    "positionCompetency",
    "userArea"
})
public class PositionCompetencyGroupType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "ParentGroupID")
    protected IdentifierType parentGroupID;
    @XmlElement(name = "CompetencyID")
    protected List<IdentifierType> competencyID;
    @XmlElement(name = "CompetencyName")
    protected TextType competencyName;
    @XmlElement(name = "Weight")
    protected WeightType weight;
    @XmlElement(name = "RequiredProficiencyLevel")
    protected BaseScoreType requiredProficiencyLevel;
    @XmlElement(name = "DesiredProficiencyLevel")
    protected BaseScoreType desiredProficiencyLevel;
    @XmlElement(name = "ProficiencyAcquisitionDifficulty")
    protected BaseScoreType proficiencyAcquisitionDifficulty;
    @XmlElement(name = "CompetencyClassificationCode")
    protected List<CodeType> competencyClassificationCode;
    @XmlElement(name = "CompetencyDimension")
    protected List<CompetencyDimensionType> competencyDimension;
    @XmlElement(name = "CompetencyEvidenceRequirements")
    protected List<CompetencyEvidenceRequirementsType> competencyEvidenceRequirements;
    @XmlElement(name = "RelatedCompetency")
    protected List<RelatedCompetencyType> relatedCompetency;
    @XmlElement(name = "PositionCompetency")
    protected List<PositionCompetencyType> positionCompetency;
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
     * Gets the value of the parentGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getParentGroupID() {
        return parentGroupID;
    }

    /**
     * Sets the value of the parentGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setParentGroupID(IdentifierType value) {
        this.parentGroupID = value;
    }

    /**
     * Gets the value of the competencyID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competencyID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetencyID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getCompetencyID() {
        if (competencyID == null) {
            competencyID = new ArrayList<IdentifierType>();
        }
        return this.competencyID;
    }

    /**
     * Gets the value of the competencyName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCompetencyName() {
        return competencyName;
    }

    /**
     * Sets the value of the competencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCompetencyName(TextType value) {
        this.competencyName = value;
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
     * Gets the value of the requiredProficiencyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BaseScoreType }
     *     
     */
    public BaseScoreType getRequiredProficiencyLevel() {
        return requiredProficiencyLevel;
    }

    /**
     * Sets the value of the requiredProficiencyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseScoreType }
     *     
     */
    public void setRequiredProficiencyLevel(BaseScoreType value) {
        this.requiredProficiencyLevel = value;
    }

    /**
     * Gets the value of the desiredProficiencyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BaseScoreType }
     *     
     */
    public BaseScoreType getDesiredProficiencyLevel() {
        return desiredProficiencyLevel;
    }

    /**
     * Sets the value of the desiredProficiencyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseScoreType }
     *     
     */
    public void setDesiredProficiencyLevel(BaseScoreType value) {
        this.desiredProficiencyLevel = value;
    }

    /**
     * Gets the value of the proficiencyAcquisitionDifficulty property.
     * 
     * @return
     *     possible object is
     *     {@link BaseScoreType }
     *     
     */
    public BaseScoreType getProficiencyAcquisitionDifficulty() {
        return proficiencyAcquisitionDifficulty;
    }

    /**
     * Sets the value of the proficiencyAcquisitionDifficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseScoreType }
     *     
     */
    public void setProficiencyAcquisitionDifficulty(BaseScoreType value) {
        this.proficiencyAcquisitionDifficulty = value;
    }

    /**
     * Gets the value of the competencyClassificationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competencyClassificationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetencyClassificationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getCompetencyClassificationCode() {
        if (competencyClassificationCode == null) {
            competencyClassificationCode = new ArrayList<CodeType>();
        }
        return this.competencyClassificationCode;
    }

    /**
     * Gets the value of the competencyDimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competencyDimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetencyDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetencyDimensionType }
     * 
     * 
     */
    public List<CompetencyDimensionType> getCompetencyDimension() {
        if (competencyDimension == null) {
            competencyDimension = new ArrayList<CompetencyDimensionType>();
        }
        return this.competencyDimension;
    }

    /**
     * Gets the value of the competencyEvidenceRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competencyEvidenceRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetencyEvidenceRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetencyEvidenceRequirementsType }
     * 
     * 
     */
    public List<CompetencyEvidenceRequirementsType> getCompetencyEvidenceRequirements() {
        if (competencyEvidenceRequirements == null) {
            competencyEvidenceRequirements = new ArrayList<CompetencyEvidenceRequirementsType>();
        }
        return this.competencyEvidenceRequirements;
    }

    /**
     * Gets the value of the relatedCompetency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedCompetency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedCompetency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedCompetencyType }
     * 
     * 
     */
    public List<RelatedCompetencyType> getRelatedCompetency() {
        if (relatedCompetency == null) {
            relatedCompetency = new ArrayList<RelatedCompetencyType>();
        }
        return this.relatedCompetency;
    }

    /**
     * Gets the value of the positionCompetency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionCompetency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionCompetency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionCompetencyType }
     * 
     * 
     */
    public List<PositionCompetencyType> getPositionCompetency() {
        if (positionCompetency == null) {
            positionCompetency = new ArrayList<PositionCompetencyType>();
        }
        return this.positionCompetency;
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
