
package com.mindbodyonline.clients.api._0_5_1.client_service;

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
 *         &lt;element name="GetClientReferralTypesResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetClientReferralTypesResult" minOccurs="0"/>
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
    "getClientReferralTypesResult"
})
@XmlRootElement(name = "GetClientReferralTypesResponse")
public class GetClientReferralTypesResponse {

    @XmlElement(name = "GetClientReferralTypesResult")
    protected GetClientReferralTypesResult getClientReferralTypesResult;

    /**
     * Gets the value of the getClientReferralTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetClientReferralTypesResult }
     *     
     */
    public GetClientReferralTypesResult getGetClientReferralTypesResult() {
        return getClientReferralTypesResult;
    }

    /**
     * Sets the value of the getClientReferralTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClientReferralTypesResult }
     *     
     */
    public void setGetClientReferralTypesResult(GetClientReferralTypesResult value) {
        this.getClientReferralTypesResult = value;
    }

}
