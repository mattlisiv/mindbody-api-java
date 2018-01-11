
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSalesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSalesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="Sales" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfSale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSalesResult", propOrder = {
    "sales"
})
public class GetSalesResult
    extends MBResult
{

    @XmlElement(name = "Sales")
    protected ArrayOfSale sales;

    /**
     * Gets the value of the sales property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSale }
     *     
     */
    public ArrayOfSale getSales() {
        return sales;
    }

    /**
     * Sets the value of the sales property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSale }
     *     
     */
    public void setSales(ArrayOfSale value) {
        this.sales = value;
    }

}
