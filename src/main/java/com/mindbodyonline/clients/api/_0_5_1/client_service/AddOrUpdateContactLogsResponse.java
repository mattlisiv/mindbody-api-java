
package com.mindbodyonline.clients.api._0_5_1.client_service;

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
 *         &lt;element name="AddOrUpdateContactLogsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}AddOrUpdateContactLogsResult" minOccurs="0"/>
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
    "addOrUpdateContactLogsResult"
})
@XmlRootElement(name = "AddOrUpdateContactLogsResponse")
public class AddOrUpdateContactLogsResponse {

    @XmlElement(name = "AddOrUpdateContactLogsResult")
    protected AddOrUpdateContactLogsResult addOrUpdateContactLogsResult;

    /**
     * Gets the value of the addOrUpdateContactLogsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrUpdateContactLogsResult }
     *     
     */
    public AddOrUpdateContactLogsResult getAddOrUpdateContactLogsResult() {
        return addOrUpdateContactLogsResult;
    }

    /**
     * Sets the value of the addOrUpdateContactLogsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrUpdateContactLogsResult }
     *     
     */
    public void setAddOrUpdateContactLogsResult(AddOrUpdateContactLogsResult value) {
        this.addOrUpdateContactLogsResult = value;
    }

}
