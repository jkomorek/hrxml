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
 * <p>Java class for RaterGroupCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RaterGroupCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Customer"/>
 *     &lt;enumeration value="Peer"/>
 *     &lt;enumeration value="Supervisor"/>
 *     &lt;enumeration value="DirectReport"/>
 *     &lt;enumeration value="Self"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RaterGroupCodeEnumType")
@XmlEnum
public enum RaterGroupCodeEnumType {

    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("Peer")
    PEER("Peer"),
    @XmlEnumValue("Supervisor")
    SUPERVISOR("Supervisor"),
    @XmlEnumValue("DirectReport")
    DIRECT_REPORT("DirectReport"),
    @XmlEnumValue("Self")
    SELF("Self");
    private final String value;

    RaterGroupCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RaterGroupCodeEnumType fromValue(String v) {
        for (RaterGroupCodeEnumType c: RaterGroupCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
