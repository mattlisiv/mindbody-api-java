
package com.mindbodyonline.clients.api._0_5_1.staff_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetStaffRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStaffRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="StaffIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="StaffCredentials" type="{http://clients.mindbodyonline.com/api/0_5_1}StaffCredentials" minOccurs="0"/>
 *         &lt;element name="Filters" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfStaffFilter" minOccurs="0"/>
 *         &lt;element name="SessionTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStaffRequest", propOrder = {
    "staffIDs",
    "staffCredentials",
    "filters",
    "sessionTypeID",
    "startDateTime",
    "locationID"
})
public class GetStaffRequest
    extends MBRequest
{

    @XmlElement(name = "StaffIDs")
    protected ArrayOfLong staffIDs;
    @XmlElement(name = "StaffCredentials")
    protected StaffCredentials staffCredentials;
    @XmlElement(name = "Filters")
    protected ArrayOfStaffFilter filters;
    @XmlElement(name = "SessionTypeID", required = true, type = Integer.class, nillable = true)
    protected Integer sessionTypeID;
    @XmlElement(name = "StartDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "LocationID", required = true, type = Integer.class, nillable = true)
    protected Integer locationID;

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
     * Gets the value of the staffCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link StaffCredentials }
     *     
     */
    public StaffCredentials getStaffCredentials() {
        return staffCredentials;
    }

    /**
     * Sets the value of the staffCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffCredentials }
     *     
     */
    public void setStaffCredentials(StaffCredentials value) {
        this.staffCredentials = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStaffFilter }
     *     
     */
    public ArrayOfStaffFilter getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStaffFilter }
     *     
     */
    public void setFilters(ArrayOfStaffFilter value) {
        this.filters = value;
    }

    /**
     * Gets the value of the sessionTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSessionTypeID() {
        return sessionTypeID;
    }

    /**
     * Sets the value of the sessionTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSessionTypeID(Integer value) {
        this.sessionTypeID = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationID(Integer value) {
        this.locationID = value;
    }

}
