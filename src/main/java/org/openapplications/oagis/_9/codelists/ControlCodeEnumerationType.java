//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.openapplications.oagis._9.codelists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlCodeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ControlCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Trigger"/>
 *     &lt;enumeration value="Workflow"/>
 *     &lt;enumeration value="Measurement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ControlCodeEnumerationType", namespace = "http://www.openapplications.org/oagis/9/codelists")
@XmlEnum
public enum ControlCodeEnumerationType {

    @XmlEnumValue("Trigger")
    TRIGGER("Trigger"),
    @XmlEnumValue("Workflow")
    WORKFLOW("Workflow"),
    @XmlEnumValue("Measurement")
    MEASUREMENT("Measurement");
    private final String value;

    ControlCodeEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ControlCodeEnumerationType fromValue(String v) {
        for (ControlCodeEnumerationType c: ControlCodeEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}