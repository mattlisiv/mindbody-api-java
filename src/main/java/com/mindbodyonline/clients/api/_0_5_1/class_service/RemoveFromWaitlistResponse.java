
package com.mindbodyonline.clients.api._0_5_1.class_service;

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
 *         &lt;element name="RemoveFromWaitlistResult" type="{http://clients.mindbodyonline.com/api/0_5_1}RemoveFromWaitlistResult" minOccurs="0"/>
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
    "removeFromWaitlistResult"
})
@XmlRootElement(name = "RemoveFromWaitlistResponse")
public class RemoveFromWaitlistResponse {

    @XmlElement(name = "RemoveFromWaitlistResult")
    protected RemoveFromWaitlistResult removeFromWaitlistResult;

    /**
     * Gets the value of the removeFromWaitlistResult property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveFromWaitlistResult }
     *     
     */
    public RemoveFromWaitlistResult getRemoveFromWaitlistResult() {
        return removeFromWaitlistResult;
    }

    /**
     * Sets the value of the removeFromWaitlistResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveFromWaitlistResult }
     *     
     */
    public void setRemoveFromWaitlistResult(RemoveFromWaitlistResult value) {
        this.removeFromWaitlistResult = value;
    }

}
