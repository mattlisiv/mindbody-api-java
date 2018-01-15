
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Staff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Staff">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBObject">
 *       &lt;sequence>
 *         &lt;element name="Appointments" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfAppointment" minOccurs="0"/>
 *         &lt;element name="Unavailabilities" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfUnavailability" minOccurs="0"/>
 *         &lt;element name="Availabilities" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfAvailability" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoginLocations" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfLocation" minOccurs="0"/>
 *         &lt;element name="MultiLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AppointmentTrn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReservationTrn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IndependentContractor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AlwaysAllowDoubleBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserAccessLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ProviderIDUpdateList" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfProviderIDUpdate" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5_1}ActionCode" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Staff", propOrder = {
    "appointments",
    "unavailabilities",
    "availabilities",
    "email",
    "mobilePhone",
    "homePhone",
    "workPhone",
    "address",
    "address2",
    "city",
    "state",
    "country",
    "postalCode",
    "foreignZip",
    "sortOrder",
    "loginLocations",
    "multiLocation",
    "appointmentTrn",
    "reservationTrn",
    "independentContractor",
    "alwaysAllowDoubleBooking",
    "userAccessLevel",
    "providerIDs",
    "providerIDUpdateList",
    "action",
    "id",
    "name",
    "firstName",
    "lastName",
    "imageURL",
    "bio",
    "isMale"
})
public class Staff
    extends MBObject
{

    @XmlElement(name = "Appointments")
    protected ArrayOfAppointment appointments;
    @XmlElement(name = "Unavailabilities")
    protected ArrayOfUnavailability unavailabilities;
    @XmlElement(name = "Availabilities")
    protected ArrayOfAvailability availabilities;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "MobilePhone")
    protected String mobilePhone;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "WorkPhone")
    protected String workPhone;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "ForeignZip")
    protected String foreignZip;
    @XmlElement(name = "SortOrder")
    protected Integer sortOrder;
    @XmlElement(name = "LoginLocations")
    protected ArrayOfLocation loginLocations;
    @XmlElementRef(name = "MultiLocation", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> multiLocation;
    @XmlElementRef(name = "AppointmentTrn", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> appointmentTrn;
    @XmlElementRef(name = "ReservationTrn", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reservationTrn;
    @XmlElementRef(name = "IndependentContractor", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> independentContractor;
    @XmlElementRef(name = "AlwaysAllowDoubleBooking", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> alwaysAllowDoubleBooking;
    @XmlElement(name = "UserAccessLevel")
    protected String userAccessLevel;
    @XmlElement(name = "ProviderIDs")
    protected ArrayOfString providerIDs;
    @XmlElement(name = "ProviderIDUpdateList")
    protected ArrayOfProviderIDUpdate providerIDUpdateList;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected ActionCode action;
    @XmlElementRef(name = "ID", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "ImageURL")
    protected String imageURL;
    @XmlElement(name = "Bio")
    protected String bio;
    protected boolean isMale;

    /**
     * Gets the value of the appointments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppointment }
     *     
     */
    public ArrayOfAppointment getAppointments() {
        return appointments;
    }

    /**
     * Sets the value of the appointments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppointment }
     *     
     */
    public void setAppointments(ArrayOfAppointment value) {
        this.appointments = value;
    }

    /**
     * Gets the value of the unavailabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnavailability }
     *     
     */
    public ArrayOfUnavailability getUnavailabilities() {
        return unavailabilities;
    }

    /**
     * Sets the value of the unavailabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnavailability }
     *     
     */
    public void setUnavailabilities(ArrayOfUnavailability value) {
        this.unavailabilities = value;
    }

    /**
     * Gets the value of the availabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailability }
     *     
     */
    public ArrayOfAvailability getAvailabilities() {
        return availabilities;
    }

    /**
     * Sets the value of the availabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailability }
     *     
     */
    public void setAvailabilities(ArrayOfAvailability value) {
        this.availabilities = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the foreignZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignZip() {
        return foreignZip;
    }

    /**
     * Sets the value of the foreignZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignZip(String value) {
        this.foreignZip = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortOrder(Integer value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the loginLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocation }
     *     
     */
    public ArrayOfLocation getLoginLocations() {
        return loginLocations;
    }

    /**
     * Sets the value of the loginLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocation }
     *     
     */
    public void setLoginLocations(ArrayOfLocation value) {
        this.loginLocations = value;
    }

    /**
     * Gets the value of the multiLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMultiLocation() {
        return multiLocation;
    }

    /**
     * Sets the value of the multiLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMultiLocation(JAXBElement<Boolean> value) {
        this.multiLocation = value;
    }

    /**
     * Gets the value of the appointmentTrn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAppointmentTrn() {
        return appointmentTrn;
    }

    /**
     * Sets the value of the appointmentTrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAppointmentTrn(JAXBElement<Boolean> value) {
        this.appointmentTrn = value;
    }

    /**
     * Gets the value of the reservationTrn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReservationTrn() {
        return reservationTrn;
    }

    /**
     * Sets the value of the reservationTrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReservationTrn(JAXBElement<Boolean> value) {
        this.reservationTrn = value;
    }

    /**
     * Gets the value of the independentContractor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIndependentContractor() {
        return independentContractor;
    }

    /**
     * Sets the value of the independentContractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIndependentContractor(JAXBElement<Boolean> value) {
        this.independentContractor = value;
    }

    /**
     * Gets the value of the alwaysAllowDoubleBooking property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAlwaysAllowDoubleBooking() {
        return alwaysAllowDoubleBooking;
    }

    /**
     * Sets the value of the alwaysAllowDoubleBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAlwaysAllowDoubleBooking(JAXBElement<Boolean> value) {
        this.alwaysAllowDoubleBooking = value;
    }

    /**
     * Gets the value of the userAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAccessLevel() {
        return userAccessLevel;
    }

    /**
     * Sets the value of the userAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAccessLevel(String value) {
        this.userAccessLevel = value;
    }

    /**
     * Gets the value of the providerIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getProviderIDs() {
        return providerIDs;
    }

    /**
     * Sets the value of the providerIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setProviderIDs(ArrayOfString value) {
        this.providerIDs = value;
    }

    /**
     * Gets the value of the providerIDUpdateList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProviderIDUpdate }
     *     
     */
    public ArrayOfProviderIDUpdate getProviderIDUpdateList() {
        return providerIDUpdateList;
    }

    /**
     * Sets the value of the providerIDUpdateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProviderIDUpdate }
     *     
     */
    public void setProviderIDUpdateList(ArrayOfProviderIDUpdate value) {
        this.providerIDUpdateList = value;
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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    /**
     * Gets the value of the bio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBio() {
        return bio;
    }

    /**
     * Sets the value of the bio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBio(String value) {
        this.bio = value;
    }

    /**
     * Gets the value of the isMale property.
     * 
     */
    public boolean isIsMale() {
        return isMale;
    }

    /**
     * Sets the value of the isMale property.
     * 
     */
    public void setIsMale(boolean value) {
        this.isMale = value;
    }

}
