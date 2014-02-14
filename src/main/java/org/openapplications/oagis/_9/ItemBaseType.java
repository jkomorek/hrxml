//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.openapplications.oagis._9;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Is the basis for Items.
 * 
 * <p>Java class for ItemBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.openapplications.org/oagis/9}ItemIDsGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}ServiceIndicator" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/9}FreeFormTextGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Classification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Specification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}HazardousMaterial" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openapplications.org/oagis/9}Packaging" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemBaseType", propOrder = {
    "itemID",
    "customerItemID",
    "manufacturerItemID",
    "supplierItemID",
    "upcid",
    "epcid",
    "serviceIndicator",
    "description",
    "note",
    "classification",
    "specification",
    "hazardousMaterial",
    "packaging"
})
@XmlSeeAlso({
    ItemType.class,
    ItemInstanceBaseType.class
})
public abstract class ItemBaseType {

    @XmlElement(name = "ItemID")
    protected List<ItemIDType> itemID;
    @XmlElement(name = "CustomerItemID")
    protected ItemIDType customerItemID;
    @XmlElement(name = "ManufacturerItemID")
    protected ItemIDType manufacturerItemID;
    @XmlElement(name = "SupplierItemID")
    protected ItemIDType supplierItemID;
    @XmlElement(name = "UPCID")
    protected IdentifierType upcid;
    @XmlElement(name = "EPCID")
    protected IdentifierType epcid;
    @XmlElement(name = "ServiceIndicator")
    protected Boolean serviceIndicator;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classification;
    @XmlElement(name = "Specification")
    protected List<SpecificationType> specification;
    @XmlElement(name = "HazardousMaterial")
    protected List<HazardousMaterialType> hazardousMaterial;
    @XmlElement(name = "Packaging")
    protected List<PackagingType> packaging;

    /**
     * Gets the value of the itemID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIDType }
     * 
     * 
     */
    public List<ItemIDType> getItemID() {
        if (itemID == null) {
            itemID = new ArrayList<ItemIDType>();
        }
        return this.itemID;
    }

    /**
     * Gets the value of the customerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDType }
     *     
     */
    public ItemIDType getCustomerItemID() {
        return customerItemID;
    }

    /**
     * Sets the value of the customerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDType }
     *     
     */
    public void setCustomerItemID(ItemIDType value) {
        this.customerItemID = value;
    }

    /**
     * Gets the value of the manufacturerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDType }
     *     
     */
    public ItemIDType getManufacturerItemID() {
        return manufacturerItemID;
    }

    /**
     * Sets the value of the manufacturerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDType }
     *     
     */
    public void setManufacturerItemID(ItemIDType value) {
        this.manufacturerItemID = value;
    }

    /**
     * Gets the value of the supplierItemID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDType }
     *     
     */
    public ItemIDType getSupplierItemID() {
        return supplierItemID;
    }

    /**
     * Sets the value of the supplierItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDType }
     *     
     */
    public void setSupplierItemID(ItemIDType value) {
        this.supplierItemID = value;
    }

    /**
     * Gets the value of the upcid property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getUPCID() {
        return upcid;
    }

    /**
     * Sets the value of the upcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setUPCID(IdentifierType value) {
        this.upcid = value;
    }

    /**
     * Gets the value of the epcid property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getEPCID() {
        return epcid;
    }

    /**
     * Sets the value of the epcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setEPCID(IdentifierType value) {
        this.epcid = value;
    }

    /**
     * Gets the value of the serviceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceIndicator() {
        return serviceIndicator;
    }

    /**
     * Sets the value of the serviceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceIndicator(Boolean value) {
        this.serviceIndicator = value;
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
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationType>();
        }
        return this.classification;
    }

    /**
     * Gets the value of the specification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificationType }
     * 
     * 
     */
    public List<SpecificationType> getSpecification() {
        if (specification == null) {
            specification = new ArrayList<SpecificationType>();
        }
        return this.specification;
    }

    /**
     * Gets the value of the hazardousMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousMaterialType }
     * 
     * 
     */
    public List<HazardousMaterialType> getHazardousMaterial() {
        if (hazardousMaterial == null) {
            hazardousMaterial = new ArrayList<HazardousMaterialType>();
        }
        return this.hazardousMaterial;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingType }
     * 
     * 
     */
    public List<PackagingType> getPackaging() {
        if (packaging == null) {
            packaging = new ArrayList<PackagingType>();
        }
        return this.packaging;
    }

}