
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
 *         &lt;element name="GetRelationshipsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetRelationshipsResult" minOccurs="0"/>
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
    "getRelationshipsResult"
})
@XmlRootElement(name = "GetRelationshipsResponse")
public class GetRelationshipsResponse {

    @XmlElement(name = "GetRelationshipsResult")
    protected GetRelationshipsResult getRelationshipsResult;

    /**
     * Gets the value of the getRelationshipsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetRelationshipsResult }
     *     
     */
    public GetRelationshipsResult getGetRelationshipsResult() {
        return getRelationshipsResult;
    }

    /**
     * Sets the value of the getRelationshipsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRelationshipsResult }
     *     
     */
    public void setGetRelationshipsResult(GetRelationshipsResult value) {
        this.getRelationshipsResult = value;
    }

}
