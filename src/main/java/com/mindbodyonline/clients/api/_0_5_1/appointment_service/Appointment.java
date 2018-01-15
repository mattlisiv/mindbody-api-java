
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Appointment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Appointment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}ScheduleItem">
 *       &lt;sequence>
 *         &lt;element name="GenderPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProviderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5_1}ActionCode" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://clients.mindbodyonline.com/api/0_5_1}AppointmentStatus" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaffRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Program" type="{http://clients.mindbodyonline.com/api/0_5_1}Program" minOccurs="0"/>
 *         &lt;element name="SessionType" type="{http://clients.mindbodyonline.com/api/0_5_1}SessionType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://clients.mindbodyonline.com/api/0_5_1}Location" minOccurs="0"/>
 *         &lt;element name="Staff" type="{http://clients.mindbodyonline.com/api/0_5_1}Staff" minOccurs="0"/>
 *         &lt;element name="Client" type="{http://clients.mindbodyonline.com/api/0_5_1}Client" minOccurs="0"/>
 *         &lt;element name="FirstAppointment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClientService" type="{http://clients.mindbodyonline.com/api/0_5_1}ClientService" minOccurs="0"/>
 *         &lt;element name="Resources" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfResource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appointment", propOrder = {
    "genderPreference",
    "duration",
    "providerID",
    "action",
    "id",
    "status",
    "startDateTime",
    "endDateTime",
    "notes",
    "staffRequested",
    "program",
    "sessionType",
    "location",
    "staff",
    "client",
    "firstAppointment",
    "clientService",
    "resources"
})
public class Appointment
    extends ScheduleItem
{

    @XmlElement(name = "GenderPreference")
    protected String genderPreference;
    @XmlElement(name = "Duration", required = true, type = Integer.class, nillable = true)
    protected Integer duration;
    @XmlElement(name = "ProviderID")
    protected String providerID;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected ActionCode action;
    @XmlElementRef(name = "ID", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> id;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected AppointmentStatus status;
    @XmlElementRef(name = "StartDateTime", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDateTime;
    @XmlElementRef(name = "EndDateTime", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDateTime;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElementRef(name = "StaffRequested", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> staffRequested;
    @XmlElement(name = "Program")
    protected Program program;
    @XmlElement(name = "SessionType")
    protected SessionType sessionType;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Staff")
    protected Staff staff;
    @XmlElement(name = "Client")
    protected Client client;
    @XmlElementRef(name = "FirstAppointment", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> firstAppointment;
    @XmlElement(name = "ClientService")
    protected ClientService clientService;
    @XmlElement(name = "Resources")
    protected ArrayOfResource resources;

    /**
     * Gets the value of the genderPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderPreference() {
        return genderPreference;
    }

    /**
     * Sets the value of the genderPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderPreference(String value) {
        this.genderPreference = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setAction(ActionCode value) {
        this.action = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setID(JAXBElement<Long> value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentStatus }
     *     
     */
    public AppointmentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentStatus }
     *     
     */
    public void setStatus(AppointmentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the staffRequested property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStaffRequested() {
        return staffRequested;
    }

    /**
     * Sets the value of the staffRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStaffRequested(JAXBElement<Boolean> value) {
        this.staffRequested = value;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link Program }
     *     
     */
    public Program getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link Program }
     *     
     */
    public void setProgram(Program value) {
        this.program = value;
    }

    /**
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link SessionType }
     *     
     */
    public SessionType getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionType }
     *     
     */
    public void setSessionType(SessionType value) {
        this.sessionType = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the staff property.
     * 
     * @return
     *     possible object is
     *     {@link Staff }
     *     
     */
    public Staff getStaff() {
        return staff;
    }

    /**
     * Sets the value of the staff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staff }
     *     
     */
    public void setStaff(Staff value) {
        this.staff = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Gets the value of the firstAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFirstAppointment() {
        return firstAppointment;
    }

    /**
     * Sets the value of the firstAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFirstAppointment(JAXBElement<Boolean> value) {
        this.firstAppointment = value;
    }

    /**
     * Gets the value of the clientService property.
     * 
     * @return
     *     possible object is
     *     {@link ClientService }
     *     
     */
    public ClientService getClientService() {
        return clientService;
    }

    /**
     * Sets the value of the clientService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientService }
     *     
     */
    public void setClientService(ClientService value) {
        this.clientService = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResource }
     *     
     */
    public ArrayOfResource getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResource }
     *     
     */
    public void setResources(ArrayOfResource value) {
        this.resources = value;
    }

}
