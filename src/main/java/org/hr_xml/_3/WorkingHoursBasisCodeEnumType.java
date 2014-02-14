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
 * <p>Java class for WorkingHoursBasisCodeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkingHoursBasisCodeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="TwoWeeks"/>
 *     &lt;enumeration value="FourWeeks"/>
 *     &lt;enumeration value="HalfMonth"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="TwoMonths"/>
 *     &lt;enumeration value="Quarter"/>
 *     &lt;enumeration value="SeasonalTerm"/>
 *     &lt;enumeration value="HalfYear"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="Shift"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkingHoursBasisCodeEnumType")
@XmlEnum
public enum WorkingHoursBasisCodeEnumType {


    /**
     * Note that this code list is used in more than one context, one of which is
     * 			ScheduledDays. "Day" generally would not be a valid scheduleBasis in the context of ScheduledDays.
     * 
     */
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("TwoWeeks")
    TWO_WEEKS("TwoWeeks"),
    @XmlEnumValue("FourWeeks")
    FOUR_WEEKS("FourWeeks"),
    @XmlEnumValue("HalfMonth")
    HALF_MONTH("HalfMonth"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("TwoMonths")
    TWO_MONTHS("TwoMonths"),
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),
    @XmlEnumValue("SeasonalTerm")
    SEASONAL_TERM("SeasonalTerm"),
    @XmlEnumValue("HalfYear")
    HALF_YEAR("HalfYear"),
    @XmlEnumValue("Year")
    YEAR("Year"),

    /**
     * Note that this code list is used in more than one context, one of which is
     * 			ScheduledDays. "Shfit" generally would not be a valid scheduleBasis in the context of ScheduledDays.
     * 
     */
    @XmlEnumValue("Shift")
    SHIFT("Shift");
    private final String value;

    WorkingHoursBasisCodeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkingHoursBasisCodeEnumType fromValue(String v) {
        for (WorkingHoursBasisCodeEnumType c: WorkingHoursBasisCodeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
