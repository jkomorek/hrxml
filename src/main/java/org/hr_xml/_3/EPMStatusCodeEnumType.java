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
 * <p>Java class for EPMStatusCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EPMStatusCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="NotKnown"/>
 *     &lt;enumeration value="NotApplicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EPMStatusCodeEnumType")
@XmlEnum
public enum EPMStatusCodeEnumType {

    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("NotKnown")
    NOT_KNOWN("NotKnown"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    EPMStatusCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPMStatusCodeEnumType fromValue(String v) {
        for (EPMStatusCodeEnumType c: EPMStatusCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
