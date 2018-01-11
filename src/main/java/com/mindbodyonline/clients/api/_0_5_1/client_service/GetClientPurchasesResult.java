
package com.mindbodyonline.clients.api._0_5_1.client_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClientPurchasesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientPurchasesResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="Purchases" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfSaleItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientPurchasesResult", propOrder = {
    "purchases"
})
public class GetClientPurchasesResult
    extends MBResult
{

    @XmlElement(name = "Purchases")
    protected ArrayOfSaleItem purchases;

    /**
     * Gets the value of the purchases property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSaleItem }
     *     
     */
    public ArrayOfSaleItem getPurchases() {
        return purchases;
    }

    /**
     * Sets the value of the purchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSaleItem }
     *     
     */
    public void setPurchases(ArrayOfSaleItem value) {
        this.purchases = value;
    }

}
