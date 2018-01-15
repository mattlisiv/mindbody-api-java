
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetActiveSessionTimesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetActiveSessionTimesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ScheduleType" type="{http://clients.mindbodyonline.com/api/0_5_1}ScheduleType"/>
 *         &lt;element name="SessionTypeIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetActiveSessionTimesRequest", propOrder = {
    "scheduleType",
    "sessionTypeIDs",
    "startTime",
    "endTime"
})
public class GetActiveSessionTimesRequest
    extends MBRequest
{

    @XmlElement(name = "ScheduleType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ScheduleType scheduleType;
    @XmlElement(name = "SessionTypeIDs")
    protected ArrayOfInt sessionTypeIDs;
    @XmlElement(name = "StartTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;

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
     * Gets the value of the sessionTypeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSessionTypeIDs() {
        return sessionTypeIDs;
    }

    /**
     * Sets the value of the sessionTypeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSessionTypeIDs(ArrayOfInt value) {
        this.sessionTypeIDs = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

}
