
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSaleDateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSaleDateResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="Sale" type="{http://clients.mindbodyonline.com/api/0_5_1}Sale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSaleDateResult", propOrder = {
    "sale"
})
public class UpdateSaleDateResult
    extends MBResult
{

    @XmlElement(name = "Sale")
    protected Sale sale;

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link Sale }
     *     
     */
    public Sale getSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sale }
     *     
     */
    public void setSale(Sale value) {
        this.sale = value;
    }

}
