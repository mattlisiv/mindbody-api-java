
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WaitlistEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaitlistEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ClassDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Client" type="{http://clients.mindbodyonline.com/api/0_5_1}Client" minOccurs="0"/>
 *         &lt;element name="ClassSchedule" type="{http://clients.mindbodyonline.com/api/0_5_1}ClassSchedule" minOccurs="0"/>
 *         &lt;element name="EnrollmentDateForward" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RequestDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Web" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VisitRefNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitlistEntry", propOrder = {
    "id",
    "classID",
    "classDate",
    "client",
    "classSchedule",
    "enrollmentDateForward",
    "requestDateTime",
    "web",
    "visitRefNo"
})
public class WaitlistEntry {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "ClassID")
    protected long classID;
    @XmlElement(name = "ClassDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar classDate;
    @XmlElement(name = "Client")
    protected Client client;
    @XmlElement(name = "ClassSchedule")
    protected ClassSchedule classSchedule;
    @XmlElement(name = "EnrollmentDateForward", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enrollmentDateForward;
    @XmlElement(name = "RequestDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDateTime;
    @XmlElement(name = "Web")
    protected boolean web;
    @XmlElement(name = "VisitRefNo")
    protected int visitRefNo;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the classID property.
     * 
     */
    public long getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     */
    public void setClassID(long value) {
        this.classID = value;
    }

    /**
     * Gets the value of the classDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassDate() {
        return classDate;
    }

    /**
     * Sets the value of the classDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassDate(XMLGregorianCalendar value) {
        this.classDate = value;
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
     * Gets the value of the classSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ClassSchedule }
     *     
     */
    public ClassSchedule getClassSchedule() {
        return classSchedule;
    }

    /**
     * Sets the value of the classSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassSchedule }
     *     
     */
    public void setClassSchedule(ClassSchedule value) {
        this.classSchedule = value;
    }

    /**
     * Gets the value of the enrollmentDateForward property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnrollmentDateForward() {
        return enrollmentDateForward;
    }

    /**
     * Sets the value of the enrollmentDateForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnrollmentDateForward(XMLGregorianCalendar value) {
        this.enrollmentDateForward = value;
    }

    /**
     * Gets the value of the requestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDateTime() {
        return requestDateTime;
    }

    /**
     * Sets the value of the requestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDateTime(XMLGregorianCalendar value) {
        this.requestDateTime = value;
    }

    /**
     * Gets the value of the web property.
     * 
     */
    public boolean isWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     */
    public void setWeb(boolean value) {
        this.web = value;
    }

    /**
     * Gets the value of the visitRefNo property.
     * 
     */
    public int getVisitRefNo() {
        return visitRefNo;
    }

    /**
     * Sets the value of the visitRefNo property.
     * 
     */
    public void setVisitRefNo(int value) {
        this.visitRefNo = value;
    }

}
