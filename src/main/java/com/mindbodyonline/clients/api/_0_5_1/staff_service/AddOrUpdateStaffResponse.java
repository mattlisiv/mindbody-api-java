
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
 *         &lt;element name="AddOrUpdateStaffResult" type="{http://clients.mindbodyonline.com/api/0_5_1}AddOrUpdateStaffResult" minOccurs="0"/>
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
    "addOrUpdateStaffResult"
})
@XmlRootElement(name = "AddOrUpdateStaffResponse")
public class AddOrUpdateStaffResponse {

    @XmlElement(name = "AddOrUpdateStaffResult")
    protected AddOrUpdateStaffResult addOrUpdateStaffResult;

    /**
     * Gets the value of the addOrUpdateStaffResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrUpdateStaffResult }
     *     
     */
    public AddOrUpdateStaffResult getAddOrUpdateStaffResult() {
        return addOrUpdateStaffResult;
    }

    /**
     * Sets the value of the addOrUpdateStaffResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrUpdateStaffResult }
     *     
     */
    public void setAddOrUpdateStaffResult(AddOrUpdateStaffResult value) {
        this.addOrUpdateStaffResult = value;
    }

}
