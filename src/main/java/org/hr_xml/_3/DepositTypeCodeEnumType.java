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
 * <p>Java class for DepositTypeCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepositTypeCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Deposit"/>
 *     &lt;enumeration value="SellOnDeposit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepositTypeCodeEnumType")
@XmlEnum
public enum DepositTypeCodeEnumType {

    @XmlEnumValue("Deposit")
    DEPOSIT("Deposit"),
    @XmlEnumValue("SellOnDeposit")
    SELL_ON_DEPOSIT("SellOnDeposit");
    private final String value;

    DepositTypeCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepositTypeCodeEnumType fromValue(String v) {
        for (DepositTypeCodeEnumType c: DepositTypeCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
