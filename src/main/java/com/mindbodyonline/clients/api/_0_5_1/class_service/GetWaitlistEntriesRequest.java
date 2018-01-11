
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetWaitlistEntriesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWaitlistEntriesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClassScheduleIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="ClientIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="WaitlistEntryIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="ClassIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="HidePastEntries" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWaitlistEntriesRequest", propOrder = {
    "classScheduleIDs",
    "clientIDs",
    "waitlistEntryIDs",
    "classIDs",
    "hidePastEntries"
})
public class GetWaitlistEntriesRequest
    extends MBRequest
{

    @XmlElement(name = "ClassScheduleIDs")
    protected ArrayOfInt classScheduleIDs;
    @XmlElement(name = "ClientIDs")
    protected ArrayOfString clientIDs;
    @XmlElement(name = "WaitlistEntryIDs")
    protected ArrayOfInt waitlistEntryIDs;
    @XmlElement(name = "ClassIDs")
    protected ArrayOfInt classIDs;
    @XmlElement(name = "HidePastEntries", required = true, type = Boolean.class, nillable = true)
    protected Boolean hidePastEntries;

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
     * Gets the value of the waitlistEntryIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getWaitlistEntryIDs() {
        return waitlistEntryIDs;
    }

    /**
     * Sets the value of the waitlistEntryIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setWaitlistEntryIDs(ArrayOfInt value) {
        this.waitlistEntryIDs = value;
    }

    /**
     * Gets the value of the classIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getClassIDs() {
        return classIDs;
    }

    /**
     * Sets the value of the classIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setClassIDs(ArrayOfInt value) {
        this.classIDs = value;
    }

    /**
     * Gets the value of the hidePastEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidePastEntries() {
        return hidePastEntries;
    }

    /**
     * Sets the value of the hidePastEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidePastEntries(Boolean value) {
        this.hidePastEntries = value;
    }

}
