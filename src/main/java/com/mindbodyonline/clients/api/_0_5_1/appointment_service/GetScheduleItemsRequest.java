
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetScheduleItemsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetScheduleItemsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="LocationIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="StaffIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IgnorePrepFinishTimes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetScheduleItemsRequest", propOrder = {
    "locationIDs",
    "staffIDs",
    "startDate",
    "endDate",
    "ignorePrepFinishTimes"
})
public class GetScheduleItemsRequest
    extends MBRequest
{

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
    @XmlElement(name = "IgnorePrepFinishTimes")
    protected boolean ignorePrepFinishTimes;

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
     * Gets the value of the ignorePrepFinishTimes property.
     * 
     */
    public boolean isIgnorePrepFinishTimes() {
        return ignorePrepFinishTimes;
    }

    /**
     * Sets the value of the ignorePrepFinishTimes property.
     * 
     */
    public void setIgnorePrepFinishTimes(boolean value) {
        this.ignorePrepFinishTimes = value;
    }

}
