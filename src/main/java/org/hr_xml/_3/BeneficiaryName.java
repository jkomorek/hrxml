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
import org.openapplications.oagis._9.TextType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.openapplications.org/oagis/9>TextType">
 *       &lt;attribute name="beneficiaryType" type="{http://www.hr-xml.org/3}BeneficiaryNameCodeEnumType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BeneficiaryName")
public class BeneficiaryName
    extends TextType
{

    @XmlAttribute(name = "beneficiaryType")
    protected BeneficiaryNameCodeEnumType beneficiaryType;

    /**
     * Gets the value of the beneficiaryType property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryNameCodeEnumType }
     *     
     */
    public BeneficiaryNameCodeEnumType getBeneficiaryType() {
        return beneficiaryType;
    }

    /**
     * Sets the value of the beneficiaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryNameCodeEnumType }
     *     
     */
    public void setBeneficiaryType(BeneficiaryNameCodeEnumType value) {
        this.beneficiaryType = value;
    }

}
