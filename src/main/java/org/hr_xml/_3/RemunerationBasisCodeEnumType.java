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
 * <p>Java class for RemunerationBasisCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemunerationBasisCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Hourly"/>
 *     &lt;enumeration value="Salaried"/>
 *     &lt;enumeration value="SalariedPlusCommission"/>
 *     &lt;enumeration value="CommissionOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemunerationBasisCodeEnumType")
@XmlEnum
public enum RemunerationBasisCodeEnumType {

    @XmlEnumValue("Hourly")
    HOURLY("Hourly"),
    @XmlEnumValue("Salaried")
    SALARIED("Salaried"),
    @XmlEnumValue("SalariedPlusCommission")
    SALARIED_PLUS_COMMISSION("SalariedPlusCommission"),
    @XmlEnumValue("CommissionOnly")
    COMMISSION_ONLY("CommissionOnly");
    private final String value;

    RemunerationBasisCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemunerationBasisCodeEnumType fromValue(String v) {
        for (RemunerationBasisCodeEnumType c: RemunerationBasisCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
