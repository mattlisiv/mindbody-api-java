
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomPaymentMethodsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomPaymentMethodsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBResult">
 *       &lt;sequence>
 *         &lt;element name="PaymentMethods" type="{http://clients.mindbodyonline.com/api/0_5_1}ArrayOfCustomPaymentInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomPaymentMethodsResult", propOrder = {
    "paymentMethods"
})
public class GetCustomPaymentMethodsResult
    extends MBResult
{

    @XmlElement(name = "PaymentMethods")
    protected ArrayOfCustomPaymentInfo paymentMethods;

    /**
     * Gets the value of the paymentMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomPaymentInfo }
     *     
     */
    public ArrayOfCustomPaymentInfo getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Sets the value of the paymentMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomPaymentInfo }
     *     
     */
    public void setPaymentMethods(ArrayOfCustomPaymentInfo value) {
        this.paymentMethods = value;
    }

}
