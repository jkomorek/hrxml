//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScreeningIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScreeningIdentifierType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.hr-xml.org/3>IdentifierType">
 *       &lt;attribute name="agencyRoleCode" type="{http://www.hr-xml.org/3}AgencyRoleCodeContentType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScreeningIdentifierType")
public class ScreeningIdentifierType
    extends IdentifierType
{

    @XmlAttribute(name = "agencyRoleCode")
    protected String agencyRoleCode;

    /**
     * Gets the value of the agencyRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyRoleCode() {
        return agencyRoleCode;
    }

    /**
     * Sets the value of the agencyRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyRoleCode(String value) {
        this.agencyRoleCode = value;
    }

}
