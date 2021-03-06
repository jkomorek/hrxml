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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.CodeType;
import org.openapplications.oagis._9.DescriptionType;
import org.openapplications.oagis._9.NameType;


/**
 * The term "Package" is used in the contexts of Screening and Assessment (and possibly other HR service areas) to describe a set of component services that are marketed and can be ordered as a unit. Such orders generally are accomplished by referencing the associated "Package ID". In some cases, individual component services also may be ordered using a so-called "a la carte" approach. This base type is extended appropriately so it can be used both in the context of Assessment and Screening catalogs. The catalogs may reflect an assessment or screening provider's general offerings to the business community or the catalogs may contain a subset of offerings that have been designed or specified for a particular customer. 
 * 
 * <p>Java class for PackageBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}ID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Name" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ParentGroupID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PackageTypeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PartyReportingIDs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}ServiceAvailabilityCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}PackageCost" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageBaseType", propOrder = {
    "id",
    "name",
    "description",
    "parentGroupID",
    "packageTypeCode",
    "partyReportingIDs",
    "serviceAvailabilityCode",
    "packageCost"
})
@XmlSeeAlso({
    AssessmentPackageType.class
})
public class PackageBaseType {

    @XmlElement(name = "ID")
    protected List<IdentifierType> id;
    @XmlElement(name = "Name", namespace = "http://www.openapplications.org/oagis/9")
    protected NameType name;
    @XmlElement(name = "Description", namespace = "http://www.openapplications.org/oagis/9")
    protected List<DescriptionType> description;
    @XmlElement(name = "ParentGroupID")
    protected List<IdentifierType> parentGroupID;
    @XmlElement(name = "PackageTypeCode")
    protected List<CodeType> packageTypeCode;
    @XmlElement(name = "PartyReportingIDs")
    protected List<IDSetType> partyReportingIDs;
    @XmlElement(name = "ServiceAvailabilityCode")
    protected ServiceAvailabilityCodeType serviceAvailabilityCode;
    @XmlElement(name = "PackageCost")
    protected ScreeningCostType packageCost;

    /**
     * This is the "Package ID" that would be used to order a set of screening or assessment services.Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getID() {
        if (id == null) {
            id = new ArrayList<IdentifierType>();
        }
        return this.id;
    }

    /**
     * The name or terse descriptive label by which the package is referred.
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
     * A reference from a child package to one or more associated parent entity. This is used to express an "is a part of" relationship by reference. This approach is used in a number of places within the HR-XML as an alternative to placement of one entity within the other's hierarchy. The use of the ParentGroupID reference is a more flexible and light-weight alternative to recursive structures and deeply nested hierarchies.Gets the value of the parentGroupID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentGroupID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentGroupID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getParentGroupID() {
        if (parentGroupID == null) {
            parentGroupID = new ArrayList<IdentifierType>();
        }
        return this.parentGroupID;
    }

    /**
     * Gets the value of the packageTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getPackageTypeCode() {
        if (packageTypeCode == null) {
            packageTypeCode = new ArrayList<CodeType>();
        }
        return this.packageTypeCode;
    }

    /**
     * This is a repeating ID set used to pass along identifiers that are used for reporting, filtering, accounting, cost center identification, and similar purposes. In a typical scenario, these might be specified by a customer to a supplier and then reported back by the supplier within collaborations as specified by the Customer.   The agencyRoleCode and schemeAgencyID attributes available on PartyReportingIDs can be used to specify the role (Customer, Requester, Supplier) and identity of the party that controls the ID set. This is intended as a flexible means to associate various reporting IDs with a package. For example, a customer and supplier might agree to use the PartyReportIDGroup as a way to index Packages by the customer's employee or organizational groups with which they are associated or to which they pertain.
     * Example: 
     *                 agencyRoleCode = Customer
     *                 schemeAgencyID = Acme Corp. Inc.
     *                 schemeID = Acme Employee Group ID
     *                                     ID = HR Manager and Compliance
     *                                     ID = Hiring Manager			
     * 			                        ID = Recruiter
     * 			                        ID = Learning-Knowledge Management
     * 			Gets the value of the partyReportingIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyReportingIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyReportingIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDSetType }
     * 
     * 
     */
    public List<IDSetType> getPartyReportingIDs() {
        if (partyReportingIDs == null) {
            partyReportingIDs = new ArrayList<IDSetType>();
        }
        return this.partyReportingIDs;
    }

    /**
     * Gets the value of the serviceAvailabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAvailabilityCodeType }
     *     
     */
    public ServiceAvailabilityCodeType getServiceAvailabilityCode() {
        return serviceAvailabilityCode;
    }

    /**
     * Sets the value of the serviceAvailabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAvailabilityCodeType }
     *     
     */
    public void setServiceAvailabilityCode(ServiceAvailabilityCodeType value) {
        this.serviceAvailabilityCode = value;
    }

    /**
     * Gets the value of the packageCost property.
     * 
     * @return
     *     possible object is
     *     {@link ScreeningCostType }
     *     
     */
    public ScreeningCostType getPackageCost() {
        return packageCost;
    }

    /**
     * Sets the value of the packageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreeningCostType }
     *     
     */
    public void setPackageCost(ScreeningCostType value) {
        this.packageCost = value;
    }

}
