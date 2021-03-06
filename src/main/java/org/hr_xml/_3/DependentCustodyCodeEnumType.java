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
 * <p>Java class for DependentCustodyCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DependentCustodyCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="BothParents"/>
 *     &lt;enumeration value="FormerSpouse"/>
 *     &lt;enumeration value="SubscriberOnly"/>
 *     &lt;enumeration value="OtherOrUnknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DependentCustodyCodeEnumType")
@XmlEnum
public enum DependentCustodyCodeEnumType {

    @XmlEnumValue("BothParents")
    BOTH_PARENTS("BothParents"),
    @XmlEnumValue("FormerSpouse")
    FORMER_SPOUSE("FormerSpouse"),
    @XmlEnumValue("SubscriberOnly")
    SUBSCRIBER_ONLY("SubscriberOnly"),
    @XmlEnumValue("OtherOrUnknown")
    OTHER_OR_UNKNOWN("OtherOrUnknown");
    private final String value;

    DependentCustodyCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DependentCustodyCodeEnumType fromValue(String v) {
        for (DependentCustodyCodeEnumType c: DependentCustodyCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
