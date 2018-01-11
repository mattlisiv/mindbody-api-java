
package com.mindbodyonline.clients.api._0_5_1.staff_service;

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
 *         &lt;element name="GetSalesRepsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetSalesRepsResult" minOccurs="0"/>
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
    "getSalesRepsResult"
})
@XmlRootElement(name = "GetSalesRepsResponse")
public class GetSalesRepsResponse {

    @XmlElement(name = "GetSalesRepsResult")
    protected GetSalesRepsResult getSalesRepsResult;

    /**
     * Gets the value of the getSalesRepsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetSalesRepsResult }
     *     
     */
    public GetSalesRepsResult getGetSalesRepsResult() {
        return getSalesRepsResult;
    }

    /**
     * Sets the value of the getSalesRepsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSalesRepsResult }
     *     
     */
    public void setGetSalesRepsResult(GetSalesRepsResult value) {
        this.getSalesRepsResult = value;
    }

}
