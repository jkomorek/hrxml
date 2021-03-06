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
import org.openapplications.oagis._9.DescriptionType;
import org.openapplications.oagis._9.NameType;
import org.openapplications.oagis._9.TimePeriodType;


/**
 * <p>Java class for DevelopmentItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}LearningObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}DevelopmentItemStatusCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}TimePeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Metric" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ResultAgainstMetric" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DevelopmentItemType", propOrder = {
    "id",
    "name",
    "description",
    "learningObjectReference",
    "developmentItemStatusCode",
    "timePeriod",
    "metric",
    "resultAgainstMetric",
    "userArea"
})
public class DevelopmentItemType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Name", namespace = "http://www.openapplications.org/oagis/9")
    protected NameType name;
    @XmlElement(name = "Description", namespace = "http://www.openapplications.org/oagis/9")
    protected List<DescriptionType> description;
    @XmlElement(name = "LearningObjectReference")
    protected List<LearningObjectReferenceType> learningObjectReference;
    @XmlElement(name = "DevelopmentItemStatusCode")
    protected DevelopmentItemStatusCodeType developmentItemStatusCode;
    @XmlElement(name = "TimePeriod", namespace = "http://www.openapplications.org/oagis/9")
    protected TimePeriodType timePeriod;
    @XmlElement(name = "Metric")
    protected List<MetricType> metric;
    @XmlElement(name = "ResultAgainstMetric")
    protected List<ResultAgainstMetricType> resultAgainstMetric;
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
     * The label or title given to a instruction or requirement for training or development.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the learningObjectReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningObjectReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningObjectReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearningObjectReferenceType }
     * 
     * 
     */
    public List<LearningObjectReferenceType> getLearningObjectReference() {
        if (learningObjectReference == null) {
            learningObjectReference = new ArrayList<LearningObjectReferenceType>();
        }
        return this.learningObjectReference;
    }

    /**
     * Gets the value of the developmentItemStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentItemStatusCodeType }
     *     
     */
    public DevelopmentItemStatusCodeType getDevelopmentItemStatusCode() {
        return developmentItemStatusCode;
    }

    /**
     * Sets the value of the developmentItemStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentItemStatusCodeType }
     *     
     */
    public void setDevelopmentItemStatusCode(DevelopmentItemStatusCodeType value) {
        this.developmentItemStatusCode = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the metric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetricType }
     * 
     * 
     */
    public List<MetricType> getMetric() {
        if (metric == null) {
            metric = new ArrayList<MetricType>();
        }
        return this.metric;
    }

    /**
     * Gets the value of the resultAgainstMetric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultAgainstMetric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultAgainstMetric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultAgainstMetricType }
     * 
     * 
     */
    public List<ResultAgainstMetricType> getResultAgainstMetric() {
        if (resultAgainstMetric == null) {
            resultAgainstMetric = new ArrayList<ResultAgainstMetricType>();
        }
        return this.resultAgainstMetric;
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
