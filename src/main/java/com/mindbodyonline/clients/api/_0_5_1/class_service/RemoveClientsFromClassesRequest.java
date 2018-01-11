
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveClientsFromClassesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveClientsFromClassesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClientIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ClassIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LateCancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveClientsFromClassesRequest", propOrder = {
    "clientIDs",
    "classIDs",
    "test",
    "sendEmail",
    "lateCancel"
})
public class RemoveClientsFromClassesRequest
    extends MBRequest
{

    @XmlElement(name = "ClientIDs")
    protected ArrayOfString clientIDs;
    @XmlElement(name = "ClassIDs")
    protected ArrayOfInt classIDs;
    @XmlElement(name = "Test", required = true, type = Boolean.class, nillable = true)
    protected Boolean test;
    @XmlElement(name = "SendEmail", required = true, type = Boolean.class, nillable = true)
    protected Boolean sendEmail;
    @XmlElement(name = "LateCancel", required = true, type = Boolean.class, nillable = true)
    protected Boolean lateCancel;

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
     * Gets the value of the lateCancel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLateCancel() {
        return lateCancel;
    }

    /**
     * Sets the value of the lateCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLateCancel(Boolean value) {
        this.lateCancel = value;
    }

}
