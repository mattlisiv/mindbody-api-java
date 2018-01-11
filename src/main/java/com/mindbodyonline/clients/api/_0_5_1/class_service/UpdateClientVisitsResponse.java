
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
 *         &lt;element name="UpdateClientVisitsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}UpdateClientVisitsResult" minOccurs="0"/>
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
    "updateClientVisitsResult"
})
@XmlRootElement(name = "UpdateClientVisitsResponse")
public class UpdateClientVisitsResponse {

    @XmlElement(name = "UpdateClientVisitsResult")
    protected UpdateClientVisitsResult updateClientVisitsResult;

    /**
     * Gets the value of the updateClientVisitsResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateClientVisitsResult }
     *     
     */
    public UpdateClientVisitsResult getUpdateClientVisitsResult() {
        return updateClientVisitsResult;
    }

    /**
     * Sets the value of the updateClientVisitsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateClientVisitsResult }
     *     
     */
    public void setUpdateClientVisitsResult(UpdateClientVisitsResult value) {
        this.updateClientVisitsResult = value;
    }

}
