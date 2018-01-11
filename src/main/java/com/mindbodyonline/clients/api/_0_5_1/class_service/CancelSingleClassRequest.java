
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelSingleClassRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelSingleClassRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HideCancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SendClientEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SendStaffEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelSingleClassRequest", propOrder = {
    "classID",
    "hideCancel",
    "sendClientEmail",
    "sendStaffEmail"
})
public class CancelSingleClassRequest
    extends MBRequest
{

    @XmlElement(name = "ClassID")
    protected long classID;
    @XmlElement(name = "HideCancel")
    protected boolean hideCancel;
    @XmlElement(name = "SendClientEmail")
    protected boolean sendClientEmail;
    @XmlElement(name = "SendStaffEmail")
    protected boolean sendStaffEmail;

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
     * Gets the value of the hideCancel property.
     * 
     */
    public boolean isHideCancel() {
        return hideCancel;
    }

    /**
     * Sets the value of the hideCancel property.
     * 
     */
    public void setHideCancel(boolean value) {
        this.hideCancel = value;
    }

    /**
     * Gets the value of the sendClientEmail property.
     * 
     */
    public boolean isSendClientEmail() {
        return sendClientEmail;
    }

    /**
     * Sets the value of the sendClientEmail property.
     * 
     */
    public void setSendClientEmail(boolean value) {
        this.sendClientEmail = value;
    }

    /**
     * Gets the value of the sendStaffEmail property.
     * 
     */
    public boolean isSendStaffEmail() {
        return sendStaffEmail;
    }

    /**
     * Sets the value of the sendStaffEmail property.
     * 
     */
    public void setSendStaffEmail(boolean value) {
        this.sendStaffEmail = value;
    }

}
