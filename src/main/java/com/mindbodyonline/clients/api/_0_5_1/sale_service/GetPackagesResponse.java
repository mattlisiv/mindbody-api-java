
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
 *         &lt;element name="GetPackagesResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetPackagesResult" minOccurs="0"/>
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
    "getPackagesResult"
})
@XmlRootElement(name = "GetPackagesResponse")
public class GetPackagesResponse {

    @XmlElement(name = "GetPackagesResult")
    protected GetPackagesResult getPackagesResult;

    /**
     * Gets the value of the getPackagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPackagesResult }
     *     
     */
    public GetPackagesResult getGetPackagesResult() {
        return getPackagesResult;
    }

    /**
     * Sets the value of the getPackagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPackagesResult }
     *     
     */
    public void setGetPackagesResult(GetPackagesResult value) {
        this.getPackagesResult = value;
    }

}
