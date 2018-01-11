
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
 *         &lt;element name="ReturnSaleResult" type="{http://clients.mindbodyonline.com/api/0_5_1}ReturnSaleResult" minOccurs="0"/>
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
    "returnSaleResult"
})
@XmlRootElement(name = "ReturnSaleResponse")
public class ReturnSaleResponse {

    @XmlElement(name = "ReturnSaleResult")
    protected ReturnSaleResult returnSaleResult;

    /**
     * Gets the value of the returnSaleResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnSaleResult }
     *     
     */
    public ReturnSaleResult getReturnSaleResult() {
        return returnSaleResult;
    }

    /**
     * Sets the value of the returnSaleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnSaleResult }
     *     
     */
    public void setReturnSaleResult(ReturnSaleResult value) {
        this.returnSaleResult = value;
    }

}
