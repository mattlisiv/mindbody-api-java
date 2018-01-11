
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Visit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBObject">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AppointmentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AppointmentGenderPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LateCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Staff" type="{http://clients.mindbodyonline.com/api/0_5_1}Staff" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://clients.mindbodyonline.com/api/0_5_1}Location" minOccurs="0"/>
 *         &lt;element name="Client" type="{http://clients.mindbodyonline.com/api/0_5_1}Client" minOccurs="0"/>
 *         &lt;element name="WebSignup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5_1}ActionCode" minOccurs="0"/>
 *         &lt;element name="SignedIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AppointmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MakeUp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://clients.mindbodyonline.com/api/0_5_1}ClientService" minOccurs="0"/>
 *         &lt;element name="LastModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visit", propOrder = {
    "id",
    "classID",
    "appointmentID",
    "appointmentGenderPreference",
    "startDateTime",
    "lateCancelled",
    "endDateTime",
    "name",
    "staff",
    "location",
    "client",
    "webSignup",
    "action",
    "signedIn",
    "appointmentStatus",
    "makeUp",
    "service",
    "lastModifiedDateTime"
})
public class Visit
    extends MBObject
{

    @XmlElement(name = "ID")
    protected Long id;
    @XmlElement(name = "ClassID")
    protected Integer classID;
    @XmlElement(name = "AppointmentID")
    protected Integer appointmentID;
    @XmlElement(name = "AppointmentGenderPreference")
    protected String appointmentGenderPreference;
    @XmlElement(name = "StartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "LateCancelled")
    protected Boolean lateCancelled;
    @XmlElement(name = "EndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Staff")
    protected Staff staff;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Client")
    protected Client client;
    @XmlElement(name = "WebSignup")
    protected Boolean webSignup;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected ActionCode action;
    @XmlElementRef(name = "SignedIn", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> signedIn;
    @XmlElement(name = "AppointmentStatus")
    protected String appointmentStatus;
    @XmlElementRef(name = "MakeUp", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> makeUp;
    @XmlElement(name = "Service")
    protected ClientService service;
    @XmlElementRef(name = "LastModifiedDateTime", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDateTime;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the classID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassID(Integer value) {
        this.classID = value;
    }

    /**
     * Gets the value of the appointmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppointmentID() {
        return appointmentID;
    }

    /**
     * Sets the value of the appointmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppointmentID(Integer value) {
        this.appointmentID = value;
    }

    /**
     * Gets the value of the appointmentGenderPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentGenderPreference() {
        return appointmentGenderPreference;
    }

    /**
     * Sets the value of the appointmentGenderPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentGenderPreference(String value) {
        this.appointmentGenderPreference = value;
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
     * Gets the value of the lateCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLateCancelled() {
        return lateCancelled;
    }

    /**
     * Sets the value of the lateCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLateCancelled(Boolean value) {
        this.lateCancelled = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the webSignup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWebSignup() {
        return webSignup;
    }

    /**
     * Sets the value of the webSignup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebSignup(Boolean value) {
        this.webSignup = value;
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
     * Gets the value of the signedIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSignedIn() {
        return signedIn;
    }

    /**
     * Sets the value of the signedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSignedIn(JAXBElement<Boolean> value) {
        this.signedIn = value;
    }

    /**
     * Gets the value of the appointmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    /**
     * Sets the value of the appointmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentStatus(String value) {
        this.appointmentStatus = value;
    }

    /**
     * Gets the value of the makeUp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMakeUp() {
        return makeUp;
    }

    /**
     * Sets the value of the makeUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMakeUp(JAXBElement<Boolean> value) {
        this.makeUp = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ClientService }
     *     
     */
    public ClientService getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientService }
     *     
     */
    public void setService(ClientService value) {
        this.service = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastModifiedDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastModifiedDateTime = value;
    }

}
