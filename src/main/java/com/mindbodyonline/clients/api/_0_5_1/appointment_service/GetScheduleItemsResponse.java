
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
 *         &lt;element name="GetScheduleItemsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetScheduleItemsResult" minOccurs="0"/>
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
    "getScheduleItemsResult"
})
@XmlRootElement(name = "GetScheduleItemsResponse")
public class GetScheduleItemsResponse {

    @XmlElement(name = "GetScheduleItemsResult")
    protected GetScheduleItemsResult getScheduleItemsResult;

    /**
     * Gets the value of the getScheduleItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetScheduleItemsResult }
     *     
     */
    public GetScheduleItemsResult getGetScheduleItemsResult() {
        return getScheduleItemsResult;
    }

    /**
     * Sets the value of the getScheduleItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetScheduleItemsResult }
     *     
     */
    public void setGetScheduleItemsResult(GetScheduleItemsResult value) {
        this.getScheduleItemsResult = value;
    }

}
