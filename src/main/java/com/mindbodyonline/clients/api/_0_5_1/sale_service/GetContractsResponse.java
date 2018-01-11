
package com.mindbodyonline.clients.api._0_5_1.sale_service;

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
 *         &lt;element name="GetContractsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetContractsResult" minOccurs="0"/>
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
    "getContractsResult"
})
@XmlRootElement(name = "GetContractsResponse")
public class GetContractsResponse {

    @XmlElement(name = "GetContractsResult")
    protected GetContractsResult getContractsResult;

    /**
     * Gets the value of the getContractsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetContractsResult }
     *     
     */
    public GetContractsResult getGetContractsResult() {
        return getContractsResult;
    }

    /**
     * Sets the value of the getContractsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContractsResult }
     *     
     */
    public void setGetContractsResult(GetContractsResult value) {
        this.getContractsResult = value;
    }

}
