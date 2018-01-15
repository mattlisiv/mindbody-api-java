
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailabilityDisplay.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailabilityDisplay">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hide"/>
 *     &lt;enumeration value="Show"/>
 *     &lt;enumeration value="Mask"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AvailabilityDisplay")
@XmlEnum
public enum AvailabilityDisplay {

    @XmlEnumValue("Hide")
    HIDE("Hide"),
    @XmlEnumValue("Show")
    SHOW("Show"),
    @XmlEnumValue("Mask")
    MASK("Mask");
    private final String value;

    AvailabilityDisplay(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailabilityDisplay fromValue(String v) {
        for (AvailabilityDisplay c: AvailabilityDisplay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
