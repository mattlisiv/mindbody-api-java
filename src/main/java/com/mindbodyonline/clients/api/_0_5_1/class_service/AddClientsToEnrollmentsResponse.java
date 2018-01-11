
package com.mindbodyonline.clients.api._0_5_1.class_service;

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
 *         &lt;element name="AddClientsToEnrollmentsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}AddClientsToEnrollmentsResult" minOccurs="0"/>
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
    "addClientsToEnrollmentsResult"
})
@XmlRootElement(name = "AddClientsToEnrollmentsResponse")
public class AddClientsToEnrollmentsResponse {

    @XmlElement(name = "AddClientsToEnrollmentsResult")
    protected AddClientsToEnrollmentsResult addClientsToEnrollmentsResult;

    /**
     * Gets the value of the addClientsToEnrollmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddClientsToEnrollmentsResult }
     *     
     */
    public AddClientsToEnrollmentsResult getAddClientsToEnrollmentsResult() {
        return addClientsToEnrollmentsResult;
    }

    /**
     * Sets the value of the addClientsToEnrollmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddClientsToEnrollmentsResult }
     *     
     */
    public void setAddClientsToEnrollmentsResult(AddClientsToEnrollmentsResult value) {
        this.addClientsToEnrollmentsResult = value;
    }

}
