
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
 *         &lt;element name="GetClientContractsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetClientContractsResult" minOccurs="0"/>
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
    "getClientContractsResult"
})
@XmlRootElement(name = "GetClientContractsResponse")
public class GetClientContractsResponse {

    @XmlElement(name = "GetClientContractsResult")
    protected GetClientContractsResult getClientContractsResult;

    /**
     * Gets the value of the getClientContractsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetClientContractsResult }
     *     
     */
    public GetClientContractsResult getGetClientContractsResult() {
        return getClientContractsResult;
    }

    /**
     * Sets the value of the getClientContractsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClientContractsResult }
     *     
     */
    public void setGetClientContractsResult(GetClientContractsResult value) {
        this.getClientContractsResult = value;
    }

}
