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
 * <p>Java class for ChannelCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Telephone"/>
 *     &lt;enumeration value="MobileTelephone"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="InstantMessage"/>
 *     &lt;enumeration value="Web"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChannelCodeEnumType")
@XmlEnum
public enum ChannelCodeEnumType {

    @XmlEnumValue("Telephone")
    TELEPHONE("Telephone"),
    @XmlEnumValue("MobileTelephone")
    MOBILE_TELEPHONE("MobileTelephone"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("InstantMessage")
    INSTANT_MESSAGE("InstantMessage"),
    @XmlEnumValue("Web")
    WEB("Web");
    private final String value;

    ChannelCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelCodeEnumType fromValue(String v) {
        for (ChannelCodeEnumType c: ChannelCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
