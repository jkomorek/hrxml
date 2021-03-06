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
 * This component may be used to capture information
 * substantiating a person's eligibility to work within a given jurisdiction. Legal requirements
 * vary by jurisdiction. The information presented here, together with information
 * elsewhere available within the applicable HR-XML noun (for example, HireDateSet) 
 * may be useful in fulfilling related compliance duties. Note that images of
 * source documents can be referenced or 
 * embedded as binary data within "Attachment".
 * 
 * <p>Java class for WorkEligibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkEligibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}GovernmentFormID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}WorkEligibilityDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}Verification" minOccurs="0"/>
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
@XmlType(name = "WorkEligibilityType", propOrder = {
    "id",
    "governmentFormID",
    "workEligibilityDocument",
    "verification",
    "userArea"
})
public class WorkEligibilityType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "GovernmentFormID")
    protected IdentifierType governmentFormID;
    @XmlElement(name = "WorkEligibilityDocument")
    protected List<WorkEligibilityDocumentType> workEligibilityDocument;
    @XmlElement(name = "Verification")
    protected VerificationType verification;
    @XmlElement(name = "UserArea")
    protected UserAreaType userArea;
    @XmlAttribute(name = "validFrom")
    protected List<String> validFrom;
    @XmlAttribute(name = "validTo")
    protected List<String> validTo;

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
     * This would be an identifier for a government form associated 
     * 			with the process to verify an individual's legal eligibility to work. In the United States, for instance, 
     * 			the value might be "I-9" which is a form regulated by the U.S. Department of Homeland Security, 
     * 			U.S. Citizenship and Immigration Services.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getGovernmentFormID() {
        return governmentFormID;
    }

    /**
     * Sets the value of the governmentFormID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setGovernmentFormID(IdentifierType value) {
        this.governmentFormID = value;
    }

    /**
     * Gets the value of the workEligibilityDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workEligibilityDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkEligibilityDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkEligibilityDocumentType }
     * 
     * 
     */
    public List<WorkEligibilityDocumentType> getWorkEligibilityDocument() {
        if (workEligibilityDocument == null) {
            workEligibilityDocument = new ArrayList<WorkEligibilityDocumentType>();
        }
        return this.workEligibilityDocument;
    }

    /**
     * Gets the value of the verification property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationType }
     *     
     */
    public VerificationType getVerification() {
        return verification;
    }

    /**
     * Sets the value of the verification property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationType }
     *     
     */
    public void setVerification(VerificationType value) {
        this.verification = value;
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
