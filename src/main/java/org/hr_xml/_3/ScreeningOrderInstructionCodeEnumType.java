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
 * <p>Java class for ScreeningOrderInstructionCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScreeningOrderInstructionCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="ReleaseRequired"/>
 *     &lt;enumeration value="SubjectInformationRequired"/>
 *     &lt;enumeration value="OrderIncomplete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScreeningOrderInstructionCodeEnumType")
@XmlEnum
public enum ScreeningOrderInstructionCodeEnumType {


    /**
     * Indicates that a signed consent or other release statement or official application
     * 					is necessary before the particular screening may proceed.
     * 					
     * 
     */
    @XmlEnumValue("ReleaseRequired")
    RELEASE_REQUIRED("ReleaseRequired"),

    /**
     * Indicates that additional information is required from the 
     * 					search subject before the particular screening may proceed.
     * 					
     * 
     */
    @XmlEnumValue("SubjectInformationRequired")
    SUBJECT_INFORMATION_REQUIRED("SubjectInformationRequired"),

    /**
     * Indicates that the order did not provide sufficient information for an 
     * 					order to proceed. Additional information is required from the customer, search subject,
     * 					or requester before the order may proceed.
     * 
     */
    @XmlEnumValue("OrderIncomplete")
    ORDER_INCOMPLETE("OrderIncomplete");
    private final String value;

    ScreeningOrderInstructionCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScreeningOrderInstructionCodeEnumType fromValue(String v) {
        for (ScreeningOrderInstructionCodeEnumType c: ScreeningOrderInstructionCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
