
package com.mindbodyonline.clients.api._0_5_1.site_service;

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
 *         &lt;element name="GetProgramsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetProgramsResult" minOccurs="0"/>
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
    "getProgramsResult"
})
@XmlRootElement(name = "GetProgramsResponse")
public class GetProgramsResponse {

    @XmlElement(name = "GetProgramsResult")
    protected GetProgramsResult getProgramsResult;

    /**
     * Gets the value of the getProgramsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetProgramsResult }
     *     
     */
    public GetProgramsResult getGetProgramsResult() {
        return getProgramsResult;
    }

    /**
     * Sets the value of the getProgramsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProgramsResult }
     *     
     */
    public void setGetProgramsResult(GetProgramsResult value) {
        this.getProgramsResult = value;
    }

}
