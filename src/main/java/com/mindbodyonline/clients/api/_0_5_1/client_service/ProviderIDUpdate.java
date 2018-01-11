
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProviderIDUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderIDUpdate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OldProviderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewProviderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderIDUpdate", propOrder = {
    "oldProviderID",
    "newProviderID"
})
public class ProviderIDUpdate {

    @XmlElement(name = "OldProviderID")
    protected String oldProviderID;
    @XmlElement(name = "NewProviderID")
    protected String newProviderID;

    /**
     * Gets the value of the oldProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldProviderID() {
        return oldProviderID;
    }

    /**
     * Sets the value of the oldProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldProviderID(String value) {
        this.oldProviderID = value;
    }

    /**
     * Gets the value of the newProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewProviderID() {
        return newProviderID;
    }

    /**
     * Sets the value of the newProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewProviderID(String value) {
        this.newProviderID = value;
    }

}
