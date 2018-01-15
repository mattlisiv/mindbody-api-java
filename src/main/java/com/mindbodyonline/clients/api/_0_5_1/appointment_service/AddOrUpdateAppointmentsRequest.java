
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrUpdateAppointmentsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateAppointmentsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="UpdateAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ApplyPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Appointments" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfAppointment" minOccurs="0"/>
 *         &lt;element name="IgnoreDefaultSessionLength" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateAppointmentsRequest", propOrder = {
    "updateAction",
    "test",
    "sendEmail",
    "applyPayment",
    "appointments",
    "ignoreDefaultSessionLength"
})
public class AddOrUpdateAppointmentsRequest
    extends MBRequest
{

    @XmlElement(name = "UpdateAction")
    protected String updateAction;
    @XmlElement(name = "Test", required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(name = "SendEmail", required = true, type = Boolean.class, nillable = true)
    protected Boolean sendEmail;
    @XmlElement(name = "ApplyPayment", required = true, type = Boolean.class, nillable = true)
    protected Boolean applyPayment;
    @XmlElement(name = "Appointments")
    protected ArrayOfAppointment appointments;
    @XmlElement(name = "IgnoreDefaultSessionLength", required = true, type = Boolean.class, nillable = true)
    protected Boolean ignoreDefaultSessionLength;

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
     * Gets the value of the applyPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyPayment() {
        return applyPayment;
    }

    /**
     * Sets the value of the applyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyPayment(Boolean value) {
        this.applyPayment = value;
    }

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
     * Gets the value of the ignoreDefaultSessionLength property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreDefaultSessionLength() {
        return ignoreDefaultSessionLength;
    }

    /**
     * Sets the value of the ignoreDefaultSessionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreDefaultSessionLength(Boolean value) {
        this.ignoreDefaultSessionLength = value;
    }

}
