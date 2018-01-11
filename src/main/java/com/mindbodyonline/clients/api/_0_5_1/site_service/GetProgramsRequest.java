
package com.mindbodyonline.clients.api._0_5_1.site_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProgramsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProgramsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ScheduleType" type="{http://clients.mindbodyonline.com/api/0_5_1}ScheduleType"/>
 *         &lt;element name="OnlineOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProgramsRequest", propOrder = {
    "scheduleType",
    "onlineOnly"
})
public class GetProgramsRequest
    extends MBRequest
{

    @XmlElement(name = "ScheduleType", required = true)
    @XmlSchemaType(name = "string")
    protected ScheduleType scheduleType;
    @XmlElement(name = "OnlineOnly")
    protected boolean onlineOnly;

    /**
     * Gets the value of the scheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    /**
     * Sets the value of the scheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setScheduleType(ScheduleType value) {
        this.scheduleType = value;
    }

    /**
     * Gets the value of the onlineOnly property.
     * 
     */
    public boolean isOnlineOnly() {
        return onlineOnly;
    }

    /**
     * Sets the value of the onlineOnly property.
     * 
     */
    public void setOnlineOnly(boolean value) {
        this.onlineOnly = value;
    }

}
