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
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Login. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DefinitionText xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contains information to enable a user to gain access to 
 * 				a system. This is typically a user name and password, but may include
 * 				other access credentials.&lt;/ccts:DefinitionText&gt;
 * </pre>
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:1.1" xmlns="http://www.hr-xml.org/3" xmlns:oa="http://www.openapplications.org/oagis/9" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Authentication information for the sender 
 * 				of an HR-XML BOD would generally would be handled a higher level -- such as the
 * 				security header of a SOAP envelope. The purpose of this type is where
 * 				such login information needs to be communicated between trading 
 * 				partners. Examples include system provisioning scenarios as well
 * 				as assessment scenarios where an order acknowledgement would return a credential for
 * 				the assessment subject to use in gaining access to a test.&lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * 			
 * 
 * <p>Java class for LoginInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hr-xml.org/3}UserID" minOccurs="0"/>
 *         &lt;element ref="{http://www.hr-xml.org/3}AccessCredential" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginInformationType", propOrder = {
    "userID",
    "accessCredential"
})
public class LoginInformationType {

    @XmlElement(name = "UserID")
    protected IdentifierType userID;
    @XmlElement(name = "AccessCredential")
    protected List<AccessCredentialType> accessCredential;

    /**
     * A user name or ID.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setUserID(IdentifierType value) {
        this.userID = value;
    }

    /**
     * 
     * 			Contains a password or other token associated with the authentication of
     * 			a user. This component is repeatable to allow for multiple credentials or tokens. 
     * 			Gets the value of the accessCredential property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessCredential property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessCredential().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessCredentialType }
     * 
     * 
     */
    public List<AccessCredentialType> getAccessCredential() {
        if (accessCredential == null) {
            accessCredential = new ArrayList<AccessCredentialType>();
        }
        return this.accessCredential;
    }

}
