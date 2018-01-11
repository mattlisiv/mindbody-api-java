
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
 *         &lt;element name="GetSitesResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetSitesResult" minOccurs="0"/>
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
    "getSitesResult"
})
@XmlRootElement(name = "GetSitesResponse")
public class GetSitesResponse {

    @XmlElement(name = "GetSitesResult")
    protected GetSitesResult getSitesResult;

    /**
     * Gets the value of the getSitesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetSitesResult }
     *     
     */
    public GetSitesResult getGetSitesResult() {
        return getSitesResult;
    }

    /**
     * Sets the value of the getSitesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSitesResult }
     *     
     */
    public void setGetSitesResult(GetSitesResult value) {
        this.getSitesResult = value;
    }

}
