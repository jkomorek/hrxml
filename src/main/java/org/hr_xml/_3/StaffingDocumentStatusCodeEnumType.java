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
 * <p>Java class for StaffingDocumentStatusCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StaffingDocumentStatusCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Modified"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Reopened"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Extended"/>
 *     &lt;enumeration value="Replaced"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StaffingDocumentStatusCodeEnumType")
@XmlEnum
public enum StaffingDocumentStatusCodeEnumType {

    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Modified")
    MODIFIED("Modified"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Reopened")
    REOPENED("Reopened"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended"),
    @XmlEnumValue("Replaced")
    REPLACED("Replaced");
    private final String value;

    StaffingDocumentStatusCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StaffingDocumentStatusCodeEnumType fromValue(String v) {
        for (StaffingDocumentStatusCodeEnumType c: StaffingDocumentStatusCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
