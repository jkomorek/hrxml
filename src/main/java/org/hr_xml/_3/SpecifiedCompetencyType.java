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
import org.openapplications.oagis._9.TextType;


/**
 * A "specified competency" is a reference to a particular competency at a specified level of proficiency.
 * 
 * <p>Java class for SpecifiedCompetencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedCompetencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}CompetencyID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}CompetencyName" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ProficiencyLevel" minOccurs="0"/>
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
@XmlType(name = "SpecifiedCompetencyType", propOrder = {
    "competencyID",
    "competencyName",
    "proficiencyLevel",
    "userArea"
})
public class SpecifiedCompetencyType {

    @XmlElement(name = "CompetencyID")
    protected List<IdentifierType> competencyID;
    @XmlElement(name = "CompetencyName")
    protected TextType competencyName;
    @XmlElement(name = "ProficiencyLevel")
    protected BaseScoreType proficiencyLevel;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;

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
     * Gets the value of the proficiencyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BaseScoreType }
     *     
     */
    public BaseScoreType getProficiencyLevel() {
        return proficiencyLevel;
    }

    /**
     * Sets the value of the proficiencyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseScoreType }
     *     
     */
    public void setProficiencyLevel(BaseScoreType value) {
        this.proficiencyLevel = value;
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