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
 * <p>Java class for EarningsSearchTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EarningsSearchTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="EarningsDetail"/>
 *     &lt;enumeration value="EarningsSummary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EarningsSearchTypeCodeEnumType")
@XmlEnum
public enum EarningsSearchTypeCodeEnumType {

    @XmlEnumValue("EarningsDetail")
    EARNINGS_DETAIL("EarningsDetail"),
    @XmlEnumValue("EarningsSummary")
    EARNINGS_SUMMARY("EarningsSummary");
    private final String value;

    EarningsSearchTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EarningsSearchTypeCodeEnumType fromValue(String v) {
        for (EarningsSearchTypeCodeEnumType c: EarningsSearchTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
