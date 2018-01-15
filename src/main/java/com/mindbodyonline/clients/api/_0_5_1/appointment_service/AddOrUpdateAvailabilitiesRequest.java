
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AddOrUpdateAvailabilitiesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateAvailabilitiesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="UpdateAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AvailabilityIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StaffIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfLong" minOccurs="0"/>
 *         &lt;element name="ProgramIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DaysOfWeek" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfDayOfWeek" minOccurs="0"/>
 *         &lt;element name="UnavailableDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsUnavailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PublicDisplay" type="{http://clients.mindbodyonline.com/api/0_5_1}AvailabilityDisplay"/>
 *         &lt;element name="Execute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateAvailabilitiesRequest", propOrder = {
    "updateAction",
    "test",
    "availabilityIDs",
    "locationID",
    "staffIDs",
    "programIDs",
    "startDateTime",
    "endDateTime",
    "daysOfWeek",
    "unavailableDescription",
    "isUnavailable",
    "publicDisplay",
    "execute"
})
public class AddOrUpdateAvailabilitiesRequest
    extends MBRequest
{

    @XmlElement(name = "UpdateAction")
    protected String updateAction;
    @XmlElement(name = "Test", required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(name = "AvailabilityIDs")
    protected ArrayOfInt availabilityIDs;
    @XmlElement(name = "LocationID", required = true, type = Integer.class, nillable = true)
    protected Integer locationID;
    @XmlElement(name = "StaffIDs")
    protected ArrayOfLong staffIDs;
    @XmlElement(name = "ProgramIDs")
    protected ArrayOfInt programIDs;
    @XmlElement(name = "StartDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "EndDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "DaysOfWeek")
    protected ArrayOfDayOfWeek daysOfWeek;
    @XmlElement(name = "UnavailableDescription")
    protected String unavailableDescription;
    @XmlElement(name = "IsUnavailable")
    protected boolean isUnavailable;
    @XmlElement(name = "PublicDisplay", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected AvailabilityDisplay publicDisplay;
    @XmlElement(name = "Execute")
    protected String execute;

    /**
     * Gets the value of the updateAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateAction() {
        return updateAction;
    }

    /**
     * Sets the value of the updateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateAction(String value) {
        this.updateAction = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTest(Boolean value) {
        this.test = value;
    }

    /**
     * Gets the value of the availabilityIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAvailabilityIDs() {
        return availabilityIDs;
    }

    /**
     * Sets the value of the availabilityIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAvailabilityIDs(ArrayOfInt value) {
        this.availabilityIDs = value;
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
     * Gets the value of the programIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getProgramIDs() {
        return programIDs;
    }

    /**
     * Sets the value of the programIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setProgramIDs(ArrayOfInt value) {
        this.programIDs = value;
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
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDayOfWeek }
     *     
     */
    public ArrayOfDayOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDayOfWeek }
     *     
     */
    public void setDaysOfWeek(ArrayOfDayOfWeek value) {
        this.daysOfWeek = value;
    }

    /**
     * Gets the value of the unavailableDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnavailableDescription() {
        return unavailableDescription;
    }

    /**
     * Sets the value of the unavailableDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnavailableDescription(String value) {
        this.unavailableDescription = value;
    }

    /**
     * Gets the value of the isUnavailable property.
     * 
     */
    public boolean isIsUnavailable() {
        return isUnavailable;
    }

    /**
     * Sets the value of the isUnavailable property.
     * 
     */
    public void setIsUnavailable(boolean value) {
        this.isUnavailable = value;
    }

    /**
     * Gets the value of the publicDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityDisplay }
     *     
     */
    public AvailabilityDisplay getPublicDisplay() {
        return publicDisplay;
    }

    /**
     * Sets the value of the publicDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityDisplay }
     *     
     */
    public void setPublicDisplay(AvailabilityDisplay value) {
        this.publicDisplay = value;
    }

    /**
     * Gets the value of the execute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecute() {
        return execute;
    }

    /**
     * Sets the value of the execute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecute(String value) {
        this.execute = value;
    }

}
