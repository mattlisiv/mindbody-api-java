
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
 *         &lt;element name="GetClassDescriptionsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetClassDescriptionsResult" minOccurs="0"/>
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
    "getClassDescriptionsResult"
})
@XmlRootElement(name = "GetClassDescriptionsResponse")
public class GetClassDescriptionsResponse {

    @XmlElement(name = "GetClassDescriptionsResult")
    protected GetClassDescriptionsResult getClassDescriptionsResult;

    /**
     * Gets the value of the getClassDescriptionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetClassDescriptionsResult }
     *     
     */
    public GetClassDescriptionsResult getGetClassDescriptionsResult() {
        return getClassDescriptionsResult;
    }

    /**
     * Sets the value of the getClassDescriptionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClassDescriptionsResult }
     *     
     */
    public void setGetClassDescriptionsResult(GetClassDescriptionsResult value) {
        this.getClassDescriptionsResult = value;
    }

}
