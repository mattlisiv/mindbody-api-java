
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
 *         &lt;element name="GetStaffPermissionsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetStaffPermissionsResult" minOccurs="0"/>
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
    "getStaffPermissionsResult"
})
@XmlRootElement(name = "GetStaffPermissionsResponse")
public class GetStaffPermissionsResponse {

    @XmlElement(name = "GetStaffPermissionsResult")
    protected GetStaffPermissionsResult getStaffPermissionsResult;

    /**
     * Gets the value of the getStaffPermissionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetStaffPermissionsResult }
     *     
     */
    public GetStaffPermissionsResult getGetStaffPermissionsResult() {
        return getStaffPermissionsResult;
    }

    /**
     * Sets the value of the getStaffPermissionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStaffPermissionsResult }
     *     
     */
    public void setGetStaffPermissionsResult(GetStaffPermissionsResult value) {
        this.getStaffPermissionsResult = value;
    }

}
