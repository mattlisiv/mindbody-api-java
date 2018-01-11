
package com.mindbodyonline.clients.api._0_5_1.class_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubstituteClassTeacherRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstituteClassTeacherRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StaffID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OverrideConflicts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SendClientEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SendOldStaffEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SendNewStaffEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstituteClassTeacherRequest", propOrder = {
    "classID",
    "staffID",
    "overrideConflicts",
    "sendClientEmail",
    "sendOldStaffEmail",
    "sendNewStaffEmail"
})
public class SubstituteClassTeacherRequest
    extends MBRequest
{

    @XmlElement(name = "ClassID")
    protected long classID;
    @XmlElement(name = "StaffID")
    protected long staffID;
    @XmlElement(name = "OverrideConflicts")
    protected boolean overrideConflicts;
    @XmlElement(name = "SendClientEmail")
    protected boolean sendClientEmail;
    @XmlElement(name = "SendOldStaffEmail")
    protected boolean sendOldStaffEmail;
    @XmlElement(name = "SendNewStaffEmail")
    protected boolean sendNewStaffEmail;

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
     * Gets the value of the staffID property.
     * 
     */
    public long getStaffID() {
        return staffID;
    }

    /**
     * Sets the value of the staffID property.
     * 
     */
    public void setStaffID(long value) {
        this.staffID = value;
    }

    /**
     * Gets the value of the overrideConflicts property.
     * 
     */
    public boolean isOverrideConflicts() {
        return overrideConflicts;
    }

    /**
     * Sets the value of the overrideConflicts property.
     * 
     */
    public void setOverrideConflicts(boolean value) {
        this.overrideConflicts = value;
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
     * Gets the value of the sendOldStaffEmail property.
     * 
     */
    public boolean isSendOldStaffEmail() {
        return sendOldStaffEmail;
    }

    /**
     * Sets the value of the sendOldStaffEmail property.
     * 
     */
    public void setSendOldStaffEmail(boolean value) {
        this.sendOldStaffEmail = value;
    }

    /**
     * Gets the value of the sendNewStaffEmail property.
     * 
     */
    public boolean isSendNewStaffEmail() {
        return sendNewStaffEmail;
    }

    /**
     * Sets the value of the sendNewStaffEmail property.
     * 
     */
    public void setSendNewStaffEmail(boolean value) {
        this.sendNewStaffEmail = value;
    }

}
