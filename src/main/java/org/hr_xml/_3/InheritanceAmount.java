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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.openapplications.oagis._9.AmountType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.openapplications.org/oagis/9>AmountType">
 *       &lt;attribute name="inheritanceType" use="required" type="{http://www.hr-xml.org/3}InheritanceAmountContentType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "InheritanceAmount")
public class InheritanceAmount
    extends AmountType
{

    @XmlAttribute(name = "inheritanceType", required = true)
    protected String inheritanceType;

    /**
     * Gets the value of the inheritanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritanceType() {
        return inheritanceType;
    }

    /**
     * Sets the value of the inheritanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritanceType(String value) {
        this.inheritanceType = value;
    }

}
