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
 * <p>Java class for SalesActivityCodeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalesActivityCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="LiteratureRequest"/>
 *     &lt;enumeration value="NewLead"/>
 *     &lt;enumeration value="DeadContent"/>
 *     &lt;enumeration value="TrafficReport"/>
 *     &lt;enumeration value="Sold"/>
 *     &lt;enumeration value="EMail"/>
 *     &lt;enumeration value="Letter"/>
 *     &lt;enumeration value="Fax"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalesActivityCodeEnumerationType", namespace = "http://www.openapplications.org/oagis/9/codelists")
@XmlEnum
public enum SalesActivityCodeEnumerationType {

    @XmlEnumValue("LiteratureRequest")
    LITERATURE_REQUEST("LiteratureRequest"),
    @XmlEnumValue("NewLead")
    NEW_LEAD("NewLead"),
    @XmlEnumValue("DeadContent")
    DEAD_CONTENT("DeadContent"),
    @XmlEnumValue("TrafficReport")
    TRAFFIC_REPORT("TrafficReport"),
    @XmlEnumValue("Sold")
    SOLD("Sold"),
    @XmlEnumValue("EMail")
    E_MAIL("EMail"),
    @XmlEnumValue("Letter")
    LETTER("Letter"),
    @XmlEnumValue("Fax")
    FAX("Fax");
    private final String value;

    SalesActivityCodeEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesActivityCodeEnumerationType fromValue(String v) {
        for (SalesActivityCodeEnumerationType c: SalesActivityCodeEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
