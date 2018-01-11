
package com.mindbodyonline.clients.api._0_5_1.staff_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaffFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StaffFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StaffViewable"/>
 *     &lt;enumeration value="AppointmentInstructor"/>
 *     &lt;enumeration value="ClassInstructor"/>
 *     &lt;enumeration value="Male"/>
 *     &lt;enumeration value="Female"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StaffFilter")
@XmlEnum
public enum StaffFilter {

    @XmlEnumValue("StaffViewable")
    STAFF_VIEWABLE("StaffViewable"),
    @XmlEnumValue("AppointmentInstructor")
    APPOINTMENT_INSTRUCTOR("AppointmentInstructor"),
    @XmlEnumValue("ClassInstructor")
    CLASS_INSTRUCTOR("ClassInstructor"),
    @XmlEnumValue("Male")
    MALE("Male"),
    @XmlEnumValue("Female")
    FEMALE("Female");
    private final String value;

    StaffFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StaffFilter fromValue(String v) {
        for (StaffFilter c: StaffFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
