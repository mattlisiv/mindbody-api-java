
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XMLDetailLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XMLDetailLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bare"/>
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XMLDetailLevel")
@XmlEnum
public enum XMLDetailLevel {

    @XmlEnumValue("Bare")
    BARE("Bare"),
    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Full")
    FULL("Full");
    private final String value;

    XMLDetailLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XMLDetailLevel fromValue(String v) {
        for (XMLDetailLevel c: XMLDetailLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
