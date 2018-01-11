
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
 *         &lt;element name="ValidateStaffLoginResult" type="{http://clients.mindbodyonline.com/api/0_5_1}ValidateLoginResult" minOccurs="0"/>
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
    "validateStaffLoginResult"
})
@XmlRootElement(name = "ValidateStaffLoginResponse")
public class ValidateStaffLoginResponse {

    @XmlElement(name = "ValidateStaffLoginResult")
    protected ValidateLoginResult validateStaffLoginResult;

    /**
     * Gets the value of the validateStaffLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateLoginResult }
     *     
     */
    public ValidateLoginResult getValidateStaffLoginResult() {
        return validateStaffLoginResult;
    }

    /**
     * Sets the value of the validateStaffLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateLoginResult }
     *     
     */
    public void setValidateStaffLoginResult(ValidateLoginResult value) {
        this.validateStaffLoginResult = value;
    }

}
