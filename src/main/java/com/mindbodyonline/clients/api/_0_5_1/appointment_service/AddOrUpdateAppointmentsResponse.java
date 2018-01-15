
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
 *         &lt;element name="AddOrUpdateAppointmentsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}AddOrUpdateAppointmentsResult" minOccurs="0"/>
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
    "addOrUpdateAppointmentsResult"
})
@XmlRootElement(name = "AddOrUpdateAppointmentsResponse")
public class AddOrUpdateAppointmentsResponse {

    @XmlElement(name = "AddOrUpdateAppointmentsResult")
    protected AddOrUpdateAppointmentsResult addOrUpdateAppointmentsResult;

    /**
     * Gets the value of the addOrUpdateAppointmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrUpdateAppointmentsResult }
     *     
     */
    public AddOrUpdateAppointmentsResult getAddOrUpdateAppointmentsResult() {
        return addOrUpdateAppointmentsResult;
    }

    /**
     * Sets the value of the addOrUpdateAppointmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrUpdateAppointmentsResult }
     *     
     */
    public void setAddOrUpdateAppointmentsResult(AddOrUpdateAppointmentsResult value) {
        this.addOrUpdateAppointmentsResult = value;
    }

}
