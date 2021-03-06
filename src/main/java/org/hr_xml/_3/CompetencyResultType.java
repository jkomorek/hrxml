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


/**
 * <p>Java class for CompetencyResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompetencyResultType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.hr-xml.org/3}RaterBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}AssessedCompetency" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}BehavioralIndicatorScore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DevelopmentItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetencyResultType", propOrder = {
    "assessedCompetency",
    "behavioralIndicatorScore",
    "developmentItem"
})
public class CompetencyResultType
    extends RaterBaseType
{

    @XmlElement(name = "AssessedCompetency")
    protected SpecifiedCompetencyType assessedCompetency;
    @XmlElement(name = "BehavioralIndicatorScore")
    protected List<BehavioralIndicatorScoreType> behavioralIndicatorScore;
    @XmlElement(name = "DevelopmentItem")
    protected List<DevelopmentItemType> developmentItem;

    /**
     * Gets the value of the assessedCompetency property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedCompetencyType }
     *     
     */
    public SpecifiedCompetencyType getAssessedCompetency() {
        return assessedCompetency;
    }

    /**
     * Sets the value of the assessedCompetency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedCompetencyType }
     *     
     */
    public void setAssessedCompetency(SpecifiedCompetencyType value) {
        this.assessedCompetency = value;
    }

    /**
     * Gets the value of the behavioralIndicatorScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the behavioralIndicatorScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBehavioralIndicatorScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BehavioralIndicatorScoreType }
     * 
     * 
     */
    public List<BehavioralIndicatorScoreType> getBehavioralIndicatorScore() {
        if (behavioralIndicatorScore == null) {
            behavioralIndicatorScore = new ArrayList<BehavioralIndicatorScoreType>();
        }
        return this.behavioralIndicatorScore;
    }

    /**
     * Gets the value of the developmentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the developmentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevelopmentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevelopmentItemType }
     * 
     * 
     */
    public List<DevelopmentItemType> getDevelopmentItem() {
        if (developmentItem == null) {
            developmentItem = new ArrayList<DevelopmentItemType>();
        }
        return this.developmentItem;
    }

}
