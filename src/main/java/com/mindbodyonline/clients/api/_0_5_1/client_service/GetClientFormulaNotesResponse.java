
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
 *         &lt;element name="GetClientFormulaNotesResult" type="{http://clients.mindbodyonline.com/api/0_5_1}GetClientFormulaNotesResult" minOccurs="0"/>
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
    "getClientFormulaNotesResult"
})
@XmlRootElement(name = "GetClientFormulaNotesResponse")
public class GetClientFormulaNotesResponse {

    @XmlElement(name = "GetClientFormulaNotesResult")
    protected GetClientFormulaNotesResult getClientFormulaNotesResult;

    /**
     * Gets the value of the getClientFormulaNotesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetClientFormulaNotesResult }
     *     
     */
    public GetClientFormulaNotesResult getGetClientFormulaNotesResult() {
        return getClientFormulaNotesResult;
    }

    /**
     * Sets the value of the getClientFormulaNotesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClientFormulaNotesResult }
     *     
     */
    public void setGetClientFormulaNotesResult(GetClientFormulaNotesResult value) {
        this.getClientFormulaNotesResult = value;
    }

}
