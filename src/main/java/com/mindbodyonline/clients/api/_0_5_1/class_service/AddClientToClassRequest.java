
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddClientToClassRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddClientToClassRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RequirePayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Waitlist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WaitlistEntryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClientServiceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CrossRegionalBooking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CrossRegionalBookingClientServiceSiteId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddClientToClassRequest", propOrder = {
    "clientID",
    "classID",
    "test",
    "requirePayment",
    "waitlist",
    "sendEmail",
    "waitlistEntryID",
    "clientServiceID",
    "crossRegionalBooking",
    "crossRegionalBookingClientServiceSiteId"
})
public class AddClientToClassRequest
    extends MBRequest
{

    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "ClassID")
    protected int classID;
    @XmlElement(name = "Test", required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(name = "RequirePayment", required = true, type = Boolean.class, nillable = true)
    protected Boolean requirePayment;
    @XmlElement(name = "Waitlist", required = true, type = Boolean.class, nillable = true)
    protected Boolean waitlist;
    @XmlElement(name = "SendEmail", required = true, type = Boolean.class, nillable = true)
    protected Boolean sendEmail;
    @XmlElement(name = "WaitlistEntryID", required = true, type = Integer.class, nillable = true)
    protected Integer waitlistEntryID;
    @XmlElement(name = "ClientServiceID", required = true, type = Integer.class, nillable = true)
    protected Integer clientServiceID;
    @XmlElement(name = "CrossRegionalBooking")
    protected boolean crossRegionalBooking;
    @XmlElement(name = "CrossRegionalBookingClientServiceSiteId", required = true, type = Integer.class, nillable = true)
    protected Integer crossRegionalBookingClientServiceSiteId;

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the classID property.
     * 
     */
    public int getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     */
    public void setClassID(int value) {
        this.classID = value;
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
     * Gets the value of the requirePayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequirePayment() {
        return requirePayment;
    }

    /**
     * Sets the value of the requirePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequirePayment(Boolean value) {
        this.requirePayment = value;
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

    /**
     * Gets the value of the clientServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientServiceID() {
        return clientServiceID;
    }

    /**
     * Sets the value of the clientServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientServiceID(Integer value) {
        this.clientServiceID = value;
    }

    /**
     * Gets the value of the crossRegionalBooking property.
     * 
     */
    public boolean isCrossRegionalBooking() {
        return crossRegionalBooking;
    }

    /**
     * Sets the value of the crossRegionalBooking property.
     * 
     */
    public void setCrossRegionalBooking(boolean value) {
        this.crossRegionalBooking = value;
    }

    /**
     * Gets the value of the crossRegionalBookingClientServiceSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCrossRegionalBookingClientServiceSiteId() {
        return crossRegionalBookingClientServiceSiteId;
    }

    /**
     * Sets the value of the crossRegionalBookingClientServiceSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCrossRegionalBookingClientServiceSiteId(Integer value) {
        this.crossRegionalBookingClientServiceSiteId = value;
    }

}
