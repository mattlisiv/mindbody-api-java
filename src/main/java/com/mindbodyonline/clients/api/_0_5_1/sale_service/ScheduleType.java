
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScheduleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="DropIn"/>
 *     &lt;enumeration value="Enrollment"/>
 *     &lt;enumeration value="Appointment"/>
 *     &lt;enumeration value="Resource"/>
 *     &lt;enumeration value="Media"/>
 *     &lt;enumeration value="Arrival"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScheduleType")
@XmlEnum
public enum ScheduleType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("DropIn")
    DROP_IN("DropIn"),
    @XmlEnumValue("Enrollment")
    ENROLLMENT("Enrollment"),
    @XmlEnumValue("Appointment")
    APPOINTMENT("Appointment"),
    @XmlEnumValue("Resource")
    RESOURCE("Resource"),
    @XmlEnumValue("Media")
    MEDIA("Media"),
    @XmlEnumValue("Arrival")
    ARRIVAL("Arrival");
    private final String value;

    ScheduleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScheduleType fromValue(String v) {
        for (ScheduleType c: ScheduleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
