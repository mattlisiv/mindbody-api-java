
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
 *         &lt;element name="UpdateSaleDateResult" type="{http://clients.mindbodyonline.com/api/0_5_1}UpdateSaleDateResult" minOccurs="0"/>
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
    "updateSaleDateResult"
})
@XmlRootElement(name = "UpdateSaleDateResponse")
public class UpdateSaleDateResponse {

    @XmlElement(name = "UpdateSaleDateResult")
    protected UpdateSaleDateResult updateSaleDateResult;

    /**
     * Gets the value of the updateSaleDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSaleDateResult }
     *     
     */
    public UpdateSaleDateResult getUpdateSaleDateResult() {
        return updateSaleDateResult;
    }

    /**
     * Sets the value of the updateSaleDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSaleDateResult }
     *     
     */
    public void setUpdateSaleDateResult(UpdateSaleDateResult value) {
        this.updateSaleDateResult = value;
    }

}
