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
 * <p>Java class for PaymentSchemeCodeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentSchemeCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="ACH"/>
 *     &lt;enumeration value="RTGS"/>
 *     &lt;enumeration value="Fednet"/>
 *     &lt;enumeration value="CHIPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentSchemeCodeEnumerationType", namespace = "http://www.openapplications.org/oagis/9/codelists")
@XmlEnum
public enum PaymentSchemeCodeEnumerationType {


    /**
     * Payment has to be executed through an Automated Clearing House
     * 
     */
    ACH("ACH"),

    /**
     * Payment has to be executed through Real time gross settlement system.
     * 
     */
    RTGS("RTGS"),

    /**
     * Payment has to be executed through FedNet
     * 
     */
    @XmlEnumValue("Fednet")
    FEDNET("Fednet"),

    /**
     * Payment has to be executed through CHIPS. 
     * 
     */
    CHIPS("CHIPS");
    private final String value;

    PaymentSchemeCodeEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentSchemeCodeEnumerationType fromValue(String v) {
        for (PaymentSchemeCodeEnumerationType c: PaymentSchemeCodeEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
