
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetBookableItemsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBookableItemsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="SessionTypeIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="LocationIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="StaffIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AppointmentID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IgnoreDefaultSessionLength" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBookableItemsRequest", propOrder = {
    "sessionTypeIDs",
    "locationIDs",
    "staffIDs",
    "startDate",
    "endDate",
    "appointmentID",
    "ignoreDefaultSessionLength"
})
public class GetBookableItemsRequest
    extends MBRequest
{

    @XmlElement(name = "SessionTypeIDs")
    protected ArrayOfInt sessionTypeIDs;
    @XmlElement(name = "LocationIDs")
    protected ArrayOfInt locationIDs;
    @XmlElement(name = "StaffIDs")
    protected ArrayOfLong staffIDs;
    @XmlElement(name = "StartDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "AppointmentID", required = true, type = Long.class, nillable = true)
    protected Long appointmentID;
    @XmlElement(name = "IgnoreDefaultSessionLength", required = true, type = Boolean.class, nillable = true)
    protected Boolean ignoreDefaultSessionLength;

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
     * Gets the value of the locationIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getLocationIDs() {
        return locationIDs;
    }

    /**
     * Sets the value of the locationIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setLocationIDs(ArrayOfInt value) {
        this.locationIDs = value;
    }

    /**
     * Gets the value of the staffIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getStaffIDs() {
        return staffIDs;
    }

    /**
     * Sets the value of the staffIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setStaffIDs(ArrayOfLong value) {
        this.staffIDs = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the appointmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAppointmentID() {
        return appointmentID;
    }

    /**
     * Sets the value of the appointmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAppointmentID(Long value) {
        this.appointmentID = value;
    }

    /**
     * Gets the value of the ignoreDefaultSessionLength property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreDefaultSessionLength() {
        return ignoreDefaultSessionLength;
    }

    /**
     * Sets the value of the ignoreDefaultSessionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreDefaultSessionLength(Boolean value) {
        this.ignoreDefaultSessionLength = value;
    }

}
