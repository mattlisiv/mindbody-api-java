
package com.mindbodyonline.clients.api._0_5_1.site_service;

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
 *         &lt;element name="GetActivationCodeResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetActivationCodeResult" minOccurs="0"/>
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
    "getActivationCodeResult"
})
@XmlRootElement(name = "GetActivationCodeResponse")
public class GetActivationCodeResponse {

    @XmlElement(name = "GetActivationCodeResult")
    protected GetActivationCodeResult getActivationCodeResult;

    /**
     * Gets the value of the getActivationCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetActivationCodeResult }
     *     
     */
    public GetActivationCodeResult getGetActivationCodeResult() {
        return getActivationCodeResult;
    }

    /**
     * Sets the value of the getActivationCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetActivationCodeResult }
     *     
     */
    public void setGetActivationCodeResult(GetActivationCodeResult value) {
        this.getActivationCodeResult = value;
    }

}
