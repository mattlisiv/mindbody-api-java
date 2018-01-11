
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
 *         &lt;element name="UpdateClientCrossRegionalResult" type="{http://clients.mindbodyonline.com/api/0_5_1}UpdateClientCrossRegionalResult" minOccurs="0"/>
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
    "updateClientCrossRegionalResult"
})
@XmlRootElement(name = "UpdateClientCrossRegionalResponse")
public class UpdateClientCrossRegionalResponse {

    @XmlElement(name = "UpdateClientCrossRegionalResult")
    protected UpdateClientCrossRegionalResult updateClientCrossRegionalResult;

    /**
     * Gets the value of the updateClientCrossRegionalResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateClientCrossRegionalResult }
     *     
     */
    public UpdateClientCrossRegionalResult getUpdateClientCrossRegionalResult() {
        return updateClientCrossRegionalResult;
    }

    /**
     * Sets the value of the updateClientCrossRegionalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateClientCrossRegionalResult }
     *     
     */
    public void setUpdateClientCrossRegionalResult(UpdateClientCrossRegionalResult value) {
        this.updateClientCrossRegionalResult = value;
    }

}
