
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Added"/>
 *     &lt;enumeration value="Updated"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Removed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionCode")
@XmlEnum
public enum ActionCode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Added")
    ADDED("Added"),
    @XmlEnumValue("Updated")
    UPDATED("Updated"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Removed")
    REMOVED("Removed");
    private final String value;

    ActionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionCode fromValue(String v) {
        for (ActionCode c: ActionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
