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
 * <p>Java class for PaymentPurposeCodeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentPurposeCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="ADVA"/>
 *     &lt;enumeration value="AGRT"/>
 *     &lt;enumeration value="ALMY"/>
 *     &lt;enumeration value="BECH"/>
 *     &lt;enumeration value="BENE"/>
 *     &lt;enumeration value="BONU"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="CBFF"/>
 *     &lt;enumeration value="CHAR"/>
 *     &lt;enumeration value="CMDT"/>
 *     &lt;enumeration value="COLL"/>
 *     &lt;enumeration value="COMC"/>
 *     &lt;enumeration value="COMM"/>
 *     &lt;enumeration value="CONS"/>
 *     &lt;enumeration value="COST"/>
 *     &lt;enumeration value="CPYR"/>
 *     &lt;enumeration value="DBTC"/>
 *     &lt;enumeration value="DIVI"/>
 *     &lt;enumeration value="FREX"/>
 *     &lt;enumeration value="GDDS"/>
 *     &lt;enumeration value="GOVT"/>
 *     &lt;enumeration value="HEDG"/>
 *     &lt;enumeration value="IHRP"/>
 *     &lt;enumeration value="INSU"/>
 *     &lt;enumeration value="INTC"/>
 *     &lt;enumeration value="INTE"/>
 *     &lt;enumeration value="LICF"/>
 *     &lt;enumeration value="LOAN"/>
 *     &lt;enumeration value="LOAR"/>
 *     &lt;enumeration value="NETT"/>
 *     &lt;enumeration value="PAYR"/>
 *     &lt;enumeration value="PENS"/>
 *     &lt;enumeration value="REFU"/>
 *     &lt;enumeration value="RENT"/>
 *     &lt;enumeration value="ROYA"/>
 *     &lt;enumeration value="SALA"/>
 *     &lt;enumeration value="SCVE"/>
 *     &lt;enumeration value="SECU"/>
 *     &lt;enumeration value="SSBE"/>
 *     &lt;enumeration value="SUBS"/>
 *     &lt;enumeration value="TAXS"/>
 *     &lt;enumeration value="TREA"/>
 *     &lt;enumeration value="VATX"/>
 *     &lt;enumeration value="VENP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentPurposeCodeEnumerationType", namespace = "http://www.openapplications.org/oagis/9/codelists")
@XmlEnum
public enum PaymentPurposeCodeEnumerationType {

    ADVA,
    AGRT,
    ALMY,
    BECH,
    BENE,
    BONU,
    CASH,
    CBFF,
    CHAR,
    CMDT,
    COLL,
    COMC,
    COMM,
    CONS,
    COST,
    CPYR,
    DBTC,
    DIVI,
    FREX,
    GDDS,
    GOVT,
    HEDG,
    IHRP,
    INSU,
    INTC,
    INTE,
    LICF,
    LOAN,
    LOAR,
    NETT,
    PAYR,
    PENS,
    REFU,
    RENT,
    ROYA,
    SALA,
    SCVE,
    SECU,
    SSBE,
    SUBS,
    TAXS,
    TREA,
    VATX,
    VENP;

    public String value() {
        return name();
    }

    public static PaymentPurposeCodeEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
