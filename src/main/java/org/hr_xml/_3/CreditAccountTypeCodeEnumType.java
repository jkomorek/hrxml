//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.hr_xml._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditAccountTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditAccountTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="CreditLine"/>
 *     &lt;enumeration value="Installment"/>
 *     &lt;enumeration value="Mortgage"/>
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Revolving"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditAccountTypeCodeEnumType")
@XmlEnum
public enum CreditAccountTypeCodeEnumType {

    @XmlEnumValue("CreditLine")
    CREDIT_LINE("CreditLine"),
    @XmlEnumValue("Installment")
    INSTALLMENT("Installment"),
    @XmlEnumValue("Mortgage")
    MORTGAGE("Mortgage"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Revolving")
    REVOLVING("Revolving"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CreditAccountTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditAccountTypeCodeEnumType fromValue(String v) {
        for (CreditAccountTypeCodeEnumType c: CreditAccountTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}