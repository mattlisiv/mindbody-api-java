
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
 * <p>Java class for Class complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Class">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBObject">
 *       &lt;sequence>
 *         &lt;element name="ClassScheduleID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Visits" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfVisit" minOccurs="0"/>
 *         &lt;element name="Clients" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfClient" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://clients.mindbodyonline.com/api/0_5_1}Location" minOccurs="0"/>
 *         &lt;element name="Resource" type="{http://clients.mindbodyonline.com/api/0_5_1}Resource" minOccurs="0"/>
 *         &lt;element name="MaxCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalBooked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalBookedWaitlist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebBooked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SemesterID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsCanceled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Substitute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWaitlistAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEnrolled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideCancel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://clients.mindbodyonline.com/api/0_5_1}ActionCode" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ClassDescription" type="{http://clients.mindbodyonline.com/api/0_5_1}ClassDescription" minOccurs="0"/>
 *         &lt;element name="Staff" type="{http://clients.mindbodyonline.com/api/0_5_1}Staff" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Class", propOrder = {
    "classScheduleID",
    "visits",
    "clients",
    "location",
    "resource",
    "maxCapacity",
    "webCapacity",
    "totalBooked",
    "totalBookedWaitlist",
    "webBooked",
    "semesterID",
    "isCanceled",
    "substitute",
    "active",
    "isWaitlistAvailable",
    "isEnrolled",
    "hideCancel",
    "action",
    "id",
    "isAvailable",
    "startDateTime",
    "endDateTime",
    "lastModifiedDateTime",
    "classDescription",
    "staff"
})
public class Class
    extends MBObject
{

    @XmlElement(name = "ClassScheduleID")
    protected Integer classScheduleID;
    @XmlElement(name = "Visits")
    protected ArrayOfVisit visits;
    @XmlElement(name = "Clients")
    protected ArrayOfClient clients;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Resource")
    protected Resource resource;
    @XmlElement(name = "MaxCapacity", required = true, type = Integer.class, nillable = true)
    protected Integer maxCapacity;
    @XmlElement(name = "WebCapacity", required = true, type = Integer.class, nillable = true)
    protected Integer webCapacity;
    @XmlElement(name = "TotalBooked", required = true, type = Integer.class, nillable = true)
    protected Integer totalBooked;
    @XmlElement(name = "TotalBookedWaitlist", required = true, type = Integer.class, nillable = true)
    protected Integer totalBookedWaitlist;
    @XmlElement(name = "WebBooked", required = true, type = Integer.class, nillable = true)
    protected Integer webBooked;
    @XmlElementRef(name = "SemesterID", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> semesterID;
    @XmlElement(name = "IsCanceled")
    protected Boolean isCanceled;
    @XmlElement(name = "Substitute")
    protected Boolean substitute;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "IsWaitlistAvailable")
    protected Boolean isWaitlistAvailable;
    @XmlElement(name = "IsEnrolled")
    protected Boolean isEnrolled;
    @XmlElement(name = "HideCancel")
    protected Boolean hideCancel;
    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected ActionCode action;
    @XmlElementRef(name = "ID", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "IsAvailable", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAvailable;
    @XmlElementRef(name = "StartDateTime", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDateTime;
    @XmlElementRef(name = "EndDateTime", namespace = "http://clients.mindbodyonline.com/api/0_5_1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDateTime;
    @XmlElement(name = "LastModifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDateTime;
    @XmlElement(name = "ClassDescription")
    protected ClassDescription classDescription;
    @XmlElement(name = "Staff")
    protected Staff staff;

    /**
     * Gets the value of the classScheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassScheduleID() {
        return classScheduleID;
    }

    /**
     * Sets the value of the classScheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassScheduleID(Integer value) {
        this.classScheduleID = value;
    }

    /**
     * Gets the value of the visits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVisit }
     *     
     */
    public ArrayOfVisit getVisits() {
        return visits;
    }

    /**
     * Sets the value of the visits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVisit }
     *     
     */
    public void setVisits(ArrayOfVisit value) {
        this.visits = value;
    }

    /**
     * Gets the value of the clients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClient }
     *     
     */
    public ArrayOfClient getClients() {
        return clients;
    }

    /**
     * Sets the value of the clients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClient }
     *     
     */
    public void setClients(ArrayOfClient value) {
        this.clients = value;
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
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link Resource }
     *     
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource }
     *     
     */
    public void setResource(Resource value) {
        this.resource = value;
    }

    /**
     * Gets the value of the maxCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Sets the value of the maxCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCapacity(Integer value) {
        this.maxCapacity = value;
    }

    /**
     * Gets the value of the webCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWebCapacity() {
        return webCapacity;
    }

    /**
     * Sets the value of the webCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWebCapacity(Integer value) {
        this.webCapacity = value;
    }

    /**
     * Gets the value of the totalBooked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalBooked() {
        return totalBooked;
    }

    /**
     * Sets the value of the totalBooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalBooked(Integer value) {
        this.totalBooked = value;
    }

    /**
     * Gets the value of the totalBookedWaitlist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalBookedWaitlist() {
        return totalBookedWaitlist;
    }

    /**
     * Sets the value of the totalBookedWaitlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalBookedWaitlist(Integer value) {
        this.totalBookedWaitlist = value;
    }

    /**
     * Gets the value of the webBooked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWebBooked() {
        return webBooked;
    }

    /**
     * Sets the value of the webBooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWebBooked(Integer value) {
        this.webBooked = value;
    }

    /**
     * Gets the value of the semesterID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSemesterID() {
        return semesterID;
    }

    /**
     * Sets the value of the semesterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSemesterID(JAXBElement<Integer> value) {
        this.semesterID = value;
    }

    /**
     * Gets the value of the isCanceled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCanceled() {
        return isCanceled;
    }

    /**
     * Sets the value of the isCanceled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCanceled(Boolean value) {
        this.isCanceled = value;
    }

    /**
     * Gets the value of the substitute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubstitute() {
        return substitute;
    }

    /**
     * Sets the value of the substitute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubstitute(Boolean value) {
        this.substitute = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the isWaitlistAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWaitlistAvailable() {
        return isWaitlistAvailable;
    }

    /**
     * Sets the value of the isWaitlistAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWaitlistAvailable(Boolean value) {
        this.isWaitlistAvailable = value;
    }

    /**
     * Gets the value of the isEnrolled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnrolled() {
        return isEnrolled;
    }

    /**
     * Sets the value of the isEnrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnrolled(Boolean value) {
        this.isEnrolled = value;
    }

    /**
     * Gets the value of the hideCancel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideCancel() {
        return hideCancel;
    }

    /**
     * Sets the value of the hideCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideCancel(Boolean value) {
        this.hideCancel = value;
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
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setID(JAXBElement<Integer> value) {
        this.id = value;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAvailable(JAXBElement<Boolean> value) {
        this.isAvailable = value;
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
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateTime(XMLGregorianCalendar value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the classDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ClassDescription }
     *     
     */
    public ClassDescription getClassDescription() {
        return classDescription;
    }

    /**
     * Sets the value of the classDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassDescription }
     *     
     */
    public void setClassDescription(ClassDescription value) {
        this.classDescription = value;
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

}
