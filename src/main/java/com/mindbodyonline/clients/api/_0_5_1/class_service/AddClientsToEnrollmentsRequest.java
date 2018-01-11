
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AddClientsToEnrollmentsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddClientsToEnrollmentsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ClassScheduleIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="CourseIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="EnrollDateForward" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EnrollOpen" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfDateTime" minOccurs="0"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Waitlist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WaitlistEntryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddClientsToEnrollmentsRequest", propOrder = {
    "clientIDs",
    "classScheduleIDs",
    "courseIDs",
    "enrollDateForward",
    "enrollOpen",
    "test",
    "sendEmail",
    "waitlist",
    "waitlistEntryID"
})
public class AddClientsToEnrollmentsRequest
    extends MBRequest
{

    @XmlElement(name = "ClientIDs")
    protected ArrayOfString clientIDs;
    @XmlElement(name = "ClassScheduleIDs")
    protected ArrayOfInt classScheduleIDs;
    @XmlElement(name = "CourseIDs")
    protected ArrayOfInt courseIDs;
    @XmlElement(name = "EnrollDateForward", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enrollDateForward;
    @XmlElement(name = "EnrollOpen")
    protected ArrayOfDateTime enrollOpen;
    @XmlElement(name = "Test", required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(name = "SendEmail", required = true, type = Boolean.class, nillable = true)
    protected Boolean sendEmail;
    @XmlElement(name = "Waitlist", required = true, type = Boolean.class, nillable = true)
    protected Boolean waitlist;
    @XmlElement(name = "WaitlistEntryID", required = true, type = Integer.class, nillable = true)
    protected Integer waitlistEntryID;

    /**
     * Gets the value of the clientIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getClientIDs() {
        return clientIDs;
    }

    /**
     * Sets the value of the clientIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setClientIDs(ArrayOfString value) {
        this.clientIDs = value;
    }

    /**
     * Gets the value of the classScheduleIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getClassScheduleIDs() {
        return classScheduleIDs;
    }

    /**
     * Sets the value of the classScheduleIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setClassScheduleIDs(ArrayOfInt value) {
        this.classScheduleIDs = value;
    }

    /**
     * Gets the value of the courseIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getCourseIDs() {
        return courseIDs;
    }

    /**
     * Sets the value of the courseIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setCourseIDs(ArrayOfInt value) {
        this.courseIDs = value;
    }

    /**
     * Gets the value of the enrollDateForward property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnrollDateForward() {
        return enrollDateForward;
    }

    /**
     * Sets the value of the enrollDateForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnrollDateForward(XMLGregorianCalendar value) {
        this.enrollDateForward = value;
    }

    /**
     * Gets the value of the enrollOpen property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDateTime }
     *     
     */
    public ArrayOfDateTime getEnrollOpen() {
        return enrollOpen;
    }

    /**
     * Sets the value of the enrollOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDateTime }
     *     
     */
    public void setEnrollOpen(ArrayOfDateTime value) {
        this.enrollOpen = value;
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
     * Gets the value of the sendEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the value of the sendEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

    /**
     * Gets the value of the waitlist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitlist() {
        return waitlist;
    }

    /**
     * Sets the value of the waitlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitlist(Boolean value) {
        this.waitlist = value;
    }

    /**
     * Gets the value of the waitlistEntryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWaitlistEntryID() {
        return waitlistEntryID;
    }

    /**
     * Sets the value of the waitlistEntryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaitlistEntryID(Integer value) {
        this.waitlistEntryID = value;
    }

}
