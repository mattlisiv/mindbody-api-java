
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
 *         &lt;element name="GetActiveSessionTimesResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetActiveSessionTimesResult" minOccurs="0"/>
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
    "getActiveSessionTimesResult"
})
@XmlRootElement(name = "GetActiveSessionTimesResponse")
public class GetActiveSessionTimesResponse {

    @XmlElement(name = "GetActiveSessionTimesResult")
    protected GetActiveSessionTimesResult getActiveSessionTimesResult;

    /**
     * Gets the value of the getActiveSessionTimesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetActiveSessionTimesResult }
     *     
     */
    public GetActiveSessionTimesResult getGetActiveSessionTimesResult() {
        return getActiveSessionTimesResult;
    }

    /**
     * Sets the value of the getActiveSessionTimesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetActiveSessionTimesResult }
     *     
     */
    public void setGetActiveSessionTimesResult(GetActiveSessionTimesResult value) {
        this.getActiveSessionTimesResult = value;
    }

}
