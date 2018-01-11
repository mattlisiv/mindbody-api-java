
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
 *         &lt;element name="GetClassVisitsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetClassVisitsResult" minOccurs="0"/>
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
    "getClassVisitsResult"
})
@XmlRootElement(name = "GetClassVisitsResponse")
public class GetClassVisitsResponse {

    @XmlElement(name = "GetClassVisitsResult")
    protected GetClassVisitsResult getClassVisitsResult;

    /**
     * Gets the value of the getClassVisitsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetClassVisitsResult }
     *     
     */
    public GetClassVisitsResult getGetClassVisitsResult() {
        return getClassVisitsResult;
    }

    /**
     * Sets the value of the getClassVisitsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClassVisitsResult }
     *     
     */
    public void setGetClassVisitsResult(GetClassVisitsResult value) {
        this.getClassVisitsResult = value;
    }

}
