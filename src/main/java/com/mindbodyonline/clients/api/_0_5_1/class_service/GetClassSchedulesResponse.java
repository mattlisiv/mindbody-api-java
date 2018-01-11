
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
 *         &lt;element name="GetClassSchedulesResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetClassSchedulesResult" minOccurs="0"/>
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
    "getClassSchedulesResult"
})
@XmlRootElement(name = "GetClassSchedulesResponse")
public class GetClassSchedulesResponse {

    @XmlElement(name = "GetClassSchedulesResult")
    protected GetClassSchedulesResult getClassSchedulesResult;

    /**
     * Gets the value of the getClassSchedulesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetClassSchedulesResult }
     *     
     */
    public GetClassSchedulesResult getGetClassSchedulesResult() {
        return getClassSchedulesResult;
    }

    /**
     * Sets the value of the getClassSchedulesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClassSchedulesResult }
     *     
     */
    public void setGetClassSchedulesResult(GetClassSchedulesResult value) {
        this.getClassSchedulesResult = value;
    }

}
