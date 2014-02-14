//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 10:26:45 PM EST 
//


package org.openapplications.oagis._9.codelists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinalAgentInstructionCodeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinalAgentInstructionCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="CHQB"/>
 *     &lt;enumeration value="HOLD"/>
 *     &lt;enumeration value="PHOB"/>
 *     &lt;enumeration value="TELB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FinalAgentInstructionCodeEnumerationType", namespace = "http://www.openapplications.org/oagis/9/codelists")
@XmlEnum
public enum FinalAgentInstructionCodeEnumerationType {


    /**
     * Pay creditor only by cheque. The creditor's account number must not be specified.
     * 
     */
    CHQB,

    /**
     * Hold cash for creditor. Creditor will call; pay upon identification.
     * 
     */
    HOLD,

    /**
     * Please advise/contact beneficiary/claimant by phone.
     * 
     */
    PHOB,

    /**
     * Please advise/contact beneficiary/claimant by the most efficient means of telecommunication.
     * 
     */
    TELB;

    public String value() {
        return name();
    }

    public static FinalAgentInstructionCodeEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}