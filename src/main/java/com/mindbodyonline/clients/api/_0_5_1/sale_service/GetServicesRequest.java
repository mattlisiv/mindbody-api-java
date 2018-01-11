
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetServicesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServicesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="ProgramIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="SessionTypeIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="ServiceIDs" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ClassID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClassScheduleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SellOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HideRelatedPrograms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StaffID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServicesRequest", propOrder = {
    "programIDs",
    "sessionTypeIDs",
    "serviceIDs",
    "classID",
    "classScheduleID",
    "sellOnline",
    "locationID",
    "hideRelatedPrograms",
    "staffID"
})
public class GetServicesRequest
    extends MBRequest
{

    @XmlElement(name = "ProgramIDs")
    protected ArrayOfInt programIDs;
    @XmlElement(name = "SessionTypeIDs")
    protected ArrayOfInt sessionTypeIDs;
    @XmlElement(name = "ServiceIDs")
    protected ArrayOfString serviceIDs;
    @XmlElement(name = "ClassID", required = true, type = Integer.class, nillable = true)
    protected Integer classID;
    @XmlElement(name = "ClassScheduleID", required = true, type = Integer.class, nillable = true)
    protected Integer classScheduleID;
    @XmlElement(name = "SellOnline", required = true, type = Boolean.class, nillable = true)
    protected Boolean sellOnline;
    @XmlElement(name = "LocationID")
    protected int locationID;
    @XmlElement(name = "HideRelatedPrograms")
    protected boolean hideRelatedPrograms;
    @XmlElement(name = "StaffID", required = true, type = Long.class, nillable = true)
    protected Long staffID;

    /**
     * Gets the value of the programIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getProgramIDs() {
        return programIDs;
    }

    /**
     * Sets the value of the programIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setProgramIDs(ArrayOfInt value) {
        this.programIDs = value;
    }

    /**
     * Gets the value of the sessionTypeIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSessionTypeIDs() {
        return sessionTypeIDs;
    }

    /**
     * Sets the value of the sessionTypeIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSessionTypeIDs(ArrayOfInt value) {
        this.sessionTypeIDs = value;
    }

    /**
     * Gets the value of the serviceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getServiceIDs() {
        return serviceIDs;
    }

    /**
     * Sets the value of the serviceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setServiceIDs(ArrayOfString value) {
        this.serviceIDs = value;
    }

    /**
     * Gets the value of the classID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassID(Integer value) {
        this.classID = value;
    }

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
     * Gets the value of the sellOnline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellOnline() {
        return sellOnline;
    }

    /**
     * Sets the value of the sellOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellOnline(Boolean value) {
        this.sellOnline = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     */
    public int getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     */
    public void setLocationID(int value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the hideRelatedPrograms property.
     * 
     */
    public boolean isHideRelatedPrograms() {
        return hideRelatedPrograms;
    }

    /**
     * Sets the value of the hideRelatedPrograms property.
     * 
     */
    public void setHideRelatedPrograms(boolean value) {
        this.hideRelatedPrograms = value;
    }

    /**
     * Gets the value of the staffID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStaffID() {
        return staffID;
    }

    /**
     * Sets the value of the staffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStaffID(Long value) {
        this.staffID = value;
    }

}
