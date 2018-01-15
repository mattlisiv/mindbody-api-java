
package com.mindbodyonline.clients.api._0_5_1.appointment_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetStaffAppointmentsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetStaffAppointmentsResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStaffAppointmentsResult"
})
@XmlRootElement(name = "GetStaffAppointmentsResponse")
public class GetStaffAppointmentsResponse {

    @XmlElement(name = "GetStaffAppointmentsResult")
    protected GetStaffAppointmentsResult getStaffAppointmentsResult;

    /**
     * Gets the value of the getStaffAppointmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetStaffAppointmentsResult }
     *     
     */
    public GetStaffAppointmentsResult getGetStaffAppointmentsResult() {
        return getStaffAppointmentsResult;
    }

    /**
     * Sets the value of the getStaffAppointmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStaffAppointmentsResult }
     *     
     */
    public void setGetStaffAppointmentsResult(GetStaffAppointmentsResult value) {
        this.getStaffAppointmentsResult = value;
    }

}
