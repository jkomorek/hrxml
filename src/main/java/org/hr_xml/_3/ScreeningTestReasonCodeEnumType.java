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
 * <p>Java class for ScreeningTestReasonCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScreeningTestReasonCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="PreEmployment"/>
 *     &lt;enumeration value="Random"/>
 *     &lt;enumeration value="ReasonableSuspicionOrCause"/>
 *     &lt;enumeration value="BlindSample"/>
 *     &lt;enumeration value="FollowUp"/>
 *     &lt;enumeration value="Periodic"/>
 *     &lt;enumeration value="PostAccident"/>
 *     &lt;enumeration value="PostRehabilitation"/>
 *     &lt;enumeration value="SiteAccess"/>
 *     &lt;enumeration value="PrePlacement"/>
 *     &lt;enumeration value="Promotion"/>
 *     &lt;enumeration value="ReturnToDuty"/>
 *     &lt;enumeration value="RuleViolation"/>
 *     &lt;enumeration value="SportsTesting"/>
 *     &lt;enumeration value="NotSpecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScreeningTestReasonCodeEnumType")
@XmlEnum
public enum ScreeningTestReasonCodeEnumType {

    @XmlEnumValue("PreEmployment")
    PRE_EMPLOYMENT("PreEmployment"),
    @XmlEnumValue("Random")
    RANDOM("Random"),
    @XmlEnumValue("ReasonableSuspicionOrCause")
    REASONABLE_SUSPICION_OR_CAUSE("ReasonableSuspicionOrCause"),
    @XmlEnumValue("BlindSample")
    BLIND_SAMPLE("BlindSample"),
    @XmlEnumValue("FollowUp")
    FOLLOW_UP("FollowUp"),
    @XmlEnumValue("Periodic")
    PERIODIC("Periodic"),
    @XmlEnumValue("PostAccident")
    POST_ACCIDENT("PostAccident"),
    @XmlEnumValue("PostRehabilitation")
    POST_REHABILITATION("PostRehabilitation"),
    @XmlEnumValue("SiteAccess")
    SITE_ACCESS("SiteAccess"),
    @XmlEnumValue("PrePlacement")
    PRE_PLACEMENT("PrePlacement"),
    @XmlEnumValue("Promotion")
    PROMOTION("Promotion"),
    @XmlEnumValue("ReturnToDuty")
    RETURN_TO_DUTY("ReturnToDuty"),
    @XmlEnumValue("RuleViolation")
    RULE_VIOLATION("RuleViolation"),
    @XmlEnumValue("SportsTesting")
    SPORTS_TESTING("SportsTesting"),
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified");
    private final String value;

    ScreeningTestReasonCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScreeningTestReasonCodeEnumType fromValue(String v) {
        for (ScreeningTestReasonCodeEnumType c: ScreeningTestReasonCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}