
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EPaymentMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EPaymentMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="DebitAccount"/>
 *     &lt;enumeration value="ACH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EPaymentMethod")
@XmlEnum
public enum EPaymentMethod {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("DebitAccount")
    DEBIT_ACCOUNT("DebitAccount"),
    ACH("ACH");
    private final String value;

    EPaymentMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPaymentMethod fromValue(String v) {
        for (EPaymentMethod c: EPaymentMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
