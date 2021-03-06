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
 * <p>Java class for HealthcareProviderChangeReasonEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HealthcareProviderChangeReasonEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="AppointmentTimesNotMetInATimelyManner"/>
 *     &lt;enumeration value="CurrentCustomerInformationFileInError"/>
 *     &lt;enumeration value="DissatisfactionWithMedicalCareOrServicesRendered"/>
 *     &lt;enumeration value="DissatisfactionWithOfficeStaff"/>
 *     &lt;enumeration value="DissatisfactionWithPhysicianReferralPolicy"/>
 *     &lt;enumeration value="DissatisfiedWithOfficeHours"/>
 *     &lt;enumeration value="InconvenientOfficeLocation"/>
 *     &lt;enumeration value="LessRespectOrAttentionOrTimeGivenThanToOtherPatients"/>
 *     &lt;enumeration value="NoReasonGiven"/>
 *     &lt;enumeration value="PatientMovedToANewLocation"/>
 *     &lt;enumeration value="PlanChange"/>
 *     &lt;enumeration value="UnableToScheduledAppointmentsInATimelyManner"/>
 *     &lt;enumeration value="VoluntaryWithdrawal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HealthcareProviderChangeReasonEnumType")
@XmlEnum
public enum HealthcareProviderChangeReasonEnumType {

    @XmlEnumValue("AppointmentTimesNotMetInATimelyManner")
    APPOINTMENT_TIMES_NOT_MET_IN_A_TIMELY_MANNER("AppointmentTimesNotMetInATimelyManner"),
    @XmlEnumValue("CurrentCustomerInformationFileInError")
    CURRENT_CUSTOMER_INFORMATION_FILE_IN_ERROR("CurrentCustomerInformationFileInError"),
    @XmlEnumValue("DissatisfactionWithMedicalCareOrServicesRendered")
    DISSATISFACTION_WITH_MEDICAL_CARE_OR_SERVICES_RENDERED("DissatisfactionWithMedicalCareOrServicesRendered"),
    @XmlEnumValue("DissatisfactionWithOfficeStaff")
    DISSATISFACTION_WITH_OFFICE_STAFF("DissatisfactionWithOfficeStaff"),
    @XmlEnumValue("DissatisfactionWithPhysicianReferralPolicy")
    DISSATISFACTION_WITH_PHYSICIAN_REFERRAL_POLICY("DissatisfactionWithPhysicianReferralPolicy"),
    @XmlEnumValue("DissatisfiedWithOfficeHours")
    DISSATISFIED_WITH_OFFICE_HOURS("DissatisfiedWithOfficeHours"),
    @XmlEnumValue("InconvenientOfficeLocation")
    INCONVENIENT_OFFICE_LOCATION("InconvenientOfficeLocation"),
    @XmlEnumValue("LessRespectOrAttentionOrTimeGivenThanToOtherPatients")
    LESS_RESPECT_OR_ATTENTION_OR_TIME_GIVEN_THAN_TO_OTHER_PATIENTS("LessRespectOrAttentionOrTimeGivenThanToOtherPatients"),
    @XmlEnumValue("NoReasonGiven")
    NO_REASON_GIVEN("NoReasonGiven"),
    @XmlEnumValue("PatientMovedToANewLocation")
    PATIENT_MOVED_TO_A_NEW_LOCATION("PatientMovedToANewLocation"),
    @XmlEnumValue("PlanChange")
    PLAN_CHANGE("PlanChange"),
    @XmlEnumValue("UnableToScheduledAppointmentsInATimelyManner")
    UNABLE_TO_SCHEDULED_APPOINTMENTS_IN_A_TIMELY_MANNER("UnableToScheduledAppointmentsInATimelyManner"),
    @XmlEnumValue("VoluntaryWithdrawal")
    VOLUNTARY_WITHDRAWAL("VoluntaryWithdrawal");
    private final String value;

    HealthcareProviderChangeReasonEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HealthcareProviderChangeReasonEnumType fromValue(String v) {
        for (HealthcareProviderChangeReasonEnumType c: HealthcareProviderChangeReasonEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
