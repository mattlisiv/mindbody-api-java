
package com.mindbodyonline.clients.api._0_5_1.sale_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetSalesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSalesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://clients.mindbodyonline.com/api/0_5_1}MBRequest">
 *       &lt;sequence>
 *         &lt;element name="SaleID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StartSaleDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndSaleDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PaymentMethodID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSalesRequest", propOrder = {
    "saleID",
    "startSaleDateTime",
    "endSaleDateTime",
    "paymentMethodID"
})
public class GetSalesRequest
    extends MBRequest
{

    @XmlElement(name = "SaleID", required = true, type = Long.class, nillable = true)
    protected Long saleID;
    @XmlElement(name = "StartSaleDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startSaleDateTime;
    @XmlElement(name = "EndSaleDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endSaleDateTime;
    @XmlElement(name = "PaymentMethodID", required = true, type = Integer.class, nillable = true)
    protected Integer paymentMethodID;

    /**
     * Gets the value of the saleID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleID() {
        return saleID;
    }

    /**
     * Sets the value of the saleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleID(Long value) {
        this.saleID = value;
    }

    /**
     * Gets the value of the startSaleDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartSaleDateTime() {
        return startSaleDateTime;
    }

    /**
     * Sets the value of the startSaleDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartSaleDateTime(XMLGregorianCalendar value) {
        this.startSaleDateTime = value;
    }

    /**
     * Gets the value of the endSaleDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndSaleDateTime() {
        return endSaleDateTime;
    }

    /**
     * Sets the value of the endSaleDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndSaleDateTime(XMLGregorianCalendar value) {
        this.endSaleDateTime = value;
    }

    /**
     * Gets the value of the paymentMethodID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentMethodID() {
        return paymentMethodID;
    }

    /**
     * Sets the value of the paymentMethodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentMethodID(Integer value) {
        this.paymentMethodID = value;
    }

}
