
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
 *         &lt;element name="CancelSingleClassResult" type="{http://clients.mindbodyonline.com/api/0_5_1}CancelSingleClassResult" minOccurs="0"/>
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
    "cancelSingleClassResult"
})
@XmlRootElement(name = "CancelSingleClassResponse")
public class CancelSingleClassResponse {

    @XmlElement(name = "CancelSingleClassResult")
    protected CancelSingleClassResult cancelSingleClassResult;

    /**
     * Gets the value of the cancelSingleClassResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancelSingleClassResult }
     *     
     */
    public CancelSingleClassResult getCancelSingleClassResult() {
        return cancelSingleClassResult;
    }

    /**
     * Sets the value of the cancelSingleClassResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelSingleClassResult }
     *     
     */
    public void setCancelSingleClassResult(CancelSingleClassResult value) {
        this.cancelSingleClassResult = value;
    }

}
