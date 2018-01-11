
package com.mindbodyonline.clients.api._0_5_1.client_service;

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
 *         &lt;element name="GetClientServicesResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetClientServicesResult" minOccurs="0"/>
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
    "getClientServicesResult"
})
@XmlRootElement(name = "GetClientServicesResponse")
public class GetClientServicesResponse {

    @XmlElement(name = "GetClientServicesResult")
    protected GetClientServicesResult getClientServicesResult;

    /**
     * Gets the value of the getClientServicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetClientServicesResult }
     *     
     */
    public GetClientServicesResult getGetClientServicesResult() {
        return getClientServicesResult;
    }

    /**
     * Sets the value of the getClientServicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClientServicesResult }
     *     
     */
    public void setGetClientServicesResult(GetClientServicesResult value) {
        this.getClientServicesResult = value;
    }

}
