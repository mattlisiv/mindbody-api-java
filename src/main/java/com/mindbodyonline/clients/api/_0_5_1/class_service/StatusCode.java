
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="InvalidCredentials"/>
 *     &lt;enumeration value="InvalidParameters"/>
 *     &lt;enumeration value="InternalException"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="FailedAction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusCode")
@XmlEnum
public enum StatusCode {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("InvalidCredentials")
    INVALID_CREDENTIALS("InvalidCredentials"),
    @XmlEnumValue("InvalidParameters")
    INVALID_PARAMETERS("InvalidParameters"),
    @XmlEnumValue("InternalException")
    INTERNAL_EXCEPTION("InternalException"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("FailedAction")
    FAILED_ACTION("FailedAction");
    private final String value;

    StatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusCode fromValue(String v) {
        for (StatusCode c: StatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
