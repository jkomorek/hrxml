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
 * <p>Java class for AffiliatedOrganizationTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AffiliatedOrganizationTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Professional"/>
 *     &lt;enumeration value="Social"/>
 *     &lt;enumeration value="Community"/>
 *     &lt;enumeration value="Non-Profit"/>
 *     &lt;enumeration value="Religious"/>
 *     &lt;enumeration value="Political"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AffiliatedOrganizationTypeCodeEnumType")
@XmlEnum
public enum AffiliatedOrganizationTypeCodeEnumType {

    @XmlEnumValue("Professional")
    PROFESSIONAL("Professional"),
    @XmlEnumValue("Social")
    SOCIAL("Social"),
    @XmlEnumValue("Community")
    COMMUNITY("Community"),
    @XmlEnumValue("Non-Profit")
    NON_PROFIT("Non-Profit"),
    @XmlEnumValue("Religious")
    RELIGIOUS("Religious"),
    @XmlEnumValue("Political")
    POLITICAL("Political");
    private final String value;

    AffiliatedOrganizationTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AffiliatedOrganizationTypeCodeEnumType fromValue(String v) {
        for (AffiliatedOrganizationTypeCodeEnumType c: AffiliatedOrganizationTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}