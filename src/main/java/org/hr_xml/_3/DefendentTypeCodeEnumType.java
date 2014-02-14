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
 * <p>Java class for DefendentTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DefendentTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Primary"/>
 *     &lt;enumeration value="Additional"/>
 *     &lt;enumeration value="Garnishee"/>
 *     &lt;enumeration value="CrossParty"/>
 *     &lt;enumeration value="CounterParty"/>
 *     &lt;enumeration value="ThirdParty"/>
 *     &lt;enumeration value="Intervention"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DefendentTypeCodeEnumType")
@XmlEnum
public enum DefendentTypeCodeEnumType {

    @XmlEnumValue("Primary")
    PRIMARY("Primary"),
    @XmlEnumValue("Additional")
    ADDITIONAL("Additional"),
    @XmlEnumValue("Garnishee")
    GARNISHEE("Garnishee"),
    @XmlEnumValue("CrossParty")
    CROSS_PARTY("CrossParty"),
    @XmlEnumValue("CounterParty")
    COUNTER_PARTY("CounterParty"),
    @XmlEnumValue("ThirdParty")
    THIRD_PARTY("ThirdParty"),
    @XmlEnumValue("Intervention")
    INTERVENTION("Intervention");
    private final String value;

    DefendentTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefendentTypeCodeEnumType fromValue(String v) {
        for (DefendentTypeCodeEnumType c: DefendentTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
