
package com.mindbodyonline.clients.api._0_5_1.sale_service;

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
 *         &lt;element name="UpdateProductsResult" type="{http://clients.mindbodyonline.com/api/0_5_1}UpdateProductsResult" minOccurs="0"/>
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
    "updateProductsResult"
})
@XmlRootElement(name = "UpdateProductsResponse")
public class UpdateProductsResponse {

    @XmlElement(name = "UpdateProductsResult")
    protected UpdateProductsResult updateProductsResult;

    /**
     * Gets the value of the updateProductsResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateProductsResult }
     *     
     */
    public UpdateProductsResult getUpdateProductsResult() {
        return updateProductsResult;
    }

    /**
     * Sets the value of the updateProductsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateProductsResult }
     *     
     */
    public void setUpdateProductsResult(UpdateProductsResult value) {
        this.updateProductsResult = value;
    }

}
