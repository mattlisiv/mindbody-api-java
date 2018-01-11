
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
 *         &lt;element name="GetCustomPaymentMethodsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetCustomPaymentMethodsResult" minOccurs="0"/>
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
    "getCustomPaymentMethodsResult"
})
@XmlRootElement(name = "GetCustomPaymentMethodsResponse")
public class GetCustomPaymentMethodsResponse {

    @XmlElement(name = "GetCustomPaymentMethodsResult")
    protected GetCustomPaymentMethodsResult getCustomPaymentMethodsResult;

    /**
     * Gets the value of the getCustomPaymentMethodsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomPaymentMethodsResult }
     *     
     */
    public GetCustomPaymentMethodsResult getGetCustomPaymentMethodsResult() {
        return getCustomPaymentMethodsResult;
    }

    /**
     * Sets the value of the getCustomPaymentMethodsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomPaymentMethodsResult }
     *     
     */
    public void setGetCustomPaymentMethodsResult(GetCustomPaymentMethodsResult value) {
        this.getCustomPaymentMethodsResult = value;
    }

}
