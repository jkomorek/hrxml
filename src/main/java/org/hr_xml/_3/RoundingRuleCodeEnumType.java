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
 * <p>Java class for RoundingRuleCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoundingRuleCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="RoundDown"/>
 *     &lt;enumeration value="RoundHalfDown"/>
 *     &lt;enumeration value="RoundUp"/>
 *     &lt;enumeration value="RoundHalfUp"/>
 *     &lt;enumeration value="RoundHalfEven"/>
 *     &lt;enumeration value="RoundCeiling"/>
 *     &lt;enumeration value="RoundFloor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoundingRuleCodeEnumType")
@XmlEnum
public enum RoundingRuleCodeEnumType {


    /**
     * round-down: The discarded digits are ignored; the result is unchanged (round toward 0, truncate): 
     *  1.123 --> 1.12 
     *  1.128 --> 1.12 
     *  1.125 --> 1.12 
     *  1.135 --> 1.13 
     * 
     * 
     */
    @XmlEnumValue("RoundDown")
    ROUND_DOWN("RoundDown"),

    /**
     * 
     * round-half-down: If the discarded digits represent greater than half (0.5) then the result is incremented by 1; otherwise the discarded digits are ignored: 
     *  1.123 --> 1.12 
     *  1.128 --> 1.13 
     *  1.125 --> 1.12 
     *  1.135 --> 1.13 
     * 
     * 
     */
    @XmlEnumValue("RoundHalfDown")
    ROUND_HALF_DOWN("RoundHalfDown"),

    /**
     * round-up: Round away from 0: If all of the discarded digits are zero the result is unchanged, otherwise the result is incremented by 1 
     *  1.123 --> 1.13 
     *  1.128 --> 1.13 
     *  1.125 --> 1.13 
     *  1.135 --> 1.14
     * 
     * 
     */
    @XmlEnumValue("RoundUp")
    ROUND_UP("RoundUp"),

    /**
     * round-half-up: If the discarded digits represent greater than or equal to half (0.5) then the result should be incremented by 1; otherwise the discarded digits are ignored: 
     *  1.123 --> 1.12 
     *  1.128 --> 1.13 
     *  1.125 --> 1.13 
     *  1.135 --> 1.14 
     * 
     */
    @XmlEnumValue("RoundHalfUp")
    ROUND_HALF_UP("RoundHalfUp"),

    /**
     * round-half-even: If the discarded digits represent greater than half (0.5) then the result coefficient is incremented by 1; if they represent less than half, then the result is not adjusted; otherwise the result is unaltered if its rightmost digit is even, or incremented by 1 if its rightmost digit is odd (to make an even digit): 
     *  1.123 --> 1.12 
     *  1.128 --> 1.13 
     *  1.125 --> 1.12 
     *  1.135 --> 1.14 
     * 
     * 
     */
    @XmlEnumValue("RoundHalfEven")
    ROUND_HALF_EVEN("RoundHalfEven"),

    /**
     * 
     * round-ceiling: Round toward positive infinity: If all of the discarded digits are zero or if the sign is negative the result is unchanged; otherwise, the result is incremented by 1 
     *  1.123 --> 1.13 
     *  1.128 --> 1.13 
     * -1.123 --> -1.12 
     * -1.128 --> -1.12 
     * 
     * 
     */
    @XmlEnumValue("RoundCeiling")
    ROUND_CEILING("RoundCeiling"),

    /**
     * 
     * round-floor: Round toward negative infinty: If all of the discarded digits are zero or if the sign is positive the result is unchanged; otherwise, the absolute value of the result is incremented by 1 
     *  1.123 --> 1.12 
     *  1.128 --> 1.12 
     * -1.123 --> -1.13 
     * -1.128 --> -1.13 					
     * 					5.0, 5.1, 5.2, 5.3, 5.4, 5.5, 5.6, 5.7, 5.8, and 5.9 will all be rounded to 5
     * 
     */
    @XmlEnumValue("RoundFloor")
    ROUND_FLOOR("RoundFloor");
    private final String value;

    RoundingRuleCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoundingRuleCodeEnumType fromValue(String v) {
        for (RoundingRuleCodeEnumType c: RoundingRuleCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
