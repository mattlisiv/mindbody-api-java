
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetActiveSessionTimesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetActiveSessionTimesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="Times" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetActiveSessionTimesResult", propOrder = {
    "times"
})
public class GetActiveSessionTimesResult
    extends MBResult
{

    @XmlElement(name = "Times")
    protected ArrayOfDateTime times;

    /**
     * Gets the value of the times property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDateTime }
     *     
     */
    public ArrayOfDateTime getTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDateTime }
     *     
     */
    public void setTimes(ArrayOfDateTime value) {
        this.times = value;
    }

}
